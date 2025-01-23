package net.kylo_m.zeldamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kylo_m.zeldamod.ZeldaMod;
//import net.kylo_m.zeldamod.block.custom.BrightbloomBush;
import net.kylo_m.zeldamod.block.custom.*;
import net.kylo_m.zeldamod.item.ModItems;
import net.kylo_m.zeldamod.particle.ModParticleTypes;
import net.kylo_m.zeldamod.world.tree.SkyOakSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //RESOURCE BLOCKS-----------------------------------------------------------------------//

    //Silver Ore
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)
                    .requiresTool()));

    //Deepslate Silver Ore
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)
                    .requiresTool()));

    //Silver Block
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)
                    .requiresTool()));

    //Tungsten Ore
    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)
                    .requiresTool()));

    //Deepslate Tungsten Ore
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)
                    .requiresTool()));

    //Tungsten Block
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)
                    .requiresTool()));

    //Zonaite Ore
    public static final Block ZONAITE_ORE = registerBlock("zonaite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)
                    .requiresTool()));

    //Deepslate Zonaite Ore
    public static final Block DEEPSLATE_ZONAITE_ORE = registerBlock("deepslate_zonaite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresTool()));

    //GEMSTONE BLOCKS-----------------------------------------------------------------------//

    //Amber Ore
    public static final Block AMBER_ORE = registerBlock("amber_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
                    .requiresTool()));

    //Amber Block
    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()));

    //Opal Ore
    public static final Block OPAL_ORE = registerBlock("opal_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
                    .requiresTool()));

    //Opal Block
    public static final Block OPAL_BLOCK = registerBlock("opal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()));

    //Ruby Ore
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
                    .requiresTool()));

    //Ruby block
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()));

    //Sapphire Ore
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
                    .requiresTool()));

    //Sapphire Block
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()));

    //Topaz Ore
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)
                    .requiresTool()));

    //Topaz Block
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()));

    //Luminous Stone Block
    public static final Block LUMINOUS_STONE_BLOCK = registerBlock("luminous_stone_block",
            new LuminousStoneBlock(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)
                    .requiresTool()
                    .luminance(12)));

    //DEMONIC BLOCKS-----------------------------------------------------------------------//

    //Malice Block
    public static final Block MALICE_BLOCK = registerBlock("malice_block",
            new MaliceBlock(FabricBlockSettings.copyOf(Blocks.SCULK)
                    .requiresTool()));

    //FAUNA & PLANT BLOCKS-----------------------------------------------------------------------//

    //Rice Crop
    public static final Block RICE_CROP = registerBlock("rice_crop",
            new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)));

    //Tomato Crop
    public static final Block TOMATO_CROP = registerBlock("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.BEETROOTS)
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)));

    //Sundelion
    public static final Block SUNDELION = registerBlock("sundelion",
            new SundelionBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.DANDELION)
                    .nonOpaque()
                    .noCollision()
                    .luminance(4)));
    //Potted Sundelion
    public static final Block POTTED_SUNDELION = registerBlock("potted_sundelion",
            new FlowerPotBlock(SUNDELION, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)
                    .nonOpaque()
                    .luminance(4)));

    //Silent Princess
    public static final Block SILENT_PRINCESS = registerBlock("silent_princess",
            new FlowerBlock(StatusEffects.INVISIBILITY, 10, FabricBlockSettings.copyOf(Blocks.CORNFLOWER)
                    .nonOpaque()
                    .noCollision()
                    .luminance(6)));
    //Potted Silent Princess
    public static final Block POTTED_SILENT_PRINCESS = registerBlock("potted_silent_princess",
            new FlowerPotBlock(SILENT_PRINCESS, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER)
                    .nonOpaque()
                    .luminance(6)));

    //Muddlebud
    public static final Block MUDDLEBUD = registerBlock("muddlebud",
            new MuddlebudBlock(StatusEffects.NAUSEA, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM)
                    .nonOpaque()
                    .noCollision()));
    //Potted Muddlebud
    public static final Block POTTED_MUDDLEBUD = registerBlock("potted_muddlebud",
            new FlowerPotBlock(MUDDLEBUD, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)
                    .nonOpaque()));

    //Blue Nightshade
    public static final Block BLUE_NIGHTSHADE = registerBlock("blue_nightshade",
            new FlowerBlock(StatusEffects.INVISIBILITY, 10, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)
                    .nonOpaque()
                    .luminance(6)
                    .noCollision()));
    //Potted Muddlebud
    public static final Block POTTED_BLUE_NIGHTSHADE = registerBlock("potted_blue_nightshade",
            new FlowerPotBlock(BLUE_NIGHTSHADE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)
                    .nonOpaque()));

    //Brightbloom Bush
    public static final Block BRIGHTBLOOM_BUSH = registerBlock("brightbloom_bush",
            new BrightbloomBush(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)
                    .luminance(8)
                    //.emissiveLighting()
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    //Spicy Pepper Bush
    public static final Block SPICY_PEPPER_BUSH = registerBlock("spicy_pepper_bush",
            new SpicyPepperBush(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

    //Radish Block
    public static final Block RADISH_BLOCK = registerBlock("radish_block",
            new RadishBlock(FabricBlockSettings.copyOf(Blocks.PEONY)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Stamella Shroom
    public static final Block STAMELLA_SHROOM_BLOCK = registerBlock("stamella_shroom_block",
            new StamellaShroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Rushroom
    public static final Block RUSHROOM_BLOCK = registerBlock("rushroom_block",
            new RushroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Skyshroom
    public static final Block SKYSHROOM_BLOCK = registerBlock("skyshroom_block",
            new SkyshroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Truffle
    public static final Block TRUFFLE_BLOCK = registerBlock("truffle_block",
            new TruffleBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Chillshroom
    public static final Block CHILLSHROOM_BLOCK = registerBlock("chillshroom_block",
            new ChillshroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Sunshroom
    public static final Block SUNSHROOM_BLOCK = registerBlock("sunshroom_block",
            new SunshroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Zapshroom
    public static final Block ZAPSHROOM_BLOCK = registerBlock("zapshroom_block",
            new ZapshroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Razorshroom
    public static final Block RAZORSHROOM_BLOCK = registerBlock("razorshroom_block",
            new RazorshroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Ironshroom
    public static final Block IRONSHROOM_BLOCK = registerBlock("ironshroom_block",
            new IronshroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    //Silent Shroom
    public static final Block SILENT_SHROOM_BLOCK = registerBlock("silent_shroom_block",
            new SilentShroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .luminance(8)
                    .sounds(BlockSoundGroup.GRASS)));

    //Brightcap Shroom
    public static final Block BRIGHTCAP_SHROOM_BLOCK = registerBlock("brightcap_shroom_block",
            new BrightcapShroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .luminance(8)
                    .sounds(BlockSoundGroup.GRASS)));

    //Puffshroom
    public static final Block PUFFSHROOM_BLOCK = registerBlock("puffshroom_block",
            new PuffshroomBlock(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.GRASS)));

    public static final Block BOMB_FLOWER_PLANT = registerBlock("bomb_flower_plant",
            new BombFlowerBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)
                    .ticksRandomly()
                    .noCollision()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .sounds(BlockSoundGroup.GRASS)));




    //SKY OAK TREE-----------------------------------------------------------------------//

    //Sky Oak Log
    public static final Block SKY_OAK_LOG = registerBlock("sky_oak_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));

    //Sky Oak Wood
    public static final Block SKY_OAK_WOOD = registerBlock("sky_oak_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    //Stripped Sky Oak Log
    public static final Block STRIPPED_SKY_OAK_LOG = registerBlock("stripped_sky_oak_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));

    //Stripped Sky Oak Wood
    public static final Block STRIPPED_SKY_OAK_WOOD = registerBlock("stripped_sky_oak_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));

    //Sky Oak Planks
    public static final Block SKY_OAK_PLANKS = registerBlock("sky_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    //Sky Oak Leaves
    public static final Block SKY_OAK_LEAVES = registerBlock("sky_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));

    //Sky Oak Sapling
    public static final Block SKY_OAK_SAPLING = registerBlock("sky_oak_sapling",
            new SaplingBlock(new SkyOakSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)));

    //TERRAIN & DECORATION BLOCKS -----------------------------------------------------------------------//

    //Sky Dirt
    public static final Block SKY_DIRT = registerBlock("sky_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    //Sky Grass Block
    public static final Block SKY_GRASS_BLOCK = registerBlock("sky_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));
    //Sky Grass
    public static final Block SKY_GRASS = registerBlock("sky_grass",
            new SkyGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS)
                    .nonOpaque().noCollision()));
    //Sky Vines
    public static final Block SKY_VINES = registerBlock("sky_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)
                    .nonOpaque().noCollision()));

    //Brightbloom Torch
    public static final Block BRIGHTBLOOM_TORCH = registerBlock("brightbloom_torch",
            new BrightbloomTorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH)
                    .noCollision()
                    .breakInstantly()
                    .luminance((state) -> {return 14;})
                    .pistonBehavior(PistonBehavior.DESTROY),
                    ModParticleTypes.BRIGHTBLOOM_FLAME));

    public static final Block WALL_BRIGHTBLOOM_TORCH = registerBlock("wall_brightbloom_torch",
            new WallBrightbloomTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH)
                    .noCollision()
                    .breakInstantly()
                    .luminance((state) -> {return 14;})
                    .dropsLike(BRIGHTBLOOM_TORCH)
                    .pistonBehavior(PistonBehavior.DESTROY),
                    ModParticleTypes.BRIGHTBLOOM_FLAME));



    //REGISTRY-----------------------------------------------------------------------//
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ZeldaMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ZeldaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {

        ZeldaMod.LOGGER.debug("Registering Mod Blocks for " + ZeldaMod.MOD_ID);

    }
}
