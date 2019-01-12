package me.dinosphere.FurryCat.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
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
				
				if(plugin.getConfig().getConfigurationSection("spawn") == null) {
					
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "The spawn has not been set yet.");
					
				}
				
				if(args.length == 0) {
					
					World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("spawn.world"));
					double x = plugin.getConfig().getDouble("spawn.x");
					double y = plugin.getConfig().getDouble("spawn.y");
					double z = plugin.getConfig().getDouble("spawn.z");
					player.teleport(new Location(w, x, y, z));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Sending you to spawn.");
					
				}else if(args.length == 1) {

					World w = Bukkit.getServer().getWorld(plugin.getConfig().getString("spawn.world"));
					double x = plugin.getConfig().getDouble("spawn.x");
					double y = plugin.getConfig().getDouble("spawn.y");
					double z = plugin.getConfig().getDouble("spawn.z");
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
					targetPlayer.teleport(new Location(w, x, y, z));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "Fallout" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.YELLOW + player.getName() + ChatColor.GREEN + " has sent you to spawn.");
					
				}
				
			}
			
		}
		
		
		return false;
	}

}
