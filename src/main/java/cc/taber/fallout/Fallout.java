package cc.taber.fallout;

import org.bukkit.plugin.java.JavaPlugin;

public class Fallout extends JavaPlugin {

    public static Fallout instance;

    @Override
    public void onEnable(){
        instance = this;
    }

    @Override
    public void onDisable(){
        instance = null;
    }

}
