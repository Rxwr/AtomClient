package a;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00012\u00020\u001f:\u0001\u0001B\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u0001\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0001\u0010\u0013J?\u0010\u0001\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0001\u0010\u0015J/\u0010\u0001\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0001\u0010\u0016J5\u0010\u0001\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0001\u0010\u0017J'\u0010\u0001\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0001\u0010\u0018J?\u0010\u0005\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0005\u0010\u0015J\u0017\u0010\u0001\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0001\u0010\u0019J\u0017\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\b\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0005\u0010\u0019J\u001f\u0010\u0005\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u001cJ\u001f\u0010\u0001\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0001\u0010\u001cR\u001a\u0010\u0001\u001a\u00020\u00028W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0096\u0004R\u001e\u0010\u0005\u001a\u0006*\u00020\u00040\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0082\u0004R\u001a\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0082\u0004"},
   d2 = {"La/ǝ;", "ⲋ", "", "()I", "Lnet/minecraft/client/gui/FontRenderer;", "ĂƂ", "Lnet/minecraft/client/gui/FontRenderer;", "", "u", "F", "p0", "p1", "Ljava/awt/Color;", "p2", "", "p3", "", "p4", "", "(IILjava/awt/Color;Ljava/lang/String;Z)V", "p5", "(IIIIILjava/lang/String;)V", "(IIILjava/lang/String;)V", "(IIILjava/lang/String;Z)V", "(IILjava/lang/String;)V", "(Ljava/lang/String;)I", "La/ė;", "(Ljava/lang/String;)La/ė;", "(II)V", "<init>", "(F)V", "La/Ꞓ;"}
)
public final class ǝ implements Ꞓ {
   @NotNull
   public ė u(@NotNull String var1) {
      return new ė(this.ĂƂ(var1), this.ⲋ(var1));
   }

   private static void lIIlIIlllI() {
      lIIIlIlII = new int[10];
      lIIIlIlII[0] = (48 ^ 10) + (131 ^ 163) - -(7 ^ 78) + (104 ^ 52);
      lIIIlIlII[1] = -(-20151 & 16797366);
      lIIIlIlII[2] = 66 ^ 82;
      lIIIlIlII[3] = 183 ^ 191;
      lIIIlIlII[4] = " ".length();
      lIIIlIlII[5] = -22293 & '흽';
      lIIIlIlII[6] = -13 & 3565;
      lIIIlIlII[7] = -9389 & 10158;
      lIIIlIlII[8] = -9397 & 10167;
      lIIIlIlII[9] = (183 ^ 186) & ~(141 ^ 128);
   }

   private static boolean lIIlIlIIII(int var0) {
      return var0 != 0;
   }

   private final void ĂƂ(int var1, int var2) {
      GlStateManager.func_179090_x();
      GL11.glDisable(lIIIlIlII[6]);
      GlStateManager.func_179144_i(lIIIlIlII[9]);
      GL11.glScalef(1.0F / this.u, 1.0F / this.u, 1.0F);
      GL11.glTranslatef(-((float)var1), -((float)var2), 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.func_179124_c(1.0F, 1.0F, 1.0F);
   }

   private final void ⲋ(int var1, int var2) {
      int var3 = GL11.glGetInteger(lIIIlIlII[5]);
      GL11.glEnable(lIIIlIlII[6]);
      GlStateManager.func_179098_w();
      GlStateManager.func_179147_l();
      GL11.glBlendFunc(lIIIlIlII[7], lIIIlIlII[8]);
      GL11.glTranslatef((float)var1, (float)var2, 0.0F);
      GL11.glScalef(this.u, this.u, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.func_179124_c(1.0F, 1.0F, 1.0F);
      GlStateManager.func_179144_i(lIIIlIlII[9]);
   }

   public void ĂƂ(int var1, int var2, int var3, int var4, int var5, @NotNull String var6) {
      this.ⲋ(var1, var2, lIIIlIlII[1] | (var3 & lIIIlIlII[0]) << lIIIlIlII[2] | (var4 & lIIIlIlII[0]) << lIIIlIlII[3] | var5 & lIIIlIlII[0], var6, (boolean)lIIIlIlII[4]);
   }

   public int ĂƂ(@NotNull String var1) {
      return (int)((float)this.ĂƂ.func_78256_a(var1) * this.u);
   }

   public void ⲋ(int var1, int var2, int var3, @NotNull String var4) {
      this.ⲋ(var1, var2, var3, var4, (boolean)lIIIlIlII[4]);
   }

   public void ⲋ(int var1, int var2, @NotNull Color var3, @NotNull String var4, boolean var5) {
      this.ⲋ(var1, var2, var3.getRGB(), var4, var5);
   }

   public final void ⲋ(int var1, int var2, int var3, @NotNull String var4, boolean var5) {
      this.ⲋ(var1, var2);
      Minecraft.func_71410_x().field_71466_p.func_175065_a(var4, 0.0F, 0.0F, var3, var5);
      "".length();
      this.ĂƂ(var1, var2);
   }

   @JvmName(
      name = "ⲋ"
   )
   public int ⲋ() {
      return (int)((float)Minecraft.func_71410_x().field_71466_p.field_78288_b * this.u);
   }

   public int ⲋ(@NotNull String var1) {
      return this.ⲋ();
   }

   public ǝ() {
      this(0.0F, lIIIlIlII[4], (DefaultConstructorMarker)null);
   }

   public void ⲋ(int var1, int var2, @NotNull String var3) {
      this.ⲋ(var1, var2, lIIIlIlII[0], lIIIlIlII[0], lIIIlIlII[0], var3);
   }

   public ǝ(float var1) {
      super();
      this.u = var1;
      this.ĂƂ = Minecraft.func_71410_x().field_71466_p;
   }

   public void ⲋ(int var1, int var2, int var3, int var4, int var5, @NotNull String var6) {
      this.ⲋ(var1, var2, lIIIlIlII[1] | (var3 & lIIIlIlII[0]) << lIIIlIlII[2] | (var4 & lIIIlIlII[0]) << lIIIlIlII[3] | var5 & lIIIlIlII[0], var6);
   }

   static {
      lIIlIIlllI();
      ⲋ = new ǝ.ⲋ((DefaultConstructorMarker)null);
      int var0 = lIIIlIlII[9];
      ᴃᎲ = new HashMap();
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\tR6\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0082\u0004"},
      d2 = {"La/ǝ$ⲋ;", "Ljava/util/HashMap;", "Lkotlin/collections/ĂƂ;", "", "La/ǝ;", "ᴃᎲ", "Ljava/util/HashMap;", "ⲋ", "p0", "(I)La/ǝ;", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private ⲋ() {
      }

      @NotNull
      public final ǝ ⲋ(int var1) {
         Map var2 = (Map)ǝ.ᴃᎲ;
         Integer var3 = var1;
         int var4 = lIlIIIlll[0];
         Object llIlIIIIlIllIll = var2.get(var3);
         Object var10000;
         if (lIlIllIlll(llIlIIIIlIllIll)) {
            int var6 = lIlIIIlll[0];
            ǝ var8 = new ǝ((float)var1 / 20.0F);
            var2.put(var3, var8);
            "".length();
            var10000 = var8;
            "".length();
            if (" ".length() > "  ".length()) {
               return null;
            }
         } else {
            var10000 = llIlIIIIlIllIll;
         }

         return (ǝ)var10000;
      }

      private static boolean lIlIllIlll(Object var0) {
         return var0 == null;
      }

      private static void lIlIllIlIl() {
         lIlIIIlll = new int[1];
         lIlIIIlll[0] = (33 ^ 112) & ~(210 ^ 131);
      }

      static {
         lIlIllIlIl();
      }
   }
}
