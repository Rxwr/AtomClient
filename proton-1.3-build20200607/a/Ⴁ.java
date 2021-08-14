package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.client.gui.GuiPageButtonList.GuiResponder;
import net.minecraft.client.gui.GuiSlider.FormatHelper;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tH\u0014J \u0010<\u001a\u00020:2\u0006\u0010=\u001a\u0002042\u0006\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020:H\u0016J\u0018\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u000204H\u0014J\b\u0010F\u001a\u00020:H\u0002J\b\u0010G\u001a\u00020:H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006H"},
   d2 = {"Lme/nucleus/proton/screens/GuiAutoReconnect;", "Lnet/minecraft/client/gui/GuiScreen;", "parentScreen", "reason", "", "message", "Lnet/minecraft/util/text/ITextComponent;", "(Lnet/minecraft/client/gui/GuiScreen;Ljava/lang/String;Lnet/minecraft/util/text/ITextComponent;)V", "autoReconnectButton", "Lnet/minecraft/client/gui/GuiButton;", "getAutoReconnectButton", "()Lnet/minecraft/client/gui/GuiButton;", "setAutoReconnectButton", "(Lnet/minecraft/client/gui/GuiButton;)V", "autoReconnectModule", "Lme/nucleus/proton/modules/misc/AutoReconnect;", "getAutoReconnectModule", "()Lme/nucleus/proton/modules/misc/AutoReconnect;", "autoreconnect", "", "getAutoreconnect", "()Z", "setAutoreconnect", "(Z)V", "interval", "", "getInterval", "()J", "setInterval", "(J)V", "getMessage", "()Lnet/minecraft/util/text/ITextComponent;", "multilineMessage", "", "getMultilineMessage", "()Ljava/util/List;", "setMultilineMessage", "(Ljava/util/List;)V", "getParentScreen", "()Lnet/minecraft/client/gui/GuiScreen;", "getReason", "()Ljava/lang/String;", "slider", "Lnet/minecraft/client/gui/GuiSlider;", "getSlider", "()Lnet/minecraft/client/gui/GuiSlider;", "setSlider", "(Lnet/minecraft/client/gui/GuiSlider;)V", "startTime", "getStartTime", "setStartTime", "textHeight", "", "getTextHeight", "()I", "setTextHeight", "(I)V", "actionPerformed", "", "button", "drawScreen", "mouseX", "mouseY", "partialTicks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "reconnect", "updateScreen", "proton"}
)
public final class Ⴁ extends GuiScreen {
   private static boolean llIIlIlll(Object var0) {
      return var0 != null;
   }

   public final void setAutoReconnectButton(@Nullable GuiButton var1) {
      this.autoReconnectButton = var1;
   }

   @Nullable
   public final GuiScreen getParentScreen() {
      return this.parentScreen;
   }

   private static boolean llIIllllI(int var0, int var1) {
      return var0 == var1;
   }

   @NotNull
   public final String getReason() {
      return this.reason;
   }

   @Nullable
   public final GuiButton getAutoReconnectButton() {
      return this.autoReconnectButton;
   }

   public void func_73876_c() {
      super.func_73876_c();
      double lllIIlIIIlIIlII = (double)(lllIIlIIIlIIlIl.interval - (System.currentTimeMillis() - lllIIlIIIlIIlIl.startTime)) / 1000.0D;
      GuiButton var10000;
      if (llIIllIIl(lllIIlIIIlIIlIl.autoreconnect)) {
         var10000 = lllIIlIIIlIIlIl.autoReconnectButton;
         if (llIIlIlll(var10000)) {
            StringBuilder var5 = (new StringBuilder()).append(lIllllIl[llIIIIII[11]]);
            GuiButton var4 = var10000;
            int var3 = llIIIIII[1];
            double var6 = Math.ceil(lllIIlIIIlIIlII);
            var4.field_146126_j = String.valueOf(var5.append((int)var6).append((char)llIIIIII[12]));
            "".length();
            if (((232 ^ 165 ^ 172 ^ 131) & (207 ^ 169 ^ 6 ^ 2 ^ -" ".length())) >= "   ".length()) {
               return;
            }
         } else {
            "".length();
         }

         if (llIIllIlI(llIIllIII(lllIIlIIIlIIlII, (double)llIIIIII[1]))) {
            lllIIlIIIlIIlIl.reconnect();
            "".length();
            if (-" ".length() >= (188 ^ 144 ^ 124 ^ 84)) {
               return;
            }
         }
      } else {
         var10000 = lllIIlIIIlIIlIl.autoReconnectButton;
         if (llIIlIlll(var10000)) {
            var10000.field_146126_j = lIllllIl[llIIIIII[13]];
            "".length();
            if (((132 + 24 - 16 + 81 ^ 5 + 56 - 20 + 98) & (123 + 200 - 305 + 197 ^ 3 + 23 - 20 + 123 ^ -" ".length())) > " ".length()) {
               return;
            }
         } else {
            "".length();
         }
      }

   }

   public final void setSlider(@Nullable GuiSlider var1) {
      this.slider = var1;
   }

   private static void llIIlIlIl() {
      llIIIIII = new int[19];
      llIIIIII[0] = 153 ^ 171;
      llIIIIII[1] = (46 + 70 - 96 + 142 ^ 118 + 63 - 147 + 116) & (33 + 135 - 121 + 130 ^ 6 + 37 - 24 + 114 ^ -" ".length());
      llIIIIII[2] = " ".length();
      llIIIIII[3] = "  ".length();
      llIIIIII[4] = 71 ^ 35;
      llIIIIII[5] = 145 ^ 143;
      llIIIIII[6] = 83 + 112 - 164 + 130 ^ 50 + 177 - 176 + 133;
      llIIIIII[7] = "   ".length();
      llIIIIII[8] = 153 + 248 - 172 + 22 ^ 70 + 146 - 169 + 129;
      llIIIIII[9] = 104 ^ 108;
      llIIIIII[10] = 138 + 191 - 258 + 129;
      llIIIIII[11] = 4 ^ 79 ^ 79 ^ 1;
      llIIIIII[12] = 166 ^ 143;
      llIIIIII[13] = 140 ^ 138;
      llIIIIII[14] = -(-25130 & 30335) & -16641 & 11206655;
      llIIIIII[15] = 39 ^ 32;
      llIIIIII[16] = -" ".length() & -1 & 16777215;
      llIIIIII[17] = 109 + 66 - 81 + 33 ^ 73 ^ 62;
      llIIIIII[18] = 118 ^ 3 ^ 211 ^ 175;
   }

   public final void setTextHeight(int var1) {
      this.textHeight = var1;
   }

   public Ⴁ(@Nullable GuiScreen var1, @NotNull String var2, @NotNull ITextComponent var3) {
      this.parentScreen = var1;
      this.reason = var2;
      this.message = var3;
      this.autoreconnect = (boolean)llIIIIII[2];
      this.interval = 5000L;
      ơ߀ var4 = ơ߀.ⲋ;
      Class var5 = ᴟ.class;
      int var6 = llIIIIII[1];
      Object var10000 = var4.ⲋ().get(ᴟ.class);
      if (llIIlIllI(var10000)) {
         throw new TypeCastException(lIllllIl[llIIIIII[17]]);
      } else {
         ⳅ var8 = (ⳅ)((ᴟ)var10000);
         this.autoReconnectModule = (ᴟ)var8;
      }
   }

   private static boolean llIIlIllI(Object var0) {
      return var0 == null;
   }

   private static boolean llIIlllIl(int var0) {
      return var0 == 0;
   }

   public void func_73866_w_() {
      lllIIlIIIlIlllI.field_146292_n.clear();
      lllIIlIIIlIlllI.multilineMessage = lllIIlIIIlIlllI.field_146289_q.func_78271_c(lllIIlIIIlIlllI.message.func_150254_d(), lllIIlIIIlIlllI.field_146294_l - llIIIIII[0]);
      List var10001 = lllIIlIIIlIlllI.multilineMessage;
      if (llIIlIllI(var10001)) {
         throw new TypeCastException(lIllllIl[llIIIIII[1]]);
      } else {
         lllIIlIIIlIlllI.textHeight = TypeIntrinsics.asMutableList(var10001).size() * lllIIlIIIlIlllI.field_146289_q.field_78288_b;
         lllIIlIIIlIlllI.field_146292_n.add(new GuiButton(llIIIIII[2], lllIIlIIIlIlllI.field_146294_l / llIIIIII[3] - llIIIIII[4], RangesKt.coerceAtMost(lllIIlIIIlIlllI.field_146295_m / llIIIIII[3] + lllIIlIIIlIlllI.textHeight / llIIIIII[3] + lllIIlIIIlIlllI.field_146289_q.field_78288_b, lllIIlIIIlIlllI.field_146295_m - llIIIIII[5]) + llIIIIII[6], lIllllIl[llIIIIII[2]]));
         "".length();
         lllIIlIIIlIlllI.autoReconnectButton = new GuiButton(llIIIIII[3], lllIIlIIIlIlllI.field_146294_l / llIIIIII[3] - llIIIIII[4], RangesKt.coerceAtMost(lllIIlIIIlIlllI.field_146295_m / llIIIIII[3] + lllIIlIIIlIlllI.textHeight / llIIIIII[3] + lllIIlIIIlIlllI.field_146289_q.field_78288_b, lllIIlIIIlIlllI.field_146295_m - llIIIIII[5]) + llIIIIII[0], lIllllIl[llIIIIII[3]]);
         lllIIlIIIlIlllI.field_146292_n.add(lllIIlIIIlIlllI.autoReconnectButton);
         "".length();
         lllIIlIIIlIlllI.field_146292_n.add(new GuiButton(llIIIIII[1], lllIIlIIIlIlllI.field_146294_l / llIIIIII[3] - llIIIIII[4], RangesKt.coerceAtMost(lllIIlIIIlIlllI.field_146295_m / llIIIIII[3] + lllIIlIIIlIlllI.textHeight / llIIIIII[3] + lllIIlIIIlIlllI.field_146289_q.field_78288_b, lllIIlIIIlIlllI.field_146295_m - llIIIIII[5]), I18n.func_135052_a(lIllllIl[llIIIIII[7]], new Object[llIIIIII[1]])));
         "".length();
         lllIIlIIIlIlllI.slider = new GuiSlider((GuiResponder)(new GuiResponder() {
            public void func_175319_a(int var1, @NotNull String var2) {
            }

            public void func_175321_a(int var1, boolean var2) {
            }

            public void func_175320_a(int var1, float var2) {
               lllIIlIIIlIlllI.setInterval((long)((double)var2 * 1000.0D));
               lllIIlIIIlIlllI.getAutoReconnectModule().ⲋ((double)var2);
            }
         }), llIIIIII[7], lllIIlIIIlIlllI.field_146294_l / llIIIIII[3] - llIIIIII[4], RangesKt.coerceAtMost(lllIIlIIIlIlllI.field_146295_m / llIIIIII[3] + lllIIlIIIlIlllI.textHeight / llIIIIII[3] + lllIIlIIIlIlllI.field_146289_q.field_78288_b, lllIIlIIIlIlllI.field_146295_m - llIIIIII[5]) + llIIIIII[8], lIllllIl[llIIIIII[9]], 1.0F, 60.0F, 5.0F, (FormatHelper)null.INSTANCE);
         lllIIlIIIlIlllI.field_146292_n.add(lllIIlIIIlIlllI.slider);
         "".length();
         lllIIlIIIlIlllI.autoreconnect = lllIIlIIIlIlllI.autoReconnectModule.Ɏ();
         GuiSlider var10000 = lllIIlIIIlIlllI.slider;
         if (llIIlIlll(var10000)) {
            var10000.field_146120_f = llIIIIII[10];
            "".length();
            if (null != null) {
               return;
            }
         } else {
            "".length();
         }

         var10000 = lllIIlIIIlIlllI.slider;
         if (llIIlIlll(var10000)) {
            var10000.func_175218_a((float)lllIIlIIIlIlllI.autoReconnectModule.ⲋ(), (boolean)llIIIIII[2]);
            "".length();
            if ("  ".length() == -" ".length()) {
               return;
            }
         } else {
            "".length();
         }

         lllIIlIIIlIlllI.startTime = System.currentTimeMillis();
      }
   }

   private static String llIIIllll(String lllIIIllllIllII, String lllIIIllllIlIll) {
      lllIIIllllIllII = new String(Base64.getDecoder().decode(lllIIIllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      short lllIIIllllIlIlI = new StringBuilder();
      Exception lllIIIllllIlIIl = lllIIIllllIlIll.toCharArray();
      boolean lllIIIllllIlIII = llIIIIII[1];
      Exception lllIIIllllIIlll = lllIIIllllIllII.toCharArray();
      short lllIIIllllIIllI = lllIIIllllIIlll.length;
      int lllIIIllllIIlIl = llIIIIII[1];

      do {
         if (!llIlIIIll(lllIIIllllIIlIl, lllIIIllllIIllI)) {
            return String.valueOf(lllIIIllllIlIlI);
         }

         char lllIIIlllllIIlI = lllIIIllllIIlll[lllIIIllllIIlIl];
         lllIIIllllIlIlI.append((char)(lllIIIlllllIIlI ^ lllIIIllllIlIIl[lllIIIllllIlIII % lllIIIllllIlIIl.length]));
         "".length();
         ++lllIIIllllIlIII;
         ++lllIIIllllIIlIl;
         "".length();
      } while(" ".length() <= "  ".length());

      return null;
   }

   protected void func_73869_a(char var1, int var2) {
   }

   public final boolean getAutoreconnect() {
      return this.autoreconnect;
   }

   public final void setAutoreconnect(boolean var1) {
      this.autoreconnect = var1;
   }

   @Nullable
   public final List<String> getMultilineMessage() {
      return this.multilineMessage;
   }

   private static String llIIlIIII(String lllIIIlllIllIlI, String lllIIIlllIllIll) {
      try {
         SecretKeySpec lllIIIlllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlllIllIll.getBytes(StandardCharsets.UTF_8)), llIIIIII[17]), "DES");
         char lllIIIlllIlIlll = Cipher.getInstance("DES");
         lllIIIlllIlIlll.init(llIIIIII[3], lllIIIlllIlllll);
         return new String(lllIIIlllIlIlll.doFinal(Base64.getDecoder().decode(lllIIIlllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String llIIIlllI(String lllIIIlllIIllll, String lllIIIlllIIlllI) {
      try {
         SecretKeySpec lllIIIlllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean lllIIIlllIIlIlI = Cipher.getInstance("Blowfish");
         lllIIIlllIIlIlI.init(llIIIIII[3], lllIIIlllIlIIlI);
         return new String(lllIIIlllIIlIlI.doFinal(Base64.getDecoder().decode(lllIIIlllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIlIIIll(int var0, int var1) {
      return var0 < var1;
   }

   public final int getTextHeight() {
      return this.textHeight;
   }

   public final long getInterval() {
      return this.interval;
   }

   private static int llIIllIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean llIIllIIl(int var0) {
      return var0 != 0;
   }

   public final void setInterval(long var1) {
      this.interval = var1;
   }

   @NotNull
   public final ᴟ getAutoReconnectModule() {
      return this.autoReconnectModule;
   }

   public final void setStartTime(long var1) {
      this.startTime = var1;
   }

   private static void llIIlIIIl() {
      lIllllIl = new String[llIIIIII[18]];
      lIllllIl[llIIIIII[1]] = llIIIlllI("RhgUaTmzD5H4J3faCXHknPuySgyKk4vUQeickEOD9W4rXpSHj5SYh9UEHfDsqap58yhJ9N32M7g+2PAzDQj15GQro28QXadBbHMUMG+PosaBoiVqESQjzw==", "eJAuL");
      lIllllIl[llIIIIII[2]] = llIIIlllI("c5V9YquxBi3bDfeEsnydiQ==", "sFMrP");
      lIllllIl[llIIIIII[3]] = llIIIllll("DB8BPQgoCRo8NCgJAQ==", "MjuRZ");
      lIllllIl[llIIIIII[7]] = llIIIlllI("2yx11ZERwU/2moKB5HoH/w==", "RUzna");
      lIllllIl[llIIIIII[9]] = llIIIllll("DAsrExA=", "HnGri");
      lIllllIl[llIIIIII[11]] = llIIIlllI("LrRNi8P2CA4KExqGdZRDqg==", "WyTEc");
      lIllllIl[llIIIIII[13]] = llIIlIIII("PjGLfKpaBDQDLKCrlgRPKg==", "bjomJ");
      lIllllIl[llIIIIII[15]] = llIIIllll("GBw7NEUVCDk2CgJJNT1FFQgkLEUCBnc2ChhEOS0JGkkjIRUTSTw3ERoAOXY2Ahs+NgI=", "viWXe");
      lIllllIl[llIIIIII[17]] = llIIlIIII("Wx20yAQe2Eg+n19x+e19rSVRXWZ/JqmJKY2ImX7QKNYhR3lUPdThlNGJZRzHjqa0XR8JeNfPPxK3RiEbn0uRz8uT+NTMiJwBXmAfRYhynPuo3Iq+cOZDdg==", "sthGU");
   }

   public final long getStartTime() {
      return this.startTime;
   }

   public void func_73863_a(int var1, int var2, float var3) {
      lllIIlIIIIlIlII.func_146276_q_();
      lllIIlIIIIlIlII.func_73732_a(lllIIlIIIIlIlII.field_146289_q, lllIIlIIIIlIlII.reason, lllIIlIIIIlIlII.field_146294_l / llIIIIII[3], lllIIlIIIIlIlII.field_146295_m / llIIIIII[3] - lllIIlIIIIlIlII.textHeight / llIIIIII[3] - lllIIlIIIIlIlII.field_146289_q.field_78288_b * llIIIIII[3], llIIIIII[14]);
      int lllIIlIIIIlIIII = lllIIlIIIIlIlII.field_146295_m / llIIIIII[3] - lllIIlIIIIlIlII.textHeight / llIIIIII[3];
      if (llIIlIlll(lllIIlIIIIlIlII.multilineMessage)) {
         List var10000 = lllIIlIIIIlIlII.multilineMessage;
         if (llIIlIllI(var10000)) {
            Intrinsics.throwNpe();
         }

         Iterator lllIIlIIIIIllll = var10000.iterator();

         while(llIIllIIl(lllIIlIIIIIllll.hasNext())) {
            Object var8 = lllIIlIIIIIllll.next();
            if (llIIlIllI(var8)) {
               throw new TypeCastException(lIllllIl[llIIIIII[15]]);
            }

            long lllIIlIIIIIlllI = (String)var8;
            lllIIlIIIIlIlII.func_73732_a(lllIIlIIIIlIlII.field_146289_q, lllIIlIIIIIlllI, lllIIlIIIIlIlII.field_146294_l / llIIIIII[3], lllIIlIIIIlIIII, llIIIIII[16]);
            lllIIlIIIIlIIII += lllIIlIIIIlIlII.field_146289_q.field_78288_b;
            "".length();
            if ("   ".length() < "   ".length()) {
               return;
            }
         }
      }

      super.func_73863_a(var1, var2, var3);
   }

   @NotNull
   public final ITextComponent getMessage() {
      return this.message;
   }

   static {
      llIIlIlIl();
      llIIlIIIl();
   }

   public final void setMultilineMessage(@Nullable List<String> var1) {
      this.multilineMessage = var1;
   }

   private final void reconnect() {
      FMLClientHandler var10000 = FMLClientHandler.instance();
      GuiScreen var10001 = this.parentScreen;
      if (llIIlIllI(var10001)) {
         Intrinsics.throwNpe();
      }

      ServerData var10002 = u.ⲋ.ⲋ();
      if (llIIlIllI(var10002)) {
         Intrinsics.throwNpe();
      }

      var10000.connectToServer(var10001, var10002);
   }

   @Nullable
   public final GuiSlider getSlider() {
      return this.slider;
   }

   protected void func_146284_a(@NotNull GuiButton lllIIlIIIIlllII) {
      if (llIIlllIl(lllIIlIIIIlllII.field_146127_k)) {
         lllIIlIIIIlllIl.field_146297_k.func_147108_a(lllIIlIIIIlllIl.parentScreen);
         "".length();
         if ("   ".length() < -" ".length()) {
            return;
         }
      } else if (llIIllllI(lllIIlIIIIlllII.field_146127_k, llIIIIII[2])) {
         lllIIlIIIIlllIl.reconnect();
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      } else if (llIIllllI(lllIIlIIIIlllII.field_146127_k, llIIIIII[3])) {
         int var10001;
         if (llIIlllIl(lllIIlIIIIlllIl.autoreconnect)) {
            var10001 = llIIIIII[2];
            "".length();
            if ("  ".length() == 0) {
               return;
            }
         } else {
            var10001 = llIIIIII[1];
         }

         lllIIlIIIIlllIl.autoreconnect = (boolean)var10001;
         lllIIlIIIIlllIl.autoReconnectModule.ᵴἥ().ⲋ((Object)lllIIlIIIIlllIl.autoreconnect);
         if (llIIllIIl(lllIIlIIIIlllIl.autoreconnect)) {
            lllIIlIIIIlllIl.startTime = System.currentTimeMillis();
         }
      }

   }

   private static boolean llIIllIlI(int var0) {
      return var0 <= 0;
   }
}
