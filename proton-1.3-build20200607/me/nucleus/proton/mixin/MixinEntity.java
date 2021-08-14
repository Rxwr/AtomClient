package me.nucleus.proton.mixin;

import a.ƶ;
import a.ⱛṧ;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Entity.class})
public class MixinEntity {
   @Shadow
   public boolean field_70133_I;

   public MixinEntity() {
   }

   @Shadow
   public void func_70091_d(MoverType var1, double var2, double var4, double var6) {
   }

   @Inject(
      method = {"turn"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onTurn(float var1, float var2, CallbackInfo var3) {
      ⱛṧ var4 = new ⱛṧ((Entity)this);
      ƶ.ⲋ((Object)var4);
      if (var4.ⲋ()) {
         var3.cancel();
      }

   }
}
