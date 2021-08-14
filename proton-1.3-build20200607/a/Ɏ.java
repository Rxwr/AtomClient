package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"La/Ɏ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class Ɏ extends Ἒⅾ {
   private static String lIIIIIlIII(String llIllIIllIIIlIl, String llIllIIllIIIlII) {
      try {
         boolean llIllIIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIllIIllIIIlll = Cipher.getInstance("Blowfish");
         llIllIIllIIIlll.init(llllIlII[2], llIllIIllIIIIIl);
         return new String(llIllIIllIIIlll.doFinal(Base64.getDecoder().decode(llIllIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public Ɏ() {
      super(lllIllll[llllIlII[4]], lllIllll[llllIlII[5]], CollectionsKt.listOf(lllIllll[llllIlII[6]]));
   }

   private static String lIIIIIlIIl(String llIllIIlIlllIII, String llIllIIlIllIlIl) {
      try {
         SecretKeySpec llIllIIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), llllIlII[8]), "DES");
         byte llIllIIlIllIIll = Cipher.getInstance("DES");
         llIllIIlIllIIll.init(llllIlII[2], llIllIIlIlllIll);
         return new String(llIllIIlIllIIll.doFinal(Base64.getDecoder().decode(llIllIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIIlIlll(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIIIIIlIlI() {
      lllIllll = new String[llllIlII[7]];
      lllIllll[llllIlII[0]] = lIIIIIlIII("zrsAjpluMHb91/iKC+Yy4JahMHfWqUg4", "SegFe");
      lllIllll[llllIlII[1]] = lIIIIIlIIl("ushC71tY498=", "NvSmQ");
      lllIllll[llllIlII[2]] = lIIIIIlIII("tjJRdj7aYXO5+Zl/UnLPYX23FCblDzCP", "ZsvdO");
      lllIllll[llllIlII[4]] = lIIIIIlIIl("Xl+dElmorvY=", "wZkRn");
      lllIllll[llllIlII[5]] = lIIIIIlIII("p1Hc5S+l/jnqBPWTLG8cLTD2vUV3EL+U", "OfAUP");
      lllIllll[llllIlII[6]] = lIIIIIlIIl("i7iac9aEo34=", "YaNqj");
   }

   private static boolean lIIIIlIllI(int var0) {
      return var0 == 0;
   }

   private static void lIIIIlIlIl() {
      llllIlII = new int[9];
      llllIlII[0] = (84 + 118 - 86 + 56 ^ 120 + 42 - 59 + 30) & (61 + 114 - 114 + 105 ^ 59 + 13 - -16 + 55 ^ -" ".length());
      llllIlII[1] = " ".length();
      llllIlII[2] = "  ".length();
      llllIlII[3] = 190 ^ 149 ^ 74 ^ 79;
      llllIlII[4] = "   ".length();
      llllIlII[5] = 130 + 86 - 180 + 133 ^ 60 + 67 - 51 + 97;
      llllIlII[6] = 106 ^ 13 ^ 93 ^ 63;
      llllIlII[7] = 124 ^ 122;
      llllIlII[8] = 81 ^ 89;
   }

   static {
      lIIIIlIlIl();
      lIIIIIlIlI();
   }

   public void ⲋ(@NotNull Ἒⅾ.u llIllIIllIlIIII) {
      if (lIIIIlIllI(llIllIIllIlIIII.ⲋ())) {
         Y.ĂƂ.ⲋ(lllIllll[llllIlII[0]]);
      } else {
         String llIllIIllIIllll = llIllIIllIlIIII.ⲋ(llllIlII[0]).ϛⰄ();
         byte llIllIIllIIlllI = llllIlII[1];
         int llIllIIllIIllIl = llIllIIllIlIIII.ⲋ();

         do {
            if (!lIIIIlIlll(llIllIIllIIlllI, llIllIIllIIllIl)) {
               ⱉȬ.ᴃᎲ.ĂƂ(llIllIIllIIllll);
               Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lllIllll[llllIlII[2]]).append(llIllIIllIIllll).append((char)llllIlII[3])));
               return;
            }

            llIllIIllIIllll = String.valueOf((new StringBuilder()).append(llIllIIllIIllll).append(lllIllll[llllIlII[1]]).append(llIllIIllIlIIII.ⲋ(llIllIIllIIlllI).ϛⰄ()));
            ++llIllIIllIIlllI;
            "".length();
         } while(null == null);

      }
   }
}
