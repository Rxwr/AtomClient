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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\fB\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0086\u0084\u0002R\u001a\u0010\u0006\u001a\u00020\u00078W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0096\u0004"},
   d2 = {"La/ºẤ;", "", "ĂƂ", "La/ⅹ;", "ⲋ", "()D", "u", "", "ƶ", "()Ljava/lang/String;", "<init>", "()V", "La/ⳅ;"}
)
public final class ºẤ extends ⳅ {
   private static String llIllIIIIl(String llIIIlIIIllIIIl, String llIIIlIIIllIIII) {
      llIIIlIIIllIIIl = new String(Base64.getDecoder().decode(llIIIlIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      byte llIIIlIIIlIlIlI = new StringBuilder();
      char[] llIIIlIIIlIlllI = llIIIlIIIllIIII.toCharArray();
      int llIIIlIIIlIllIl = llIlIIlll[1];
      float llIIIlIIIlIIlll = llIIIlIIIllIIIl.toCharArray();
      Exception llIIIlIIIlIIllI = llIIIlIIIlIIlll.length;
      int llIIIlIIIlIIlIl = llIlIIlll[1];

      do {
         if (!llIllIllIl(llIIIlIIIlIIlIl, llIIIlIIIlIIllI)) {
            return String.valueOf(llIIIlIIIlIlIlI);
         }

         char llIIIlIIIllIIlI = llIIIlIIIlIIlll[llIIIlIIIlIIlIl];
         llIIIlIIIlIlIlI.append((char)(llIIIlIIIllIIlI ^ llIIIlIIIlIlllI[llIIIlIIIlIllIl % llIIIlIIIlIlllI.length]));
         "".length();
         ++llIIIlIIIlIllIl;
         ++llIIIlIIIlIIlIl;
         "".length();
      } while((153 ^ 128 ^ 150 ^ 139) == (153 + 28 - 89 + 70 ^ 51 + 165 - 109 + 59));

      return null;
   }

   public ºẤ() {
      super(llIIlllll[llIlIIlll[6]], llIIlllll[llIlIIlll[7]], ı５.〥ҳⱆ, llIlIIlll[1], (boolean)llIlIIlll[1], (boolean)llIlIIlll[1], llIlIIlll[8], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIIlllll[llIlIIlll[9]], 1.0D).u((Object)0.0D).ᴃᎲ((Object)1.0D);
      this.u = this.ⲋ(llIIlllll[llIlIIlll[10]], 1.0D).u((Object)0.0D).ᴃᎲ((Object)1.0D);
   }

   static {
      llIllIllII();
      llIllIIllI();
      KProperty[] var10000 = new KProperty[llIlIIlll[0]];
      var10000[llIlIIlll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ºẤ.class), llIIlllll[llIlIIlll[1]], llIIlllll[llIlIIlll[2]]));
      var10000[llIlIIlll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ºẤ.class), llIIlllll[llIlIIlll[0]], llIIlllll[llIlIIlll[3]]));
      ⲋ = var10000;
   }

   private static String llIlIlllll(String llIIIlIIIllllll, String llIIIlIIIlllllI) {
      try {
         SecretKeySpec llIIIlIIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIIlIIlIIIIll = Cipher.getInstance("Blowfish");
         llIIIlIIlIIIIll.init(llIlIIlll[0], llIIIlIIlIIIlII);
         return new String(llIIIlIIlIIIIll.doFinal(Base64.getDecoder().decode(llIIIlIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String llIllIIIlI(String llIIIlIIIIlllII, String llIIIlIIIIllIIl) {
      try {
         SecretKeySpec llIIIlIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIIIllIIl.getBytes(StandardCharsets.UTF_8)), llIlIIlll[9]), "DES");
         long llIIIlIIIIlIlll = Cipher.getInstance("DES");
         llIIIlIIIIlIlll.init(llIlIIlll[0], llIIIlIIIIlllll);
         return new String(llIIIlIIIIlIlll.doFinal(Base64.getDecoder().decode(llIIIlIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[llIlIIlll[2]])).doubleValue();
   }

   private static void llIllIllII() {
      llIlIIlll = new int[12];
      llIlIIlll[0] = "  ".length();
      llIlIIlll[1] = (28 + 82 - -44 + 2 ^ 139 + 84 - 193 + 132) & (62 ^ 127 ^ 28 + 22 - 41 + 118 ^ -" ".length());
      llIlIIlll[2] = " ".length();
      llIlIIlll[3] = "   ".length();
      llIlIIlll[4] = 49 ^ 53;
      llIlIIlll[5] = 26 ^ 31;
      llIlIIlll[6] = 194 ^ 196;
      llIlIIlll[7] = 79 ^ 72;
      llIlIIlll[8] = 255 ^ 199;
      llIlIIlll[9] = 73 ^ 65;
      llIlIIlll[10] = 206 ^ 199 ^ (113 ^ 106) & ~(165 ^ 190);
      llIlIIlll[11] = 4 ^ 23 ^ 133 ^ 156;
   }

   private static boolean llIllIllIl(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[llIlIIlll[1]])).doubleValue();
   }

   private static void llIllIIllI() {
      llIIlllll = new String[llIlIIlll[11]];
      llIIlllll[llIlIIlll[1]] = llIlIlllll("YRMV6x5Vu4bZXahOY6mBpw==", "huuLP");
      llIIlllll[llIlIIlll[2]] = llIllIIIIl("LgYFEyMgBBklPywQAnl4DQ==", "IcqQQ");
      llIIlllll[llIlIIlll[0]] = llIllIIIIl("NDkkIBY=", "SXIMw");
      llIIlllll[llIlIIlll[3]] = llIllIIIlI("XEuWsZNL5SiOhbxedQabxA==", "IvTYT");
      llIIlllll[llIlIIlll[4]] = llIllIIIIl("QH9GEg==", "eQwtI");
      llIIlllll[llIlIIlll[5]] = llIlIlllll("UCLKB7vsK0g=", "ICGQD");
      llIIlllll[llIlIIlll[6]] = llIllIIIlI("zc19LrNTqiX7p4pEnGleYw==", "GhERS");
      llIIlllll[llIlIIlll[7]] = llIlIlllll("Ehc3945dlocAI2li/4JCMN8f0FSzT0eW", "WbbXO");
      llIIlllll[llIlIIlll[9]] = llIllIIIlI("lnZKA4t7xsbxIVVqD9n0ag==", "qsOTj");
      llIIlllll[llIlIIlll[10]] = llIlIlllll("EZg8oASqzdc=", "BiLGM");
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      StringCompanionObject var1 = StringCompanionObject.INSTANCE;
      String var2 = llIIlllll[llIlIIlll[4]];
      Object[] var10000 = new Object[llIlIIlll[2]];
      var10000[llIlIIlll[1]] = this.ⲋ();
      Object[] var3 = var10000;
      int var4 = llIlIIlll[1];
      String var5 = String.format(var2, Arrays.copyOf(var3, var3.length));
      Intrinsics.checkExpressionValueIsNotNull(var5, llIIlllll[llIlIIlll[5]]);
      return var5;
   }
}
