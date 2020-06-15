package mod.equinox.buildbasics.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class LineFrameBlock extends Block {
    public static final EnumProperty<EnumSide> SIDE = EnumProperty.create("side", EnumSide.class);

    public LineFrameBlock(Block.Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(SIDE, EnumSide.LEFT));
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getFace();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = this.getDefaultState();
        System.out.println(context.getPlacementHorizontalFacing());
        if (context.getPlacementHorizontalFacing() == Direction.SOUTH) {
            blockstate = blockstate.with(SIDE, context.getHitVec().x - (double) blockpos.getX() > 0.5D ? EnumSide.LEFT : EnumSide.RIGHT);
        }
        else if (context.getPlacementHorizontalFacing() == Direction.NORTH) {
            blockstate = blockstate.with(SIDE, context.getHitVec().x - (double) blockpos.getX() < 0.5D ? EnumSide.LEFT : EnumSide.RIGHT);
        }
        else if (context.getPlacementHorizontalFacing() == Direction.EAST) {
            blockstate = blockstate.with(SIDE, context.getHitVec().z - (double) blockpos.getZ() < 0.5D ? EnumSide.LEFT : EnumSide.RIGHT);
        }
        else if (context.getPlacementHorizontalFacing() == Direction.WEST) {
            blockstate = blockstate.with(SIDE, context.getHitVec().z - (double) blockpos.getZ() > 0.5D ? EnumSide.LEFT : EnumSide.RIGHT);
        }
        return blockstate;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) { builder.add(SIDE); }

}
