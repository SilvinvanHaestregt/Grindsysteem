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
                if(args.length > 0) {
                    if (player.hasPermission("grindsysteem.grindxp")) {
                        if(args[0].equalsIgnoreCase("set")){
                            // Set the amount of grindxp a player has
                        } else if (args[0].equalsIgnoreCase("add")) {
                            // Give a certain amount of grindxp to a player
                        } else if (args[0].equalsIgnoreCase("remove")) {
                            // Remove a certain amount of grindxp from a player
                        }
                    }
                } else {
                    // Show the amount of grindxp a player has
                }
            }
        }
        return false;
    }
}
