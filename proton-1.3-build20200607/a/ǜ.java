package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0003J\u000f\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0002\u0010\u0003"},
   d2 = {"La/ǜ;", "", "Ἠ", "()V", "<init>", "La/ⳅ;"}
)
public final class ǜ extends ⳅ {
   private static boolean lIlIlIlIllI(int var0, int var1) {
      return var0 < var1;
   }

   public ǜ() {
      super(lIIllllIlI[lIlIIIIIII[1]], lIIllllIlI[lIlIIIIIII[0]], ı５.ᴃᎲ, lIlIIIIIII[1], (boolean)lIlIIIIIII[1], (boolean)lIlIIIIIII[1], lIlIIIIIII[2], (DefaultConstructorMarker)null);
   }

   private static String lIlIlIlIIIl(String lIIlllIlIllIllI, String lIIlllIlIlllIlI) {
      lIIlllIlIllIllI = new String(Base64.getDecoder().decode(lIIlllIlIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIIlllIlIlllIIl = new StringBuilder();
      char[] lIIlllIlIlllIII = lIIlllIlIlllIlI.toCharArray();
      byte lIIlllIlIllIIlI = lIlIIIIIII[1];
      long lIIlllIlIllIIIl = lIIlllIlIllIllI.toCharArray();
      char lIIlllIlIllIIII = lIIlllIlIllIIIl.length;
      int lIIlllIlIlIllll = lIlIIIIIII[1];

      do {
         if (!lIlIlIlIllI(lIIlllIlIlIllll, lIIlllIlIllIIII)) {
            return String.valueOf(lIIlllIlIlllIIl);
         }

         char lIIlllIlIllllII = lIIlllIlIllIIIl[lIIlllIlIlIllll];
         lIIlllIlIlllIIl.append((char)(lIIlllIlIllllII ^ lIIlllIlIlllIII[lIIlllIlIllIIlI % lIIlllIlIlllIII.length]));
         "".length();
         ++lIIlllIlIllIIlI;
         ++lIIlllIlIlIllll;
         "".length();
      } while(" ".length() > 0);

      return null;
   }

   private static String lIlIlIlIIlI(String lIIlllIlIlIIllI, String lIIlllIlIlIIIll) {
      try {
         SecretKeySpec lIIlllIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), lIlIIIIIII[4]), "DES");
         int lIIlllIlIlIIIIl = Cipher.getInstance("DES");
         lIIlllIlIlIIIIl.init(lIlIIIIIII[3], lIIlllIlIlIlIIl);
         return new String(lIIlllIlIlIIIIl.doFinal(Base64.getDecoder().decode(lIIlllIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIlIlIlIlIl();
      lIlIlIlIIll();
   }

   public void Ἠ() {
      this.ɡ().field_71439_g.func_70031_b((boolean)lIlIIIIIII[0]);
   }

   private static void lIlIlIlIlIl() {
      lIlIIIIIII = new int[5];
      lIlIIIIIII[0] = " ".length();
      lIlIIIIIII[1] = (17 ^ 58) & ~(72 ^ 99);
      lIlIIIIIII[2] = 90 + 104 - 75 + 62 ^ 14 + 66 - -57 + 4;
      lIlIIIIIII[3] = "  ".length();
      lIlIIIIIII[4] = 107 ^ 75 ^ 108 ^ 68;
   }

   private static void lIlIlIlIIll() {
      lIIllllIlI = new String[lIlIIIIIII[3]];
      lIIllllIlI[lIlIIIIIII[1]] = lIlIlIlIIIl("ERYLDDQ2", "BfyeZ");
      lIIllllIlI[lIlIIIIIII[0]] = lIlIlIlIIlI("Im9wGtQ8t5m+TmhWGi0japCbrqIwRTklW4fAS6s7pHA=", "PIJQn");
   }
}
