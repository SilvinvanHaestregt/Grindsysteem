package me.silvinvanhaestregt.grindsysteem;

import me.silvinvanhaestregt.grindsysteem.Farms.Block;
import me.silvinvanhaestregt.grindsysteem.Mines.MinesBlocks;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){

        // Add commands
        this.getCommand("grindcoins").setExecutor(new Commands());
        this.getCommand("grindxp").setExecutor(new Commands());
        this.getCommand("testmessage").setExecutor(new Commands());
        // Event listeners
        getServer().getPluginManager().registerEvents(new Block(this), this);
        getServer().getPluginManager().registerEvents(new MinesBlocks(this), this);

        // Config
    }

    @Override
    public void onDisable(){

    }
}
