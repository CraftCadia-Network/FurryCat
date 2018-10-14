package me.dinosphere.FurryCat.oxygenHandler;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class oxygenLevel extends JavaPlugin{

 
	


		@SuppressWarnings("null")
		public static void dinosaur() {		
			
			int delay = 1000;
			
			final CommandSender sender = null;
			final Player player = (Player) sender;
			
		if(player.getRemainingAir() < 1) {	
			try {
		        while (true) {
		            player.setRemainingAir(-1);
		            Thread.sleep(delay);
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
				
			}else{
				return;
			}
		}
}

		

			
		

