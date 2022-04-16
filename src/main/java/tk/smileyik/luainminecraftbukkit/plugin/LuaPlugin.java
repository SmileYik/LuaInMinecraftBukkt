package tk.smileyik.luainminecraftbukkit.plugin;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public class LuaPlugin {
  private final String id;
  private final String displayName;
  private final String author;
  private final String version;
  private final List<String> softDependents;
  private final List<String> dependents;
  private final File pluginPath;
  private final File configPath;
  private final Logger logger;

  public LuaPlugin(String id, String displayName, String author,
                   String version, List<String> softDependents,
                   List<String> dependents, File pluginPath, File configPath) {
    this.id = id;
    this.displayName = displayName;
    this.author = author;
    this.version = version;
    this.softDependents = softDependents;
    this.dependents = dependents;
    this.pluginPath = pluginPath;
    this.configPath = configPath;
    this.logger = Logger.getLogger(id);
  }

  /**
   * 获取脚本插件id.
   * @return 脚本插件的id.
   */
  public String getId() {
    return id;
  }

  /**
   * 获取脚本文件的显示名称.
   * @return 显示名称.
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * 获取脚本插件的作者.
   * @return 脚本插件的作者.
   */
  public String getAuthor() {
    return author;
  }

  /**
   * 获取脚本插件的版本.
   * @return 脚本插件的版本.
   */
  public String getVersion() {
    return version;
  }

  /**
   * 获取脚本插件的非强制性依赖.
   * @return 非强制性依赖脚本插件id列表
   */
  public List<String> getSoftDependents() {
    return softDependents;
  }

  /**
   * 获取脚本插件的强制性依赖.
   * @return 强制性依赖脚本插件id列表
   */
  public List<String> getDependents() {
    return dependents;
  }

  /**
   * 获取配置文件夹路径.
   * @return 配置文件夹路径.
   */
  public File getConfigPath() {
    return configPath;
  }

  /**
   * 脚本插件文件夹路径.
   * @return 脚本插件文件夹路径.
   */
  public File getPluginPath() {
    return pluginPath;
  }

  /**
   * 日志.
   * @return 日志
   */
  public Logger getLogger() {
    return logger;
  }
}