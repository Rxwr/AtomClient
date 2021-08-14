package a;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.input.Mouse;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0014J(\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0014J \u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0014J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"},
   d2 = {"Lme/nucleus/proton/ui/ProtonGuiScreen;", "Lnet/minecraft/client/gui/GuiScreen;", "lastScreen", "(Lnet/minecraft/client/gui/GuiScreen;)V", "calculateMouse", "", "drawScreen", "mouseX", "", "mouseY", "partialTicks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClickMove", "clickedMouseButton", "timeSinceLastClick", "", "mouseClicked", "mouseButton", "mouseReleased", "state", "onGuiClosed", "updateScreen", "Companion", "proton"}
)
public final class Ꚑ extends GuiScreen {
   public void func_146281_b() {
   }

   protected void func_146286_b(int var1, int var2, int var3) {
      ⱉȬ.ᴃᎲ.ĂƂ(var1, var2);
   }

   private static boolean lIIlllIlllI(int var0) {
      return var0 != 0;
   }

   protected void func_73869_a(char var1, int var2) {
      ⱉȬ.ᴃᎲ.ⲋ(var2, var1);
      ⱉȬ.ᴃᎲ.u(var2);
   }

   protected void func_146273_a(int var1, int var2, int var3, long var4) {
      ⱉȬ.ᴃᎲ.ⲋ(var1, var2);
   }

   public Ꚑ(@Nullable GuiScreen var1) {
      this.lastScreen = var1;
   }

   private static void lIIlllIllIl() {
      lIIlIIlIll = new int[2];
      lIIlIIlIll[0] = "  ".length();
      lIIlIIlIll[1] = " ".length();
   }

   private final void calculateMouse() {
      Minecraft var1 = Minecraft.func_71410_x();
      int var2 = lIIlIIlIll[0];
      mouseX = Mouse.getX() / var2;
      mouseY = var1.field_71440_d / var2 - Mouse.getY() / var2 - lIIlIIlIll[1];
   }

   public void func_73866_w_() {
   }

   public void func_73876_c() {
      if (lIIlllIlllI(Mouse.hasWheel())) {
         int var1 = Mouse.getDWheel();
         if (lIIlllIlllI(var1)) {
            ⱉȬ.ᴃᎲ.ⲋ(mouseX, mouseY, var1);
         }
      }

   }

   protected void func_73864_a(int var1, int var2, int var3) {
      ⱉȬ.ᴃᎲ.ĂƂ(var1, var2, var3);
   }

   public void func_73863_a(int var1, int var2, float var3) {
      this.calculateMouse();
      ⱉȬ.ᴃᎲ.ⲋ((int)((double)var1 / ⱉȬ.ᴃᎲ.ἶṗ()));
      ⱉȬ.ᴃᎲ.ĂƂ((int)((double)var2 / ⱉȬ.ᴃᎲ.ἶṗ()));
   }

   static {
      lIIlllIllIl();
      Companion = new Ꚑ.ⲋ((DefaultConstructorMarker)null);
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\tB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u000eR\u001a\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003¨\u0006\u0082\u000eR\u0017\u0010\u0005\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u0004"},
      d2 = {"La/Ꚑ$ⲋ;", "", "mouseX", "I", "mouseY", "ⲋ", "()I", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private static boolean lIllIlIlII(int var0, int var1) {
         return var0 >= var1;
      }

      private static boolean lIllIlIIlI(int var0) {
         return var0 == 0;
      }

      private static boolean lIllIlIIll(int var0, int var1) {
         return var0 < var1;
      }

      static {
         lIllIlIIIl();
      }

      private static void lIllIlIIIl() {
         lIlIllIIl = new int[5];
         lIlIllIIl[0] = (193 ^ 141) & ~(217 ^ 149);
         lIlIllIIl[1] = -(-500 & 12795) & -1041 & 14335;
         lIlIllIIl[2] = " ".length();
         lIlIllIIl[3] = -15007 & 15326;
         lIlIllIIl[4] = (31 ^ 2) + 99 + 79 - 113 + 67 - (137 + 42 - 48 + 11) + 125 + 10 - 93 + 179;
      }

      private ⲋ() {
      }

      @JvmName(
         name = "ⲋ"
      )
      public final int ⲋ() {
         int llIIllIlIIllllI = lIlIllIIl[0];
         int llIIllIlIIlllIl = Minecraft.func_71410_x().field_71474_y.field_74335_Z;
         if (lIllIlIIlI(llIIllIlIIlllIl)) {
            llIIllIlIIlllIl = lIlIllIIl[1];
         }

         while(lIllIlIIll(llIIllIlIIllllI, llIIllIlIIlllIl) && lIllIlIlII(Minecraft.func_71410_x().field_71443_c / (llIIllIlIIllllI + lIlIllIIl[2]), lIlIllIIl[3]) && lIllIlIlII(Minecraft.func_71410_x().field_71440_d / (llIIllIlIIllllI + lIlIllIIl[2]), lIlIllIIl[4])) {
            ++llIIllIlIIllllI;
            "".length();
            if (null != null) {
               return (44 ^ 108) & ~(28 ^ 92);
            }
         }

         if (lIllIlIIlI(llIIllIlIIllllI)) {
            llIIllIlIIllllI = lIlIllIIl[2];
         }

         return llIIllIlIIllllI;
      }
   }
}
