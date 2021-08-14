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
   d2 = {"La/ⱯꝣѺ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class ⱯꝣѺ extends Ἒⅾ {
   private static String llIIlIIllI(String llIIlIIIIlIIlII, String llIIlIIIIlIIIIl) {
      try {
         int llIIlIIIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llIIIlIII[8]), "DES");
         Cipher llIIlIIIIlIIllI = Cipher.getInstance("DES");
         llIIlIIIIlIIllI.init(llIIIlIII[2], llIIlIIIIlIIIII);
         return new String(llIIlIIIIlIIllI.doFinal(Base64.getDecoder().decode(llIIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void llIIllIlIl() {
      llIIIlIII = new int[9];
      llIIIlIII[0] = " ".length();
      llIIIlIII[1] = (169 + 126 - 258 + 192 ^ 136 + 46 - 90 + 84) & (82 + 27 - 104 + 247 ^ 56 + 113 - 153 + 153 ^ -" ".length());
      llIIIlIII[2] = "  ".length();
      llIIIlIII[3] = "   ".length();
      llIIIlIII[4] = 204 ^ 164 ^ 39 ^ 75;
      llIIIlIII[5] = 116 ^ 113;
      llIIIlIII[6] = 15 + 55 - -23 + 58 ^ 93 + 49 - 126 + 129;
      llIIIlIII[7] = 172 ^ 148 ^ 124 ^ 67;
      llIIIlIII[8] = 8 ^ 0;
   }

   static {
      llIIllIlIl();
      llIIlIllIl();
   }

   private static String llIIlIlIII(String llIIlIIIIIlIlll, String llIIlIIIIIlIlII) {
      try {
         SecretKeySpec llIIlIIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIlIIIIIllIIl = Cipher.getInstance("Blowfish");
         llIIlIIIIIllIIl.init(llIIIlIII[2], llIIlIIIIIllIlI);
         return new String(llIIlIIIIIllIIl.doFinal(Base64.getDecoder().decode(llIIlIIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void ⲋ(@NotNull Ἒⅾ.u llIIlIIIlIIIllI) {
      if (llIIllIllI(llIIlIIIlIIIllI.ⲋ(), llIIIlIII[0])) {
         Y.ĂƂ.ⲋ(lIlllllll[llIIIlIII[1]]);
      } else {
         boolean llIIlIIIlIIIlIl = llIIlIIIlIIIllI.ⲋ(llIIIlIII[1]).Ἒⅾ();
         float llIIlIIIlIIIlII = ơ߀.ⲋ.ĂƂ(llIIlIIIlIIIlIl);
         if (llIIllIlll(llIIlIIIlIIIlII)) {
            Y.ĂƂ.ⲋ(lIlllllll[llIIIlIII[0]]);
            "".length();
            if (" ".length() >= "  ".length()) {
               return;
            }
         } else {
            ơ߀.ⲋ.ⲋ(llIIlIIIlIIIlII);
            if (llIIlllIII(llIIlIIIlIIIlII.Ɏ())) {
               Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(llIIlIIIlIIIlII.ȵ()).append(lIlllllll[llIIIlIII[2]])));
               "".length();
               if (" ".length() >= (98 ^ 63 ^ 81 ^ 8)) {
                  return;
               }
            } else {
               Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(llIIlIIIlIIIlII.ȵ()).append(lIlllllll[llIIIlIII[3]])));
            }
         }

      }
   }

   private static boolean llIIlllIII(int var0) {
      return var0 != 0;
   }

   private static String llIIlIIlll(String llIIlIIIIlllIIl, String llIIlIIIIlllIII) {
      llIIlIIIIlllIIl = new String(Base64.getDecoder().decode(llIIlIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long llIIlIIIIllIIlI = new StringBuilder();
      char llIIlIIIIllIIIl = llIIlIIIIlllIII.toCharArray();
      String llIIlIIIIllIIII = llIIIlIII[1];
      float llIIlIIIIlIllll = llIIlIIIIlllIIl.toCharArray();
      char llIIlIIIIlIlllI = llIIlIIIIlIllll.length;
      int llIIlIIIIlIllIl = llIIIlIII[1];

      do {
         if (!llIIlllIIl(llIIlIIIIlIllIl, llIIlIIIIlIlllI)) {
            return String.valueOf(llIIlIIIIllIIlI);
         }

         Exception llIIlIIIIlIllII = llIIlIIIIlIllll[llIIlIIIIlIllIl];
         llIIlIIIIllIIlI.append((char)(llIIlIIIIlIllII ^ llIIlIIIIllIIIl[llIIlIIIIllIIII % llIIlIIIIllIIIl.length]));
         "".length();
         ++llIIlIIIIllIIII;
         ++llIIlIIIIlIllIl;
         "".length();
      } while(null == null);

      return null;
   }

   private static boolean llIIlllIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static void llIIlIllIl() {
      lIlllllll = new String[llIIIlIII[7]];
      lIlllllll[llIIIlIII[1]] = llIIlIIllI("jcp7/np5Zlx4nFH+Jz4WZAuz3cLbWeQg", "cploM");
      lIlllllll[llIIIlIII[0]] = llIIlIIlll("MwYOPhgRBkU9GAIdCTVZ", "fhePw");
      lIlllllll[llIIIlIII[2]] = llIIlIlIII("7KYuO+y/DtEwV1e5WspENw==", "ZpmsU");
      lIlllllll[llIIIlIII[3]] = llIIlIlIII("q7I/aZBuLEvZCWJcgag/QQ==", "mKZuk");
      lIlllllll[llIIIlIII[4]] = llIIlIIllI("/x2nyAqPm3w=", "BjpyW");
      lIlllllll[llIIIlIII[5]] = llIIlIlIII("jyEtepo6xVXVLdIGHPMTwFEZmYX5TITh", "SwHLq");
      lIlllllll[llIIIlIII[6]] = llIIlIIllI("oTg+jCfF1F0=", "xazVu");
   }

   private static boolean llIIllIllI(int var0, int var1) {
      return var0 != var1;
   }

   public ⱯꝣѺ() {
      super(lIlllllll[llIIIlIII[4]], lIlllllll[llIIIlIII[5]], CollectionsKt.listOf(lIlllllll[llIIIlIII[6]]));
   }

   private static boolean llIIllIlll(Object var0) {
      return var0 == null;
   }
}
