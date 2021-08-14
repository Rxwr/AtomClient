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
public final class ɡ$1<T> implements Comparator<T> {
   public final int compare(T var1, T var2) {
      int var3 = lIIlIIl[0];
      String var4 = (String)var1;
      int var5 = lIIlIIl[0];
      Comparable var10000 = (Comparable)var4;
      var4 = (String)var2;
      Comparable var6 = var10000;
      var5 = lIIlIIl[0];
      return ComparisonsKt.compareValues(var6, (Comparable)var4);
   }

   static {
      lIIllIII();
   }

   private static void lIIllIII() {
      lIIlIIl = new int[1];
      lIIlIIl[0] = (197 ^ 166 ^ 104 ^ 87) & (80 ^ 121 ^ 197 ^ 176 ^ -" ".length());
   }

   public ɡ$1() {
   }
}
