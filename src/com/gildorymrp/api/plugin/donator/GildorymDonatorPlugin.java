package com.gildorymrp.api.plugin.donator;

import java.util.Collection;

import org.bukkit.entity.Player;

/**
 * Represents a donation management plugin
 * @author Lucariatias
 *
 */
public interface GildorymDonatorPlugin {
	
	/**
	 * Gets a collection containing the donation ranks of a given player
	 * 
	 * @param player the player
	 * @return a collection of the donation ranks of the player, or an empty collection if none
	 */
	public Collection<DonationRank> getDonationRanks(Player player);

}
