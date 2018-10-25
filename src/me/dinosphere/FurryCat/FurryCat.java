package me.dinosphere.FurryCat;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



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
		this.getServer().getPluginManager().registerEvents(this, this);
		
	}
}
