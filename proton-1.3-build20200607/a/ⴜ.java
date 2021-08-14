package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"La/ⴜ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class ⴜ extends Ἒⅾ {
   public void ⲋ(@NotNull Ἒⅾ.u var1) {
      Y.ĂƂ.ⲋ(lIIlIIIIll[lIIlIIIlII[0]]);
   }

   private static boolean lIIlllIIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIIlllIIlIl() {
      lIIlIIIlII = new int[6];
      lIIlIIIlII[0] = (123 ^ 50) & ~(107 ^ 34);
      lIIlIIIlII[1] = " ".length();
      lIIlIIIlII[2] = "  ".length();
      lIIlIIIlII[3] = 51 ^ 55;
      lIIlIIIlII[4] = "   ".length();
      lIIlIIIlII[5] = 99 ^ 107;
   }

   private static void lIIlllIIIll() {
      lIIlIIIIll = new String[lIIlIIIlII[4]];
      lIIlIIIIll[lIIlIIIlII[0]] = lIIlllIIIIl("AhY9LmQ=", "RySIE");
      lIIlIIIIll[lIIlIIIlII[1]] = lIIlllIIIlI("sXE6zClA3eU=", "QKupQ");
      lIIlIIIIll[lIIlIIIlII[2]] = lIIlllIIIIl("GhsnDCw+ST4XJypJOhdpLgEvDGc=", "MiNxI");
   }

   public ⴜ() {
      super(lIIlIIIIll[lIIlIIIlII[1]], lIIlIIIIll[lIIlIIIlII[2]], (List)null, lIIlIIIlII[3], (DefaultConstructorMarker)null);
   }

   private static String lIIlllIIIlI(String lIlIlIIIlIIIIlI, String lIlIlIIIlIIIIIl) {
      try {
         SecretKeySpec lIlIlIIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIlII[5]), "DES");
         Cipher lIlIlIIIlIIIlII = Cipher.getInstance("DES");
         lIlIlIIIlIIIlII.init(lIIlIIIlII[2], lIlIlIIIlIIIlIl);
         return new String(lIlIlIIIlIIIlII.doFinal(Base64.getDecoder().decode(lIlIlIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIIlllIIlIl();
      lIIlllIIIll();
   }

   private static String lIIlllIIIIl(String lIlIlIIIlIlIlll, String lIlIlIIIlIlIllI) {
      lIlIlIIIlIlIlll = new String(Base64.getDecoder().decode(lIlIlIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lIlIlIIIlIlIIII = new StringBuilder();
      char[] lIlIlIIIlIlIlII = lIlIlIIIlIlIllI.toCharArray();
      char lIlIlIIIlIIlllI = lIIlIIIlII[0];
      int lIlIlIIIlIIllIl = lIlIlIIIlIlIlll.toCharArray();
      int lIlIlIIIlIIllII = lIlIlIIIlIIllIl.length;
      int lIlIlIIIlIIlIll = lIIlIIIlII[0];

      do {
         if (!lIIlllIIllI(lIlIlIIIlIIlIll, lIlIlIIIlIIllII)) {
            return String.valueOf(lIlIlIIIlIlIIII);
         }

         char lIlIlIIIlIllIII = lIlIlIIIlIIllIl[lIlIlIIIlIIlIll];
         lIlIlIIIlIlIIII.append((char)(lIlIlIIIlIllIII ^ lIlIlIIIlIlIlII[lIlIlIIIlIIlllI % lIlIlIIIlIlIlII.length]));
         "".length();
         ++lIlIlIIIlIIlllI;
         ++lIlIlIIIlIIlIll;
         "".length();
      } while(((154 ^ 129) & ~(115 ^ 104)) < " ".length());

      return null;
   }
}
