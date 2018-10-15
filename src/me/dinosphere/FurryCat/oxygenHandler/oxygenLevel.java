package me.dinosphere.FurryCat.oxygenHandler;

import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public class oxygenLevel extends JavaPlugin{

@SuppressWarnings("null")
public static void hairyDog() {
	
	final CommandSender sender = null;
	final Player player = (Player) sender;
	
	int delay = 600000;
	int subtractionRate = 1;
	
	while(true){
		if (player.getTotalExperience() <=10) {
			
			player.setTotalExperience(player.getTotalExperience() - subtractionRate);
			
			
		}else {
			
			player.setTotalExperience(11);
			
		}
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
	
}
