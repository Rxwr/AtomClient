package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\tB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0006"},
   d2 = {"La/ᾞ;", "", "p0", "", "ⲋ", "(Ljava/lang/String;)I", "(I)Ljava/lang/String;", "<init>", "()V", ""}
)
public final class ᾞ {
   private static boolean lIlIIllII(int var0) {
      return var0 != 0;
   }

   private static void lIlIIlIII() {
      lIIlIIIl = new String[lIIlIlII[3]];
      lIIlIIIl[lIIlIlII[0]] = lIlIIIllI("FzYwOyM=", "Zyehf");
      lIIlIIIl[lIIlIlII[1]] = lIlIIIllI("Ly4GAxI=", "baSPW");
      lIIlIIIl[lIIlIlII[2]] = lIlIIIlll("8cwD6WFeOhU=", "rDagH");
   }

   private static boolean lIlIIllIl(int var0, int var1) {
      return var0 < var1;
   }

   public final int ⲋ(@NotNull String lllIlIIIllIlIll) {
      int var10000;
      if (lIlIIllII(StringsKt.startsWith$default(lllIlIIIllIlIll, lIIlIIIl[lIIlIlII[1]], (boolean)lIIlIlII[0], lIIlIlII[2], (Object)null))) {
         String var2 = StringsKt.removePrefix(lllIlIIIllIlIll, (CharSequence)lIIlIIIl[lIIlIlII[2]]);
         int var3 = lIIlIlII[0];
         var10000 = -Integer.parseInt(var2);
         "".length();
         if (null != null) {
            return (236 ^ 142) & ~(161 ^ 195);
         }
      } else {
         var10000 = Keyboard.getKeyIndex(lllIlIIIllIlIll);
      }

      return var10000;
   }

   private static boolean lIlIIlIll(int var0) {
      return var0 >= 0;
   }

   private static String lIlIIIlll(String lllIlIIIllIIIIl, String lllIlIIIlIllllI) {
      try {
         SecretKeySpec lllIlIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIlIllllI.getBytes(StandardCharsets.UTF_8)), lIIlIlII[4]), "DES");
         int lllIlIIIlIlllII = Cipher.getInstance("DES");
         lllIlIIIlIlllII.init(lIIlIlII[2], lllIlIIIllIIlII);
         return new String(lllIlIIIlIlllII.doFinal(Base64.getDecoder().decode(lllIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIlIIlIlI();
      lIlIIlIII();
      ᾞ var0 = new ᾞ();
      ⲋ = var0;
   }

   private static void lIlIIlIlI() {
      lIIlIlII = new int[5];
      lIIlIlII[0] = (165 + 24 - -26 + 16 ^ 76 + 56 - 123 + 123) & (86 ^ 117 ^ 44 ^ 108 ^ -" ".length());
      lIIlIlII[1] = " ".length();
      lIIlIlII[2] = "  ".length();
      lIIlIlII[3] = "   ".length();
      lIIlIlII[4] = 30 ^ 5 ^ 185 ^ 170;
   }

   private ᾞ() {
   }

   @NotNull
   public final String ⲋ(int lllIlIIIlllIIII) {
      String var10000;
      if (lIlIIlIll(lllIlIIIlllIIII)) {
         var10000 = Keyboard.getKeyName(lllIlIIIlllIIII);
         "".length();
         if (((81 ^ 106) & ~(110 ^ 85)) != 0) {
            return null;
         }
      } else {
         char lllIlIIIllIllll = -lllIlIIIlllIIII;
         var10000 = String.valueOf((new StringBuilder()).append(lIIlIIIl[lIIlIlII[0]]).append(lllIlIIIllIllll));
      }

      return var10000;
   }

   private static String lIlIIIllI(String lllIlIIIlIlIIIl, String lllIlIIIlIIlIll) {
      lllIlIIIlIlIIIl = new String(Base64.getDecoder().decode(lllIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIlIIIlIIllll = new StringBuilder();
      double lllIlIIIlIIlIIl = lllIlIIIlIIlIll.toCharArray();
      int lllIlIIIlIIllIl = lIIlIlII[0];
      Exception lllIlIIIlIIIlll = lllIlIIIlIlIIIl.toCharArray();
      int lllIlIIIlIIIllI = lllIlIIIlIIIlll.length;
      int lllIlIIIlIIIlIl = lIIlIlII[0];

      do {
         if (!lIlIIllIl(lllIlIIIlIIIlIl, lllIlIIIlIIIllI)) {
            return String.valueOf(lllIlIIIlIIllll);
         }

         char lllIlIIIlIlIIlI = lllIlIIIlIIIlll[lllIlIIIlIIIlIl];
         lllIlIIIlIIllll.append((char)(lllIlIIIlIlIIlI ^ lllIlIIIlIIlIIl[lllIlIIIlIIllIl % lllIlIIIlIIlIIl.length]));
         "".length();
         ++lllIlIIIlIIllIl;
         ++lllIlIIIlIIIlIl;
         "".length();
      } while("   ".length() != "  ".length());

      return null;
   }
}
