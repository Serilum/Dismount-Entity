package com.natamus.dismountentity.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.dismountentity.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean beAbleToDismountOtherPlayers = false;

	public static void initConfig() {
		configMetaData.put("beAbleToDismountOtherPlayers", Arrays.asList(
			"Whether players can dismount other players from their vehicle."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}