package tk.smileyik.luainminecraftbukkit.bridge.event.raid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.raid.RaidTriggerEvent;
import tk.smileyik.luainminecraftbukkit.plugin.event.LuaEvent;

public class LuaRaidTriggerEvent extends LuaEvent<RaidTriggerEvent> {

  public LuaRaidTriggerEvent(String id) {super(id);}

  @EventHandler
  public void event(RaidTriggerEvent e) {super.event(e);}
}