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
   d2 = {"La/Ꜥ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class Ꜥ extends Ἒⅾ {
   private static String lllIlIIII(String llIllllllIlIlII, String llIllllllIlIIll) {
      try {
         SecretKeySpec llIllllllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIllllllIllIII = Cipher.getInstance("Blowfish");
         llIllllllIllIII.init(llIlIlII[2], llIllllllIllIIl);
         return new String(llIllllllIllIII.doFinal(Base64.getDecoder().decode(llIllllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   static {
      lllIlIIll();
      lllIlIIIl();
   }

   private static String lllIIlllI(String llIlllllllllIII, String llIllllllllIlll) {
      llIlllllllllIII = new String(Base64.getDecoder().decode(llIlllllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean llIllllllllIIIl = new StringBuilder();
      boolean llIllllllllIIII = llIllllllllIlll.toCharArray();
      char llIlllllllIllll = llIlIlII[1];
      short llIlllllllIlllI = llIlllllllllIII.toCharArray();
      Exception llIlllllllIllIl = llIlllllllIlllI.length;
      int llIlllllllIllII = llIlIlII[1];

      do {
         if (!lllIlIlIl(llIlllllllIllII, llIlllllllIllIl)) {
            return String.valueOf(llIllllllllIIIl);
         }

         boolean llIlllllllIlIll = llIlllllllIlllI[llIlllllllIllII];
         llIllllllllIIIl.append((char)(llIlllllllIlIll ^ llIllllllllIIII[llIlllllllIllll % llIllllllllIIII.length]));
         "".length();
         ++llIlllllllIllll;
         ++llIlllllllIllII;
         "".length();
      } while(-" ".length() <= 0);

      return null;
   }

   public Ꜥ() {
      super(llIlIIIl[llIlIlII[2]], llIlIIIl[llIlIlII[3]], (List)null, llIlIlII[4], (DefaultConstructorMarker)null);
   }

   private static void lllIlIIll() {
      llIlIlII = new int[6];
      llIlIlII[0] = " ".length();
      llIlIlII[1] = (62 ^ 54) & ~(46 ^ 38);
      llIlIlII[2] = "  ".length();
      llIlIlII[3] = "   ".length();
      llIlIlII[4] = 18 ^ 22;
      llIlIlII[5] = 168 ^ 160;
   }

   private static String lllIIllll(String llIlllllllIIIIl, String llIlllllllIIIII) {
      try {
         Exception llIllllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllllllIIIII.getBytes(StandardCharsets.UTF_8)), llIlIlII[5]), "DES");
         short llIllllllIllllI = Cipher.getInstance("DES");
         llIllllllIllllI.init(llIlIlII[2], llIllllllIlllll);
         return new String(llIllllllIllllI.doFinal(Base64.getDecoder().decode(llIlllllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lllIlIlII(int var0) {
      return var0 != 0;
   }

   public void ⲋ(@NotNull Ἒⅾ.u var1) {
      Ἠ.ᴃᎲ$default(Ἠ.ⲋ, (String)null, llIlIlII[0], (Object)null);
      if (lllIlIlII(Ἠ.ⲋ.ⲡ())) {
         Y.ĂƂ.ⲋ(llIlIIIl[llIlIlII[1]]);
         "".length();
         if ("  ".length() < "  ".length()) {
            return;
         }
      } else {
         Y.ĂƂ.ⲋ(llIlIIIl[llIlIlII[0]]);
      }

   }

   private static void lllIlIIIl() {
      llIlIIIl = new String[llIlIlII[4]];
      llIlIIIl[llIlIlII[1]] = lllIIlllI("GiwFHDEobQUFITk5AxNq", "XMfwD");
      llIlIIIl[llIlIlII[0]] = lllIIllll("1Bgdb8Bu1a9P5lY7O2OVH07m0IMsR9dYfyvPSDp2SiA=", "CgmRT");
      llIlIIIl[llIlIlII[2]] = lllIlIIII("QJsy3rStxk4=", "XVefe");
      llIlIIIl[llIlIlII[3]] = lllIIlllI("BDYnPz4mPiZ5MHQwOjc3PTR1OzA3OCApfw==", "TSUYQ");
   }

   private static boolean lllIlIlIl(int var0, int var1) {
      return var0 < var1;
   }
}
