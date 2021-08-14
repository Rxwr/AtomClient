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
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0010B\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00018W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0096\u0004R0\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\t\"\u0004\b\u0004\u0010\n¨\u0006\u0086\u008e\u0002"},
   d2 = {"La/ⱳ;", "", "ƶ", "()Ljava/lang/String;", "ⲋ", "", "p0", "ĂƂ", "La/ⅹ;", "()D", "(D)V", "", "ʅ", "()V", "Ἠ", "<init>", "La/ⳅ;"}
)
public final class ⱳ extends ⳅ {
   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.ĂƂ.ⲋ(this, ⲋ[lllIlII[1]], var1);
   }

   private static String lIIIIIIlI(String lllIllIlIIllllI, String lllIllIlIIlllll) {
      try {
         SecretKeySpec lllIllIlIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllIllIlIlIIIlI = Cipher.getInstance("Blowfish");
         lllIllIlIlIIIlI.init(lllIlII[2], lllIllIlIlIIIll);
         return new String(lllIllIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllIllIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIIIIIll(String lllIllIlIIlIIll, String lllIllIlIIlIIlI) {
      try {
         SecretKeySpec lllIllIlIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), lllIlII[7]), "DES");
         Cipher lllIllIlIIlIlIl = Cipher.getInstance("DES");
         lllIllIlIIlIlIl.init(lllIlII[2], lllIllIlIIlIllI);
         return new String(lllIllIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllIllIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lllIlII[1]])).doubleValue();
   }

   private static String lIIIIIIIl(String lllIllIlIllIlIl, String lllIllIlIllIlII) {
      lllIllIlIllIlIl = new String(Base64.getDecoder().decode(lllIllIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIllIlIllIIll = new StringBuilder();
      String lllIllIlIlIllIl = lllIllIlIllIlII.toCharArray();
      int lllIllIlIlIllII = lllIlII[1];
      double lllIllIlIlIlIll = lllIllIlIllIlIl.toCharArray();
      short lllIllIlIlIlIlI = lllIllIlIlIlIll.length;
      int lllIllIlIlIlIIl = lllIlII[1];

      do {
         if (!lIIIIlIII(lllIllIlIlIlIIl, lllIllIlIlIlIlI)) {
            return String.valueOf(lllIllIlIllIIll);
         }

         Exception lllIllIlIlIlIII = lllIllIlIlIlIll[lllIllIlIlIlIIl];
         lllIllIlIllIIll.append((char)(lllIllIlIlIlIII ^ lllIllIlIlIllIl[lllIllIlIlIllII % lllIllIlIlIllIl.length]));
         "".length();
         ++lllIllIlIlIllII;
         ++lllIllIlIlIlIIl;
         "".length();
      } while(-" ".length() <= ((71 ^ 103 ^ 100 ^ 72) & (31 ^ 12 ^ 14 ^ 17 ^ -" ".length())));

      return null;
   }

   public void Ἠ() {
      super.Ἠ();
      this.ɡ().field_71428_T.field_194149_e = 50.0F * (float)(1.0D / this.ⲋ());
   }

   protected void ʅ() {
      super.ʅ();
      this.ɡ().field_71428_T.field_194149_e = 50.0F;
   }

   public ⱳ() {
      super(lllIIlI[lllIlII[2]], lllIIlI[lllIlII[3]], ı５.ς, lllIlII[1], (boolean)lllIlII[1], (boolean)lllIlII[1], lllIlII[4], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lllIIlI[lllIlII[5]], 1.0D).u((Object)0.0D).ᴃᎲ((Object)2.0D);
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      return String.valueOf(this.ⲋ());
   }

   private static void lIIIIIlII() {
      lllIIlI = new String[lllIlII[6]];
      lllIIlI[lllIlII[1]] = lIIIIIIIl("OiAwHCo=", "IPUyN");
      lllIIlI[lllIlII[0]] = lIIIIIIlI("kaDh2ufk2HwTjPmBA9eS1g==", "wdNKm");
      lllIIlI[lllIlII[2]] = lIIIIIIlI("WSR/Uyp+9YA=", "nKcqc");
      lllIIlI[lllIlII[3]] = lIIIIIIIl("NxktJCwRUTUlPgZRLyYiER84bThUBSUpIFkDLT4uWg==", "tqLJK");
      lllIIlI[lllIlII[5]] = lIIIIIIll("F56YguuWQFk=", "iGHrS");
   }

   private static void lIIIIIllI() {
      lllIlII = new int[8];
      lllIlII[0] = " ".length();
      lllIlII[1] = (212 ^ 128 ^ 8 ^ 70) & (61 + 36 - 76 + 115 ^ 100 + 79 - 123 + 90 ^ -" ".length());
      lllIlII[2] = "  ".length();
      lllIlII[3] = "   ".length();
      lllIlII[4] = 67 ^ 123;
      lllIlII[5] = 202 ^ 199 ^ 6 ^ 15;
      lllIlII[6] = 21 ^ 16;
      lllIlII[7] = 0 ^ 8;
   }

   private static boolean lIIIIlIII(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIIIIIllI();
      lIIIIIlII();
      KProperty[] var10000 = new KProperty[lllIlII[0]];
      var10000[lllIlII[1]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⱳ.class), lllIIlI[lllIlII[1]], lllIIlI[lllIlII[0]]));
      ⲋ = var10000;
   }
}
