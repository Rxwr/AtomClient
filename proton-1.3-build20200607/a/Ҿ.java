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
   d2 = {"La/Ҿ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
)
public enum Ҿ {
   private static boolean lIllIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIlIlIII(String llIlIIIIlIIllIl, String llIlIIIIlIIllII) {
      llIlIIIIlIIllIl = new String(Base64.getDecoder().decode(llIlIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception llIlIIIIlIIIllI = new StringBuilder();
      float llIlIIIIlIIIlIl = llIlIIIIlIIllII.toCharArray();
      int llIlIIIIlIIlIIl = lIlIIlIIl[1];
      Exception llIlIIIIlIIIIll = llIlIIIIlIIllIl.toCharArray();
      String llIlIIIIlIIIIlI = llIlIIIIlIIIIll.length;
      int llIlIIIIlIIIIIl = lIlIIlIIl[1];

      do {
         if (!lIllIIIIlI(llIlIIIIlIIIIIl, llIlIIIIlIIIIlI)) {
            return String.valueOf(llIlIIIIlIIIllI);
         }

         char llIlIIIIlIIlllI = llIlIIIIlIIIIll[llIlIIIIlIIIIIl];
         llIlIIIIlIIIllI.append((char)(llIlIIIIlIIlllI ^ llIlIIIIlIIIlIl[llIlIIIIlIIlIIl % llIlIIIIlIIIlIl.length]));
         "".length();
         ++llIlIIIIlIIlIIl;
         ++llIlIIIIlIIIIIl;
         "".length();
      } while((196 ^ 132 ^ 95 ^ 27) > 0);

      return null;
   }

   static {
      lIllIIIIII();
      lIlIlIlIIl();
      Ҿ[] var10001 = new Ҿ[lIlIIlIIl[0]];
      var10001[lIlIIlIIl[1]] = ⲋ = new Ҿ(lIlIIIIll[lIlIIlIIl[1]], lIlIIlIIl[1]);
      var10001[lIlIIlIIl[2]] = ĂƂ = new Ҿ(lIlIIIIll[lIlIIlIIl[2]], lIlIIlIIl[2]);
   }

   private static void lIllIIIIII() {
      lIlIIlIIl = new int[3];
      lIlIIlIIl[0] = "  ".length();
      lIlIIlIIl[1] = (69 ^ 104) & ~(96 ^ 77);
      lIlIIlIIl[2] = " ".length();
   }

   private Ҿ() {
   }

   private static String lIlIlIIlll(String llIlIIIIIlllIII, String llIlIIIIIllIlIl) {
      try {
         SecretKeySpec llIlIIIIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String llIlIIIIIllIIll = Cipher.getInstance("Blowfish");
         llIlIIIIIllIIll.init(lIlIIlIIl[0], llIlIIIIIlllIll);
         return new String(llIlIIIIIllIIll.doFinal(Base64.getDecoder().decode(llIlIIIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIlIlIIl() {
      lIlIIIIll = new String[lIlIIlIIl[0]];
      lIlIIIIll[lIlIIlIIl[1]] = lIlIlIIlll("rdSR2+Nc8wc=", "THzqq");
      lIlIIIIll[lIlIIlIIl[2]] = lIlIlIlIII("Ph0CAS8=", "mPCMc");
   }
}
