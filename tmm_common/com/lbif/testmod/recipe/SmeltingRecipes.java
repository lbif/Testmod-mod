package com.lbif.testmod.recipe;

import com.asajz.core.handlers.recipe.FurnaceHandler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SmeltingRecipes {
	
	public static void initSmelting() {
		FurnaceHandler.addSmelting(Item.stick.itemID, new ItemStack(Item.coal, 1), 0.3F);
		
	}

}
