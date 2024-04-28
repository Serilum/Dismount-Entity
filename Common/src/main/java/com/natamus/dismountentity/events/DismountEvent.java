package com.natamus.dismountentity.events;

import java.util.List;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class DismountEvent {
	public static InteractionResult onPlayerInteract(Player player, Level world, InteractionHand hand, Entity target, EntityHitResult hitResult) {
		if (world.isClientSide) {
			return InteractionResult.PASS;
		}

		if (!player.isCrouching()) {
			return InteractionResult.PASS;
		}
		
		List<Entity> mounted = target.getPassengers();
		if (mounted.size() > 0) {
			for (Entity entity : mounted) {
				entity.stopRiding();
			}
			
			return InteractionResult.SUCCESS;
		}
		
		return InteractionResult.PASS;
	}
}