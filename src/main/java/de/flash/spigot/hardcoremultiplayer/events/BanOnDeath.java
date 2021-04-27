package de.flash.spigot.hardcoremultiplayer.events;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class BanOnDeath implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player player = null;
        if (e.getEntity() instanceof Player) {
            player = e.getEntity();
        }
        if (player == null) {
            return;
        }
        String playerName = player.getName();
        Bukkit.getBanList(BanList.Type.NAME).addBan(playerName, "Tschau Kakao", null, null);
        player.setGameMode(GameMode.SPECTATOR);

    }
}
