package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerResourcePackStatusEvent extends LuaEvent<PlayerResourcePackStatusEvent> {

  public LuaPlayerResourcePackStatusEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerResourcePackStatusEvent e) {super.event(e);}
}