package cn.elytra.mod.duranium_repairium.general;

import cn.elytra.mod.duranium_repairium.Config;
import cn.elytra.mod.duranium_repairium.DuraniumModule;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class GeneralFix implements DuraniumModule {

    @Override
    public void init(DuraniumModule.EventRegistrar registrar) {
        registrar.getForgeBus().addListener(this::onPlayerChangeDimension);
    }

    private void onPlayerChangeDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (Config.syncAbilitiesOnDimChange) {
            // sync abilities when travel to another dimension
            event.getEntity().onUpdateAbilities();
        }
    }
}
