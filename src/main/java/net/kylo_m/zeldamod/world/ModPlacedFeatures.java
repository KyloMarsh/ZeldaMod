package net.kylo_m.zeldamod.world;

import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;
import java.util.function.Predicate;

public class ModPlacedFeatures {

    //ORES KEY REGISTRY-----------------------------------------------------------------------------------------//

    //Silver Ore
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed_key");
    public static final RegistryKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed_key");
    public static final RegistryKey<PlacedFeature> AMBER_ORE_PLACED_KEY = registerKey("amber_ore_placed_key");
    public static final RegistryKey<PlacedFeature> OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed_key");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed_key");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed_key");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed_key");
    public static final RegistryKey<PlacedFeature> ZONAITE_ORE_PLACED_KEY = registerKey("zonaite_ore_placed_key");



    //TREES KEY REGISTRY-----------------------------------------------------------------------------------------//

    //Sky Tree
    public static final RegistryKey<PlacedFeature> SKY_OAK_PLACED_KEY = registerKey("sky_oak_placed");

    //FAUNA KEY REGISTRY-----------------------------------------------------------------------------------------//

    //Sundelion
    public static final RegistryKey<PlacedFeature> SUNDELION_PLACED_KEY = registerKey("sundelion_placed");

    //Silent Princess
    public static final RegistryKey<PlacedFeature> SILENT_PRINCESS_PLACED_KEY = registerKey("silent_princess_placed");

    //Muddlebud
    public static final RegistryKey<PlacedFeature> MUDDLEBUD_PLACED_KEY = registerKey("muddlebud_placed");

    //Brightbloom Bush
    public static final RegistryKey<PlacedFeature> BRIGHTBLOOM_BUSH_PLACED_KEY = registerKey("brightbloom_bush_placed");



    //FAUNA KEY REGISTRY-----------------------------------------------------------------------------------------//

    //Stamella Shroom
    public static final RegistryKey<PlacedFeature> STAMELLA_SHROOM_PLACED_KEY = registerKey("stamella_shroom_placed");

    //Rushroom
    public static final RegistryKey<PlacedFeature> RUSHROOM_PLACED_KEY = registerKey("rushroom_placed");

    //Truffle
    public static final RegistryKey<PlacedFeature> TRUFFLE_PLACED_KEY = registerKey("truffle_placed");

    //Chillshroom
    public static final RegistryKey<PlacedFeature> CHILLSHROOM_PLACED_KEY = registerKey("chillshroom_placed");

    //Sunshroom
    public static final RegistryKey<PlacedFeature> SUNSHROOM_PLACED_KEY = registerKey("sunshroom_placed");

    //Zapshroom
    public static final RegistryKey<PlacedFeature> ZAPSHROOM_PLACED_KEY = registerKey("zapshroom_placed");

    //Razorshroom
    public static final RegistryKey<PlacedFeature> RAZORSHROOM_PLACED_KEY = registerKey("razorshroom_placed");

    //Ironshroom
    public static final RegistryKey<PlacedFeature> IRONSHROOM_PLACED_KEY = registerKey("ironshroom_placed");

    //Silent Shroom
    public static final RegistryKey<PlacedFeature> SILENT_SHROOM_PLACED_KEY = registerKey("silent_shroom_placed");

    //Brightcap Shroom
    public static final RegistryKey<PlacedFeature> BRIGHTCAP_SHROOM_PLACED_KEY = registerKey("brightcap_shroom_placed");

    //Puffshroom
    public static final RegistryKey<PlacedFeature> PUFFSHROOM_PLACED_KEY = registerKey("puffshroom_placed");



    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        //ORE BOOTSTRAP REGISTRY--------------------------------------------------------------------------------------//

        //Silver Ore
        register(context, SILVER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        8, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(50))));

        //Tungsten Ore
        register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        6, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(16))));

        //Amber Ore
        register(context, AMBER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AMBER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        10, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(60))));

        //Opal Ore
        register(context, OPAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        10, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(40))));

        //Ruby Ore
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        8, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(24))));

        //Sapphire Ore
        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        8, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(24))));

        //Topaz Ore
        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        8, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(24))));

        //Zonaite Ore
        register(context, ZONAITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZONAITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(
                        7, //Veins Per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(16))));



        //TREE BOOTSTRAP REGISTRY--------------------------------------------------------------------------------------//

        register(context, SKY_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SKY_OAK_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures
                        .createCountExtraModifier(1, 0.1F, 2), ModBlocks.SKY_OAK_SAPLING));

        //FAUNA BOOTSTRAP REGISTRY--------------------------------------------------------------------------------------//

        //Sundelion
        register(context, SUNDELION_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SUNDELION_KEY),
                RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Silent Princess
        register(context, SILENT_PRINCESS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILENT_PRINCESS_KEY),
                RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Muddlebud
        register(context, MUDDLEBUD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MUDDLEBUD_KEY),
                CountPlacementModifier.of(5),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.fixed(256)),
                EnvironmentScanPlacementModifier.of(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.matchingBlocks(Blocks.AIR),12),
                RandomOffsetPlacementModifier.of(ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                BiomePlacementModifier.of());

        //Brightbloom Bush
        register(context, BRIGHTBLOOM_BUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BRIGHTBLOOM_BUSH_KEY),
                CountPlacementModifier.of(8),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.fixed(256)),
                EnvironmentScanPlacementModifier.of(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.matchingBlocks(Blocks.AIR),12),
                RandomOffsetPlacementModifier.of(ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                BiomePlacementModifier.of());



        //FAUNA BOOTSTRAP REGISTRY--------------------------------------------------------------------------------------//

        //Stamella Shroom
        register(context, STAMELLA_SHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STAMELLA_SHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Rushroom
        register(context, RUSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUSHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Truffle
        register(context, TRUFFLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TRUFFLE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Chillshroom
        register(context, CHILLSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHILLSHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Sunshroom
        register(context, SUNSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SUNSHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Zapshroom
        register(context, ZAPSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZAPSHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Razorshroom
        register(context, RAZORSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RAZORSHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Ironshroom
        register(context, IRONSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.IRONSHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Silentshroom
        register(context, SILENT_SHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILENT_SHROOM_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        //Brightcap Shroom
        register(context, BRIGHTCAP_SHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BRIGHTCAP_SHROOM_KEY),
                CountPlacementModifier.of(5),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.fixed(256)),
                EnvironmentScanPlacementModifier.of(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.matchingBlocks(Blocks.AIR),12),
                RandomOffsetPlacementModifier.of(ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                BiomePlacementModifier.of());

        //Puffshroom
        register(context, PUFFSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PUFFSHROOM_KEY),
                CountPlacementModifier.of(5),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.fixed(256)),
                EnvironmentScanPlacementModifier.of(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.matchingBlocks(Blocks.AIR),12),
                RandomOffsetPlacementModifier.of(ConstantIntProvider.create(0), ConstantIntProvider.create(1)),
                BiomePlacementModifier.of());

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(ZeldaMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
