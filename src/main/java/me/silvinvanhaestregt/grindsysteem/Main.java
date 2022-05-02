package me.silvinvanhaestregt.grindsysteem;

import me.silvinvanhaestregt.grindsysteem.Currency.Commands.GrindCoinsCommand;
import me.silvinvanhaestregt.grindsysteem.Currency.Commands.GrindXpCommand;
import me.silvinvanhaestregt.grindsysteem.Farms.Block;
import me.silvinvanhaestregt.grindsysteem.Mines.MinesBlocks;
import me.silvinvanhaestregt.grindsysteem.Npc.gui;
import me.silvinvanhaestregt.grindsysteem.Npc.npc;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable(){

        // Add commands
        Objects.requireNonNull(this.getCommand("grindcoins")).setExecutor(new GrindCoinsCommand());
        Objects.requireNonNull(this.getCommand("grindxp")).setExecutor(new GrindXpCommand());
        Objects.requireNonNull(this.getCommand("gui")).setExecutor(new gui());

        // Event listeners
        getServer().getPluginManager().registerEvents(new Block(this), this);
        getServer().getPluginManager().registerEvents(new MinesBlocks(this), this);
        getServer().getPluginManager().registerEvents(new npc(), this);
        getServer().getPluginManager().registerEvents(new gui(), this);

        // Config
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable(){

    }
}
