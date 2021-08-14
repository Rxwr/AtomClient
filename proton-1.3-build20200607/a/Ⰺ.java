package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0003B\u0007¢\u0006\u0004\b\u0001\u0010\u0002"},
   d2 = {"La/Ⰺ;", "<init>", "()V", "La/ⳅ;"}
)
public final class Ⰺ extends ⳅ {
   public Ⰺ() {
      super(lIlIIlIl[lIlIlIII[0]], lIlIIlIl[lIlIlIII[1]], ı５.〥ҳⱆ, lIlIlIII[0], (boolean)lIlIlIII[0], (boolean)lIlIlIII[0], lIlIlIII[2], (DefaultConstructorMarker)null);
   }

   private static boolean lIlllIIII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIllIIllI(String lllIIllIllllIll, String lllIIllIlllllll) {
      lllIIllIllllIll = new String(Base64.getDecoder().decode(lllIIllIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIIllIllllllI = new StringBuilder();
      boolean lllIIllIllllIII = lllIIllIlllllll.toCharArray();
      byte lllIIllIlllIlll = lIlIlIII[0];
      String lllIIllIlllIllI = lllIIllIllllIll.toCharArray();
      float lllIIllIlllIlIl = lllIIllIlllIllI.length;
      int lllIIllIlllIlII = lIlIlIII[0];

      do {
         if (!lIlllIIII(lllIIllIlllIlII, lllIIllIlllIlIl)) {
            return String.valueOf(lllIIllIllllllI);
         }

         Exception lllIIllIlllIIll = lllIIllIlllIllI[lllIIllIlllIlII];
         lllIIllIllllllI.append((char)(lllIIllIlllIIll ^ lllIIllIllllIII[lllIIllIlllIlll % lllIIllIllllIII.length]));
         "".length();
         ++lllIIllIlllIlll;
         ++lllIIllIlllIlII;
         "".length();
      } while(null == null);

      return null;
   }

   static {
      lIllIllll();
      lIllIlIII();
   }

   private static void lIllIlIII() {
      lIlIIlIl = new String[lIlIlIII[3]];
      lIlIIlIl[lIlIlIII[0]] = lIllIIllI("BSgYCQg/Lyoe", "KGOli");
      lIlIIlIl[lIlIlIII[1]] = lIllIIlll("J+gWmzaCeSIP5kcnwbFpR1ih7+hjdabynfZLbmGUjJg=", "knyYR");
   }

   private static void lIllIllll() {
      lIlIlIII = new int[4];
      lIlIlIII[0] = (18 ^ 93 ^ 111 ^ 39) & (146 + 139 - 176 + 59 ^ 115 + 109 - 100 + 51 ^ -" ".length());
      lIlIlIII[1] = " ".length();
      lIlIlIII[2] = 253 ^ 149 ^ 37 ^ 117;
      lIlIlIII[3] = "  ".length();
   }

   private static String lIllIIlll(String lllIIllIllIlIIl, String lllIIllIllIlIlI) {
      try {
         SecretKeySpec lllIIllIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllIIllIllIllIl = Cipher.getInstance("Blowfish");
         lllIIllIllIllIl.init(lIlIlIII[3], lllIIllIllIlllI);
         return new String(lllIIllIllIllIl.doFinal(Base64.getDecoder().decode(lllIIllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
