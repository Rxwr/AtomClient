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
   d2 = {"La/Ⴝ;", "ⲋ", "ĂƂ", "u", "<init>", "(Ljava/lang/String;I)V", ""}
)
public enum Ⴝ {
   private static void llllllllll() {
      lllIlIllI = new String[lllIllIlI[0]];
      lllIlIllI[lllIllIlI[1]] = lllllllIIl("IKlUkQ4CQWk=", "yjqKE");
      lllIlIllI[lllIllIlI[2]] = lllllllIIl("jr9EcjvsVUM=", "OlxLQ");
      lllIlIllI[lllIllIlI[3]] = lllllllIIl("MEwV6DB5yTE=", "foAlS");
   }

   private static String lllllllIIl(String lIlllIIlIlllIlI, String lIlllIIlIllIlll) {
      try {
         SecretKeySpec lIlllIIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIlIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIlllIIlIllllII = Cipher.getInstance("Blowfish");
         lIlllIIlIllllII.init(lllIllIlI[3], lIlllIIlIllllIl);
         return new String(lIlllIIlIllllII.doFinal(Base64.getDecoder().decode(lIlllIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIIIIIIIII() {
      lllIllIlI = new int[4];
      lllIllIlI[0] = "   ".length();
      lllIllIlI[1] = (171 ^ 129) & ~(95 ^ 117);
      lllIllIlI[2] = " ".length();
      lllIllIlI[3] = "  ".length();
   }

   static {
      lIIIIIIIIII();
      llllllllll();
      Ⴝ[] var10001 = new Ⴝ[lllIllIlI[0]];
      var10001[lllIllIlI[1]] = ⲋ = new Ⴝ(lllIlIllI[lllIllIlI[1]], lllIllIlI[1]);
      var10001[lllIllIlI[2]] = ĂƂ = new Ⴝ(lllIlIllI[lllIllIlI[2]], lllIllIlI[2]);
      var10001[lllIllIlI[3]] = u = new Ⴝ(lllIlIllI[lllIllIlI[3]], lllIllIlI[3]);
   }

   private Ⴝ() {
   }
}
