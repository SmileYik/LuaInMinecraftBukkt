package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerFishEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerFishEvent extends LuaEvent<PlayerFishEvent> {

  public LuaPlayerFishEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerFishEvent e) {super.event(e);}
}