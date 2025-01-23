package net.kylo_m.zeldamod.util;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.WeatherCheckLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.LootFunctionTypes;
import net.minecraft.loot.function.SetContentsLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    public static boolean hasModifiedFishPool = false;
    public static boolean hasModifiedSnifferPool = false;

    //Leaves Drops
    public static final Identifier OAK_LEAVES_ID =
            new Identifier("minecraft", "blocks/oak_leaves");
    public static final Identifier DARK_OAK_LEAVES_ID =
            new Identifier("minecraft", "blocks/dark_oak_leaves");
    public static final Identifier BIRCH_LEAVES_ID =
            new Identifier("minecraft", "blocks/birch_leaves");
    public static final Identifier SPRUCE_LEAVES_ID =
            new Identifier("minecraft", "blocks/spruce_leaves");
    public static final Identifier JUNGLE_LEAVES_ID =
            new Identifier("minecraft", "blocks/jungle_leaves");

    //Chest Loot
    public static final Identifier DUNGEON_CHEST_ID =
            new Identifier("minecraft", "chests/simple_dungeon");
    public static final Identifier ABANDONED_CART_CHEST_ID =
            new Identifier("minecraft", "chests/abandoned_mineshaft");
    public static final Identifier ANCIENT_CITY_CHEST_ID =
            new Identifier("minecraft", "chests/ancient_city");
    public static final Identifier BURIED_TREASURE_CHEST_ID =
            new Identifier("minecraft", "chests/buried_treasure");
    public static final Identifier DESERT_TEMPLE_CHEST_ID =
            new Identifier("minecraft", "chests/desert_pyramid");
    public static final Identifier BONUS_CHEST_ID =
            new Identifier("minecraft", "chests/spawn_bonus_chest");
    public static final Identifier JUNGLE_TEMPLE_CHEST_ID =
            new Identifier("minecraft", "chests/jungle_temple");
    public static final Identifier IGLOO_CHEST_ID =
            new Identifier("minecraft", "chests/igloo_chest");
    public static final Identifier SHIPWRECK_SUPPLY_CHEST_ID =
            new Identifier("minecraft", "chests/shipwreck_supply");
    public static final Identifier SHIPWRECK_TREASURE_CHEST_ID =
            new Identifier("minecraft", "chests/shipwreck_treasure");
    public static final Identifier RUINED_PORTAL_CHEST_ID =
            new Identifier("minecraft", "chests/ruined_portal");

    //Sniffer Digging
    public static final Identifier SNIFFER_DIGGING_ID =
            new Identifier("minecraft", "gameplay/sniffer_digging");

    //Fishing
    public static final Identifier FISHING_FISH_ID =
            new Identifier("minecraft", "gameplay/fishing/fish");
    public static final Identifier FISHING_JUNK_ID =
            new Identifier("minecraft", "gameplay/fishing/junk");
    public static final Identifier FISHING_TREASURE_ID =
            new Identifier("minecraft", "gameplay/fishing/treasure");



    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            //FISHING DROPS -------------------------------------------------------------------------------------------------------------->

            //FISHING FISH
            if(FISHING_FISH_ID.equals(id) && source.isBuiltin() && !hasModifiedFishPool){

                //Only modify first pool, which SHOULD be the fish pool
                hasModifiedFishPool = true;

                tableBuilder.modifyPools(lpb ->{
                    //Default fish loot table has a total weight of 100.
                    //An entry with weight 10  represents 10% chance to get that fish compared to the standard 4,
                    //but the percentage goes down as more custom fish are added.
                    //Odds can be balanced via biome setting or doing math.

                    //BASS
                    lpb.with(ItemEntry.builder(ModItems.BASS).weight(80).build());
                    lpb.with(ItemEntry.builder(ModItems.HEARTY_BASS).weight(20).build());
                    lpb.with(ItemEntry.builder(ModItems.STAMINOKA_BASS).weight(20).build());

                    //SALMON
                    lpb.with(ItemEntry.builder(ModItems.HEARTY_SALMON).weight(10).build());

                    //CARP
                    lpb.with(ItemEntry.builder(ModItems.MIGHTY_CARP).weight(20).build());
                    lpb.with(ItemEntry.builder(ModItems.ARMOURED_CARP).weight(20).build());
                    lpb.with(ItemEntry.builder(ModItems.SANKE_CARP).weight(80).build());

                    //PORGY
                    lpb.with(ItemEntry.builder(ModItems.MIGHTY_PORGY).weight(10).build());
                    lpb.with(ItemEntry.builder(ModItems.ARMOURED_PORGY).weight(10).build());

                    //CRABS
                    lpb.with(ItemEntry.builder(ModItems.IRONSHELL_CRAB).weight(20).build());
                    lpb.with(ItemEntry.builder(ModItems.RAZORCLAW_CRAB).weight(20).build());
                    lpb.with(ItemEntry.builder(ModItems.BRIGHTEYED_CRAB).weight(20).build());

                    //SNAILS
                    lpb.with(ItemEntry.builder(ModItems.BLUESHELL_SNAIL).weight(20).build());

                });

            }

            //SNIFFER DROPS -------------------------------------------------------------------------------------------------------------->

            if(SNIFFER_DIGGING_ID.equals(id) && source.isBuiltin() && !hasModifiedSnifferPool){

                hasModifiedSnifferPool = true;

                tableBuilder.modifyPools(lpb1 ->{

                    //Brightbloom Seeds
                    lpb1.with(ItemEntry.builder(ModItems.BRIGHTBLOOM_SEEDS).weight(55).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                    //Tomato Seeds
                    lpb1.with(ItemEntry.builder(ModItems.TOMATO_SEEDS).weight(50).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                    //Rice Seeds
                    lpb1.with(ItemEntry.builder(ModItems.RICE_SEEDS).weight(65).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f))).build());

                    //Truffle
                    lpb1.with(ItemEntry.builder(ModItems.TRUFFLE).weight(20).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                    //Radish
                    lpb1.with(ItemEntry.builder(ModItems.RADISH).weight(20).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                    //Puffshroom
                    lpb1.with(ItemEntry.builder(ModItems.PUFFSHROOM).weight(40).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                    //Brightcap Shroom
                    lpb1.with(ItemEntry.builder(ModItems.BRIGHTCAP_SHROOM).weight(40).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                    //Muddlebud
                    lpb1.with(ItemEntry.builder(ModBlocks.MUDDLEBUD).weight(40).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                    //Ancient Parts
                    lpb1.with(ItemEntry.builder(ModItems.ANCIENT_CORE).weight(5).build());
                    lpb1.with(ItemEntry.builder(ModItems.GIANT_ANCIENT_CORE).weight(5).build());
                    lpb1.with(ItemEntry.builder(ModItems.ANCIENT_SCREW).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());
                    lpb1.with(ItemEntry.builder(ModItems.ANCIENT_SHAFT).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());
                    lpb1.with(ItemEntry.builder(ModItems.ANCIENT_SPRING).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());
                    lpb1.with(ItemEntry.builder(ModItems.ANCIENT_GEAR).weight(10).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))).build());

                });

            }

            //LEAVES -------------------------------------------------------------------------------------------------------------->

            //Oak Leaves = Acorn Drop
            if(OAK_LEAVES_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.ACORN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Dark Oak Leaves = Acorn Drop
            if(DARK_OAK_LEAVES_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.ACORN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Jungle Leaves = Banana Drop
            if(JUNGLE_LEAVES_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.BANANA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Chests -------------------------------------------------------------------------------------------------------------->

            //Dungeon Chest = Dubious Food
            if(DUNGEON_CHEST_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.DUBIOUS_FOOD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Bonus Chest = Acorn
            if(BONUS_CHEST_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.ACORN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Bonus Chest = Banana
            if(BONUS_CHEST_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.BANANA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Bonus Chest = Tomato
            if(BONUS_CHEST_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.TOMATO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Bonus Chest = Spicy Pepper
            if(BONUS_CHEST_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.SPICY_PEPPER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Bonus Chest = Bass
            if(BONUS_CHEST_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) //Drops 1f = 100% of the time
                        .with(ItemEntry.builder(ModItems.BASS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f))
                                .build());
                tableBuilder.pool(poolBuilder.build());
            }



        });

    }

}
