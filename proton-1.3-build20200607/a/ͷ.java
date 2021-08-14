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
   d2 = {"La/ͷ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class ͷ extends Ἒⅾ {
   private static String lIIIlllllI(String llIlIlllIllllll, String llIlIlllIllllII) {
      try {
         Exception llIlIlllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlllIllllII.getBytes(StandardCharsets.UTF_8)), lIIIIllIl[5]), "DES");
         Cipher llIlIllllIIIIIl = Cipher.getInstance("DES");
         llIlIllllIIIIIl.init(lIIIIllIl[2], llIlIlllIlllIll);
         return new String(llIlIllllIIIIIl.doFinal(Base64.getDecoder().decode(llIlIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlIIIIIl(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIIlIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   public ͷ() {
      super(lIIIIllII[lIIIIllIl[2]], lIIIIllII[lIIIIllIl[3]], (List)null, lIIIIllIl[4], (DefaultConstructorMarker)null);
   }

   private static String lIIIlllIlI(String llIlIlllIlIllll, String llIlIlllIlIlllI) {
      llIlIlllIlIllll = new String(Base64.getDecoder().decode(llIlIlllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      short llIlIlllIlIlIII = new StringBuilder();
      char[] llIlIlllIlIllII = llIlIlllIlIlllI.toCharArray();
      int llIlIlllIlIIllI = lIIIIllIl[1];
      String llIlIlllIlIIlIl = llIlIlllIlIllll.toCharArray();
      boolean llIlIlllIlIIlII = llIlIlllIlIIlIl.length;
      int llIlIlllIlIIIll = lIIIIllIl[1];

      do {
         if (!lIIlIIIIlI(llIlIlllIlIIIll, llIlIlllIlIIlII)) {
            return String.valueOf(llIlIlllIlIlIII);
         }

         float llIlIlllIlIIIlI = llIlIlllIlIIlIl[llIlIlllIlIIIll];
         llIlIlllIlIlIII.append((char)(llIlIlllIlIIIlI ^ llIlIlllIlIllII[llIlIlllIlIIllI % llIlIlllIlIllII.length]));
         "".length();
         ++llIlIlllIlIIllI;
         ++llIlIlllIlIIIll;
         "".length();
      } while(" ".length() != 0);

      return null;
   }

   public void ⲋ(@NotNull Ἒⅾ.u var1) {
      if (lIIlIIIIIl(var1.ⲋ(), lIIIIllIl[0])) {
         Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIIllII[lIIIIllIl[1]]).append(ϛⰄ.ⲋ.u())));
      } else {
         String var2 = var1.ⲋ(lIIIIllIl[1]).ϛⰄ();
         ϛⰄ.ⲋ.ⲋ(var2);
         Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIIllII[lIIIIllIl[0]]).append(var2)));
      }
   }

   private static void lIIlIIIIII() {
      lIIIIllIl = new int[6];
      lIIIIllIl[0] = " ".length();
      lIIIIllIl[1] = (47 ^ 122) & ~(109 ^ 56);
      lIIIIllIl[2] = "  ".length();
      lIIIIllIl[3] = "   ".length();
      lIIIIllIl[4] = 64 ^ 68;
      lIIIIllIl[5] = 115 ^ 123;
   }

   private static void lIIIllllll() {
      lIIIIllII = new String[lIIIIllIl[4]];
      lIIIIllII[lIIIIllIl[1]] = lIIIlllIlI("HSQDZzk8PhQiND1sFjU/LyUeZzM6bEAh", "ILfGZ");
      lIIIIllII[lIIIIllIl[0]] = lIIIlllIll("8qn2NW+IVl9/FZ31e1tJ6Q==", "vggbL");
      lIIIIllII[lIIIIllIl[2]] = lIIIlllllI("2iPepG4yXgo=", "oWGQw");
      lIIIIllII[lIIIIllIl[3]] = lIIIlllllI("HbF52xPqt56JsgV1wmi2PQqrFWJ+NX6gffyfblpDyus=", "MCroI");
   }

   static {
      lIIlIIIIII();
      lIIIllllll();
   }

   private static String lIIIlllIll(String llIlIlllIIllIII, String llIlIlllIIllIIl) {
      try {
         short llIlIlllIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIlIlllIIlllII = Cipher.getInstance("Blowfish");
         llIlIlllIIlllII.init(lIIIIllIl[2], llIlIlllIIlIllI);
         return new String(llIlIlllIIlllII.doFinal(Base64.getDecoder().decode(llIlIlllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
