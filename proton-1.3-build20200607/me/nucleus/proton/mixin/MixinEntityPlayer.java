package me.nucleus.proton.mixin;

import a.ơ߀;
import a.ն;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityPlayer.class})
public class MixinEntityPlayer extends MixinEntityLivingBase {
   public MixinEntityPlayer() {
   }

   @Inject(
      method = {"applyEntityCollision"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void applyEntityCollision(Entity var1, CallbackInfo var2) {
      ն var3 = (ն)ơ߀.ⲋ.ĂƂ("Velocity");
      if (var3 != null && var3.Ɏ() && var3.u()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"isPushedByWater()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isPushedByWater(CallbackInfoReturnable<Boolean> var1) {
      ն var2 = (ն)ơ߀.ⲋ.ĂƂ("Velocity");
      if (var2 != null && var2.Ɏ() && var2.u()) {
         var1.setReturnValue(false);
      }

   }
}
