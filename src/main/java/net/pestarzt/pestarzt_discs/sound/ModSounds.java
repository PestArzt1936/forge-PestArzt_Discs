package net.pestarzt.pestarzt_discs.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pestarzt.pestarzt_discs.PestArzt_Discs;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PestArzt_Discs.MOD_ID);
    public static final RegistryObject<SoundEvent> WOOD_BREAKING = registerSoundEvent("wood_breaking");
    public static final RegistryObject<SoundEvent> WOOD_WALK = registerSoundEvent("wood_walk");
    public static final RegistryObject<SoundEvent> WOOD_PLACE = registerSoundEvent("wood_place");
    public static final RegistryObject<SoundEvent> WOOD_HIT = registerSoundEvent("wood_hit");

    public static final ForgeSoundType WOOD_SOUNDS = new ForgeSoundType(1f,1f,ModSounds.WOOD_BREAKING,ModSounds.WOOD_WALK,ModSounds.WOOD_PLACE,ModSounds.WOOD_HIT,ModSounds.WOOD_WALK);
    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        ResourceLocation id = new ResourceLocation(PestArzt_Discs.MOD_ID,name);
        return SOUND_EVENTS.register(name,()->new SoundEvent(id));
    }
    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
