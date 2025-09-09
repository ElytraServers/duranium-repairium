package cn.elytra.mod.duranium_repairium.mixins.sophisticated_storage;

import cn.elytra.mod.duranium_repairium.Config;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.world.item.ItemStack;
import net.p3pp3rf1y.sophisticatedstorage.block.WoodStorageBlockBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = WoodStorageBlockBase.class, remap = false)
public class PackingTapeDurabilityFix {

    @WrapWithCondition(method = "packStorage", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;setDamageValue(I)V"))
    private boolean duranium$checkDamageableBeforeDamage(ItemStack instance, int damage) {
        return !Config.preventDamagingUnbreakablePackingTape || instance.isDamageableItem();
    }

}
