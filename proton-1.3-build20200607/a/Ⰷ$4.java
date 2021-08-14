package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"},
   d2 = {"Lnet/minecraft/util/math/ChunkPos;", "p0", "", "Lnet/minecraft/util/math/BlockPos;", "p1", "", "ⲋ", "(Lnet/minecraft/util/math/ChunkPos;Ljava/util/List;)V"}
)
final class Ⰷ$4 extends Lambda implements Function2<ChunkPos, List<? extends BlockPos>, Unit> {
   static {
      ll();
   }

   Ⰷ$4(ᾣŦ var1, Ⰷ var2) {
      super(lII[0]);
      this.$ⲋ = var1;
      this.ĂƂ = var2;
   }

   private static boolean lII(int var0) {
      return var0 != 0;
   }

   public final void ⲋ(@NotNull ChunkPos lllllllllllIlIl, @NotNull List<? extends BlockPos> var2) {
      Iterable var3 = (Iterable)var2;
      int var4 = lII[1];
      Iterator lllllllllllIIIl = var3.iterator();

      do {
         if (!lII(lllllllllllIIIl.hasNext())) {
            return;
         }

         boolean lllllllllllIIII = lllllllllllIIIl.next();
         String llllllllllIllll = (BlockPos)lllllllllllIIII;
         byte llllllllllIlllI = lII[1];
         lllllllllllIllI.$ⲋ.ⲋ(new BlockPos(llllllllllIllll.field_177962_a + lllllllllllIlIl.field_77276_a * lII[2], llllllllllIllll.field_177960_b, llllllllllIllll.field_177961_c + lllllllllllIlIl.field_77275_b * lII[2]), ſ.ĂƂ(ſ.ⲋ(Ⰷ.ĂƂ(lllllllllllIllI.ĂƂ), Ⰷ.u(lllllllllllIllI.ĂƂ))), lII[3]);
         "".length();
      } while(((193 ^ 152) & ~(33 ^ 120)) < " ".length());

   }

   private static void ll() {
      lII = new int[4];
      lII[0] = "  ".length();
      lII[1] = (184 + 116 - 129 + 65 ^ 3 + 11 - -84 + 43) & (65 ^ 103 ^ 238 ^ 169 ^ -" ".length());
      lII[2] = 55 ^ 39;
      lII[3] = 76 ^ 115;
   }
}
