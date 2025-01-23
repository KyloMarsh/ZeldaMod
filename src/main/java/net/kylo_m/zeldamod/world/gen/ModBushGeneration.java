package net.kylo_m.zeldamod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.kylo_m.zeldamod.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModBushGeneration {

    public static void generateBushes(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.DRIPSTONE_CAVES,
                BiomeKeys.LUSH_CAVES,
                BiomeKeys.BIRCH_FOREST,
                BiomeKeys.MEADOW,
                BiomeKeys.SAVANNA,
                BiomeKeys.SWAMP,
                BiomeKeys.BADLANDS,
                BiomeKeys.FLOWER_FOREST,
                BiomeKeys.FOREST,
                BiomeKeys.BAMBOO_JUNGLE,
                BiomeKeys.BEACH,
                BiomeKeys.CHERRY_GROVE,
                BiomeKeys.COLD_OCEAN,
                BiomeKeys.DARK_FOREST,
                BiomeKeys.DEEP_DARK,
                BiomeKeys.DEEP_FROZEN_OCEAN,
                BiomeKeys.DEEP_LUKEWARM_OCEAN,
                BiomeKeys.DEEP_OCEAN,
                BiomeKeys.DEEP_OCEAN,
                BiomeKeys.JUNGLE,
                BiomeKeys.DESERT,
                BiomeKeys.RIVER,
                BiomeKeys.GROVE,
                BiomeKeys.OLD_GROWTH_BIRCH_FOREST,
                BiomeKeys.OLD_GROWTH_PINE_TAIGA,
                BiomeKeys.SNOWY_TAIGA,
                BiomeKeys.SNOWY_PLAINS,
                BiomeKeys.PLAINS),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BRIGHTBLOOM_BUSH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.DRIPSTONE_CAVES,
                        BiomeKeys.LUSH_CAVES,
                        BiomeKeys.BIRCH_FOREST,
                        BiomeKeys.MEADOW,
                        BiomeKeys.SAVANNA,
                        BiomeKeys.SWAMP,
                        BiomeKeys.BADLANDS,
                        BiomeKeys.FLOWER_FOREST,
                        BiomeKeys.FOREST,
                        BiomeKeys.BAMBOO_JUNGLE,
                        BiomeKeys.BEACH,
                        BiomeKeys.CHERRY_GROVE,
                        BiomeKeys.COLD_OCEAN,
                        BiomeKeys.DARK_FOREST,
                        BiomeKeys.DEEP_DARK,
                        BiomeKeys.DEEP_FROZEN_OCEAN,
                        BiomeKeys.DEEP_LUKEWARM_OCEAN,
                        BiomeKeys.DEEP_OCEAN,
                        BiomeKeys.DEEP_OCEAN,
                        BiomeKeys.JUNGLE,
                        BiomeKeys.DESERT,
                        BiomeKeys.RIVER,
                        BiomeKeys.GROVE,
                        BiomeKeys.OLD_GROWTH_BIRCH_FOREST,
                        BiomeKeys.OLD_GROWTH_PINE_TAIGA,
                        BiomeKeys.SNOWY_TAIGA,
                        BiomeKeys.SNOWY_PLAINS,
                        BiomeKeys.PLAINS),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MUDDLEBUD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.DRIPSTONE_CAVES,
                        BiomeKeys.LUSH_CAVES,
                        BiomeKeys.BIRCH_FOREST,
                        BiomeKeys.MEADOW,
                        BiomeKeys.SAVANNA,
                        BiomeKeys.SWAMP,
                        BiomeKeys.BADLANDS,
                        BiomeKeys.FLOWER_FOREST,
                        BiomeKeys.FOREST,
                        BiomeKeys.BAMBOO_JUNGLE,
                        BiomeKeys.BEACH,
                        BiomeKeys.CHERRY_GROVE,
                        BiomeKeys.COLD_OCEAN,
                        BiomeKeys.DARK_FOREST,
                        BiomeKeys.DEEP_DARK,
                        BiomeKeys.DEEP_FROZEN_OCEAN,
                        BiomeKeys.DEEP_LUKEWARM_OCEAN,
                        BiomeKeys.DEEP_OCEAN,
                        BiomeKeys.DEEP_OCEAN,
                        BiomeKeys.JUNGLE,
                        BiomeKeys.DESERT,
                        BiomeKeys.RIVER,
                        BiomeKeys.GROVE,
                        BiomeKeys.OLD_GROWTH_BIRCH_FOREST,
                        BiomeKeys.OLD_GROWTH_PINE_TAIGA,
                        BiomeKeys.SNOWY_TAIGA,
                        BiomeKeys.SNOWY_PLAINS,
                        BiomeKeys.PLAINS),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BRIGHTCAP_SHROOM_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.DRIPSTONE_CAVES,
                        BiomeKeys.LUSH_CAVES,
                        BiomeKeys.BIRCH_FOREST,
                        BiomeKeys.MEADOW,
                        BiomeKeys.SAVANNA,
                        BiomeKeys.SWAMP,
                        BiomeKeys.BADLANDS,
                        BiomeKeys.FLOWER_FOREST,
                        BiomeKeys.FOREST,
                        BiomeKeys.BAMBOO_JUNGLE,
                        BiomeKeys.BEACH,
                        BiomeKeys.CHERRY_GROVE,
                        BiomeKeys.COLD_OCEAN,
                        BiomeKeys.DARK_FOREST,
                        BiomeKeys.DEEP_DARK,
                        BiomeKeys.DEEP_FROZEN_OCEAN,
                        BiomeKeys.DEEP_LUKEWARM_OCEAN,
                        BiomeKeys.DEEP_OCEAN,
                        BiomeKeys.DEEP_OCEAN,
                        BiomeKeys.JUNGLE,
                        BiomeKeys.DESERT,
                        BiomeKeys.RIVER,
                        BiomeKeys.GROVE,
                        BiomeKeys.OLD_GROWTH_BIRCH_FOREST,
                        BiomeKeys.OLD_GROWTH_PINE_TAIGA,
                        BiomeKeys.SNOWY_TAIGA,
                        BiomeKeys.SNOWY_PLAINS,
                        BiomeKeys.PLAINS),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PUFFSHROOM_PLACED_KEY);
    }

}
