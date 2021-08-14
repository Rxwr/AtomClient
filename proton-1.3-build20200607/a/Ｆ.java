package a;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004"},
   d2 = {"La/Ｆ;", "Lnet/minecraft/entity/Entity;", "ⲋ", "Lnet/minecraft/entity/Entity;", "ᴃᎲ", "()Lnet/minecraft/entity/Entity;", "p0", "<init>", "(Lnet/minecraft/entity/Entity;)V", "La/ἶṗ;"}
)
public final class Ｆ extends ἶṗ {
   public Ｆ(@NotNull Entity var1) {
      super((Ѿ)null, lIIIIlIIl[0], (DefaultConstructorMarker)null);
      this.ⲋ = var1;
   }

   private static void lIIIlllIIl() {
      lIIIIlIIl = new int[1];
      lIIIIlIIl[0] = " ".length();
   }

   static {
      lIIIlllIIl();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final Entity ᴃᎲ() {
      return this.ⲋ;
   }
}
