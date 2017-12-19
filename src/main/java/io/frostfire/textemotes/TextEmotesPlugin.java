package io.frostfire.textemotes;

import io.frostfire.textemotes.commands.ShrugCommand;
import io.frostfire.textemotes.commands.TableflipCommand;
import io.frostfire.textemotes.commands.UnflipCommand;
import io.frostfire.textemotes.metrics.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class TextEmotesPlugin extends JavaPlugin {
    public static TextEmotesPlugin plugin;

    public TextEmotesPlugin() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this);

        this.getCommand("shrug").setExecutor(new ShrugCommand());
        this.getCommand("tableflip").setExecutor(new TableflipCommand());
        this.getCommand("unflip").setExecutor(new UnflipCommand());
    }

    @Override
    public void onDisable() {

    }
}
