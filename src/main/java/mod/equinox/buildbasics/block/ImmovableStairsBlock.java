package mod.equinox.buildbasics.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.PushReaction;
import java.util.function.Supplier;

public class ImmovableStairsBlock extends StairsBlock {
    public ImmovableStairsBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }
}
