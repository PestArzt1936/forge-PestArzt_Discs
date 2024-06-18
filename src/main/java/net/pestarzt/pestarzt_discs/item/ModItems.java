package net.pestarzt.pestarzt_discs.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pestarzt.pestarzt_discs.PestArzt_Discs;
import net.pestarzt.pestarzt_discs.item.custom.DoesntWork;
import net.pestarzt.pestarzt_discs.sound.ModSounds;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PestArzt_Discs.MOD_ID);

    public static final RegistryObject<Item> BadGay = ITEMS.register("badgay",
            ()->new RecordItem(8,ModSounds.BadGay,new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2700));
    public static final RegistryObject<Item> SeaOfCum = ITEMS.register("seaofcum",
            ()->new RecordItem(8, ModSounds.SeaOfCum, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2500));
    public static final RegistryObject<Item> Password1488 = ITEMS.register("password1488",
            ()->new RecordItem(8, ModSounds.Password1488, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2480));
    public static final RegistryObject<Item> Gachi_burger = ITEMS.register("gachi_burger",
            ()->new RecordItem(8, ModSounds.Gachi_burger, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2780));
    public static final RegistryObject<Item> Gay_shit = ITEMS.register("gay_shit",
            ()->new RecordItem(8, ModSounds.Gay_shit, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),1480));
    public static final RegistryObject<Item> Homo_mode = ITEMS.register("homo_mode",
            ()->new RecordItem(8, ModSounds.Homo_mode, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),4720));
    public static final RegistryObject<Item> Mirror = ITEMS.register("mirror",
            ()->new RecordItem(8, ModSounds.Mirror, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),3040));
    public static final RegistryObject<Item> Dancer = ITEMS.register("dancer",
            ()->new RecordItem(8, ModSounds.Dancer, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),3040));
    public static final RegistryObject<Item> Black_anal = ITEMS.register("black_anal",
            ()->new RecordItem(8, ModSounds.Black_anal, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),4880));
    public static final RegistryObject<Item> Elproblemo = ITEMS.register("elproblemo",
            ()->new RecordItem(8, ModSounds.Elproblemo, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2780));
    public static final RegistryObject<Item> RidingOnGayParty = ITEMS.register("riding_on_gay_party",
            ()->new RecordItem(8, ModSounds.RidingOnGayParty, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),3640));
    public static final RegistryObject<Item> ForTheCash = ITEMS.register("forthecash",
            ()->new RecordItem(8, ModSounds.ForTheCash, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2420));
    public static final RegistryObject<Item> Asphalt8 = ITEMS.register("asphalt8",
            ()->new RecordItem(8, ModSounds.Asphalt8, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2720));
    public static final RegistryObject<Item> OnTheDick = ITEMS.register("onthedick",
            ()->new RecordItem(8, ModSounds.OnTheDick, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2540));
    public static final RegistryObject<Item> GayNoMo = ITEMS.register("gaynomo",
            ()->new RecordItem(8, ModSounds.GayNoMo, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2360));
    public static final RegistryObject<Item> CumEater = ITEMS.register("cumeater",
            ()->new RecordItem(8, ModSounds.CumEater, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2700));
    public static final RegistryObject<Item> Pidazino = ITEMS.register("pidazino",
            ()->new RecordItem(8, ModSounds.Pidazino, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),1000));
    public static final RegistryObject<Item> LadyPidor = ITEMS.register("ladypidor",
            ()->new RecordItem(8, ModSounds.LadyPidor, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),4600));
    public static final RegistryObject<Item> DontDancing = ITEMS.register("dontdancing",
            ()->new RecordItem(8, ModSounds.DontDancing, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),3820));
    public static final RegistryObject<Item> HauntedPidor = ITEMS.register("hauntedpidor",
            ()->new RecordItem(8, ModSounds.HauntedPidor, new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB),2800));
    public static final RegistryObject<Item> DiscHolder = ITEMS.register("discholder",
            ()->new DoesntWork(new Item.Properties().tab(ModCreativeModeTab.PESTARZT_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
