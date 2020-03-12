package mod.equinox.buildbasics.registry;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.block.FireBlock;
import net.minecraft.util.IItemProvider;

public class DataUtilities {
    public static void isFlammable(Block block, int encouragement, int flammability) {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.setFireInfo(block, encouragement, flammability);
    }
}