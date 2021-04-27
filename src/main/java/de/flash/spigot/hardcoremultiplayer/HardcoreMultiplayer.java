package de.flash.spigot.hardcoremultiplayer;

import de.flash.spigot.hardcoremultiplayer.events.BanOnDeath;
import org.bukkit.plugin.java.JavaPlugin;

public final class HardcoreMultiplayer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BanOnDeath(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

//TODO: Add Ban on Death
//TODO: Add Spectator mode on Death
//TODO: Kick player after 5 minutes spectation time