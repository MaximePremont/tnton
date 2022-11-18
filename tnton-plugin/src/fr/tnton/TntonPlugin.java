package fr.tnton;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class TntonPlugin {
	
	private Plugin plugin;
	
	public TntonPlugin(Plugin plugin) {
		this.plugin = plugin;
		
		log("§aPlugin enabled");
	}
	
	public void disable() {
		log("§eKicking player for game reset");
		for (Player players : Bukkit.getOnlinePlayers())
			players.kickPlayer("§e§lThe game is restarting...");
		log("§6Plugin disabled");
	}
	
	private void log(String message) {
		String prefix = "§b[§eTNTON§b] §r";
		Bukkit.getConsoleSender().sendMessage(prefix+message);
	}

}
