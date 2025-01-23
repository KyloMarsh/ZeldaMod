package net.kylo_m.zeldamod.item.custom;

import net.kylo_m.zeldamod.ZeldaMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LoftwingWhistleItem extends Item {

    public LoftwingWhistleItem(Settings settings) {super(settings);}

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        tooltip.add(Text.literal("Right click in main-hand to sound the instrument!").formatted(Formatting.AQUA));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND){
            //Output Here...

            //Play Sound...
            user.playSound(SoundEvent.of(ZeldaMod.CALL_LOFTWING), SoundCategory.MASTER, 8f, 1f);

            //Message..
            outputConfirmationMessage(user);

            //Cooldown
            user.getItemCooldownManager().set(this, 100);

        }
        return super.use(world, user, hand);
    }

    public void outputConfirmationMessage(PlayerEntity player) {
        player.sendMessage(Text.literal("Your whistle calls..."));
    }
}
