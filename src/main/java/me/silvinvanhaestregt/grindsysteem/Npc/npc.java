package me.silvinvanhaestregt.grindsysteem.Npc;

import org.bukkit.entity.Entity;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class npc implements Listener {


    @EventHandler
    public void PlayerRightClick(PlayerInteractEntityEvent event){
        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();

        if(entity instanceof NPC && entity.getCustomName().equalsIgnoreCase("Grind Villager")){
            player.sendMessage("Gelukt");
        }
    }
}
