package mod.equinox.buildbasics.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RottenBlock extends Block {
    public static final IntegerProperty STRENGTH = IntegerProperty.create("strength", 0, 1);
    public RottenBlock(Block.Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(STRENGTH, Integer.valueOf(1)));
    }

    /**
     * Called when the given entity walks on this Block
     */
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        this.tryTrample(worldIn, pos, entityIn, 80);
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    /**
     * Block's chance to react to a living entity falling on it.
     */
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        if (!(entityIn instanceof ZombieEntity)) {
            this.tryTrample(worldIn, pos, entityIn, 3);
        }

        super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
    }

    private void tryTrample(World p_203167_1_, BlockPos p_203167_2_, Entity p_203167_3_, int p_203167_4_) {
        if (!this.canTrample(p_203167_1_, p_203167_3_)) {
            super.onEntityWalk(p_203167_1_, p_203167_2_, p_203167_3_);
        } else {
            if (!p_203167_1_.isRemote && p_203167_1_.rand.nextInt(p_203167_4_) == 0) {
                this.removeStrength(p_203167_1_, p_203167_2_, p_203167_1_.getBlockState(p_203167_2_));
            }

        }
    }

    private void removeStrength(World p_203166_1_, BlockPos p_203166_2_, BlockState p_203166_3_) {
        p_203166_1_.playSound((PlayerEntity)null, p_203166_2_, SoundEvents.ENTITY_TURTLE_EGG_BREAK, SoundCategory.BLOCKS, 0.7F, 0.9F + p_203166_1_.rand.nextFloat() * 0.2F);
        int i = p_203166_3_.get(STRENGTH);
        if (i <= 1) {
            p_203166_1_.destroyBlock(p_203166_2_, false);
        } else {
            p_203166_1_.setBlockState(p_203166_2_, p_203166_3_.with(STRENGTH, Integer.valueOf(i - 1)), 2);
            p_203166_1_.playEvent(2001, p_203166_2_, Block.getStateId(p_203166_3_));
        }

    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) { builder.add(STRENGTH); }


    private boolean canTrample(World worldIn, Entity trampler) {
            return trampler instanceof LivingEntity && !(trampler instanceof PlayerEntity) ? net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(worldIn, trampler) : true;

    }
}
