package de.base2code.stats.listener;

import de.base2code.stats.Converter;
import de.base2code.stats.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class PlayerListener implements Listener {

   @EventHandler
    public void onPlayerItemMendEvent(PlayerItemMendEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getItem());
    }

    @EventHandler
    public void onPlayerItemDamageEvent(PlayerItemDamageEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getItem(), event.getDamage());
    }

    @EventHandler
    public void onPlayerRecipeDiscoverEvent(PlayerRecipeDiscoverEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getRecipe());
    }

    @EventHandler
    public void onPlayerBucketFillEvent(PlayerBucketFillEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBucket());
    }

    @EventHandler
    public void onPlayerPickupArrowEvent(PlayerPickupArrowEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getArrow());
    }

    @EventHandler
    public void onPlayerBedLeaveEvent(PlayerBedLeaveEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBed());
    }

    @EventHandler
    public void onPlayerKickEvent(PlayerKickEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getReason());
    }

    @EventHandler
    public void onPlayerUnleashEntityEvent(PlayerUnleashEntityEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getEntity(), event.getReason());
    }

    @EventHandler
    public void onPlayerCommandSendEvent(PlayerCommandSendEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getCommands());
    }

    @EventHandler
    public void onPlayerItemBreakEvent(PlayerItemBreakEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBrokenItem());
    }

    @EventHandler
    public void onPlayerDropItemEvent(PlayerDropItemEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getItemDrop());
    }

    @EventHandler
    public void onPlayerTeleportEvent(PlayerTeleportEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getFrom(), event.getTo());
    }

    @EventHandler
    public void onPlayerLevelChangeEvent(PlayerLevelChangeEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getOldLevel(), event.getNewLevel());
    }

    @EventHandler
    public void onPlayerVelocityEvent(PlayerVelocityEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getVelocity());
    }

    @EventHandler
    public void onPlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getAdvancement());
    }

    @EventHandler
    public void onPlayerToggleFlightEvent(PlayerToggleFlightEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.isFlying());
    }

    @EventHandler
    public void onPlayerChangedWorldEvent(PlayerChangedWorldEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getFrom());
    }

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getFrom(), event.getTo());
    }

    @EventHandler
    public void onPlayerSwapHandItemsEvent(PlayerSwapHandItemsEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getMainHandItem(), event.getOffHandItem());
    }

    @EventHandler
    public void onPlayerToggleSprintEvent(PlayerToggleSprintEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.isSprinting());
    }

    @EventHandler
    public void onPlayerStatisticIncrementEvent(PlayerStatisticIncrementEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getStatistic(), event.getPreviousValue(), event.getNewValue());
    }

    @EventHandler
    public void onPlayerExpChangeEvent(PlayerExpChangeEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getAmount());
    }

    @EventHandler
    public void onPlayerBucketEmptyEvent(PlayerBucketEmptyEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBucket());
    }

    @EventHandler
    public void onPlayerChangedMainHandEvent(PlayerChangedMainHandEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getMainHand());
    }

    @EventHandler
    public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getItem(), event.getHand());
    }

    @EventHandler
    public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getMessage());
    }

    @EventHandler
    public void onPlayerPortalEvent(PlayerPortalEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getFrom(), event.getTo());
    }

    @EventHandler
    public void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getHand(), event.getClickedPosition());
    }

    @EventHandler
    public void onPlayerItemHeldEvent(PlayerItemHeldEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getPreviousSlot(), event.getNewSlot());
    }

    @EventHandler
    public void onPlayerToggleSneakEvent(PlayerToggleSneakEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.isSneaking());
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getQuitMessage());
    }

    @EventHandler
    public void onPlayerBedEnterEvent(PlayerBedEnterEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBed());
    }

    @EventHandler
    public void onPlayerGameModeChangeEvent(PlayerGameModeChangeEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getNewGameMode());
    }

    @EventHandler
    public void onPlayerRiptideEvent(PlayerRiptideEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getItem());
    }

    @EventHandler
    public void onPlayerBucketEntityEvent(PlayerBucketEntityEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getEntity(), event.getOriginalBucket(), event.getEntityBucket());
    }

    @EventHandler
    public void onPlayerEggThrowEvent(PlayerEggThrowEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getEgg(), event.isHatching());
    }

    @EventHandler
    public void onPlayerLocaleChangeEvent(PlayerLocaleChangeEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getLocale());
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getJoinMessage());
    }

    @EventHandler
    public void onPlayerShearEntityEvent(PlayerShearEntityEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getEntity(), event.getItem());
    }

    @EventHandler
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getMessage(), event.getRecipients());
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getMaterial(), event.getHand(), event.getAction(), event.getClickedBlock());
    }

    @EventHandler
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getRespawnLocation(), event.getRespawnReason());
    }

    @EventHandler
    public void onPlayerAnimationEvent(PlayerAnimationEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getAnimationType());
    }

    @EventHandler
    public void onPlayerFishEvent(PlayerFishEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getHand(), event.getCaught(), event.getExpToDrop());
    }

    @EventHandler
    public void onPlayerHarvestBlockEvent(PlayerHarvestBlockEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getHand(), event.getHarvestedBlock(), event.getItemsHarvested());
    }

    @EventHandler
    public void onPlayerArmorStandManipulateEvent(PlayerArmorStandManipulateEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getRightClicked(), event.getArmorStandItem(), event.getPlayerItem());
    }

    @EventHandler
    public void onPlayerResourcePackStatusEvent(PlayerResourcePackStatusEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getStatus());
    }

    @EventHandler
    public void onPlayerEditBookEvent(PlayerEditBookEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getPreviousBookMeta(), event.getNewBookMeta());
    }

    @EventHandler
    public void onPlayerLoginEvent(PlayerLoginEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getResult());
    }

    @EventHandler
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getRightClicked(), event.getHand());
    }

    @EventHandler
    public void onPlayerTakeLecternBookEvent(PlayerTakeLecternBookEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getBook());
    }

    @EventHandler
    public void onPlayerRecipeBookClickEvent(PlayerRecipeBookClickEvent event) {
        Utils.eventFire(event, event.getPlayer(), event.getRecipe());
    }
}
