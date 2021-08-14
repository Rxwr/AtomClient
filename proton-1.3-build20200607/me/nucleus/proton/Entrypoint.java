package me.nucleus.proton;

import a.〥ҳⱆ;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
   modid = "proton",
   name = "Proton",
   version = "b1.3"
)
public class Entrypoint {
   @Instance
   private static Entrypoint instance;

   public Entrypoint() {
   }

   @EventHandler
   public static void init(FMLInitializationEvent var0) {
      〥ҳⱆ.〥ҳⱆ.ⲋ(var0);
   }
}
