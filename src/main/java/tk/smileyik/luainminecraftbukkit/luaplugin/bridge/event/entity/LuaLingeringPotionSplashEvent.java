package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.LingeringPotionSplashEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaLingeringPotionSplashEvent extends LuaEvent<LingeringPotionSplashEvent> {

  public LuaLingeringPotionSplashEvent(String id) {super(id);}

  @EventHandler
  public void event(LingeringPotionSplashEvent e) {super.event(e);}
}