package a;

import java.awt.Color;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0007\u0018\u00002\u00020/B\u0007¢\u0006\u0004\b.\u0010\"J\r\u0010\u0017\u001a\u00020!¢\u0006\u0004\b\u0017\u0010\"J\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010$J\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010%J\u000f\u0010\u001c\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001c\u0010&J\r\u0010'\u001a\u00020!¢\u0006\u0004\b'\u0010\"J\r\u0010(\u001a\u00020!¢\u0006\u0004\b(\u0010\"J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010$J\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010%J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010$J\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u0002\u0010)J%\u0010\u0005\u001a\u00020\u0007*\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010+J!\u0010\u0005\u001a\u00020,*\u00020,2\u0006\u0010#\u001a\u00020,2\u0006\u0010*\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010-R&\u0010\u0005\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u000eR*\u0010\u0002\u001a\u0006*\u00020\u00070\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u0002\u0010\u000b¨\u0006\u0086\u000eR&\u0010\r\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0003\u001a\u0004\b\f\u0010\u0004\"\u0004\b\r\u0010\u0006¨\u0006\u0086\u000eR\u0017\u0010\f\u001a\u00020\u000e8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0086\u0004R\u0017\u0010\u0012\u001a\u00020\u000e8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0086\u0004R\u0017\u0010\b\u001a\u00020\u00078G@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n¨\u0006\u0086\u0004R\u0017\u0010\u0015\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0086\u0004R\u0017\u0010\u0017\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0086\u0004R&\u0010\u0014\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0005\u0010\u0019¨\u0006\u0086\u000eR*\u0010\u0013\u001a\u0006*\u00020\u00070\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0005\u0010\u000b¨\u0006\u0086\u000eR\u001a\u0010\u0016\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u0082\u000eR&\u0010\u001c\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0003\u001a\u0004\b\r\u0010\u0004\"\u0004\b\u0002\u0010\u0006¨\u0006\u0086\u000eR&\u0010\u000f\u001a\u00020\u001d8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u001f\"\u0004\b\u0005\u0010 ¨\u0006\u0086\u000e"},
   d2 = {"La/ⱙ;", "", "ĂƂ", "D", "()D", "ⲋ", "(D)V", "Ljava/awt/Color;", "Ἒⅾ", "Ljava/awt/Color;", "()Ljava/awt/Color;", "(Ljava/awt/Color;)V", "ᴃᎲ", "u", "", "Ɏ", "()Z", "ɡ", "〥ҳⱆ", "ⲡ", "Ꜥ", "ϛⰄ", "Đ", "ς", "Z", "(Z)V", "", "J", "ᵴἥ", "La/ⰺ;", "La/ⰺ;", "()La/ⰺ;", "(La/ⰺ;)V", "", "()V", "p0", "(D)La/ⱙ;", "(Ljava/awt/Color;)La/ⱙ;", "()La/ⱙ;", "ⴜ", "ͷ", "(La/ⰺ;)La/ⱙ;", "p1", "(Ljava/awt/Color;Ljava/awt/Color;D)Ljava/awt/Color;", "", "(IID)I", "<init>", ""}
)
public final class ⱙ {
   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.ϛⰄ = var1;
   }

   private static int lIIIIIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "u"
   )
   public final double u() {
      return this.u;
   }

   @NotNull
   public final ⱙ ĂƂ(@NotNull ⰺ var1) {
      int var3 = llllIIIl[0];
      int var4 = llllIIIl[0];
      ⱙ var5 = (ⱙ)this;
      int var6 = llllIIIl[0];
      var5.ⲋ = var1;
      return (ⱙ)this;
   }

   private static boolean lIIIIlIIIl(int var0, int var1) {
      return var0 == var1;
   }

   public final int ⲋ(int var1, int var2, double var3) {
      return (int)((double)(var2 - var1) * var3) + var1;
   }

   static {
      lIIIIIlIll();
   }

   private static boolean lIIIIIllIl(int var0) {
      return var0 == 0;
   }

   public final void ⴜ() {
      this.ϛⰄ = (boolean)llllIIIl[0];
      this.ς = System.currentTimeMillis();
   }

   @JvmName(
      name = "Đ"
   )
   public final double Đ() {
      // $FF: Couldn't be decompiled
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ⰺ var1) {
      this.ⲋ = var1;
   }

   @NotNull
   public final ⱙ Ἒⅾ(double var1) {
      int var4 = llllIIIl[0];
      int var5 = llllIIIl[0];
      ⱙ var6 = (ⱙ)this;
      int var7 = llllIIIl[0];
      var6.ĂƂ = var1;
      var6.ς();
      return (ⱙ)this;
   }

   private static boolean lIIIIlIIlI(int var0) {
      return var0 <= 0;
   }

   @NotNull
   public final ⱙ ᵴἥ() {
      int var2 = llllIIIl[0];
      int var3 = llllIIIl[0];
      ⱙ var4 = (ⱙ)this;
      int var5 = llllIIIl[0];
      int var10001;
      if (lIIIIIllIl(var4.ϛⰄ)) {
         var10001 = llllIIIl[1];
         "".length();
         if ((86 + 126 - 54 + 21 ^ 135 + 71 - 24 + 1) <= "  ".length()) {
            return null;
         }
      } else {
         var10001 = llllIIIl[0];
      }

      var4.ϛⰄ = (boolean)var10001;
      return (ⱙ)this;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final boolean ϛⰄ() {
      return this.ϛⰄ;
   }

   @NotNull
   public final ⱙ ᴃᎲ(@NotNull Color var1) {
      int var3 = llllIIIl[0];
      int var4 = llllIIIl[0];
      ⱙ var5 = (ⱙ)this;
      int var6 = llllIIIl[0];
      var5.Ἒⅾ = var1;
      return (ⱙ)this;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final double ᴃᎲ() {
      return this.ᴃᎲ;
   }

   private static boolean lIIIIlIIII(int var0) {
      return var0 >= 0;
   }

   public final void ς() {
      this.ς = System.currentTimeMillis() - (long)(this.ĂƂ * 1000.0D);
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final Color 〥ҳⱆ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(double var1) {
      this.u = var1;
   }

   public ⱙ() {
      this.ⲋ = ⰺ.ⲋ;
      this.〥ҳⱆ = Color.white;
      this.Ἒⅾ = Color.black;
      this.ς = System.currentTimeMillis() + (long)llllIIIl[2];
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.ĂƂ = var1;
   }

   private static void lIIIIIlIll() {
      llllIIIl = new int[3];
      llllIIIl[0] = (42 ^ 50 ^ 61 ^ 45) & (72 ^ 99 ^ 41 ^ 10 ^ -" ".length());
      llllIIIl[1] = " ".length();
      llllIIIl[2] = -18493 & 10018492;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ⰺ ⲋ() {
      return this.ⲋ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(Color var1) {
      this.〥ҳⱆ = var1;
   }

   @NotNull
   public final ⱙ u(@NotNull Color var1) {
      int var3 = llllIIIl[0];
      int var4 = llllIIIl[0];
      ⱙ var5 = (ⱙ)this;
      int var6 = llllIIIl[0];
      var5.〥ҳⱆ = var1;
      return (ⱙ)this;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final Color Ἒⅾ() {
      return this.Ἒⅾ;
   }

   @JvmName(
      name = "ɡ"
   )
   public final boolean ɡ() {
      int var10000;
      if (lIIIIIllIl(this.Ɏ())) {
         var10000 = llllIIIl[1];
         "".length();
         if (((102 ^ 112) & ~(89 ^ 79)) != 0) {
            return (boolean)((53 ^ 37) & ~(129 ^ 145));
         }
      } else {
         var10000 = llllIIIl[0];
      }

      return (boolean)var10000;
   }

   @NotNull
   public final Color ⲋ(@NotNull Color var1, @NotNull Color var2, double var3) {
      return new Color(this.ⲋ(var1.getRed(), var2.getRed(), var3), this.ⲋ(var1.getGreen(), var2.getGreen(), var3), this.ⲋ(var1.getBlue(), var2.getBlue(), var3), this.ⲋ(var1.getAlpha(), var2.getAlpha(), var3));
   }

   public final void ͷ() {
      this.ϛⰄ = (boolean)llllIIIl[1];
      this.ς = System.currentTimeMillis();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return this.ĂƂ;
   }

   @JvmName(
      name = "ⲡ"
   )
   public final Color ⲡ() {
      return this.ⲋ(this.〥ҳⱆ, this.Ἒⅾ, this.Đ());
   }

   private static boolean lIIIIIllII(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "Ɏ"
   )
   public final boolean Ɏ() {
      byte llIllIIlllIIIll = llIllIIlllIIlII.ϛⰄ;
      int var10000;
      if (lIIIIIllIl(llIllIIlllIIIll)) {
         if (lIIIIlIIII(lIIIIIlllI(llIllIIlllIIlII.Đ(), 1.0D))) {
            var10000 = llllIIIl[1];
            "".length();
            if ((34 + 103 - 43 + 46 ^ 79 + 9 - 41 + 89) < 0) {
               return (boolean)((71 ^ 38 ^ 94 ^ 34) & (228 ^ 149 ^ 235 ^ 135 ^ -" ".length()));
            }
         } else {
            var10000 = llllIIIl[0];
            "".length();
            if (-(73 ^ 68 ^ 19 ^ 26) >= 0) {
               return (boolean)((28 + 10 - -2 + 116 ^ 9 + 115 - 96 + 135) & (123 + 3 - 43 + 44 ^ 115 ^ 51 ^ -" ".length()));
            }
         }
      } else {
         if (!lIIIIlIIIl(llIllIIlllIIIll, llllIIIl[1])) {
            throw new NoWhenBranchMatchedException();
         }

         if (lIIIIlIIlI(lIIIIIllll(llIllIIlllIIlII.Đ(), 1.0E-4D))) {
            var10000 = llllIIIl[1];
            "".length();
            if ("   ".length() != "   ".length()) {
               return (boolean)((58 ^ 91) & ~(113 ^ 16));
            }
         } else {
            var10000 = llllIIIl[0];
            "".length();
            if (null != null) {
               return (boolean)((213 ^ 154) & ~(99 ^ 44));
            }
         }
      }

      return (boolean)var10000;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final double Ꜥ() {
      return (this.ᴃᎲ - this.u) * this.Đ() + this.u;
   }

   @NotNull
   public final ⱙ ᴃᎲ(double var1) {
      int var4 = llllIIIl[0];
      int var5 = llllIIIl[0];
      ⱙ var6 = (ⱙ)this;
      int var7 = llllIIIl[0];
      var6.u = var1;
      return (ⱙ)this;
   }

   private static int lIIIIIlllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(Color var1) {
      this.Ἒⅾ = var1;
   }

   @NotNull
   public final ⱙ 〥ҳⱆ(double var1) {
      int var4 = llllIIIl[0];
      int var5 = llllIIIl[0];
      ⱙ var6 = (ⱙ)this;
      int var7 = llllIIIl[0];
      var6.ᴃᎲ = var1;
      return (ⱙ)this;
   }

   @JvmName(
      name = "u"
   )
   public final void u(double var1) {
      this.ᴃᎲ = var1;
   }
}
