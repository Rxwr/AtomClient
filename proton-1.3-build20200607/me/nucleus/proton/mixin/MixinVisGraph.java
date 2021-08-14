package me.nucleus.proton.mixin;

import a.ơ߀;
import a.ⴔ;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({VisGraph.class})
public class MixinVisGraph {
   public MixinVisGraph() {
   }

   @Inject(
      method = {"setOpaqueCube"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setOpaqueCube(BlockPos var1, CallbackInfo var2) {
      ⴔ var3 = (ⴔ)ơ߀.ⲋ.ĂƂ("Freecam");
      if (var3 != null && var3.Ɏ() && var3.Ἒⅾ()) {
         var2.cancel();
      }

   }
}
