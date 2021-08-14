package a;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"},
   d2 = {"", "p0", "", "ⲋ", "(Z)V"}
)
final class ⅳ$1 extends Lambda implements Function1<Boolean, Unit> {
   ⅳ$1(Ė var1, ʅ var2, ⅳ var3) {
      super(lIIIIlIIlI[0]);
      this.$ⲋ = var1;
      this.$ĂƂ = var2;
      this.u = var3;
   }

   private static boolean lIIlIIIIllI(int var0, int var1) {
      return var0 < var1;
   }

   public final void ⲋ(boolean var1) {
      Iterable var2 = (Iterable)lIllIIIIIlllIII.u.ƶ();
      int var3 = lIIIIlIIlI[1];
      Iterator lIllIIIIIllIlIl = var2.iterator();

      do {
         if (!lIIlIIIIlII(lIllIIIIIllIlIl.hasNext())) {
            if (lIIlIIIIlIl((Boolean)lIllIIIIIlllIII.$ⲋ.ᴃᎲ().ⲋ())) {
               ϛⰄ.ⲋ.ĂƂ(String.valueOf((new StringBuilder()).append(lIIIIlIIIl[lIIIIlIIlI[1]]).append(lIllIIIIIlllIII.$ⲋ.ĂƂ())));
               lIllIIIIIlllIII.$ⲋ.ᴃᎲ().ⲋ((Object)Boolean.valueOf((boolean)lIIIIlIIlI[0]));
            }

            return;
         }

         float lIllIIIIIllIlII = lIllIIIIIllIlIl.next();
         short lIllIIIIIllIIll = (Ė)lIllIIIIIllIlII;
         boolean lIllIIIIIllIIlI = lIIIIlIIlI[1];
         lIllIIIIIllIIll.ᴃᎲ().ⲋ((Object)Boolean.valueOf((boolean)lIIIIlIIlI[1]));
         "".length();
      } while("   ".length() <= (167 ^ 163));

   }

   private static boolean lIIlIIIIlII(int var0) {
      return var0 != 0;
   }

   private static boolean lIIlIIIIlIl(int var0) {
      return var0 == 0;
   }

   static {
      lIIlIIIIIll();
      lIIlIIIIIlI();
   }

   private static void lIIlIIIIIlI() {
      lIIIIlIIIl = new String[lIIIIlIIlI[0]];
      lIIIIlIIIl[lIIIIlIIlI[1]] = lIIlIIIIIIl("AgceBDMGSBwNOwVI", "ahpbZ");
   }

   private static String lIIlIIIIIIl(String lIllIIIIIIlIIll, String lIllIIIIIIlIIlI) {
      lIllIIIIIIlIIll = new String(Base64.getDecoder().decode(lIllIIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      short lIllIIIIIIIlIII = new StringBuilder();
      float lIllIIIIIIIIllI = lIllIIIIIIlIIlI.toCharArray();
      byte lIllIIIIIIIIlII = lIIIIlIIlI[1];
      float lIllIIIIIIIIIlI = lIllIIIIIIlIIll.toCharArray();
      float lIlIllllllllllI = lIllIIIIIIIIIlI.length;
      int lIlIlllllllllII = lIIIIlIIlI[1];

      do {
         if (!lIIlIIIIllI(lIlIlllllllllII, lIlIllllllllllI)) {
            return String.valueOf(lIllIIIIIIIlIII);
         }

         char lIllIIIIIIlIlIl = lIllIIIIIIIIIlI[lIlIlllllllllII];
         lIllIIIIIIIlIII.append((char)(lIllIIIIIIlIlIl ^ lIllIIIIIIIIllI[lIllIIIIIIIIlII % lIllIIIIIIIIllI.length]));
         "".length();
         ++lIllIIIIIIIIlII;
         ++lIlIlllllllllII;
         "".length();
      } while((164 + 125 - 178 + 68 ^ 51 + 29 - 10 + 112) != 0);

      return null;
   }

   private static void lIIlIIIIIll() {
      lIIIIlIIlI = new int[2];
      lIIIIlIIlI[0] = " ".length();
      lIIIIlIIlI[1] = (219 ^ 158) & ~(58 ^ 127);
   }
}
