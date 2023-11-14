package de.base2code.stats.manager;

import de.base2code.stats.Stats;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class FileManager {
    private File file;
    private YamlConfiguration configuration;

    public FileManager(File file) throws IOException {
        this.file = file;
        if (!file.exists()) {
            // Create file
            file.createNewFile();
        }

        configuration = YamlConfiguration.loadConfiguration(file);

        Bukkit.getScheduler().scheduleSyncRepeatingTask(Stats.getInstance(), this::save, 20L * 60, 20L * 60);
    }

    public File getFile() {
        return file;
    }

    public void save() {
        CompletableFuture.runAsync(() -> {
            try {
                configuration.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void setStat(String event, int size) {
        ConfigurationSection section = configuration.getConfigurationSection(event);
        if (section == null) {
            section = configuration.createSection(event);
            section.set("size", size);
            section.set("count", 1);
        } else {
            section.set("size", section.getLong("size") + size);
            section.set("count", section.getInt("count") + 1);
        }
    }
}
