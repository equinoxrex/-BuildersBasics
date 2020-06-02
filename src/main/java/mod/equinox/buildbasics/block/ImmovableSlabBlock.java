package mod.equinox.buildbasics.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.PushReaction;

public class ImmovableSlabBlock extends SlabBlock {
    public ImmovableSlabBlock(Properties properties) {
        super(properties);
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }
}
