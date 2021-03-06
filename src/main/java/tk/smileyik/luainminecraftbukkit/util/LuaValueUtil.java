package tk.smileyik.luainminecraftbukkit.util;

import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class LuaValueUtil {
  /**
   * 将一个Java对象转换为LuaValue.
   * @param obj 要被转换的Java对象.
   * @return 被转换成的LuaValue.
   */
  public static LuaValue toLuaValue(Object obj) {
    if (obj == null) {
      return LuaValue.NIL;
    } else if (obj instanceof LuaValue) {
      return (LuaValue) obj;
    } else if (obj instanceof String) {
      return LuaValue.valueOf((String) obj);
    } else if (obj instanceof Integer) {
      return LuaValue.valueOf((int) obj);
    } else if (obj instanceof Double) {
      return LuaValue.valueOf((double) obj);
    } else if (obj instanceof Float) {
      return LuaValue.valueOf((double) obj);
    } else if (obj instanceof Boolean) {
      return LuaValue.valueOf((boolean) obj);
    } else if (obj instanceof byte[]) {
      return LuaValue.valueOf((byte[]) obj);
    } else {
      return CoerceJavaToLua.coerce(obj);
    }
  }

  public static Object toJavaValue(Object obj) {
    if (obj == null || obj instanceof LuaNil) {
      return null;
    } else if (obj instanceof LuaInteger) {
      return ((LuaValue) obj).toint();
    } else if (obj instanceof LuaDouble) {
      return ((LuaValue) obj).todouble();
    } else if (obj instanceof LuaBoolean) {
      return ((LuaValue) obj).toboolean();
    } else if (obj instanceof LuaFunction) {
      return obj;
    } else {
      return obj.toString();
    }
  }
}
