package me.dinosphere.FurryCat;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.dinosphere.FurryCat.oxygenHandler.actionbarOxygenHandler;


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
		
		PluginDescriptionFile pdfFile = this.getDescription();
		FurryCat.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() +  "has been enabled. Starting Fallout..");
		
		actionbarOxygenHandler.hairyDog();
		
		
	
	}
}
