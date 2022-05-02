package me.silvinvanhaestregt.grindsysteem.Currency.Commands;

import me.silvinvanhaestregt.grindsysteem.Currency.Grindcoins;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GrindCoinsCommand implements CommandExecutor{

    private Grindcoins grindCoins;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("grindcoins")){
                if(args.length > 0) {
                    if (player.hasPermission("grindsysteem.grindcoins")) {
                        if(args[0].equalsIgnoreCase("set")){
                            // Set the amount of grindcoins a player has
                        } else if (args[0].equalsIgnoreCase("add")) {
                            // Give a certain amount of grindcoins to a player
                        } else if (args[0].equalsIgnoreCase("remove")) {
                            // Remove a certain amount of grindcoins from a player
                        }
                    } else {
                        // Show the amount of grindcoins a player has
                    }
                } else {
                    // Show the amount of grindcoins a player has
                }
            }
        }
        return false;
    }
}
