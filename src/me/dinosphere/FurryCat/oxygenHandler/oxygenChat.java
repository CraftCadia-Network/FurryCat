package me.dinosphere.FurryCat.oxygenHandler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class oxygenChat extends JavaPlugin{

	
	
	public static void purringPowwow(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		
		try {
			if(player.getTotalExperience() <=10) {
				
				player.setTotalExperience(player.getTotalExperience() - 1);
				
			}
			
		}catch (Exception e){
			
			
			e.printStackTrace();
		}
		
	}
	
}
