package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.raid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.raid.RaidStopEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaRaidStopEvent extends LuaEvent<RaidStopEvent> {

  public LuaRaidStopEvent(String id) {super(id);}

  @EventHandler
  public void event(RaidStopEvent e) {super.event(e);}
}