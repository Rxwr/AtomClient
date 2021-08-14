package me.nucleus.proton.mixin;

import a.Ƈ;
import a.ƶ;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiOverlayDebug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GuiOverlayDebug.class})
public class MixinGuiOverlayDebug {
   public MixinGuiOverlayDebug() {
   }

   @Redirect(
      method = {"renderDebugInfoLeft"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/FontRenderer;drawString(Ljava/lang/String;III)I"
)
   )
   private int renderDebugStringLeft(FontRenderer var1, String var2, int var3, int var4, int var5) {
      Ƈ var6 = new Ƈ(var2);
      ƶ.ⲋ((Object)var6);
      return var1.func_78276_b(var6.ᴃᎲ(), var3, var4, var5);
   }
}
