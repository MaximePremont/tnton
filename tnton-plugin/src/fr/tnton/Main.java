package fr.tnton;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static TntonPlugin plugin;
	
	public void onEnable() {
		
		plugin = new TntonPlugin(this);
		
	}
	
	public void onDisable() {
		
		plugin.disable();
		
	}

}
