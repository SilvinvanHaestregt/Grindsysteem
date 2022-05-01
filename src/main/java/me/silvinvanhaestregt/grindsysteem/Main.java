package me.silvinvanhaestregt.grindsysteem;

import me.silvinvanhaestregt.grindsysteem.Currency.Grindcoins;
import me.silvinvanhaestregt.grindsysteem.Currency.Grindxp;
import me.silvinvanhaestregt.grindsysteem.Farms.Block;
import me.silvinvanhaestregt.grindsysteem.Mines.MinesBlocks;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){

        // Add commands
        this.getCommand("grindcoins").setExecutor(new Grindcoins());
        this.getCommand("grindxp").setExecutor(new Grindxp());
        // Event listeners
        getServer().getPluginManager().registerEvents(new Block(this), this);
        getServer().getPluginManager().registerEvents(new MinesBlocks(this), this);

        // Config
    }

    @Override
    public void onDisable(){

    }
}
