package net.pravian.keepinventorytest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class KeepInventoryTest extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        super.getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        super.getLogger().info("Default: " + event.getKeepInventory());

        // Keeps inventory if player is OP
        if (event.getEntity().isOp()) {
            event.setKeepInventory(true);   
        }
    }
}
