package tk.smileyik.luainminecraftbukkit.luaplugin.bridge.event.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import tk.smileyik.luainminecraftbukkit.luaplugin.event.LuaEvent;

public class LuaVehicleCreateEvent extends LuaEvent<VehicleCreateEvent> {

  public LuaVehicleCreateEvent(String id) {super(id);}

  @EventHandler
  public void event(VehicleCreateEvent e) {super.event(e);}
}