package me.dinosphere.FurryCat;

import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.dinosphere.FurryCat.commands.SetSpawnCommand;
import me.dinosphere.FurryCat.commands.SpawnCommand;



public class FurryCat extends JavaPlugin implements Listener{


	public final Logger logger = Logger.getLogger("Minecraft");
	public static FurryCat plugin;
	public HashMap<UUID,PermissionAttachment> playerPermissions = new HashMap<>();
	// Console Message (When Turned Off)	
	@Override
	public void onDisable() {
		
		PluginDescriptionFile pdfFile = this.getDescription();
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "--------------------oOo--------------------\n\nFurryCat Disabled..\n\n--------------------oOo--------------------");
		
	}
	// Console Message (When Turned On)
	@Override
	public void onEnable() {
		plugin = this;
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		this.getServer().getPluginManager().registerEvents(this, this);
		cmdExecutor();
		this.saveDefaultConfig();
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--------------------oOo--------------------\n\nFurryCat Loaded.\n\n--------------------oOo--------------------");
		
	}
	public void cmdExecutor() {	
		this.getCommand("setspawn").setExecutor((CommandExecutor)new SetSpawnCommand());
		this.getCommand("spawn").setExecutor((CommandExecutor)new SpawnCommand());
	}
	
}
