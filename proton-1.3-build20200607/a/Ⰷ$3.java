package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"},
   d2 = {"Lnet/minecraft/util/math/ChunkPos;", "p0", "", "Lnet/minecraft/util/math/BlockPos;", "p1", "", "ⲋ", "(Lnet/minecraft/util/math/ChunkPos;Ljava/util/List;)V"}
)
final class Ⰷ$3 extends Lambda implements Function2<ChunkPos, List<? extends BlockPos>, Unit> {
   public final void ⲋ(@NotNull ChunkPos lllIllIIllIIlII, @NotNull List<? extends BlockPos> var2) {
      Iterable var3 = (Iterable)var2;
      int var4 = llllIlI[1];
      Iterator lllIllIIllIIIII = var3.iterator();

      do {
         if (!lIIIIllll(lllIllIIllIIIII.hasNext())) {
            return;
         }

         boolean lllIllIIlIlllll = lllIllIIllIIIII.next();
         long lllIllIIlIllllI = (BlockPos)lllIllIIlIlllll;
         byte lllIllIIlIlllIl = llllIlI[1];
         boolean lllIllIIlIlllII = new Vec3d((double)lllIllIIlIllllI.field_177962_a + 0.5D + (double)lllIllIIllIIlII.field_77276_a * 16.0D, (double)lllIllIIlIllllI.field_177960_b + 0.5D, (double)lllIllIIlIllllI.field_177961_c + 0.5D + (double)lllIllIIllIIlII.field_77275_b * 16.0D);
         lllIllIIllIIlIl.$ⲋ.ⲋ(lllIllIIllIIlIl.$ĂƂ, lllIllIIlIlllII, ſ.ĂƂ(ſ.ⲋ(Ⰷ.ĂƂ(lllIllIIllIIlIl.u), Ⰷ.u(lllIllIIllIIlIl.u))));
         "".length();
      } while(-(37 ^ 126 ^ 222 ^ 129) <= 0);

   }

   Ⰷ$3(ᾣŦ var1, Vec3d var2, Ⰷ var3) {
      super(llllIlI[0]);
      this.$ⲋ = var1;
      this.$ĂƂ = var2;
      this.u = var3;
   }

   static {
      lIIIIlllI();
   }

   private static boolean lIIIIllll(int var0) {
      return var0 != 0;
   }

   private static void lIIIIlllI() {
      llllIlI = new int[2];
      llllIlI[0] = "  ".length();
      llllIlI[1] = (156 ^ 194 ^ 31 ^ 102) & (147 ^ 182 ^ "  ".length() ^ -" ".length());
   }
}
