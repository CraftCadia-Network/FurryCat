package me.dinosphere.FurryCat.actionBar;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;

public class ActionBar implements Listener{
	private PacketPlayOutChat packet;
	
	
	public ActionBar(String message) {
		
		PacketPlayOutChat packet = new PacketPlayOutChat(ChatSerializer.a("{\"text\":\"" + message + "\"}"));
		this.packet = packet;
		
	}
	
	public void Send(Player player) {
		
		((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		
		
		ActionBar ab = new ActionBar("§fCurrent Oxygen: " + "§a▌▌▌▌▌▌▌▌▌▌▌▌");
		ab.Send(player);
	}
	
}
