package net.pestarzt.pestarzt_discs.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pestarzt.pestarzt_discs.PestArzt_Discs;
import net.pestarzt.pestarzt_discs.block.custom.DoesntWorkBlock;
import net.pestarzt.pestarzt_discs.block.custom.DoesntWorkBlock;
import net.pestarzt.pestarzt_discs.item.ModCreativeModeTab;
import net.pestarzt.pestarzt_discs.item.ModItems;
import net.pestarzt.pestarzt_discs.sound.ModSounds;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PestArzt_Discs.MOD_ID);
    public static final RegistryObject<Block> DiscCrafter = registerBlock("disc_workbench",
            ()->new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(ModSounds.WOOD_SOUNDS).strength(1f)),
            ModCreativeModeTab.PESTARZT_TAB);
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block,CreativeModeTab tab){
        return ModItems.ITEMS.register(name,()->new DoesntWorkBlock(block.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
