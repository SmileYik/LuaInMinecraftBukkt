package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreeperPowerEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaCreeperPowerEvent extends LuaEvent<CreeperPowerEvent> {

  public LuaCreeperPowerEvent(String id) {super(id);}

  @EventHandler
  public void event(CreeperPowerEvent e) {super.event(e);}
}