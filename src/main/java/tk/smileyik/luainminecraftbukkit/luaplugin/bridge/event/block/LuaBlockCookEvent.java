package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockCookEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaBlockCookEvent extends LuaEvent<BlockCookEvent> {

  public LuaBlockCookEvent(String id) {super(id);}

  @EventHandler
  public void event(BlockCookEvent e) {super.event(e);}
}