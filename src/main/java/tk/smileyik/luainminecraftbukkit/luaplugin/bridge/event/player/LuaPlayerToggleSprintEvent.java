package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerToggleSprintEvent extends LuaEvent<PlayerToggleSprintEvent> {

  public LuaPlayerToggleSprintEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerToggleSprintEvent e) {super.event(e);}
}