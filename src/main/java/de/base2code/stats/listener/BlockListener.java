package de.base2code.stats.listener;

import de.base2code.stats.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBlock(), event.getExpToDrop());
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBlock(), event.getBlockPlaced(), event.getItemInHand());
    }

}
