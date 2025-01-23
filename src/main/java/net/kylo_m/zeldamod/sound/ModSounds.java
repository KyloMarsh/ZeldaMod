package net.kylo_m.zeldamod.sound;

import net.kylo_m.zeldamod.ZeldaMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    //Instrument Sounds
    public static SoundEvent SONG_OF_TIME = registerModSounds("song_of_time");
    public static SoundEvent SONG_OF_STORMS = registerModSounds("song_of_storms");
    public static SoundEvent CALL_LOFTWING = registerModSounds("call_loftwing");
    public static SoundEvent BALLAD_OF_GALES = registerModSounds("ballad_of_gales");
    public static SoundEvent BALLAD_OF_THE_GODDESS = registerModSounds("ballad_of_the_goddess");
    public static SoundEvent SAILCLOTH_SOUND = registerModSounds("sailcloth_sound");
    public static SoundEvent SONG_OF_DISCOVERY = registerModSounds("song_of_discovery");
    public static SoundEvent MAJORAS_LAUGH = registerModSounds("majoras_laugh");

    private static SoundEvent registerModSounds(String name) {
        Identifier id = new Identifier(ZeldaMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}


