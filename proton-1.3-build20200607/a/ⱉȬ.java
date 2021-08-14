package a;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\r\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020QB\t\b\u0002¢\u0006\u0004\bP\u0010AJ\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010\u0006\u001a\u00020?2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010D\u001a\u00020C¢\u0006\u0004\b\u0006\u0010EJ\u0015\u0010\u0011\u001a\u00020?2\u0006\u0010B\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u00104J%\u0010\u000e\u001a\u00020?2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010GJ\u001d\u0010\u0006\u001a\u00020?2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010HJ\u001d\u0010\u000e\u001a\u00020?2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010HJ%\u0010\u0006\u001a\u00020?2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010GJ\r\u0010:\u001a\u00020?¢\u0006\u0004\b:\u0010AJ\r\u0010;\u001a\u00020?¢\u0006\u0004\b;\u0010AJ\r\u0010<\u001a\u00020?¢\u0006\u0004\b<\u0010AJ\r\u0010I\u001a\u00020?¢\u0006\u0004\bI\u0010AJ\u000f\u0010J\u001a\u00020?H\u0002¢\u0006\u0004\bJ\u0010AJ\u000f\u0010K\u001a\u00020\u0001H\u0002¢\u0006\u0004\bK\u0010\u0005J\r\u0010L\u001a\u00020?¢\u0006\u0004\bL\u0010AJ\r\u00109\u001a\u00020?¢\u0006\u0004\b9\u0010AJ\u0015\u0010\u000e\u001a\u00020?2\u0006\u0010B\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010M\u001a\u00020?H\u0002¢\u0006\u0004\bM\u0010AJ\r\u0010N\u001a\u00020?¢\u0006\u0004\bN\u0010AJ\u000f\u0010O\u001a\u00020?H\u0002¢\u0006\u0004\bO\u0010AJ\r\u0010>\u001a\u00020?¢\u0006\u0004\b>\u0010AR&\u0010\u0006\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u000e\u001a\u00020\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\u0006\u0010\r¨\u0006\u0086\u000eR&\u0010\u0011\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0005\"\u0004\b\u000e\u0010\u0007¨\u0006\u0086\u000eR\u0017\u0010\u0015\u001a\u00020\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0086\u0004R\u0017\u0010\u0017\u001a\u00020\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0086\u0004R\u001a\u0010\u0004\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u0082\u0004R&\u0010\u0002\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001c\u0010\u0005\"\u0004\b\u0011\u0010\u0007¨\u0006\u0086\u000eR&\u0010!\u001a\u00020\u001d8\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u001f\"\u0004\b\u0006\u0010 ¨\u0006\u0086.R&\u0010&\u001a\u00020\"8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010#\u001a\u0004\b\t\u0010$\"\u0004\b\u0006\u0010%¨\u0006\u0086\u000eR&\u0010\u0016\u001a\u00020'8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b\u0006\u0010+¨\u0006\u0086\u000eR&\u0010\u0013\u001a\u00020\u001d8\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u0011\u0010\u001f\"\u0004\b\u0011\u0010 ¨\u0006\u0086.R\u001d\u0010\u000f\u001a\u00020,8\u0007@\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b\u0015\u0010.¨\u0006\u0086\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100¨\u0006\u0082\u000eR\u0017\u0010\u0010\u001a\u0002018G@\u0006¢\u0006\u0006\u001a\u0004\b&\u00102¨\u0006\u0086\u0004R&\u0010\u001c\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00103\u001a\u0004\b\u0002\u0010\u0014\"\u0004\b\u0006\u00104¨\u0006\u0086\u000eR&\u0010\u0019\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00103\u001a\u0004\b!\u0010\u0014\"\u0004\b\u000e\u00104¨\u0006\u0086\u000eR\u0017\u0010\t\u001a\u00020\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006\u0086\u0004R&\u0010\u000b\u001a\u0002058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00106\u001a\u0004\b\u0017\u00107\"\u0004\b\u0006\u00108¨\u0006\u0086\u000eR\u0017\u00109\u001a\u00020\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0086\u0004R&\u0010:\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u0015\u0010\u0007¨\u0006\u0086\u000eR&\u0010;\u001a\u00020\u001d8\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u000e\u0010\u001f\"\u0004\b\u000e\u0010 ¨\u0006\u0086.R\u001c\u0010<\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100¨\u0006\u0082\u000eR\u0017\u0010>\u001a\u00020'8G@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010*¨\u0006\u0086\u0004"},
   d2 = {"La/ⱉȬ;", "", "ϛⰄ", "Z", "Ἒⅾ", "()Z", "ⲋ", "(Z)V", "", "Ⳓ", "Ljava/lang/String;", "Ꙗ", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "ĂƂ", "ᵴἥ", "ɡ", "u", "", "Đ", "()I", "ᴃᎲ", "ⲡ", "〥ҳⱆ", "La/ṵ;", "ͷ", "La/ṵ;", "Ɏ", "ⴜ", "La/Ꞓ;", "La/Ꞓ;", "()La/Ꞓ;", "(La/Ꞓ;)V", "ς", "", "J", "()J", "(J)V", "Ꜥ", "", "D", "ƶ", "()D", "(D)V", "La/ǝ;", "La/ǝ;", "()La/ǝ;", "Lnet/minecraft/client/shader/Framebuffer;", "Lnet/minecraft/client/shader/Framebuffer;", "La/ė;", "()La/ė;", "I", "(I)V", "Lnet/minecraft/client/gui/ScaledResolution;", "Lnet/minecraft/client/gui/ScaledResolution;", "()Lnet/minecraft/client/gui/ScaledResolution;", "(Lnet/minecraft/client/gui/ScaledResolution;)V", "Ꞑ", "ⱯꝣѺ", "ꙑứ", "ɧῙ", "ἶṗ", "ʅ", "", "öỴʘѷ", "()V", "p0", "", "p1", "(IC)V", "p2", "(III)V", "(II)V", "ƺ", "Ѿ", "Ｓ꣙ὐ", "ɻ", "Ｆ", "Ἠ", "ȵ", "<init>", ""}
)
public final class ⱉȬ {
   @JvmName(
      name = "ς"
   )
   public final int ς() {
      return Ꜥ;
   }

   private final void Ѿ() {
      a.ᴃᎲ.u.ⲋ(llllIIIlI[llllIlIIl[9]]);
      this.ȵ();
      Framebuffer var10000 = Đ;
      if (lIIIIllIIlI(var10000)) {
         var10000.func_147609_e();
         "".length();
         if (((40 ^ 113) & ~(252 ^ 165)) != 0) {
            return;
         }
      } else {
         "".length();
      }

      GL11.glBindTexture(llllIlIIl[10], llllIlIIl[0]);
      if (lIIIIllIIII(Ɏ)) {
         var10000 = ⲡ;
         if (lIIIIllIIlI(var10000)) {
            var10000.func_147614_f();
            "".length();
            if ((61 ^ 46 ^ 27 ^ 12) < 0) {
               return;
            }
         } else {
            "".length();
         }

         Ɏ = (boolean)llllIlIIl[0];
      }

      var10000 = ⲡ;
      if (lIIIIllIIlI(var10000)) {
         var10000.func_147610_a((boolean)llllIlIIl[0]);
         "".length();
         if (((75 ^ 42 ^ 125 ^ 93) & (95 ^ 29 ^ "   ".length() ^ -" ".length())) < -" ".length()) {
            return;
         }
      } else {
         "".length();
      }

      GL11.glViewport(llllIlIIl[0], llllIlIIl[0], this.ⲡ(), this.Đ());
      a.ᴃᎲ.u.ĂƂ(llllIIIlI[llllIlIIl[11]]);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      ᵴἥ = var1;
   }

   private final void öỴʘѷ() {
      a.ᴃᎲ.u.ⲋ(llllIIIlI[llllIlIIl[12]]);
      GL11.glPushMatrix();
      GL11.glScaled(1.0D / (double)Ἒⅾ.func_78325_e(), 1.0D / (double)Ἒⅾ.func_78325_e(), 1.0D);
      double var1 = 1.0D;
      if (!lIIIIllIIIl(ͷ.Ἒⅾ()) || lIIIIllIIII(ͷ.ⲋ())) {
         short lIllIlIlllllIIl = ͷ.〥ҳⱆ();
         double lIllIlIlllllIII = 1.2D - lIllIlIlllllIIl * 0.2D;
         GL11.glTranslated((double)lIllIlIlllllIll.ⲡ() / 2.0D, (double)lIllIlIlllllIll.Đ() / 2.0D, 0.0D);
         GL11.glScaled(lIllIlIlllllIII, lIllIlIlllllIII, 0.0D);
         GL11.glTranslated(-((double)lIllIlIlllllIll.ⲡ()) / 2.0D, -((double)lIllIlIlllllIll.Đ()) / 2.0D, 0.0D);
         var1 = lIllIlIlllllIIl * lIllIlIlllllIIl * lIllIlIlllllIIl;
      }

      Framebuffer var10000 = ⲡ;
      if (lIIIIllIIlI(var10000)) {
         var10000.func_147612_c();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         "".length();
      }

      GL11.glEnable(llllIlIIl[10]);
      GL11.glEnable(llllIlIIl[13]);
      GL11.glDisable(llllIlIIl[14]);
      GL11.glDepthMask((boolean)llllIlIIl[0]);
      GL11.glViewport(llllIlIIl[0], llllIlIIl[0], lIllIlIlllllIll.ⲡ(), lIllIlIlllllIll.Đ());
      GL11.glColor4d(1.0D, 1.0D, 1.0D, var1);
      GL11.glBegin(llllIlIIl[7]);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2d((double)lIllIlIlllllIll.ⲡ(), 0.0D);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2d(0.0D, 0.0D);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2d(0.0D, (double)lIllIlIlllllIll.Đ());
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2d((double)lIllIlIlllllIll.ⲡ(), (double)lIllIlIlllllIll.Đ());
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glBindTexture(llllIlIIl[10], llllIlIIl[0]);
      GL11.glDisable(llllIlIIl[13]);
      GL11.glEnable(llllIlIIl[14]);
      GL11.glDepthMask((boolean)llllIlIIl[1]);
      a.ᴃᎲ.u.ĂƂ(llllIIIlI[llllIlIIl[15]]);
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(boolean var1) {
      ɡ = var1;
   }

   public final void ⲋ(int var1, char var2) {
      if (lIIIIllIIll(var1, llllIlIIl[1]) && lIIIIllIIIl(ᶔ.ⲋ.ⲋ())) {
         ơ߀ var3 = ơ߀.ⲋ;
         Class var4 = Թ.class;
         int var5 = llllIlIIl[0];
         Object var10000 = var3.ⲋ().get(Թ.class);
         if (lIIIIlIlllI(var10000)) {
            throw new TypeCastException(llllIIIlI[llllIlIIl[29]]);
         } else {
            ((Թ)((ⳅ)((Թ)var10000))).ꙑứ();
            lIllIlIlIlllIll.ɧῙ();
         }
      } else {
         ᶔ.ⲋ.ⲋ(var1, var2);
      }
   }

   private static boolean lIIIIllIlII(int var0, int var1) {
      return var0 != var1;
   }

   private static String lIIIIIllIlI(String lIllIlIlIIIlIIl, String lIllIlIlIIIlIII) {
      try {
         boolean lIllIlIlIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lIllIlIlIIIIlII = Cipher.getInstance("Blowfish");
         lIllIlIlIIIIlII.init(llllIlIIl[2], lIllIlIlIIIIlIl);
         return new String(lIllIlIlIIIIlII.doFinal(Base64.getDecoder().decode(lIllIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final ScaledResolution 〥ҳⱆ() {
      return Ἒⅾ;
   }

   private static void lIIIIlIllIl() {
      llllIlIIl = new int[32];
      llllIlIIl[0] = (31 ^ 14) & ~(161 ^ 176);
      llllIlIIl[1] = " ".length();
      llllIlIIl[2] = "  ".length();
      llllIlIIl[3] = "   ".length();
      llllIlIIl[4] = 8 ^ 12;
      llllIlIIl[5] = 54 ^ 15 ^ 179 ^ 143;
      llllIlIIl[6] = 115 ^ 117;
      llllIlIIl[7] = 188 ^ 187;
      llllIlIIl[8] = 39 ^ 57 ^ 8 ^ 30;
      llllIlIIl[9] = 241 ^ 186 ^ 30 ^ 92;
      llllIlIIl[10] = -(-2533 & 23013) & -8223 & 32255;
      llllIlIIl[11] = 204 ^ 198;
      llllIlIIl[12] = 110 ^ 101;
      llllIlIIl[13] = -(-2157 & 15485) & -10 & 16379;
      llllIlIIl[14] = -(-2625 & 32463) & -1 & 32767;
      llllIlIIl[15] = 81 ^ 93;
      llllIlIIl[16] = 241 ^ 140 ^ 248 ^ 136;
      llllIlIIl[17] = -(-18433 & 32663) & -18433 & '\uffff';
      llllIlIIl[18] = -10370 & 11139;
      llllIlIIl[19] = -24749 & 25519;
      llllIlIIl[20] = -17493 & 18292;
      llllIlIIl[21] = 175 ^ 161;
      llllIlIIl[22] = 182 ^ 185;
      llllIlIIl[23] = 88 + 97 - 72 + 43 ^ 5 + 41 - -12 + 82;
      llllIlIIl[24] = 86 ^ 71;
      llllIlIIl[25] = 58 + 72 - 15 + 69 ^ 125 + 167 - 252 + 130;
      llllIlIIl[26] = 55 ^ 36;
      llllIlIIl[27] = 127 ^ 107;
      llllIlIIl[28] = 47 ^ 58;
      llllIlIIl[29] = 49 ^ 61 ^ 217 ^ 195;
      llllIlIIl[30] = 36 ^ 51;
      llllIlIIl[31] = 52 ^ 44;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull String var1) {
      Ⳓ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      ϛⰄ = var1;
   }

   private static String lIIIIIlIllI(String lIllIlIlIIlIllI, String lIllIlIlIIlIlIl) {
      try {
         short lIllIlIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIIl[8]), "DES");
         String lIllIlIlIIlIIIl = Cipher.getInstance("DES");
         lIllIlIlIIlIIIl.init(llllIlIIl[2], lIllIlIlIIlIIlI);
         return new String(lIllIlIlIIlIIIl.doFinal(Base64.getDecoder().decode(lIllIlIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIIllIIIl(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final ė Ꜥ() {
      return new ė(ς, Ꜥ);
   }

   public final void ƺ() {
      ++ⴜ;
      long var10000 = ⴜ;
      int var1 = GL11.glGetInteger(llllIlIIl[17]);
      if (lIIIIllIIII(this.Ｓ꣙ὐ())) {
         this.Ѿ();
         GL11.glPushMatrix();
         GL11.glScaled(this.ἶṗ(), this.ἶṗ(), 1.0D);
         GL11.glEnable(llllIlIIl[13]);
         GL11.glBlendFunc(llllIlIIl[18], llllIlIIl[19]);
         ᶔ.ⲋ.ϛⰄ();
         GL11.glDisable(llllIlIIl[13]);
         GL11.glPopMatrix();
         this.Ｆ();
      }

      this.öỴʘѷ();
      GL11.glEnable(llllIlIIl[13]);
      GL11.glEnable(llllIlIIl[10]);
      GlStateManager.func_179098_w();
      GlStateManager.func_179147_l();
      ⲙ.ⲋ(Color.white);
      GL11.glBindTexture(llllIlIIl[10], var1);
      GlStateManager.func_179144_i(var1);
   }

   private static boolean lIIIIllIllI(int var0, int var1) {
      return var0 < var1;
   }

   private final void ȵ() {
      label21: {
         if (lIIIIllIIlI(ⲡ)) {
            Framebuffer var10000 = ⲡ;
            if (lIIIIlIlllI(var10000)) {
               Intrinsics.throwNpe();
            }

            if (lIIIIllIIll(var10000.field_147621_c, lIllIllIIIIIIlI.ⲡ())) {
               var10000 = ⲡ;
               if (lIIIIlIlllI(var10000)) {
                  Intrinsics.throwNpe();
               }

               if (!lIIIIllIlII(var10000.field_147618_d, lIllIllIIIIIIlI.Đ())) {
                  break label21;
               }
            }
         }

         ⲡ = new Framebuffer(lIllIllIIIIIIlI.ⲡ(), lIllIllIIIIIIlI.Đ(), (boolean)llllIlIIl[0]);
         Ɏ = (boolean)llllIlIIl[1];
         ᶔ.ⲋ.〥ҳⱆ();
      }

      Đ = Minecraft.func_71410_x().func_147110_a();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final Ꞓ ĂƂ() {
      Ꞓ var10000 = ĂƂ;
      if (lIIIIlIlllI(var10000)) {
         Intrinsics.throwUninitializedPropertyAccessException(llllIIIlI[llllIlIIl[1]]);
      }

      return var10000;
   }

   @JvmName(
      name = "ⴜ"
   )
   public final boolean ⴜ() {
      return Ɏ;
   }

   @JvmName(
      name = "ɡ"
   )
   public final boolean ɡ() {
      return ᵴἥ;
   }

   private static boolean lIIIIllIIll(int var0, int var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      ς = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(long var1) {
      ⴜ = var1;
   }

   @JvmName(
      name = "Ꙗ"
   )
   public final String Ꙗ() {
      return Ⳓ;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final int ϛⰄ() {
      return ς;
   }

   private static void lIIIIlIlIlI() {
      llllIIIlI = new String[llllIlIIl[31]];
      llllIIIlI[llllIlIIl[0]] = lIIIIIlIlIl("KDk7BTwrODEUHCsk", "NVUqn");
      llllIIIlI[llllIlIIl[1]] = lIIIIIlIllI("BslLfnBZKyPllQUc8OmayaqtnHMYu+lz", "puVGT");
      llllIIIlI[llllIlIIl[2]] = lIIIIIlIllI("Hq44fQU65qLVRTaLDSK4UQ==", "EqJbQ");
      llllIIIlI[llllIlIIl[3]] = lIIIIIlIlIl("GCkhFg==", "THUyR");
      llllIIIlI[llllIlIIl[4]] = lIIIIIlIlIl("LjM9LCsROzU9", "cZSIH");
      llllIIIlI[llllIlIIl[5]] = lIIIIIllIlI("MxnOkO+uiEO/OfZx3QsMYUawSc82h5VV02+09gP3cOTMX7KnL4MUT5kFeWsN/YWOlvi/WtA4FnWFsNAf7DV7LdzkOKPb/CIr", "gTtDm");
      llllIIIlI[llllIlIIl[6]] = lIIIIIlIllI("n6nJu4Iqf5Myl5/EJJ7igl97cYOdzOTvN2tJfxPTNM8496w0QuF2sDlVTgglolBtZWAK+UuGRedW1WRb4kjX0I2KEgVkwuIq", "kjCMW");
      llllIIIlI[llllIlIIl[7]] = lIIIIIllIlI("AhNz/82nX5i3dKoMmztXL1rwUelSAEet", "ZvFRw");
      llllIIIlI[llllIlIIl[8]] = lIIIIIlIllI("Ja7GFFjug6xJs6SzRMmPap8kInc4DKoK", "wMAEA");
      llllIIIlI[llllIlIIl[9]] = lIIIIIllIlI("VGRek9W9V/LpLRA3OCRGkUyTKJqlL83QwQh5UrH3Wjw=", "EpBdv");
      llllIIIlI[llllIlIIl[11]] = lIIIIIlIlIl("OSExFCUIBBwHcVYYCxA7DRocMzkNBRwXPgoOHAc=", "lhyuK");
      llllIIIlI[llllIlIIl[12]] = lIIIIIlIlIl("PQI4MBcMJxUjQ1IpHDgNLjkRPBwKPhY3HBo=", "hKpQy");
      llllIIIlI[llllIlIIl[15]] = lIIIIIlIlIl("MicBKw0DAiw4WV0MJSMXIRwoJwYFGy8sBhU=", "gnIJc");
      llllIIIlI[llllIlIIl[16]] = lIIIIIllIlI("1InaeMb70JhMcBSdTZbBxmJOfek8HtXmHUKtac+U4BekzokRRTl+N6n3ab415gpuOKb+lpxBJuJ1sqTbMVPVKHUdQWf7z5io", "xQRDC");
      llllIIIlI[llllIlIIl[21]] = lIIIIIllIlI("vz1NdLsQ3Ps=", "trGhu");
      llllIIIlI[llllIlIIl[22]] = lIIIIIlIlIl("w64xSA==", "IWhqt");
      llllIIIlI[llllIlIIl[23]] = lIIIIIlIllI("6/+q4hZHESQ=", "xFqZc");
      llllIIIlI[llllIlIIl[24]] = lIIIIIlIllI("uir18Yk80hM=", "qFioE");
      llllIIIlI[llllIlIIl[25]] = lIIIIIlIllI("1bNugr+e5hA=", "MJuMC");
      llllIIIlI[llllIlIIl[26]] = lIIIIIlIllI("R5If2GUmlYw=", "yHxxJ");
      llllIIIlI[llllIlIIl[27]] = lIIIIIlIllI("YZBJz5btOLM=", "tXwqK");
      llllIIIlI[llllIlIIl[28]] = lIIIIIlIlIl("NBcmDD0IADtKPRdFJwUgRAAnCzYIAC0=", "deIjT");
      llllIIIlI[llllIlIIl[29]] = lIIIIIlIlIl("FCAfIEwZNB0iAw51ESlMGTQAOEwOOlMiAxR4HTkAFnUHNRwfdR4pQhQgECAJDyZdPB4VIRwiQhc6FzkAHyZdDwATNhgLOTM=", "zUsLl");
      llllIIIlI[llllIlIIl[30]] = lIIIIIlIlIl("", "qzZFQ");
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final boolean Ἒⅾ() {
      return ϛⰄ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final Ꞓ ⲋ() {
      Ꞓ var10000 = ⲋ;
      if (lIIIIlIlllI(var10000)) {
         Intrinsics.throwUninitializedPropertyAccessException(llllIIIlI[llllIlIIl[0]]);
      }

      return var10000;
   }

   public final void ĂƂ(@NotNull final String var1) {
      Minecraft.func_71410_x().func_152344_a((Runnable)(new Runnable() {
         private static void lllllIIlI() {
            llIllllI = new String[lllIIIlI[6]];
            llIllllI[lllIIIlI[0]] = llllIlIlI("GzMlI1kWJychFgFmKypZFic6O1kBKWkhFhtrJzoVGWY9NgkQZiQqVxszKiMcADVnPwsaMiYhVxgpLToVEDVnDBUcJSIILDw=", "uFIOy");
            llIllllI[lllIIIlI[1]] = llllIlIll("aBBA7FGksTBiX6ZEXU+InQ==", "xAlhP");
            llIllllI[lllIIIlI[2]] = llllIlIlI("IzkoDyccMSAe", "nPFjD");
            llIllllI[lllIIIlI[5]] = lllllIIII("JFEVqvILefH7JgaaFHlnwg==", "bdFrL");
         }

         private static String lllllIIII(String llIllIlIllIIIII, String llIllIlIlIlllIl) {
            try {
               SecretKeySpec llIllIlIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), lllIIIlI[4]), "DES");
               Cipher llIllIlIllIIIlI = Cipher.getInstance("DES");
               llIllIlIllIIIlI.init(lllIIIlI[2], llIllIlIllIIIll);
               return new String(llIllIlIllIIIlI.doFinal(Base64.getDecoder().decode(llIllIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         private static boolean llllllIll(int var0, int var1x) {
            return var0 < var1x;
         }

         private static void llllllIII() {
            lllIIIlI = new int[7];
            lllIIIlI[0] = (27 + 19 - 42 + 221 ^ 175 + 173 - 308 + 159) & (192 ^ 128 ^ 160 ^ 198 ^ -" ".length());
            lllIIIlI[1] = " ".length();
            lllIIIlI[2] = "  ".length();
            lllIIIlI[3] = -32470 & 32725;
            lllIIIlI[4] = 32 ^ 40;
            lllIIIlI[5] = "   ".length();
            lllIIIlI[6] = 18 ^ 22;
         }

         private static String llllIlIll(String llIllIllIIIIlIl, String llIllIllIIIIIlI) {
            try {
               long llIllIllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
               Cipher llIllIllIIIIlll = Cipher.getInstance("Blowfish");
               llIllIllIIIIlll.init(lllIIIlI[2], llIllIllIIIIIIl);
               return new String(llIllIllIIIIlll.doFinal(Base64.getDecoder().decode(llIllIllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         private static String llllIlIlI(String llIllIlIlllIlIl, String llIllIlIlllIlII) {
            llIllIlIlllIlIl = new String(Base64.getDecoder().decode(llIllIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            StringBuilder llIllIlIlllIIll = new StringBuilder();
            boolean llIllIlIllIllIl = llIllIlIlllIlII.toCharArray();
            byte llIllIlIllIllII = lllIIIlI[0];
            short llIllIlIllIlIll = llIllIlIlllIlIl.toCharArray();
            Exception llIllIlIllIlIlI = llIllIlIllIlIll.length;
            int llIllIlIllIlIIl = lllIIIlI[0];

            do {
               if (!llllllIll(llIllIlIllIlIIl, llIllIlIllIlIlI)) {
                  return String.valueOf(llIllIlIlllIIll);
               }

               float llIllIlIllIlIII = llIllIlIllIlIll[llIllIlIllIlIIl];
               llIllIlIlllIIll.append((char)(llIllIlIllIlIII ^ llIllIlIllIllIl[llIllIlIllIllII % llIllIlIllIllIl.length]));
               "".length();
               ++llIllIlIllIllII;
               ++llIllIlIllIlIIl;
               "".length();
            } while(((23 ^ 74) & ~(119 ^ 42)) >= ((74 ^ 122) & ~(188 ^ 140)));

            return null;
         }

         private static boolean llllllIIl(Object var0) {
            return var0 == null;
         }

         private static boolean llllllIlI(int var0) {
            return var0 != 0;
         }

         public final void run() {
            ơ߀ var2 = ơ߀.ⲋ;
            Class var3 = Թ.class;
            int var4 = lllIIIlI[0];
            Object var10000 = var2.ⲋ().get(Թ.class);
            if (llllllIIl(var10000)) {
               throw new TypeCastException(llIllllI[lllIIIlI[0]]);
            } else {
               double llIllIllIIlIIII = (Թ)((ⳅ)((Թ)var10000));
               a.〥ҳⱆ.〥ҳⱆ.ⲋ().info(String.valueOf((new StringBuilder()).append(llIllllI[lllIIIlI[1]]).append(var1)));
               if (llllllIlI(Intrinsics.areEqual((Object)var1, (Object)llIllllI[lllIIIlI[2]]))) {
                  ⱉȬ.ᴃᎲ.ⲋ((Ꞓ)ǝ.ⲋ.ⲋ(llIllIllIIlIIII.〥ҳⱆ()));
                  ⱉȬ.ᴃᎲ.ĂƂ((Ꞓ)ǝ.ⲋ.ⲋ(llIllIllIIlIIII.Ἒⅾ()));
                  ⱉȬ.ᴃᎲ.u((Ꞓ)ǝ.ⲋ.ⲋ(llIllIllIIlIIII.ϛⰄ()));
                  "".length();
                  if (((16 ^ 6) & ~(175 ^ 185)) != 0) {
                     return;
                  }
               } else {
                  ⱉȬ.ᴃᎲ.ⲋ((Ꞓ)(new Ȋ(new Font(var1, lllIIIlI[0], llIllIllIIlIIII.〥ҳⱆ()), lllIIIlI[3], (boolean)lllIIIlI[1], (boolean)lllIIIlI[0], lllIIIlI[4], (DefaultConstructorMarker)null)));
                  ⱉȬ.ᴃᎲ.ĂƂ((Ꞓ)(new Ȋ(new Font(var1, lllIIIlI[0], llIllIllIIlIIII.Ἒⅾ()), lllIIIlI[3], (boolean)lllIIIlI[1], (boolean)lllIIIlI[0], lllIIIlI[4], (DefaultConstructorMarker)null)));
                  ⱉȬ.ᴃᎲ.u((Ꞓ)(new Ȋ(new Font(var1, lllIIIlI[0], llIllIllIIlIIII.ϛⰄ()), lllIIIlI[3], (boolean)lllIIIlI[1], (boolean)lllIIIlI[0], lllIIIlI[4], (DefaultConstructorMarker)null)));
               }

               a.〥ҳⱆ.〥ҳⱆ.ⲋ().info(llIllllI[lllIIIlI[5]]);
               ⱉȬ.ᴃᎲ.ⲋ(var1);
            }
         }

         static {
            llllllIII();
            lllllIIlI();
         }
      }));
      "".length();
   }

   public final void ⱯꝣѺ() {
      this.ĂƂ(llllIIIlI[llllIlIIl[4]]);
      Ὴ.ⲋ.ĂƂ();
      ᶔ.ⲋ.ᴃᎲ();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ǝ ᴃᎲ() {
      return 〥ҳⱆ;
   }

   public final void ɻ() {
      if (!lIIIIllIIIl(ɡ)) {
         byte lIllIlIllIlIlIl = ᴃᎲ.Ɏ() / llllIlIIl[2];
         if (lIIIIllIIII(a.ᴃᎲ.u.u())) {
            byte lIllIlIllIlIIll = (Iterable)MapsKt.toList((Map)a.ᴃᎲ.u.ĂƂ());
            float lIllIlIllIlIIlI = llllIlIIl[0];
            byte lIllIlIllIlIIII = llllIlIIl[0];
            int lIllIlIllIIllll = (Comparator)(new ⱉȬ$1());
            int lIllIlIllIlIlII = CollectionsKt.sortedWith(lIllIlIllIlIIll, lIllIlIllIIllll);
            byte lIllIlIllIlIIll = lIllIlIllIlIlIl;
            float lIllIlIllIlIIlI = (Iterable)lIllIlIllIlIlII;
            String lIllIlIllIlIIIl = llllIlIIl[0];
            Iterator lIllIlIllIlIIII = lIllIlIllIlIIlI.iterator();

            while(lIIIIllIIII(lIllIlIllIlIIII.hasNext())) {
               int lIllIlIllIIllll = lIllIlIllIlIIII.next();
               byte lIllIlIllIIlllI = (Pair)lIllIlIllIIllll;
               float lIllIlIllIIllIl = llllIlIIl[0];
               boolean lIllIlIllIIllII = ((ᴃᎲ.ⲋ)lIllIlIllIIlllI.getSecond()).ⲋ();
               Exception lIllIlIllIIlIll = 1.0D;
               if (lIIIIllIIlI(((ᴃᎲ.ⲋ)lIllIlIllIIlllI.getSecond()).〥ҳⱆ())) {
                  ᴃᎲ.ⲋ var10001 = ((ᴃᎲ.ⲋ)lIllIlIllIIlllI.getSecond()).〥ҳⱆ();
                  if (lIIIIlIlllI(var10001)) {
                     Intrinsics.throwNpe();
                  }

                  lIllIlIllIIlIll = lIllIlIllIIllII / var10001.ⲋ();
               }

               ǝ var10000 = 〥ҳⱆ;
               int var28 = llllIlIIl[20];
               StringBuilder var10003 = (new StringBuilder()).append(llllIIIlI[llllIlIIl[21]]).append((String)lIllIlIllIIlllI.getFirst()).append(llllIIIlI[llllIlIIl[22]]);
               String lIllIlIllIIlIlI = StringCompanionObject.INSTANCE;
               String lIllIlIllIIlIIl = llllIIIlI[llllIlIIl[23]];
               Object[] var10004 = new Object[llllIlIIl[1]];
               var10004[llllIlIIl[0]] = lIllIlIllIIllII;
               byte lIllIlIllIIlIII = var10004;
               double lIllIlIllIIIlll = var10003;
               char lIllIlIllIIIlIl = var28;
               short lIllIlIllIIIlII = var10000;
               boolean lIllIlIllIIIIll = llllIlIIl[0];
               String var27 = String.format(lIllIlIllIIlIIl, Arrays.copyOf(lIllIlIllIIlIII, lIllIlIllIIlIII.length));
               Intrinsics.checkExpressionValueIsNotNull(var27, llllIIIlI[llllIlIIl[24]]);
               Exception lIllIlIllIIIIlI = var27;
               var10003 = lIllIlIllIIIlll.append(lIllIlIllIIIIlI).append(llllIIIlI[llllIlIIl[25]]);
               lIllIlIllIIlIlI = StringCompanionObject.INSTANCE;
               lIllIlIllIIlIIl = llllIIIlI[llllIlIIl[26]];
               var10004 = new Object[llllIlIIl[1]];
               var10004[llllIlIIl[0]] = lIllIlIllIIlIll;
               lIllIlIllIIlIII = var10004;
               lIllIlIllIIIlll = var10003;
               lIllIlIllIIIIll = llllIlIIl[0];
               var27 = String.format(lIllIlIllIIlIIl, Arrays.copyOf(lIllIlIllIIlIII, lIllIlIllIIlIII.length));
               Intrinsics.checkExpressionValueIsNotNull(var27, llllIIIlI[llllIlIIl[27]]);
               lIllIlIllIIIIlI = var27;
               lIllIlIllIIIlII.ⲋ(lIllIlIllIIIlIl, lIllIlIllIlIIll, String.valueOf(lIllIlIllIIIlll.append(lIllIlIllIIIIlI)));
               lIllIlIllIlIIll += 〥ҳⱆ.ⲋ();
               "".length();
               if ("  ".length() >= "   ".length()) {
                  return;
               }
            }

            "".length();
            if (-"  ".length() > 0) {
               return;
            }
         } else {
            〥ҳⱆ.ⲋ(llllIlIIl[20], lIllIlIllIlIlIl, llllIIIlI[llllIlIIl[28]]);
         }

      }
   }

   @JvmName(
      name = "Đ"
   )
   public final int Đ() {
      return Minecraft.func_71410_x().field_71440_d;
   }

   public final void ʅ() {
      Ἒⅾ = new ScaledResolution(Minecraft.func_71410_x());
   }

   public final void Ἠ() {
      a.ᴃᎲ.u.ⲋ(llllIIIlI[llllIlIIl[7]]);
      if (lIIIIllIIIl(ϛⰄ) && lIIIIllIIII(ͷ.ϛⰄ()) && lIIIIllIIII(Minecraft.func_71410_x().field_71462_r instanceof Ꚑ)) {
         Minecraft.func_71410_x().func_147108_a((GuiScreen)null);
      }

      this.ʅ();
      ͷ.Ꜥ();
      ᶔ.ⲋ.Ἒⅾ();
      a.ᴃᎲ.u.ĂƂ(llllIIIlI[llllIlIIl[8]]);
   }

   @JvmName(
      name = "u"
   )
   public final Ꞓ u() {
      Ꞓ var10000 = u;
      if (lIIIIlIlllI(var10000)) {
         Intrinsics.throwUninitializedPropertyAccessException(llllIIIlI[llllIlIIl[2]]);
      }

      return var10000;
   }

   @JvmName(
      name = "ᵴἥ"
   )
   public final int ᵴἥ() {
      return Ἒⅾ.func_78326_a();
   }

   public final void ĂƂ(int var1, int var2, int var3) {
      ᶔ.ⲋ.ⲋ(var1, var2, var3);
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      Ɏ = var1;
   }

   @JvmName(
      name = "ͷ"
   )
   public final boolean ͷ() {
      return ɡ;
   }

   public final void ⲋ(int var1, int var2) {
   }

   private final void Ｆ() {
      Framebuffer var10000 = ⲡ;
      if (lIIIIllIIlI(var10000)) {
         var10000.func_147609_e();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         "".length();
      }

      var10000 = Đ;
      if (lIIIIllIIlI(var10000)) {
         var10000.func_147610_a((boolean)llllIlIIl[0]);
         "".length();
         if (-" ".length() >= (155 ^ 159)) {
            return;
         }
      } else {
         "".length();
      }

   }

   private static int lIIIIllIlIl(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private ⱉȬ() {
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull Ꞓ var1) {
      ⲋ = var1;
   }

   @JvmName(
      name = "ƶ"
   )
   public final double ƶ() {
      return Ꙗ;
   }

   @JvmName(
      name = "Ɏ"
   )
   public final int Ɏ() {
      return Ἒⅾ.func_78328_b();
   }

   static {
      lIIIIlIllIl();
      lIIIIlIlIlI();
      ⱉȬ var0 = new ⱉȬ();
      ᴃᎲ = var0;
      〥ҳⱆ = new ǝ(1.0F);
      Ἒⅾ = new ScaledResolution(Minecraft.func_71410_x());
      ϛⰄ = (boolean)llllIlIIl[1];
      ṵ var1 = new ṵ();
      int var2 = llllIlIIl[0];
      int var3 = llllIlIIl[0];
      int var5 = llllIlIIl[0];
      var1.ⲋ((new ⱙ()).ᴃᎲ(0.0D).〥ҳⱆ(1.05D).Ἒⅾ(0.15D).ĂƂ(ⰺ.ĂƂ));
      "".length();
      var1.ⲋ((new ⱙ()).ᴃᎲ(1.05D).〥ҳⱆ(1.0D).Ἒⅾ(0.05D).ĂƂ(ⰺ.ĂƂ));
      "".length();
      ͷ = var1;
      Ⳓ = llllIIIlI[llllIlIIl[30]];
      Ꙗ = 2.0D;
   }

   private final boolean Ｓ꣙ὐ() {
      ơ߀ var2 = ơ߀.ⲋ;
      Class var3 = Թ.class;
      int var4 = llllIlIIl[0];
      Object var10000 = var2.ⲋ().get(Թ.class);
      if (lIIIIlIlllI(var10000)) {
         throw new TypeCastException(llllIIIlI[llllIlIIl[16]]);
      } else {
         String lIllIlIllllIIlI = ((Թ)((ⳅ)((Թ)var10000))).ⲋ();
         byte lIllIlIllllIIIl = Minecraft.field_71470_ab;
         double lIllIlIllllIIII = (double)lIllIlIllllIIIl * ((double)lIllIlIllllIIlI / 100.0D);
         Exception lIllIlIlllIlllI = RangesKt.coerceAtLeast((long)((double)lIllIlIllllIIIl / RangesKt.coerceAtLeast(lIllIlIllllIIII, 1.0D)), 1L);
         int var9;
         if (lIIIIllIIIl(lIIIIllIlIl(ⴜ % lIllIlIlllIlllI, 0L))) {
            var9 = llllIlIIl[1];
            "".length();
            if (((71 ^ 125 ^ 58 ^ 38) & (84 ^ 94 ^ 87 ^ 123 ^ -" ".length())) != 0) {
               return (boolean)((84 ^ 120 ^ 123 ^ 80) & (18 + 104 - 101 + 116 ^ 29 + 20 - 25 + 118 ^ -" ".length()));
            }
         } else {
            var9 = llllIlIIl[0];
         }

         return (boolean)var9;
      }
   }

   private static boolean lIIIIllIIlI(Object var0) {
      return var0 != null;
   }

   private static boolean lIIIIllIIII(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "Ⳓ"
   )
   public final long Ⳓ() {
      return ⴜ;
   }

   @JvmName(
      name = "ἶṗ"
   )
   public final double ἶṗ() {
      return Ꙗ / (double)Ἒⅾ.func_78325_e();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(@NotNull Ꞓ var1) {
      ĂƂ = var1;
   }

   @JvmName(
      name = "u"
   )
   public final void u(@NotNull Ꞓ var1) {
      u = var1;
   }

   public final void ĂƂ(int var1, int var2) {
      ᶔ.ⲋ.ⲋ(var1, var2);
   }

   public final void ɧῙ() {
      ϛⰄ = (boolean)llllIlIIl[0];
      ơ߀ var1 = ơ߀.ⲋ;
      Class var2 = Թ.class;
      int var3 = llllIlIIl[0];
      Object var10000 = var1.ⲋ().get(Թ.class);
      if (lIIIIlIlllI(var10000)) {
         throw new TypeCastException(llllIIIlI[llllIlIIl[6]]);
      } else {
         if (lIIIIllIIII(((Թ)((ⳅ)((Թ)var10000))).ĂƂ())) {
            ͷ.ς();
         }

      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(int var1) {
      Ꜥ = var1;
   }

   public final void Ꞑ() {
      this.ĂƂ(llllIIIlI[llllIlIIl[3]]);
   }

   @JvmName(
      name = "ⲡ"
   )
   public final int ⲡ() {
      return Minecraft.func_71410_x().field_71443_c;
   }

   public final void ꙑứ() {
      ϛⰄ = (boolean)llllIlIIl[1];
      ơ߀ var1 = ơ߀.ⲋ;
      Class var2 = Թ.class;
      int var3 = llllIlIIl[0];
      Object var10000 = var1.ⲋ().get(Թ.class);
      if (lIIIIlIlllI(var10000)) {
         throw new TypeCastException(llllIIIlI[llllIlIIl[5]]);
      } else {
         if (lIIIIllIIII(((Թ)((ⳅ)((Թ)var10000))).ĂƂ())) {
            ͷ.ᴃᎲ();
         }

      }
   }

   private static boolean lIIIIlIlllI(Object var0) {
      return var0 == null;
   }

   public final void u(int var1) {
   }

   public final void ⲋ(int var1, int var2, int var3) {
      ᶔ.ⲋ.ĂƂ(var1, var2, var3);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      Ꙗ = var1;
   }

   private static String lIIIIIlIlIl(String lIllIlIlIlIIllI, String lIllIlIlIlIlIlI) {
      lIllIlIlIlIIllI = new String(Base64.getDecoder().decode(lIllIlIlIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIllIlIlIlIlIIl = new StringBuilder();
      boolean lIllIlIlIlIIIll = lIllIlIlIlIlIlI.toCharArray();
      int lIllIlIlIlIIlll = llllIlIIl[0];
      int lIllIlIlIlIIIIl = lIllIlIlIlIIllI.toCharArray();
      float lIllIlIlIlIIIII = lIllIlIlIlIIIIl.length;
      int lIllIlIlIIlllll = llllIlIIl[0];

      do {
         if (!lIIIIllIllI(lIllIlIlIIlllll, lIllIlIlIlIIIII)) {
            return String.valueOf(lIllIlIlIlIlIIl);
         }

         char lIllIlIlIlIllII = lIllIlIlIlIIIIl[lIllIlIlIIlllll];
         lIllIlIlIlIlIIl.append((char)(lIllIlIlIlIllII ^ lIllIlIlIlIIIll[lIllIlIlIlIIlll % lIllIlIlIlIIIll.length]));
         "".length();
         ++lIllIlIlIlIIlll;
         ++lIllIlIlIIlllll;
         "".length();
      } while("  ".length() >= ((48 + 39 - 52 + 100 ^ 23 + 12 - -2 + 112) & (154 + 117 - 197 + 102 ^ 79 + 48 - -26 + 9 ^ -" ".length())));

      return null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ScaledResolution var1) {
      Ἒⅾ = var1;
   }
}
