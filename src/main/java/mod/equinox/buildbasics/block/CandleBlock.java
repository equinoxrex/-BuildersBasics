package mod.equinox.buildbasics.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.*;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * @credit - bageldotjpg
 */
public class CandleBlock extends BushBlock implements IWaterLoggable {
    public static final IntegerProperty CANDLES;
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape ONE_SHAPE;
    protected static final VoxelShape TWO_SHAPE;
    protected static final VoxelShape THREE_SHAPE;

    protected CandleBlock(Properties properties) {
        super(properties);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateContainer.getBaseState()).with(CANDLES, 1)).with(WATERLOGGED, true));
    }

    public int getLightValue(BlockState p_149750_1_) {
        return this.isInBadEnvironment(p_149750_1_) ? 0 : super.getLightValue(p_149750_1_) + 3 * (Integer)p_149750_1_.get(CANDLES);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        BlockState lvt_2_1_ = p_196258_1_.getWorld().getBlockState(p_196258_1_.getPos());
        if (lvt_2_1_.getBlock() == this) {
            return (BlockState)lvt_2_1_.with(CANDLES, Math.min(4, (Integer)lvt_2_1_.get(CANDLES) + 1)).with(FACING, p_196258_1_.getPlacementHorizontalFacing());
        } else {
            IFluidState lvt_3_1_ = p_196258_1_.getWorld().getFluidState(p_196258_1_.getPos());
            boolean lvt_4_1_ = lvt_3_1_.isTagged(FluidTags.WATER) && lvt_3_1_.getLevel() == 8;
            return (BlockState)super.getStateForPlacement(p_196258_1_).with(WATERLOGGED, lvt_4_1_);
        }
    }

    private boolean isInBadEnvironment(BlockState p_204901_1_) {
        return (Boolean)p_204901_1_.get(WATERLOGGED);
    }

    protected boolean isValidGround(BlockState p_200014_1_, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        return !p_200014_1_.getCollisionShape(p_200014_2_, p_200014_3_).project(Direction.UP).isEmpty();
    }

    public boolean isValidPosition(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
        BlockPos lvt_4_1_ = p_196260_3_.down();
        return this.isValidGround(p_196260_2_.getBlockState(lvt_4_1_), p_196260_2_, lvt_4_1_);
    }

    public BlockState updatePostPlacement(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (!p_196271_1_.isValidPosition(p_196271_4_, p_196271_5_)) {
            return Blocks.AIR.getDefaultState();
        } else {
            if ((Boolean)p_196271_1_.get(WATERLOGGED)) {
                p_196271_4_.getPendingFluidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickRate(p_196271_4_));
            }

            return super.updatePostPlacement(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
        }
    }

    public boolean isReplaceable(BlockState p_196253_1_, BlockItemUseContext p_196253_2_) {
        return p_196253_2_.getItem().getItem() == this.asItem() && (Integer)p_196253_1_.get(CANDLES) < 3 ? true : super.isReplaceable(p_196253_1_, p_196253_2_);
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        switch((Integer)p_220053_1_.get(CANDLES)) {
            case 1:
            default:
                return ONE_SHAPE;
            case 2:
                return TWO_SHAPE;
            case 3:
                return THREE_SHAPE;
        }
    }

    public IFluidState getFluidState(BlockState p_204507_1_) {
        return (Boolean)p_204507_1_.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(p_204507_1_);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new IProperty[]{CANDLES, WATERLOGGED, FACING});
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
        return (float)(state.get(CANDLES) == 3 ? 1 : 0.5);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double x = pos.getX();
        double y = pos.getY();
        double z = pos.getZ();

        if((Integer)stateIn.get(CANDLES) == 1) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.5D, y+0.8D, z+0.5D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.5D, y+0.8D, z+0.5D, 0.002D, 0.01D, 0.002D);
        }
        if((Integer)stateIn.get(CANDLES) == 2 && stateIn.get(FACING) == Direction.WEST) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.375D, y+0.8D, z+0.3125D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.375D, y+0.8D, z+0.3125D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.6875D, y+0.55D, z+0.6875D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.6875D, y+0.55D, z+0.6875D, 0.002D, 0.01D, 0.002D);
        }
        if((Integer)stateIn.get(CANDLES) == 2 && stateIn.get(FACING) == Direction.NORTH) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.6875D, y+0.8D, z+0.3125D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.6875D, y+0.8D, z+0.3125D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.3125D, y+0.55D, z+0.625D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.31235D, y+0.55D, z+0.625D, 0.002D, 0.01D, 0.002D);
        }
        if((Integer)stateIn.get(CANDLES) == 2 && stateIn.get(FACING) == Direction.EAST) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.6875D, y+0.8D, z+0.6875D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.6875D, y+0.8D, z+0.6875D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.375D, y+0.55D, z+0.3125D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.375D, y+0.55D, z+0.3125D, 0.002D, 0.01D, 0.002D);

        }
        if((Integer)stateIn.get(CANDLES) == 2 && stateIn.get(FACING) == Direction.SOUTH) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.3125D, y+0.8D, z+0.625D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.3125D, y+0.8D, z+0.625D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.6875D, y+0.55D, z+0.3125D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.6875D, y+0.55D, z+0.3125D, 0.002D, 0.01D, 0.002D);
        }
        if((Integer)stateIn.get(CANDLES) == 3 && stateIn.get(FACING) == Direction.WEST) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.25D, y+0.8D, z+0.25D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.25D, y+0.8D, z+0.25D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.75D, y+0.55D, z+0.375D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.75D, y+0.55D, z+0.375D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.5D, y+0.925D, z+0.75D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.5D, y+0.925D, z+0.75D, 0.002D, 0.01D, 0.002D);
        }
        if((Integer)stateIn.get(CANDLES) == 3 && stateIn.get(FACING) == Direction.NORTH) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.75D, y+0.8D, z+0.25D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.75D, y+0.8D, z+0.25D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.625D, y+0.55D, z+0.75D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.625D, y+0.55D, z+0.75D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.25D, y+0.925D, z+0.5D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.25D, y+0.925D, z+0.5D, 0.002D, 0.01D, 0.002D);
        }
        if((Integer)stateIn.get(CANDLES) == 3 && stateIn.get(FACING) == Direction.EAST) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.75D, y+0.8D, z+0.75D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.75D, y+0.8D, z+0.75D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.25D, y+0.55D, z+0.625D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.25D, y+0.55D, z+0.625D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.5D, y+0.925D, z+0.25D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.5D, y+0.925D, z+0.25D, 0.002D, 0.01D, 0.002D);
        }
        if((Integer)stateIn.get(CANDLES) == 3 && stateIn.get(FACING) == Direction.SOUTH) {
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.25D, y+0.8D, z+0.75D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.25D, y+0.8D, z+0.75D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.375D, y+0.55D, z+0.25D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.375D, y+0.55D, z+0.25D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.SMOKE, x+0.75D, y+0.925D, z+0.5D, 0.002D, 0.01D, 0.002D);
            worldIn.addParticle(ParticleTypes.FLAME, x+0.75D, y+0.925D, z+0.5D, 0.002D, 0.01D, 0.002D);
        }
    }

    static {
        CANDLES = IntegerProperty.create("candles", 0, 3);
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        ONE_SHAPE = Block.makeCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 10.0D, 10.0D);
        TWO_SHAPE = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D);
        THREE_SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    }
}

