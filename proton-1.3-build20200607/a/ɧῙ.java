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
   d2 = {"La/ɧῙ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class ɧῙ extends Ἒⅾ {
   private static void lIIlIIIllll() {
      lIIIIlIlll = new int[7];
      lIIIIlIlll[0] = " ".length();
      lIIIIlIlll[1] = (179 ^ 163 ^ 54 ^ 33) & (48 ^ 123 ^ 75 ^ 7 ^ -" ".length()) & ((28 + 45 - -15 + 44 ^ 51 + 123 - 10 + 23) & (67 + 87 - 10 + 22 ^ 149 + 137 - 283 + 150 ^ -" ".length()) ^ -" ".length());
      lIIIIlIlll[2] = "  ".length();
      lIIIIlIlll[3] = "   ".length();
      lIIIIlIlll[4] = 31 ^ 27;
      lIIIIlIlll[5] = 128 ^ 133;
      lIIIIlIlll[6] = 137 ^ 163 ^ 21 ^ 55;
   }

   private static String lIIlIIIlIIl(String lIlIllllIIlIIlI, String lIlIllllIIlIIIl) {
      try {
         long lIlIllllIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String lIlIllllIIIllll = Cipher.getInstance("Blowfish");
         lIlIllllIIIllll.init(lIIIIlIlll[2], lIlIllllIIlIIII);
         return new String(lIlIllllIIIllll.doFinal(Base64.getDecoder().decode(lIlIllllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void ⲋ(@NotNull Ἒⅾ.u lIlIllllIIllllI) {
      if (lIIlIIlIIII(lIlIllllIIllllI.ⲋ(), lIIIIlIlll[0])) {
         Y.ĂƂ.ⲋ(lIIIIlIlII[lIIIIlIlll[1]]);
      } else {
         byte lIlIllllIIlllIl = lIlIllllIIllllI.ⲋ(lIIIIlIlll[1]).Ἒⅾ();
         double lIlIllllIIlllII = ơ߀.ⲋ.ĂƂ(lIlIllllIIllllI.ⲋ(lIIIIlIlll[1]).Ἒⅾ());
         if (lIIlIIlIIIl(lIlIllllIIlllII)) {
            Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIIlIlII[lIIIIlIlll[0]]).append(lIlIllllIIlllIl)));
         } else {
            lIlIllllIIlllII.ĂƂ(lIIIIlIlll[1]);
            Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIlIllllIIlllII.ȵ()).append(lIIIIlIlII[lIIIIlIlll[2]])));
         }
      }
   }

   private static String lIIlIIIlIII(String lIlIllllIIIIlIl, String lIlIllllIIIIlII) {
      try {
         SecretKeySpec lIlIllllIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllllIIIIlII.getBytes(StandardCharsets.UTF_8)), lIIIIlIlll[6]), "DES");
         Cipher lIlIllllIIIlIIl = Cipher.getInstance("DES");
         lIlIllllIIIlIIl.init(lIIIIlIlll[2], lIlIllllIIIlIlI);
         return new String(lIlIllllIIIlIIl.doFinal(Base64.getDecoder().decode(lIlIllllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIIlIIIllll();
      lIIlIIIllII();
   }

   public ɧῙ() {
      super(lIIIIlIlII[lIIIIlIlll[3]], lIIIIlIlII[lIIIIlIlll[4]], (List)null, lIIIIlIlll[4], (DefaultConstructorMarker)null);
   }

   private static void lIIlIIIllII() {
      lIIIIlIlII = new String[lIIIIlIlll[5]];
      lIIIIlIlII[lIIIIlIlll[1]] = lIIlIIIlIII("QdsUqCfNNSwAUA/tNgyzR9v4+pVh3DBr", "cQfrr");
      lIIIIlIlII[lIIIIlIlll[0]] = lIIlIIIlIIl("9xbD4LINyhWuNbEVzxrZYWeLB+nhM2Kx", "sQmiB");
      lIIIIlIlII[lIIIIlIlll[2]] = lIIlIIIlIII("FM26W9ZnF3NXkb9nk8QvTg==", "elSlF");
      lIIIIlIlII[lIIIIlIlll[3]] = lIIlIIIlIII("CcTogeBSAOc=", "WTuGv");
      lIIIIlIlII[lIIIIlIlll[4]] = lIIlIIIlIII("XTR9ke3Du1auf5ig5efSktLDzEZMP+Jz", "aSTRi");
   }

   private static boolean lIIlIIlIIII(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIIlIIlIIIl(Object var0) {
      return var0 == null;
   }
}
