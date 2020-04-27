package mod.equinox.buildbasics.block;

import java.util.Random;

import mod.equinox.buildbasics.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CandlestickBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.FACING_EXCEPT_UP;
    public static final EnumProperty<EnumCandle> CANDLE = EnumProperty.create("candle", EnumCandle.class);

    protected static final VoxelShape SHAPE_STICK_N = Block.makeCuboidShape(6.0D, 2.0D, 11.0D, 10.0D, 6.0D, 16.0D);
    protected static final VoxelShape SHAPE_CANDLE_N = Block.makeCuboidShape(6.0D, 2.0D, 11.0D, 10.0D, 12.0D, 16.0D);
    protected static final VoxelShape SHAPE_STICK_S = Block.makeCuboidShape(6.0D, 2.0D, 0.0D, 10.0D, 6.0D, 5.0D);
    protected static final VoxelShape SHAPE_CANDLE_S = Block.makeCuboidShape(6.0D, 2.0D, 0.0D, 10.0D, 12.0D, 5.0D);
    protected static final VoxelShape SHAPE_STICK_W = Block.makeCuboidShape(11.0D, 2.0D, 6.0D, 16.0D, 6.0D, 10.0D);
    protected static final VoxelShape SHAPE_CANDLE_W = Block.makeCuboidShape(11.0D, 2.0D, 6.0D, 16.0D, 12.0D, 10.0D);
    protected static final VoxelShape SHAPE_STICK_E = Block.makeCuboidShape(0.0D, 2.0D, 6.0D, 5.0D, 6.0D, 10.0D);
    protected static final VoxelShape SHAPE_CANDLE_E = Block.makeCuboidShape(0.0D, 2.0D, 6.0D, 5.0D, 12.0D, 10.0D);
    protected static final VoxelShape SHAPE_STICK_FLOOR = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 5.0D, 10.0D);
    protected static final VoxelShape SHAPE_CANDLE_FLOOR = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 12.0D, 10.0D);

    public CandlestickBlock(Block.Properties builder) {
        super(builder);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.DOWN).with(CANDLE, EnumCandle.NONE));
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        if (state.get(FACING) == Direction.NORTH) { return state.get(CANDLE) == EnumCandle.NONE ? SHAPE_STICK_N: SHAPE_CANDLE_N; }
        else if (state.get(FACING) == Direction.EAST) { return state.get(CANDLE) == EnumCandle.NONE ? SHAPE_STICK_E: SHAPE_CANDLE_E; }
        else if (state.get(FACING) == Direction.SOUTH) { return state.get(CANDLE) == EnumCandle.NONE ? SHAPE_STICK_S: SHAPE_CANDLE_S; }
        else if (state.get(FACING) == Direction.WEST) { return state.get(CANDLE) == EnumCandle.NONE ? SHAPE_STICK_W: SHAPE_CANDLE_W; }
        else { return state.get(CANDLE) == EnumCandle.NONE ? SHAPE_STICK_FLOOR: SHAPE_CANDLE_FLOOR; }
    }

    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack itemstack = player.getHeldItem(handIn);
        Item item = itemstack.getItem();
        if (state.get(CANDLE) == EnumCandle.NONE) {
            System.out.println(item.toString());
            if (item.toString().equals("candlestick")) { worldIn.setBlockState(pos, state.with(CANDLE, EnumCandle.BLACK), 3); }
            for (EnumCandle enumcandle : EnumCandle.values()) {
                if (item.toString().equals(enumcandle.toString())) { worldIn.setBlockState(pos, state.with(CANDLE, enumcandle), 3); }
            }
            if (!player.abilities.isCreativeMode) {
                itemstack.shrink(1);
            }
        }
        return true;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getFace();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = this.getDefaultState();
        if (direction == Direction.DOWN) {
            blockstate = blockstate.with(FACING, Direction.DOWN);
        }
        else {
            blockstate = blockstate.with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        return blockstate;
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return hasEnoughSolidSide(worldIn, pos.down(), Direction.UP);
    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
     * this method is unrelated to {@link randomTick} and {@link #needsRandomTick}, and will always be called regardless
     * of whether the block can receive random update ticks
     */
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double d0 = (double)pos.getX() + 0.5D;
        double d1 = (double)pos.getY() + 0.7D;
        double d2 = (double)pos.getZ() + 0.5D;
        worldIn.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        worldIn.addParticle(ParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);
    }

    /**
     * Gets the render layer this block will render on. SOLID for solid blocks, CUTOUT or CUTOUT_MIPPED for on-off
     * transparency (glass, reeds), TRANSLUCENT for fully blended transparency (stained glass)
     */
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) { builder.add(FACING, CANDLE); }

}