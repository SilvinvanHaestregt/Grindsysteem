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
                if(args.length > 0){
                    if(player.hasPermission("grindsysteem.grindcoins")){
                        if(args[0].equalsIgnoreCase("set")){
                            // Set the amount of grindcoins a player has
                        } else if (args[0].equalsIgnoreCase("add")) {
                            // Give a certain amount of grindcoins to a player
                        } else if (args[0].equalsIgnoreCase("remove")) {
                            // Remove a certain amount of grindcoins from a player
                        }
                    }
                } else {
                    // Show the amount of grindcoins the player has
                }
            }
        }
        return false;
    }
}