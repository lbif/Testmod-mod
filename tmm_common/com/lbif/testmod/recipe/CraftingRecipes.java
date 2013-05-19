package com.lbif.testmod.recipe;

import com.asajz.core.handlers.recipe.RecipeHandler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingRecipes {
	public static void initRecipes(){
		RecipeHandler.addRecipe(new ItemStack(Item.diamond), new Object[] { "iii", "iii", "ggg", Character.valueOf('i'), Item.ingotIron, Character.valueOf('g'), Item.ingotGold});
	}
			
}
