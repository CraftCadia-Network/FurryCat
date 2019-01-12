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
				plugin.getConfig().set("spawn.world", player.getLocation().getWorld());
				plugin.getConfig().set("spawn.x", player.getLocation().getX());
				plugin.getConfig().set("spawn.y", player.getLocation().getY());
				plugin.getConfig().set("spawn.z", player.getLocation().getZ());
				plugin.saveConfig();
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Spawn has been set.");
			}
			
		}
		
		
		return false;
	}
	
	
}
