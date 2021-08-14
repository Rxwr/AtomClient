package me.nucleus.proton.mixin;

import a.ƶ;
import a.Ꮐ꯴;
import a.ꝱᶁ;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetworkManager.class})
public class MixinNetworkManager {
   public MixinNetworkManager() {
   }

   @Inject(
      method = {"sendPacket(Lnet/minecraft/network/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSendPacket(Packet<?> var1, CallbackInfo var2) {
      Ꮐ꯴ var3 = new Ꮐ꯴(var1);
      ƶ.ⲋ((Object)var3);
      if (var3.ⲋ()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"channelRead0"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onChannelRead(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      ꝱᶁ var4 = new ꝱᶁ(var2);
      ƶ.ⲋ((Object)var4);
      if (var4.ⲋ()) {
         var3.cancel();
      }

   }
}
