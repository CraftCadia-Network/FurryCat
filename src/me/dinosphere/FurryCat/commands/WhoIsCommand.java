package me.dinosphere.FurryCat.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WhoIsCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if(label.equalsIgnoreCase("whois")) {
			
			if(player.hasPermission("fallout.whois")) {
				
				
				
			}
			
		}
		return false;
	}

}
