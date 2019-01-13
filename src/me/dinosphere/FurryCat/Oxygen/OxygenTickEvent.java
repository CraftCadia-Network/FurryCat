package me.dinosphere.FurryCat.Oxygen;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.dinosphere.FurryCat.FurryCat;

public class OxygenTickEvent {

	protected static final Player Player = null;
	public static FurryCat plugin;

public static void XpTickEvent() {
	
	new BukkitRunnable() {
		Player player = (Player);
		public void run() {
	        if(player.getLocation().getBlockY() >= 67) {
	        	
	        	player.giveExpLevels((int) -1L);
	        	
	        }
	    }
	}.runTaskTimer(plugin, 0, 20);
	
	
}
	
}
