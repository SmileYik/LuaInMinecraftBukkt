package tk.smileyik.luainminecraftbukkit.bridge.event.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.BatToggleSleepEvent;
import tk.smileyik.luainminecraftbukkit.plugin.event.LuaEvent;

public class LuaBatToggleSleepEvent extends LuaEvent<BatToggleSleepEvent> {

  public LuaBatToggleSleepEvent(String id) {super(id);}

  @EventHandler
  public void event(BatToggleSleepEvent e) {super.event(e);}
}