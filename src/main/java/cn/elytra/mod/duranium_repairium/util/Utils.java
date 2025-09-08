package cn.elytra.mod.duranium_repairium.util;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraftforge.fml.ModList;

public class Utils {

    public static Supplier<Boolean> getIsModLoaded(String modid) {
        return Suppliers.memoize(() -> ModList.get().isLoaded(modid));
    }

}
