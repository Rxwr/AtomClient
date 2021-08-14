package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u000bB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004j\u0002\b\u0004j\u0002\b\u0006j\u0002\b\u0007"},
   d2 = {"La/ᶂ;", "", "〥ҳⱆ", "Ljava/lang/String;", "ⲋ", "()Ljava/lang/String;", "ĂƂ", "u", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ""}
)
public enum ᶂ {
   private static String lIlIIIlllI(String llIlIIIlIlllIlI, String llIlIIIlIllIllI) {
      try {
         SecretKeySpec llIlIIIlIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIlIllIllI.getBytes(StandardCharsets.UTF_8)), lIIllIllI[7]), "DES");
         double llIlIIIlIllIIIl = Cipher.getInstance("DES");
         llIlIIIlIllIIIl.init(lIIllIllI[3], llIlIIIlIllllIl);
         return new String(llIlIIIlIllIIIl.doFinal(Base64.getDecoder().decode(llIlIIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final String ⲋ() {
      return this.〥ҳⱆ;
   }

   static {
      lIlIIlIllI();
      lIlIIIllll();
      ᶂ[] var10001 = new ᶂ[lIIllIllI[0]];
      var10001[lIIllIllI[1]] = ⲋ = new ᶂ(lIIllIIII[lIIllIllI[1]], lIIllIllI[1], lIIllIIII[lIIllIllI[2]]);
      var10001[lIIllIllI[2]] = ĂƂ = new ᶂ(lIIllIIII[lIIllIllI[3]], lIIllIllI[2], lIIllIIII[lIIllIllI[0]]);
      var10001[lIIllIllI[3]] = u = new ᶂ(lIIllIIII[lIIllIllI[4]], lIIllIllI[3], lIIllIIII[lIIllIllI[5]]);
   }

   private static String lIlIIIllIl(String llIlIIIlIlIIIIl, String llIlIIIlIlIIlIl) {
      llIlIIIlIlIIIIl = new String(Base64.getDecoder().decode(llIlIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      double llIlIIIlIIlllll = new StringBuilder();
      byte llIlIIIlIIllllI = llIlIIIlIlIIlIl.toCharArray();
      boolean llIlIIIlIIlllIl = lIIllIllI[1];
      Exception llIlIIIlIIlllII = llIlIIIlIlIIIIl.toCharArray();
      long llIlIIIlIIllIll = llIlIIIlIIlllII.length;
      int llIlIIIlIIllIlI = lIIllIllI[1];

      do {
         if (!lIlIIllIII(llIlIIIlIIllIlI, llIlIIIlIIllIll)) {
            return String.valueOf(llIlIIIlIIlllll);
         }

         char llIlIIIlIIllIIl = llIlIIIlIIlllII[llIlIIIlIIllIlI];
         llIlIIIlIIlllll.append((char)(llIlIIIlIIllIIl ^ llIlIIIlIIllllI[llIlIIIlIIlllIl % llIlIIIlIIllllI.length]));
         "".length();
         ++llIlIIIlIIlllIl;
         ++llIlIIIlIIllIlI;
         "".length();
      } while(" ".length() != (134 ^ 130));

      return null;
   }

   private ᶂ(String var3) {
      this.〥ҳⱆ = var3;
   }

   private static boolean lIlIIllIII(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIIlIllI() {
      lIIllIllI = new int[8];
      lIIllIllI[0] = "   ".length();
      lIIllIllI[1] = (152 ^ 162) & ~(20 ^ 46);
      lIIllIllI[2] = " ".length();
      lIIllIllI[3] = "  ".length();
      lIIllIllI[4] = 36 ^ 32;
      lIIllIllI[5] = 123 + 61 - 77 + 21 ^ 124 + 14 - 96 + 91;
      lIIllIllI[6] = 152 ^ 158;
      lIIllIllI[7] = 8 ^ 51 ^ 16 ^ 35;
   }

   private static void lIlIIIllll() {
      lIIllIIII = new String[lIIllIllI[6]];
      lIIllIIII[lIIllIllI[1]] = lIlIIIlIlI("DZNYpm2nLd8=", "chzuA");
      lIIllIIII[lIIllIllI[2]] = lIlIIIllIl("MA1xJwQ=", "xEKJi");
      lIIllIIII[lIIllIllI[3]] = lIlIIIlllI("5dz3Em3FHZServYw7UGWEg==", "lXgNo");
      lIIllIIII[lIIllIllI[0]] = lIlIIIllIl("PRBjGB5PKyo=", "uXYus");
      lIIllIIII[lIIllIllI[4]] = lIlIIIlIlI("qV0Fq29vxug=", "YpZoe");
      lIIllIIII[lIIllIllI[5]] = lIlIIIllIl("PDxoHAB0NQ==", "TTRqm");
   }

   private static String lIlIIIlIlI(String llIlIIIlIIIllll, String llIlIIIlIIlIIII) {
      try {
         float llIlIIIlIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double llIlIIIlIIIllII = Cipher.getInstance("Blowfish");
         llIlIIIlIIIllII.init(lIIllIllI[3], llIlIIIlIIIllIl);
         return new String(llIlIIIlIIIllII.doFinal(Base64.getDecoder().decode(llIlIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }
}
