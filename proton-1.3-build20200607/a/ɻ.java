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
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u000eB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\t\u001a\u00020\u0001HÇ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0002\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0001H×\u0001¢\u0006\u0004\b\u0015\u0010\u0004R\u001d\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0086\u0004R\u001d\u0010\u0006\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u0086\u0004"},
   d2 = {"La/ɻ;", "", "ⲋ", "Ljava/lang/String;", "()Ljava/lang/String;", "", "ĂƂ", "D", "()D", "u", "ᴃᎲ", "p0", "p1", "(Ljava/lang/String;D)La/ɻ;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "<init>", "(Ljava/lang/String;D)V"}
)
public final class ɻ {
   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return this.ĂƂ;
   }

   public int hashCode() {
      String var10000 = this.ⲋ;
      int var1;
      if (lIIIIlIIllI(var10000)) {
         var1 = var10000.hashCode();
         "".length();
         if (((52 ^ 125) & ~(236 ^ 165)) > " ".length()) {
            return (76 ^ 3) & ~(119 ^ 56);
         }
      } else {
         "".length();
         var1 = llllIIllI[2];
      }

      var1 *= llllIIllI[3];
      long var10001 = Double.doubleToLongBits(this.ĂƂ);
      return var1 + (int)(var10001 ^ var10001 >>> llllIIllI[4]);
   }

   private static boolean lIIIIlIlIII(int var0) {
      return var0 == 0;
   }

   private static boolean lIIIIlIIllI(Object var0) {
      return var0 != null;
   }

   @NotNull
   public final ɻ ⲋ(@NotNull String var1, double var2) {
      return new ɻ(var1, var2);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final String ⲋ() {
      return this.ⲋ;
   }

   private static String lIIIIIlllII(String lIllIllIIlIllIl, String lIllIllIIlIlIlI) {
      try {
         SecretKeySpec lIllIllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lIllIllIIlIlIII = Cipher.getInstance("Blowfish");
         lIllIllIIlIlIII.init(llllIIllI[1], lIllIllIIllIIII);
         return new String(lIllIllIIlIlIII.doFinal(Base64.getDecoder().decode(lIllIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIIlIlIIl(int var0, int var1) {
      return var0 < var1;
   }

   public final double ᴃᎲ() {
      return this.ĂƂ;
   }

   private static String lIIIIIlllIl(String lIllIllIlIIIIlI, String lIllIllIlIIIIIl) {
      lIllIllIlIIIIlI = new String(Base64.getDecoder().decode(lIllIllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIllIllIlIIIIII = new StringBuilder();
      char lIllIllIIlllIlI = lIllIllIlIIIIIl.toCharArray();
      short lIllIllIIlllIIl = llllIIllI[2];
      float lIllIllIIlllIII = lIllIllIlIIIIlI.toCharArray();
      Exception lIllIllIIllIlll = lIllIllIIlllIII.length;
      int lIllIllIIllIllI = llllIIllI[2];

      do {
         if (!lIIIIlIlIIl(lIllIllIIllIllI, lIllIllIIllIlll)) {
            return String.valueOf(lIllIllIlIIIIII);
         }

         long lIllIllIIllIlIl = lIllIllIIlllIII[lIllIllIIllIllI];
         lIllIllIlIIIIII.append((char)(lIllIllIIllIlIl ^ lIllIllIIlllIlI[lIllIllIIlllIIl % lIllIllIIlllIlI.length]));
         "".length();
         ++lIllIllIIlllIIl;
         ++lIllIllIIllIllI;
         "".length();
      } while((156 ^ 152) > ((159 ^ 132) & ~(6 ^ 29)));

      return null;
   }

   private static boolean lIIIIlIIlll(Object var0, Object var1) {
      return var0 != var1;
   }

   static {
      lIIIIlIIlII();
      lIIIIIlllll();
   }

   private static String lIIIIIllllI(String lIllIllIlIlIIII, String lIllIllIlIIllll) {
      try {
         boolean lIllIllIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIlIIllll.getBytes(StandardCharsets.UTF_8)), llllIIllI[6]), "DES");
         Cipher lIllIllIlIlIlII = Cipher.getInstance("DES");
         lIllIllIlIlIlII.init(llllIIllI[1], lIllIllIlIIlllI);
         return new String(lIllIllIlIlIlII.doFinal(Base64.getDecoder().decode(lIllIllIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIIlIIlIl(int var0) {
      return var0 != 0;
   }

   @NotNull
   public final String u() {
      return this.ⲋ;
   }

   public boolean equals(@Nullable Object var1) {
      if (lIIIIlIIlll(this, var1)) {
         if (lIIIIlIIlIl(var1 instanceof ɻ)) {
            ɻ var2 = (ɻ)var1;
            if (lIIIIlIIlIl(Intrinsics.areEqual((Object)this.ⲋ, (Object)var2.ⲋ)) && lIIIIlIlIII(Double.compare(this.ĂƂ, var2.ĂƂ))) {
               return (boolean)llllIIllI[0];
            }
         }

         return (boolean)llllIIllI[2];
      } else {
         return (boolean)llllIIllI[0];
      }
   }

   private static void lIIIIlIIlII() {
      llllIIllI = new int[7];
      llllIIllI[0] = " ".length();
      llllIIllI[1] = "  ".length();
      llllIIllI[2] = (228 ^ 198 ^ 106 ^ 93) & (241 ^ 189 ^ 85 ^ 12 ^ -" ".length());
      llllIIllI[3] = 58 + 44 - 79 + 124 ^ 83 + 111 - 151 + 97;
      llllIIllI[4] = 137 ^ 169;
      llllIIllI[5] = "   ".length();
      llllIIllI[6] = 47 ^ 42 ^ 100 ^ 105;
   }

   @NotNull
   public String toString() {
      return String.valueOf((new StringBuilder()).append(llllIIlII[llllIIllI[2]]).append(this.ⲋ).append(llllIIlII[llllIIllI[0]]).append(this.ĂƂ).append(llllIIlII[llllIIllI[1]]));
   }

   public ɻ(@NotNull String var1, double var2) {
      this.ⲋ = var1;
      this.ĂƂ = var2;
   }

   private static void lIIIIIlllll() {
      llllIIlII = new String[llllIIllI[5]];
      llllIIlII[llllIIllI[2]] = lIIIIIlllII("9XfQ2MdYqjs=", "EbpYk");
      llllIIlII[llllIIllI[0]] = lIIIIIlllIl("fm/Fi8ewaw==", "ROIrV");
      llllIIlII[llllIIllI[1]] = lIIIIIllllI("v+DNPOnFZQA=", "jOKlJ");
   }
}
