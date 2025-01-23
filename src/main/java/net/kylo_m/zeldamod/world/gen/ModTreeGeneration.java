package net.kylo_m.zeldamod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.kylo_m.zeldamod.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees(){

        //Sky Oak
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.PLAINS,
                BiomeKeys.BIRCH_FOREST,
                BiomeKeys.FOREST,
                BiomeKeys.FLOWER_FOREST,
                BiomeKeys.MEADOW,
                BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SKY_OAK_PLACED_KEY);


    }
}
