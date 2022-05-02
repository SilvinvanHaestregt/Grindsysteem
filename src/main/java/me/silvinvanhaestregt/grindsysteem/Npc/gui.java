package me.silvinvanhaestregt.grindsysteem.Npc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class gui implements Listener, CommandExecutor {

    public Inventory inv;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            if(cmd.getName().equalsIgnoreCase("gui")){
                Player player = (Player) sender;

                inv = Bukkit.createInventory(player, 45, "Grind Villager");

                // Coal

                ItemStack coal = new ItemStack(Material.COAL_ORE);
                ItemMeta coalMeta = coal.getItemMeta();

                // 1 Coal
                coalMeta.setDisplayName("Coal");
                List<String> coal1 = new ArrayList<>();
                coal1.add("Coal");
                coal1.add("3 Euro per stuk");
                coalMeta.setLore(coal1);
                coal.setItemMeta(coalMeta);
                coal.setAmount(1);
                inv.setItem(0, coal);

                // 16 Coal
                coalMeta.setDisplayName("Coal");
                List<String> coal16 = new ArrayList<>();
                coal16.add("Coal");
                coal16.add("32 Euro"); // Kijk naar de lore op DDG om deze nog te verbeteren
                coalMeta.setLore(coal16);
                coal.setItemMeta(coalMeta);
                coal.setAmount(16);
                inv.setItem(1, coal);


                // Iron

                ItemStack iron = new ItemStack(Material.IRON_ORE);
                ItemMeta ironMeta = iron.getItemMeta();

                // 1 Iron
                ironMeta.setDisplayName("Iron");
                List<String> iron1 = new ArrayList<>();
                iron1.add("Iron");
                iron1.add("3 Euro per stuk");
                ironMeta.setLore(iron1);
                iron.setItemMeta(ironMeta);
                iron.setAmount(1);
                inv.setItem(2, iron);

                // 16 Iron
                ironMeta.setDisplayName("Iron");
                List<String> iron16 = new ArrayList<>();
                iron16.add("Iron");
                iron16.add("32 Euro"); // Kijk naar de lore op DDG om deze nog te verbeteren
                ironMeta.setLore(iron16);
                iron.setItemMeta(ironMeta);
                iron.setAmount(16);
                inv.setItem(3, iron);


                // Gold

                ItemStack gold = new ItemStack(Material.GOLD_ORE);
                ItemMeta goldMeta = gold.getItemMeta();

                // 1 Gold
                goldMeta.setDisplayName("Gold");
                List<String> gold1 = new ArrayList<>();
                gold1.add("Gold");
                gold1.add("3 Euro per stuk");
                goldMeta.setLore(gold1);
                gold.setItemMeta(goldMeta);
                gold.setAmount(1);
                inv.setItem(4, gold);

                // 16 Gold
                goldMeta.setDisplayName("Gold");
                List<String> gold16 = new ArrayList<>();
                gold16.add("Gold");
                gold16.add("32 Euro"); // Kijk naar de lore op DDG om deze nog te verbeteren
                goldMeta.setLore(gold16);
                gold.setItemMeta(goldMeta);
                gold.setAmount(16);
                inv.setItem(5, gold);


                // Lapis Lazuli

                ItemStack lapis = new ItemStack(Material.LAPIS_ORE);
                ItemMeta lapisMeta = lapis.getItemMeta();

                // 1 Lapis Lazuli
                lapisMeta.setDisplayName("Lapis Lazuli");
                List<String> lapis1 = new ArrayList<>();
                lapis1.add("Coal");
                lapis1.add("3 Euro per stuk");
                lapisMeta.setLore(lapis1);
                lapis.setItemMeta(lapisMeta);
                lapis.setAmount(1);
                inv.setItem(6, lapis);

                // 16 Lapis Lazuli
                lapisMeta.setDisplayName("Lapis Lazuli");
                List<String> lapis16 = new ArrayList<>();
                lapis16.add("Coal");
                lapis16.add("32 Euro"); // Kijk naar de lore op DDG om deze nog te verbeteren
                lapisMeta.setLore(lapis16);
                lapis.setItemMeta(lapisMeta);
                lapis.setAmount(16);
                inv.setItem(7, lapis);


                // Diamond

                ItemStack diamond = new ItemStack(Material.DIAMOND_ORE);
                ItemMeta diamondMeta = diamond.getItemMeta();

                // 1 Diamond
                diamondMeta.setDisplayName("Diamond");
                List<String> diamond1 = new ArrayList<>();
                diamond1.add("Diamond");
                diamond1.add("3 Euro per stuk");
                diamondMeta.setLore(diamond1);
                diamond.setItemMeta(diamondMeta);
                diamond.setAmount(1);
                inv.setItem(8, diamond);

                // 16 Diamond
                diamondMeta.setDisplayName("Diamond");
                List<String> diamond16 = new ArrayList<>();
                diamond16.add("Diamond");
                diamond16.add("32 Euro"); // Kijk naar de lore op DDG om deze nog te verbeteren
                diamondMeta.setLore(diamond16);
                diamond.setItemMeta(diamondMeta);
                diamond.setAmount(16);
                inv.setItem(9, diamond);


                // Emerald

                ItemStack emerald = new ItemStack(Material.EMERALD_ORE);
                ItemMeta emeraldMeta = emerald.getItemMeta();

                // 1 Emerald
                emeraldMeta.setDisplayName("Emerald");
                List<String> emerald1 = new ArrayList<>();
                emerald1.add("Emerald");
                emerald1.add("3 Euro per stuk");
                emeraldMeta.setLore(emerald1);
                emerald.setItemMeta(emeraldMeta);
                emerald.setAmount(1);
                inv.setItem(10, emerald);

                // 16 Emerald
                emeraldMeta.setDisplayName("Emerald");
                List<String> emerald16 = new ArrayList<>();
                emerald16.add("Emerald");
                emerald16.add("32 Euro"); // Kijk naar de lore op DDG om deze nog te verbeteren
                emeraldMeta.setLore(emerald16);
                emerald.setItemMeta(emeraldMeta);
                emerald.setAmount(16);
                inv.setItem(11, emerald);


                player.openInventory(inv);
                return true;
            }
        }
        return false;
    }

    @EventHandler
    public void onPlayerClickInventory(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        if(event.getView().getTitle().equals("Grind Villager")) {
            event.setCancelled(true);
            if (event.getCurrentItem().getItemMeta() != null) {
                if (event.isRightClick()) {

                    // Coal

                    if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Coal")) {
                        if (event.getCurrentItem().getAmount() == 1) {
                            if (player.getInventory().contains(Material.COAL_ORE, 1)) {
                                player.getInventory().removeItem(new ItemStack(Material.COAL_ORE, 1));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        } else if (event.getCurrentItem().getAmount() == 16) {
                            if (player.getInventory().contains(Material.COAL_ORE, 16)) {
                                player.getInventory().removeItem(new ItemStack(Material.COAL_ORE, 16));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        }

                        // Iron

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Iron")) {
                        if (event.getCurrentItem().getAmount() == 1) {
                            if (player.getInventory().contains(Material.IRON_ORE, 1)) {
                                player.getInventory().removeItem(new ItemStack(Material.IRON_ORE, 1));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        } else if (event.getCurrentItem().getAmount() == 16) {
                            if (player.getInventory().contains(Material.IRON_ORE, 16)) {
                                player.getInventory().removeItem(new ItemStack(Material.IRON_ORE, 16));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        }

                        // Gold

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Gold")) {
                        if (event.getCurrentItem().getAmount() == 1) {
                            if (player.getInventory().contains(Material.GOLD_ORE, 1)) {
                                player.getInventory().removeItem(new ItemStack(Material.GOLD_ORE, 1));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        } else if (event.getCurrentItem().getAmount() == 16) {
                            if (player.getInventory().contains(Material.GOLD_ORE, 16)) {
                                player.getInventory().removeItem(new ItemStack(Material.GOLD_ORE, 16));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        }

                        // Lapis Lazuli

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Lapis Lazuli")) {
                        if (event.getCurrentItem().getAmount() == 1) {
                            if (player.getInventory().contains(Material.LAPIS_ORE, 1)) {
                                player.getInventory().removeItem(new ItemStack(Material.LAPIS_ORE, 1));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        } else if (event.getCurrentItem().getAmount() == 16) {
                            if (player.getInventory().contains(Material.LAPIS_ORE, 16)) {
                                player.getInventory().removeItem(new ItemStack(Material.LAPIS_ORE, 16));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        }

                        // Diamond

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Diamond")) {
                        if (event.getCurrentItem().getAmount() == 1) {
                            if (player.getInventory().contains(Material.DIAMOND_ORE, 1)) {
                                player.getInventory().removeItem(new ItemStack(Material.DIAMOND_ORE, 1));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        } else if (event.getCurrentItem().getAmount() == 16) {
                            if (player.getInventory().contains(Material.DIAMOND_ORE, 16)) {
                                player.getInventory().removeItem(new ItemStack(Material.DIAMOND_ORE, 16));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        }

                        // Emerald

                    } else if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Emerald")) {
                        if (event.getCurrentItem().getAmount() == 1) {
                            if (player.getInventory().contains(Material.EMERALD_ORE, 1)) {
                                player.getInventory().removeItem(new ItemStack(Material.EMERALD_ORE, 1));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        } else if (event.getCurrentItem().getAmount() == 16) {
                            if (player.getInventory().contains(Material.EMERALD_ORE, 16)) {
                                player.getInventory().removeItem(new ItemStack(Material.EMERALD_ORE, 16));
                            } else {
                                player.closeInventory();
                                player.sendMessage(ChatColor.RED + "Je hebt niet genoeg!");
                            }
                        }
                    }
                }
            }
        }
    }

}
