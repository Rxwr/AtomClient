package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class Ứ {
   Ứ() {
   }

   private static String llIIIlllIl(String llIIlIIlIIIIlIl, String llIIlIIlIIIlIIl) {
      llIIlIIlIIIIlIl = new String(Base64.getDecoder().decode(llIIlIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIIlIIlIIIlIII = new StringBuilder();
      float llIIlIIlIIIIIlI = llIIlIIlIIIlIIl.toCharArray();
      String llIIlIIlIIIIIIl = lIllllllI[0];
      String llIIlIIlIIIIIII = llIIlIIlIIIIlIl.toCharArray();
      int llIIlIIIlllllll = llIIlIIlIIIIIII.length;
      int llIIlIIIllllllI = lIllllllI[0];

      do {
         if (!llIIlIIlII(llIIlIIIllllllI, llIIlIIIlllllll)) {
            return String.valueOf(llIIlIIlIIIlIII);
         }

         char llIIlIIlIIIlIll = llIIlIIlIIIIIII[llIIlIIIllllllI];
         llIIlIIlIIIlIII.append((char)(llIIlIIlIIIlIll ^ llIIlIIlIIIIIlI[llIIlIIlIIIIIIl % llIIlIIlIIIIIlI.length]));
         "".length();
         ++llIIlIIlIIIIIIl;
         ++llIIlIIIllllllI;
         "".length();
      } while(" ".length() > 0);

      return null;
   }

   private static boolean llIIlIIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static void llIIlIIIll() {
      lIllllllI = new int[9];
      lIllllllI[0] = (30 ^ 93) & ~(26 ^ 89);
      lIllllllI[1] = " ".length();
      lIllllllI[2] = "  ".length();
      lIllllllI[3] = "   ".length();
      lIllllllI[4] = 62 + 110 - 132 + 94 ^ 86 + 49 - 21 + 16;
      lIllllllI[5] = 72 ^ 77;
      lIllllllI[6] = 180 ^ 178;
      lIllllllI[7] = 96 ^ 103;
      lIllllllI[8] = 97 ^ 105;
   }

   static {
      llIIlIIIll();
      llIIIlllll();
      ᴃᎲ = lIllllIll[lIllllllI[0]];
      Ἒⅾ = lIllllIll[lIllllllI[1]];
      ϛⰄ = lIllllIll[lIllllllI[2]];
      ⲋ = lIllllIll[lIllllllI[3]];
      u = lIllllIll[lIllllllI[4]];
      ĂƂ = lIllllIll[lIllllllI[5]];
      〥ҳⱆ = lIllllIll[lIllllllI[6]];
   }

   private static void llIIIlllll() {
      lIllllIll = new String[lIllllllI[7]];
      lIllllIll[lIllllllI[0]] = llIIIlllIl("ZXZJNz5mYEw=", "MIskZ");
      lIllllIll[lIllllllI[1]] = llIIIlllIl("cUZoFiYNJHtyemZDCSx/Izh/F3cEUA==", "YyRMR");
      lIllllIll[lIllllllI[2]] = llIIIlllIl("LjN2BBtQSA==", "umSYg");
      lIllllIll[lIllllllI[3]] = llIIIllllI("H2YAq7jk2Hd2+JlAuXlFoqZnahVCAc9CW082vnE8ZUa99JYA2CGnKa2SroNEEUBz5asDxHq+pU3azyNQWt7LyMWZmvV8y619pSGX0vkkU3jREq+5O1HH5Q==", "TLEVI");
      lIllllIll[lIllllllI[4]] = llIIIlllIl("andMIk5hY1ZJT2p0K1NKfQ==", "BHvyc");
      lIllllIll[lIllllllI[5]] = llIIIllllI("GSXxIyU3VLt/Ru7QpegBOQ==", "zUkrg");
      lIllllIll[lIllllllI[6]] = llIIIlllIl("RmpANXwyMVFAbQ==", "nUziR");
   }

   private static String llIIIllllI(String llIIlIIIlllIIll, String llIIlIIIlllIlII) {
      try {
         SecretKeySpec llIIlIIIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIIlllIlII.getBytes(StandardCharsets.UTF_8)), lIllllllI[8]), "DES");
         Exception llIIlIIIlllIIII = Cipher.getInstance("DES");
         llIIlIIIlllIIII.init(lIllllllI[2], llIIlIIIllllIII);
         return new String(llIIlIIIlllIIII.doFinal(Base64.getDecoder().decode(llIIlIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
