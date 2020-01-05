package cc.taber.fallout.commands;

import cc.taber.fallout.util.Colorize;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComamndFly implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("fly")){
            if(args.length == 0){
                if(player.getAllowFlight() == false){
                    player.setFlying(true);
                    player.setAllowFlight(true);
                    player.sendMessage(Colorize.colorize("&d[&bCadiaHQ&d] &aFlight has been enabled."));

                }
               if(player.getAllowFlight() == true){
                   player.setFlying(false);
                   player.setAllowFlight(false);
                   player.sendMessage(Colorize.colorize("&d[&bCadiaHQ&d] &aFlight has been disabled."));
               }

            }
            if(args.length == 1){

                Player target = Bukkit.getServer().getPlayer(args[0]);
                if(target.getAllowFlight() == false){
                    target.setFlying(true);
                    target.setAllowFlight(true);
                    target.sendMessage(Colorize.colorize("&d[&bCadiaHQ&d] &aFlight has been enabled."));
                }
                if(target.getAllowFlight() == true){
                    target.setFlying(false);
                    target.setAllowFlight(false);
                    target.sendMessage(Colorize.colorize("&d[&bCadiaHQ&d] &aFlight has been disabled."));
                }
            }
        }

            return false;
    }
}
