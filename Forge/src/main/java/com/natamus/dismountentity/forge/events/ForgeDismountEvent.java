package com.natamus.dismountentity.forge.events;

import com.natamus.dismountentity.events.DismountEvent;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeDismountEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeDismountEvent.class);

		PlayerInteractEvent.EntityInteract.BUS.addListener(ForgeDismountEvent::onPlayerInteract);
	}

	@SubscribeEvent
	public static boolean onPlayerInteract(PlayerInteractEvent.EntityInteract e) {
		if (DismountEvent.onPlayerInteract(e.getEntity(), e.getLevel(), e.getHand(), e.getTarget(), null).equals(InteractionResult.SUCCESS)) {
			return true;
		}
		return false;
	}
}