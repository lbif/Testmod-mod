package com.lbif.testmod.recipe;

import com.asajz.core.handlers.recipe.RecipeHandler;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class CraftingRecipes {
	public static void initRecipes(){
		RecipeHandler.addRecipe(new ItemStack(Item.diamond), new Object[] { "ccc", "ccc", "bbb", Character.valueOf('c'), Item.ingotIron, Character.valueOf('b'), Item.ingotGold});
	}
			
}
