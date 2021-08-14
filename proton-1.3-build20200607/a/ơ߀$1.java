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
public final class ơ߀$1<T> implements Comparator<T> {
   static {
      lllllllIl();
   }

   public ơ߀$1() {
   }

   public final int compare(T var1, T var2) {
      int var3 = lllIIlIl[0];
      ⳅ var4 = (ⳅ)var1;
      int var5 = lllIIlIl[0];
      Comparable var10000 = (Comparable)var4.ȵ();
      var4 = (ⳅ)var2;
      Comparable var6 = var10000;
      var5 = lllIIlIl[0];
      String var7 = var4.ȵ();
      return ComparisonsKt.compareValues(var6, (Comparable)var7);
   }

   private static void lllllllIl() {
      lllIIlIl = new int[1];
      lllIIlIl[0] = (113 ^ 107) & ~(29 ^ 7);
   }
}
