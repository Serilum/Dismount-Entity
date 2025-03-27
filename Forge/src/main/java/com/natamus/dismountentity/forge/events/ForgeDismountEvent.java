package com.natamus.dismountentity.forge.events;

import com.natamus.dismountentity.events.DismountEvent;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeDismountEvent {
	@SubscribeEvent
	public static void onPlayerInteract(PlayerInteractEvent.EntityInteract e) {
		if (DismountEvent.onPlayerInteract(e.getEntity(), e.getLevel(), e.getHand(), e.getTarget(), null).equals(InteractionResult.SUCCESS)) {
			e.setCanceled(true);
		}
	}
}