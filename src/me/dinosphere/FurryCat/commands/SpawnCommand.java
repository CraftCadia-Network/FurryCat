package me.dinosphere.FurryCat.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			
			sender.sendMessage(ChatColor.RED + "This command can only be executed by fallout refugees.");
			
		}
		
		Player player = (Player) sender;
		
		if(label.equalsIgnoreCase("setspawn")) {
			
			if(player.hasPermission("fallout.setspawn")) {
				
				player.getWorld().setSpawnLocation(player.getLocation().getBlockX(), player.getLocation().getBlockZ(), player.getLocation().getBlockY());
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Spawn has been set.");
			}
			
		}
		
		if(label.equalsIgnoreCase("spawn")) {
			
			if(player.hasPermission("fallout.spawn")) {
				
				if(args.length == 0) {
					
					player.teleport(player.getWorld().getSpawnLocation());
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Sending you to spawn.");
					
				}else if(args.length == 1) {
					
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
					targetPlayer.teleport(targetPlayer.getWorld().getSpawnLocation());
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.YELLOW + player.getName() + ChatColor.GREEN + " has sent you to spawn.");
					
				}
				
			}
			
		}
		
		
		return false;
	}

}
