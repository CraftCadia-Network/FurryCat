package cc.taber.fallout.util;

import org.bukkit.ChatColor;

public class Colorize {

    public static String colorize(String old){

        return ChatColor.translateAlternateColorCodes('&', old);
    }

}
