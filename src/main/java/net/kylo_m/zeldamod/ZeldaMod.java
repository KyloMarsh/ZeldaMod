package net.kylo_m.zeldamod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.kylo_m.zeldamod.block.ModBlocks;
import net.kylo_m.zeldamod.block.ModFlammableBlockRegistry;
import net.kylo_m.zeldamod.entity.ModEntities;
import net.kylo_m.zeldamod.entity.custom.HylianEntity;
import net.kylo_m.zeldamod.item.ModItemGroup;
import net.kylo_m.zeldamod.item.ModItems;
import net.kylo_m.zeldamod.particle.ModParticleTypes;
import net.kylo_m.zeldamod.sound.ModSounds;
import net.kylo_m.zeldamod.util.ModLootTableModifiers;
import net.kylo_m.zeldamod.world.ModConfiguredFeatures;
import net.kylo_m.zeldamod.world.gen.ModWorldGeneration;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class ZeldaMod implements ModInitializer {
	public static final String MOD_ID = "zeldamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	//Instrument Sounds
	public static final Identifier SONG_OF_TIME = new Identifier("zeldamod:song_of_time");
	public static final Identifier SONG_OF_STORMS = new Identifier("zeldamod:song_of_storms");
	public static final Identifier CALL_LOFTWING = new Identifier("zeldamod:call_loftwing");
	public static final Identifier BALLAD_OF_GALES = new Identifier("zeldamod:ballad_of_gales");
	public static final Identifier BALLAD_OF_THE_GODDESS = new Identifier("zeldamod:ballad_of_the_goddess");
	public static final Identifier SAILCLOTH_SOUND = new Identifier("zeldamod:sailcloth_sound");
	public static final Identifier SONG_OF_DISCOVERY = new Identifier("zeldamod:song_of_discovery");
	public static final Identifier MAJORAS_LAUGH = new Identifier("zeldamod:majoras_laugh");



	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModParticleTypes.registerParticles();


		ModLootTableModifiers.modifyLootTables();

		GeckoLib.initialize();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlocks();

		StrippableBlockRegistry.register(ModBlocks.SKY_OAK_LOG, ModBlocks.STRIPPED_SKY_OAK_LOG);
		StrippableBlockRegistry.register(ModBlocks.SKY_OAK_WOOD, ModBlocks.STRIPPED_SKY_OAK_WOOD);

		FabricDefaultAttributeRegistry.register(ModEntities.HYLIAN, HylianEntity.setAttributes());

	}
}
