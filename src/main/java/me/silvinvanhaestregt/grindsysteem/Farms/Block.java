package me.silvinvanhaestregt.grindsysteem.Farms;

import me.silvinvanhaestregt.grindsysteem.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class Block implements Listener {
    int GrindXp;
    private Main plugin;

    public Block(Main plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event){
        Player player = event.getPlayer();
        ItemStack Item = new ItemStack(Material.WHEAT);
        final org.bukkit.block.Block block = event.getBlock();

        if(player.getGameMode().equals(GameMode.SURVIVAL)) {
            if (player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_HOE)) {
                if (block.getType().equals(Material.WHEAT) && block.getData() == (byte) 7) {
                    event.setCancelled(true);
                    event.getBlock().setType(Material.WHEAT);
                    player.getInventory().addItem(Item);
                    GrindXp += 5;
                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
                    new BukkitRunnable() {
                        public void run(){
                            player.sendMessage("neger");
                        }
                    }.runTaskLaterAsynchronously(plugin, 1);
                } else {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        } else if(player.getGameMode().equals(GameMode.CREATIVE)) {
            if(!player.hasPermission("farms.break")){
                player.sendMessage("Je hebt hier geen permissies voor!");
                event.setCancelled(true);
            }
        }
    }
}
