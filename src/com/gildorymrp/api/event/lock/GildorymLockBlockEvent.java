package com.gildorymrp.api.event.lock;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.plugin.core.Character;

/**
 * Called when a block is locked
 * @author Lucariatias
 *
 */
public class GildorymLockBlockEvent extends GildorymLockEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Character character;
	private final Block block;
	private boolean cancel;
	
	public GildorymLockBlockEvent(final Character character, final Block block) {
		this.character = character;
		this.block = block;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

	/**
	 * Gets the character locking the block
	 * 
	 * @return the character locking the block
	 */
	public final Character getCharacter() {
		return character;
	}
	
	/**
	 * Gets the block being locked
	 * 
	 * @return the block being locked
	 */
	public final Block getBlock() {
		return block;
	}
	
	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

}
