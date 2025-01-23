package net.kylo_m.zeldamod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MaliceBlock extends Block {

    public MaliceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if(entity instanceof LivingEntity livingEntity){
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 3));
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 100));
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 2));
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
