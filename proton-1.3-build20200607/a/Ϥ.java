package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\nB\u0007¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u00020\u00018\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0096\u000e"},
   d2 = {"La/Ϥ;", "La/ʁᎴ;", "ᴃᎲ", "La/ʁᎴ;", "ς", "()La/ʁᎴ;", "ⲋ", "(La/ʁᎴ;)V", "<init>", "()V", "La/Ḥ;"}
)
public final class Ϥ extends Ḥ {
   static {
      lIIllIIIII();
      lIIlIlllIl();
   }

   private static boolean lIIllIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   public Ϥ() {
      super(lIIIllIIl[lIIIllIll[0]], lIIIllIll[1], lIIIllIll[2], (boolean)lIIIllIll[3]);
      int var10004 = lIIIllIll[3];
      Ⴝ var10006 = Ⴝ.ⲋ;
      int var10007 = lIIIllIll[0];
      Β var1 = new Β(lIIIllIll[4], lIIIllIll[4], lIIIllIll[5], lIIIllIll[4]);
      int var2 = var10007;
      Ⴝ var3 = var10006;
      Object var4 = null;
      int var5 = var10004;
      this.ᴃᎲ = (ʁᎴ)(new Ꮱ((Β)null, var1, (л)var4, var3, (boolean)var2, (boolean)var5, lIIIllIll[6], (DefaultConstructorMarker)null));
      this.ĂƂ((Ữ)(new ᵺ(new ė(lIIIllIll[7], lIIIllIll[7]), new ė(lIIIllIll[7], lIIIllIll[7]), lIIIllIIl[lIIIllIll[3]])));
      this.ĂƂ((Ữ)(new Ṃ(lIIIllIIl[lIIIllIll[8]], (Ҿ)null, (Color)null, (boolean)lIIIllIll[0], lIIIllIll[9], (DefaultConstructorMarker)null)));
      this.ĂƂ((Ữ)(new Ṃ(lIIIllIIl[lIIIllIll[10]], (Ҿ)null, (Color)null, (boolean)lIIIllIll[0], lIIIllIll[9], (DefaultConstructorMarker)null)));
      this.ĂƂ((Ữ)(new Ṃ(lIIIllIIl[lIIIllIll[11]], (Ҿ)null, (Color)null, (boolean)lIIIllIll[3], lIIIllIll[12], (DefaultConstructorMarker)null)));
      this.ĂƂ((Ữ)(new ｔ(lIIIllIIl[lIIIllIll[13]])));
      this.ĂƂ((Ữ)(new Ṃ(lIIIllIIl[lIIIllIll[12]], (Ҿ)null, (Color)null, (boolean)lIIIllIll[0], lIIIllIll[9], (DefaultConstructorMarker)null)));
      this.ĂƂ((Ữ)(new Ṃ(lIIIllIIl[lIIIllIll[14]], (Ҿ)null, (Color)null, (boolean)lIIIllIll[3], lIIIllIll[12], (DefaultConstructorMarker)null)));
      this.ĂƂ((Ữ)(new Ṃ(lIIIllIIl[lIIIllIll[15]], (Ҿ)null, (Color)null, (boolean)lIIIllIll[0], lIIIllIll[9], (DefaultConstructorMarker)null)));
      this.ĂƂ((Ữ)(new Ṃ(lIIIllIIl[lIIIllIll[16]], (Ҿ)null, (Color)null, (boolean)lIIIllIll[3], lIIIllIll[12], (DefaultConstructorMarker)null)));
      this.ĂƂ((Ữ)(new Ṃ(String.valueOf((new StringBuilder()).append(a.ϛⰄ.ⲋ.u()).append(lIIIllIIl[lIIIllIll[4]])), (Ҿ)null, (Color)null, (boolean)lIIIllIll[3], lIIIllIll[12], (DefaultConstructorMarker)null)));
   }

   private static String lIIlIllIIl(String llIlIllIIIIIIll, String llIlIlIllllllIl) {
      llIlIllIIIIIIll = new String(Base64.getDecoder().decode(llIlIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIlIllIIIIIIIl = new StringBuilder();
      char llIlIlIlllllIll = llIlIlIllllllIl.toCharArray();
      int llIlIlIllllllll = lIIIllIll[0];
      short llIlIlIlllllIIl = llIlIllIIIIIIll.toCharArray();
      boolean llIlIlIlllllIII = llIlIlIlllllIIl.length;
      int llIlIlIllllIlll = lIIIllIll[0];

      do {
         if (!lIIllIIIIl(llIlIlIllllIlll, llIlIlIlllllIII)) {
            return String.valueOf(llIlIllIIIIIIIl);
         }

         char llIlIllIIIIIlII = llIlIlIlllllIIl[llIlIlIllllIlll];
         llIlIllIIIIIIIl.append((char)(llIlIllIIIIIlII ^ llIlIlIlllllIll[llIlIlIllllllll % llIlIlIlllllIll.length]));
         "".length();
         ++llIlIlIllllllll;
         ++llIlIlIllllIlll;
         "".length();
      } while("  ".length() < (50 + 35 - 28 + 84 ^ 120 + 74 - 66 + 9));

      return null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public void ⲋ(@NotNull ʁᎴ var1) {
      this.ᴃᎲ = var1;
   }

   private static String lIIlIllIll(String llIlIlIlllIIIIl, String llIlIlIlllIIIII) {
      try {
         SecretKeySpec llIlIlIlllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIlIlIlllIIIll = Cipher.getInstance("Blowfish");
         llIlIlIlllIIIll.init(lIIIllIll[8], llIlIlIlllIIlII);
         return new String(llIlIlIlllIIIll.doFinal(Base64.getDecoder().decode(llIlIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIllIIIII() {
      lIIIllIll = new int[18];
      lIIIllIll[0] = (2 + 34 - -49 + 45 ^ 107 + 170 - 206 + 104) & (59 + 28 - 57 + 161 ^ 62 + 101 - 82 + 65 ^ -" ".length());
      lIIIllIll[1] = -(-2890 & 32733) & -2113 & 32255;
      lIIIllIll[2] = 110 + 38 - 98 + 138 + (108 ^ 29) - (66 + 61 - -14 + 40) + (236 ^ 188);
      lIIIllIll[3] = " ".length();
      lIIIllIll[4] = 137 ^ 131;
      lIIIllIll[5] = 218 ^ 198 ^ 128 ^ 133;
      lIIIllIll[6] = 104 ^ 61 ^ 25 ^ 89;
      lIIIllIll[7] = 69 + 115 - 172 + 116;
      lIIIllIll[8] = "  ".length();
      lIIIllIll[9] = 201 ^ 199;
      lIIIllIll[10] = "   ".length();
      lIIIllIll[11] = 26 ^ 16 ^ 142 ^ 128;
      lIIIllIll[12] = 214 ^ 158 ^ 38 ^ 104;
      lIIIllIll[13] = 34 + 60 - 77 + 131 ^ 128 + 58 - 61 + 20;
      lIIIllIll[14] = 119 + 128 - 227 + 112 ^ 121 + 22 - 93 + 81;
      lIIIllIll[15] = 46 + 17 - -7 + 75 ^ 73 + 0 - -26 + 54;
      lIIIllIll[16] = 152 ^ 147 ^ "  ".length();
      lIIIllIll[17] = 1 ^ 10;
   }

   private static String lIIlIllIII(String llIlIlIlllIlllI, String llIlIlIlllIllIl) {
      try {
         SecretKeySpec llIlIlIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlIlllIllIl.getBytes(StandardCharsets.UTF_8)), lIIIllIll[15]), "DES");
         Cipher llIlIlIllllIIII = Cipher.getInstance("DES");
         llIlIlIllllIIII.init(lIIIllIll[8], llIlIlIllllIIIl);
         return new String(llIlIlIllllIIII.doFinal(Base64.getDecoder().decode(llIlIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIlIlllIl() {
      lIIIllIIl = new String[lIIIllIll[17]];
      lIIIllIIl[lIIIllIll[0]] = lIIlIllIII("vH4dN6Euk/4=", "Zdpak");
      lIIIllIIl[lIIIllIll[3]] = lIIlIllIIl("LRUOF104EwAUAzwAEx8eOE8RFBc=", "Laazp");
      lIIIllIIl[lIIIllIll[8]] = lIIlIllIII("0hXg1fzqasRH63FMlJVbsFZZOhGvcC9v", "ZTikU");
      lIIIllIIl[lIIIllIll[10]] = lIIlIllIII("7y/adjkrDU0=", "dsIPO");
      lIIIllIIl[lIIIllIll[11]] = lIIlIllIIl("IzNnMBofdSInHwUsIi1VHyYuJxJKFBMGOEo5Ij1VBzBnIhsFImcoAQ==", "jUGIu");
      lIIIllIIl[lIIIllIll[13]] = lIIlIllIll("pb0xZJkE/I0jtrTBmI3pVpS6mditnpmy", "PmdbC");
      lIIIllIIl[lIIIllIll[12]] = lIIlIllIII("b/zDrtg0Sjo=", "VgGel");
      lIIIllIIl[lIIIllIll[14]] = lIIlIllIII("8IcnXCN4xNDG2u9kAzfggEkNElVBiS0MHkjjO7pWxmI=", "LEsJg");
      lIIIllIIl[lIIIllIll[15]] = lIIlIllIll("IvEGb3ZXTjI=", "rQJIu");
      lIIIllIIl[lIIIllIll[16]] = lIIlIllIll("v+PADgaLft6coWuPWVPyPoDXYnFz3za1t6kVReoVzuSUrx7YenEcgHneP/R3sZQp", "zZYcb");
      lIIIllIIl[lIIIllIll[4]] = lIIlIllIII("KMMGAnF1XcV5/f2/7UkTTw==", "HzLhE");
   }

   @JvmName(
      name = "ς"
   )
   public ʁᎴ ς() {
      return this.ᴃᎲ;
   }
}
