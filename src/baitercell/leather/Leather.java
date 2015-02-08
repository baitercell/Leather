package baitercell.leather;

import org.bukkit.plugin.java.JavaPlugin;

public class Leather extends JavaPlugin {

	public void onEnable() {
		new OwnEventListener(this);
	}
	public void onDisable() {}
}