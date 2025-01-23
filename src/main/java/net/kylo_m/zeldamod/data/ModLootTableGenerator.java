package net.kylo_m.zeldamod.data;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.block.custom.RiceCropBlock;
import net.kylo_m.zeldamod.block.custom.TomatoCropBlock;
import net.kylo_m.zeldamod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.GroupEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        //RESOURCE BLOCKS-----------------------------------------------------------------------//

        //Silver
        addDrop(ModBlocks.SILVER_ORE, oreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.SILVER_BLOCK);

        //Tungsten
        addDrop(ModBlocks.TUNGSTEN_ORE, oreDrops(ModBlocks.TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN));
        addDrop(ModBlocks.TUNGSTEN_BLOCK);

        //Zonaite
        addDrop(ModBlocks.ZONAITE_ORE, oreDrops(ModBlocks.ZONAITE_ORE, ModItems.ZONAITE));

        //GEMSTONE BLOCKS-----------------------------------------------------------------------//

        //Amber Ore
        addDrop(ModBlocks.AMBER_ORE, oreDrops(ModBlocks.AMBER_ORE, ModItems.AMBER));

        //Opal Ore
        addDrop(ModBlocks.OPAL_ORE, oreDrops(ModBlocks.OPAL_ORE, ModItems.OPAL));

        //Ruby Ore
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_BLOCK, ModItems.RUBY));

        //Sapphire Ore
        addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_BLOCK, ModItems.SAPPHIRE));

        //Topaz Ore
        addDrop(ModBlocks.TOPAZ_ORE, oreDrops(ModBlocks.TOPAZ_BLOCK, ModItems.TOPAZ));

        //Luminous Stone
        addDrop(ModBlocks.LUMINOUS_STONE_BLOCK, oreDrops(ModBlocks.LUMINOUS_STONE_BLOCK, ModItems.LUMINOUS_STONE));

        //DEMONIC BLOCKS-----------------------------------------------------------------------//

        //Malice Block
        addDrop(ModBlocks.MALICE_BLOCK, drops(ModBlocks.MALICE_BLOCK));

        //CROP BLOCKS-----------------------------------------------------------------------//

        //Rice Crop
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(RiceCropBlock.AGE, 7));
        addDrop(ModBlocks.RICE_CROP, cropDrops(ModBlocks.RICE_CROP, ModItems.RICE, ModItems.RICE_SEEDS, builder));

        //Tomato Crop
        BlockStatePropertyLootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 3));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder1));


        //GROWABLES -----------------------------------------------------------------------//

        //Shrooms
        addDrop(ModBlocks.STAMELLA_SHROOM_BLOCK, drops(ModItems.STAMELLA_SHROOM));
        addDrop(ModBlocks.RUSHROOM_BLOCK, drops(ModItems.RUSHROOM));
        addDrop(ModBlocks.SKYSHROOM_BLOCK, drops(ModItems.SKYSHROOM));
        addDrop(ModBlocks.TRUFFLE_BLOCK, drops(ModItems.TRUFFLE));
        addDrop(ModBlocks.CHILLSHROOM_BLOCK, drops(ModItems.CHILLSHROOM));
        addDrop(ModBlocks.SUNSHROOM_BLOCK, drops(ModItems.SUNSHROOM));
        addDrop(ModBlocks.ZAPSHROOM_BLOCK, drops(ModItems.ZAPSHROOM));
        addDrop(ModBlocks.RAZORSHROOM_BLOCK, drops(ModItems.RAZORSHROOM));
        addDrop(ModBlocks.IRONSHROOM_BLOCK, drops(ModItems.IRONSHROOM));
        addDrop(ModBlocks.SILENT_SHROOM_BLOCK, drops(ModItems.SILENT_SHROOM));
        addDrop(ModBlocks.BRIGHTCAP_SHROOM_BLOCK, drops(ModItems.BRIGHTCAP_SHROOM));
        addDrop(ModBlocks.PUFFSHROOM_BLOCK, drops(ModItems.PUFFSHROOM));



        //TERRAIN & DECORATION BLOCKS-----------------------------------------------------------------------//

        //Sky Oak Tree
        addDrop(ModBlocks.SKY_OAK_LOG, drops(ModBlocks.SKY_OAK_LOG));
        addDrop(ModBlocks.SKY_OAK_WOOD, drops(ModBlocks.SKY_OAK_WOOD));
        addDrop(ModBlocks.STRIPPED_SKY_OAK_LOG, drops(ModBlocks.STRIPPED_SKY_OAK_LOG));
        addDrop(ModBlocks.STRIPPED_SKY_OAK_WOOD, drops(ModBlocks.STRIPPED_SKY_OAK_WOOD));
        addDrop(ModBlocks.SKY_OAK_PLANKS, drops(ModBlocks.SKY_OAK_PLANKS));
        addDrop(ModBlocks.SKY_OAK_SAPLING, drops(ModBlocks.SKY_OAK_SAPLING));
        addDrop(ModBlocks.SKY_OAK_LEAVES, dropsWithShears(ModBlocks.SKY_OAK_LEAVES));
        addDrop(ModBlocks.SKY_OAK_LEAVES, dropsWithSilkTouch(ModBlocks.SKY_OAK_LEAVES));

        //Sky Dirt
        addDrop(ModBlocks.SKY_DIRT, drops(ModBlocks.SKY_DIRT));

        //Sky Grass Block
        addDrop(ModBlocks.SKY_GRASS_BLOCK, drops(ModBlocks.SKY_GRASS_BLOCK));

        //Sky Grass
        addDrop(ModBlocks.SKY_GRASS, dropsWithShears(ModBlocks.SKY_GRASS));
        addDrop(ModBlocks.SKY_GRASS, dropsWithSilkTouch(ModBlocks.SKY_GRASS));

        //Sky Vines
        addDrop(ModBlocks.SKY_VINES, dropsWithShears(ModBlocks.SKY_VINES));
        addDrop(ModBlocks.SKY_VINES, dropsWithSilkTouch(ModBlocks.SKY_VINES));

        //Brightbloom Torch
        addDrop(ModBlocks.BRIGHTBLOOM_TORCH, drops(ModBlocks.BRIGHTBLOOM_TORCH));

        //Sundelion
        addDrop(ModBlocks.SUNDELION);
        addPottedPlantDrops(ModBlocks.POTTED_SUNDELION);

        //Silent Princess
        addDrop(ModBlocks.SILENT_PRINCESS);
        addPottedPlantDrops(ModBlocks.POTTED_SILENT_PRINCESS);

        //Muddlebud
        addDrop(ModBlocks.MUDDLEBUD);
        addPottedPlantDrops(ModBlocks.POTTED_MUDDLEBUD);

        //Blue Nightshade
        addDrop(ModBlocks.BLUE_NIGHTSHADE);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_NIGHTSHADE);

        //Radish
        addDrop(ModBlocks.RADISH_BLOCK, drops(ModItems.RADISH));

        //Bomb Flower
        addDrop(ModBlocks.BOMB_FLOWER_PLANT, drops(ModItems.BOMB_FLOWER));

    }
}
