package me.nucleus.proton.mixin;

import a.u;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.GuiConnecting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiConnecting.class})
public class MixinGuiConnecting {
   public MixinGuiConnecting() {
   }

   @Inject(
      method = {"connect"},
      at = {@At("HEAD")}
   )
   private void connect(String var1, int var2, CallbackInfo var3) {
      u.ⲋ.ⲋ(Minecraft.func_71410_x().field_71422_O);
   }
}
