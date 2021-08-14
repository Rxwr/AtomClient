package me.nucleus.proton.mixin;

import a.ƶ;
import a.Ѿ;
import a.ᾥ;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityLivingBase.class})
public class MixinEntityLivingBase extends MixinEntity {
   public MixinEntityLivingBase() {
   }

   @Inject(
      method = {"travel"},
      at = {@At("HEAD")}
   )
   public void preTravel(CallbackInfo var1) {
      if (this == Minecraft.func_71410_x().field_71439_g) {
         ᾥ var2 = new ᾥ(Ѿ.ⲋ);
         ƶ.ⲋ((Object)var2);
      }

   }

   @Inject(
      method = {"travel"},
      at = {@At("RETURN")}
   )
   public void postTravel(CallbackInfo var1) {
      if (this == Minecraft.func_71410_x().field_71439_g) {
         ᾥ var2 = new ᾥ(Ѿ.ĂƂ);
         ƶ.ⲋ((Object)var2);
      }

   }
}
