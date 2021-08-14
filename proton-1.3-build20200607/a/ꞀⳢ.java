package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u0006J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\f\u001a\u00020\u0015¢\u0006\u0004\b\f\u0010\u0017J\u0017\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0004\u0010\u0019J\u0017\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0004\u0010\u001bR&\u0010\u0004\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0004\u0010\u0006¨\u0006\u0086\u000eR&\u0010\u0002\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u0004\u0010\u000b¨\u0006\u0086\u000eR&\u0010\b\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u0005\"\u0004\b\b\u0010\u0006¨\u0006\u0086\u000eR&\u0010\u000e\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u0002\u0010\u0006¨\u0006\u0086\u000eR\u001d\u0010\r\u001a\u00020\u000f8\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0086\u0004"},
   d2 = {"La/ꞀⳢ;", "", "ĂƂ", "I", "ⲋ", "()I", "(I)V", "", "u", "J", "()J", "(J)V", "Ἒⅾ", "〥ҳⱆ", "ᴃᎲ", "", "[J", "()[J", "p0", "", "ς", "", "ϛⰄ", "()Z", "La/Ｓ꣙ὐ;", "(La/Ｓ꣙ὐ;)V", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;", "(Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;)V", "<init>", "()V", ""}
)
public final class ꞀⳢ {
   @JvmName(
      name = "ᴃᎲ"
   )
   public final int ᴃᎲ() {
      return 〥ҳⱆ;
   }

   private static String lIllII(String llllllIIlllIlIl, String llllllIIlllIllI) {
      try {
         double llllllIIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short llllllIIlllIIlI = Cipher.getInstance("Blowfish");
         llllllIIlllIIlI.init(lIIII[2], llllllIIlllIIll);
         return new String(llllllIIlllIIlI.doFinal(Base64.getDecoder().decode(llllllIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "u"
   )
   public final void u(int var1) {
      Ἒⅾ = var1;
   }

   private static void llIIII() {
      lIIII = new int[9];
      lIIII[0] = (178 ^ 152 ^ 123 ^ 18) & (22 ^ 61 ^ 236 ^ 132 ^ -" ".length());
      lIIII[1] = " ".length();
      lIIII[2] = "  ".length();
      lIIII[3] = -" ".length();
      lIIII[4] = 97 ^ 101 ^ "  ".length();
      lIIII[5] = 237 ^ 139 ^ 110 ^ 12;
      lIIII[6] = "   ".length();
      lIIII[7] = 55 ^ 5;
      lIIII[8] = 231 ^ 178 ^ 46 ^ 115;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      ĂƂ = var1;
   }

   private static boolean llIlII(int var0) {
      return var0 < 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ĂƂ;
   }

   public final boolean ϛⰄ() {
      EntityPlayerSP var1 = Minecraft.func_71410_x().field_71439_g;
      int var10000;
      if (llIIll(this.Ἒⅾ())) {
         if (llIIIl(var1)) {
            if (llIIlI(var1.field_71093_bK, lIIII[1])) {
               "".length();
               if ("  ".length() >= "   ".length()) {
                  return (boolean)((128 + 68 - 176 + 112 ^ 130 + 24 - 132 + 164) & (205 ^ 168 ^ 153 ^ 194 ^ -" ".length()));
               }

               var10000 = lIIII[1];
               "".length();
               if (null != null) {
                  return (boolean)("   ".length() & ("   ".length() ^ -" ".length()));
               }

               return (boolean)var10000;
            }
         } else {
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
               return (boolean)((77 ^ 80 ^ 78 ^ 28) & (193 ^ 145 ^ 142 ^ 145 ^ -" ".length()));
            }
         }
      }

      var10000 = lIIII[0];
      return (boolean)var10000;
   }

   public final long ς() {
      if (llIllI(this.ϛⰄ())) {
         return 0L;
      } else if (llIlll(〥ҳⱆ, lIIII[2])) {
         return 0L;
      } else {
         String llllllIlIllIlIl = 0L;
         byte llllllIlIllIlII = lIIII[0];
         int llllllIlIllIIll = RangesKt.coerceAtMost(Ἒⅾ, ᴃᎲ.length);

         do {
            if (!llIlll(llllllIlIllIlII, llllllIlIllIIll)) {
               long var7 = llllllIlIllIlIl / (long)(〥ҳⱆ + lIIII[1]);
               long var5 = var7 * (long)ĂƂ;
               return var5;
            }

            llllllIlIllIlIl += ᴃᎲ[llllllIlIllIlII];
            ++llllllIlIllIlII;
            "".length();
         } while("   ".length() != " ".length());

         return 0L;
      }
   }

   public final boolean Ἒⅾ() {
      int var2;
      label18: {
         ServerData var10000 = Minecraft.func_71410_x().func_147104_D();
         if (llIIIl(var10000)) {
            String var1 = var10000.field_78845_b;
            if (llIIIl(var1)) {
               if (llIIlI(StringsKt.startsWith(var1, llll[lIIII[0]], (boolean)lIIII[1]), lIIII[1])) {
                  var2 = lIIII[1];
                  "".length();
                  if ("  ".length() >= "   ".length()) {
                     return (boolean)((134 + 141 - 259 + 239 ^ 25 + 154 - 140 + 152) & (93 ^ 12 ^ 59 ^ 42 ^ -" ".length()));
                  }

                  return (boolean)var2;
               }
               break label18;
            }
         }

         "".length();
      }

      var2 = lIIII[0];
      return (boolean)var2;
   }

   private static boolean llIlIl(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean llIllI(int var0) {
      return var0 == 0;
   }

   private static boolean llIIIl(Object var0) {
      return var0 != null;
   }

   @ȵ
   public final void ⲋ(@NotNull ClientConnectedToServerEvent var1) {
      u = System.currentTimeMillis();
      ĂƂ = lIIII[3];
      〥ҳⱆ = lIIII[0];
   }

   static {
      llIIII();
      lIlllI();
      ꞀⳢ var0 = new ꞀⳢ();
      ⲋ = var0;
      ĂƂ = lIIII[3];
      ᴃᎲ = new long[lIIII[7]];
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final int 〥ҳⱆ() {
      return Ἒⅾ;
   }

   private static boolean llIlll(int var0, int var1) {
      return var0 < var1;
   }

   private ꞀⳢ() {
   }

   private static boolean llIIlI(int var0, int var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final long ĂƂ() {
      return u;
   }

   private static String lIllIl(String llllllIlIIllIlI, String llllllIlIIllIll) {
      try {
         SecretKeySpec llllllIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIlIIllIll.getBytes(StandardCharsets.UTF_8)), lIIII[8]), "DES");
         Cipher llllllIlIIllllI = Cipher.getInstance("DES");
         llllllIlIIllllI.init(lIIII[2], llllllIlIIlllll);
         return new String(llllllIlIIllllI.doFinal(Base64.getDecoder().decode(llllllIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @ȵ
   public final void ⲋ(@NotNull Ｓ꣙ὐ var1) {
      if (llIIll(this.ϛⰄ())) {
         String var2 = llll[lIIII[1]];
         if (llIIll(StringsKt.startsWith$default(var1.ᴃᎲ(), var2, (boolean)lIIII[0], lIIII[2], (Object)null))) {
            CharSequence var10000 = (CharSequence)var1.ᴃᎲ();
            String[] var10001 = new String[lIIII[1]];
            var10001[lIIII[0]] = llll[lIIII[2]];
            List var3 = StringsKt.split$default(var10000, var10001, (boolean)lIIII[0], lIIII[0], lIIII[4], (Object)null);
            if (llIlIl(var3.size(), lIIII[5])) {
               String var5 = (String)var3.get(lIIII[6]);
               int var6 = lIIII[0];
               int var4 = Integer.parseInt(var5);
               if (lllIII(ĂƂ, var4)) {
                  this.ᴃᎲ(var4);
               }
            }
         }
      }

   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(int var1) {
      〥ҳⱆ = var1;
   }

   private static boolean lllIII(int var0, int var1) {
      return var0 != var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(long var1) {
      u = var1;
   }

   private static void lIlllI() {
      llll = new String[lIIII[6]];
      llll[lIIII[0]] = lIlIll("VzZAB2EKJhU=", "eTrsO");
      llll[lIIII[1]] = lIllII("tEKEWPrRZSn13p0DKvWi5rdAKI2/9itG", "fZGsg");
      llll[lIIII[2]] = lIllIl("A8DaYLQdp6s=", "vkAXD");
   }

   private static boolean llIIll(int var0) {
      return var0 != 0;
   }

   private static String lIlIll(String llllllIlIIIIlll, String llllllIlIIIIllI) {
      llllllIlIIIIlll = new String(Base64.getDecoder().decode(llllllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      double llllllIlIIIIlIl = new StringBuilder();
      byte llllllIlIIIIlII = llllllIlIIIIllI.toCharArray();
      int llllllIlIIIlIII = lIIII[0];
      String llllllIlIIIIIlI = llllllIlIIIIlll.toCharArray();
      short llllllIlIIIIIIl = llllllIlIIIIIlI.length;
      int llllllIlIIIIIII = lIIII[0];

      do {
         if (!llIlll(llllllIlIIIIIII, llllllIlIIIIIIl)) {
            return String.valueOf(llllllIlIIIIlIl);
         }

         char llllllIlIIIllIl = llllllIlIIIIIlI[llllllIlIIIIIII];
         llllllIlIIIIlIl.append((char)(llllllIlIIIllIl ^ llllllIlIIIIlII[llllllIlIIIlIII % llllllIlIIIIlII.length]));
         "".length();
         ++llllllIlIIIlIII;
         ++llllllIlIIIIIII;
         "".length();
      } while(null == null);

      return null;
   }

   @JvmName(
      name = "u"
   )
   public final long[] u() {
      return ᴃᎲ;
   }

   public final void ᴃᎲ(int var1) {
      int llllllIlIlllllI = ĂƂ - var1;
      if (llIlII(llllllIlIlllllI)) {
         llllllIlIlllllI = lIIII[1];
      }

      long llllllIlIllllIl = (System.currentTimeMillis() - u) / (long)llllllIlIlllllI;
      ᴃᎲ[〥ҳⱆ] = llllllIlIllllIl;
      〥ҳⱆ += lIIII[1];
      Ἒⅾ += lIIII[1];
      int var10000 = Ἒⅾ;
      "".length();
      if (llIlIl(〥ҳⱆ, ᴃᎲ.length)) {
         〥ҳⱆ = lIIII[0];
      }

      ĂƂ = var1;
      u = System.currentTimeMillis();
   }
}
