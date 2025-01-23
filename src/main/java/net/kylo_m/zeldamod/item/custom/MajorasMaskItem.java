package net.kylo_m.zeldamod.item.custom;

import net.kylo_m.zeldamod.ZeldaMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.StructureTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MajorasMaskItem extends Item {
    public MajorasMaskItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        tooltip.add(Text.literal("Right click in main-hand to summon the masks power!").formatted(Formatting.RED));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            //Output Here...
            user.addStatusEffect((new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 10, false, false, false)));
            user.addStatusEffect((new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 150, 10, false, false, false)));
            user.addStatusEffect((new StatusEffectInstance(StatusEffects.UNLUCK, 200, 5, false, false, false)));
            user.addStatusEffect((new StatusEffectInstance(StatusEffects.NAUSEA, 200, 2, false, false, false)));
            user.addStatusEffect((new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 5, false, false, false)));


            //Play Sound...
            user.playSound(SoundEvent.of(ZeldaMod.MAJORAS_LAUGH), SoundCategory.MASTER, 8f, 1f);

            //Message..
            outputConfirmationMessage(user);
            outputValuableCoordinates(user, world);

            //Cooldown
            user.getItemCooldownManager().set(this, 150);

        }
        return super.use(world, user, hand);
    }

    public void outputValuableCoordinates(PlayerEntity user, World world) {

        ServerWorld serverWorld = (ServerWorld) world;
        BlockPos blockPos = serverWorld.locateStructure(StructureTags.RUINED_PORTAL, user.getBlockPos(), 5000, true);

        user.sendMessage(Text.literal("Forces of Darkness found at (" + blockPos.getX() + ", " + "~" + ", " + blockPos.getZ() + ")"), false);
    }


    public void outputConfirmationMessage(PlayerEntity user) {
        user.sendMessage(Text.literal("An eerie presence looms over you..."));
    }
}
