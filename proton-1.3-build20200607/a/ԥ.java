package a;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\u0007"},
   d2 = {"La/ԥ;", "", "p0", "ĂƂ", "(D)D", "ⲋ", "", "(F)F", "<init>", "()V", ""}
)
public final class ԥ {
   public final double ĂƂ(double llIlIlllIIIlIll) {
      if (lIIlIIlIIl(lIIlIIIlll(llIlIlllIIIlIll, 0.0D))) {
         return 0.0D;
      } else {
         return lIIlIIlIll(lIIlIIlIII(llIlIlllIIIlIll, 1.0D)) ? 1.0D : llIlIlllIIIlIll;
      }
   }

   private static int lIIlIIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      lIIlIIIllI();
      ԥ var0 = new ԥ();
      ⲋ = var0;
   }

   private ԥ() {
   }

   private static void lIIlIIIllI() {
      lIIIlIIIl = new int[2];
      lIIIlIIIl[0] = "   ".length();
      lIIIlIIIl[1] = "  ".length();
   }

   private static boolean lIIlIIlIIl(int var0) {
      return var0 < 0;
   }

   private static boolean lIIlIIlIll(int var0) {
      return var0 > 0;
   }

   private static int lIIlIIIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmStatic
   public static final float ⲋ(float var0) {
      return var0 * var0 * ((float)lIIIlIIIl[0] - (float)lIIIlIIIl[1] * var0);
   }

   public final double ⲋ(double var1) {
      return var1 * var1 * ((double)lIIIlIIIl[0] - (double)lIIIlIIIl[1] * var1);
   }
}
