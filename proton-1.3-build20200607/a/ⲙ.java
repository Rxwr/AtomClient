package a;

import java.awt.Color;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u000200:\u0001\bB\t\b\u0002¢\u0006\u0004\b/\u0010+J\u0015\u0010\b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0013J=\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\b\u0010\u001cJ=\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0006\u0010\u001cJE\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\b\u0010\u001dJ-\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\b\u0010\u001eJ7\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 H\u0007¢\u0006\u0004\b\b\u0010!J%\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020 ¢\u0006\u0004\b\b\u0010\"J5\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020 ¢\u0006\u0004\b\b\u0010#J=\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020 ¢\u0006\u0004\b\b\u0010$JO\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020 H\u0007¢\u0006\u0004\b\b\u0010'J?\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020 H\u0007¢\u0006\u0004\b\u0006\u0010$J]\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\b\b\u0010*J\r\u0010\b\u001a\u00020\u001b¢\u0006\u0004\b\b\u0010+J\u0015\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010,J\u0017\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020 H\u0007¢\u0006\u0004\b\b\u0010-J\u0017\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0006\u0010,J\u001d\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010.J\r\u0010\u0002\u001a\u00020\u001b¢\u0006\u0004\b\u0002\u0010+R&\u0010\b\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u0006\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\u0004\b\b\u0010\u0007¨\u0006\u0086\u000eR&\u0010\t\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0006\u0010\f\"\u0004\b\b\u0010\r¨\u0006\u0086\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0082\u0004"},
   d2 = {"La/ⲙ;", "La/ė;", "〥ҳⱆ", "La/ė;", "ᴃᎲ", "()La/ė;", "ĂƂ", "(La/ė;)V", "ⲋ", "u", "", "Z", "()Z", "(Z)V", "Ljava/util/Stack;", "La/ⲙ$ⲋ;", "Ljava/util/Stack;", "La/Ữ;", "p0", "(La/Ữ;)Z", "", "p1", "p2", "p3", "p4", "", "p5", "", "(DDDDDI)V", "(DDDIII)V", "(DDDD)V", "", "Ljava/awt/Color;", "(FFFFLjava/awt/Color;)V", "(La/ė;La/ė;Ljava/awt/Color;)V", "(DDDDLjava/awt/Color;)V", "(DDDDDLjava/awt/Color;)V", "p6", "p7", "(DDDDDLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "p8", "p9", "(IIFFIIIIFF)V", "()V", "(La/ⲙ$ⲋ;)V", "(Ljava/awt/Color;)V", "(La/ė;La/ė;)V", "<init>", ""}
)
public final class ⲙ {
   private static void lIIllIlIlII() {
      lIIIlllIII = new int[21];
      lIIIlllIII[0] = (30 ^ 86 ^ 204 ^ 161) & (" ".length() ^ 9 ^ 45 ^ -" ".length());
      lIIIlllIII[1] = -(-17 & 4863) & -24833 & 32767;
      lIIIlllIII[2] = " ".length();
      lIIIlllIII[3] = -(-28346 & 32447) & -8217 & 15359;
      lIIIlllIII[4] = -22690 & 23459;
      lIIIlllIII[5] = -27841 & 28611;
      lIIIlllIII[6] = 52 + 84 - 40 + 47 ^ 86 + 68 - 80 + 62;
      lIIIlllIII[7] = 69 ^ 65;
      lIIIlllIII[8] = -(-20843 & 32763) & -20481 & 32760;
      lIIIlllIII[9] = 21 ^ 5;
      lIIIlllIII[10] = "  ".length();
      lIIIlllIII[11] = 230 + 35 - 51 + 37 ^ 34 + 80 - 102 + 147;
      lIIIlllIII[12] = -(-2217 & 15023) & -17 & 16375;
      lIIIlllIII[13] = -(-2673 & 20087) & -12289 & 32631;
      lIIIlllIII[14] = -17105 & 24529;
      lIIIlllIII[15] = -16583 & 24006;
      lIIIlllIII[16] = 42 + 129 - 106 + 65 ^ 19 + 29 - -62 + 28;
      lIIIlllIII[17] = "  ".length() ^ 118 ^ 84;
      lIIIlllIII[18] = 8 ^ 56;
      lIIIlllIII[19] = 12 ^ 124 ^ 224 ^ 168;
      lIIIlllIII[20] = "   ".length();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(@NotNull ė var1) {
      〥ҳⱆ = var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ė ᴃᎲ() {
      return 〥ҳⱆ;
   }

   @JvmStatic
   @JvmOverloads
   public static final void ⲋ(double var0, double var2, double var4) {
      ⲋ$default(var0, var2, var4, lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[19], (Object)null);
   }

   public final void ⲋ(double var1, double var3, double var5, double var7, double var9, @NotNull Color var11) {
      ⲋ(var11);
      this.ⲋ(var1 + var5 - var9, var3 + var7 - var9, var9, 0.0D, 90.0D, lIIIlllIII[9]);
      this.ⲋ(var1 + var9, var3 + var7 - var9, var9, 90.0D, 180.0D, lIIIlllIII[9]);
      this.ⲋ(var1 + var9, var3 + var9, var9, 180.0D, 270.0D, lIIIlllIII[9]);
      this.ⲋ(var1 + var5 - var9, var3 + var9, var9, 270.0D, 360.0D, lIIIlllIII[9]);
      Tessellator var12 = Tessellator.func_178181_a();
      BufferBuilder var13 = var12.func_178180_c();
      var13.func_181668_a(lIIIlllIII[7], DefaultVertexFormats.field_181705_e);
      var13.func_181662_b(var1 + var5 - var9, var3, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var9, var3, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5 - var9, var3 + var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5 - var9, var3 + var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var9, var3, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var9, var3 + var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5, var3 + var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1, var3 + var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1, var3 + var7 - var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5, var3 + var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1, var3 + var7 - var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5, var3 + var7 - var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5 - var9, var3 + var7 - var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var9, var3 + var7 - var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5 - var9, var3 + var7, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var5 - var9, var3 + var7, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var9, var3 + var7 - var9, 0.0D).func_181675_d();
      var13.func_181662_b(var1 + var9, var3 + var7, 0.0D).func_181675_d();
      var12.func_78381_a();
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ė var1) {
      ᴃᎲ = var1;
   }

   public final void ⲋ(int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      float var11 = 1.0F / var9;
      float var12 = 1.0F / var10;
      Tessellator var13 = Tessellator.func_178181_a();
      BufferBuilder var14 = var13.func_178180_c();
      var14.func_181668_a(lIIIlllIII[6], DefaultVertexFormats.field_181709_i);
      var14.func_181662_b((double)var1, (double)(var2 + var8), 0.0D).func_187315_a((double)(var3 * var11), (double)((var4 + (float)var6) * var12)).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
      var14.func_181662_b((double)(var1 + var7), (double)(var2 + var8), 0.0D).func_187315_a((double)((var3 + (float)var5) * var11), (double)((var4 + (float)var6) * var12)).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
      var14.func_181662_b((double)(var1 + var7), (double)var2, 0.0D).func_187315_a((double)((var3 + (float)var5) * var11), (double)(var4 * var12)).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
      var14.func_181662_b((double)var1, (double)var2, 0.0D).func_187315_a((double)(var3 * var11), (double)(var4 * var12)).func_181666_a(1.0F, 1.0F, 1.0F, 1.0F).func_181675_d();
      var13.func_78381_a();
   }

   public final void ⲋ() {
      ĂƂ.pop();
      "".length();
      if (lIIllIlIlIl(ĂƂ.isEmpty())) {
         GL11.glDisable(lIIIlllIII[1]);
         "".length();
         if (-"  ".length() >= 0) {
            return;
         }
      } else {
         lIlIIllllIIIlIl.ĂƂ((ⲙ.ⲋ)ĂƂ.peek());
      }

   }

   public final void ⲋ(@NotNull ⲙ.ⲋ var1) {
      if (lIIllIlIlIl(ĂƂ.isEmpty())) {
         GL11.glEnable(lIIIlllIII[1]);
      }

      this.ĂƂ(var1);
      ĂƂ.push(var1);
      "".length();
   }

   private static boolean lIIllIlIlIl(int var0) {
      return var0 != 0;
   }

   private static int lIIllIllIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmStatic
   @JvmOverloads
   public static final void ⲋ(double var0, double var2, double var4, int var6, int var7, int var8) {
      ⲋ.ⲋ(var0, var2, var4, (double)var6, (double)var7, var8);
   }

   private static boolean lIIllIllIII(int var0, int var1) {
      return var0 <= var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      u = var1;
   }

   public final void ⲋ(double lIlIIlllIllIIlI, double lIlIIlllIllIIIl, double lIlIIlllIllIIII, double var7, double lIlIIlllIlIlllI, int lIlIIlllIlIllIl) {
      Tessellator var12 = Tessellator.func_178181_a();
      BufferBuilder lIlIIlllIlIlIll = var12.func_178180_c();
      lIlIIlllIlIlIll.func_181668_a(lIIIlllIII[7], DefaultVertexFormats.field_181705_e);
      int lIlIIlllIlIlIlI = (int)((double)lIlIIlllIlIllIl / ((double)lIIIlllIII[8] / var7)) + lIIIlllIII[2];

      do {
         if (!lIIllIllIlI(lIIllIllIIl((double)lIlIIlllIlIlIlI, (double)lIlIIlllIlIllIl / ((double)lIIIlllIII[8] / lIlIIlllIlIlllI)))) {
            var12.func_78381_a();
            return;
         }

         Exception lIlIIlllIlIlIIl = 6.283185307179586D * (double)(lIlIIlllIlIlIlI - lIIIlllIII[2]) / (double)lIlIIlllIlIllIl;
         byte lIlIIlllIllIIll = 6.283185307179586D * (double)lIlIIlllIlIlIlI / (double)lIlIIlllIlIllIl;
         lIlIIlllIlIlIll.func_181662_b(lIlIIlllIllIIlI, lIlIIlllIllIIIl, 0.0D).func_181675_d();
         lIlIIlllIlIlIll.func_181662_b(lIlIIlllIllIIlI + Math.cos(lIlIIlllIllIIll) * lIlIIlllIllIIII, lIlIIlllIllIIIl + Math.sin(lIlIIlllIllIIll) * lIlIIlllIllIIII, 0.0D).func_181675_d();
         lIlIIlllIlIlIll.func_181662_b(lIlIIlllIllIIlI + Math.cos(lIlIIlllIlIlIIl) * lIlIIlllIllIIII, lIlIIlllIllIIIl + Math.sin(lIlIIlllIlIlIIl) * lIlIIlllIllIIII, 0.0D).func_181675_d();
         ++lIlIIlllIlIlIlI;
         "".length();
      } while(((213 ^ 199) & ~(68 ^ 86)) <= ((66 ^ 68) & ~(131 ^ 133)));

   }

   private final void ĂƂ(ⲙ.ⲋ var1) {
      int var2 = lIIIlllIII[0];
      int var3 = lIIIlllIII[0];
      int var5 = lIIIlllIII[0];
      GL11.glScissor(var1.ⲋ().ⲋ(), var1.ⲋ().ĂƂ(), var1.ĂƂ().ⲋ(), var1.ĂƂ().ĂƂ());
   }

   @JvmStatic
   public static final void ⲋ(float var0, float var1, float var2, float var3, @NotNull Color var4) {
      GL11.glEnable(lIIIlllIII[3]);
      GL11.glBlendFunc(lIIIlllIII[4], lIIIlllIII[5]);
      GL11.glBegin(lIIIlllIII[6]);
      GL11.glColor4f((float)var4.getRed() / 255.0F, (float)var4.getGreen() / 255.0F, (float)var4.getBlue() / 255.0F, (float)var4.getAlpha() / 255.0F);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(var0, var1 + var3);
      GL11.glVertex2f(var0 + var2, var1 + var3);
      GL11.glEnd();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public final void ĂƂ(double lIlIIlllIIlllII, double lIlIIlllIIllIll, double lIlIIlllIIllIlI, double var7, double lIlIIlllIIllIII, int lIlIIlllIIlIlll) {
      Tessellator var12 = Tessellator.func_178181_a();
      BufferBuilder lIlIIlllIIlIlIl = var12.func_178180_c();
      lIlIIlllIIlIlIl.func_181668_a(lIIIlllIII[2], DefaultVertexFormats.field_181705_e);
      int lIlIIlllIIlIlII = (int)((double)lIlIIlllIIlIlll / ((double)lIIIlllIII[8] / var7)) + lIIIlllIII[2];

      do {
         if (!lIIllIllIlI(lIIllIllIll((double)lIlIIlllIIlIlII, (double)lIlIIlllIIlIlll / ((double)lIIIlllIII[8] / lIlIIlllIIllIII)))) {
            var12.func_78381_a();
            return;
         }

         char lIlIIlllIIlIIll = 6.283185307179586D * (double)(lIlIIlllIIlIlII - lIIIlllIII[2]) / (double)lIlIIlllIIlIlll;
         int lIlIIlllIIlllIl = 6.283185307179586D * (double)lIlIIlllIIlIlII / (double)lIlIIlllIIlIlll;
         lIlIIlllIIlIlIl.func_181662_b(lIlIIlllIIlllII + Math.cos(lIlIIlllIIlllIl) * lIlIIlllIIllIlI, lIlIIlllIIllIll + Math.sin(lIlIIlllIIlllIl) * lIlIIlllIIllIlI, 0.0D).func_181675_d();
         lIlIIlllIIlIlIl.func_181662_b(lIlIIlllIIlllII + Math.cos(lIlIIlllIIlIIll) * lIlIIlllIIllIlI, lIlIIlllIIllIll + Math.sin(lIlIIlllIIlIIll) * lIlIIlllIIllIlI, 0.0D).func_181675_d();
         ++lIlIIlllIIlIlII;
         "".length();
      } while("  ".length() != "   ".length());

   }

   private static boolean lIIllIllIlI(int var0) {
      return var0 <= 0;
   }

   public final boolean ⲋ(@NotNull Ữ var1) {
      if (!lIIllIlIlIl(u)) {
         return (boolean)lIIIlllIII[2];
      } else {
         ė var2 = var1.Ꞑ();
         ė var3 = var1.Ꞑ().u(var1.ⲡ());
         int var10000;
         if (lIIllIlIllI(var2.ⲋ(), ᴃᎲ.ⲋ()) && lIIllIllIII(var3.ⲋ(), 〥ҳⱆ.ⲋ()) && lIIllIlIllI(var2.ĂƂ(), ᴃᎲ.ĂƂ()) && lIIllIllIII(var3.ĂƂ(), 〥ҳⱆ.ĂƂ())) {
            var10000 = lIIIlllIII[2];
            "".length();
            if ("   ".length() <= ((6 ^ 41) & ~(39 ^ 8))) {
               return (boolean)((169 ^ 149) & ~(95 ^ 99));
            }
         } else {
            var10000 = lIIIlllIII[0];
         }

         return (boolean)var10000;
      }
   }

   @JvmName(
      name = "u"
   )
   public final ė u() {
      return ᴃᎲ;
   }

   public final void ⲋ(@NotNull ė var1, @NotNull ė var2) {
      u = (boolean)lIIIlllIII[2];
      ᴃᎲ = var1;
      〥ҳⱆ = var2;
   }

   public final void ⲋ(double var1, double var3, double var5, double var7) {
      Color var9 = new Color(lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[11]);
      Color var10 = new Color(lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[0]);
      GL11.glDisable(lIIIlllIII[12]);
      GL11.glEnable(lIIIlllIII[3]);
      GL11.glBlendFunc(lIIIlllIII[4], lIIIlllIII[5]);
      GL11.glDisable(lIIIlllIII[13]);
      GL11.glDepthMask((boolean)lIIIlllIII[0]);
      GL11.glBegin(lIIIlllIII[6]);
      ⲋ(var9);
      GL11.glVertex2d(var1, var3);
      GL11.glVertex2d(var1, var3 + var7);
      ⲋ(var10);
      GL11.glVertex2d(var1 + var5, var3 + var7);
      GL11.glVertex2d(var1 + var5, var3);
      GL11.glEnd();
      GL11.glDisable(lIIIlllIII[3]);
      GL11.glEnable(lIIIlllIII[13]);
      GL11.glDepthMask((boolean)lIIIlllIII[2]);
   }

   public final void ⲋ(@NotNull ė var1, @NotNull ė var2, @NotNull Color var3) {
      GL11.glBegin(lIIIlllIII[2]);
      ⲋ(var3);
      GL11.glVertex2d((double)var1.ⲋ(), (double)var1.ĂƂ());
      GL11.glVertex2d((double)var2.ⲋ(), (double)var2.ĂƂ());
      GL11.glEnd();
   }

   @JvmStatic
   @JvmOverloads
   public static final void ⲋ(double var0, double var2, double var4, int var6, int var7) {
      ⲋ$default(var0, var2, var4, var6, var7, lIIIlllIII[0], lIIIlllIII[17], (Object)null);
   }

   @JvmStatic
   public static final void ⲋ(@NotNull Color var0) {
      GL11.glColor4d((double)var0.getRed() / 255.0D, (double)var0.getGreen() / 255.0D, (double)var0.getBlue() / 255.0D, (double)var0.getAlpha() / 255.0D);
   }

   static {
      lIIllIlIlII();
      ⲙ var0 = new ⲙ();
      ⲋ = var0;
      ĂƂ = new Stack();
      ᴃᎲ = new ė(lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[20], (DefaultConstructorMarker)null);
      〥ҳⱆ = new ė(lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[20], (DefaultConstructorMarker)null);
   }

   private static boolean lIIllIlIllI(int var0, int var1) {
      return var0 >= var1;
   }

   @JvmStatic
   @JvmOverloads
   public static final void ⲋ(double var0, double var2, double var4, int var6) {
      ⲋ$default(var0, var2, var4, var6, lIIIlllIII[0], lIIIlllIII[0], lIIIlllIII[18], (Object)null);
   }

   private ⲙ() {
   }

   private static int lIIllIllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return u;
   }

   public final void 〥ҳⱆ() {
      u = (boolean)lIIIlllIII[0];
   }

   @JvmStatic
   public static final void ĂƂ(double var0, double var2, double var4, double var6, double var8, @NotNull Color var10) {
      GL11.glEnable(lIIIlllIII[3]);
      ⲋ.ⲋ(var0 + var8, var2 + var8, var8, 180.0D, 270.0D, lIIIlllIII[9]);
      ⲋ.ⲋ(var0 + var4 - var8, var2 + var8, var8, 270.0D, 360.0D, lIIIlllIII[9]);
      GL11.glBegin(lIIIlllIII[7]);
      ⲙ var11 = ⲋ;
      int var12 = lIIIlllIII[0];
      int var13 = lIIIlllIII[0];
      int var15 = lIIIlllIII[0];
      GL11.glVertex2d(var0 + var4 - var8, var2);
      GL11.glVertex2d(var0 + var8, var2);
      GL11.glVertex2d(var0 + var4 - var8, var2 + var8);
      GL11.glVertex2d(var0 + var4 - var8, var2 + var8);
      GL11.glVertex2d(var0 + var8, var2);
      GL11.glVertex2d(var0 + var8, var2 + var8);
      GL11.glVertex2d(var0 + var4, var2 + var8);
      GL11.glVertex2d(var0, var2 + var8);
      GL11.glVertex2d(var0, var2 + var6);
      GL11.glVertex2d(var0 + var4, var2 + var8);
      GL11.glVertex2d(var0, var2 + var6);
      GL11.glVertex2d(var0 + var4, var2 + var6);
      GL11.glEnd();
      GL11.glLineWidth(1.7F);
      ⲋ(var10);
      GL11.glBegin(lIIIlllIII[2]);
      GL11.glVertex2d(var0 + var8, var2);
      GL11.glVertex2d(var0 + var4 - var8, var2);
      GL11.glVertex2d(var0, var2 + var8);
      GL11.glVertex2d(var0, var2 + var6);
      GL11.glVertex2d(var0 + var4, var2 + var8);
      GL11.glVertex2d(var0 + var4, var2 + var6);
      GL11.glEnd();
      ⲋ.ĂƂ(var0 + var8, var2 + var8, var8, 180.0D, 270.0D, lIIIlllIII[9]);
      ⲋ.ĂƂ(var0 + var4 - var8, var2 + var8, var8, 270.0D, 360.0D, lIIIlllIII[9]);
   }

   @JvmStatic
   public static final void ⲋ(double var0, double var2, double var4, double var6, double var8, @NotNull Color var10, @NotNull Color var11, @NotNull Color var12) {
      GL11.glEnable(lIIIlllIII[3]);
      GL11.glShadeModel(lIIIlllIII[14]);
      ⲋ(var11);
      ⲋ.ⲋ(var0 + var4 - var8, var2 + var6 - var8, var8, 0.0D, 90.0D, lIIIlllIII[9]);
      ⲋ.ⲋ(var0 + var8, var2 + var6 - var8, var8, 90.0D, 180.0D, lIIIlllIII[9]);
      GL11.glBegin(lIIIlllIII[6]);
      ⲙ var13 = ⲋ;
      int var14 = lIIIlllIII[0];
      int var15 = lIIIlllIII[0];
      int var17 = lIIIlllIII[0];
      ⲋ(var10);
      GL11.glVertex2d(var0 + var4, var2);
      GL11.glVertex2d(var0, var2);
      ⲋ(var11);
      GL11.glVertex2d(var0, var2 + var6 - var8);
      GL11.glVertex2d(var0 + var4, var2 + var6 - var8);
      GL11.glEnd();
      GL11.glBegin(lIIIlllIII[7]);
      var13 = ⲋ;
      var14 = lIIIlllIII[0];
      var15 = lIIIlllIII[0];
      var17 = lIIIlllIII[0];
      ⲋ(var11);
      GL11.glVertex2d(var0 + var4 - var8, var2 + var6 - var8);
      GL11.glVertex2d(var0 + var8, var2 + var6 - var8);
      GL11.glVertex2d(var0 + var4 - var8, var2 + var6);
      GL11.glVertex2d(var0 + var4 - var8, var2 + var6);
      GL11.glVertex2d(var0 + var8, var2 + var6 - var8);
      GL11.glVertex2d(var0 + var8, var2 + var6);
      GL11.glEnd();
      GL11.glLineWidth(1.7F);
      GL11.glBegin(lIIIlllIII[2]);
      ⲋ(var12);
      GL11.glVertex2d(var0 + var4, var2 + var6 - var8);
      GL11.glVertex2d(var0 + var4, var2);
      GL11.glVertex2d(var0 + var4, var2);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var0, var2 + var6 - var8);
      GL11.glEnd();
      ⲋ.ĂƂ(var0 + var4 - var8, var2 + var6 - var8, var8, 0.0D, 90.0D, lIIIlllIII[9]);
      ⲋ.ĂƂ(var0 + var8, var2 + var6 - var8, var8, 90.0D, 180.0D, lIIIlllIII[9]);
      GL11.glBegin(lIIIlllIII[2]);
      GL11.glVertex2d(var0 + var8, var2 + var6);
      GL11.glVertex2d(var0 + var4 - var8, var2 + var6);
      GL11.glEnd();
      GL11.glShadeModel(lIIIlllIII[15]);
   }

   public final void ⲋ(double var1, double var3, double var5, double var7, @NotNull Color var9) {
      ⲋ(var9);
      GL11.glBegin(lIIIlllIII[10]);
      GL11.glVertex2d(var1 + var5, var3);
      GL11.glVertex2d(var1, var3);
      GL11.glVertex2d(var1, var3 + var7);
      GL11.glVertex2d(var1 + var5, var3 + var7);
      GL11.glEnd();
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\b\u0007\u0018\u00002\u00020\nB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0086\u0004R\u001d\u0010\u0005\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0003\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0086\u0004"},
      d2 = {"La/ⲙ$ⲋ;", "La/ė;", "ⲋ", "La/ė;", "()La/ė;", "ĂƂ", "p0", "p1", "<init>", "(La/ė;La/ė;)V", ""}
   )
   public static final class ⲋ {
      public ⲋ(@NotNull ė var1, @NotNull ė var2) {
         this.ⲋ = var1;
         this.ĂƂ = var2;
      }

      @JvmName(
         name = "ĂƂ"
      )
      public final ė ĂƂ() {
         return this.ĂƂ;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final ė ⲋ() {
         return this.ⲋ;
      }
   }
}
