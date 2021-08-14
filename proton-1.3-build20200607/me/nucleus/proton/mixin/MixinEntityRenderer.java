package me.nucleus.proton.mixin;

import a.ºẤ;
import a.ơ߀;
import a.ʀñ;
import a.Ⰺ;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public class MixinEntityRenderer {
   @Shadow
   public int field_78534_ac;
   @Shadow
   @Final
   public float field_78490_B;

   public MixinEntityRenderer() {
   }

   @Redirect(
      method = {"updateLightmap"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/entity/EntityPlayerSP;isPotionActive(Lnet/minecraft/potion/Potion;)Z"
)
   )
   public boolean isPotionActive(EntityPlayerSP var1, Potion var2) {
      return ơ߀.ⲋ.u("Brightness") || var1.func_70644_a(var2);
   }

   @Redirect(
      method = {"updateLightmap"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/renderer/EntityRenderer;getNightVisionBrightness(Lnet/minecraft/entity/EntityLivingBase;F)F"
)
   )
   public float getNightVisionBrightnessMixin(EntityRenderer var1, EntityLivingBase var2, float var3) {
      ºẤ var4 = (ºẤ)ơ߀.ⲋ.ĂƂ("Brightness");
      return var4 != null && var4.Ɏ() ? (float)var4.ⲋ() : var1.func_180438_a(var2, var3);
   }

   @Inject(
      method = {"renderRainSnow"},
      at = {@At("INVOKE")},
      cancellable = true
   )
   public void renderRainSnow(CallbackInfo var1) {
      Ⰺ var2 = (Ⰺ)ơ߀.ⲋ.ĂƂ("NoWeather");
      if (var2 != null && var2.Ɏ()) {
         this.field_78534_ac = 0;
         var1.cancel();
      }

   }

   @Inject(
      method = {"addRainParticles"},
      at = {@At("INVOKE")},
      cancellable = true
   )
   public void addRainParticles(CallbackInfo var1) {
      Ⰺ var2 = (Ⰺ)ơ߀.ⲋ.ĂƂ("NoWeather");
      if (var2 != null && var2.Ɏ()) {
         this.field_78534_ac = 0;
         var1.cancel();
      }

   }

   @ModifyConstant(
      method = {"updateRenderer"},
      constant = {@Constant(
   floatValue = 4.0F
)}
   )
   public float changeThirdPersonDistance(float var1) {
      ʀñ var2 = (ʀñ)ơ߀.ⲋ.ĂƂ("Thirdperson");
      return var2 != null && var2.Ɏ() ? (float)var2.ⲋ() : var1;
   }

   @ModifyConstant(
      method = {"orientCamera"},
      constant = {@Constant(
   floatValue = 4.0F
)}
   )
   public float changeThirdPersonDistanceInOrientCamera(float var1) {
      ʀñ var2 = (ʀñ)ơ߀.ⲋ.ĂƂ("Thirdperson");
      return var2 != null && var2.Ɏ() ? (float)var2.ⲋ() : var1;
   }
}
