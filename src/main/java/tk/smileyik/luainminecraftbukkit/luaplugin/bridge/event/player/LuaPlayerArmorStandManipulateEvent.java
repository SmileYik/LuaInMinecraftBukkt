package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaPlayerArmorStandManipulateEvent extends LuaEvent<PlayerArmorStandManipulateEvent> {

  public LuaPlayerArmorStandManipulateEvent(String id) {super(id);}

  @EventHandler
  public void event(PlayerArmorStandManipulateEvent e) {super.event(e);}
}