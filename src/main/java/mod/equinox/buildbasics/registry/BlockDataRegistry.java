package mod.equinox.buildbasics.registry;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

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

        RenderTypeLookup.setRenderLayer(BlockRegistry.IRON_CHAIN.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.WALL_LANTERN.get(), cutout);

        RenderTypeLookup.setRenderLayer(BlockRegistry.GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.OAK_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.SPRUCE_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.BIRCH_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.JUNGLE_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.ACACIA_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.DARK_OAK_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.DRIFTWOOD_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.WISTERIA_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.IRON_GLASS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.IRON_BAR_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.OAK_GLASS_TRAPDOOR .get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.SPRUCE_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.BIRCH_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.JUNGLE_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.ACACIA_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.DARK_OAK_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.DRIFTWOOD_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.WISTERIA_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.IRON_GLASS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(BlockRegistry.IRON_BAR_TRAPDOOR.get(), cutout);
    }
}