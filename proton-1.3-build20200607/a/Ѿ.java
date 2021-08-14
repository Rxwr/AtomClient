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
   d2 = {"La/Ѿ;", "ⲋ", "ĂƂ", "u", "<init>", "(Ljava/lang/String;I)V", ""}
)
public enum Ѿ {
   private Ѿ() {
   }

   private static boolean lIIIlIlII(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIIIlIIll();
      lIIIlIIlI();
      Ѿ[] var10001 = new Ѿ[lllllII[0]];
      var10001[lllllII[1]] = ⲋ = new Ѿ(llllIll[lllllII[1]], lllllII[1]);
      var10001[lllllII[2]] = ĂƂ = new Ѿ(llllIll[lllllII[2]], lllllII[2]);
      var10001[lllllII[3]] = u = new Ѿ(llllIll[lllllII[3]], lllllII[3]);
   }

   private static String lIIIlIIIl(String lllIllIIlIlIIlI, String lllIllIIlIIllll) {
      try {
         boolean lllIllIIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte lllIllIIlIIllIl = Cipher.getInstance("Blowfish");
         lllIllIIlIIllIl.init(lllllII[3], lllIllIIlIIlllI);
         return new String(lllIllIIlIIllIl.doFinal(Base64.getDecoder().decode(lllIllIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIIlIIll() {
      lllllII = new int[4];
      lllllII[0] = "   ".length();
      lllllII[1] = (88 + 120 - 120 + 50 ^ 107 + 100 - 102 + 23) & ("  ".length() ^ 133 ^ 141 ^ -" ".length());
      lllllII[2] = " ".length();
      lllllII[3] = "  ".length();
   }

   private static String lIIIlIIII(String lllIllIIlIIIIlI, String lllIllIIlIIIIIl) {
      lllIllIIlIIIIlI = new String(Base64.getDecoder().decode(lllIllIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String lllIllIIIlllIll = new StringBuilder();
      char[] lllIllIIIllllll = lllIllIIlIIIIIl.toCharArray();
      int lllIllIIIlllllI = lllllII[1];
      int lllIllIIIlllIII = lllIllIIlIIIIlI.toCharArray();
      int lllIllIIIllIlll = lllIllIIIlllIII.length;
      int lllIllIIIllIllI = lllllII[1];

      do {
         if (!lIIIlIlII(lllIllIIIllIllI, lllIllIIIllIlll)) {
            return String.valueOf(lllIllIIIlllIll);
         }

         short lllIllIIIllIlIl = lllIllIIIlllIII[lllIllIIIllIllI];
         lllIllIIIlllIll.append((char)(lllIllIIIllIlIl ^ lllIllIIIllllll[lllIllIIIlllllI % lllIllIIIllllll.length]));
         "".length();
         ++lllIllIIIlllllI;
         ++lllIllIIIllIllI;
         "".length();
      } while(-"  ".length() <= 0);

      return null;
   }

   private static void lIIIlIIlI() {
      llllIll = new String[lllllII[0]];
      llllIll[lllllII[1]] = lIIIlIIII("GycI", "KuMjp");
      llllIll[lllllII[2]] = lIIIlIIIl("joOS8YNWj4s=", "CWWTT");
      llllIll[lllllII[3]] = lIIIlIIII("Kw0kDQ==", "eBjHZ");
   }
}
