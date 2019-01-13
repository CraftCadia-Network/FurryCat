package me.dinosphere.FurryCat.commands;

import org.bukkit.ChatColor;
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
				
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Invalid use, castaway! Try: /whois <name>");
					
				}else if(args.length == 1) {
					
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Stats for " + targetPlayer.getName());
					player.sendMessage(ChatColor.AQUA + "Current Oxygen Level:" + ChatColor.LIGHT_PURPLE + targetPlayer.getExp());
					player.sendMessage(ChatColor.AQUA + "Current Food Level:" + ChatColor.LIGHT_PURPLE + targetPlayer.getFoodLevel());
					player.sendMessage(ChatColor.AQUA + "Last Played:" + ChatColor.LIGHT_PURPLE + targetPlayer.getLastPlayed());
					player.sendMessage(ChatColor.AQUA + "Current Player Time:" + ChatColor.LIGHT_PURPLE + targetPlayer.getPlayerTime());
					
				}
				
			}
			
		}
		return false;
	}

}
