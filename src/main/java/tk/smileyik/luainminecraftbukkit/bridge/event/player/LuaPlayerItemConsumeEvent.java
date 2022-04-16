package tk.smileyik.luainminecraftbukkit.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import tk.smileyik.luainminecraftbukkit.plugin.LuaEvent;

public class LuaPlayerItemConsumeEvent extends LuaEvent<PlayerItemConsumeEvent> {

  public LuaPlayerItemConsumeEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerItemConsumeEvent e) {super.event(e);}
}