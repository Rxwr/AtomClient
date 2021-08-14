package a;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
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
final class ᶔ$2 extends Lambda implements Function1<Boolean, Unit> {
   static {
      lIll();
      lIlI();
   }

   private static boolean llII(int var0) {
      return var0 != 0;
   }

   ᶔ$2(Ḥ var1) {
      super(lIII[0]);
      this.$ⲋ = var1;
   }

   private static void lIlI() {
      lll = new String[lIII[0]];
      lll[lIII[1]] = lIIl("NigGHR4ZIg==", "uGhnq");
   }

   public final void ⲋ(boolean lllllllIlllllll) {
      Iterable var2 = (Iterable)ᶔ.ⲋ(ᶔ.ⲋ);
      int var3 = lIII[1];
      Iterator lllllllIlllllII = var2.iterator();

      Object var10000;
      while(true) {
         if (llII(lllllllIlllllII.hasNext())) {
            Exception lllllllIllllIll = lllllllIlllllII.next();
            char lllllllIllllIlI = (Ḥ)lllllllIllllIll;
            long lllllllIllllIIl = lIII[1];
            if (!llII(Intrinsics.areEqual((Object)lllllllIllllIlI.Ἠ(), (Object)lll[lIII[1]]))) {
               continue;
            }

            var10000 = lllllllIllllIll;
            "".length();
            if (((68 ^ 72 ^ 136 ^ 196) & (113 + 96 - 188 + 179 ^ 42 + 99 - 45 + 40 ^ -" ".length())) > 0) {
               return;
            }
            break;
         }

         var10000 = null;
         break;
      }

      double lllllllIllllIII = (Ḥ)var10000;
      if (llIl(lllllllIllllIII)) {
         if (lllI(lllllllIlllllll)) {
            lllllllIllllIII.ᴃᎲ((boolean)lIII[0]);
            "".length();
            if (((50 + 5 - -73 + 21 ^ 95 + 63 - 134 + 169) & (223 ^ 163 ^ 152 ^ 176 ^ -" ".length())) != 0) {
               return;
            }
         }
      } else if (llII(lllllllIlllllll)) {
         ᶔ.ⲋ(ᶔ.ⲋ, (Ḥ)(new Я()), llllllllIIIIIII.$ⲋ);
      }

   }

   private static String lIIl(String lllllllIllIllIl, String lllllllIllIIlll) {
      lllllllIllIllIl = new String(Base64.getDecoder().decode(lllllllIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllIllIlIll = new StringBuilder();
      char[] lllllllIllIlIlI = lllllllIllIIlll.toCharArray();
      int lllllllIllIlIIl = lIII[1];
      int lllllllIllIIIll = lllllllIllIllIl.toCharArray();
      byte lllllllIllIIIlI = lllllllIllIIIll.length;
      int lllllllIllIIIIl = lIII[1];

      do {
         if (!llll(lllllllIllIIIIl, lllllllIllIIIlI)) {
            return String.valueOf(lllllllIllIlIll);
         }

         char lllllllIllIlllI = lllllllIllIIIll[lllllllIllIIIIl];
         lllllllIllIlIll.append((char)(lllllllIllIlllI ^ lllllllIllIlIlI[lllllllIllIlIIl % lllllllIllIlIlI.length]));
         "".length();
         ++lllllllIllIlIIl;
         ++lllllllIllIIIIl;
         "".length();
      } while(((60 + 70 - 119 + 132 ^ 105 + 113 - 184 + 102) & (211 ^ 180 ^ 11 ^ 107 ^ -" ".length())) < " ".length());

      return null;
   }

   private static boolean llll(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIll() {
      lIII = new int[2];
      lIII[0] = " ".length();
      lIII[1] = (56 ^ 50 ^ 8 ^ 88) & (5 ^ 121 ^ 24 ^ 62 ^ -" ".length());
   }

   private static boolean llIl(Object var0) {
      return var0 != null;
   }

   private static boolean lllI(int var0) {
      return var0 == 0;
   }
}
