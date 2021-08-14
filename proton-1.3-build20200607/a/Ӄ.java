package a;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.entity.MoverType;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0015B'\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004R&\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0002\u0010\u000b¨\u0006\u0086\u000eR\u001d\u0010\f\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0086\u0004R&\u0010\u0004\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u0007\u0010\u000b¨\u0006\u0086\u000e"},
   d2 = {"La/Ӄ;", "Lnet/minecraft/entity/MoverType;", "ⲋ", "Lnet/minecraft/entity/MoverType;", "ᴃᎲ", "()Lnet/minecraft/entity/MoverType;", "", "ĂƂ", "D", "〥ҳⱆ", "()D", "(D)V", "u", "Ἒⅾ", "ϛⰄ", "p0", "p1", "p2", "p3", "<init>", "(Lnet/minecraft/entity/MoverType;DDD)V", "La/ἶṗ;"}
)
public final class Ӄ extends ἶṗ {
   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.ĂƂ = var1;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final double ϛⰄ() {
      return this.ᴃᎲ;
   }

   static {
      lIlIIlllll();
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final double 〥ҳⱆ() {
      return this.ĂƂ;
   }

   public Ӄ(@NotNull MoverType var1, double var2, double var4, double var6) {
      super((Ѿ)null, lIIllllII[0], (DefaultConstructorMarker)null);
      this.ⲋ = var1;
      this.ĂƂ = var2;
      this.u = var4;
      this.ᴃᎲ = var6;
   }

   private static void lIlIIlllll() {
      lIIllllII = new int[1];
      lIIllllII[0] = " ".length();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(double var1) {
      this.ᴃᎲ = var1;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final double Ἒⅾ() {
      return this.u;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final MoverType ᴃᎲ() {
      return this.ⲋ;
   }
}
