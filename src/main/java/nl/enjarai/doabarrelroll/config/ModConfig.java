package nl.enjarai.doabarrelroll.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import nl.enjarai.doabarrelroll.DoABarrelRollClient;

@Config(name = DoABarrelRollClient.MODID)
public class ModConfig implements ConfigData {
    @ConfigEntry.Gui.Excluded
    public static ModConfig INSTANCE;

    public static void init() {
        AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
        INSTANCE = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    public boolean modEnabled = true;

    @ConfigEntry.Gui.Tooltip
    public boolean switchRollAndYaw = false;

    @ConfigEntry.Gui.Tooltip
    public boolean momentumBasedMouse = false;

    @ConfigEntry.Gui.Tooltip
    public boolean showMomentumWidget = true;

    @ConfigEntry.Gui.CollapsibleObject
    public Sensitivity desktopSensitivity = new Sensitivity(1, 0.4, 1);

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.CollapsibleObject
    public Sensitivity controllerSensitivity = new Sensitivity(1, 0.4, 1);
}
