package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.text.Regex;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0001\u001a\u00020\u00008\u0007@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0086\u0004\"\u001d\u0010\u0005\u001a\u00020\u00008\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0002\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0086\u0004\"\u001d\u0010\u0004\u001a\u00020\u00008\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0086\u0004"},
   d2 = {"Lkotlin/text/Regex;", "ⲋ", "Lkotlin/text/Regex;", "()Lkotlin/text/Regex;", "u", "ĂƂ"}
)
public final class ấ {
   private static String llllllIIII(String lIlllIIllIlIIll, String lIlllIIllIIllIl) {
      lIlllIIllIlIIll = new String(Base64.getDecoder().decode(lIlllIIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlllIIllIlIIIl = new StringBuilder();
      char[] lIlllIIllIlIIII = lIlllIIllIIllIl.toCharArray();
      int lIlllIIllIIllll = lllIlIlIl[0];
      boolean lIlllIIllIIlIIl = lIlllIIllIlIIll.toCharArray();
      Exception lIlllIIllIIlIII = lIlllIIllIIlIIl.length;
      int lIlllIIllIIIlll = lllIlIlIl[0];

      do {
         if (!lllllllIII(lIlllIIllIIIlll, lIlllIIllIIlIII)) {
            return String.valueOf(lIlllIIllIlIIIl);
         }

         char lIlllIIllIlIlII = lIlllIIllIIlIIl[lIlllIIllIIIlll];
         lIlllIIllIlIIIl.append((char)(lIlllIIllIlIlII ^ lIlllIIllIlIIII[lIlllIIllIIllll % lIlllIIllIlIIII.length]));
         "".length();
         ++lIlllIIllIIllll;
         ++lIlllIIllIIIlll;
         "".length();
      } while(((166 ^ 171) & ~(74 ^ 71)) == 0);

      return null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public static final Regex ⲋ() {
      return ⲋ;
   }

   private static void llllllIIIl() {
      lllIlIIll = new String[lllIlIlIl[3]];
      lllIlIIll[lllIlIlIl[0]] = lllllIllll("zTtkIY12w0gbu96LKZanCy4WsoJ32/vn", "fzGFo");
      lllIlIIll[lllIlIlIl[1]] = lllllIllll("CwTmRqTjgdUoxsr7lypMjg==", "MInwp");
      lllIlIIll[lllIlIlIl[2]] = llllllIIII("CmMFdBpuFD1y", "QHYYG");
   }

   private static boolean lllllllIII(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public static final Regex ĂƂ() {
      return ĂƂ;
   }

   private static String lllllIllll(String lIlllIIlllIIIll, String lIlllIIlllIIIII) {
      try {
         SecretKeySpec lIlllIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIlllIIlllIIlIl = Cipher.getInstance("Blowfish");
         lIlllIIlllIIlIl.init(lllIlIlIl[2], lIlllIIlllIIllI);
         return new String(lIlllIIlllIIlIl.doFinal(Base64.getDecoder().decode(lIlllIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   static {
      llllllIlll();
      llllllIIIl();
      String var0 = lllIlIIll[lllIlIlIl[0]];
      int var1 = lllIlIlIl[0];
      ⲋ = new Regex(var0);
      var0 = lllIlIIll[lllIlIlIl[1]];
      var1 = lllIlIlIl[0];
      ĂƂ = new Regex(var0);
      var0 = lllIlIIll[lllIlIlIl[2]];
      var1 = lllIlIlIl[0];
      u = new Regex(var0);
   }

   private static void llllllIlll() {
      lllIlIlIl = new int[4];
      lllIlIlIl[0] = (63 ^ 48) & ~(99 ^ 108);
      lllIlIlIl[1] = " ".length();
      lllIlIlIl[2] = "  ".length();
      lllIlIlIl[3] = "   ".length();
   }

   @JvmName(
      name = "u"
   )
   public static final Regex u() {
      return u;
   }
}
