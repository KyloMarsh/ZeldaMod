package net.kylo_m.zeldamod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.kylo_m.zeldamod.ZeldaMod;
import net.kylo_m.zeldamod.entity.custom.HylianEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<HylianEntity> HYLIAN = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(ZeldaMod.MOD_ID, "hylian"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HylianEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());

}
