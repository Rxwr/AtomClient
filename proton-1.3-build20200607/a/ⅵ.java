package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u000eB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÇ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0001HÇ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J$\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001HÇ\u0001¢\u0006\u0004\b\u0006\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0006\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0002\u0010\u0005¨\u0006\u0086\u000eR&\u0010\u0002\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0006\u0010\u0004\"\u0004\b\u0006\u0010\u0005¨\u0006\u0086\u000e"},
   d2 = {"La/ⅵ;", "La/ė;", "ĂƂ", "La/ė;", "()La/ė;", "(La/ė;)V", "ⲋ", "La/Ữ;", "p0", "(La/Ữ;)La/ⅵ;", "u", "ᴃᎲ", "p1", "(La/ė;La/ė;)La/ⅵ;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "<init>", "(La/ė;La/ė;)V"}
)
public final class ⅵ {
   public boolean equals(@Nullable Object var1) {
      if (lIIIIIIIlII(this, var1)) {
         if (lIIIIIIIIlI(var1 instanceof ⅵ)) {
            ⅵ var2 = (ⅵ)var1;
            if (lIIIIIIIIlI(Intrinsics.areEqual((Object)this.ⲋ, (Object)var2.ⲋ)) && lIIIIIIIIlI(Intrinsics.areEqual((Object)this.ĂƂ, (Object)var2.ĂƂ))) {
               return (boolean)lllIllIll[1];
            }
         }

         return (boolean)lllIllIll[0];
      } else {
         return (boolean)lllIllIll[1];
      }
   }

   private static boolean lIIIIIIIlIl(int var0, int var1) {
      return var0 < var1;
   }

   public ⅵ(@NotNull ė var1, @NotNull ė var2) {
      this.ⲋ = var1;
      this.ĂƂ = var2;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ė var1) {
      this.ⲋ = var1;
   }

   @NotNull
   public final ė ᴃᎲ() {
      return this.ĂƂ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ė ⲋ() {
      return this.ⲋ;
   }

   @NotNull
   public final ⅵ ⲋ(@NotNull ė var1, @NotNull ė var2) {
      return new ⅵ(var1, var2);
   }

   @NotNull
   public final ė u() {
      return this.ⲋ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(@NotNull ė var1) {
      this.ĂƂ = var1;
   }

   static {
      lIIIIIIIIIl();
      lllllllllI();
   }

   private static String lllllllIll(String lIlllIIlIIlllIl, String lIlllIIlIIlllII) {
      try {
         float lIlllIIlIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIlIIlllII.getBytes(StandardCharsets.UTF_8)), lllIllIll[5]), "DES");
         boolean lIlllIIlIIllIII = Cipher.getInstance("DES");
         lIlllIIlIIllIII.init(lllIllIll[2], lIlllIIlIIllIIl);
         return new String(lIlllIIlIIllIII.doFinal(Base64.getDecoder().decode(lIlllIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final ė ĂƂ() {
      return this.ĂƂ;
   }

   private static String lllllllIlI(String lIlllIIlIIIlIII, String lIlllIIlIIIIlll) {
      lIlllIIlIIIlIII = new String(Base64.getDecoder().decode(lIlllIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlllIIlIIIlIll = new StringBuilder();
      long lIlllIIlIIIIlIl = lIlllIIlIIIIlll.toCharArray();
      int lIlllIIlIIIlIIl = lllIllIll[0];
      float lIlllIIlIIIIIll = lIlllIIlIIIlIII.toCharArray();
      String lIlllIIlIIIIIlI = lIlllIIlIIIIIll.length;
      int lIlllIIlIIIIIIl = lllIllIll[0];

      do {
         if (!lIIIIIIIlIl(lIlllIIlIIIIIIl, lIlllIIlIIIIIlI)) {
            return String.valueOf(lIlllIIlIIIlIll);
         }

         char lIlllIIlIIIlllI = lIlllIIlIIIIIll[lIlllIIlIIIIIIl];
         lIlllIIlIIIlIll.append((char)(lIlllIIlIIIlllI ^ lIlllIIlIIIIlIl[lIlllIIlIIIlIIl % lIlllIIlIIIIlIl.length]));
         "".length();
         ++lIlllIIlIIIlIIl;
         ++lIlllIIlIIIIIIl;
         "".length();
      } while("  ".length() != "   ".length());

      return null;
   }

   private static boolean lIIIIIIIIll(Object var0) {
      return var0 != null;
   }

   @NotNull
   public final ⅵ ⲋ(@NotNull Ữ var1) {
      int var2 = lllIllIll[0];
      return new ⅵ(this.ⲋ().ĂƂ(var1.Ꜥ()), this.ĂƂ());
   }

   private static void lllllllllI() {
      lllIlIlll = new String[lllIllIll[4]];
      lllIlIlll[lllIllIll[0]] = lllllllIlI("4oSwZsWsx6lX", "ENnkj");
      lllIlIlll[lllIllIll[1]] = lllllllIlI("QVLis6du", "mrlSO");
      lllIlIlll[lllIllIll[2]] = lllllllIll("9buRvj3G55k=", "YCceB");
   }

   @NotNull
   public String toString() {
      return String.valueOf((new StringBuilder()).append(lllIlIlll[lllIllIll[0]]).append(this.ⲋ).append(lllIlIlll[lllIllIll[1]]).append(this.ĂƂ).append(lllIlIlll[lllIllIll[2]]));
   }

   public int hashCode() {
      ė var10000 = lIlllIIlIlIlIll.ⲋ;
      int var1;
      if (lIIIIIIIIll(var10000)) {
         var1 = var10000.hashCode();
         "".length();
         if (" ".length() <= 0) {
            return (85 + 89 - 30 + 53 ^ 105 + 18 - 83 + 105) & (56 ^ 101 ^ 6 ^ 15 ^ -" ".length());
         }
      } else {
         "".length();
         var1 = lllIllIll[0];
      }

      var1 *= lllIllIll[3];
      ė var10001 = lIlllIIlIlIlIll.ĂƂ;
      int var2;
      if (lIIIIIIIIll(var10001)) {
         var2 = var10001.hashCode();
         "".length();
         if (-(121 ^ 125) >= 0) {
            return (104 ^ 55) & ~(20 ^ 75) & ~((85 ^ 23) & ~(87 ^ 21));
         }
      } else {
         "".length();
         var2 = lllIllIll[0];
      }

      return var1 + var2;
   }

   private static void lIIIIIIIIIl() {
      lllIllIll = new int[6];
      lllIllIll[0] = (208 ^ 147) & ~(90 ^ 25);
      lllIllIll[1] = " ".length();
      lllIllIll[2] = "  ".length();
      lllIllIll[3] = 152 + 25 - 157 + 168 ^ 4 + 48 - -74 + 37;
      lllIllIll[4] = "   ".length();
      lllIllIll[5] = 91 ^ 83;
   }

   private static boolean lIIIIIIIIlI(int var0) {
      return var0 != 0;
   }

   private static boolean lIIIIIIIlII(Object var0, Object var1) {
      return var0 != var1;
   }
}
