package net.pestarzt.pestarzt_discs.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pestarzt.pestarzt_discs.PestArzt_Discs;
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
    public static final RegistryObject<Item> DiscHolder = ITEMS.register("discholder",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.PESTARZT_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
