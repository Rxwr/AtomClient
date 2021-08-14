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
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0004\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00018C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004R\"\u0010\u0006\u001a\u00020\u00058G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\b¨\u0006\u0086\u0084\u0002R\"\u0010\n\u001a\u00020\t8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u000b¨\u0006\u0086\u0084\u0002R\u001a\u0010\u0002\u001a\u00020\u00018C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0003¨\u0006\u0082\u0004R\"\u0010\f\u001a\u00020\u00058G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/ն;", "", "ᴃᎲ", "()D", "ⲋ", "", "ĂƂ", "La/ⅹ;", "()I", "", "u", "()Z", "〥ҳⱆ", "La/ꝱᶁ;", "p0", "", "(La/ꝱᶁ;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class ն extends ⳅ {
   @JvmName(
      name = "〥ҳⱆ"
   )
   private final double 〥ҳⱆ() {
      return ԥ.ⲋ.ĂƂ((double)this.ĂƂ() / 100.0D);
   }

   private static void lllIIlI() {
      lIlIll = new String[llIIlI[15]];
      lIlIll[llIIlI[1]] = llIIlIl("jQjFuvwVZC9uWUDX3me1vQ==", "YyXiq");
      lIlIll[llIIlI[2]] = llIlIII("QM0LUFVkSMi1V8Ewt6yKKT3LL91bkFlI", "LTPgP");
      lIlIll[llIIlI[3]] = llIIlIl("iAkgPbQPME0m/D4owDCvzQ==", "Dvnwu");
      lIlIll[llIIlI[0]] = llIIlIl("6hnEFX4e4FREK9e4VQISGQ==", "Uffzg");
      lIlIll[llIIlI[4]] = llIIlIl("MdqR29cgNUs=", "nQTfU");
      lIlIll[llIIlI[5]] = llIIlIl("bwDsv4RZPUYTcCzA0wbSdg==", "sxFjx");
      lIlIll[llIIlI[6]] = llIllll("DwQ8OQwwFSk=", "YaPVo");
      lIlIll[llIIlI[7]] = llIIlIl("Bkt4Pkf5+RDfVpeJH0mdFUJAVK372owwmA889MZCAUj02BWAYPXBm1ilpKgfgPZV", "tvKPl");
      lIlIll[llIIlI[9]] = llIllll("ARwEBjEmHQIOJw==", "IsvoK");
      lIlIll[llIIlI[11]] = llIlIII("SRQqY4TnGfw=", "SMJIp");
      lIlIll[llIIlI[12]] = llIlIII("3t/BHh0Hk1zhpq2hIVIslw==", "tbJGR");
      lIlIll[llIIlI[13]] = llIllll("aw==", "NNDgi");
      lIlIll[llIIlI[14]] = llIIlIl("DVZi3yJewno=", "eEagg");
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final int ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[llIIlI[2]])).intValue();
   }

   static {
      lllIIll();
      lllIIlI();
      KProperty[] var10000 = new KProperty[llIIlI[0]];
      var10000[llIIlI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ն.class), lIlIll[llIIlI[1]], lIlIll[llIIlI[2]]));
      var10000[llIIlI[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ն.class), lIlIll[llIIlI[3]], lIlIll[llIIlI[0]]));
      var10000[llIIlI[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ն.class), lIlIll[llIIlI[4]], lIlIll[llIIlI[5]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return (Boolean)this.ᴃᎲ.ⲋ(this, ⲋ[llIIlI[3]]);
   }

   private static String llIIlIl(String lllllIIIlIIIIll, String lllllIIIlIIIIlI) {
      try {
         int lllllIIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short lllllIIIlIIIIII = Cipher.getInstance("Blowfish");
         lllllIIIlIIIIII.init(llIIlI[3], lllllIIIlIIIIIl);
         return new String(lllllIIIlIIIIII.doFinal(Base64.getDecoder().decode(lllllIIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String llIllll(String lllllIIIllIIIlI, String lllllIIIllIIllI) {
      lllllIIIllIIIlI = new String(Base64.getDecoder().decode(lllllIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllIIIllIIlIl = new StringBuilder();
      char[] lllllIIIllIIlII = lllllIIIllIIllI.toCharArray();
      double lllllIIIlIllllI = llIIlI[1];
      byte lllllIIIlIlllIl = lllllIIIllIIIlI.toCharArray();
      long lllllIIIlIlllII = lllllIIIlIlllIl.length;
      int lllllIIIlIllIll = llIIlI[1];

      do {
         if (!lllIllI(lllllIIIlIllIll, lllllIIIlIlllII)) {
            return String.valueOf(lllllIIIllIIlIl);
         }

         double lllllIIIlIllIlI = lllllIIIlIlllIl[lllllIIIlIllIll];
         lllllIIIllIIlIl.append((char)(lllllIIIlIllIlI ^ lllllIIIllIIlII[lllllIIIlIllllI % lllllIIIllIIlII.length]));
         "".length();
         ++lllllIIIlIllllI;
         ++lllllIIIlIllIll;
         "".length();
      } while("  ".length() >= 0);

      return null;
   }

   private static boolean lllIllI(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final double ᴃᎲ() {
      return ԥ.ⲋ.ĂƂ((double)this.ⲋ() / 100.0D);
   }

   private static boolean lllIlII(int var0) {
      return var0 != 0;
   }

   public ն() {
      super(lIlIll[llIIlI[6]], lIlIll[llIIlI[7]], ı５.ᴃᎲ, llIIlI[1], (boolean)llIIlI[1], (boolean)llIIlI[1], llIIlI[8], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIlIll[llIIlI[9]], llIIlI[1]).u((Object)llIIlI[1]).ᴃᎲ((Object)llIIlI[10]).ᴃᎲ(lIlIll[llIIlI[11]]);
      this.u = this.ⲋ(lIlIll[llIIlI[12]], llIIlI[1]).u((Object)llIIlI[1]).ᴃᎲ((Object)llIIlI[10]).ᴃᎲ(lIlIll[llIIlI[13]]);
      this.ᴃᎲ = this.ⲋ(lIlIll[llIIlI[14]], Boolean.valueOf((boolean)llIIlI[2]));
   }

   private static String llIlIII(String lllllIIIlIlIIlI, String lllllIIIlIIllll) {
      try {
         long lllllIIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIIlIIllll.getBytes(StandardCharsets.UTF_8)), llIIlI[9]), "DES");
         Cipher lllllIIIlIlIlII = Cipher.getInstance("DES");
         lllllIIIlIlIlII.init(llIIlI[3], lllllIIIlIIlllI);
         return new String(lllllIIIlIlIlII.doFinal(Base64.getDecoder().decode(lllllIIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lllIIll() {
      llIIlI = new int[16];
      llIIlI[0] = "   ".length();
      llIIlI[1] = (178 ^ 194 ^ 35 ^ 127) & (189 ^ 137 ^ 39 ^ 63 ^ -" ".length());
      llIIlI[2] = " ".length();
      llIIlI[3] = "  ".length();
      llIIlI[4] = 99 ^ 103;
      llIIlI[5] = 75 ^ 9 ^ 59 ^ 124;
      llIIlI[6] = 123 ^ 125;
      llIIlI[7] = 4 ^ 75 ^ 253 ^ 181;
      llIIlI[8] = 74 ^ 44 ^ 51 ^ 109;
      llIIlI[9] = 129 + 136 - 190 + 109 ^ 92 + 61 - 131 + 154;
      llIIlI[10] = 29 ^ 84 ^ 87 ^ 122;
      llIIlI[11] = 39 ^ 46;
      llIIlI[12] = 65 ^ 75;
      llIIlI[13] = 178 ^ 185;
      llIIlI[14] = 57 ^ 53;
      llIIlI[15] = 43 ^ 38;
   }

   @ȵ
   public final void ⲋ(@NotNull ꝱᶁ lllllIIIlllIIll) {
      Packet lllllIIIlllIIlI = lllllIIIlllIIll.ᴃᎲ();
      if (lllIlII(lllllIIIlllIIlI instanceof SPacketEntityVelocity)) {
         ((SPacketEntityVelocity)lllllIIIlllIIll.ᴃᎲ()).field_149415_b = (int)((double)((SPacketEntityVelocity)lllllIIIlllIIll.ᴃᎲ()).field_149415_b * lllllIIIlllIlII.ᴃᎲ());
         ((SPacketEntityVelocity)lllllIIIlllIIll.ᴃᎲ()).field_149414_d = (int)((double)((SPacketEntityVelocity)lllllIIIlllIIll.ᴃᎲ()).field_149414_d * lllllIIIlllIlII.ᴃᎲ());
         ((SPacketEntityVelocity)lllllIIIlllIIll.ᴃᎲ()).field_149416_c = (int)((double)((SPacketEntityVelocity)lllllIIIlllIIll.ᴃᎲ()).field_149416_c * lllllIIIlllIlII.〥ҳⱆ());
         "".length();
         if (null != null) {
            return;
         }
      } else if (lllIlII(lllllIIIlllIIlI instanceof SPacketExplosion)) {
         ((SPacketExplosion)lllllIIIlllIIll.ᴃᎲ()).field_149152_f = (float)((double)((SPacketExplosion)lllllIIIlllIIll.ᴃᎲ()).field_149152_f * lllllIIIlllIlII.ᴃᎲ());
         ((SPacketExplosion)lllllIIIlllIIll.ᴃᎲ()).field_149159_h = (float)((double)((SPacketExplosion)lllllIIIlllIIll.ᴃᎲ()).field_149159_h * lllllIIIlllIlII.ᴃᎲ());
         ((SPacketExplosion)lllllIIIlllIIll.ᴃᎲ()).field_149153_g = (float)((double)((SPacketExplosion)lllllIIIlllIIll.ᴃᎲ()).field_149153_g * lllllIIIlllIlII.〥ҳⱆ());
         "".length();
         if (-" ".length() >= ((150 ^ 159 ^ 135 ^ 189) & (188 ^ 146 ^ 4 ^ 25 ^ -" ".length()))) {
            return;
         }
      }

   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[llIIlI[1]])).intValue();
   }
}
