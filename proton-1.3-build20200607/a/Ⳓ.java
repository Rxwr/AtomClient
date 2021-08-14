package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"La/Ⳓ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class Ⳓ extends Ἒⅾ {
   public Ⳓ() {
      super(lIlIlI[llIIll[9]], lIlIlI[llIIll[10]], (List)null, llIIll[4], (DefaultConstructorMarker)null);
   }

   private static boolean llllIII(Object var0) {
      return var0 == null;
   }

   private static boolean llllIIl(int var0) {
      return var0 != 0;
   }

   static {
      lllIlIl();
      llIlIlI();
   }

   private static void lllIlIl() {
      llIIll = new int[12];
      llIIll[0] = " ".length();
      llIIll[1] = (101 + 52 - 50 + 28 ^ 154 + 18 - 101 + 93) & (77 + 9 - 80 + 125 ^ 150 + 85 - 215 + 144 ^ -" ".length());
      llIIll[2] = "  ".length();
      llIIll[3] = "   ".length();
      llIIll[4] = 191 ^ 163 ^ 162 ^ 186;
      llIIll[5] = 116 ^ 113;
      llIIll[6] = 253 ^ 143 ^ 96 ^ 20;
      llIIll[7] = 98 + 88 - 133 + 108 ^ 71 + 162 - 207 + 140;
      llIIll[8] = 84 + 91 - 108 + 103 ^ 132 + 135 - 118 + 13;
      llIIll[9] = 81 + 77 - 27 + 15 ^ 107 + 83 - 49 + 14;
      llIIll[10] = 99 ^ 105;
      llIIll[11] = 10 ^ 1;
   }

   private static String llIIlll(String lllllIIIIIIIlIl, String lllllIIIIIIIlII) {
      try {
         long lllllIIIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllIIIIIIIIlI = Cipher.getInstance("Blowfish");
         lllllIIIIIIIIlI.init(llIIll[2], lllllIIIIIIIIll);
         return new String(lllllIIIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String llIIlII(String lllllIIIIlIlIlI, String lllllIIIIlIlIll) {
      try {
         String lllllIIIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), llIIll[8]), "DES");
         Cipher lllllIIIIlIlllI = Cipher.getInstance("DES");
         lllllIIIIlIlllI.init(llIIll[2], lllllIIIIlIlIII);
         return new String(lllllIIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void ⲋ(@NotNull Ἒⅾ.u lllllIIIIllIllI) {
      if (lllIlll(lllllIIIIllIllI.ⲋ(), llIIll[0])) {
         Y.ĂƂ.ⲋ(lIlIlI[llIIll[1]]);
      }

      String lllllIIIIllIlIl = lllllIIIIllIllI.ⲋ(llIIll[1]).ϛⰄ();
      char lllllIIIIllIlII = llIIll[1];
      if (llllIII(lllllIIIIllIlIl)) {
         throw new TypeCastException(lIlIlI[llIIll[0]]);
      } else {
         String var10000 = lllllIIIIllIlIl.toLowerCase();
         Intrinsics.checkExpressionValueIsNotNull(var10000, lIlIlI[llIIll[2]]);
         lllllIIIIllIlIl = var10000;
         switch(lllllIIIIllIlIl.hashCode()) {
         case 3522941:
            if (llllIIl(lllllIIIIllIlIl.equals(lIlIlI[llIIll[5]]))) {
               "".length();
               if (-(115 ^ 105 ^ 72 ^ 86) > 0) {
                  return;
               }

               ᴃᎲ.u.ϛⰄ();
               Y.ĂƂ.ⲋ(lIlIlI[llIIll[8]]);
               "".length();
               if ((85 ^ 81) < -" ".length()) {
                  return;
               }
            }
            break;
         case 3540994:
            if (llllIIl(lllllIIIIllIlIl.equals(lIlIlI[llIIll[3]]))) {
               "".length();
               if (" ".length() <= ((57 ^ 74 ^ 121 ^ 72) & (25 ^ 13 ^ 69 ^ 19 ^ -" ".length()))) {
                  return;
               }

               ᴃᎲ.u.Ἒⅾ();
               Y.ĂƂ.ⲋ(lIlIlI[llIIll[7]]);
               "".length();
               if ("  ".length() == 0) {
                  return;
               }
            }
            break;
         case 109757538:
            if (llllIIl(lllllIIIIllIlIl.equals(lIlIlI[llIIll[4]]))) {
               "".length();
               if ("  ".length() != "  ".length()) {
                  return;
               }

               ᴃᎲ.u.〥ҳⱆ();
               Y.ĂƂ.ⲋ(lIlIlI[llIIll[6]]);
               "".length();
               if ("   ".length() == 0) {
                  return;
               }
            }
         }

      }
   }

   private static boolean lllIlll(int var0, int var1) {
      return var0 != var1;
   }

   private static String llIIllI(String lllllIIIIIlllII, String lllllIIIIIlIllI) {
      lllllIIIIIlllII = new String(Base64.getDecoder().decode(lllllIIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      double lllllIIIIIlIlIl = new StringBuilder();
      Exception lllllIIIIIlIlII = lllllIIIIIlIllI.toCharArray();
      short lllllIIIIIlIIll = llIIll[1];
      int lllllIIIIIlIIlI = lllllIIIIIlllII.toCharArray();
      char lllllIIIIIlIIIl = lllllIIIIIlIIlI.length;
      int lllllIIIIIlIIII = llIIll[1];

      do {
         if (!llllIlI(lllllIIIIIlIIII, lllllIIIIIlIIIl)) {
            return String.valueOf(lllllIIIIIlIlIl);
         }

         char lllllIIIIIlllIl = lllllIIIIIlIIlI[lllllIIIIIlIIII];
         lllllIIIIIlIlIl.append((char)(lllllIIIIIlllIl ^ lllllIIIIIlIlII[lllllIIIIIlIIll % lllllIIIIIlIlII.length]));
         "".length();
         ++lllllIIIIIlIIll;
         ++lllllIIIIIlIIII;
         "".length();
      } while("  ".length() >= "  ".length());

      return null;
   }

   private static boolean llllIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static void llIlIlI() {
      lIlIlI = new String[llIIll[11]];
      lIlIlI[llIIll[1]] = llIIlII("MUpR7dntdS/+WCMm/Hub0PsEsmI9DDAccTeR7FP7PMJRC8m/CwrsfQ==", "HOTGQ");
      lIlIlI[llIIll[0]] = llIIlII("5bROaCNnQuXnMlV0sBYL/eNFNzR+TVE2NkmPYH3qHh4b31lHDhgGJ0D+IS4DYXqUvu+xZP1TS9I=", "FtyVg");
      lIlIlI[llIIll[2]] = llIIllI("", "RpKyS");
      lIlIlI[llIIll[3]] = llIIlll("qbmQiS4lcAo=", "KXiFv");
      lIlIlI[llIIll[4]] = llIIlII("fwuGx3h5AEM=", "SuVGO");
      lIlIlI[llIIll[5]] = llIIlll("BxafIt8v6Cc=", "TqKWB");
      lIlIlI[llIIll[6]] = llIIlII("5w5Np1454I2qC6W/JjFS4DsPxwZh/fSY", "wJqxf");
      lIlIlI[llIIll[7]] = llIIlll("wi7fhIGBX9vW7UpppPRfT592T4Ve5qFa", "BhnQX");
      lIlIlI[llIIll[8]] = llIIlll("MwOkbToLPJDW1NSyu2hP/SBL4khj0/q4UqE5OtXJWxrMzbAoIfKRnQ==", "FzkSr");
      lIlIlI[llIIll[9]] = llIIlII("pt6DqatAWBlW43NCkf/4ww==", "UztsJ");
      lIlIlI[llIIll[10]] = llIIllI("ECEGAgU8IhtWAzsrSBISMTsPVgchIQ4fGzY8Rg==", "SNhvw");
   }
}
