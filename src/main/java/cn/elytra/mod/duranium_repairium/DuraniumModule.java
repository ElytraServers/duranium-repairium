package cn.elytra.mod.duranium_repairium;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.Bindings;

public interface DuraniumModule {

    void init(EventRegistrar registrar);

    interface EventRegistrar {

        IEventBus getModBus();

        default IEventBus getForgeBus() {
            return Bindings.getForgeBus().get();
        }

    }

}
