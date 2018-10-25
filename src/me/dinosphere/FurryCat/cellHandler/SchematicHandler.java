package me.dinosphere.FurryCat.cellHandler;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class SchematicHandler extends JavaPlugin implements Listener{

@EventHandler
public void interact(PlayerInteractEvent event) {
	
	Player player = event.getPlayer();
	if(player.getInventory().getItemInHand().getType().equals(Material.STICK)) {
		
		loadSchematic(player);
		player.sendMessage(ChatColor.GREEN + "" +  ChatColor.ITALIC +  "Fallout: " + ChatColor.YELLOW + "Your Cell has been loaded. ");
		
	}
	
}


private void loadSchematic(Player player) {
	
	Location location = player.getLocation();
	
}
	
}
