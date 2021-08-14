package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003"},
   d2 = {"La/ⰺ;", "ⲋ", "ĂƂ", "u", "<init>", "(Ljava/lang/String;I)V", ""}
)
public enum ⰺ {
   private static void lIIIllIIllI() {
      lIIIIIIlll = new String[lIIIIIlIII[0]];
      lIIIIIIlll[lIIIIIlIII[1]] = lIIIllIIIll("PholMAwg", "rSkuM");
      lIIIIIIlll[lIIIIIlIII[2]] = lIIIllIIIll("CTs1JxMS", "ZvzhG");
      lIIIIIIlll[lIIIIIlIII[3]] = lIIIllIIlII("6fLuyWgz52jWP/ZVFUJ6ng==", "eCPgs");
   }

   static {
      lIIlIIlIlll();
      lIIIllIIllI();
      ⰺ[] var10001 = new ⰺ[lIIIIIlIII[0]];
      var10001[lIIIIIlIII[1]] = ⲋ = new ⰺ(lIIIIIIlll[lIIIIIlIII[1]], lIIIIIlIII[1]);
      var10001[lIIIIIlIII[2]] = ĂƂ = new ⰺ(lIIIIIIlll[lIIIIIlIII[2]], lIIIIIlIII[2]);
      var10001[lIIIIIlIII[3]] = u = new ⰺ(lIIIIIIlll[lIIIIIlIII[3]], lIIIIIlIII[3]);
   }

   private static void lIIlIIlIlll() {
      lIIIIIlIII = new int[4];
      lIIIIIlIII[0] = "   ".length();
      lIIIIIlIII[1] = (15 ^ 49) & ~(152 ^ 166);
      lIIIIIlIII[2] = " ".length();
      lIIIIIlIII[3] = "  ".length();
   }

   private ⰺ() {
   }

   private static boolean lIIlIIllIII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIIllIIlII(String lIlIlllIIlIlIlI, String lIlIlllIIlIlIIl) {
      try {
         SecretKeySpec lIlIlllIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String lIlIlllIIlIIlll = Cipher.getInstance("Blowfish");
         lIlIlllIIlIIlll.init(lIIIIIlIII[3], lIlIlllIIlIllll);
         return new String(lIlIlllIIlIIlll.doFinal(Base64.getDecoder().decode(lIlIlllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIIllIIIll(String lIlIlllIIIlIlll, String lIlIlllIIIlIllI) {
      lIlIlllIIIlIlll = new String(Base64.getDecoder().decode(lIlIlllIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lIlIlllIIIlIlIl = new StringBuilder();
      short lIlIlllIIIlIlII = lIlIlllIIIlIllI.toCharArray();
      long lIlIlllIIIlIIll = lIIIIIlIII[1];
      byte lIlIlllIIIlIIlI = lIlIlllIIIlIlll.toCharArray();
      long lIlIlllIIIlIIIl = lIlIlllIIIlIIlI.length;
      int lIlIlllIIIlIIII = lIIIIIlIII[1];

      do {
         if (!lIIlIIllIII(lIlIlllIIIlIIII, lIlIlllIIIlIIIl)) {
            return String.valueOf(lIlIlllIIIlIlIl);
         }

         char lIlIlllIIIlllIl = lIlIlllIIIlIIlI[lIlIlllIIIlIIII];
         lIlIlllIIIlIlIl.append((char)(lIlIlllIIIlllIl ^ lIlIlllIIIlIlII[lIlIlllIIIlIIll % lIlIlllIIIlIlII.length]));
         "".length();
         ++lIlIlllIIIlIIll;
         ++lIlIlllIIIlIIII;
         "".length();
      } while(-" ".length() >= -" ".length());

      return null;
   }
}
