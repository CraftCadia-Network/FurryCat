package me.dinosphere.FurryCat.Oxygen;


import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.dinosphere.FurryCat.FurryCat;

public class OxygenTickEvent {

public static void XpTickEvent() {

	new BukkitRunnable() {
		
		public CommandSender sender;

		Player player = (Player) sender;
		public void run() {
	        if(player.getLocation().getBlockY() >= 67) {
	        	
	        	player.giveExpLevels((int) -1L);
	        	
	        }
	    }
	}.runTaskTimer(FurryCat.plugin, 0, 20);
	
	
}
	
}
