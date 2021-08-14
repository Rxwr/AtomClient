package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"},
   d2 = {"", "p0", "", "ⲋ", "(Z)V"}
)
final class ᶔ$1 extends Lambda implements Function1<Boolean, Unit> {
   private static boolean lIllllIll(Object var0) {
      return var0 != null;
   }

   private static boolean lIlllllII(int var0) {
      return var0 == 0;
   }

   private static String lIlllIllI(String lllIIllIIlIlllI, String lllIIllIIlIlIll) {
      try {
         double lllIIllIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIIlIlIll.getBytes(StandardCharsets.UTF_8)), lIllIIII[2]), "DES");
         Cipher lllIIllIIllIIII = Cipher.getInstance("DES");
         lllIIllIIllIIII.init(lIllIIII[3], lllIIllIIlIlIlI);
         return new String(lllIIllIIllIIII.doFinal(Base64.getDecoder().decode(lllIIllIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIllllIlI(int var0) {
      return var0 != 0;
   }

   private static void lIlllIlll() {
      lIlIlllI = new String[lIllIIII[0]];
      lIlIlllI[lIllIIII[1]] = lIlllIllI("AV9Ud3jo4ps=", "hXtcG");
   }

   static {
      lIllllIIl();
      lIlllIlll();
   }

   ᶔ$1(Ḥ var1) {
      super(lIllIIII[0]);
      this.$ⲋ = var1;
   }

   private static void lIllllIIl() {
      lIllIIII = new int[4];
      lIllIIII[0] = " ".length();
      lIllIIII[1] = (72 ^ 104) & ~(15 ^ 47);
      lIllIIII[2] = 63 ^ 25 ^ 167 ^ 137;
      lIllIIII[3] = "  ".length();
   }

   public final void ⲋ(boolean lllIIllIIllllIl) {
      Iterable var2 = (Iterable)ᶔ.ⲋ(ᶔ.ⲋ);
      int var3 = lIllIIII[1];
      Iterator lllIIllIIlllIlI = var2.iterator();

      Object var10000;
      while(true) {
         if (lIllllIlI(lllIIllIIlllIlI.hasNext())) {
            short lllIIllIIlllIIl = lllIIllIIlllIlI.next();
            Exception lllIIllIIlllIII = (Ḥ)lllIIllIIlllIIl;
            float lllIIllIIllIlll = lIllIIII[1];
            if (!lIllllIlI(Intrinsics.areEqual((Object)lllIIllIIlllIII.Ἠ(), (Object)lIlIlllI[lIllIIII[1]]))) {
               continue;
            }

            var10000 = lllIIllIIlllIIl;
            "".length();
            if ("   ".length() == 0) {
               return;
            }
            break;
         }

         var10000 = null;
         break;
      }

      Exception lllIIllIIllIllI = (Ḥ)var10000;
      if (lIllllIll(lllIIllIIllIllI)) {
         if (lIlllllII(lllIIllIIllllIl)) {
            lllIIllIIllIllI.ᴃᎲ((boolean)lIllIIII[0]);
            "".length();
            if (-" ".length() == "   ".length()) {
               return;
            }
         }
      } else if (lIllllIlI(lllIIllIIllllIl)) {
         ᶔ.ⲋ(ᶔ.ⲋ, (Ḥ)(new ⅳ()), lllIIllIIlllllI.$ⲋ);
      }

   }
}
