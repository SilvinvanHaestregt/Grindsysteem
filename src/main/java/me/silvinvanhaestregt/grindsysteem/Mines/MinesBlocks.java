package me.silvinvanhaestregt.grindsysteem.Mines;

import me.silvinvanhaestregt.grindsysteem.Currency.Grindxp;
import me.silvinvanhaestregt.grindsysteem.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class MinesBlocks implements Listener{

    private Main plugin;

    public MinesBlocks(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        Player player = event.getPlayer();
        final org.bukkit.block.Block block = event.getBlock();

        if(player.getGameMode().equals(GameMode.SURVIVAL)){
            if(player.getInventory().getItemInMainHand().getType().equals((Material.IRON_PICKAXE))){
                if(block.getType().equals(Material.COAL_ORE)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.BEDROCK);
                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> event.getBlock().setType(Material.COAL_ORE), 50*20);
                } else if(block.getType().equals(Material.IRON_ORE)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.BEDROCK);
                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> event.getBlock().setType(Material.IRON_ORE), 50*20);
                } else if(block.getType().equals(Material.GOLD_ORE)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.BEDROCK);
                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> event.getBlock().setType(Material.GOLD_ORE), 50*20);
                } else if(block.getType().equals(Material.LAPIS_ORE)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.BEDROCK);
                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> event.getBlock().setType(Material.LAPIS_ORE), 50*20);
                } else if(block.getType().equals(Material.DIAMOND_ORE)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.BEDROCK);
                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> event.getBlock().setType(Material.DIAMOND_ORE), 50*20);
                } else if(block.getType().equals(Material.EMERALD_ORE)){
                    event.setCancelled(true);
                    event.getBlock().setType(Material.BEDROCK);
                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> event.getBlock().setType(Material.EMERALD_ORE), 50*20);
                }
            } else {
                event.setCancelled(true);
            }
        } else if(player.getGameMode().equals(GameMode.CREATIVE)){
            if(!player.hasPermission("mines.break")){
                player.sendMessage(ChatColor.RED + "Je hebt hier geen permissies voor!");
            }
        }
    }
}
