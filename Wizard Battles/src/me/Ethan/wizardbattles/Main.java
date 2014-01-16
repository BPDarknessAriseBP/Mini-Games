package me.Ethan.wizardbattles;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
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
	
	//=====
	
	public void onPlayerJoin(PlayerJoinEvent evt) {
	    Player player = evt.getPlayer();
	    PlayerInventory inventory = player.getInventory(); 
	    ItemStack spawnitem = new ItemStack(Material.NETHER_STAR, 1);
	    
	    inventory.clear();
	    
	    inventory.addItem(spawnitem);
	    
	    
	}
	
	//=====
	
	
	
	//=====
	
}
