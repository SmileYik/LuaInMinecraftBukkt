package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.PrepareSmithingEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPrepareSmithingEvent extends LuaEvent<PrepareSmithingEvent> {

  public LuaPrepareSmithingEvent(String id) {super(id);}

  @EventHandler
  public void event(PrepareSmithingEvent e) {super.event(e);}
}