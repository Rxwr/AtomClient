package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"},
   d2 = {"", "p0", "Ljava/util/UUID;", "ⲋ", "(Ljava/lang/String;)Ljava/util/UUID;"}
)
public final class ὸ {
   static {
      llllllll();
      lllllllI();
   }

   private static void llllllll() {
      lllIIIl = new int[9];
      lllIIIl[0] = (99 ^ 3) & ~(240 ^ 144);
      lllIIIl[1] = " ".length();
      lllIIIl[2] = "  ".length();
      lllIIIl[3] = "   ".length();
      lllIIIl[4] = 147 ^ 151;
      lllIIIl[5] = 82 ^ 87;
      lllIIIl[6] = 40 ^ 29;
      lllIIIl[7] = 228 ^ 156 ^ 31 ^ 97;
      lllIIIl[8] = 36 ^ 81 ^ 247 ^ 138;
   }

   private static boolean lIIIIIIII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lllllIll(String lllIllIllIlIIIl, String lllIllIllIIlIll) {
      lllIllIllIlIIIl = new String(Base64.getDecoder().decode(lllIllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean lllIllIllIIlIlI = new StringBuilder();
      char[] lllIllIllIIlllI = lllIllIllIIlIll.toCharArray();
      short lllIllIllIIlIII = lllIIIl[0];
      Exception lllIllIllIIIlll = lllIllIllIlIIIl.toCharArray();
      byte lllIllIllIIIllI = lllIllIllIIIlll.length;
      int lllIllIllIIIlIl = lllIIIl[0];

      do {
         if (!lIIIIIIII(lllIllIllIIIlIl, lllIllIllIIIllI)) {
            return String.valueOf(lllIllIllIIlIlI);
         }

         char lllIllIllIlIIlI = lllIllIllIIIlll[lllIllIllIIIlIl];
         lllIllIllIIlIlI.append((char)(lllIllIllIlIIlI ^ lllIllIllIIlllI[lllIllIllIIlIII % lllIllIllIIlllI.length]));
         "".length();
         ++lllIllIllIIlIII;
         ++lllIllIllIIIlIl;
         "".length();
      } while(((175 + 163 - 242 + 109 ^ 35 + 54 - -16 + 48) & (183 + 40 - 44 + 66 ^ 54 + 41 - 86 + 152 ^ -" ".length())) <= (7 + 65 - 12 + 75 ^ 17 + 54 - 13 + 73));

      return null;
   }

   private static String llllllII(String lllIllIllIlllll, String lllIllIlllIIIII) {
      try {
         byte lllIllIllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIlllIIIII.getBytes(StandardCharsets.UTF_8)), lllIIIl[8]), "DES");
         Cipher lllIllIlllIIIll = Cipher.getInstance("DES");
         lllIllIlllIIIll.init(lllIIIl[2], lllIllIllIlllIl);
         return new String(lllIllIlllIIIll.doFinal(Base64.getDecoder().decode(lllIllIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String llllllIl(String lllIllIlllIlllI, String lllIllIlllIllIl) {
      try {
         boolean lllIllIlllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short lllIllIlllIlIIl = Cipher.getInstance("Blowfish");
         lllIllIlllIlIIl.init(lllIIIl[2], lllIllIlllIlIlI);
         return new String(lllIllIlllIlIIl.doFinal(Base64.getDecoder().decode(lllIllIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @NotNull
   public static final UUID ⲋ(@NotNull String var0) {
      String var1 = llIlllI[lllIIIl[0]];
      Pattern var2 = Pattern.compile(llIlllI[lllIIIl[1]]);
      String var3 = var2.matcher((CharSequence)var0).replaceAll(String.valueOf((new StringBuilder()).append(var1).append(llIlllI[lllIIIl[2]]).append(var1).append(llIlllI[lllIIIl[3]]).append(var1).append(llIlllI[lllIIIl[4]]).append(var1).append(llIlllI[lllIIIl[5]]).append(var1).append((char)lllIIIl[6])));
      return UUID.fromString(var3);
   }

   private static void lllllllI() {
      llIlllI = new String[lllIIIl[7]];
      llIlllI[lllIIIl[0]] = lllllIll("Ug==", "vuQtc");
      llIlllI[lllIIIl[1]] = llllllII("K/7FC7JuTlQXoocqEuAMLRgjwL8/RAK9fVbhdjlcDYOxrCQdHAhp9w==", "keYja");
      llIlllI[lllIIIl[2]] = llllllIl("x2wblBkbxXw=", "JsAkB");
      llIlllI[lllIIIl[3]] = llllllIl("m7muv2mPahE=", "DSKlB");
      llIlllI[lllIIIl[4]] = lllllIll("a18=", "Xrims");
      llIlllI[lllIIIl[5]] = lllllIll("THg=", "xUGwe");
   }
}
