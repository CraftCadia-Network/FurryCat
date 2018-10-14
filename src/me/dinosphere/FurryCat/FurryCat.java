package me.dinosphere.FurryCat;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

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
		
		PluginDescriptionFile pdfFile = this.getDescription();
		FurryCat.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() +  "has been enabled. Starting Fallout..");
		
		// Now changed to using Player XP for the Oxygen meter.
		try {
			oxygenLevel.dinosaur();
		} catch (InterruptedException e) {
			// i didn't make this xD
			e.printStackTrace();
		}
	}
		
		
	
}
