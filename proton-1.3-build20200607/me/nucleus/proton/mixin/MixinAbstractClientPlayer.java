package me.nucleus.proton.mixin;

import a.ȉ;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({AbstractClientPlayer.class})
public class MixinAbstractClientPlayer extends MixinEntityLivingBase {
   public MixinAbstractClientPlayer() {
   }

   @Inject(
      method = {"getLocationCape"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void getCape(CallbackInfoReturnable<ResourceLocation> var1) {
      ResourceLocation var2 = ȉ.ⲋ((AbstractClientPlayer)this);
      if (var2 != null) {
         var1.setReturnValue(var2);
      }

   }
}
