package net.kylo_m.zeldamod.world.biome.surface;

import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {

    public static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    public static final MaterialRules.MaterialRule MALICE_BLOCK = makeStateRule(ModBlocks.MALICE_BLOCK);
    public static final MaterialRules.MaterialRule STONE = makeStateRule(Blocks.STONE);
    public static final MaterialRules.MaterialRule GRANITE = makeStateRule(Blocks.GRANITE);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, MALICE_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.MALICE_BIOME),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, STONE)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, GRANITE)),

                //Default to grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    public static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }


}
