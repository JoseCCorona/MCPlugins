package org.krown.spigot.plugin.commands;
import org.krown.spigot.plugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor{

    @SuppressWarnings("unused")
    private Main plugin;

    public HelloCommand(Main plugin){
        this.plugin=plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            sender.sendMessage("Only players may execute this command.");
            return true;
        }

        Player p = (Player) sender;

        if(p.hasPermission("hello.use")){
            p.sendMessage("Hi!");
            return true;
        }else{
            p.sendMessage("You don't have permission to execute this command.");
        }
        return false;
    }
    
}
