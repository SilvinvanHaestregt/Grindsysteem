package me.silvinvanhaestregt.grindsysteem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("grindcoins")){
                // args.length needs to be changed from 1 to 3
                if(args.length > 0){
                    if(args[0].equalsIgnoreCase("set")){
                        sender.sendMessage("Grindcoins set command");
                    } else if (args[0].equalsIgnoreCase("remove")) {
                        sender.sendMessage("Grindcoins remove command");
                    } else if (args[0].equalsIgnoreCase("add")) {
                        sender.sendMessage("Grindcoins add command");
                    }
                    return true;
                }
            } else if (cmd.getName().equalsIgnoreCase("grindxp")) {
                if(args.length > 0){
                    if(args[0].equalsIgnoreCase("set")){
                        sender.sendMessage("Grindxp set command");
                    } else if (args[0].equalsIgnoreCase("remove")) {
                        sender.sendMessage("Grindxp remove command");
                    } else if (args[0].equalsIgnoreCase("add")) {
                        sender.sendMessage("Grindxp add command");
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
