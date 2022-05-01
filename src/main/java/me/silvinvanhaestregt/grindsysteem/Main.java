package me.silvinvanhaestregt.grindsysteem;

import me.silvinvanhaestregt.grindsysteem.Currency.Grindcoins;
import me.silvinvanhaestregt.grindsysteem.Currency.Grindxp;
import me.silvinvanhaestregt.grindsysteem.Farms.Block;
import me.silvinvanhaestregt.grindsysteem.Mines.MinesBlocks;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

public class Main extends JavaPlugin implements Listener {

    public static Main instance;
    private File userFolder;
    private HashMap<UUID, YamlConfiguration> usersConfig = new HashMap<>();

    public static Main getInstance(){
        return Main.instance;
    }

    @Override
    public void onEnable(){

        // Add commands
        this.getCommand("grindcoins").setExecutor(new Grindcoins());
        this.getCommand("grindxp").setExecutor(new Grindxp());
        // Event listeners
        getServer().getPluginManager().registerEvents(new Block(this), this);
        getServer().getPluginManager().registerEvents(new MinesBlocks(this), this);

        // Config

        saveDefaultConfig();

        // Folders
        userFolder = new File(getDataFolder(), "users");
        userFolder.mkdirs();
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable(){

    }

    public void onPlayerJoin(PlayerJoinEvent event){
        File userFile = new File(userFolder, event.getPlayer() + ".yml");
        if(!userFile.exists()){
            try{
                userFile.createNewFile();
            } catch (IOException ex){

            }
        }
        usersConfig.put(event.getPlayer().getUniqueId(), YamlConfiguration.loadConfiguration(userFile));
    }

}
