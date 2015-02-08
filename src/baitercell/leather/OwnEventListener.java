package baitercell.leather;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public final class OwnEventListener implements Listener {
	
	public Plugin plugin;
	
	public OwnEventListener(Plugin instance) {
		plugin = instance;
		Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void PLE (PlayerJoinEvent event){
		ItemStack is1 = new ItemStack(Material.LEATHER_BOOTS, 1);
		ItemStack is2 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		ItemStack is3 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		
		event.getPlayer().getInventory().setBoots(is1);
		event.getPlayer().getInventory().setChestplate(is2);
		event.getPlayer().getInventory().setLeggings(is3); 
	}
	
	@EventHandler
	public void PIE (InventoryClickEvent event){
		if(event.getRawSlot() == 8 || event.getRawSlot() == 7 || event.getRawSlot() == 6){
			event.setCancelled(true);
		}
	}
}