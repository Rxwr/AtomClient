package me.nucleus.proton.mixin;

import a.Ļ;
import a.ơ߀;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GuiNewChat.class})
public class MixinGuiNewChat {
   public MixinGuiNewChat() {
   }

   @ModifyConstant(
      method = {"setChatLine"},
      constant = {@Constant(
   intValue = 100
)}
   )
   private int modifyChatLength(int var1) {
      Ļ var2 = (Ļ)ơ߀.ⲋ.ĂƂ("ChatTweaks");
      return var2 != null && var2.Ɏ() && var2.ⲋ() ? 2147483647 : var1;
   }

   @Redirect(
      method = {"drawChat"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"
)
   )
   private void drawRectBackground(int var1, int var2, int var3, int var4, int var5) {
      Ļ var6 = (Ļ)ơ߀.ⲋ.ĂƂ("ChatTweaks");
      if (var6 != null && var6.Ɏ() && var6.ĂƂ()) {
         Gui.func_73734_a(var1, var2, var3, var4, var6.u().getRGB());
      } else {
         Gui.func_73734_a(var1, var2, var3, var4, var5);
      }

   }
}
