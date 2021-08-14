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
   d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
   d2 = {"La/л;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
)
public enum л {
   private л() {
   }

   private static boolean lIlIIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIllllllI(String llIlIIllIIIlllI, String llIlIIllIIIlIll) {
      try {
         float llIlIIllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean llIlIIllIIIlIIl = Cipher.getInstance("Blowfish");
         llIlIIllIIIlIIl.init(lIIlIllII[0], llIlIIllIIIlIlI);
         return new String(llIlIIllIIIlIIl.doFinal(Base64.getDecoder().decode(llIlIIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIlIIIIIIl();
      lIIlllllll();
      л[] var10001 = new л[lIIlIllII[0]];
      var10001[lIIlIllII[1]] = ⲋ = new л(lIIlIlIlI[lIIlIllII[1]], lIIlIllII[1]);
      var10001[lIIlIllII[2]] = ĂƂ = new л(lIIlIlIlI[lIIlIllII[2]], lIIlIllII[2]);
   }

   private static void lIIlllllll() {
      lIIlIlIlI = new String[lIIlIllII[0]];
      lIIlIlIlI[lIIlIllII[1]] = lIIlllllIl("ADcfEDEVMwE=", "VrMDx");
      lIIlIlIlI[lIIlIllII[2]] = lIIllllllI("5mFpupYdF0OADdQedhLOzw==", "sRKya");
   }

   private static String lIIlllllIl(String llIlIIllIlIIIll, String llIlIIllIIlllIl) {
      llIlIIllIlIIIll = new String(Base64.getDecoder().decode(llIlIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIlIIllIlIIIIl = new StringBuilder();
      short llIlIIllIIllIll = llIlIIllIIlllIl.toCharArray();
      int llIlIIllIIlllll = lIIlIllII[1];
      short llIlIIllIIllIIl = llIlIIllIlIIIll.toCharArray();
      Exception llIlIIllIIllIII = llIlIIllIIllIIl.length;
      int llIlIIllIIlIlll = lIIlIllII[1];

      do {
         if (!lIlIIIIIlI(llIlIIllIIlIlll, llIlIIllIIllIII)) {
            return String.valueOf(llIlIIllIlIIIIl);
         }

         boolean llIlIIllIIlIllI = llIlIIllIIllIIl[llIlIIllIIlIlll];
         llIlIIllIlIIIIl.append((char)(llIlIIllIIlIllI ^ llIlIIllIIllIll[llIlIIllIIlllll % llIlIIllIIllIll.length]));
         "".length();
         ++llIlIIllIIlllll;
         ++llIlIIllIIlIlll;
         "".length();
      } while("  ".length() > " ".length());

      return null;
   }

   private static void lIlIIIIIIl() {
      lIIlIllII = new int[3];
      lIIlIllII[0] = "  ".length();
      lIIlIllII[1] = (97 ^ 15 ^ 76 ^ 111) & (86 ^ 30 ^ 68 ^ 65 ^ -" ".length());
      lIIlIllII[2] = " ".length();
   }
}
