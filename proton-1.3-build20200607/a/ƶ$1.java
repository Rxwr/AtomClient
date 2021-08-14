package a;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00032\n\u0010\u0000\u001a\u0006*\u00028\u00008\u00002\n\u0010\u0001\u001a\u0006*\u00028\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"p0", "p1", "", "T", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}
)
public final class ƶ$1<T> implements Comparator<T> {
   private static void lIlIlIIII() {
      lIIllIlI = new int[1];
      lIIllIlI[0] = (20 + 45 - 44 + 124 ^ 86 + 30 - 80 + 151) & (58 + 91 - 9 + 26 ^ 76 + 10 - -24 + 30 ^ -" ".length());
   }

   static {
      lIlIlIIII();
   }

   public final int compare(T var1, T var2) {
      int var3 = lIIllIlI[0];
      ƶ.ⲋ var4 = (ƶ.ⲋ)var2;
      int var5 = lIIllIlI[0];
      Comparable var10000 = (Comparable)var4.u();
      var4 = (ƶ.ⲋ)var1;
      Comparable var6 = var10000;
      var5 = lIIllIlI[0];
      Integer var7 = var4.u();
      return ComparisonsKt.compareValues(var6, (Comparable)var7);
   }

   public ƶ$1() {
   }
}
