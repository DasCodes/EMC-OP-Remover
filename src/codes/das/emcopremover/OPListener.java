package codes.das.emcopremover;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OPListener implements Listener {
    @EventHandler (priority = EventPriority.LOW)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.isOp()) {
            player.setOp(false);
            Bukkit.getConsoleSender().sendMessage("[EMC OP Remover]: " + "Deoped " + player.getName() + ".");
        }
    }

    @EventHandler (priority = EventPriority.LOW)
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if (player.isOp()) {
            player.setOp(false);
            Bukkit.getConsoleSender().sendMessage("[EMC OP Remover]: " + "Deoped " + player.getName() + ".");
        }
    }
}
