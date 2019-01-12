package me.dinosphere.FurryCat.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dinosphere.FurryCat.FurryCat;

public class SpawnCommand implements CommandExecutor{

	public static FurryCat plugin;
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			
			sender.sendMessage(ChatColor.RED + "This command can only be executed by fallout refugees.");
			
		}
		
		Player player = (Player) sender;
		
		
		
		if(label.equalsIgnoreCase("spawn")) {
			
			if(player.hasPermission("fallout.spawn")) {
				
				if(args.length == 0) {
					
					int x = plugin.getConfig().getInt("spawn.x"), y = plugin.getConfig().getInt("spawn.y"), z = plugin.getConfig().getInt("spawn.z");
					player.teleport(new Location(player.getWorld(), x, y, z));
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
