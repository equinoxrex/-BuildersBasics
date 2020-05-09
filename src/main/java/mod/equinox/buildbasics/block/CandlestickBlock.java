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
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
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
import net.minecraftforge.registries.ForgeRegistries;

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

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack itemstack = player.getHeldItem(handIn);
        Item item = itemstack.getItem();
        if (state.get(CANDLE) == EnumCandle.NONE) {
            for (EnumCandle enumcandle : EnumCandle.values()) {
                if (item.toString().equals(enumcandle.toString())) {
                    worldIn.setBlockState(pos, state.with(CANDLE, enumcandle), 3);
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                }
            }
        }
        else {
            ItemStack dropitem = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("buildbasics:".concat(state.get(CANDLE).toString()))));
            //player.addItemStackToInventory(dropitem);
            if (itemstack.isEmpty()) {
                player.setHeldItem(handIn, dropitem);
            } else if (!player.addItemStackToInventory(dropitem)) {
                player.dropItem(dropitem, false);
            }
            worldIn.setBlockState(pos, state.with(CANDLE, EnumCandle.NONE), 3);
        }
        return ActionResultType.SUCCESS;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getFace();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = this.getDefaultState();
        if (direction == Direction.UP) {
            blockstate = blockstate.with(FACING, Direction.DOWN);
        }
        else {
            blockstate = blockstate.with(FACING, direction);
        }
        return blockstate;
    }

//    /**
//     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
//     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
//     * returns its solidified counterpart.
//     * Note that this method should ideally consider only the specific face passed in.
//     */
//    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
//        return facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
//    }
//
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        if(state.get(FACING) == Direction.NORTH) {
            return hasEnoughSolidSide(worldIn, pos.south(), Direction.NORTH);
        }
        else if(state.get(FACING) == Direction.SOUTH) {
            return hasEnoughSolidSide(worldIn, pos.north(), Direction.SOUTH);
        }
        else if(state.get(FACING) == Direction.WEST) {
            return hasEnoughSolidSide(worldIn, pos.east(), Direction.WEST);
        }
        else if(state.get(FACING) == Direction.EAST) {
            return hasEnoughSolidSide(worldIn, pos.west(), Direction.EAST);
        }
        else {
            return hasEnoughSolidSide(worldIn, pos.down(), Direction.UP);
        }
    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
     * this method is unrelated to {@link randomTick} and {@link #needsRandomTick}, and will always be called regardless
     * of whether the block can receive random update ticks
     */
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
        double x = (double)pos.getX();
        double y = (double)pos.getY();
        double z = (double)pos.getZ();

        if(state.get(FACING) == Direction.NORTH && state.get(CANDLE) != EnumCandle.NONE) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.5D, y+0.9D, z+0.8125D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.5D, y+0.9D, z+0.8125D, 0.002D, 0.01D, 0.002D);
        }
        else if(state.get(FACING) == Direction.SOUTH && state.get(CANDLE) != EnumCandle.NONE) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.5D, y+0.9D, z+0.1975D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.5D, y+0.9D, z+0.1975D, 0.002D, 0.01D, 0.002D);
        }
        else if(state.get(FACING) == Direction.WEST && state.get(CANDLE) != EnumCandle.NONE) {
            worldIn.addParticle(ParticleTypes.SMOKE, z+0.8125D, y+0.9D, z+0.5D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, z+0.8125D, y+0.9D, z+0.5D, 0.002D, 0.01D, 0.002D);
        }
        else if(state.get(FACING) == Direction.EAST && state.get(CANDLE) != EnumCandle.NONE) {
            worldIn.addParticle(ParticleTypes.SMOKE, z+0.1975D, y+0.9D, z+0.5D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, z+0.1975D, y+0.9D, z+0.5D, 0.002D, 0.01D, 0.002D);
        }
        else if (state.get(FACING) == Direction.DOWN && state.get(CANDLE) != EnumCandle.NONE) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.5D, y+0.8625D, z+0.5D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.5D, y+0.8625D, z+0.5D, 0.002D, 0.01D, 0.002D);
        }
    }


    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) { builder.add(FACING, CANDLE); }

}