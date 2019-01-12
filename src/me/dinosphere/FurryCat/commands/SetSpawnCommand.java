package me.dinosphere.FurryCat.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dinosphere.FurryCat.FurryCat;

public class SetSpawnCommand implements CommandExecutor{

	public static FurryCat plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if(label.equalsIgnoreCase("setspawn")) {
			
			if(player.hasPermission("fallout.setspawn")) {
				
				plugin.getConfig().set("spawn.x", player.getLocation().getBlockX());
				plugin.getConfig().set("spawn.y", player.getLocation().getBlockY());
				plugin.getConfig().set("spawn.z", player.getLocation().getBlockZ());
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Spawn has been set.");
			}
			
		}
		
		
		return false;
	}
	
	
}
