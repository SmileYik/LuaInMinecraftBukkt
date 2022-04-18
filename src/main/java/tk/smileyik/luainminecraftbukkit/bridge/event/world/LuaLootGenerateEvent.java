package tk.smileyik.luainminecraftbukkit.bridge.event.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.world.LootGenerateEvent;
import tk.smileyik.luainminecraftbukkit.plugin.event.LuaEvent;

public class LuaLootGenerateEvent extends LuaEvent<LootGenerateEvent> {

  public LuaLootGenerateEvent(String id) {super(id);}

  @EventHandler
  public void event(LootGenerateEvent e) {super.event(e);}
}