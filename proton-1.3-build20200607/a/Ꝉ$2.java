package a;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.tileentity.TileEntity;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00032\n\u0010\u0000\u001a\u0006*\u00028\u00008\u00002\n\u0010\u0001\u001a\u0006*\u00028\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"p0", "p1", "", "T", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}
)
public final class Ꝉ$2<T> implements Comparator<T> {
   private static void lIIIIIIlIll() {
      lllIlllll = new int[1];
      lllIlllll[0] = (80 ^ 45 ^ 241 ^ 182) & (191 ^ 157 ^ 78 ^ 86 ^ -" ".length());
   }

   public Ꝉ$2(Ꝉ var1) {
      this.ⲋ = var1;
   }

   public final int compare(T var1, T var2) {
      int var3 = lllIlllll[0];
      TileEntity var4 = (TileEntity)var2;
      int var5 = lllIlllll[0];
      Comparable var10000 = (Comparable)Ꝉ.u(this.ⲋ).field_71439_g.func_174831_c(var4.func_174877_v());
      var4 = (TileEntity)var1;
      Comparable var6 = var10000;
      var5 = lllIlllll[0];
      Double var7 = Ꝉ.u(this.ⲋ).field_71439_g.func_174831_c(var4.func_174877_v());
      return ComparisonsKt.compareValues(var6, (Comparable)var7);
   }

   static {
      lIIIIIIlIll();
   }
}
