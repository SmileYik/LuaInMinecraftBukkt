package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaVehicleEntityCollisionEvent extends LuaEvent<VehicleEntityCollisionEvent> {

  public LuaVehicleEntityCollisionEvent(String id) {super(id);}

  @EventHandler
  public void event(VehicleEntityCollisionEvent e) {super.event(e);}
}