package me.dinosphere.FurryCat;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class FurryCat extends JavaPlugin implements Listener{


	
	public static Logger logger = Logger.getLogger("Minecraft");
	public static FurryCat plugin;
	public final Location[] warpLocations = new Location[100];
	public final String[] warpNames = new String[100];
	public int warpCounter = 0;
	
	// Console Message (When Turned Off)	
	@Override
	public void onDisable() {
		
		PluginDescriptionFile pdfFile = this.getDescription();
		FurryCat.logger.info(pdfFile.getName() + " has been disabled.");
		
	}
	// Console Message (When Turned On)
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		FurryCat.logger.info(pdfFile.getName() + " has been enabled.");
		this.getServer().getPluginManager().registerEvents(this, this);
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		
		
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("setwarp")) {
			
			if(args.length == 0){
				
				player.sendMessage(ChatColor.RED + "/setwarp <warpname>");
				
			}else {
				
				Location location = player.getLocation();
				if(!(warpCounter > 100)) {
					
					warpLocations[warpCounter] = location;
					warpNames[warpCounter] = args[0];
					warpCounter++;
					player.sendMessage(ChatColor.GREEN + "Warp Set As: " + args[0]);
				}else {
					
					player.sendMessage(ChatColor.RED + "Warp Limit Exceeded! Unable to Create Warp!");
					
				}
				
			}
			
		}else if(commandLabel.equalsIgnoreCase("warpe")) {
			
			for(int i = 0; i < warpNames.length; i++) {
				
				String warpName = warpNames[i];
				if(args[0].equalsIgnoreCase(warpName)) {
					
					Location warpLocation = warpLocations[i];
					player.teleport(warpLocation);
					player.sendMessage(ChatColor.GREEN + "Teleported To " + warpName);
					break;
					
					
				}
				
			}
			
		}else if(commandLabel.equalsIgnoreCase("warpes")) {
			
			String warps = "";
			for(int i = 0; i < warpNames.length; i++) {
				
				if(i != warpNames.length) {
					
					warps+= warpNames[i] + ". ".replace("null", "");
					
					
				}else {
					player.sendMessage(ChatColor.YELLOW + "Showing All Warps: " + ChatColor.AQUA + warps);
				}
				
			}
			
		}
		
		
		return false;
	}
	
}
