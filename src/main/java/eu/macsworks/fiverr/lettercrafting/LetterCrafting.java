/**
    LetterCrafting developed by Macs @ MacsWorks.eu in 2024
**/

package eu.macsworks.fiverr.lettercrafting;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LetterCrafting extends JavaPlugin {

    private static LetterCrafting instance = null;
    public static LetterCrafting getInstance() { return LetterCrafting.instance; }
    private static void setInstance(LetterCrafting in) { LetterCrafting.instance = in; }

    @Getter private PluginLoader macsPluginLoader;

    @Override
    public void onEnable() {
        setInstance(this);

        macsPluginLoader = new PluginLoader();
        macsPluginLoader.load();

        loadTasks();
        loadEvents();
        loadCommands();

        Bukkit.getLogger().info("--------------------------------------");
        Bukkit.getLogger().info("LetterCrafting was made by the team at macsworks.eu!");
        Bukkit.getLogger().info("--------------------------------------");
    }

    private void loadTasks(){

    }

    private void loadEvents(){
        
    }

    private void loadCommands(){

    }

    @Override
    public void onDisable() {
        macsPluginLoader.save();

        Bukkit.getLogger().info("--------------------------------------");
        Bukkit.getLogger().info("LetterCrafting was made by the team at macsworks.eu!");
        Bukkit.getLogger().info("--------------------------------------");
    }
}
