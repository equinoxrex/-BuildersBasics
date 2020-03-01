package mod.equinox.buildbasics.registry;

import mod.equinox.buildbasics.BuildBasics;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BuildBasics.MODID);
}
