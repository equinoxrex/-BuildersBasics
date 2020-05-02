package mod.equinox.buildbasics;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_QUARK = "quark";

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.BooleanValue QUARK_STONE_BRICK_TYPES;
    public static ForgeConfigSpec.BooleanValue QUARK_SMALL_STONE_BRICK_TYPES;
    public static ForgeConfigSpec.BooleanValue QUARK_CANDLES;


    static {
        setupConfig();
        COMMON_CONFIG = COMMON_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    private static void setupConfig() {
        COMMON_BUILDER.comment("Quark Compatibility");//.push(CATEGORY_QUARK);

        QUARK_STONE_BRICK_TYPES = COMMON_BUILDER.comment("Are the stone brick type blocks (that are also in quark) registered")
                .define("quark_and_bb_bricks", true);
        QUARK_SMALL_STONE_BRICK_TYPES = COMMON_BUILDER.comment("Are the small stone brick type blocks (that are similar to quark's pavement blocks) registered")
                .define("quark_and_bb_small_bricks", true);
        QUARK_CANDLES = COMMON_BUILDER.comment("Are candles (that are also in quark) registered")
                .define("quark_and_bb_candles", true);

        //COMMON_BUILDER.pop();
    }

    public static void loadConfig(ForgeConfigSpec spec, String path) {

        BuildBasics.LOGGER.info("Loading config: " + path);
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        BuildBasics.LOGGER.info("Built config: " + path);
        configData.load();

        BuildBasics.LOGGER.info("Loaded config: " + path);
        spec.setConfig(configData);
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

//    @SubscribeEvent
//    public static void onReload(final ModConfig.ConfigReloading configEvent) {
//    }

}