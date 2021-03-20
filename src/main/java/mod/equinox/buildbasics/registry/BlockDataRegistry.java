package mod.equinox.buildbasics.registry;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.ModList;

/**
 * @credit - bageldotjpg
 */

public class BlockDataRegistry {
    public static void registerFlammables() {
        //BlockDataUtilities.isFlammable(BlockRegistry.OAK_BOARDS.get(), 5, 20);
    }

    public static void setRenderLayers() {
        RenderType cutout = RenderType.getCutout();
        RenderType translucent = RenderType.getTranslucent();

        BlockDataUtilities.setRenderLayer(BlockRegistry.IRON_CHAIN.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.WALL_LANTERN.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.GOLD_LANTERN.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.GOLD_WALL_LANTERN.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.GOLD_CHAIN.get(), cutout);

        BlockDataUtilities.setRenderLayer(BlockRegistry.GLASS_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.OAK_GLASS_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.SPRUCE_GLASS_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.BIRCH_GLASS_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.JUNGLE_GLASS_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.ACACIA_GLASS_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.DARK_OAK_GLASS_DOOR.get(), cutout);
        if(ModList.get().isLoaded("upgrade_aquatic")) { BlockDataUtilities.setRenderLayer(BlockRegistry.DRIFTWOOD_GLASS_DOOR.get(), cutout); }
        if(ModList.get().isLoaded("bloomful")) { BlockDataUtilities.setRenderLayer(BlockRegistry.WISTERIA_GLASS_DOOR.get(), cutout); }
        BlockDataUtilities.setRenderLayer(BlockRegistry.IRON_GLASS_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.IRON_BAR_DOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.GLASS_TRAPDOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.OAK_GLASS_TRAPDOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.SPRUCE_GLASS_TRAPDOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.BIRCH_GLASS_TRAPDOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.JUNGLE_GLASS_TRAPDOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.ACACIA_GLASS_TRAPDOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.DARK_OAK_GLASS_TRAPDOOR.get(), cutout);
        if(ModList.get().isLoaded("upgrade_aquatic")) { BlockDataUtilities.setRenderLayer(BlockRegistry.DRIFTWOOD_GLASS_TRAPDOOR.get(), cutout); }
        if(ModList.get().isLoaded("bloomful")) { BlockDataUtilities.setRenderLayer(BlockRegistry.WISTERIA_GLASS_TRAPDOOR.get(), cutout); }
        BlockDataUtilities.setRenderLayer(BlockRegistry.IRON_GLASS_TRAPDOOR.get(), cutout);
        BlockDataUtilities.setRenderLayer(BlockRegistry.IRON_BAR_TRAPDOOR.get(), cutout);
    }
}