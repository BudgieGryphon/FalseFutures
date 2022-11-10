package com.budgiegryphon.falsefutures.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class JellycakeBlock extends Block{
	public JellycakeBlock(Properties properties) {
		super(properties);	
	}
	
	public void fallOn(Level level, BlockState blockstate, BlockPos blockpos, Entity entity, float fallHeight) {
		if (entity.isSuppressingBounce()) {
			super.fallOn(level, blockstate, blockpos, entity, fallHeight);
	    } 
		else {
			entity.causeFallDamage(fallHeight, 0.0F, DamageSource.FALL);
	    }
	}
	
	public void updateEntityAfterFallOn(BlockGetter blockgetter, Entity entity) {
		if (entity.isSuppressingBounce()) {
			super.updateEntityAfterFallOn(blockgetter, entity);
		} 
		else {
			this.bounceUp(entity);
		}
	}
	
	private void bounceUp(Entity entity) {
		Vec3 vec3 = entity.getDeltaMovement();
		if (vec3.y < 0.0D) {
			double d0 = entity instanceof LivingEntity ? 1.0D : 0.8D;
	        entity.setDeltaMovement(vec3.x, -vec3.y * d0, vec3.z);
		}

	}
	
}
