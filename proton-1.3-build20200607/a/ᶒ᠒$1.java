package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"},
   d2 = {"", "p0", "", "ⲋ", "(I)V"}
)
final class ᶒ᠒$1 extends Lambda implements Function1<Integer, Unit> {
   public final void ⲋ(int var1) {
      ᵭ var10000 = this.$ⲋ.ⲋ();
      if (lIIlIIllII(var10000)) {
         throw new TypeCastException(lIIIIlllI[lIIIlIIlI[1]]);
      } else {
         var10000.ⲋ((Object)var1);
      }
   }

   private static void lIIlIIIlIl() {
      lIIIIlllI = new String[lIIIlIIlI[0]];
      lIIIIlllI[lIIIlIIlI[1]] = lIIlIIIlII("Mfa0YmpGnjwt0x6z6Lcy+z6eh+BYS89ou7g2J7IvhqL98X4Yn7yTNflZ9pvhNhBlFm8lgboyv2FHvrJEk5cWVqtwJI0dqZmdbKVU2dvi2sPQ2ll6IQKwEQ==", "llkJX");
   }

   private static String lIIlIIIlII(String llIlIllIllllIIl, String llIlIllIllllIlI) {
      try {
         SecretKeySpec llIlIllIllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String llIlIllIlllIllI = Cipher.getInstance("Blowfish");
         llIlIllIlllIllI.init(lIIIlIIlI[2], llIlIllIllllllI);
         return new String(llIlIllIlllIllI.doFinal(Base64.getDecoder().decode(llIlIllIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIlIIlIlI() {
      lIIIlIIlI = new int[3];
      lIIIlIIlI[0] = " ".length();
      lIIIlIIlI[1] = (13 ^ 46) & ~(135 ^ 164);
      lIIIlIIlI[2] = "  ".length();
   }

   private static boolean lIIlIIllII(Object var0) {
      return var0 == null;
   }

   static {
      lIIlIIlIlI();
      lIIlIIIlIl();
   }

   ᶒ᠒$1(ⅹ var1) {
      super(lIIIlIIlI[0]);
      this.$ⲋ = var1;
   }
}
