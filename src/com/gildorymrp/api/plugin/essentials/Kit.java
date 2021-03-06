package com.gildorymrp.api.plugin.essentials;

import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Represents an item kit
 * @author Lucariatias
 *
 */
public interface Kit extends Set<ItemStack> {
	
	/**
	 * Gives this kit to the given player
	 * 
	 * @param player the player to give this kit
	 */
	public void give(Player player);

}
