package a;

import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import net.minecraft.entity.Entity;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"},
   d2 = {"", "run", "()V"}
)
final class Ꝉ$1 implements Runnable {
   private static boolean lIlIIlIIIl(Object var0) {
      return var0 != null;
   }

   Ꝉ$1(String var1, UUID var2, Entity var3, Ꝉ var4) {
      this.$ⲋ = var1;
      this.$ĂƂ = var2;
      this.$u = var3;
      this.ᴃᎲ = var4;
   }

   public final void run() {
      String var1 = ᶂⰽ.ⲋ.ĂƂ(llIlIIlIlIIIIII.$ⲋ);
      if (lIlIIlIIIl(var1)) {
         ((Map)Ꝉ.ⲋ(llIlIIlIlIIIIII.ᴃᎲ)).put(llIlIIlIlIIIIII.$ĂƂ, var1);
         "".length();
         ((Map)Ꝉ.ĂƂ(llIlIIlIlIIIIII.ᴃᎲ)).put(llIlIIlIlIIIIII.$u, var1);
         "".length();
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      } else {
         ((Map)Ꝉ.ĂƂ(llIlIIlIlIIIIII.ᴃᎲ)).put(llIlIIlIlIIIIII.$u, llIlIIlIlIIIIII.$ĂƂ.toString());
         "".length();
      }

   }
}
