package com.sanatorium.sanatoriummod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MithrilOre extends DropExperienceBlock {

    public static final IntegerProperty LIGHT_LEVEL = IntegerProperty.create("light_level", 0, 15);

    public MithrilOre(IntProvider xpRange, Properties properties) {
        super(xpRange, properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIGHT_LEVEL, 0));
    }

    @Override
    protected void attack(BlockState state, Level level, BlockPos pos, Player player) {
        triggerEffect(state, level, pos);
        super.attack(state, level, pos, player);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.isSteppingCarefully()) {
            triggerEffect(state, level, pos);

        }

        super.stepOn(level, pos, state, entity);


        if (entity instanceof LivingEntity) {
            entity.hurt(level.damageSources().cactus(), 4.0F);
           ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0));
        }

        super.stepOn(level, pos, state, entity); }


    private void triggerEffect(BlockState state, Level level, BlockPos pos) {
        if (!level.isClientSide) {
            if (state.getValue(LIGHT_LEVEL) < 15) {
                level.setBlock(pos, state.setValue(LIGHT_LEVEL, 15), 3);
                level.scheduleTick(pos, this, 10);
            }
        }

        if (level instanceof ServerLevel serverLevel) {
            serverLevel.sendParticles(ParticleTypes.SPORE_BLOSSOM_AIR,
                    pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5,
                    10, 0.3, 0.3, 0.3, 0.02);

        }
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int currentLevel = state.getValue(LIGHT_LEVEL);
        if (currentLevel > 0) {
            level.setBlock(pos, state.setValue(LIGHT_LEVEL, currentLevel - 1), 3);
            level.scheduleTick(pos, this, 10);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder.add(LIGHT_LEVEL));
    }


}