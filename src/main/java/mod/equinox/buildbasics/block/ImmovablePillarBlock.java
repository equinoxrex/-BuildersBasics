package mod.equinox.buildbasics.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.PushReaction;

public class ImmovablePillarBlock extends RotatedPillarBlock {
    public ImmovablePillarBlock(Properties properties) {
        super(properties);
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }
}
