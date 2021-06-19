package org.krown.spigot.plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.krown.spigot.plugin.commands.CoordsCommand;
import org.krown.spigot.plugin.commands.HelloCommand;

/**
 * Hello world!
 *
 */
public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        new HelloCommand(this);
        new CoordsCommand(this);
    }
}
