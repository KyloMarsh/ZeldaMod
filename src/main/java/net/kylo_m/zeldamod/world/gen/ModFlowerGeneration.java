package net.kylo_m.zeldamod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.kylo_m.zeldamod.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {

    public static void generateFlowers(){

        //Sundelion
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.PLAINS,
                                BiomeKeys.FLOWER_FOREST,
                                BiomeKeys.MEADOW,
                                BiomeKeys.BIRCH_FOREST,
                                BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SUNDELION_PLACED_KEY);

        //Silent Princess
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.PLAINS,
                                BiomeKeys.FLOWER_FOREST,
                                BiomeKeys.MEADOW,
                                BiomeKeys.BIRCH_FOREST,
                                BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SILENT_PRINCESS_PLACED_KEY);

        //Stamella Shroom
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.PLAINS,
                                BiomeKeys.FLOWER_FOREST,
                                BiomeKeys.MEADOW,
                                BiomeKeys.BIRCH_FOREST,
                                BiomeKeys.SWAMP,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.STAMELLA_SHROOM_PLACED_KEY);

        //RUSHROOM
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.STONY_SHORE,
                                BiomeKeys.JAGGED_PEAKS,
                                BiomeKeys.WINDSWEPT_GRAVELLY_HILLS,
                                BiomeKeys.FOREST,
                                BiomeKeys.BADLANDS,
                                BiomeKeys.WOODED_BADLANDS,
                                BiomeKeys.DRIPSTONE_CAVES,
                                BiomeKeys.DESERT,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RUSHROOM_PLACED_KEY);

        //TRUFFLE
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.DARK_FOREST,
                                BiomeKeys.TAIGA,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TRUFFLE_PLACED_KEY);

        //CHILLSHROOM
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.SNOWY_PLAINS,
                                BiomeKeys.SNOWY_TAIGA,
                                BiomeKeys.ICE_SPIKES,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHILLSHROOM_PLACED_KEY);

        //SUNSHROOM
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.FOREST,
                                BiomeKeys.SAVANNA,
                                BiomeKeys.SAVANNA_PLATEAU,
                                BiomeKeys.WINDSWEPT_SAVANNA,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SUNSHROOM_PLACED_KEY);

        //ZAPSHROOM
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.DESERT,
                                BiomeKeys.BADLANDS,
                                BiomeKeys.WOODED_BADLANDS,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ZAPSHROOM_PLACED_KEY);

        //RAZORSHROOM
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.SAVANNA,
                                BiomeKeys.SAVANNA_PLATEAU,
                                BiomeKeys.WINDSWEPT_SAVANNA,
                                BiomeKeys.JUNGLE,
                                BiomeKeys.SPARSE_JUNGLE,
                                BiomeKeys.BAMBOO_JUNGLE,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RAZORSHROOM_PLACED_KEY);

        //IRONSHROOM
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.SWAMP,
                                BiomeKeys.MANGROVE_SWAMP,
                                BiomeKeys.STONY_SHORE,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.IRONSHROOM_PLACED_KEY);

        //SILENTSHROOM
        BiomeModifications.addFeature(BiomeSelectors
                        .includeByKey(
                                BiomeKeys.FOREST,
                                BiomeKeys.DARK_FOREST,
                                BiomeKeys.GROVE,
                                BiomeKeys.CHERRY_GROVE,
                                BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SILENT_SHROOM_PLACED_KEY);
    }

}
