package me.dinosphere.FurryCat;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.dinosphere.FurryCat.actionBar.ActionBar;
import me.dinosphere.FurryCat.oxygenHandler.oxygenChat;
import me.dinosphere.FurryCat.oxygenHandler.oxygenLevel;


public class FurryCat extends JavaPlugin{


	
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
			
	}
}
