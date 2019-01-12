package me.dinosphere.FurryCat;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.dinosphere.FurryCat.commands.HealCommand;
import me.dinosphere.FurryCat.commands.SpawnCommand;



public class FurryCat extends JavaPlugin implements Listener{


	
	public static Logger logger = Logger.getLogger("Minecraft");
	public static FurryCat plugin;
	
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

		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
		
		this.getCommand("heal").setExecutor((CommandExecutor)new HealCommand());
		this.getCommand("setspawn").setExecutor((CommandExecutor)new SpawnCommand());
		this.getCommand("spawn").setExecutor((CommandExecutor)new SpawnCommand());
		return false;
	}
	
}
