package com.lbif.testmod;

import com.lbif.testmod.lib.Reference;
import com.lbif.testmod.recipe.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TestMod {
	/** 
	 * Code to be executed prior to your minecraft mod being initialized.
	 * Initialize language localizations, items, blocks, loggers, key bindings, and sounds.
	 * 
	 * @param event The Forge ModLoader pre-initialization event
	 */
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	/**
	 * Code to executed during the main initialization of your minecraft mod.
	 * 
	 * Register GUI handlers, tile entities, and recipes (crafting/smelting).
	 * 
	 * @param event The Forge ModLoader initialization event
	 */
	@Init
	public void init(FMLInitializationEvent event) {
		SmeltingRecipes.initSmelting();
		CraftingRecipes.initRecipes();
	}
	
	/**
	 * Code to be initialized after all other mods have been initialized.
	 * Look if other mods are available, initialize recipes based on mod availablity, etc.
	 * 
	 * @param event The Forge ModLoader post-initialization event
	 */
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
	}
 
}
