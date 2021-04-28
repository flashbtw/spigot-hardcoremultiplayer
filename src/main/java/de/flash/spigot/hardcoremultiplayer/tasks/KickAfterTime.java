package de.flash.spigot.hardcoremultiplayer.tasks;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class KickAfterTime extends BukkitRunnable {
    private final JavaPlugin plugin;
    private final Player player;

    public KickAfterTime(JavaPlugin plugin, Player player) {
        this.plugin = plugin;
        this.player = player;
    }
    public void kickAfterFiveMins(Player player) {
        new BukkitRunnable() {
            @Override
            public void run() {
                player.getPlayer().kickPlayer("Byeeee");
            }
        }.runTaskLater(this.plugin,20 * 3L);
    }

}