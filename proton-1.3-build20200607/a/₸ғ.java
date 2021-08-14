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
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0016B\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001a\u0006*\u00020\u00010\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR\u001b\u0010\b\u001a\u0006*\u00020\u00010\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0086\u0004R\"\u0010\f\u001a\u00020\t8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0086\u0084\u0002R\"\u0010\u0004\u001a\u00020\r8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\b\u0010\u000e¨\u0006\u0086\u0084\u0002R\"\u0010\u0002\u001a\u00020\r8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\f\u0010\u000e¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/₸ғ;", "Lnet/minecraft/util/math/Vec3d;", "〥ҳⱆ", "Lnet/minecraft/util/math/Vec3d;", "ᴃᎲ", "()Lnet/minecraft/util/math/Vec3d;", "ⲋ", "(Lnet/minecraft/util/math/Vec3d;)V", "ĂƂ", "", "La/ⅹ;", "()Z", "u", "", "()D", "La/Ƈ;", "p0", "", "(La/Ƈ;)V", "Đ", "()V", "<init>", "La/ⳅ;"}
)
public final class ₸ғ extends ⳅ {
   private static String lIIlIlllIIl(String lIlIlIlIIIIlIlI, String lIlIlIlIIIIIlll) {
      try {
         boolean lIlIlIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIlIlIlIIIIllII = Cipher.getInstance("Blowfish");
         lIlIlIlIIIIllII.init(lIIIllIIIl[3], lIlIlIlIIIIIllI);
         return new String(lIlIlIlIIIIllII.doFinal(Base64.getDecoder().decode(lIlIlIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIIIlll(int var0) {
      return var0 != 0;
   }

   static {
      lIIllIIIlIl();
      lIIllIIIIII();
      KProperty[] var10000 = new KProperty[lIIIllIIIl[0]];
      var10000[lIIIllIIIl[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(₸ғ.class), lIIIlIlIII[lIIIllIIIl[1]], lIIIlIlIII[lIIIllIIIl[2]]));
      var10000[lIIIllIIIl[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(₸ғ.class), lIIIlIlIII[lIIIllIIIl[3]], lIIIlIlIII[lIIIllIIIl[0]]));
      var10000[lIIIllIIIl[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(₸ғ.class), lIIIlIlIII[lIIIllIIIl[4]], lIIIlIlIII[lIIIllIIIl[5]]));
      ⲋ = var10000;
   }

   private static void lIIllIIIlIl() {
      lIIIllIIIl = new int[15];
      lIIIllIIIl[0] = "   ".length();
      lIIIllIIIl[1] = "  ".length() & ~"  ".length();
      lIIIllIIIl[2] = " ".length();
      lIIIllIIIl[3] = "  ".length();
      lIIIllIIIl[4] = 173 ^ 169;
      lIIIllIIIl[5] = 95 ^ 90;
      lIIIllIIIl[6] = 107 ^ 109;
      lIIIllIIIl[7] = 82 ^ 85;
      lIIIllIIIl[8] = 124 ^ 116;
      lIIIllIIIl[9] = 157 ^ 148;
      lIIIllIIIl[10] = 73 ^ 3 ^ 110 ^ 60;
      lIIIllIIIl[11] = 73 + 123 - 172 + 143 ^ 164 + 33 - 127 + 103;
      lIIIllIIIl[12] = 161 ^ 170;
      lIIIllIIIl[13] = 72 ^ 126 ^ 80 ^ 106;
      lIIIllIIIl[14] = 10 ^ 0 ^ 125 ^ 122;
   }

   public ₸ғ() {
      super(lIIIlIlIII[lIIIllIIIl[8]], lIIIlIlIII[lIIIllIIIl[9]], ı５.Ꜥ, lIIIllIIIl[1], (boolean)lIIIllIIIl[1], (boolean)lIIIllIIIl[2], lIIIllIIIl[10], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIIlIlIII[lIIIllIIIl[11]], Boolean.valueOf((boolean)lIIIllIIIl[2]));
      this.u = this.ⲋ(lIIIlIlIII[lIIIllIIIl[12]], 0.0D).u((Object)DoubleCompanionObject.INSTANCE.getMIN_VALUE()).ᴃᎲ((Object)DoubleCompanionObject.INSTANCE.getMAX_VALUE());
      this.ᴃᎲ = this.ⲋ(lIIIlIlIII[lIIIllIIIl[13]], 0.0D).u((Object)DoubleCompanionObject.INSTANCE.getMIN_VALUE()).ᴃᎲ((Object)DoubleCompanionObject.INSTANCE.getMAX_VALUE());
      this.〥ҳⱆ = Vec3d.field_186680_a;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[lIIIllIIIl[2]])).doubleValue();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final Vec3d ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   @ȵ
   public final void ⲋ(@NotNull Ƈ var1) {
      if (lIIllIIIlll(StringsKt.startsWith$default(var1.ᴃᎲ(), lIIIlIlIII[lIIIllIIIl[6]], (boolean)lIIIllIIIl[1], lIIIllIIIl[3], (Object)null))) {
         var1.ⲋ(lIIIlIlIII[lIIIllIIIl[7]]);
      }

   }

   private static String lIIlIllllII(String lIlIlIlIIlIllll, String lIlIlIlIIlIllII) {
      try {
         double lIlIlIlIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIIlIllII.getBytes(StandardCharsets.UTF_8)), lIIIllIIIl[8]), "DES");
         Cipher lIlIlIlIIllIIIl = Cipher.getInstance("DES");
         lIlIlIlIIllIIIl.init(lIIIllIIIl[3], lIlIlIlIIlIlIll);
         return new String(lIlIlIlIIllIIIl.doFinal(Base64.getDecoder().decode(lIlIlIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final boolean ⲋ() {
      return (Boolean)this.ĂƂ.ⲋ(this, ⲋ[lIIIllIIIl[1]]);
   }

   @JvmName(
      name = "u"
   )
   public final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[lIIIllIIIl[3]])).doubleValue();
   }

   private static String lIIlIlllIll(String lIlIlIlIIIllIlI, String lIlIlIlIIIllllI) {
      lIlIlIlIIIllIlI = new String(Base64.getDecoder().decode(lIlIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlIlIlIIIlllIl = new StringBuilder();
      char[] lIlIlIlIIIlllII = lIlIlIlIIIllllI.toCharArray();
      int lIlIlIlIIIllIll = lIIIllIIIl[1];
      Exception lIlIlIlIIIlIlIl = lIlIlIlIIIllIlI.toCharArray();
      float lIlIlIlIIIlIlII = lIlIlIlIIIlIlIl.length;
      int lIlIlIlIIIlIIll = lIIIllIIIl[1];

      do {
         if (!lIIllIIlIlI(lIlIlIlIIIlIIll, lIlIlIlIIIlIlII)) {
            return String.valueOf(lIlIlIlIIIlllIl);
         }

         float lIlIlIlIIIlIIlI = lIlIlIlIIIlIlIl[lIlIlIlIIIlIIll];
         lIlIlIlIIIlllIl.append((char)(lIlIlIlIIIlIIlI ^ lIlIlIlIIIlllII[lIlIlIlIIIllIll % lIlIlIlIIIlllII.length]));
         "".length();
         ++lIlIlIlIIIllIll;
         ++lIlIlIlIIIlIIll;
         "".length();
      } while(((233 ^ 170) & ~(1 ^ 66)) < "   ".length());

      return null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(Vec3d var1) {
      this.〥ҳⱆ = var1;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final Vec3d 〥ҳⱆ() {
      return this.ɡ().field_71439_g.func_174791_d().func_178788_d(this.〥ҳⱆ);
   }

   private static boolean lIIllIIIllI(Object var0) {
      return var0 != null;
   }

   private static void lIIllIIIIII() {
      lIIIlIlIII = new String[lIIIllIIIl[14]];
      lIIIlIlIII[lIIIllIIIl[1]] = lIIlIlllIIl("EBJebjUp29s=", "tXEun");
      lIIIlIlIII[lIIIllIIIl[2]] = lIIlIlllIll("Eg0gGyAbDDskaVwy", "uhTIA");
      lIIIlIlIII[lIIIllIIIl[3]] = lIIlIlllIIl("WFXToZ9rm1M=", "GlZJx");
      lIIIlIlIII[lIIIllIIIl[0]] = lIIlIlllIll("PTY5LExzFw==", "ZSMtd");
      lIIIlIlIII[lIIIllIIIl[4]] = lIIlIlllIll("Hg==", "diSHi");
      lIIIlIlIII[lIIIllIIIl[5]] = lIIlIllllII("A2l3KfppsJQ=", "vMHsm");
      lIIIlIlIII[lIIIllIIIl[6]] = lIIlIllllII("En8bMErZ5t4=", "lporp");
      lIIIlIlIII[lIIIllIIIl[7]] = lIIlIlllIIl("hBNVvlA+lGg=", "pMGwN");
      lIIIlIlIII[lIIIllIIIl[8]] = lIIlIlllIll("EikdDRM7JwQMIw==", "THvhP");
      lIIIlIlIII[lIIIllIIIl[9]] = lIIlIlllIIl("taTJlsJLZF/QGIW2dwBG5Ta1RPoC7LkaUtA+0UlJ978ETsBGule51A==", "kDmIm");
      lIIIlIlIII[lIIIllIIIl[11]] = lIIlIllllII("R2XFOt736+Q=", "xoRel");
      lIIIlIlIII[lIIIllIIIl[12]] = lIIlIlllIll("KA==", "pBfgK");
      lIIIlIlIII[lIIIllIIIl[13]] = lIIlIlllIIl("819PWqIOAbY=", "DHgrv");
   }

   private static boolean lIIllIIlIlI(int var0, int var1) {
      return var0 < var1;
   }

   protected void Đ() {
      super.Đ();
      if (lIIllIIIllI(this.ɡ().field_71439_g)) {
         this.〥ҳⱆ = new Vec3d(this.ɡ().field_71439_g.field_70165_t, 0.0D, this.ɡ().field_71439_g.field_70161_v);
      }

   }
}
