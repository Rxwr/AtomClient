package a;

import java.awt.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\f\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\r"},
   d2 = {"", "p0", "", "p1", "p2", "p3", "Ljava/awt/Color;", "ⲋ", "(DIDD)Ljava/awt/Color;", "(Ljava/awt/Color;)Ljava/awt/Color;", "ĂƂ", "(Ljava/awt/Color;)I", "(Ljava/awt/Color;D)Ljava/awt/Color;", "(Ljava/awt/Color;I)Ljava/awt/Color;"}
)
public final class ſ {
   @NotNull
   public static final Color ⲋ(@NotNull Color var0, double var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), (int)(var1 * 255.0D));
   }

   @NotNull
   public static final Color ⲋ(@NotNull Color var0) {
      return new Color(lIIlIlllI[0] - var0.getRed(), lIIlIlllI[0] - var0.getGreen(), lIIlIlllI[0] - var0.getBlue(), var0.getAlpha());
   }

   @NotNull
   public static final Color ⲋ(@NotNull Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
   }

   private static void lIlIIIIIll() {
      lIIlIlllI = new int[8];
      lIIlIlllI[0] = 172 + 11 - 146 + 218;
      lIIlIlllI[1] = 98 ^ 30 ^ 45 ^ 73;
      lIIlIlllI[2] = 208 ^ 192;
      lIIlIlllI[3] = 108 + 133 - 79 + 28 ^ 11 + 30 - -119 + 22;
      lIIlIlllI[4] = (233 ^ 184) & ~(15 ^ 94);
      lIIlIlllI[5] = " ".length();
      lIIlIlllI[6] = "  ".length();
      lIIlIlllI[7] = 130 + 78 - 123 + 89 ^ 63 + 143 - 142 + 106;
   }

   public static final int ĂƂ(@NotNull Color var0) {
      return var0.getAlpha() << lIIlIlllI[1] | var0.getRed() << lIIlIlllI[2] | var0.getGreen() << lIIlIlllI[3] | var0.getBlue();
   }

   private static boolean lIlIIIIlII(int var0) {
      return var0 != 0;
   }

   static {
      lIlIIIIIll();
   }

   @NotNull
   public static final Color ⲋ(double var0, int var2, double var3, double var5) {
      double var9 = (double)(System.currentTimeMillis() + (long)var2) * var0;
      int var11 = lIIlIlllI[4];
      double var7 = (Math.sin(var9) + 1.0D) / 2.0D;
      return (new љ(var7, var3, var5)).ĂƂ();
   }
}
