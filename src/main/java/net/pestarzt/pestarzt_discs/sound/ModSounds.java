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
    public static final RegistryObject<SoundEvent> SeaOfCum = registerSoundEvent("seaofcum");
    public static final RegistryObject<SoundEvent> BadGay = registerSoundEvent("badgay");
    public static final RegistryObject<SoundEvent> Password1488 = registerSoundEvent("password1488");
    public static final RegistryObject<SoundEvent> Gachi_burger = registerSoundEvent("gachi_burger");
    public static final RegistryObject<SoundEvent> Gay_shit = registerSoundEvent("gay_shit");
    public static final RegistryObject<SoundEvent> Homo_mode = registerSoundEvent("homo_mode");
    public static final RegistryObject<SoundEvent> Mirror = registerSoundEvent("mirror");
    public static final RegistryObject<SoundEvent> Dancer = registerSoundEvent("dancer");
    public static final RegistryObject<SoundEvent> Black_anal = registerSoundEvent("black_anal");
    public static final RegistryObject<SoundEvent> Elproblemo = registerSoundEvent("elproblemo");
    public static final RegistryObject<SoundEvent> RidingOnGayParty = registerSoundEvent("riding_on_gay_party");
    public static final RegistryObject<SoundEvent> ForTheCash = registerSoundEvent("forthecash");
    public static final RegistryObject<SoundEvent> Asphalt8 = registerSoundEvent("asphalt8");
    public static final RegistryObject<SoundEvent> OnTheDick = registerSoundEvent("onthedick");
    public static final RegistryObject<SoundEvent> GayNoMo = registerSoundEvent("gaynomo");
    public static final RegistryObject<SoundEvent> CumEater = registerSoundEvent("cumeater");
    public static final RegistryObject<SoundEvent> Pidazino = registerSoundEvent("pidazino");
    public static final RegistryObject<SoundEvent> LadyPidor = registerSoundEvent("ladypidor");
    public static final RegistryObject<SoundEvent> DontDancing = registerSoundEvent("dontdancing");
    public static final RegistryObject<SoundEvent> HauntedPidor = registerSoundEvent("hauntedpidor");


    public static final ForgeSoundType WOOD_SOUNDS = new ForgeSoundType(1f,1f,ModSounds.WOOD_BREAKING,ModSounds.WOOD_WALK,ModSounds.WOOD_PLACE,ModSounds.WOOD_HIT,ModSounds.WOOD_WALK);
    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        ResourceLocation id = new ResourceLocation(PestArzt_Discs.MOD_ID,name);
        return SOUND_EVENTS.register(name,()->new SoundEvent(id));
    }
    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
