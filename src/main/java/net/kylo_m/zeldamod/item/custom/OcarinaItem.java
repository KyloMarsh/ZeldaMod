package net.kylo_m.zeldamod.item.custom;

import net.kylo_m.zeldamod.ZeldaMod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.minecraft.sound.SoundEvents.*;

public class OcarinaItem extends Item {
    public OcarinaItem(Settings settings) {
        super(settings);
    }

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
            user.playSound(SoundEvent.of(ZeldaMod.SONG_OF_TIME), SoundCategory.MASTER, 5f, 1f);

            //Adjusting Time...
            if(world.isDay()){
                ServerWorld serverWorld = (ServerWorld) world;
                serverWorld.setTimeOfDay(13000L);
                outputConfirmationMessage(user);
            } else if (world.isNight()) {
                ServerWorld serverWorld = (ServerWorld) world;
                serverWorld.setTimeOfDay(1000L);
                outputConfirmationMessage2(user);
            }

            //Cooldown
            user.getItemCooldownManager().set(this, 280);

        }
        return super.use(world, user, hand);
    }

    public void outputConfirmationMessage(PlayerEntity player) {
        player.sendMessage(Text.literal("The day turns to night with your song of time..."));
    }
    public void outputConfirmationMessage2(PlayerEntity player) {
        player.sendMessage(Text.literal("The night turns to day with your song of time.."));
    }
}
