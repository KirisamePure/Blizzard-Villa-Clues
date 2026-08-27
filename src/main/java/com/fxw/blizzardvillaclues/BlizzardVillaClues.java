package com.fxw.blizzardvillaclues;

import com.fxw.blizzardvillaclues.ModItems.ModItems;
import com.fxw.blizzardvillaclues.ModItems.ModItemsGroup;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlizzardVillaClues implements ModInitializer {
	public static final String MOD_ID = "blizzard-villa-clues";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Blizzard villa clues for fxw's larp map");
		ModItems.initialize();
		ModItemsGroup.initialize();
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}
