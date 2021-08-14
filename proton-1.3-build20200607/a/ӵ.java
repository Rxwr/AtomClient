package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0004\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00018W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0096\u0004R\"\u0010\u0006\u001a\u00020\u00058C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\b¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/ӵ;", "", "ƶ", "()Ljava/lang/String;", "ⲋ", "", "ĂƂ", "La/ⅹ;", "()I", "La/ꝱᶁ;", "p0", "", "(La/ꝱᶁ;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class ӵ extends ⳅ {
   private static boolean llllIIIlIl(int var0, int var1) {
      return var0 < var1;
   }

   @ȵ
   public final void ⲋ(@NotNull ꝱᶁ var1) {
      Thread.sleep((long)this.ⲋ());
   }

   private static String lllIlllIll(String lIllllIIllIlllI, String lIllllIIlllIIlI) {
      lIllllIIllIlllI = new String(Base64.getDecoder().decode(lIllllIIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception lIllllIIllIllII = new StringBuilder();
      char[] lIllllIIlllIIII = lIllllIIlllIIlI.toCharArray();
      int lIllllIIllIllll = llIllllll[1];
      double lIllllIIllIlIIl = lIllllIIllIlllI.toCharArray();
      byte lIllllIIllIlIII = lIllllIIllIlIIl.length;
      int lIllllIIllIIlll = llIllllll[1];

      do {
         if (!llllIIIlIl(lIllllIIllIIlll, lIllllIIllIlIII)) {
            return String.valueOf(lIllllIIllIllII);
         }

         char lIllllIIlllIlII = lIllllIIllIlIIl[lIllllIIllIIlll];
         lIllllIIllIllII.append((char)(lIllllIIlllIlII ^ lIllllIIlllIIII[lIllllIIllIllll % lIllllIIlllIIII.length]));
         "".length();
         ++lIllllIIllIllll;
         ++lIllllIIllIIlll;
         "".length();
      } while(-" ".length() < "  ".length());

      return null;
   }

   @JvmName(
      name = "ⲋ"
   )
   private final int ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[llIllllll[1]])).intValue();
   }

   public ӵ() {
      super(llIllllIl[llIllllll[2]], llIllllIl[llIllllll[3]], ı５.ĂƂ, llIllllll[1], (boolean)llIllllll[1], (boolean)llIllllll[1], llIllllll[4], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIllllIl[llIllllll[5]], llIllllll[1]).u((Object)llIllllll[1]).ᴃᎲ((Object)llIllllll[6]).ᴃᎲ(llIllllIl[llIllllll[7]]);
   }

   private static String lllIllllII(String lIllllIlIIlIIII, String lIllllIlIIIllll) {
      try {
         long lIllllIlIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIlIIIllll.getBytes(StandardCharsets.UTF_8)), llIllllll[9]), "DES");
         Cipher lIllllIlIIlIIlI = Cipher.getInstance("DES");
         lIllllIlIIlIIlI.init(llIllllll[2], lIllllIlIIIllII);
         return new String(lIllllIlIIlIIlI.doFinal(Base64.getDecoder().decode(lIllllIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      return String.valueOf(this.ⲋ());
   }

   private static void llllIIIIII() {
      llIllllll = new int[10];
      llIllllll[0] = " ".length();
      llIllllll[1] = (36 ^ 116) & ~(70 ^ 22);
      llIllllll[2] = "  ".length();
      llIllllll[3] = "   ".length();
      llIllllll[4] = 66 ^ 43 ^ 149 ^ 196;
      llIllllll[5] = 16 ^ 20;
      llIllllll[6] = -(86 ^ 80) & -25601 & 26605;
      llIllllll[7] = 8 ^ 13;
      llIllllll[8] = 41 ^ 55 ^ 77 ^ 85;
      llIllllll[9] = 169 ^ 161;
   }

   private static void lllIllllIl() {
      llIllllIl = new String[llIllllll[8]];
      llIllllIl[llIllllll[1]] = lllIlllIlI("XFi+lz29DgU=", "MmsWo");
      llIllllIl[llIllllll[0]] = lllIlllIll("AgwcJz8LDkBeHw==", "eihwV");
      llIllllIl[llIllllll[2]] = lllIlllIll("MSkIKwQWLw==", "wHcNH");
      llIllllIl[llIllllll[3]] = lllIllllII("saIpBVqZQHgmlNnNBl5ISuTpU5oVcLplTnBPuVkh2waNsz85JdM+9mGSJYhfNaY0", "ABNUP");
      llIllllIl[llIllllll[5]] = lllIllllII("+r01iB0ZdaA=", "MJOrc");
      llIllllIl[llIllllll[7]] = lllIllllII("HXoOMGcwLZY=", "eCwva");
   }

   static {
      llllIIIIII();
      lllIllllIl();
      KProperty[] var10000 = new KProperty[llIllllll[0]];
      var10000[llIllllll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ӵ.class), llIllllIl[llIllllll[1]], llIllllIl[llIllllll[0]]));
      ⲋ = var10000;
   }

   private static String lllIlllIlI(String lIllllIlIIIIIIl, String lIllllIlIIIIIlI) {
      try {
         boolean lIllllIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIllllIlIIIIlIl = Cipher.getInstance("Blowfish");
         lIllllIlIIIIlIl.init(llIllllll[2], lIllllIIlllllll);
         return new String(lIllllIlIIIIlIl.doFinal(Base64.getDecoder().decode(lIllllIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
