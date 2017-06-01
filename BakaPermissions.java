package baka;

public class BakaPermissions extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginDescriptionFile pdf = this.getDescription();
        String pluginName = pdf.getName();
        String pluginVersion = pdf.getVersion();
        getLogger().info(pluginName + " v" + pluginVersion + " enabled!");
    }
    
    @Override
    public void onDisable() {
        PluginDescription pdf = this.getDescription();
        String pluginName = pdf.getName();
        String pluginVersion = pdf.getVersion();
        getLogger().info(pluginName + " v" + pluginVersion + " disabled!");
    }

}
