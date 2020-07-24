package codes.das.emcopremover;

import org.bukkit.plugin.java.JavaPlugin;

public class EMCOPRemover extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OPListener(), this);
        getServer().getPluginManager().registerEvents(new GamemodeListener(), this);
    }

    @Override
    public void onDisable() {}
}
