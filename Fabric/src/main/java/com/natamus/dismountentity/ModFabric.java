package com.natamus.dismountentity;

import com.natamus.collective.check.RegisterMod;
import com.natamus.dismountentity.events.DismountEvent;
import com.natamus.dismountentity.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			return DismountEvent.onPlayerInteract(player, world, hand, entity, hitResult);
		});
	}

	private static void setGlobalConstants() {

	}
}
