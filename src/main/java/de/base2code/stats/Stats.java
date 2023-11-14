package de.base2code.stats;

import de.base2code.stats.listener.BlockListener;
import de.base2code.stats.listener.PlayerListener;
import de.base2code.stats.manager.FileManager;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class Stats extends JavaPlugin {
    public static final String SERVER_NAME = "server1";

    private static Stats instance;

    private FileManager fileManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        if (!getDataFolder().exists()) {
            getDataFolder().mkdir();
        }

        try {
            fileManager = new FileManager(new File(getDataFolder(), "stats.yml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new BlockListener(), this);

        pluginManager.registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Stats getInstance() {
        return instance;
    }

    public FileManager getFileManager() {
        return fileManager;
    }
}
