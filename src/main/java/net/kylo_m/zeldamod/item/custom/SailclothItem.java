package net.kylo_m.zeldamod.item.custom;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.ZeldaModDataGenerator;
import net.kylo_m.zeldamod.item.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SailclothItem extends Item {

    public SailclothItem(Settings settings) {super(settings);}


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        tooltip.add(Text.literal("Slowly fall to safety by using in hand!").formatted(Formatting.AQUA));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if(!world.isClient() && hand == Hand.MAIN_HAND || hand == Hand.OFF_HAND){

                //Output Here...
                //user.playSound(SoundEvent.of(ZeldaMod.SAILCLOTH_SOUND), SoundCategory.MASTER, 8f, 1f);
                if(!user.isOnGround()){
                    user.playSound(SoundEvent.of(ZeldaMod.SAILCLOTH_SOUND), SoundCategory.MASTER, 8f, 1f);
                    user.addStatusEffect((new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100, 0, false, false, false)));
                    user.getItemCooldownManager().set(this, 100);
                }

        }
        return super.use(world, user, hand);
    }

}
