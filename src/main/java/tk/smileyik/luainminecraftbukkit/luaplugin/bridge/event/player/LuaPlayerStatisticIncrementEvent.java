package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerStatisticIncrementEvent extends LuaEvent<PlayerStatisticIncrementEvent> {

  public LuaPlayerStatisticIncrementEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerStatisticIncrementEvent e) {super.event(e);}
}