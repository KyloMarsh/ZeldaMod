package net.kylo_m.zeldamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup SAILCLOTH = Registry.register(Registries.ITEM_GROUP, new Identifier(ZeldaMod.MOD_ID, "sailcloth"),
            FabricItemGroup.builder().displayName(Text.literal("Zelda Mod"))
                    .icon(() -> new ItemStack(ModItems.SAILCLOTH)).entries((displayContext, entries) -> {

                        //Item Entries

                        //MATERIAL ITEMS----------------------------------------------------------------------//
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_SWORD);
                        entries.add(ModItems.SILVER_PICKAXE);
                        entries.add(ModItems.SILVER_SHOVEL);
                        entries.add(ModItems.SILVER_AXE);
                        entries.add(ModItems.SILVER_HOE);
                        entries.add(ModItems.DIVINE_INGOT);
                        entries.add(ModItems.DEMONIC_INGOT);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.TUNGSTEN_SWORD);
                        entries.add(ModItems.TUNGSTEN_PICKAXE);
                        entries.add(ModItems.TUNGSTEN_SHOVEL);
                        entries.add(ModItems.TUNGSTEN_AXE);
                        entries.add(ModItems.TUNGSTEN_HOE);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.AMBER);
                        entries.add(ModItems.OPAL);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.LUMINOUS_STONE);
                        entries.add(ModItems.ANCIENT_CORE);
                        entries.add(ModItems.GIANT_ANCIENT_CORE);
                        entries.add(ModItems.ANCIENT_GEAR);
                        entries.add(ModItems.ANCIENT_SCREW);
                        entries.add(ModItems.ANCIENT_SHAFT);
                        entries.add(ModItems.ANCIENT_SPRING);
                        entries.add(ModItems.NYLON);
                        entries.add(ModItems.BAKED_APPLE);
                        entries.add(ModItems.TOASTED_MUSHROOM);
                        entries.add(ModItems.PLAIN_CREPE);
                        entries.add(ModItems.BUTTER);
                        entries.add(ModItems.APPLE_PIE);
                        entries.add(ModItems.CARROT_CAKE);
                        entries.add(ModItems.EGG_PUDDING);
                        entries.add(ModItems.EGG_TART);
                        entries.add(ModItems.FISH_PIE);
                        entries.add(ModItems.FRUIT_CAKE);
                        entries.add(ModItems.MONSTER_CAKE);
                        entries.add(ModItems.MONSTER_STEW);
                        entries.add(ModItems.MONSTER_CURRY);
                        entries.add(ModItems.MONSTER_RICE_BALLS);
                        entries.add(ModItems.OMELET);
                        entries.add(ModItems.MEAT_SKEWER);
                        entries.add(ModItems.MUSHROOM_SKEWER);
                        entries.add(ModItems.FISH_SKEWER);
                        entries.add(ModItems.MEAT_PIE);
                        entries.add(ModItems.RADISH_SOUP);
                        entries.add(ModItems.PUMPKIN_STEW);
                        entries.add(ModItems.VEGETABLE_RISOTTO);
                        entries.add(ModItems.MUSHROOM_RISOTTO);
                        entries.add(ModItems.SALMON_RISOTTO);
                        entries.add(ModItems.GORON_SPICE);
                        entries.add(ModItems.MEATY_RICE_BALLS);
                        entries.add(ModItems.SEAFOOD_RICE_BALLS);
                        entries.add(ModItems.MUSHROOM_RICE_BALLS);
                        entries.add(ModItems.CURRY_RICE);
                        entries.add(ModItems.MEATY_CURRY);
                        entries.add(ModItems.DUBIOUS_FOOD);
                        entries.add(ModItems.HONEY_CANDY);
                        entries.add(ModItems.ROCK_SALT);
                        entries.add(ModItems.PIZZA);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.RADISH);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.RICE);
                        entries.add(ModItems.RICE_SEEDS);
                        entries.add(ModItems.ACORN);
                        entries.add(ModItems.SPICY_PEPPER);
                        entries.add(ModItems.BANANA);
                        entries.add(ModItems.BRIGHTBLOOM_SEEDS);
                        entries.add(ModItems.STAMELLA_SHROOM);
                        entries.add(ModItems.RUSHROOM);
                        entries.add(ModItems.SKYSHROOM);
                        entries.add(ModItems.TRUFFLE);
                        entries.add(ModItems.CHILLSHROOM);
                        entries.add(ModItems.SUNSHROOM);
                        entries.add(ModItems.ZAPSHROOM);
                        entries.add(ModItems.RAZORSHROOM);
                        entries.add(ModItems.IRONSHROOM);
                        entries.add(ModItems.SILENT_SHROOM);
                        entries.add(ModItems.BRIGHTCAP_SHROOM);
                        entries.add(ModItems.PUFFSHROOM);
                        entries.add(ModItems.BOMB_FLOWER);
                        entries.add(ModItems.BASS);
                        entries.add(ModItems.HEARTY_BASS);
                        entries.add(ModItems.STAMINOKA_BASS);
                        entries.add(ModItems.HEARTY_SALMON);
                        entries.add(ModItems.MIGHTY_CARP);
                        entries.add(ModItems.ARMOURED_CARP);
                        entries.add(ModItems.SANKE_CARP);
                        entries.add(ModItems.MIGHTY_PORGY);
                        entries.add(ModItems.ARMOURED_PORGY);
                        entries.add(ModItems.IRONSHELL_CRAB);
                        entries.add(ModItems.RAZORCLAW_CRAB);
                        entries.add(ModItems.BRIGHTEYED_CRAB);
                        entries.add(ModItems.BLUESHELL_SNAIL);
                        entries.add(ModItems.MONSTER_EXTRACT);
                        entries.add(ModItems.FAIRY_TONIC);
                        entries.add(ModItems.SAILCLOTH);
                        entries.add(ModItems.MAJORAS_MASK);
                        entries.add(ModItems.BRIGHTBLOOM_ARROW);
                        entries.add(ModItems.OCARINA);
                        entries.add(ModItems.FAIRY_OCARINA);
                        entries.add(ModItems.WIND_WAKER);
                        entries.add(ModItems.LOFTWING_WHISTLE);
                        entries.add(ModItems.GODDESS_HARP);
                        entries.add(ModItems.SPIRIT_FLUTE);
                        entries.add(ModItems.ZONAITE);
                        entries.add(ModItems.ZONAI_CHARGE);
                        entries.add(ModItems.LARGE_ZONAI_CHARGE);
                        entries.add(ModItems.SOLDIER_CONSTRUCT_HORN);
                        entries.add(ModItems.CONSTRUCT_DEBRIS);
                        entries.add(ModItems.CONSTRUCT_CONDUIT);
                        entries.add(ModItems.HYLIAN_SPAWN_EGG);
                        entries.add(ModItems.BRIGHTBLOOM_TORCH_ITEM);

                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.ZONAITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ZONAITE_ORE);
                        entries.add(ModBlocks.AMBER_ORE);
                        entries.add(ModBlocks.AMBER_BLOCK);
                        entries.add(ModBlocks.OPAL_ORE);
                        entries.add(ModBlocks.OPAL_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModBlocks.LUMINOUS_STONE_BLOCK);
                        entries.add(ModBlocks.MALICE_BLOCK);
                        entries.add(ModBlocks.SUNDELION);
                        entries.add(ModBlocks.SILENT_PRINCESS);
                        entries.add(ModBlocks.MUDDLEBUD);
                        entries.add(ModBlocks.BLUE_NIGHTSHADE);
                        entries.add(ModBlocks.SKY_OAK_LOG);
                        entries.add(ModBlocks.SKY_OAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_SKY_OAK_LOG);
                        entries.add(ModBlocks.STRIPPED_SKY_OAK_WOOD);
                        entries.add(ModBlocks.SKY_OAK_PLANKS);
                        entries.add(ModBlocks.SKY_OAK_LEAVES);
                        entries.add(ModBlocks.SKY_OAK_SAPLING);
                        entries.add(ModBlocks.SKY_DIRT);
                        entries.add(ModBlocks.SKY_GRASS_BLOCK);
                        entries.add(ModBlocks.SKY_GRASS);
                        entries.add(ModBlocks.SKY_VINES);
                        entries.add(ModBlocks.RADISH_BLOCK);
                        entries.add(ModBlocks.BOMB_FLOWER_PLANT);
                        //entries.add(ModBlocks.BRIGHTBLOOM_TORCH);


                    }).build());

    public static void registerItemGroups(){

    }
}
