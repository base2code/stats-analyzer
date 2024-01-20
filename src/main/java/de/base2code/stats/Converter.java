package de.base2code.stats;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Converter {
    public static String strFromLocation(Location location) {
        return location.getWorld().getName() + ";" + location.getBlockX() + ";" + location.getBlockY() + ";" + location.getBlockZ();
    }

    public static String strFromPlayer(Player player) {
        return player.getUniqueId().toString();
    }

    public static String strFromItemStack(ItemStack itemStack) {
        return ItemStackSerializer.serialize(itemStack);
    }

    public static String strFromBlock(Block s) {
        return s.getType().toString() + ";" + s.getX() + ";" + s.getY() + ";" + s.getZ();
    }
}
