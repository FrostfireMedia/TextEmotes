package io.frostfire.textemotes.commands;

import io.frostfire.textemotes.TextEmotesPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnflipCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player sPlayer = (Player) sender;
            String message = "";

            if (args.length > 0) {
                for (String arg : args) {
                    message = message + arg + " ";
                }
            }
            message = message + "┬─┬ ノ( ゜-゜ノ)";

            for (Player player : TextEmotesPlugin.plugin.getServer().getOnlinePlayers()) {
                player.sendMessage("<" + sPlayer.getDisplayName() + "> " + message);
            }
        } else {
            sender.sendMessage("COMMAND MUST BE PERFORMED AS PLAYER.");
        }
        return true;
    }

}
