package tk.smileyik.luainminecraftbukkit.luaplugin.exception;

public class LuaPluginNotFountException extends RuntimeException {
  public LuaPluginNotFountException(String id) {
    super(String.format("插件 %s 未被启用", id));
  }
}
