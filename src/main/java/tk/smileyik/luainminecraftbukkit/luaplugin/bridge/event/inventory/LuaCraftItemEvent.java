package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.CraftItemEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaCraftItemEvent extends LuaEvent<CraftItemEvent> {

  public LuaCraftItemEvent(String id) {super(id);}

  @EventHandler
  public void event(CraftItemEvent e) {super.event(e);}
}