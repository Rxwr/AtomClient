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
public final class eꙊ$4<T> implements Comparator<T> {
   private static void lIIIIIIllI() {
      lllIlllI = new int[1];
      lllIlllI[0] = ((219 ^ 151) & ~(220 ^ 144) ^ 22 ^ 15) & (28 ^ 14 ^ 53 ^ 62 ^ -" ".length());
   }

   public final int compare(T var1, T var2) {
      int var3 = lllIlllI[0];
      String var4 = (String)var2;
      int var5 = lllIlllI[0];
      Comparable var10000 = (Comparable)this.$ⲋ.ĂƂ(var4);
      var4 = (String)var1;
      Comparable var6 = var10000;
      var5 = lllIlllI[0];
      Integer var7 = this.$ⲋ.ĂƂ(var4);
      return ComparisonsKt.compareValues(var6, (Comparable)var7);
   }

   public eꙊ$4(Ꞓ var1) {
      this.$ⲋ = var1;
   }

   static {
      lIIIIIIllI();
   }
}
