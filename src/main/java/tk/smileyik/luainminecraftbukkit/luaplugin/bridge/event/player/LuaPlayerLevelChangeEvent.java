package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerLevelChangeEvent extends LuaEvent<PlayerLevelChangeEvent> {

  public LuaPlayerLevelChangeEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerLevelChangeEvent e) {super.event(e);}
}