package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerRegisterChannelEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerRegisterChannelEvent extends LuaEvent<PlayerRegisterChannelEvent> {

  public LuaPlayerRegisterChannelEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerRegisterChannelEvent e) {super.event(e);}
}