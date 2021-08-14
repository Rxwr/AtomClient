package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0012B/\u0012\b\b\u0002\u0010\r\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004J8\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0001HÇ\u0001¢\u0006\u0004\b\u0006\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u0006\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0002\u0010\u0005¨\u0006\u0086\u000eR&\u0010\b\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\u0007\u0010\u0005¨\u0006\u0086\u000eR&\u0010\u0002\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0003\u001a\u0004\b\b\u0010\u0004\"\u0004\b\b\u0010\u0005¨\u0006\u0086\u000eR&\u0010\u0007\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0006\u0010\u0004\"\u0004\b\u0006\u0010\u0005¨\u0006\u0086\u000e"},
   d2 = {"La/Β;", "", "u", "I", "()I", "(I)V", "ⲋ", "ᴃᎲ", "ĂƂ", "〥ҳⱆ", "Ἒⅾ", "ϛⰄ", "ς", "p0", "p1", "p2", "p3", "(IIII)La/Β;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "<init>", "(IIII)V"}
)
public final class Β {
   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      this.ⲋ = var1;
   }

   @JvmName(
      name = "u"
   )
   public final int u() {
      return this.u;
   }

   public boolean equals(@Nullable Object var1) {
      if (lIlIIIl(this, var1)) {
         if (lIlIIII(var1 instanceof Β)) {
            Β var2 = (Β)var1;
            if (lIlIIlI(this.ⲋ, var2.ⲋ) && lIlIIlI(this.ĂƂ, var2.ĂƂ) && lIlIIlI(this.u, var2.u) && lIlIIlI(this.ᴃᎲ, var2.ᴃᎲ)) {
               return (boolean)lllII[0];
            }
         }

         return (boolean)lllII[1];
      } else {
         return (boolean)lllII[0];
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return this.ⲋ;
   }

   private static boolean lIlIIll(int var0, int var1) {
      return var0 < var1;
   }

   public int hashCode() {
      return ((this.ⲋ * lllII[7] + this.ĂƂ) * lllII[7] + this.u) * lllII[7] + this.ᴃᎲ;
   }

   private static boolean lIlIIlI(int var0, int var1) {
      return var0 == var1;
   }

   static {
      lIIlllI();
      lIIllIl();
   }

   @NotNull
   public final Β ⲋ(int var1, int var2, int var3, int var4) {
      return new Β(var1, var2, var3, var4);
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(int var1) {
      this.ᴃᎲ = var1;
   }

   @JvmName(
      name = "u"
   )
   public final void u(int var1) {
      this.u = var1;
   }

   public final int ϛⰄ() {
      return this.u;
   }

   private static String lIIlIll(String lllllIlIlIIIIII, String lllllIlIIlllIlI) {
      lllllIlIlIIIIII = new String(Base64.getDecoder().decode(lllllIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllIlIIlllllI = new StringBuilder();
      char[] lllllIlIIllllIl = lllllIlIIlllIlI.toCharArray();
      int lllllIlIIllllII = lllII[1];
      float lllllIlIIllIllI = lllllIlIlIIIIII.toCharArray();
      float lllllIlIIllIlIl = lllllIlIIllIllI.length;
      int lllllIlIIllIlII = lllII[1];

      do {
         if (!lIlIIll(lllllIlIIllIlII, lllllIlIIllIlIl)) {
            return String.valueOf(lllllIlIIlllllI);
         }

         char lllllIlIlIIIIIl = lllllIlIIllIllI[lllllIlIIllIlII];
         lllllIlIIlllllI.append((char)(lllllIlIlIIIIIl ^ lllllIlIIllllIl[lllllIlIIllllII % lllllIlIIllllIl.length]));
         "".length();
         ++lllllIlIIllllII;
         ++lllllIlIIllIlII;
         "".length();
      } while(" ".length() == " ".length());

      return null;
   }

   private static void lIIllIl() {
      llIll = new String[lllII[8]];
      llIll[lllII[1]] = lIIlIll("z59C4bWZ4Y+jTw==", "MjZQr");
      llIll[lllII[0]] = lIIlIll("bnoHZQ==", "BZrXY");
      llIll[lllII[2]] = lIIlIll("dkTis7xt", "ZdwPT");
      llIll[lllII[6]] = lIIllII("0SG66Sd8PFE=", "LpiAO");
      llIll[lllII[3]] = lIIllII("LAqwkloiVEk=", "EujLd");
   }

   public final int 〥ҳⱆ() {
      return this.ⲋ;
   }

   private static String lIIllII(String lllllIlIlIlIIII, String lllllIlIlIIllIl) {
      try {
         SecretKeySpec lllllIlIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllIlIlIIlIll = Cipher.getInstance("Blowfish");
         lllllIlIlIIlIll.init(lllII[2], lllllIlIlIlIIll);
         return new String(lllllIlIlIIlIll.doFinal(Base64.getDecoder().decode(lllllIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(int var1) {
      this.ĂƂ = var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final int ĂƂ() {
      return this.ĂƂ;
   }

   @NotNull
   public String toString() {
      return String.valueOf((new StringBuilder()).append(llIll[lllII[1]]).append(this.ⲋ).append(llIll[lllII[0]]).append(this.ĂƂ).append(llIll[lllII[2]]).append(this.u).append(llIll[lllII[6]]).append(this.ᴃᎲ).append(llIll[lllII[3]]));
   }

   public Β(int var1, int var2, int var3, int var4) {
      super();
      this.ⲋ = var1;
      this.ĂƂ = var2;
      this.u = var3;
      this.ᴃᎲ = var4;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final int ᴃᎲ() {
      return this.ᴃᎲ;
   }

   private static void lIIlllI() {
      lllII = new int[9];
      lllII[0] = " ".length();
      lllII[1] = (122 ^ 73 ^ 123 ^ 111) & (111 ^ 15 ^ 33 ^ 102 ^ -" ".length());
      lllII[2] = "  ".length();
      lllII[3] = 87 ^ 83;
      lllII[4] = 156 ^ 148;
      lllII[5] = 209 ^ 193 ^ 142 ^ 145;
      lllII[6] = "   ".length();
      lllII[7] = 22 ^ 9;
      lllII[8] = 210 ^ 189 ^ 28 ^ 118;
   }

   private static boolean lIlIIII(int var0) {
      return var0 != 0;
   }

   public final int Ἒⅾ() {
      return this.ĂƂ;
   }

   private static boolean lIlIIIl(Object var0, Object var1) {
      return var0 != var1;
   }

   public Β() {
      this(lllII[1], lllII[1], lllII[1], lllII[1], lllII[5], (DefaultConstructorMarker)null);
   }

   public final int ς() {
      return this.ᴃᎲ;
   }
}
