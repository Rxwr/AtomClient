package me.nucleus.proton.mixin;

import a.Ἠ;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public class MixinMinecraft {
   private boolean shuttingDown = false;

   public MixinMinecraft() {
   }

   @Redirect(
      method = {"run"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/Minecraft;displayCrashReport(Lnet/minecraft/crash/CrashReport;)V"
)
   )
   public void displayCrashReport(Minecraft var1, CrashReport var2) {
      this.save();
   }

   @Inject(
      method = {"shutdownMinecraftApplet"},
      at = {@At("HEAD")}
   )
   public void shutdownMinecraftApplet(CallbackInfo var1) {
      this.save();
   }

   private void save() {
      if (!this.shuttingDown) {
         this.shuttingDown = true;
         Ἠ.ⲋ.ᴃᎲ(Ἠ.ⲋ.ᴃᎲ());
         Ἠ.ⲋ.ς();
      }
   }
}
