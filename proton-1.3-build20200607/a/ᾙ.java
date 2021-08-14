package a;

import java.awt.Color;
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
import net.minecraft.client.renderer.GlStateManager.FogMode;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R&\u0010\u0002\u001a\u0006*\u00020\u00060\u00068G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\u0086\u0084\u0002R\"\u0010\b\u001a\u00020\n8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0002\u0010\u000b¨\u0006\u0086\u0084\u0002R\"\u0010\u0007\u001a\u00020\f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/ᾙ;", "", "ĂƂ", "La/ⅹ;", "ⲋ", "()Z", "Ljava/awt/Color;", "ᴃᎲ", "u", "()Ljava/awt/Color;", "", "()D", "Lnet/minecraft/client/renderer/GlStateManager$FogMode;", "〥ҳⱆ", "()Lnet/minecraft/client/renderer/GlStateManager$FogMode;", "<init>", "()V", "La/ⳅ;"}
)
public final class ᾙ extends ⳅ {
   public ᾙ() {
      super(lllllIIIl[lllllIIll[8]], lllllIIIl[lllllIIll[9]], ı５.〥ҳⱆ, lllllIIll[1], (boolean)lllllIIll[1], (boolean)lllllIIll[1], lllllIIll[10], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lllllIIIl[lllllIIll[11]], Boolean.valueOf((boolean)lllllIIll[2]));
      this.u = this.ⲋ(lllllIIIl[lllllIIll[12]], 0.0D).u((Object)0.0D).ᴃᎲ((Object)1.0D);
      this.ᴃᎲ = this.ⲋ(lllllIIIl[lllllIIll[13]], Color.black);
      this.〥ҳⱆ = this.ⲋ(lllllIIIl[lllllIIll[14]], FogMode.EXP);
   }

   private static String lIIIIlllIIl(String lIllIlIIllIIllI, String lIllIlIIllIIlll) {
      try {
         SecretKeySpec lIllIlIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIIllIIlll.getBytes(StandardCharsets.UTF_8)), lllllIIll[8]), "DES");
         double lIllIlIIllIIIll = Cipher.getInstance("DES");
         lIllIlIIllIIIll.init(lllllIIll[3], lIllIlIIllIlIll);
         return new String(lIllIlIIllIIIll.doFinal(Base64.getDecoder().decode(lIllIlIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "u"
   )
   public final Color u() {
      return (Color)this.ᴃᎲ.ⲋ(this, ⲋ[lllllIIll[3]]);
   }

   private static String lIIIIlllIlI(String lIllIlIIlIllIIl, String lIllIlIIlIllIII) {
      try {
         SecretKeySpec lIllIlIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte lIllIlIIlIlIllI = Cipher.getInstance("Blowfish");
         lIllIlIIlIlIllI.init(lllllIIll[3], lIllIlIIlIllllI);
         return new String(lIllIlIIlIlIllI.doFinal(Base64.getDecoder().decode(lIllIlIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIlIIlIll(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final boolean ⲋ() {
      return (Boolean)this.ĂƂ.ⲋ(this, ⲋ[lllllIIll[1]]);
   }

   private static void lIIIlIIlIlI() {
      lllllIIll = new int[16];
      lllllIIll[0] = 88 ^ 92;
      lllllIIll[1] = (119 ^ 44) & ~(204 ^ 151);
      lllllIIll[2] = " ".length();
      lllllIIll[3] = "  ".length();
      lllllIIll[4] = "   ".length();
      lllllIIll[5] = 12 + 99 - -46 + 4 ^ 132 + 53 - 74 + 53;
      lllllIIll[6] = 235 ^ 134 ^ 71 ^ 44;
      lllllIIll[7] = 80 ^ 87;
      lllllIIll[8] = 138 ^ 140 ^ 140 ^ 130;
      lllllIIll[9] = 181 ^ 141 ^ 47 ^ 30;
      lllllIIll[10] = 164 ^ 156;
      lllllIIll[11] = 24 ^ 18;
      lllllIIll[12] = 183 ^ 188;
      lllllIIll[13] = 63 + 43 - 21 + 72 ^ 64 + 23 - -5 + 53;
      lllllIIll[14] = 60 ^ 49;
      lllllIIll[15] = 111 ^ 113 ^ 61 ^ 45;
   }

   private static void lIIIlIIIlIl() {
      lllllIIIl = new String[lllllIIll[15]];
      lllllIIIl[lllllIIll[1]] = lIIIIlllIIl("LvyHEqjUeqDPK8u36jrpzg==", "GRtOB");
      lllllIIIl[lllllIIll[2]] = lIIIIlllIlI("VY1Js6SK/TxMYzApAcP9X1x/EDTiQDRp", "rJrNa");
      lllllIIIl[lllllIIll[3]] = lIIIIlllIlI("TDID8ipjGi2tL2K2ERdE2Q==", "xEXRf");
      lllllIIIl[lllllIIll[4]] = lIIIIlllIlI("8ubvoZLoSKvN73JjNTvNv5ZM10+DQq1d", "nrxLO");
      lllllIIIl[lllllIIll[0]] = lIIIIlllIIl("Ewy8mu8PlxQabDdTmfz1Ow==", "aGvgi");
      lllllIIIl[lllllIIll[5]] = lIIIIlllIll("FDQMACoUEhcqKgF5UQovEicZaSQEJVcFKh8+Cn0=", "sQxFE");
      lllllIIIl[lllllIIll[6]] = lIIIIlllIlI("nTjwrtT1+BA=", "Zczan");
      lllllIIIl[lllllIIll[7]] = lIIIIlllIll("FSg5MScVACITLVpkARktBmIgHiYXLj8WLgZiLhshFyM5WDoXIykSOhc/YjAkITksAy0/LCMWLxc/aTEnFQAiEy1J", "rMMwH");
      lllllIIIl[lllllIIll[8]] = lIIIIlllIIl("6Yx/l7/y3XQ=", "VueRM");
      lllllIIIl[lllllIIll[9]] = lIIIIlllIIl("5IFPFkIOazgCnpAgBBYx0DLCWJtyEp7TSzY3LJb99SNI0Rgmpx7WHapN4WbkV2uyc3uhHxSXjXM=", "SUQnm");
      lllllIIIl[lllllIIll[11]] = lIIIIlllIll("HjgWOAo2NA==", "ZQeYh");
      lllllIIIl[lllllIIll[12]] = lIIIIlllIlI("ixCYK6wanr4=", "oNqIl");
      lllllIIIl[lllllIIll[13]] = lIIIIlllIIl("/NI/57mMyEU=", "QVioS");
      lllllIIIl[lllllIIll[14]] = lIIIIlllIlI("tGzrZY/EtU0=", "oFzdy");
   }

   private static String lIIIIlllIll(String lIllIlIIlIIlIll, String lIllIlIIlIIlIlI) {
      lIllIlIIlIIlIll = new String(Base64.getDecoder().decode(lIllIlIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIllIlIIlIIlIIl = new StringBuilder();
      char[] lIllIlIIlIIlIII = lIllIlIIlIIlIlI.toCharArray();
      int lIllIlIIlIIIIlI = lllllIIll[1];
      byte lIllIlIIlIIIIIl = lIllIlIIlIIlIll.toCharArray();
      Exception lIllIlIIlIIIIII = lIllIlIIlIIIIIl.length;
      int lIllIlIIIllllll = lllllIIll[1];

      do {
         if (!lIIIlIIlIll(lIllIlIIIllllll, lIllIlIIlIIIIII)) {
            return String.valueOf(lIllIlIIlIIlIIl);
         }

         char lIllIlIIlIIllII = lIllIlIIlIIIIIl[lIllIlIIIllllll];
         lIllIlIIlIIlIIl.append((char)(lIllIlIIlIIllII ^ lIllIlIIlIIlIII[lIllIlIIlIIIIlI % lIllIlIIlIIlIII.length]));
         "".length();
         ++lIllIlIIlIIIIlI;
         ++lIllIlIIIllllll;
         "".length();
      } while(" ".length() >= 0);

      return null;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[lllllIIll[2]])).doubleValue();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final FogMode ᴃᎲ() {
      return (FogMode)this.〥ҳⱆ.ⲋ(this, ⲋ[lllllIIll[4]]);
   }

   static {
      lIIIlIIlIlI();
      lIIIlIIIlIl();
      KProperty[] var10000 = new KProperty[lllllIIll[0]];
      var10000[lllllIIll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ᾙ.class), lllllIIIl[lllllIIll[1]], lllllIIIl[lllllIIll[2]]));
      var10000[lllllIIll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ᾙ.class), lllllIIIl[lllllIIll[3]], lllllIIIl[lllllIIll[4]]));
      var10000[lllllIIll[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ᾙ.class), lllllIIIl[lllllIIll[0]], lllllIIIl[lllllIIll[5]]));
      var10000[lllllIIll[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ᾙ.class), lllllIIIl[lllllIIll[6]], lllllIIIl[lllllIIll[7]]));
      ⲋ = var10000;
   }
}
