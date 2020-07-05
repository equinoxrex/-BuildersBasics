package mod.equinox.buildbasics;


import mod.equinox.buildbasics.registry.BlockDataRegistry;
import mod.equinox.buildbasics.registry.BlockRegistry;
import mod.equinox.buildbasics.registry.ItemRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @credit - bageldotjpg & SmellyModder (Luke Tonon)
 */

// The value here should match an entry in the META-INF/mods.toml file
@Mod("buildbasics")
public class BuildBasics {

    public static final String MODID = "buildbasics";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public BuildBasics() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);

        modEventBus.addListener(this::setup);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> modEventBus.addListener(this::setupClient));

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        Config.loadConfig(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("buildbasics-client.toml").toString());
        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("buildbasics-common.toml").toString());
    }

    public void setupClient(final FMLClientSetupEvent event) {
        BlockDataRegistry.setRenderLayers();
    }

    private void setup(final FMLCommonSetupEvent event) {
        //ConfigHelper.register(ModLoadingContext.get(), FMLJavaModLoadingContext.get(), ModConfig.Type.COMMON, Config::new);
        BlockDataRegistry.registerFlammables();
    }

}