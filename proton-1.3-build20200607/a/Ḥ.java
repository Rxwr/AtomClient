package a;

import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0017\u0018\u0000 \u00012\u00020::\u0001\u0001B-\u0012\u0006\u0010,\u001a\u00020(\u0012\b\b\u0002\u0010.\u001a\u00020\u0012\u0012\b\b\u0002\u00106\u001a\u00020\u0012\u0012\b\b\u0002\u00107\u001a\u00020\b¢\u0006\u0004\b8\u00109J\u001f\u0010\u0001\u001a\u00020/2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b\u0001\u00100J\u001f\u0010\u0001\u001a\u00020/2\u0006\u0010,\u001a\u0002012\u0006\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0001\u00102J\u0017\u0010\u0014\u001a\u00020/2\u0006\u0010,\u001a\u000201H\u0016¢\u0006\u0004\b\u0014\u00103J\u0017\u0010\u0011\u001a\u00020/2\u0006\u0010,\u001a\u000201H\u0016¢\u0006\u0004\b\u0011\u00103J\u0017\u0010\u0003\u001a\u00020/2\b\b\u0002\u0010,\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\u0017J\u000f\u00104\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00105R(\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0001\u0010\u0007¨\u0006\u0086\u000eR\u001d\u0010\r\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0086\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0096\u0004R&\u0010\u0014\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0001\u0010\u0016¨\u0006\u0086\u000eR&\u0010\u0005\u001a\u00020\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\r\u0010\f\"\u0004\b\u0011\u0010\u0017¨\u0006\u0086\u000eR&\u0010\u0003\u001a\u00020\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u0014\u0010\u0017¨\u0006\u0086\u000eR\u001a\u0010\u0018\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u0082\u0004R\u0017\u0010\u001e\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f¨\u0006\u0086\u0004R&\u0010\u001b\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010\"\u0004\b\u0014\u0010\"¨\u0006\u0086\u000eR\u001d\u0010\u001f\u001a\u00020\u00128\u0007@\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015¨\u0006\u0086\u0004R\u001d\u0010\u000f\u001a\u00020\u00128\u0007@\u0006¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015¨\u0006\u0086\u0004R&\u0010%\u001a\u00020\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\n\u001a\u0004\b'\u0010\f\"\u0004\b\u0005\u0010\u0017¨\u0006\u0086\u000eR\u001a\u0010#\u001a\u00020\u000e8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0010¨\u0006\u0096\u0004R\u001d\u0010\t\u001a\u00020(8\u0007@\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006\u0086\u0004"},
   d2 = {"La/Ḥ;", "ⲋ", "La/Ỽk;", "Ἒⅾ", "La/Ỽk;", "〥ҳⱆ", "()La/Ỽk;", "(La/Ỽk;)V", "", "ɡ", "Z", "ἶṗ", "()Z", "ĂƂ", "La/ė;", "Đ", "()La/ė;", "u", "", "I", "ᴃᎲ", "()I", "(I)V", "(Z)V", "ϛⰄ", "ⱯꝣѺ", "La/ⱙ;", "Ꜥ", "La/ⱙ;", "ɧῙ", "ς", "ⲡ", "La/ė;", "ʅ", "(La/ė;)V", "Ɏ", "ɻ", "ᵴἥ", "ƺ", "ꙑứ", "", "Ljava/lang/String;", "Ἠ", "()Ljava/lang/String;", "p0", "", "p1", "", "(IC)V", "La/ⅵ;", "(La/ⅵ;I)V", "(La/ⅵ;)V", "ⴜ", "()V", "p2", "p3", "<init>", "(Ljava/lang/String;IIZ)V", "La/Ữ;"}
)
public class Ḥ extends Ữ {
   private static boolean llIIIIlII(int var0, int var1) {
      return var0 == var1;
   }

   public void ᴃᎲ(@NotNull ⅵ var1) {
      super.ᴃᎲ(var1);
      this.Ꙗ();
   }

   @JvmName(
      name = "ꙑứ"
   )
   public final boolean ꙑứ() {
      return this.ς;
   }

   @JvmName(
      name = "ἶṗ"
   )
   public final boolean ἶṗ() {
      return this.ɡ;
   }

   public void ⲋ(int var1, char var2) {
      super.ⲋ(var1, var2);
      this.ς = (boolean)lIllIIll[1];
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable Ỽk var1) {
      this.Ἒⅾ = var1;
   }

   private static boolean llIIIIIIl(int var0) {
      return var0 != 0;
   }

   public void ⲋ(@NotNull ⅵ lllIIllIIIIIIII, int var2) {
      label25: {
         super.ⲋ(lllIIllIIIIIIII, var2);
         if (llIIIIIIl(lllIIllIIIIIIIl.ɡ)) {
            Ỽk var10000 = lllIIllIIIIIIIl.Ἒⅾ;
            if (llIIIIIll(var10000)) {
               if (llIIIIlII(var10000.u(lllIIllIIIIIIII.ⲋ()), lIllIIll[1])) {
                  "".length();
                  if ("   ".length() >= (80 ^ 84)) {
                     return;
                  }

                  lllIIllIIIIIIIl.ϛⰄ = (boolean)lIllIIll[1];
                  "".length();
                  if ("  ".length() <= 0) {
                     return;
                  }
                  break label25;
               }
            } else {
               "".length();
               "".length();
               if (" ".length() >= (82 + 103 - 108 + 51 ^ 92 + 43 - 61 + 58)) {
                  return;
               }
            }
         }

         if (llIIIIlIl(llIIIIIlI((double)lllIIllIIIIIIII.ⲋ().ĂƂ(), 30.0D))) {
            lllIIllIIIIIIIl.ᴃᎲ = (boolean)lIllIIll[1];
            lllIIllIIIIIIIl.ⲡ = ė.ⲋ$default(lllIIllIIIIIIII.ĂƂ(), lIllIIll[0], lIllIIll[0], lIllIIll[2], (Object)null);
         }
      }

      ᶔ.ⲋ.〥ҳⱆ();
   }

   @JvmName(
      name = "ɻ"
   )
   public final int ɻ() {
      return this.Ɏ;
   }

   @JvmName(
      name = "Đ"
   )
   public ė Đ() {
      return new ė(lIllIIll[0], (int)30.0D);
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final Ỽk 〥ҳⱆ() {
      return this.Ἒⅾ;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final void 〥ҳⱆ(boolean var1) {
      this.ς = var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(boolean var1) {
      this.ϛⰄ = var1;
   }

   public Ḥ(@NotNull String var1, int var2, int var3, boolean var4) {
      super();
      this.Đ = var1;
      this.ᵴἥ = var2;
      this.Ɏ = var3;
      this.ɡ = var4;
      this.ς = (boolean)lIllIIll[1];
      ⱙ var5 = new ⱙ();
      int var6 = lIllIIll[0];
      int var7 = lIllIIll[0];
      int var9 = lIllIIll[0];
      var5.ᴃᎲ(0.9D);
      "".length();
      var5.〥ҳⱆ(1.0D);
      "".length();
      var5.Ἒⅾ(0.1D);
      "".length();
      var5.ĂƂ(ⰺ.ĂƂ);
      "".length();
      this.Ꜥ = var5;
      if (llIIIIIIl(this.ɡ)) {
         Ỽk var12 = new Ỽk();
         var6 = lIllIIll[0];
         var7 = lIllIIll[0];
         var9 = lIllIIll[0];
         var12.ⲋ(new ė(lIllIIll[7], lIllIIll[8]));
         var12.ĂƂ(var12.ς().ⲋ((Ữ)var12));
         this.Ἒⅾ = var12;
      }

      this.Ꜥ.ⴜ();
      this.ⲡ = new ė(lIllIIll[0], lIllIIll[0]);
   }

   private static int llIIIIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(@NotNull ė var1) {
      this.ⲡ = var1;
   }

   static {
      llIIIIIII();
      ⲋ = new Ḥ.ⲋ((DefaultConstructorMarker)null);
   }

   @JvmName(
      name = "ʅ"
   )
   public final ė ʅ() {
      return this.ⲡ;
   }

   private static void llIIIIIII() {
      lIllIIll = new int[12];
      lIllIIll[0] = (133 ^ 188 ^ 188 ^ 136) & (149 ^ 154 ^ "  ".length() ^ -" ".length());
      lIllIIll[1] = " ".length();
      lIllIIll[2] = "   ".length();
      lIllIIll[3] = 112 + 100 - 195 + 133;
      lIllIIll[4] = 18 ^ 21 ^ 189 ^ 136;
      lIllIIll[5] = 85 ^ 69;
      lIllIIll[6] = "  ".length();
      lIllIIll[7] = 100 + 63 - 25 + 5 ^ 101 + 116 - 205 + 116;
      lIllIIll[8] = 133 ^ 143;
      lIllIIll[9] = 32 ^ 78 ^ 84 ^ 62;
      lIllIIll[10] = 138 + 60 - 73 + 75;
      lIllIIll[11] = 82 ^ 90;
   }

   public void ⴜ() {
      super.ⴜ();
      if (llIIIIIIl(this.ᴃᎲ)) {
         ė var1 = ⱉȬ.ᴃᎲ.Ꜥ().ĂƂ(this.ⲡ);
         ė var10000 = this.Ꜥ();
         var10000.u(var10000.ⲋ() + var1.ⲋ());
         var10000 = this.Ꜥ();
         var10000.ᴃᎲ(var10000.ĂƂ() + var1.ĂƂ());
         this.ⲡ = ⱉȬ.ᴃᎲ.Ꜥ();
         ᶔ.ⲋ.〥ҳⱆ();
      }

   }

   @JvmName(
      name = "ƺ"
   )
   public final int ƺ() {
      return this.ᵴἥ;
   }

   private static boolean llIIIIIll(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      this.〥ҳⱆ = var1;
   }

   public final void Ἒⅾ(boolean lllIIlIllllIIll) {
      GL11.glPushMatrix();
      if (llIIIIIIl(lllIIlIllllIlII.Ꜥ.ɡ())) {
         GL11.glTranslated((double)lllIIlIllllIlII.ⲡ().ⲋ() / 2.0D, (double)lllIIlIllllIlII.ⲡ().ĂƂ() / 2.0D, 0.0D);
         GL11.glScaled(lllIIlIllllIlII.Ꜥ.Ꜥ(), lllIIlIllllIlII.Ꜥ.Ꜥ(), 1.0D);
         GL11.glTranslated(-((double)lllIIlIllllIlII.ⲡ().ⲋ()) / 2.0D, -((double)lllIIlIllllIlII.ⲡ().ĂƂ()) / 2.0D, 0.0D);
      }

      Color var10000;
      if (llIIIIIIl(lllIIlIllllIIll)) {
         var10000 = new Color(lIllIIll[3], lIllIIll[4], lIllIIll[4]);
         "".length();
         if (((98 ^ 0) & ~(204 ^ 174)) >= "   ".length()) {
            return;
         }
      } else {
         var10000 = Ὴ.ⲋ.ⲋ().ⲡ();
      }

      byte lllIIlIllllIIlI = var10000;
      ⲙ.ⲋ(Ὴ.ⲋ.ⲋ().Ꜥ());
      ⲙ.ĂƂ(0.0D, 0.0D, (double)lllIIlIllllIlII.ⲡ().ⲋ(), 30.0D, 6.0D, lllIIlIllllIIlI);
      short lllIIlIllllIIIl = ⱉȬ.ᴃᎲ.ⲋ().u(lllIIlIllllIlII.Đ);
      String lllIIlIllllIIII = (int)((double)(lllIIlIllllIlII.ⲡ().ⲋ() - lllIIlIllllIIIl.ⲋ()) / 2.0D);
      short lllIIlIlllIllll = (int)((30.0D - (double)lllIIlIllllIIIl.ĂƂ()) / 2.0D);
      Ꞓ.DefaultImpls.ⲋ$default(ⱉȬ.ᴃᎲ.ⲋ(), lllIIlIllllIIII, lllIIlIlllIllll, Ὴ.ⲋ.ⲋ().ĂƂ(), lllIIlIllllIlII.Đ, (boolean)lIllIIll[0], lIllIIll[5], (Object)null);
      if (llIIIIIll(lllIIlIllllIlII.Ἒⅾ)) {
         GL11.glPushMatrix();
         Ỽk var10 = lllIIlIllllIlII.Ἒⅾ;
         if (llIIIIllI(var10)) {
            Intrinsics.throwNpe();
         }

         double var11 = (double)var10.Ꜥ().ⲋ();
         Ỽk var10001 = lllIIlIllllIlII.Ἒⅾ;
         if (llIIIIllI(var10001)) {
            Intrinsics.throwNpe();
         }

         GL11.glTranslated(var11, (double)var10001.Ꜥ().ĂƂ(), 0.0D);
         var10 = lllIIlIllllIlII.Ἒⅾ;
         if (llIIIIIll(var10)) {
            var10.b_();
            "".length();
            if (null != null) {
               return;
            }
         } else {
            "".length();
         }

         GL11.glPopMatrix();
      }

      ⲙ.ⲋ(0.0D, 30.0D, (double)lllIIlIllllIlII.ⲡ().ⲋ(), (double)lllIIlIllllIlII.ⲡ().ĂƂ() - 30.0D, 6.0D, Ὴ.ⲋ.ⲋ().ᴃᎲ(), Ὴ.ⲋ.ⲋ().〥ҳⱆ(), lllIIlIllllIIlI);
      ė var6 = new ė((int)((double)lllIIlIllllIlII.Ꜥ().ⲋ() * ⱉȬ.ᴃᎲ.ƶ()), (int)((double)((int)((double)ⱉȬ.ᴃᎲ.Đ() / ⱉȬ.ᴃᎲ.ƶ()) - lllIIlIllllIlII.Ꜥ().ĂƂ() - lllIIlIllllIlII.ⲡ().ĂƂ()) * ⱉȬ.ᴃᎲ.ƶ()));
      ė var7 = (new ė(lllIIlIllllIlII.ⲡ().ⲋ(), lllIIlIllllIlII.ⲡ().ĂƂ() - (int)30.0D)).ⲋ(ⱉȬ.ᴃᎲ.ƶ());
      int var8 = lIllIIll[1];
      ⲙ.ⲋ var9 = new ⲙ.ⲋ(new ė(var6.ⲋ() - var8, var6.ĂƂ() - var8 + lIllIIll[6]), new ė(var7.ⲋ() + var8 * lIllIIll[6], var7.ĂƂ() + var8 * lIllIIll[6] - lIllIIll[6]));
      ⲙ.ⲋ.ⲋ(var9);
      ⲙ.ⲋ.ⲋ(lllIIlIllllIlII.Ꜥ().u(new ė(-var8, -var8)), lllIIlIllllIlII.Ꜥ().u(lllIIlIllllIlII.ⲡ()).u(new ė(var8 * lIllIIll[6], var8 * lIllIIll[6])).u(new ė(lIllIIll[0], (int)30.0D)));
      GL11.glPushMatrix();
      super.b_();
      GL11.glPopMatrix();
      ⲙ.ⲋ.ⲋ();
      ⲙ.ⲋ.〥ҳⱆ();
      GL11.glPopMatrix();
   }

   @JvmName(
      name = "ɧῙ"
   )
   public final boolean ɧῙ() {
      return this.Ꜥ.ɡ();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final int ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return new ė(this.ᵴἥ, this.Ɏ);
   }

   public void u(@NotNull ⅵ var1) {
      super.u(var1);
      this.ᴃᎲ = (boolean)lIllIIll[0];
   }

   @JvmName(
      name = "ⱯꝣѺ"
   )
   public final boolean ⱯꝣѺ() {
      return this.ϛⰄ;
   }

   private static boolean llIIIIllI(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return this.ᴃᎲ;
   }

   private static boolean llIIIIlIl(int var0) {
      return var0 < 0;
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      this.ᴃᎲ = var1;
   }

   @JvmName(
      name = "Ἠ"
   )
   public final String Ἠ() {
      return this.Đ;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0086T"},
      d2 = {"La/Ḥ$ⲋ;", "", "ⲋ", "D", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private ⲋ() {
      }
   }
}
