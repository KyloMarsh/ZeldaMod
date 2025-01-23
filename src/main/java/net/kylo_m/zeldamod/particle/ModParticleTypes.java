package net.kylo_m.zeldamod.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.kylo_m.zeldamod.ZeldaMod;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.lwjgl.system.SharedLibrary;

public class ModParticleTypes {

    public static final DefaultParticleType BRIGHTBLOOM_FLAME = registerParticle("brightbloom_flame", FabricParticleTypes.simple());

    public static DefaultParticleType registerParticle(String name, DefaultParticleType particleType){
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(ZeldaMod.MOD_ID, name), particleType);
    }





    public static void registerParticles(){

    }

}
