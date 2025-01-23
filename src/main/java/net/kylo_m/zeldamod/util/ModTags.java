package net.kylo_m.zeldamod.util;

import net.kylo_m.zeldamod.ZeldaMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModTags {

    public static class Blocks {



        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(ZeldaMod.MOD_ID, name));
        }
    }

    public static class Items {



        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ZeldaMod.MOD_ID, name));
        }
    }

}
