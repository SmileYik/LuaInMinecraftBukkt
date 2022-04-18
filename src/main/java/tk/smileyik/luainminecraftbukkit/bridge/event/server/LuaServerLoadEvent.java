package tk.smileyik.luainminecraftbukkit.bridge.event.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.server.ServerLoadEvent;
import tk.smileyik.luainminecraftbukkit.plugin.event.LuaEvent;

public class LuaServerLoadEvent extends LuaEvent<ServerLoadEvent> {

  public LuaServerLoadEvent(String id) {super(id);}

  @EventHandler
  public void event(ServerLoadEvent e) {super.event(e);}
}