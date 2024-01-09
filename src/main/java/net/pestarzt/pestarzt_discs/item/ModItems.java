package net.pestarzt.pestarzt_discs.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pestarzt.pestarzt_discs.PestArzt_Discs;
import net.pestarzt.pestarzt_discs.item.custom.badgay;
import net.pestarzt.pestarzt_discs.item.custom.seaofcum;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PestArzt_Discs.MOD_ID);

    public static final RegistryObject<Item> BadGay = ITEMS.register("badgay",
            ()->new badgay(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB)));
    public static final RegistryObject<Item> SeaOfCum = ITEMS.register("seaofcum",
            ()->new seaofcum(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.PESTARZT_TAB)));
    public static final RegistryObject<Item> DiscHolder = ITEMS.register("discholder",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.PESTARZT_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
