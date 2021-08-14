package a;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\rB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u0006R&\u0010\u0002\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0002\u0010\u0006¨\u0006\u0086\u000eR\u0017\u0010\n\u001a\u00020\u00078G@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0086\u0004"},
   d2 = {"La/Ｓ꣙ὐ;", "Lnet/minecraft/util/text/ITextComponent;", "ⲋ", "Lnet/minecraft/util/text/ITextComponent;", "〥ҳⱆ", "()Lnet/minecraft/util/text/ITextComponent;", "(Lnet/minecraft/util/text/ITextComponent;)V", "", "ᴃᎲ", "()Ljava/lang/String;", "ĂƂ", "p0", "<init>", "La/ἶṗ;"}
)
public final class Ｓ꣙ὐ extends ἶṗ {
   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ITextComponent var1) {
      this.ⲋ = var1;
   }

   private static void lIlIIIlllIl() {
      lIIllIIllI = new int[1];
      lIIllIIllI[0] = " ".length();
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final ITextComponent 〥ҳⱆ() {
      return this.ⲋ;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final String ᴃᎲ() {
      return this.ⲋ.func_150260_c();
   }

   public Ｓ꣙ὐ(@NotNull ITextComponent var1) {
      super((Ѿ)null, lIIllIIllI[0], (DefaultConstructorMarker)null);
      this.ⲋ = var1;
   }

   static {
      lIlIIIlllIl();
   }
}
