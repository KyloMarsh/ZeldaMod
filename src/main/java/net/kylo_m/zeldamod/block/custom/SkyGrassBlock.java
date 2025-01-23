package net.kylo_m.zeldamod.block.custom;

import net.kylo_m.zeldamod.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class SkyGrassBlock extends PlantBlock {
    public SkyGrassBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.DIRT) || floor.isOf(ModBlocks.SKY_GRASS_BLOCK);
    }

}
