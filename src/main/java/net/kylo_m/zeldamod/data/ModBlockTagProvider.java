package net.kylo_m.zeldamod.data;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        //TOOLS
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.TUNGSTEN_ORE)
                .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.ZONAITE_ORE)
                .add(ModBlocks.DEEPSLATE_ZONAITE_ORE)
                .add(ModBlocks.AMBER_ORE)
                .add(ModBlocks.AMBER_BLOCK)
                .add(ModBlocks.OPAL_ORE)
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.TOPAZ_ORE)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.LUMINOUS_STONE_BLOCK);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.MALICE_BLOCK);

        //MINING LEVELS
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LUMINOUS_STONE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ZONAITE_ORE)
                .add(ModBlocks.DEEPSLATE_ZONAITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TUNGSTEN_ORE)
                .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.TUNGSTEN_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")))
                .add(ModBlocks.MALICE_BLOCK);

    }
}
