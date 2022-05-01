package me.silvinvanhaestregt.grindsysteem;

import org.bukkit.event.Listener;

public class Grindsysteem implements Listener{

}

//
//public final class Grindsysteem extends JavaPlugin implements Listener {
//
//    private File customConfigFile;
//    private FileConfiguration customConfig;
//
//    @Override
//    public void onEnable() {
//        //
//
//
//        // Plugin startup logic
//        getServer().getPluginManager().registerEvents(this, this);
//    }
//
//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }
//
//
//
//
//
//
//    public int GrindCoins;
//    public int GrindXp;
//
//    @EventHandler
//    public void onWalk(PlayerMoveEvent event){
//        Player player = event.getPlayer();
//
//        Location loc = player.getLocation().add(0, -1, 0);
//        Block block = loc.getBlock().getRelative(BlockFace.DOWN);
//        block.setType(Material.FARMLAND);
//    }
//
//    @EventHandler
//    public void onInteract(PlayerInteractEvent event){
//        Player player = event.getPlayer();
//
//        if(event.getAction() == Action.LEFT_CLICK_BLOCK){
//            if(event.getClickedBlock().getType() == Material.DIRT){
//                event.getClickedBlock().setType(Material.FARMLAND);
//            }
//        }
//    }
//
//    @EventHandler
//    public void onBlockBreakEvent(BlockBreakEvent event){
//        Player player = event.getPlayer();
//        final Block block = event.getBlock();
//
//        if(player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_HOE)){
//            if(block.getType().equals(Material.WHEAT) && block.getData() == (byte) 7){
//                event.setCancelled(true);
//                event.getBlock().setType(Material.WHEAT);
//                GrindCoins += 1;
//                GrindXp += 5;
//                if(config.getBoolean("grindcoins.message")){
//                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 1 " + ChatColor.GOLD + "Grindcoin(s) ontvangen!");
//                }
//                if(config.getBoolean("grindxp.message")){
//                    player.sendMessage(ChatColor.GOLD + "Je hebt" + ChatColor.YELLOW + " 5 " + ChatColor.GOLD + "Grindxp ontvangen!");
//                }
//            }
//        }
//    }
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
//
//        if(sender instanceof Player){
//            Player player = (Player) sender;
//
//            if(cmd.getName().equalsIgnoreCase("grindcoins")){
//                if(args.length > 2){
//                    if(args[0].equalsIgnoreCase("message")){
//                        if(args[1].equalsIgnoreCase("aan")){
//                            GrindCoinsMessage = true;
//                            player.sendMessage("Je hebt de messages aan gezet!");
//                            return true;
//                        } else if(args[1].equalsIgnoreCase("uit")){
//                            GrindCoinsMessage = false;
//                            player.sendMessage("Je hebt de messages uit gezet!");
//                            return true;
//                        }
//                    }
//                }
//            } else if(cmd.getName().equalsIgnoreCase("grindxp")){
//                if(args.length > 2){
//                    if(args[0].equalsIgnoreCase("message")){
//                        if(args[1].equalsIgnoreCase("aan")){
//                            GrindXpMessage = true;
//                            player.sendMessage("Je hebt de messages aan gezet!");
//                            return true;
//                        } else if(args[1].equalsIgnoreCase("uit")){
//                            GrindXpMessage = false;
//                            player.sendMessage("Je hebt de messages uit gezet!");
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}
