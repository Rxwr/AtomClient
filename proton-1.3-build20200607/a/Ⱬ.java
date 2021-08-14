package a;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.network.Packet;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b'\u0018\u00002\u00020\tB\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004"},
   d2 = {"La/Ⱬ;", "Lnet/minecraft/network/Packet;", "ⲋ", "Lnet/minecraft/network/Packet;", "ᴃᎲ", "()Lnet/minecraft/network/Packet;", "p0", "<init>", "(Lnet/minecraft/network/Packet;)V", "La/ἶṗ;"}
)
public abstract class Ⱬ extends ἶṗ {
   private static void lIlIIIlIll() {
      lIIllIIlI = new int[1];
      lIIllIIlI[0] = " ".length();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final Packet<?> ᴃᎲ() {
      return this.ⲋ;
   }

   public Ⱬ(@NotNull Packet<?> var1) {
      super((Ѿ)null, lIIllIIlI[0], (DefaultConstructorMarker)null);
      this.ⲋ = var1;
   }

   static {
      lIlIIIlIll();
   }
}
