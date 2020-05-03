package mod.equinox.buildbasics.registry;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.ModList;

/**
 * @credit - bageldotjpg
 */

public class BlockDataUtilities {

    public static void isFlammable(Block block, int encouragement, int flammability) {
        FireBlock fire = (FireBlock)Blocks.FIRE;
        fire.setFireInfo(block, encouragement, flammability);
    }

    public static void setRenderLayer(Block block, RenderType rendertype){
        RenderTypeLookup.setRenderLayer(block, rendertype);
    }
}