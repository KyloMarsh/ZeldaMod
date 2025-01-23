package net.kylo_m.zeldamod.data;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.block.custom.RadishBlock;
import net.kylo_m.zeldamod.block.custom.RiceCropBlock;
import net.kylo_m.zeldamod.block.custom.TomatoCropBlock;
import net.kylo_m.zeldamod.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.BiFunction;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //Silver
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SILVER_BLOCK);

        //Tungsten
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TUNGSTEN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TUNGSTEN_BLOCK);

        //Zonai Blocks
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ZONAITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_ZONAITE_ORE);

        //Gemstone Blocks
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMBER_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMBER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OPAL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OPAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LUMINOUS_STONE_BLOCK);

        //Malice Blocks
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MALICE_BLOCK);

        //Sky Oak Blocks
        blockStateModelGenerator.registerLog(ModBlocks.SKY_OAK_LOG).log(ModBlocks.SKY_OAK_LOG).wood(ModBlocks.SKY_OAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SKY_OAK_LOG).log(ModBlocks.STRIPPED_SKY_OAK_LOG).wood(ModBlocks.STRIPPED_SKY_OAK_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SKY_OAK_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SKY_OAK_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.SKY_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Hylian Spawn Egg
        blockStateModelGenerator.registerParentedItemModel(ModItems.HYLIAN_SPAWN_EGG, ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));

        //Rice Crop
        blockStateModelGenerator.registerCrop(ModBlocks.RICE_CROP, RiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

        //Tomato Crop
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3);

        //Sundelion
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SUNDELION, ModBlocks.POTTED_SUNDELION, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Silent Princess
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SILENT_PRINCESS, ModBlocks.POTTED_SILENT_PRINCESS, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Muddlebud
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MUDDLEBUD, ModBlocks.POTTED_MUDDLEBUD, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Blue Nightshade
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_NIGHTSHADE, ModBlocks.POTTED_BLUE_NIGHTSHADE, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Radish Block
        blockStateModelGenerator.registerTintableCross(ModBlocks.RADISH_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Bomb Flower Plant
        blockStateModelGenerator.registerTintableCross(ModBlocks.BOMB_FLOWER_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Sky Dirt
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SKY_DIRT);

        //Sky Grass
        blockStateModelGenerator.registerTintableCross(ModBlocks.SKY_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Sky Vines
        blockStateModelGenerator.registerWallPlant(ModBlocks.SKY_VINES);

        //Shroom Blocks
        blockStateModelGenerator.registerTintableCross(ModBlocks.STAMELLA_SHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.RUSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.SKYSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.TRUFFLE_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.CHILLSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.SUNSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.ZAPSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.RAZORSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.IRONSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.SILENT_SHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.BRIGHTCAP_SHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PUFFSHROOM_BLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Torch
        blockStateModelGenerator.registerTorch(ModBlocks.BRIGHTBLOOM_TORCH, ModBlocks.WALL_BRIGHTBLOOM_TORCH);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        //MATERIAL ITEMS----------------------------------------------------------------------//

        //Silver
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);

        //Divine Ingot
        itemModelGenerator.register(ModItems.DIVINE_INGOT, Models.GENERATED);

        //Corrupted Ingot
        itemModelGenerator.register(ModItems.DEMONIC_INGOT, Models.GENERATED);

        //Tungsten
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);


        //Steel
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);

        //Gemstones
        itemModelGenerator.register(ModItems.AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.OPAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUMINOUS_STONE, Models.GENERATED);

        //TOOL ITEMS----------------------------------------------------------------------//

        //Silver Tools
        itemModelGenerator.register(ModItems.SILVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_HOE, Models.HANDHELD);

        //Tungsten Tools
        itemModelGenerator.register(ModItems.TUNGSTEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_HOE, Models.HANDHELD);

        //Steel Tools
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        //SHEIKAH ITEMS----------------------------------------------------------------------//

        itemModelGenerator.register(ModItems.ANCIENT_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GIANT_ANCIENT_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_GEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_SCREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_SHAFT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_SPRING, Models.GENERATED);
        itemModelGenerator.register(ModItems.NYLON, Models.GENERATED);

        //FOOD ITEMS----------------------------------------------------------------------//

        itemModelGenerator.register(ModItems.BAKED_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOASTED_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLAIN_CREPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROT_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_PUDDING, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_TART, Models.GENERATED);
        itemModelGenerator.register(ModItems.FISH_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRUIT_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONSTER_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONSTER_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONSTER_CURRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONSTER_RICE_BALLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.OMELET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEAT_SKEWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSHROOM_SKEWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FISH_SKEWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEAT_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADISH_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGETABLE_RISOTTO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSHROOM_RISOTTO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_RISOTTO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GORON_SPICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEATY_RICE_BALLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SEAFOOD_RICE_BALLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSHROOM_RICE_BALLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CURRY_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEATY_CURRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUBIOUS_FOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HONEY_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROCK_SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIZZA, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);

        //GROWABLE ITEMS----------------------------------------------------------------------//

        itemModelGenerator.register(ModItems.RADISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ACORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPICY_PEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRIGHTBLOOM_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOMB_FLOWER, Models.GENERATED);


        //FISH ITEMS------------------------------------------------------------------------//

        itemModelGenerator.register(ModItems.BASS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEARTY_BASS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAMINOKA_BASS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEARTY_SALMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIGHTY_CARP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOURED_CARP, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANKE_CARP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIGHTY_PORGY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOURED_PORGY, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRONSHELL_CRAB, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAZORCLAW_CRAB, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRIGHTEYED_CRAB, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUESHELL_SNAIL, Models.GENERATED);

        //MISC ITEMS-----------------------------------------------------------------------//

        itemModelGenerator.register(ModItems.MONSTER_EXTRACT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAIRY_TONIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAILCLOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAJORAS_MASK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRIGHTBLOOM_ARROW, Models.GENERATED);
        //itemModelGenerator.register(ModItems.BRIGHTBLOOM_TORCH_ITEM, Models.GENERATED);

        //INSTRUMENT ITEMS-----------------------------------------------------------------------//

        itemModelGenerator.register(ModItems.OCARINA, Models.GENERATED);
        itemModelGenerator.register(ModItems.FAIRY_OCARINA, Models.GENERATED);
        itemModelGenerator.register(ModItems.WIND_WAKER, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOFTWING_WHISTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GODDESS_HARP, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPIRIT_FLUTE, Models.GENERATED);

        //ZONAI ITEMS-----------------------------------------------------------------------//

        itemModelGenerator.register(ModItems.ZONAITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZONAI_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LARGE_ZONAI_CHARGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOLDIER_CONSTRUCT_HORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONSTRUCT_DEBRIS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONSTRUCT_CONDUIT, Models.GENERATED);

    }
}
