package me.silvinvanhaestregt.grindsysteem.Currency;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Grindxp implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("grindxp")){
                if(player.hasPermission("grindsysteem.grindxp")){

                }
            }
        }
        return false;
    }
}
