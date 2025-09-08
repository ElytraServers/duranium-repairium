package cn.elytra.mod.duranium_repairium;

import cn.elytra.mod.duranium_repairium.general.GeneralFix;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(DuraniumRepairium.MOD_ID)
public class DuraniumRepairium {

    public static final String MOD_ID = "duranium_repairium";

    public static final Logger LOG = LoggerFactory.getLogger(DuraniumRepairium.class);

    private static final DuraniumModule[] INITIALIZERS = new DuraniumModule[] { new GeneralFix() };

    public DuraniumRepairium() {
        LOG.info("Finding the Answer to the Ultimate Question of Life, The Universe, and Everything");
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        DuraniumModule.EventRegistrar registrar = () -> bus;
        for (DuraniumModule initializer : INITIALIZERS) {
            try {
                initializer.init(registrar);
            } catch (Exception e) {
                LOG.error("Failed to initialize a fix class {}", initializer.getClass(), e);
            }
        }
    }

}
