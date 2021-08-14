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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\rB\u0007¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007¨\u0006\u0086\u008e\u0002R\"\u0010\u0003\u001a\u00020\b8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\n¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/ᴟ;", "", "p0", "ĂƂ", "La/ⅹ;", "ⲋ", "()D", "(D)V", "", "u", "()Z", "<init>", "()V", "La/ⳅ;"}
)
public final class ᴟ extends ⳅ {
   public ᴟ() {
      super(lIIlIIllIl[lIIllIIIIl[4]], lIIlIIllIl[lIIllIIIIl[5]], ı５.ĂƂ, lIIllIIIIl[1], (boolean)lIIllIIIIl[1], (boolean)lIIllIIIIl[1], lIIllIIIIl[6], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIlIIllIl[lIIllIIIIl[7]], 5.0D).u((Object)0.1D).ᴃᎲ((Object)60.0D).ᴃᎲ(lIIlIIllIl[lIIllIIIIl[8]]);
      this.u = this.ⲋ(lIIlIIllIl[lIIllIIIIl[9]], Boolean.valueOf((boolean)lIIllIIIIl[2])).u(lIIlIIllIl[lIIllIIIIl[10]]);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIIllIIIIl[1]])).doubleValue();
   }

   static {
      lIlIIIIllII();
      lIlIIIIlIII();
      KProperty[] var10000 = new KProperty[lIIllIIIIl[0]];
      var10000[lIIllIIIIl[1]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ᴟ.class), lIIlIIllIl[lIIllIIIIl[1]], lIIlIIllIl[lIIllIIIIl[2]]));
      var10000[lIIllIIIIl[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ᴟ.class), lIIlIIllIl[lIIllIIIIl[0]], lIIlIIllIl[lIIllIIIIl[3]]));
      ⲋ = var10000;
   }

   private static String lIIlllIllll(String lIlIIllIIlIlIll, String lIlIIllIIlIlIlI) {
      try {
         float lIlIIllIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         float lIlIIllIIlIIllI = Cipher.getInstance("Blowfish");
         lIlIIllIIlIIllI.init(lIIllIIIIl[0], lIlIIllIIlIIlll);
         return new String(lIlIIllIIlIIllI.doFinal(Base64.getDecoder().decode(lIlIIllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIIIIIlll(String lIlIIllIIIIIllI, String lIlIIllIIIIIIll) {
      try {
         SecretKeySpec lIlIIllIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), lIIllIIIIl[9]), "DES");
         Cipher lIlIIllIIIIlIII = Cipher.getInstance("DES");
         lIlIIllIIIIlIII.init(lIIllIIIIl[0], lIlIIllIIIIlIIl);
         return new String(lIlIIllIIIIlIII.doFinal(Base64.getDecoder().decode(lIlIIllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return (Boolean)this.u.ⲋ(this, ⲋ[lIIllIIIIl[2]]);
   }

   private static void lIlIIIIllII() {
      lIIllIIIIl = new int[12];
      lIIllIIIIl[0] = "  ".length();
      lIIllIIIIl[1] = (201 ^ 159) & ~(86 ^ 0);
      lIIllIIIIl[2] = " ".length();
      lIIllIIIIl[3] = "   ".length();
      lIIllIIIIl[4] = 67 ^ 71;
      lIIllIIIIl[5] = 89 + 81 - 134 + 106 ^ 89 + 133 - 167 + 84;
      lIIllIIIIl[6] = 69 ^ 125;
      lIIllIIIIl[7] = 114 ^ 116;
      lIIllIIIIl[8] = 71 ^ 55 ^ 240 ^ 135;
      lIIllIIIIl[9] = 54 ^ 62;
      lIIllIIIIl[10] = 252 ^ 152 ^ 60 ^ 81;
      lIIllIIIIl[11] = 37 + 38 - -52 + 26 ^ 134 + 40 - 57 + 30;
   }

   private static boolean lIlIIIIlllI(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIIIIIllI(String lIlIIllIIIllIll, String lIlIIllIIIlIlIl) {
      lIlIIllIIIllIll = new String(Base64.getDecoder().decode(lIlIIllIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String lIlIIllIIIlIlII = new StringBuilder();
      char[] lIlIIllIIIllIII = lIlIIllIIIlIlIl.toCharArray();
      int lIlIIllIIIlIlll = lIIllIIIIl[1];
      float lIlIIllIIIlIIIl = lIlIIllIIIllIll.toCharArray();
      Exception lIlIIllIIIlIIII = lIlIIllIIIlIIIl.length;
      int lIlIIllIIIIllll = lIIllIIIIl[1];

      do {
         if (!lIlIIIIlllI(lIlIIllIIIIllll, lIlIIllIIIlIIII)) {
            return String.valueOf(lIlIIllIIIlIlII);
         }

         long lIlIIllIIIIlllI = lIlIIllIIIlIIIl[lIlIIllIIIIllll];
         lIlIIllIIIlIlII.append((char)(lIlIIllIIIIlllI ^ lIlIIllIIIllIII[lIlIIllIIIlIlll % lIlIIllIIIllIII.length]));
         "".length();
         ++lIlIIllIIIlIlll;
         ++lIlIIllIIIIllll;
         "".length();
      } while(((98 ^ 66) & ~(118 ^ 86)) == 0);

      return null;
   }

   private static void lIlIIIIlIII() {
      lIIlIIllIl = new String[lIIllIIIIl[11]];
      lIIlIIllIl[lIIllIIIIl[1]] = lIIlllIllll("KYnC1DczuKY=", "hgoJU");
      lIIlIIllIl[lIIllIIIIl[2]] = lIlIIIIIllI("MgwSCx05CB9nURE=", "UifOx");
      lIIlIIllIl[lIIllIIIIl[0]] = lIlIIIIIlll("n8z/iGHFjmgg03qkuUdkxg==", "KKfZO");
      lIIlIIllIl[lIIllIIIIl[3]] = lIlIIIIIlll("cTKOo798FKF7w/FNAKUnDmgQKAS1HVOM", "HOMjy");
      lIIlIIllIl[lIIllIIIIl[4]] = lIlIIIIIllI("LzwjOSELKjg4HQsqIw==", "nIWVs");
      lIIlIIllIl[lIIllIIIIl[5]] = lIlIIIIIllI("CTwlDQc7cDANBWgkJkIRPSQmDxE8OSoDHCQpaRAVKz8nDBUrJGkWH2gjLBAGLSI6TA==", "HPIbp");
      lIIlIIllIl[lIIllIIIIl[7]] = lIlIIIIIlll("bAyzJ2tzTcw=", "pagyi");
      lIIlIIllIl[lIIllIIIIl[8]] = lIIlllIllll("uskV3s0MemE=", "wvSUs");
      lIIlIIllIl[lIIllIIIIl[9]] = lIlIIIIIlll("NtNIekmF5HIXBoH96u2VsA==", "beSEg");
      lIIlIIllIl[lIIllIIIIl[10]] = lIIlllIllll("cD6SbBnotfZ/Zsy4RkWOsbts9O6vvDoty/EBz0cN6rl/wEgiwTC4YYuw74bCL6Rv7dyw7J0KdsXK8sYOWNqvQXWWRwI7Rc7Juszje2lyqLs=", "VqfKF");
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.ĂƂ.ⲋ(this, ⲋ[lIIllIIIIl[1]], var1);
   }
}
