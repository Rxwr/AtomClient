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
import kotlin.reflect.KProperty;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0004\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0004\u0010\u000eJ\u0017\u0010\u0004\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0004\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\u0082\u0084\u0002R\"\u0010\n\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\n\u0010\t¨\u0006\u0082\u0084\u0002R\"\u0010\b\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/＿;", "", "ĂƂ", "La/ⅹ;", "ⲋ", "()D", "", "〥ҳⱆ", "ᴃᎲ", "()Z", "u", "La/ᶐ;", "p0", "", "(La/ᶐ;)V", "La/Ӄ;", "(La/Ӄ;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class ＿ extends ⳅ {
   @JvmName(
      name = "ᴃᎲ"
   )
   private final boolean ᴃᎲ() {
      return (Boolean)this.〥ҳⱆ.ⲋ(this, ⲋ[lIIIIIIlII[4]]);
   }

   private static int lIIIlIlllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIIIlIllIlI(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "u"
   )
   private final boolean u() {
      return (Boolean)this.ᴃᎲ.ⲋ(this, ⲋ[lIIIIIIlII[3]]);
   }

   private static int lIIIlIlllII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static void lIIIlIlIllI() {
      lIIIIIIlII = new int[18];
      lIIIIIIlII[0] = 180 ^ 195 ^ 249 ^ 138;
      lIIIIIIlII[1] = (145 ^ 172) & ~(95 ^ 98);
      lIIIIIIlII[2] = " ".length();
      lIIIIIIlII[3] = "  ".length();
      lIIIIIIlII[4] = "   ".length();
      lIIIIIIlII[5] = 122 ^ 127;
      lIIIIIIlII[6] = 144 ^ 182 ^ 22 ^ 54;
      lIIIIIIlII[7] = 88 ^ 95;
      lIIIIIIlII[8] = -(81 ^ 52 ^ 69 ^ 13);
      lIIIIIIlII[9] = 65 + 56 - 15 + 64 ^ 17 + 64 - 75 + 129;
      lIIIIIIlII[10] = 41 ^ 33;
      lIIIIIIlII[11] = 165 + 147 - 174 + 52 ^ 126 + 59 - 144 + 142;
      lIIIIIIlII[12] = 162 ^ 157 ^ 131 ^ 132;
      lIIIIIIlII[13] = 134 ^ 165 ^ 190 ^ 151;
      lIIIIIIlII[14] = 3 + 60 - 20 + 93 ^ 103 + 66 - 71 + 33;
      lIIIIIIlII[15] = 41 ^ 37;
      lIIIIIIlII[16] = 8 + 41 - 32 + 130 ^ 41 + 59 - 78 + 136;
      lIIIIIIlII[17] = 72 + 70 - 20 + 80 ^ 46 + 71 - 64 + 143;
   }

   private static boolean lIIIlIllIIl(int var0) {
      return var0 == 0;
   }

   private static boolean lIIIllIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   public ＿() {
      super(lllllIIII[lIIIIIIlII[10]], lllllIIII[lIIIIIIlII[11]], ı５.ᴃᎲ, lIIIIIIlII[1], (boolean)lIIIIIIlII[1], (boolean)lIIIIIIlII[1], lIIIIIIlII[12], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lllllIIII[lIIIIIIlII[13]], 0.21D).u((Object)0.0D).ᴃᎲ((Object)0.3D);
      this.u = this.ⲋ(lllllIIII[lIIIIIIlII[14]], 0.4D).u((Object)0.0D).ᴃᎲ((Object)0.42D);
      this.ᴃᎲ = this.ⲋ(lllllIIII[lIIIIIIlII[15]], Boolean.valueOf((boolean)lIIIIIIlII[2]));
      this.〥ҳⱆ = this.ⲋ(lllllIIII[lIIIIIIlII[16]], Boolean.valueOf((boolean)lIIIIIIlII[1]));
   }

   private static int lIIIlIllIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   @ȵ
   public final void ⲋ(@NotNull Ӄ lIllIIlllllIIlI) {
      if (!lIIIlIllIIl(lIllIIlllllIIll.ɡ().field_71439_g.field_70123_F)) {
         int lIllIIlllllIIIl = 0.2873F;
         byte lIllIIlllllIIII = lIllIIlllllIIll.ɡ().field_71439_g.field_71158_b.field_192832_b;
         long lIllIIllllIllll = lIllIIlllllIIll.ɡ().field_71439_g.field_71158_b.field_78902_a;
         boolean lIllIIllllIlllI = lIllIIlllllIIll.ɡ().field_71439_g.field_70125_A;
         int lIllIIllllIllIl = lIllIIlllllIIll.ɡ().field_71439_g.field_70177_z;
         if (lIIIlIllIlI(lIllIIlllllIIll.ɡ().field_71439_g.func_70644_a(MobEffects.field_76424_c))) {
            PotionEffect var10000 = lIllIIlllllIIll.ɡ().field_71439_g.func_70660_b(MobEffects.field_76424_c);
            if (lIIIlIllllI(var10000)) {
               Intrinsics.throwNpe();
            }

            byte lIllIIllllIllII = var10000.func_76458_c();
            lIllIIlllllIIIl *= 1.0F + 0.2F * (float)(lIllIIllllIllII + lIIIIIIlII[2]);
         }

         if (lIIIlIllIIl(lIIIlIlllII(lIllIIlllllIIII, 0.0F)) && lIIIlIllIIl(lIIIlIlllII(lIllIIllllIllll, 0.0F))) {
            lIllIIlllllIIlI.ⲋ(0.0D);
            lIllIIlllllIIlI.ĂƂ(0.0D);
            "".length();
            if (" ".length() > "   ".length()) {
               return;
            }
         } else {
            if (lIIIlIllIlI(lIIIlIlllII(lIllIIlllllIIII, 0.0F))) {
               int var10001;
               if (lIIIlIlllll(lIIIlIlllIl(lIllIIllllIllll, 0.0F))) {
                  if (lIIIlIlllll(lIIIlIlllIl(lIllIIlllllIIII, 0.0F))) {
                     var10001 = lIIIIIIlII[8];
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     var10001 = lIIIIIIlII[9];
                  }

                  lIllIIllllIllIl += (float)var10001;
                  "".length();
                  if ((20 ^ 111 ^ 42 + 19 - 30 + 96) <= ((142 + 236 - 261 + 124 ^ 30 + 35 - 38 + 168) & (73 + 33 - 47 + 70 ^ 25 + 89 - 94 + 159 ^ -" ".length()))) {
                     return;
                  }
               } else if (lIIIllIIIII(lIIIlIlllII(lIllIIllllIllll, 0.0F))) {
                  if (lIIIlIlllll(lIIIlIlllIl(lIllIIlllllIIII, 0.0F))) {
                     var10001 = lIIIIIIlII[9];
                     "".length();
                     if (" ".length() <= -" ".length()) {
                        return;
                     }
                  } else {
                     var10001 = lIIIIIIlII[8];
                  }

                  lIllIIllllIllIl += (float)var10001;
               }

               lIllIIllllIllll = 0.0F;
               if (lIIIlIlllll(lIIIlIlllIl(lIllIIlllllIIII, 0.0F))) {
                  lIllIIlllllIIII = 1.0F;
                  "".length();
                  if (((137 ^ 155) & ~(58 ^ 40)) < 0) {
                     return;
                  }
               } else if (lIIIllIIIII(lIIIlIlllII(lIllIIlllllIIII, 0.0F))) {
                  lIllIIlllllIIII = -1.0F;
               }
            }

            double var18 = (double)(lIllIIlllllIIII * lIllIIlllllIIIl);
            byte lIllIIllllIllII = Math.toRadians((double)(lIllIIllllIllIl + 90.0F));
            long lIllIIllllIlIIl = var18;
            Exception lIllIIllllIlIll = lIIIIIIlII[1];
            long lIllIIllllIlIII = Math.cos(lIllIIllllIllII);
            var18 = lIllIIllllIlIIl * lIllIIllllIlIII;
            double var10002 = (double)(lIllIIllllIllll * lIllIIlllllIIIl);
            lIllIIllllIllII = Math.toRadians((double)(lIllIIllllIllIl + 90.0F));
            lIllIIllllIlIII = var10002;
            lIllIIllllIlIIl = var18;
            lIllIIllllIlIll = lIIIIIIlII[1];
            int lIllIIllllIIlll = Math.sin(lIllIIllllIllII);
            lIllIIlllllIIlI.ⲋ(lIllIIllllIlIIl + lIllIIllllIlIII * lIllIIllllIIlll);
            var18 = (double)(lIllIIlllllIIII * lIllIIlllllIIIl);
            lIllIIllllIllII = Math.toRadians((double)(lIllIIllllIllIl + 90.0F));
            lIllIIllllIlIIl = var18;
            lIllIIllllIlIll = lIIIIIIlII[1];
            lIllIIllllIlIII = Math.sin(lIllIIllllIllII);
            var18 = lIllIIllllIlIIl * lIllIIllllIlIII;
            var10002 = (double)(lIllIIllllIllll * lIllIIlllllIIIl);
            lIllIIllllIllII = Math.toRadians((double)(lIllIIllllIllIl + 90.0F));
            lIllIIllllIlIII = var10002;
            lIllIIllllIlIIl = var18;
            lIllIIllllIlIll = lIIIIIIlII[1];
            lIllIIllllIIlll = Math.cos(lIllIIllllIllII);
            lIllIIlllllIIlI.ĂƂ(lIllIIllllIlIIl - lIllIIllllIlIII * lIllIIllllIIlll);
         }

      }
   }

   private static String lIIIlIIIIll(String lIllIIlllIIllll, String lIllIIlllIIlllI) {
      lIllIIlllIIllll = new String(Base64.getDecoder().decode(lIllIIlllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIllIIlllIIllIl = new StringBuilder();
      double lIllIIlllIIIlll = lIllIIlllIIlllI.toCharArray();
      boolean lIllIIlllIIIllI = lIIIIIIlII[1];
      int lIllIIlllIIIlIl = lIllIIlllIIllll.toCharArray();
      char lIllIIlllIIIlII = lIllIIlllIIIlIl.length;
      int lIllIIlllIIIIll = lIIIIIIlII[1];

      do {
         if (!lIIIllIIIIl(lIllIIlllIIIIll, lIllIIlllIIIlII)) {
            return String.valueOf(lIllIIlllIIllIl);
         }

         char lIllIIlllIlIIII = lIllIIlllIIIlIl[lIllIIlllIIIIll];
         lIllIIlllIIllIl.append((char)(lIllIIlllIlIIII ^ lIllIIlllIIIlll[lIllIIlllIIIllI % lIllIIlllIIIlll.length]));
         "".length();
         ++lIllIIlllIIIllI;
         ++lIllIIlllIIIIll;
         "".length();
      } while(-"  ".length() < 0);

      return null;
   }

   @JvmName(
      name = "ⲋ"
   )
   private final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIIIIIIlII[1]])).doubleValue();
   }

   private static boolean lIIIllIIIII(int var0) {
      return var0 < 0;
   }

   private static boolean lIIIlIlllll(int var0) {
      return var0 > 0;
   }

   private static String lIIIlIIIllI(String lIllIIlllIlllll, String lIllIIlllIlllII) {
      try {
         boolean lIllIIlllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         long lIllIIlllIllIlI = Cipher.getInstance("Blowfish");
         lIllIIlllIllIlI.init(lIIIIIIlII[3], lIllIIlllIllIll);
         return new String(lIllIIlllIllIlI.doFinal(Base64.getDecoder().decode(lIllIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIIIIllIlll(String lIllIIllIlllIlI, String lIllIIllIlllIIl) {
      try {
         SecretKeySpec lIllIIllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlII[10]), "DES");
         float lIllIIllIllIlIl = Cipher.getInstance("DES");
         lIllIIllIllIlIl.init(lIIIIIIlII[3], lIllIIllIllllIl);
         return new String(lIllIIllIllIlIl.doFinal(Base64.getDecoder().decode(lIllIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIlIllllI(Object var0) {
      return var0 == null;
   }

   @ȵ(
      ĂƂ = Ѿ.POST
   )
   public final void ⲋ(@NotNull ᶐ var1) {
      if (lIIIlIllIIl(lIllIlIIIIIlIII.ɡ().field_71439_g.field_70171_ac) && !lIIIlIllIlI(lIllIlIIIIIlIII.ɡ().field_71439_g.func_180799_ab()) || !lIIIlIllIIl(lIllIlIIIIIlIII.ᴃᎲ())) {
         if (!lIIIlIllIIl(lIIIlIllIII(lIllIlIIIIIlIII.ɡ().field_71439_g.field_71158_b.field_192832_b, 0.0F)) || lIIIlIllIlI(lIIIlIllIII(lIllIlIIIIIlIII.ɡ().field_71439_g.field_71158_b.field_78902_a, 0.0F))) {
            Exception lIllIlIIIIIIlll = ⲉ.ⲋ.ᴃᎲ();
            if (lIIIlIllIlI(lIllIlIIIIIlIII.u())) {
               lIllIlIIIIIlIII.ɡ().field_71439_g.func_70031_b((boolean)lIIIIIIlII[2]);
            }

            EntityPlayerSP lIllIlIIIIIIIll;
            double lIllIlIIIIIIIlI;
            if (lIIIlIllIlI(lIllIlIIIIIlIII.ɡ().field_71439_g.field_70122_E)) {
               EntityPlayerSP var10000 = lIllIlIIIIIlIII.ɡ().field_71439_g;
               lIllIlIIIIIIIlI = var10000.field_70159_w;
               lIllIlIIIIIIIll = var10000;
               double lIllIlIIIIIIllI = lIIIIIIlII[1];
               long lIllIlIIIIIIIIl = Math.sin(lIllIlIIIIIIlll);
               lIllIlIIIIIIIll.field_70159_w = lIllIlIIIIIIIlI - lIllIlIIIIIIIIl * lIllIlIIIIIlIII.ⲋ();
               var10000 = lIllIlIIIIIlIII.ɡ().field_71439_g;
               lIllIlIIIIIIIlI = var10000.field_70179_y;
               lIllIlIIIIIIIll = var10000;
               lIllIlIIIIIIllI = lIIIIIIlII[1];
               lIllIlIIIIIIIIl = Math.cos(lIllIlIIIIIIlll);
               lIllIlIIIIIIIll.field_70179_y = lIllIlIIIIIIIlI + lIllIlIIIIIIIIl * lIllIlIIIIIlIII.ⲋ();
               lIllIlIIIIIlIII.ɡ().field_71439_g.field_70181_x = lIllIlIIIIIlIII.ĂƂ();
               "".length();
               if ((151 ^ 147) <= " ".length()) {
                  return;
               }
            } else {
               double lIllIlIIIIIIlIl = lIllIlIIIIIlIII.ɡ().field_71439_g.field_70159_w * lIllIlIIIIIlIII.ɡ().field_71439_g.field_70159_w + lIllIlIIIIIlIII.ɡ().field_71439_g.field_70179_y * lIllIlIIIIIlIII.ɡ().field_71439_g.field_70179_y;
               char lIllIlIIIIIIlII = lIIIIIIlII[1];
               double lIllIlIIIIIIllI = Math.sqrt(lIllIlIIIIIIlIl);
               lIllIlIIIIIIIll = lIllIlIIIIIlIII.ɡ().field_71439_g;
               double lIllIlIIIIIIlIl = lIIIIIIlII[1];
               lIllIlIIIIIIIlI = Math.sin(lIllIlIIIIIIlll);
               lIllIlIIIIIIIll.field_70159_w = -lIllIlIIIIIIIlI * (double)1.0064F * lIllIlIIIIIIllI;
               lIllIlIIIIIIIll = lIllIlIIIIIlIII.ɡ().field_71439_g;
               lIllIlIIIIIIlIl = lIIIIIIlII[1];
               lIllIlIIIIIIIlI = Math.cos(lIllIlIIIIIIlll);
               lIllIlIIIIIIIll.field_70179_y = lIllIlIIIIIIIlI * (double)1.0064F * lIllIlIIIIIIllI;
            }
         }

      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[lIIIIIIlII[2]])).doubleValue();
   }

   private static void lIIIlIIllII() {
      lllllIIII = new String[lIIIIIIlII[17]];
      lllllIIII[lIIIIIIlII[1]] = lIIIIllIlll("2j3y9Wlj6bg=", "KaozK");
      lllllIIII[lIIIIIIlII[2]] = lIIIlIIIIll("IAsXLyE3CwYDWm4q", "Gncgr");
      lllllIIII[lIIIIIIlII[3]] = lIIIlIIIllI("i5N/2Nc+RpM=", "RpkOP");
      lllllIIII[lIIIIIIlII[4]] = lIIIlIIIIll("MCklATInKTQzSX4I", "WLQWa");
      lllllIIII[lIIIIIIlII[0]] = lIIIIllIlll("DCMD0TAhgHA=", "KdbEG");
      lllllIIII[lIIIIIIlII[5]] = lIIIIllIlll("2/SxUCqDSCEqRptQksOBdA==", "DnTxC");
      lllllIIII[lIIIIIIlII[6]] = lIIIlIIIllI("JsHu7a8g9yNhtU2HOWtejA==", "sfdOJ");
      lllllIIII[lIIIIIIlII[7]] = lIIIlIIIIll("Hw4DCwc0AgY3ABwYX2sz", "xkwBi");
      lllllIIII[lIIIIIIlII[10]] = lIIIlIIIllI("EmklpDMRJrQ=", "KktlD");
      lllllIIII[lIIIIIIlII[11]] = lIIIlIIIIll("PRceM3QWGRsiMQJW", "pxhVT");
      lllllIIII[lIIIIIIlII[13]] = lIIIlIIIllI("ejHq7rAwKpU=", "JqSeN");
      lllllIIII[lIIIIIIlII[14]] = lIIIlIIIIll("BG4HESw3Jw==", "RCTaI");
      lllllIIII[lIIIIIIlII[15]] = lIIIIllIlll("Iwxgrm/ubKQ=", "lsQpA");
      lllllIIII[lIIIIIIlII[16]] = lIIIIllIlll("GOBfhH5hw4TmWKEgovLJ1w==", "BJTnm");
   }

   static {
      lIIIlIlIllI();
      lIIIlIIllII();
      KProperty[] var10000 = new KProperty[lIIIIIIlII[0]];
      var10000[lIIIIIIlII[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(＿.class), lllllIIII[lIIIIIIlII[1]], lllllIIII[lIIIIIIlII[2]]));
      var10000[lIIIIIIlII[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(＿.class), lllllIIII[lIIIIIIlII[3]], lllllIIII[lIIIIIIlII[4]]));
      var10000[lIIIIIIlII[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(＿.class), lllllIIII[lIIIIIIlII[0]], lllllIIII[lIIIIIIlII[5]]));
      var10000[lIIIIIIlII[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(＿.class), lllllIIII[lIIIIIIlII[6]], lllllIIII[lIIIIIIlII[7]]));
      ⲋ = var10000;
   }
}
