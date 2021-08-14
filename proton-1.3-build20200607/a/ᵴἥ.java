package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
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
   d2 = {"La/ᵴἥ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class ᵴἥ extends Ἒⅾ {
   private static String llllIIlIl(String llIllIlllIllIIl, String llIllIlllIlIIll) {
      llIllIlllIllIIl = new String(Base64.getDecoder().decode(llIllIlllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIllIlllIlIlll = new StringBuilder();
      float llIllIlllIlIIIl = llIllIlllIlIIll.toCharArray();
      int llIllIlllIlIlIl = llIlllll[1];
      float llIllIlllIIllll = llIllIlllIllIIl.toCharArray();
      long llIllIlllIIlllI = llIllIlllIIllll.length;
      int llIllIlllIIllIl = llIlllll[1];

      do {
         if (!lllllIIll(llIllIlllIIllIl, llIllIlllIIlllI)) {
            return String.valueOf(llIllIlllIlIlll);
         }

         long llIllIlllIIllII = llIllIlllIIllll[llIllIlllIIllIl];
         llIllIlllIlIlll.append((char)(llIllIlllIIllII ^ llIllIlllIlIIIl[llIllIlllIlIlIl % llIllIlllIlIIIl.length]));
         "".length();
         ++llIllIlllIlIlIl;
         ++llIllIlllIIllIl;
         "".length();
      } while("  ".length() < "   ".length());

      return null;
   }

   private static boolean llllIlllI(Object var0) {
      return var0 == null;
   }

   private static String llllIIllI(String llIllIllllIlIIl, String llIllIllllIIllI) {
      try {
         boolean llIllIllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllllIIllI.getBytes(StandardCharsets.UTF_8)), llIlllll[8]), "DES");
         Cipher llIllIllllIlIll = Cipher.getInstance("DES");
         llIllIllllIlIll.init(llIlllll[2], llIllIllllIIlIl);
         return new String(llIllIllllIlIll.doFinal(Base64.getDecoder().decode(llIllIllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public ᵴἥ() {
      super(llIlllIl[llIlllll[4]], llIlllIl[llIlllll[5]], CollectionsKt.listOf(llIlllIl[llIlllll[6]]));
   }

   static {
      llllIllII();
      llllIlIIl();
   }

   public void ⲋ(@NotNull Ἒⅾ.u llIlllIIIIIIllI) {
      if (llllIllIl(llIlllIIIIIIllI.ⲋ(), llIlllll[0])) {
         Y.ĂƂ.ⲋ(llIlllIl[llIlllll[1]]);
      } else {
         int llIlllIIIIIIlIl = ơ߀.ⲋ.ĂƂ(llIlllIIIIIIllI.ⲋ(llIlllll[1]).ϛⰄ());
         if (llllIlllI(llIlllIIIIIIlIl)) {
            Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(llIlllIl[llIlllll[0]]).append(llIlllIIIIIIlIl)));
         } else {
            int llIlllIIIIIIIll = (Iterable)llIlllIIIIIIlIl.ⴜ();
            short llIlllIIIIIIIlI = llIlllll[1];
            Iterator llIlllIIIIIIIIl = llIlllIIIIIIIll.iterator();

            do {
               if (!llllIllll(llIlllIIIIIIIIl.hasNext())) {
                  Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(llIlllIl[llIlllll[2]]).append(llIlllIIIIIIlIl.ȵ()).append(llIlllIl[llIlllll[3]])));
                  return;
               }

               char llIlllIIIIIIIII = llIlllIIIIIIIIl.next();
               double llIllIlllllllll = (ⅹ)llIlllIIIIIIIII;
               char llIllIllllllllI = llIlllll[1];
               llIllIlllllllll.Ɏ();
               "".length();
            } while(" ".length() != 0);

         }
      }
   }

   private static void llllIlIIl() {
      llIlllIl = new String[llIlllll[7]];
      llIlllIl[llIlllll[1]] = llllIIlIl("BT0MLghqbgksCzE7AT0ecHIAJgklIgh3", "PNmIm");
      llIlllIl[llIlllll[0]] = llllIIlIl("DRQ+BgAvFHUFADwPOQ1VeA==", "XzUho");
      llIlllIl[llIlllll[2]] = llllIIlIl("GCAnEA1qYzI=", "JETuy");
      llIlllIl[llIlllll[3]] = llllIIlIl("R1NoLy0CD2g5I0EALSstFAg8Yw==", "adHML");
      llIlllIl[llIlllll[4]] = llllIIllI("LRlxBG/eAE7aIk3Q0v5PNA==", "JFrnK");
      llIlllIl[llIlllll[5]] = llllIIlIl("EBMDHDgxVgQRKWIFFQ04KxgXCmwtEFAYbC8ZFAwgJ1YSGC8pVgQWbDYeFVkoJxARDCA2VgMNLTYTXg==", "BvpyL");
      llIlllIl[llIlllll[6]] = llllIlIII("UywSsCd4Sb8=", "KcKiG");
   }

   private static void llllIllII() {
      llIlllll = new int[9];
      llIlllll[0] = " ".length();
      llIlllll[1] = (98 ^ 40 ^ 201 ^ 169) & (227 ^ 182 ^ 1 + 44 - 18 + 100 ^ -" ".length());
      llIlllll[2] = "  ".length();
      llIlllll[3] = "   ".length();
      llIlllll[4] = 91 ^ 95;
      llIlllll[5] = 86 ^ 83;
      llIlllll[6] = 180 ^ 192 ^ 5 ^ 119;
      llIlllll[7] = 81 ^ 86;
      llIlllll[8] = 64 + 184 - 239 + 177 ^ 26 + 21 - 0 + 131;
   }

   private static String llllIlIII(String llIllIlllllIllI, String llIllIlllllIlIl) {
      try {
         SecretKeySpec llIllIllllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIllIllllllIII = Cipher.getInstance("Blowfish");
         llIllIllllllIII.init(llIlllll[2], llIllIllllllIIl);
         return new String(llIllIllllllIII.doFinal(Base64.getDecoder().decode(llIllIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llllIllIl(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lllllIIll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean llllIllll(int var0) {
      return var0 != 0;
   }
}
