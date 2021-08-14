package me.nucleus.proton.mixin;

import a.ơ߀;
import a.ƶ;
import a.Ѿ;
import a.Ӄ;
import a.ն;
import a.ᶐ;
import a.Ἒ;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.MoverType;
import net.minecraft.util.MovementInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityPlayerSP.class})
public class MixinEntityPlayerSP extends MixinAbstractClientPlayer {
   @Shadow
   public MovementInput field_71158_b;

   public MixinEntityPlayerSP() {
   }

   @Inject(
      method = {"onUpdateWalkingPlayer()V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onUpdateWalkingPlayer(CallbackInfo var1) {
      ᶐ var2 = new ᶐ(Ѿ.ⲋ);
      ƶ.ⲋ((Object)var2);
      if (var2.ⲋ()) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"onUpdateWalkingPlayer()V"},
      at = {@At("RETURN")}
   )
   private void onUpdateWalkingPlayerReturn(CallbackInfo var1) {
      ƶ.ⲋ((Object)(new ᶐ(Ѿ.ĂƂ)));
   }

   @Inject(
      method = {"onLivingUpdate"},
      at = {@At("HEAD")}
   )
   private void onLivingUpdatePre(CallbackInfo var1) {
      ƶ.ⲋ((Object)(new Ἒ(Ѿ.ⲋ)));
   }

   @Inject(
      method = {"onLivingUpdate"},
      at = {@At("RETURN")}
   )
   private void onLivingUpdatePost(CallbackInfo var1) {
      ƶ.ⲋ((Object)(new Ἒ(Ѿ.ĂƂ)));
   }

   @Redirect(
      method = {"move"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/AbstractClientPlayer;move(Lnet/minecraft/entity/MoverType;DDD)V"
)
   )
   public void move(AbstractClientPlayer var1, MoverType var2, double var3, double var5, double var7) {
      Ӄ var9 = new Ӄ(var2, var3, var5, var7);
      ƶ.ⲋ((Object)var9);
      if (!var9.ⲋ()) {
         super.func_70091_d(var2, var9.〥ҳⱆ(), var9.Ἒⅾ(), var9.ϛⰄ());
      }
   }

   @Inject(
      method = {"pushOutOfBlocks(DDD)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void pushOutOfBlocks(double var1, double var3, double var5, CallbackInfoReturnable<Boolean> var7) {
      ն var8 = (ն)ơ߀.ⲋ.ĂƂ("Velocity");
      if (var8 != null && var8.Ɏ() && var8.u()) {
         var7.setReturnValue(false);
      }

   }
}
