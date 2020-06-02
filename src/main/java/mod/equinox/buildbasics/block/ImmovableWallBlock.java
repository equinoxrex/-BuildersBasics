package mod.equinox.buildbasics.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.PushReaction;

public class ImmovableWallBlock extends WallBlock {
    public ImmovableWallBlock(Properties properties) {
        super(properties);
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }
}
