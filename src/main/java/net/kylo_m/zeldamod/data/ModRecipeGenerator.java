package net.kylo_m.zeldamod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //SMELTING RECIPES-----------------------------------------------------------------------//

        //Silver
        offerSmelting(exporter, List.of(ModItems.RAW_SILVER), RecipeCategory.MISC, ModItems.SILVER_INGOT,
                0.7f, 200, "silver_ingot");
        //Tungsten
        offerSmelting(exporter, List.of(ModItems.RAW_TUNGSTEN), RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                0.7f, 200, "tungsten_ingot");

        //FOOD RECIPES------------------------------------------------------------------------------------------------//



        //REVERSIBLE COMPACTING RECIPES----------------------------------------------------------------------------------------------------------------------//

        //Silver
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SILVER_BLOCK);
        //Tungsten
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TUNGSTEN_INGOT, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.TUNGSTEN_BLOCK);



        //SHAPELESS RECIPES------------------------------------------------------------------------------------------------------------------------------------//

        //FOOD RECIPES------------------------------------------------------------------------------------------------//

        //Egg Pudding
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.EGG_PUDDING, 1)
                .input(Items.EGG)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .criterion(FabricRecipeProvider.hasItem(Items.EGG),
                        FabricRecipeProvider.conditionsFromItem(Items.EGG))
                .criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .offerTo(exporter);

        //Egg Tart
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.EGG_TART, 1)
                .input(Items.EGG)
                .input(ModItems.BUTTER)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(FabricRecipeProvider.hasItem(Items.EGG),
                        FabricRecipeProvider.conditionsFromItem(Items.EGG))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .offerTo(exporter);

        //Monster Stew
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MONSTER_STEW, 1)
                .input(Items.RED_MUSHROOM)
                .input(ModItems.MONSTER_EXTRACT)
                .input(Items.BROWN_MUSHROOM)
                .input(Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.RED_MUSHROOM),
                        FabricRecipeProvider.conditionsFromItem(Items.RED_MUSHROOM))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MONSTER_EXTRACT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MONSTER_EXTRACT))
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        FabricRecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter);

        //Monster Curry
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MONSTER_CURRY, 1)
                .input(ModItems.MONSTER_EXTRACT)
                .input(ModItems.GORON_SPICE)
                .input(ModItems.RICE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MONSTER_EXTRACT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MONSTER_EXTRACT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.GORON_SPICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GORON_SPICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .offerTo(exporter);

        //Monster Rice Balls
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MONSTER_RICE_BALLS, 1)
                .input(ModItems.MONSTER_EXTRACT)
                .input(ModItems.ROCK_SALT)
                .input(ModItems.RICE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MONSTER_EXTRACT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MONSTER_EXTRACT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .offerTo(exporter);




        //SHAPED RECIPES------------------------------------------------------------------------------------------------------------------------------------//

        //Brightbloom Torch
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.BRIGHTBLOOM_TORCH_ITEM, 1)
                .pattern("B  ")
                .pattern("S  ")
                .input('B', ModItems.BRIGHTBLOOM_SEEDS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BRIGHTBLOOM_SEEDS),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BRIGHTBLOOM_SEEDS))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        //FOOD RECIPES------------------------------------------------------------------------------------------------//

        //Plain Crepe
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PLAIN_CREPE, 1)
                .pattern("WWW")
                .pattern("SME")
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('M', Items.MILK_BUCKET)
                .input('E', Items.EGG)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(Items.EGG),
                        FabricRecipeProvider.conditionsFromItem(Items.EGG))
                .offerTo(exporter);

        //Apple Pie
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.APPLE_PIE,1)
                .pattern("WWW")
                .pattern("AAA")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('B', ModItems.BUTTER)
                .input('A', Items.APPLE)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.APPLE),
                        FabricRecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter);

        //Carrot Cake
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CARROT_CAKE, 1)
                .pattern("WWW")
                .pattern("CCC")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('B', ModItems.BUTTER)
                .input('C', Items.CARROT)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.CARROT),
                        FabricRecipeProvider.conditionsFromItem(Items.CARROT))
                .offerTo(exporter);

        //Fish Pie (COD)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FISH_PIE, 1)
                .pattern("WWW")
                .pattern("MMM")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', ModItems.ROCK_SALT)
                .input('B', ModItems.BUTTER)
                .input('M', Items.COOKED_COD)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_COD),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_COD))
                .offerTo(exporter);

        //Fish Pie (SALMON)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FISH_PIE, 1)
                .pattern("WWW")
                .pattern("MMM")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', ModItems.ROCK_SALT)
                .input('B', ModItems.BUTTER)
                .input('M', Items.COOKED_SALMON)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
               .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_SALMON),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_SALMON))
                .offerTo(exporter, new Identifier("fish_pie_salmon"));

        //Fruit Cake
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FRUIT_CAKE)
                .pattern("WWW")
                .pattern("FFF")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('B', ModItems.BUTTER)
                .input('F', Items.SWEET_BERRIES)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.SWEET_BERRIES),
                        FabricRecipeProvider.conditionsFromItem(Items.SWEET_BERRIES))
                .offerTo(exporter);

        //Monster Cake
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MONSTER_CAKE)
                .pattern("WWW")
                .pattern("MMM")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('B', ModItems.BUTTER)
                .input('M', ModItems.MONSTER_EXTRACT)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MONSTER_EXTRACT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MONSTER_EXTRACT))
                .offerTo(exporter);

        //Meat Skewer (BEEF)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MEAT_SKEWER)
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" S ")
                .input('B', Items.COOKED_BEEF)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_BEEF),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_BEEF))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        //Meat Skewer (PORK)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MEAT_SKEWER)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" S ")
                .input('P', Items.COOKED_PORKCHOP)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_PORKCHOP),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_PORKCHOP))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("meat_skewer_pork"));

        //Meat Skewer (Mutton)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MEAT_SKEWER)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .input('M', Items.COOKED_MUTTON)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_MUTTON),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_MUTTON))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("meat_skewer_mutton"));

        //Mushroom Skewer
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MUSHROOM_SKEWER)
                .pattern(" B ")
                .pattern(" R ")
                .pattern(" S ")
                .input('B', Items.BROWN_MUSHROOM)
                .input('R', Items.RED_MUSHROOM)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        FabricRecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
                .criterion(FabricRecipeProvider.hasItem(Items.RED_MUSHROOM),
                        FabricRecipeProvider.conditionsFromItem(Items.RED_MUSHROOM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        //Fish Skewer (Cod)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FISH_SKEWER)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('C', Items.COOKED_COD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_COD),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_COD))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        //Fish Skewer (Salmon)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FISH_SKEWER)
                .pattern(" F ")
                .pattern(" F ")
                .pattern(" S ")
                .input('F', Items.COOKED_SALMON)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_SALMON),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_SALMON))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier("fish_skewer_salmon"));

        //Meat Pie (BEEF)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MEAT_PIE)
                .pattern("WWW")
                .pattern("MMM")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', ModItems.ROCK_SALT)
                .input('B', ModItems.BUTTER)
                .input('M', Items.COOKED_BEEF)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_BEEF),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MEAT_PIE)));

        //Meat Pie (PORK)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MEAT_PIE)
                .pattern("WWW")
                .pattern("MMM")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', ModItems.ROCK_SALT)
                .input('B', ModItems.BUTTER)
                .input('M', Items.COOKED_PORKCHOP)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_PORKCHOP),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_PORKCHOP))
                .offerTo(exporter, new Identifier("meat_pie_pork"));

        //Meat Pie (MUTTON)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MEAT_PIE)
                .pattern("WWW")
                .pattern("MMM")
                .pattern("SBS")
                .input('W', Items.WHEAT)
                .input('S', ModItems.ROCK_SALT)
                .input('B', ModItems.BUTTER)
                .input('M', Items.COOKED_MUTTON)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_MUTTON),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_MUTTON))
                .offerTo(exporter, new Identifier("meat_pie_mutton"));

        //Radish Soup
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RADISH_SOUP)
                .pattern("MRM")
                .pattern(" B ")
                .input('M', Items.MILK_BUCKET)
                .input('R', ModItems.RADISH)
                .input('B', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RADISH),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RADISH))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter);

        //Pumpkin Stew
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PUMPKIN_STEW)
                .pattern(" W ")
                .pattern("MPB")
                .pattern(" C ")
                .input('W', Items.WHEAT)
                .input('M', Items.MILK_BUCKET)
                .input('P', Items.PUMPKIN)
                .input('B', ModItems.BUTTER)
                .input('C', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                        FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(Items.PUMPKIN),
                        FabricRecipeProvider.conditionsFromItem(Items.PUMPKIN))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter);

        //Vegetable Risotto (Carrot)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.VEGETABLE_RISOTTO)
                .pattern(" C ")
                .pattern("SRB")
                .pattern(" # ")
                .input('C', Items.CARROT)
                .input('S', ModItems.ROCK_SALT)
                .input('R', ModItems.RICE)
                .input('B', ModItems.BUTTER)
                .input('#', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.CARROT),
                        FabricRecipeProvider.conditionsFromItem(Items.CARROT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter);

        //Vegetable Risotto (Beetroot)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.VEGETABLE_RISOTTO)
                .pattern(" V ")
                .pattern("SRB")
                .pattern(" # ")
                .input('V', Items.BEETROOT)
                .input('S', ModItems.ROCK_SALT)
                .input('R', ModItems.RICE)
                .input('B', ModItems.BUTTER)
                .input('#', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.BEETROOT),
                        FabricRecipeProvider.conditionsFromItem(Items.BEETROOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier("vegetable_risotto_beetroot"));

        //Vegetable Risotto (Radish)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.VEGETABLE_RISOTTO)
                .pattern(" V ")
                .pattern("SRB")
                .pattern(" # ")
                .input('V', ModItems.RADISH)
                .input('S', ModItems.ROCK_SALT)
                .input('R', ModItems.RICE)
                .input('B', ModItems.BUTTER)
                .input('#', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RADISH),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RADISH))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier("vegetable_risotto_radish"));

        //Mushroom Risotto (Brown)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MUSHROOM_RISOTTO)
                .pattern(" V ")
                .pattern("SRB")
                .pattern(" # ")
                .input('V', Items.BROWN_MUSHROOM)
                .input('S', ModItems.ROCK_SALT)
                .input('R', ModItems.RICE)
                .input('B', ModItems.BUTTER)
                .input('#', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        FabricRecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter);

        //Mushroom Risotto (Red)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MUSHROOM_RISOTTO)
                .pattern(" V ")
                .pattern("SRB")
                .pattern(" # ")
                .input('V', Items.RED_MUSHROOM)
                .input('S', ModItems.ROCK_SALT)
                .input('R', ModItems.RICE)
                .input('B', ModItems.BUTTER)
                .input('#', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.RED_MUSHROOM),
                        FabricRecipeProvider.conditionsFromItem(Items.RED_MUSHROOM))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier("mushroom_risotto_red_mushroom"));

        //Salmon Risotto
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SALMON_RISOTTO)
                .pattern(" V ")
                .pattern("SRB")
                .pattern(" # ")
                .input('V', Items.COOKED_SALMON)
                .input('S', ModItems.ROCK_SALT)
                .input('R', ModItems.RICE)
                .input('B', ModItems.BUTTER)
                .input('#', Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(Items.COOKED_SALMON),
                        FabricRecipeProvider.conditionsFromItem(Items.COOKED_SALMON))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROCK_SALT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ROCK_SALT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RICE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RICE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BOWL),
                        FabricRecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter);

        //Dubious Food (Rotten Flesh)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DUBIOUS_FOOD)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.ROTTEN_FLESH)
                .criterion(FabricRecipeProvider.hasItem(Items.ROTTEN_FLESH),
                        FabricRecipeProvider.conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter);

        //Dubious Food (BONE)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DUBIOUS_FOOD)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.BONE)
                .criterion(FabricRecipeProvider.hasItem(Items.BONE),
                        FabricRecipeProvider.conditionsFromItem(Items.BONE))
                .offerTo(exporter, new Identifier("dubious_food_bone"));

        //Dubious Food (SPIDER EYES)
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DUBIOUS_FOOD)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.SPIDER_EYE)
                .criterion(FabricRecipeProvider.hasItem(Items.SPIDER_EYE),
                        FabricRecipeProvider.conditionsFromItem(Items.SPIDER_EYE))
                .offerTo(exporter, new Identifier("dubious_food_spider_eye"));


        //Brightbloom Arrow
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRIGHTBLOOM_ARROW)
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .input('B', ModItems.BRIGHTBLOOM_SEEDS)
                .input('A', Items.ARROW)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BRIGHTBLOOM_SEEDS),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BRIGHTBLOOM_SEEDS))
                .criterion(FabricRecipeProvider.hasItem(Items.ARROW),
                        FabricRecipeProvider.conditionsFromItem(Items.ARROW))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BRIGHTBLOOM_ARROW)));

        //

        //TEMPLATE
        //ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_INGOT)
        //        .pattern("SSS")
        //        .pattern("SRS")
        //        .pattern("SSS")
        //        .input('S', Items.STONE)
        //        .input('R', ModItems.RAW_SILVER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.STONE),
        //                FabricRecipeProvider.conditionsFromItem(Items.STONE))
        //        .criterion(FabricRecipeProvider.hasItem(ModItems.RAW_SILVER),
        //                FabricRecipeProvider.conditionsFromItem(ModItems.RAW_SILVER))
        //        .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.SILVER_INGOT)));
    }
}
