package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockFormEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaBlockFormEvent extends LuaEvent<BlockFormEvent> {

  public LuaBlockFormEvent(String id) {super(id);}

  @EventHandler
  public void event(BlockFormEvent e) {super.event(e);}
}