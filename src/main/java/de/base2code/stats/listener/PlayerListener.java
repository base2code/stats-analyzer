package de.base2code.stats.listener;

import de.base2code.stats.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class PlayerListener implements Listener {

   /* @EventHandler
    public void onPlayerBucketEvent(PlayerBucketEvent event) {
        Utils.eventFire(event);
    }*/



    @EventHandler
    public void onPlayerItemMendEvent(PlayerItemMendEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerItemDamageEvent(PlayerItemDamageEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerRecipeDiscoverEvent(PlayerRecipeDiscoverEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerBucketFillEvent(PlayerBucketFillEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerPickupArrowEvent(PlayerPickupArrowEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerBedLeaveEvent(PlayerBedLeaveEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerKickEvent(PlayerKickEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerUnleashEntityEvent(PlayerUnleashEntityEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerCommandSendEvent(PlayerCommandSendEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerItemBreakEvent(PlayerItemBreakEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerDropItemEvent(PlayerDropItemEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerTeleportEvent(PlayerTeleportEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerLevelChangeEvent(PlayerLevelChangeEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerVelocityEvent(PlayerVelocityEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerToggleFlightEvent(PlayerToggleFlightEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onAsyncPlayerPreLoginEvent(AsyncPlayerPreLoginEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerChangedWorldEvent(PlayerChangedWorldEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerSwapHandItemsEvent(PlayerSwapHandItemsEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerToggleSprintEvent(PlayerToggleSprintEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerStatisticIncrementEvent(PlayerStatisticIncrementEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerExpChangeEvent(PlayerExpChangeEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerBucketEmptyEvent(PlayerBucketEmptyEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerChangedMainHandEvent(PlayerChangedMainHandEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerPortalEvent(PlayerPortalEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerItemHeldEvent(PlayerItemHeldEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerToggleSneakEvent(PlayerToggleSneakEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerBedEnterEvent(PlayerBedEnterEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerGameModeChangeEvent(PlayerGameModeChangeEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerUnregisterChannelEvent(PlayerUnregisterChannelEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerRiptideEvent(PlayerRiptideEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerBucketEntityEvent(PlayerBucketEntityEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerEggThrowEvent(PlayerEggThrowEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerLocaleChangeEvent(PlayerLocaleChangeEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerShearEntityEvent(PlayerShearEntityEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerAnimationEvent(PlayerAnimationEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerFishEvent(PlayerFishEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerChannelEvent(PlayerChannelEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerHarvestBlockEvent(PlayerHarvestBlockEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerArmorStandManipulateEvent(PlayerArmorStandManipulateEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerResourcePackStatusEvent(PlayerResourcePackStatusEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerEditBookEvent(PlayerEditBookEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerLoginEvent(PlayerLoginEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerTakeLecternBookEvent(PlayerTakeLecternBookEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerRegisterChannelEvent(PlayerRegisterChannelEvent event) {
        Utils.eventFire(event);
    }

    @EventHandler
    public void onPlayerRecipeBookClickEvent(PlayerRecipeBookClickEvent event) {
        Utils.eventFire(event);
    }
}
