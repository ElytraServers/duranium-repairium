package cn.elytra.mod.duranium_repairium;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = DuraniumRepairium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    public static boolean syncAbilitiesOnDimChange = true;
    public static boolean preventDamagingUnbreakablePackingTape = true;

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    // @formatter:off

    private static final ForgeConfigSpec.BooleanValue SYNC_ABILITIES_ON_DIM_CHANGE = BUILDER
        .comment("Fix the bug where when changing dimension using /warp, /spawn, etc will disable your fly ability locally.")
        .define("general.sync_abilities_on_dim_change", syncAbilitiesOnDimChange);

    private static final ForgeConfigSpec.BooleanValue PREVENT_DAMAGING_UNBREAKABLE_PACKING_TAPE = BUILDER
        .comment("Fix the bug where the Unbreakable Packing Tapes from Sophisticated Storage are ignoring Unbreakable tag.")
        .define("sophisticated.prevent_damaging_unbreakable_packing_tape", preventDamagingUnbreakablePackingTape);

    // @formatter:on

    public static final ForgeConfigSpec CONFIG_SPEC = BUILDER.build();

    @SubscribeEvent
    static void onConfigLoad(ModConfigEvent event) {
        DuraniumRepairium.LOG.info("Reloading Duranium Repairium config");

        syncAbilitiesOnDimChange = SYNC_ABILITIES_ON_DIM_CHANGE.get();
        preventDamagingUnbreakablePackingTape = PREVENT_DAMAGING_UNBREAKABLE_PACKING_TAPE.get();
    }

}
