package net.kylo_m.zeldamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.entity.ModEntities;
import net.kylo_m.zeldamod.item.custom.*;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModItems<entries> {

    //MATERIAL ITEMS----------------------------------------------------------------------//

    //Raw Silver
    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new Item.Settings()));
    //Silver Ingot
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new Item.Settings()));
    //Divine Ingot
    public static final Item DIVINE_INGOT = registerItem("divine_ingot",
            new Item(new Item.Settings()));
    //Corrupted Ingot
    public static final Item DEMONIC_INGOT = registerItem("demonic_ingot",
            new Item(new Item.Settings()));
    //Raw Tungsten
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten",
            new Item(new Item.Settings()));
    //Tungsten Ingot
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot",
            new Item(new Item.Settings()));
    //Steel Ingot
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new Item.Settings()));
    //Amber
    public static final Item AMBER = registerItem("amber",
            new Item(new Item.Settings()));
    //Opal
    public static final Item OPAL = registerItem("opal",
            new Item(new Item.Settings()));
    //Ruby
    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()));
    //Sapphire
    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new Item.Settings()));
    //Topaz
    public static final Item TOPAZ = registerItem("topaz",
            new Item(new Item.Settings()));
    //Luminous Stone
    public static final Item LUMINOUS_STONE = registerItem("luminous_stone",
            new Item(new Item.Settings()));



    //TOOL ITEMS----------------------------------------------------------------------//

    //Silver Sword
    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ModToolMaterial.SILVER, 3, -2.4F,
                    new FabricItemSettings().maxCount(1)));
    //Silver Pickaxe
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new PickaxeItem(ModToolMaterial.SILVER, 1, -2.8F,
                    new FabricItemSettings().maxCount(1)));
    //Silver Shovel
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(ModToolMaterial.SILVER, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1)));
    //Silver Axe
    public static final Item SILVER_AXE = registerItem("silver_axe",
            new AxeItem(ModToolMaterial.SILVER, 7.0F, -3.2F,
                    new FabricItemSettings().maxCount(1)));
    //Silver Hoe
    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new HoeItem(ModToolMaterial.SILVER, -1, -2.0F,
                    new FabricItemSettings().maxCount(1)));



    //Tungsten Sword
    public static final Item TUNGSTEN_SWORD = registerItem("tungsten_sword",
            new SwordItem(ModToolMaterial.TUNGSTEN, 6, -3.2F,
                    new FabricItemSettings().maxCount(1)));
    //Tungsten Pickaxe
    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe",
            new PickaxeItem(ModToolMaterial.TUNGSTEN, 1, -2.8F,
                    new FabricItemSettings().maxCount(1)));
    //Tungsten Shovel
    public static final Item TUNGSTEN_SHOVEL = registerItem("tungsten_shovel",
            new ShovelItem(ModToolMaterial.TUNGSTEN, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1)));
    //Tungsten Axe
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe",
            new AxeItem(ModToolMaterial.TUNGSTEN, 8, -3.4F,
                    new FabricItemSettings().maxCount(1)));
    //Tungsten Hoe
    public static final Item TUNGSTEN_HOE = registerItem("tungsten_hoe",
            new HoeItem(ModToolMaterial.TUNGSTEN, -3, -3.0F,
                    new FabricItemSettings().maxCount(1)));



    //Steel Sword
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 6, -2.4F,
                    new FabricItemSettings().maxCount(1)));
    //Steel Pickaxe
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8F,
                    new FabricItemSettings().maxCount(1)));
    //Steel Shovel
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 1.5F, -3.0F,
                    new FabricItemSettings().maxCount(1)));
    //Steel Axe
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 8, -3.4F,
                    new FabricItemSettings().maxCount(1)));
    //Steel Hoe
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, -3, -3.0F,
                    new FabricItemSettings().maxCount(1)));



    //SHEIKAH ITEMS----------------------------------------------------------------------//

    //Ancient Core
    public static final Item ANCIENT_CORE = registerItem("ancient_core",
            new Item(new Item.Settings()));
    //Giant Ancient Core
    public static final Item GIANT_ANCIENT_CORE = registerItem("giant_ancient_core",
            new Item(new Item.Settings()));
    //Ancient Gear
    public static final Item ANCIENT_GEAR = registerItem("ancient_gear",
            new Item(new Item.Settings()));
    //Ancient Screw
    public static final Item ANCIENT_SCREW = registerItem("ancient_screw",
            new Item(new Item.Settings()));
    //Ancient Shaft
    public static final Item ANCIENT_SHAFT = registerItem("ancient_shaft",
            new Item(new Item.Settings()));
    //Ancient Spring
    public static final Item ANCIENT_SPRING = registerItem("ancient_spring",
            new Item(new Item.Settings()));
    //Nylon
    public static final Item NYLON = registerItem("nylon",
            new Item(new Item.Settings()));


    //FOOD ITEMS------------------------------------------------------------------------//

    //Baked Apple
    public static final Item BAKED_APPLE = registerItem("baked_apple",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Toasted Mushroom
    public static final Item TOASTED_MUSHROOM = registerItem("toasted_mushroom",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Plain Crepe
    public static final Item PLAIN_CREPE = registerItem("plain_crepe",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Butter
    public static final Item BUTTER = registerItem("butter",
            new Item(new FabricItemSettings()));

    //Apple Pie
    public static final Item APPLE_PIE = registerItem("apple_pie",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Carrot Cake
    public static final Item CARROT_CAKE = registerItem("carrot_cake",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Egg Pudding
    public static final Item EGG_PUDDING = registerItem("egg_pudding",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Egg Tart
    public static final Item EGG_TART = registerItem("egg_tart",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Fish Pie
    public static final Item FISH_PIE = registerItem("fish_pie",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Fruit Cake
    public static final Item FRUIT_CAKE = registerItem("fruit_cake",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Monster Cake
    public static final Item MONSTER_CAKE = registerItem("monster_cake",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Monster Stew
    public static final Item MONSTER_STEW = registerItem("monster_stew",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Monster Curry
    public static final Item MONSTER_CURRY = registerItem("monster_curry",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Monster Rice Balls
    public static final Item MONSTER_RICE_BALLS = registerItem("monster_rice_balls",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Omelet
    public static final Item OMELET = registerItem("omelet",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Meat Skewer
    public static final Item MEAT_SKEWER = registerItem("meat_skewer",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Mushroom Skewer
    public static final Item MUSHROOM_SKEWER = registerItem("mushroom_skewer",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Fish Skewer
    public static final Item FISH_SKEWER = registerItem("fish_skewer",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Meat Pie
    public static final Item MEAT_PIE = registerItem("meat_pie",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Radish Soup
    public static final Item RADISH_SOUP = registerItem("radish_soup",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1.0F)
                            .build())));
    //Pumpkin Stew
    public static final Item PUMPKIN_STEW = registerItem("pumpkin_stew",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Vegetable Risotto
    public static final Item VEGETABLE_RISOTTO = registerItem("vegetable_risotto",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Mushroom Risotto
    public static final Item MUSHROOM_RISOTTO = registerItem("mushroom_risotto",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Salmon Risotto
    public static final Item SALMON_RISOTTO = registerItem("salmon_risotto",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Goron Spice
    public static final Item GORON_SPICE = registerItem("goron_spice",
            new Item(new FabricItemSettings()));
    //Meaty Rice Balls
    public static final Item MEATY_RICE_BALLS = registerItem("meaty_rice_balls",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Seafood Rice Balls
    public static final Item SEAFOOD_RICE_BALLS = registerItem("seafood_rice_balls",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Mushroom Rice Balls
    public static final Item MUSHROOM_RICE_BALLS = registerItem("mushroom_rice_balls",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Curry Rice
    public static final Item CURRY_RICE = registerItem("curry_rice",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Meaty Curry
    public static final Item MEATY_CURRY = registerItem("meaty_curry",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Dubious Food
    public static final Item DUBIOUS_FOOD = registerItem("dubious_food",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200), 0.70f)
                            .build())));
    //Honey Candy
    public static final Item HONEY_CANDY = registerItem("honey_candy",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200), 1.0f)
                            .build())));
    //Rock Salt
    public static final Item ROCK_SALT = registerItem("rock_salt",
            new Item(new FabricItemSettings()));
    //Pizza
    public static final Item PIZZA = registerItem("pizza",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Cheese
    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));

    //NATURAL ITEMS--------------------------------------------------------------------//

    //Radish
    public static final Item RADISH = registerItem("radish",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Tomato Seeds
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, (new FabricItemSettings())));
    //Tomato
    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Rice
    public static final Item RICE = registerItem("rice",
            new Item(new FabricItemSettings()));
    //Rice Seeds
    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            new AliasedBlockItem(ModBlocks.RICE_CROP, (new FabricItemSettings())));
    //Acorn
    public static final Item ACORN = registerItem("acorn",
            new Item(new FabricItemSettings()));
    //Spicy Pepper
    public static final Item SPICY_PEPPER = registerItem("spicy_pepper",
            new AliasedBlockItem(ModBlocks.SPICY_PEPPER_BUSH, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Banana
    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Brightbloom Seeds
    public static final Item BRIGHTBLOOM_SEEDS = registerItem("brightbloom_seeds",
            new AliasedBlockItem(ModBlocks.BRIGHTBLOOM_BUSH, new FabricItemSettings()));
    //Stamella Shroom
    public static final Item STAMELLA_SHROOM = registerItem("stamella_shroom",
            new AliasedBlockItem(ModBlocks.STAMELLA_SHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Rushroom
    public static final Item RUSHROOM = registerItem("rushroom",
            new AliasedBlockItem(ModBlocks.RUSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Skyshroom
    public static final Item SKYSHROOM = registerItem("skyshroom",
            new AliasedBlockItem(ModBlocks.SKYSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Truffle
    public static final Item TRUFFLE = registerItem("truffle",
            new AliasedBlockItem(ModBlocks.TRUFFLE_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Chillshroom
    public static final Item CHILLSHROOM = registerItem("chillshroom",
            new AliasedBlockItem(ModBlocks.CHILLSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Sunshroom
    public static final Item SUNSHROOM = registerItem("sunshroom",
            new AliasedBlockItem(ModBlocks.SUNSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Zapshroom
    public static final Item ZAPSHROOM = registerItem("zapshroom",
            new AliasedBlockItem(ModBlocks.ZAPSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Razorshroom
    public static final Item RAZORSHROOM = registerItem("razorshroom",
            new AliasedBlockItem(ModBlocks.RAZORSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Ironshroom
    public static final Item IRONSHROOM = registerItem("ironshroom",
            new AliasedBlockItem(ModBlocks.IRONSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Silent Shroom
    public static final Item SILENT_SHROOM = registerItem("silent_shroom",
            new AliasedBlockItem(ModBlocks.SILENT_SHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Brighcap Shroom
    public static final Item BRIGHTCAP_SHROOM = registerItem("brightcap_shroom",
            new AliasedBlockItem(ModBlocks.BRIGHTCAP_SHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build()
            )));
    //Puffshroom
    public static final Item PUFFSHROOM = registerItem("puffshroom",
            new AliasedBlockItem(ModBlocks.PUFFSHROOM_BLOCK, new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200),1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 3), 1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), 0.25f)
                            .build()
            )));

    //Bomb Flower
    public static final Item BOMB_FLOWER = registerItem("bomb_flower",
            new Item(new FabricItemSettings()));

    //FISH ITEMS------------------------------------------------------------------------//

    //Bass
    public static final Item BASS = registerItem("bass",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Hearty Bass
    public static final Item HEARTY_BASS = registerItem("hearty_bass",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Staminoka Bass
    public static final Item STAMINOKA_BASS = registerItem("staminoka_bass",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Hearty Salmon
    public static final Item HEARTY_SALMON = registerItem("hearty_salmon",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Mighty Carp
    public static final Item MIGHTY_CARP = registerItem("mighty_carp",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Armoured Carp
    public static final Item ARMOURED_CARP = registerItem("armoured_carp",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Sanke Carp
    public static final Item SANKE_CARP = registerItem("sanke_carp",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Mighty Porgy
    public static final Item MIGHTY_PORGY = registerItem("mighty_porgy",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Armoured Porgy
    public static final Item ARMOURED_PORGY = registerItem("armoured_porgy",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));

    //Ironshell Crab
    public static final Item IRONSHELL_CRAB = registerItem("ironshell_crab",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Razorclaw Crab
    public static final Item RAZORCLAW_CRAB = registerItem("razorclaw_crab",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Bright-Eyed Crab
    public static final Item BRIGHTEYED_CRAB = registerItem("brighteyed_crab",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
    //Blueshell Snail
    public static final Item BLUESHELL_SNAIL = registerItem("blueshell_snail",
            new Item(new FabricItemSettings().food(
                    new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));

    //MISC ITEMS-----------------------------------------------------------------------//

    //Monster Extract
    public static final Item MONSTER_EXTRACT = registerItem("monster_extract",
            new Item(new FabricItemSettings()));
    //Fairy Tonic
    public static final Item FAIRY_TONIC = registerItem("fairy_tonic",
            new Item(new FabricItemSettings()));
    //Sailcloth
    public static final Item SAILCLOTH = registerItem("sailcloth",
            new SailclothItem(new FabricItemSettings().maxCount(1)));
    //Majora's Mask
    public static final Item MAJORAS_MASK = registerItem("majoras_mask",
            new MajorasMaskItem(new FabricItemSettings().maxCount(1)));
    //Brightbloom Arrow
    public static final Item BRIGHTBLOOM_ARROW = registerItem("brightbloom_arrow",
            new SpectralArrowItem(new FabricItemSettings()));
    //Brightbloom Torch
    public static final Item BRIGHTBLOOM_TORCH_ITEM = registerItem("brightbloom_torch_item",
            new VerticallyAttachableBlockItem(ModBlocks.BRIGHTBLOOM_TORCH, ModBlocks.WALL_BRIGHTBLOOM_TORCH, new FabricItemSettings(), Direction.DOWN));

    //INSTRUMENT ITEMS-----------------------------------------------------------------------//

    //Ocarina of Time
    public static final Item OCARINA = registerItem("ocarina",
            new OcarinaItem(new FabricItemSettings().maxCount(1)));
    //Fairy Ocarina
    public static final Item FAIRY_OCARINA = registerItem("fairy_ocarina",
            new FairyOcarinaItem(new FabricItemSettings().maxCount(1)));
    //Wind Waker
    public static final Item WIND_WAKER = registerItem("wind_waker",
            new WindwakerItem(new FabricItemSettings().maxCount(1)));
    //Loftwing Whistle
    public static final Item LOFTWING_WHISTLE = registerItem("loftwing_whistle",
            new LoftwingWhistleItem(new FabricItemSettings().maxCount(1)));
    //Goddess Harp
    public static final Item GODDESS_HARP = registerItem("goddess_harp",
            new GoddessHarpItem(new FabricItemSettings().maxCount(1)));
    //Spirit Flute
    public static final Item SPIRIT_FLUTE = registerItem("spirit_flute",
            new SpiritFluteItem(new FabricItemSettings().maxCount(1)));

    //ZONAI ITEMS-----------------------------------------------------------------------//

    //Zonaite
    public static final Item ZONAITE = registerItem("zonaite",
            new Item(new FabricItemSettings()));
    //Zonai Charge
    public static final Item ZONAI_CHARGE = registerItem("zonai_charge",
            new Item(new FabricItemSettings()));
    //Large Zonai Charge
    public static final Item LARGE_ZONAI_CHARGE = registerItem("large_zonai_charge",
            new Item(new FabricItemSettings()));
    //Soldier Construct Horn
    public static final Item SOLDIER_CONSTRUCT_HORN = registerItem("soldier_construct_horn",
            new Item(new FabricItemSettings()));
    //Construct Debris
    public static final Item CONSTRUCT_DEBRIS = registerItem("construct_debris",
            new Item(new FabricItemSettings()));
    //Construct Conduit
    public static final Item CONSTRUCT_CONDUIT = registerItem("construct_conduit",
            new Item(new FabricItemSettings()));

    //ENTITY SPAWN EGGS------------------------------------------------------------------------//
    public static final Item HYLIAN_SPAWN_EGG = registerItem("hylian_spawn_egg",
            new SpawnEggItem(ModEntities.HYLIAN,0xFA0023, 0x000000,
                    new FabricItemSettings()));

    //REGISTRY------------------------------------------------------------------------//

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ZeldaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ZeldaMod.LOGGER.debug("Registering Mod Items for " + ZeldaMod.MOD_ID);
    }
}
