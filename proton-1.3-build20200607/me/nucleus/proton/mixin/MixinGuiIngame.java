package me.nucleus.proton.mixin;

import a.eꙊ;
import a.ơ߀;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngame.class})
public class MixinGuiIngame {
   public MixinGuiIngame() {
   }

   @Inject(
      method = {"renderPotionEffects"},
      at = {@At("INVOKE")},
      cancellable = true
   )
   protected void renderPotionEffects(CallbackInfo var1) {
      eꙊ var2 = (eꙊ)ơ߀.ⲋ.ĂƂ("HUD");
      if (var2 != null && var2.Ɏ() && var2.Ἒ()) {
         var1.cancel();
      }
   }
}
