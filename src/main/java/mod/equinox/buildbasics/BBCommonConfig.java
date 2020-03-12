package mod.equinox.buildbasics;

import org.apache.commons.lang3.tuple.Pair;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;

@EventBusSubscriber(bus = Bus.MOD)
public final class BBCommonConfig {
    public static boolean quarkDuplicates = true;
    private static BooleanValue quarkDuplicatesCfg;

    public static final ForgeConfigSpec spec;

    static {
        final Pair<BBCommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(BBCommonConfig::new);
        spec = specPair.getRight();
    }

    private BBCommonConfig(ForgeConfigSpec.Builder builder) {
        quarkDuplicatesCfg = builder.define("quarkDuplicates", quarkDuplicates);
    }

    public static void refresh() {
        quarkDuplicates = quarkDuplicatesCfg.get();
    }

    @SubscribeEvent
    public static void onFileChange(ModConfig.ConfigReloading event) {
        ((CommentedFileConfig) event.getConfig().getConfigData()).load();
        refresh();
    }
}