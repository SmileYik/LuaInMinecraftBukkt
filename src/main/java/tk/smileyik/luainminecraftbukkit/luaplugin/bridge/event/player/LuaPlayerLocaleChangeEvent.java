package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLocaleChangeEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerLocaleChangeEvent extends LuaEvent<PlayerLocaleChangeEvent> {

  public LuaPlayerLocaleChangeEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerLocaleChangeEvent e) {super.event(e);}
}