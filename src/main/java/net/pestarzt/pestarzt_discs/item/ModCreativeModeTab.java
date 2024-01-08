package net.pestarzt.pestarzt_discs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PESTARZT_TAB = new CreativeModeTab("PestArzt's discs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SeaOfCum.get());
        }
    };
}
