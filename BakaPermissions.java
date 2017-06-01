package baka;

public class BakaPermissions extends JavaPlugin {
    
    File permissionsFile = null;
    FileConfiguration permissions = null;

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
    
    private void loadYamls() {
        if(permissionsFile == null) {
            permissionsFile = new File(getDataFolder(), "permissions.yml);
        }
        permissions = YamlConfiguration.loadConfiguration(permissionsFile);
        
    }
    
}
