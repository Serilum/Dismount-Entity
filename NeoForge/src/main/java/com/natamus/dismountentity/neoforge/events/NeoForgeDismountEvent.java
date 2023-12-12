package com.natamus.dismountentity.neoforge.events;

import com.natamus.dismountentity.events.DismountEvent;
import net.minecraft.world.InteractionResult;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeDismountEvent {
	@SubscribeEvent
	public static void onPlayerInteract(PlayerInteractEvent.EntityInteract e) {
		if (DismountEvent.onPlayerInteract(e.getEntity(), e.getLevel(), e.getHand(), e.getTarget(), null).equals(InteractionResult.SUCCESS)) {
			e.setCanceled(true);
		}
	}
}