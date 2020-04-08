package mod.equinox.buildbasics.registry;

import com.google.common.base.Supplier;

import mod.equinox.buildbasics.Config;
import mod.equinox.buildbasics.registry.BlockRegistry;
import mod.equinox.buildbasics.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;

/**
 * @credit - bageldotjpg
 */

public class BlockUtilities {

    public static <I extends Item> RegistryObject<I> createItem(String name, Supplier<? extends I> supplier) {
        RegistryObject<I> item = ItemRegistry.ITEMS.register(name, supplier);
        return item;
    }


    public static BlockItem createSimpleItemBlock(Block block, ItemGroup itemGroup) {
        return (BlockItem) new BlockItem(block, new Item.Properties().group(itemGroup)).setRegistryName(block.getRegistryName());
    }

    public static <B extends Block> RegistryObject<B> createBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = BlockRegistry.BLOCKS.register(name, supplier);
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
        return block;
    }

    public static <B extends Block> RegistryObject<B> createBlockConfig(String config, String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        if((config.equals("candles") && Config.QUARK_CANDLES.get()) || (config.equals("bricks") && Config.QUARK_STONE_BRICK_TYPES.get()) || (config.equals("small_bricks") && Config.QUARK_SMALL_STONE_BRICK_TYPES.get())) {
            RegistryObject<B> block = BlockRegistry.BLOCKS.register(name, supplier);
            ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
            return block;
        }
        else {return null;}
    }

    public static <B extends Block> RegistryObject<B> createBlockCompat(String mod, String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        if(ModList.get().isLoaded(mod)) {
            RegistryObject<B> block = BlockRegistry.BLOCKS.register(name, supplier);
            ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
            return block;
        }
        return null;
    }

    public static <B extends Block> RegistryObject<B> createBlockNoItem(String name, Supplier<? extends B> supplier) {
        RegistryObject<B> block = BlockRegistry.BLOCKS.register(name, supplier);
        return block;
    }

}