package me.Ethan.wizardbattles;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public String Name = ChatColor.GOLD + "[WIZARD BATTLES]";
	
	//=====
	
	public void onEnable(){
		getLogger().info(Name + ChatColor.GREEN + " has been enabled");
	}
	
	public void onDisable(){
		getLogger().info(Name + ChatColor.RED + " has been disabled");
	}
	
	
	
}
