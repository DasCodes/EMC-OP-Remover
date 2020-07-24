package codes.das.emcopremover;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class GamemodeListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.getGameMode() == GameMode.CREATIVE) {
            player.setGameMode(GameMode.SPECTATOR);
            Bukkit.getConsoleSender().sendMessage("[EMC OP Remover]: " + player.getName() + "'s gamemode set to spectator!");
        }
    }
}
