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
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
   d2 = {"La/U;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
)
public enum U {
   private static String lIlllllIl(String lllIIllIIIIlllI, String lllIIllIIIIlIll) {
      try {
         SecretKeySpec lllIIllIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte lllIIllIIIIlIIl = Cipher.getInstance("Blowfish");
         lllIIllIIIIlIIl.init(lIllIlII[0], lllIIllIIIlIIIl);
         return new String(lllIIllIIIIlIIl.doFinal(Base64.getDecoder().decode(lllIIllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlllllll() {
      lIllIIIl = new String[lIllIlII[0]];
      lIllIIIl[lIllIlII[1]] = lIlllllIl("D0sLJhuQkbGoTEknuwHH9A==", "ohYjG");
      lIllIIIl[lIllIlII[2]] = lIllllllI("6E79JoX9dZk=", "FqOOo");
   }

   private U() {
   }

   private static void llIIIIlll() {
      lIllIlII = new int[4];
      lIllIlII[0] = "  ".length();
      lIllIlII[1] = (58 ^ 112) & ~(110 ^ 36);
      lIllIlII[2] = " ".length();
      lIllIlII[3] = 166 ^ 174;
   }

   static {
      llIIIIlll();
      lIlllllll();
      U[] var10001 = new U[lIllIlII[0]];
      var10001[lIllIlII[1]] = ⲋ = new U(lIllIIIl[lIllIlII[1]], lIllIlII[1]);
      var10001[lIllIlII[2]] = ĂƂ = new U(lIllIIIl[lIllIlII[2]], lIllIlII[2]);
   }

   private static String lIllllllI(String lllIIllIIIllIll, String lllIIllIIIllIII) {
      try {
         double lllIIllIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIIIllIII.getBytes(StandardCharsets.UTF_8)), lIllIlII[3]), "DES");
         long lllIIllIIIlIllI = Cipher.getInstance("DES");
         lllIIllIIIlIllI.init(lIllIlII[0], lllIIllIIIlIlll);
         return new String(lllIIllIIIlIllI.doFinal(Base64.getDecoder().decode(lllIIllIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }
}
