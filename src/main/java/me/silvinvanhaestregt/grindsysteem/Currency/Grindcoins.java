package me.silvinvanhaestregt.grindsysteem.Currency;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Grindcoins implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("grindcoins")){
                if(player.hasPermission("grindsysteem.grindcoins")){

                }
            }
        }
        return false;
    }
}