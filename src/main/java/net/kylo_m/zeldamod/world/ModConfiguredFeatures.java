package net.kylo_m.zeldamod.world;

import com.google.common.collect.ImmutableList;
import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SKY_OAK_KEY = registerKey("sky_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNDELION_KEY = registerKey("sundelion_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILENT_PRINCESS_KEY = registerKey("silent_princess_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUDDLEBUD_KEY = registerKey("muddlebud_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMBER_ORE_KEY = registerKey("amber_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OPAL_ORE_KEY = registerKey("opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZONAITE_ORE_KEY = registerKey("zonaite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BRIGHTBLOOM_BUSH_KEY = registerKey("brightbloom_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STAMELLA_SHROOM_KEY = registerKey("stamella_shroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUSHROOM_KEY = registerKey("rushroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TRUFFLE_KEY = registerKey("truffle_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHILLSHROOM_KEY = registerKey("chillshroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNSHROOM_KEY = registerKey("sunshroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZAPSHROOM_KEY = registerKey("zapshroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RAZORSHROOM_KEY = registerKey("razorshroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRONSHROOM_KEY = registerKey("ironshroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILENT_SHROOM_KEY = registerKey("silent_shroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BRIGHTCAP_SHROOM_KEY = registerKey("brightcap_shroom_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PUFFSHROOM_KEY = registerKey("puffshroom_key");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        //ORES-----------------------------------------------------------------------------------//

        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        //Silver Ore
        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 10 //Vein Size
        ));

        //Tungsten Ore
        List<OreFeatureConfig.Target> overworldTungstenOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TUNGSTEN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.getDefaultState()));

        register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTungstenOres, 8 //Vein Size
        ));

        //Amber Ore
        List<OreFeatureConfig.Target> overworldAmberOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.AMBER_ORE.getDefaultState()));

        register(context, AMBER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAmberOres, 6 //Vein Size
        ));

        //Opal Ore
        List<OreFeatureConfig.Target> overworldOpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.OPAL_ORE.getDefaultState()));

        register(context, OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOpalOres, 6 //Vein Size
        ));

        //Ruby Ore
        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.RUBY_ORE.getDefaultState()));

        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 6 //Vein Size
        ));

        //Sapphire Ore
        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.SAPPHIRE_ORE.getDefaultState()));

        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 6 //Vein Size
        ));

        //Topaz Ore
        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TOPAZ_ORE.getDefaultState()));

        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 6 //Vein Size
        ));

        //Zonaite Ore
        List<OreFeatureConfig.Target> overworldZonaiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ZONAITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_ZONAITE_ORE.getDefaultState()));

        register(context, ZONAITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldZonaiteOres, 7 //Vein Size
        ));


        //TREES-----------------------------------------------------------------------------------//

        //Sky Oak
        register(context, SKY_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(ModBlocks.SKY_OAK_LOG),
            new StraightTrunkPlacer(4, 2, 0),
            BlockStateProvider.of(ModBlocks.SKY_OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 2))
                .decorators(ImmutableList.of(new BeehiveTreeDecorator(0.05F)))
                .build());

        //FAUNA --------------------------------------------------------------------------------------//

        //Sundelion
        register(context, SUNDELION_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SUNDELION)))));

        //Silent Princess
        register(context, SILENT_PRINCESS_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SILENT_PRINCESS)))));

        //Muddlebud
        register(context, MUDDLEBUD_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(10, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MUDDLEBUD)))));

        //Brightbloom Bush
        register(context, BRIGHTBLOOM_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(16, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BRIGHTBLOOM_BUSH)))));

        //SHROOMS --------------------------------------------------------------------------------------//

        //Stamella Shroom
        register(context, STAMELLA_SHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.STAMELLA_SHROOM_BLOCK)))));
        //Rushroom
        register(context, RUSHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RUSHROOM_BLOCK)))));
        //Truffle
        register(context, TRUFFLE_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TRUFFLE_BLOCK)))));
        //Chillshroom
        register(context, CHILLSHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CHILLSHROOM_BLOCK)))));
        //Sunshroom
        register(context, SUNSHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SUNSHROOM_BLOCK)))));
        //Zapshroom
        register(context, ZAPSHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ZAPSHROOM_BLOCK)))));
        //Razorshroom
        register(context, RAZORSHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RAZORSHROOM_BLOCK)))));
        //Ironshroom
        register(context, IRONSHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.IRONSHROOM_BLOCK)))));
        //Silent Shroom
        register(context, SILENT_SHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(8, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SILENT_SHROOM_BLOCK)))));
        //Brightcap Shroom
        register(context, BRIGHTCAP_SHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(10, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BRIGHTCAP_SHROOM_BLOCK)))));
        //Puffshroom
        register(context, PUFFSHROOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(10, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PUFFSHROOM_BLOCK)))));


    }




    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(ZeldaMod.MOD_ID, name));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
