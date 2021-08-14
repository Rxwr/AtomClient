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
public final class ⅳ$2<T> implements Comparator<T> {
   static {
      lIIIlIll();
   }

   public ⅳ$2() {
   }

   private static void lIIIlIll() {
      lllIlI = new int[1];
      lllIlI[0] = (150 ^ 137) & ~(58 ^ 37);
   }

   public final int compare(T var1, T var2) {
      int var3 = lllIlI[0];
      ʅ var4 = (ʅ)var1;
      int var5 = lllIlI[0];
      Comparable var10000 = (Comparable)var4.ⲋ();
      var4 = (ʅ)var2;
      Comparable var6 = var10000;
      var5 = lllIlI[0];
      String var7 = var4.ⲋ();
      return ComparisonsKt.compareValues(var6, (Comparable)var7);
   }
}
