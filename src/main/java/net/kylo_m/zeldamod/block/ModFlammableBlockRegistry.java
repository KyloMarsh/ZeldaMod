package net.kylo_m.zeldamod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {

    public static void registerFlammableBlocks(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.SKY_OAK_LOG, 5, 5);
        registry.add(ModBlocks.SKY_OAK_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_SKY_OAK_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_SKY_OAK_WOOD, 5, 5);

        registry.add(ModBlocks.SKY_OAK_PLANKS, 5, 20);
        registry.add(ModBlocks.SKY_OAK_LEAVES, 30, 60);
    }

}
