package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nj\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"},
   d2 = {"La/ʞ;", "ⲋ", "ĂƂ", "u", "ᴃᎲ", "〥ҳⱆ", "Ἒⅾ", "ϛⰄ", "ς", "<init>", "(Ljava/lang/String;I)V", ""}
)
public enum ʞ {
   private static String lIlIlIIIlI(String llIlIIIIIIIIIII, String llIlIIIIIIIIIIl) {
      try {
         SecretKeySpec llIlIIIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int llIIlllllllllIl = Cipher.getInstance("Blowfish");
         llIIlllllllllIl.init(lIlIIlIII[3], llIlIIIIIIIIlIl);
         return new String(llIIlllllllllIl.doFinal(Base64.getDecoder().decode(llIlIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIlIIIII(String llIlIIIIIlIIlIl, String llIlIIIIIlIIllI) {
      try {
         SecretKeySpec llIlIIIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIlIII[0]), "DES");
         long llIlIIIIIlIIIlI = Cipher.getInstance("DES");
         llIlIIIIIlIIIlI.init(lIlIIlIII[3], llIlIIIIIlIlIlI);
         return new String(llIlIIIIIlIIIlI.doFinal(Base64.getDecoder().decode(llIlIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIlIIllI() {
      lIIllllIl = new String[lIlIIlIII[0]];
      lIIllllIl[lIlIIlIII[1]] = lIlIlIIIII("ykW1QAQI+/I=", "cfYVC");
      lIIllllIl[lIlIIlIII[2]] = lIlIlIIIII("zgZ94bZRATs=", "NzgnW");
      lIIllllIl[lIlIIlIII[3]] = lIlIlIIIlI("nGpdqx1UMtM=", "osiqX");
      lIIllllIl[lIlIIlIII[4]] = lIlIlIIIlI("Rx22Ry5yrIA=", "cCqeE");
      lIIllllIl[lIlIIlIII[5]] = lIlIlIIIII("KCz94i9XW9Q=", "rlVNb");
      lIIllllIl[lIlIIlIII[6]] = lIlIlIIlIl("KiskCwI=", "idhDP");
      lIIllllIl[lIlIIlIII[7]] = lIlIlIIIlI("qk7RMBQmhyE=", "EKrRS");
      lIIllllIl[lIlIIlIII[8]] = lIlIlIIlIl("OyYXLg==", "uiYkL");
   }

   private static void lIllIIIIIl() {
      lIlIIlIII = new int[9];
      lIlIIlIII[0] = 117 + 1 - 2 + 71 ^ 10 + 153 - -11 + 5;
      lIlIIlIII[1] = (122 ^ 45) & ~(237 ^ 186);
      lIlIIlIII[2] = " ".length();
      lIlIIlIII[3] = "  ".length();
      lIlIIlIII[4] = "   ".length();
      lIlIIlIII[5] = 161 ^ 149 ^ 151 ^ 167;
      lIlIIlIII[6] = 125 ^ 120;
      lIlIIlIII[7] = 2 ^ 4;
      lIlIIlIII[8] = 91 ^ 94 ^ "  ".length();
   }

   private ʞ() {
   }

   static {
      lIllIIIIIl();
      lIlIlIIllI();
      ʞ[] var10001 = new ʞ[lIlIIlIII[0]];
      var10001[lIlIIlIII[1]] = ⲋ = new ʞ(lIIllllIl[lIlIIlIII[1]], lIlIIlIII[1]);
      var10001[lIlIIlIII[2]] = ĂƂ = new ʞ(lIIllllIl[lIlIIlIII[2]], lIlIIlIII[2]);
      var10001[lIlIIlIII[3]] = u = new ʞ(lIIllllIl[lIlIIlIII[3]], lIlIIlIII[3]);
      var10001[lIlIIlIII[4]] = ᴃᎲ = new ʞ(lIIllllIl[lIlIIlIII[4]], lIlIIlIII[4]);
      var10001[lIlIIlIII[5]] = 〥ҳⱆ = new ʞ(lIIllllIl[lIlIIlIII[5]], lIlIIlIII[5]);
      var10001[lIlIIlIII[6]] = Ἒⅾ = new ʞ(lIIllllIl[lIlIIlIII[6]], lIlIIlIII[6]);
      var10001[lIlIIlIII[7]] = ϛⰄ = new ʞ(lIIllllIl[lIlIIlIII[7]], lIlIIlIII[7]);
      var10001[lIlIIlIII[8]] = ς = new ʞ(lIIllllIl[lIlIIlIII[8]], lIlIIlIII[8]);
   }

   private static String lIlIlIIlIl(String llIlIIIIIIlIIlI, String llIlIIIIIIlIIIl) {
      llIlIIIIIIlIIlI = new String(Base64.getDecoder().decode(llIlIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIlIIIIIIlIlIl = new StringBuilder();
      char[] llIlIIIIIIlIlII = llIlIIIIIIlIIIl.toCharArray();
      int llIlIIIIIIlIIll = lIlIIlIII[1];
      byte llIlIIIIIIIllIl = llIlIIIIIIlIIlI.toCharArray();
      String llIlIIIIIIIllII = llIlIIIIIIIllIl.length;
      int llIlIIIIIIIlIll = lIlIIlIII[1];

      do {
         if (!lIllIIIlII(llIlIIIIIIIlIll, llIlIIIIIIIllII)) {
            return String.valueOf(llIlIIIIIIlIlIl);
         }

         long llIlIIIIIIIlIlI = llIlIIIIIIIllIl[llIlIIIIIIIlIll];
         llIlIIIIIIlIlIl.append((char)(llIlIIIIIIIlIlI ^ llIlIIIIIIlIlII[llIlIIIIIIlIIll % llIlIIIIIIlIlII.length]));
         "".length();
         ++llIlIIIIIIlIIll;
         ++llIlIIIIIIIlIll;
         "".length();
      } while(null == null);

      return null;
   }
}
