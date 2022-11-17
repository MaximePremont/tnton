package fr.tnton;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class TntonPlugin {
	
	private Plugin plugin;
	
	public TntonPlugin(Plugin plugin) {
		this.plugin = plugin;
		
		log("§aPlugin enabled");
	}
	
	public void disable() {
		log("§6Plugin disabled");
	}
	
	private void log(String message) {
		String prefix = "§b[§eTNTON§b] §r";
		Bukkit.getConsoleSender().sendMessage(prefix+message);
	}

}
