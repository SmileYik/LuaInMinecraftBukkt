package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityShootBowEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaEntityShootBowEvent extends LuaEvent<EntityShootBowEvent> {

  public LuaEntityShootBowEvent(String id) {super(id);}

  @EventHandler
  public void event(EntityShootBowEvent e) {super.event(e);}
}