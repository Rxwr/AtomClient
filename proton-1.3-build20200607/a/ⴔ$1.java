package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.minecraft.client.entity.EntityPlayerSP;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"La/ᵭ;", "", "p0", "", "ⲋ", "(La/ᵭ;)V"}
)
final class ⴔ$1 extends Lambda implements Function1<ᵭ<? extends Object>, Unit> {
   ⴔ$1(ⴔ var1) {
      super(lIllIll[0]);
      this.ⲋ = var1;
   }

   private static boolean llIlIIll(Object var0) {
      return var0 != null;
   }

   private static String llIIlIll(String llllIIlIlIIIlll, String llllIIlIlIIIlII) {
      try {
         long llllIIlIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIllIll[2]), "DES");
         Cipher llllIIlIlIIlIIl = Cipher.getInstance("DES");
         llllIIlIlIIlIIl.init(lIllIll[3], llllIIlIlIIIIll);
         return new String(llllIIlIlIIlIIl.doFinal(Base64.getDecoder().decode(llllIIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIlIIlI(int var0) {
      return var0 != 0;
   }

   public final void ⲋ(@NotNull ᵭ<? extends Object> var1) {
      Object var10000 = var1.ⲋ();
      if (llIlIIIl(var10000)) {
         throw new TypeCastException(lIllIIl[lIllIll[1]]);
      } else {
         if (llIlIIlI((Boolean)var10000) && llIlIIll(ⴔ.ⲋ(llllIIlIlIlIIII.ⲋ).field_71439_g) && llIlIIll(llllIIlIlIlIIII.ⲋ.ϛⰄ())) {
            ⴔ var3 = llllIIlIlIlIIII.ⲋ;
            double var10001 = -ⴔ.ⲋ(llllIIlIlIlIIII.ⲋ).field_71439_g.field_70165_t;
            EntityPlayerSP var10002 = llllIIlIlIlIIII.ⲋ.ϛⰄ();
            if (llIlIIIl(var10002)) {
               Intrinsics.throwNpe();
            }

            var3.ᴃᎲ(var10001 + var10002.field_70165_t);
            var3 = llllIIlIlIlIIII.ⲋ;
            var10001 = -ⴔ.ⲋ(llllIIlIlIlIIII.ⲋ).field_71439_g.field_70163_u;
            var10002 = llllIIlIlIlIIII.ⲋ.ϛⰄ();
            if (llIlIIIl(var10002)) {
               Intrinsics.throwNpe();
            }

            var3.〥ҳⱆ(var10001 + var10002.field_70163_u);
            var3 = llllIIlIlIlIIII.ⲋ;
            var10001 = -ⴔ.ⲋ(llllIIlIlIlIIII.ⲋ).field_71439_g.field_70161_v;
            var10002 = llllIIlIlIlIIII.ⲋ.ϛⰄ();
            if (llIlIIIl(var10002)) {
               Intrinsics.throwNpe();
            }

            var3.Ἒⅾ(var10001 + var10002.field_70161_v);
         }

      }
   }

   private static void llIlIIII() {
      lIllIll = new int[4];
      lIllIll[0] = " ".length();
      lIllIll[1] = (147 ^ 175 ^ 93 ^ 119) & (57 + 103 - 78 + 82 ^ 158 + 166 - 321 + 175 ^ -" ".length());
      lIllIll[2] = 20 ^ 28;
      lIllIll[3] = "  ".length();
   }

   static {
      llIlIIII();
      llIIlllI();
   }

   private static void llIIlllI() {
      lIllIIl = new String[lIllIll[0]];
      lIllIIl[lIllIll[1]] = llIIlIll("UUU6cVi+2XCMMotELIpPeQhsA1kxA3RbCbTuhXDQ+IO4F51MfL+O4y9gbMVHV7X9X3ayquyv2NY=", "JPJUZ");
   }

   private static boolean llIlIIIl(Object var0) {
      return var0 == null;
   }
}
