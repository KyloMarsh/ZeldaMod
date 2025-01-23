package net.kylo_m.zeldamod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpectralArrowItem;
import net.minecraft.world.World;

public class BrightbloomArrow extends SpectralArrowItem {
    public BrightbloomArrow(Item.Settings settings) {
        super(settings);
    }
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new SpectralArrowEntity(world, shooter);
    }

}
