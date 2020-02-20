package mod.equinox.buildbasics.block;

import javafx.geometry.Side;
import net.minecraft.block.*;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.*;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;
import java.util.stream.IntStream;

public class FirebrandBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<EnumPosition> POS = EnumProperty.create("position", EnumPosition.class);

    protected static final VoxelShape BRAND_TOP_NS = Block.makeCuboidShape(0.0D, 12.0D, 6.0D, 16.0D, 16.0D, 10.0D);
    protected static final VoxelShape BRAND_TOP_EW = Block.makeCuboidShape(6.0D, 12.0D, 0.0D, 10.0D, 16.0D, 16.0D);
    protected static final VoxelShape BRAND_BOTTOM_NS = Block.makeCuboidShape(0.0D, 0.0D, 6.0D, 16.0D, 4.0D, 10.0D);
    protected static final VoxelShape BRAND_BOTTOM_EW = Block.makeCuboidShape(6.0D, 0.0D, 0.0D, 10.0D, 4.0D, 16.0D);
    protected static final VoxelShape BRAND_LOWER_N = Block.makeCuboidShape(0.0D, 6.0D, 12.0D, 16.0D, 10.0D, 16.0D);
    protected static final VoxelShape BRAND_LOWER_S = Block.makeCuboidShape(0.0D, 6.0D, 0.0D, 16.0D, 10.0D, 4.0D);
    protected static final VoxelShape BRAND_LOWER_W = Block.makeCuboidShape(12.0D, 6.0D, 0.0D, 16.0D, 10.0D, 16.0D);
    protected static final VoxelShape BRAND_LOWER_E = Block.makeCuboidShape(0.0D, 6.0D, 0.0D, 4.0D, 10.0D, 16.0D);
    protected static final VoxelShape BRAND_UPPER_N = Block.makeCuboidShape(6.0D, 0.0D, 12.0D, 10.0D, 16.0D, 16.0D);
    protected static final VoxelShape BRAND_UPPER_S = Block.makeCuboidShape(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 4.0D);
    protected static final VoxelShape BRAND_UPPER_W = Block.makeCuboidShape(12.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
    protected static final VoxelShape BRAND_UPPER_E = Block.makeCuboidShape(0.0D, 0.0D, 6.0D, 4.0D, 16.0D, 10.0D);

    protected FirebrandBlock(Block.Properties builder) {
        super(builder);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(POS, EnumPosition.BOTTOM));
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     * @deprecated call via {@link IBlockState#withRotation(Rotation)} whenever possible. Implementing/overriding is
     * fine.
     */
    public BlockState rotate(BlockState state, Rotation facing) {
        return state.with(FACING, facing.rotate(state.get(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
     * blockstate.
     * @deprecated call via {@link IBlockState#withMirror(Mirror)} whenever possible. Implementing/overriding is fine.
     */
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.with(FACING, mirrorIn.mirror(state.get(FACING)));
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        VoxelShape shape = BRAND_BOTTOM_NS;
        if (state.get(POS) == EnumPosition.LOWER) {
            if (state.get(FACING).getHorizontalIndex() == 0) {
                shape = BRAND_LOWER_S;
            }
            else if (state.get(FACING).getHorizontalIndex() == 1) {
                shape = BRAND_LOWER_W;
            }
            else if (state.get(FACING).getHorizontalIndex() == 2) {
                shape = BRAND_LOWER_N;
            }
            else if (state.get(FACING).getHorizontalIndex() == 3) {
                shape = BRAND_LOWER_E;
            }
        }
        else if (state.get(POS) == EnumPosition.UPPER) {
            if (state.get(FACING).getHorizontalIndex() == 0) {
                shape = BRAND_UPPER_S;
            }
            else if (state.get(FACING).getHorizontalIndex() == 1) {
                shape = BRAND_UPPER_W;
            }
            else if (state.get(FACING).getHorizontalIndex() == 2) {
                shape = BRAND_UPPER_N;
            }
            else if (state.get(FACING).getHorizontalIndex() == 3) {
                shape = BRAND_UPPER_E;
            }
        }
        else if (state.get(POS) == EnumPosition.BOTTOM){
            if (state.get(FACING) == Direction.NORTH || state.get(FACING) == Direction.SOUTH) {
                shape = BRAND_BOTTOM_NS;
            }
            else if (state.get(FACING) == Direction.EAST || state.get(FACING) == Direction.WEST) {
                shape = BRAND_BOTTOM_EW;
            }
        }
        else {
            if (state.get(FACING) == Direction.NORTH || state.get(FACING) == Direction.SOUTH) {
                shape = BRAND_TOP_NS;
            }
            else if (state.get(FACING) == Direction.EAST || state.get(FACING) == Direction.WEST) {
                shape = BRAND_TOP_EW;
            }
        }
        return shape;
    }

    /*public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getFace();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = this.getDefaultState();
        if (direction == Direction.DOWN) {
                blockstate = blockstate.with(POS, EnumPosition.TOP).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        else if ((context.getHitVec().y - (double)blockpos.getY() < 0.5D) && (context.getHitVec().y - (double)blockpos.getY() > 0.0D) && (direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST)) {
            blockstate = blockstate.with(POS, EnumPosition.LOWER).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        else if ((context.getHitVec().y - (double)blockpos.getY() > 0.5D) && (context.getHitVec().y - (double)blockpos.getY() < 1.0D) && (direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST)) {
            blockstate = blockstate.with(POS, EnumPosition.UPPER).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        else {
            blockstate = blockstate.with(POS, EnumPosition.BOTTOM).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        return blockstate;
    }*/

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getFace();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = this.getDefaultState();
        if (direction == Direction.DOWN) {
            blockstate = blockstate.with(POS, EnumPosition.TOP).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        else if ((context.getHitVec().y - (double)blockpos.getY() < 0.5D) && (context.getHitVec().y - (double)blockpos.getY() > 0.0D) && (direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST)) {
            blockstate = blockstate.with(POS, EnumPosition.LOWER).with(FACING, direction);
        }
        else if ((context.getHitVec().y - (double)blockpos.getY() > 0.5D) && (context.getHitVec().y - (double)blockpos.getY() < 1.0D) && (direction == Direction.NORTH || direction == Direction.EAST || direction == Direction.SOUTH || direction == Direction.WEST)) {
            blockstate = blockstate.with(POS, EnumPosition.UPPER).with(FACING, direction);
        }
        else {
            blockstate = blockstate.with(POS, EnumPosition.BOTTOM).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        return blockstate;
    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
     * this method is unrelated to {@link randomTick} and {@link #needsRandomTick}, and will always be called regardless
     * of whether the block can receive random update ticks
     */
    /*@OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        Direction direction = stateIn.get(FACING);
        double d0 = (double)pos.getX() + 0.5D - (double)(rand.nextFloat() * 0.1F);
        double d1 = (double)pos.getY() + 0.5D - (double)(rand.nextFloat() * 0.1F);
        double d2 = (double)pos.getZ() + 0.5D - (double)(rand.nextFloat() * 0.1F);
        double d3 = (double)(0.4F - (rand.nextFloat() + rand.nextFloat()) * 0.4F);
        if (rand.nextInt(5) == 0) {
            worldIn.addParticle(ParticleTypes.FLAME, d0 + (double)direction.getXOffset() * d3, d1 + (double)direction.getYOffset() * d3, d2 + (double)direction.getZOffset() * d3, rand.nextGaussian() * 0.005D, rand.nextGaussian() * 0.005D, rand.nextGaussian() * 0.005D);
        }

    }*/

    /**
     * Gets the render layer this block will render on. SOLID for solid blocks, CUTOUT or CUTOUT_MIPPED for on-off
     * transparency (glass, reeds), TRANSLUCENT for fully blended transparency (stained glass)
     */
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, POS);
    }

    /**
     * @deprecated call via {@link IBlockState#getMobilityFlag()} whenever possible. Implementing/overriding is fine.
     */
    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.NORMAL;
    }
}