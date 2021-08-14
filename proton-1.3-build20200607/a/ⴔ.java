package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020;:\u0001\u0007B\u0007¢\u0006\u0004\b:\u00101J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u000f\u0010(\u001a\u00020/H\u0014¢\u0006\u0004\b(\u00101J\u0017\u0010\u0007\u001a\u00020/2\u0006\u0010\u0002\u001a\u000202H\u0007¢\u0006\u0004\b\u0007\u00103J\u0017\u0010\u0007\u001a\u00020/2\u0006\u0010\u0002\u001a\u000204H\u0007¢\u0006\u0004\b\u0007\u00105J\u0017\u0010\u0007\u001a\u00020/2\u0006\u0010\u0002\u001a\u000206H\u0007¢\u0006\u0004\b\u0007\u00107J\u000f\u00108\u001a\u00020/H\u0016¢\u0006\u0004\b8\u00101J\u000f\u00109\u001a\u00020/H\u0016¢\u0006\u0004\b9\u00101R0\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0086\u008e\u0002R0\u0010\r\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u000b\"\u0004\b\u0007\u0010\f¨\u0006\u0086\u008e\u0002R\"\u0010\u0005\u001a\u00020\u000e8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0086\u0084\u0002R\u001a\u0010\u0003\u001a\u00020\u00108W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0096\u0004R\"\u0010\n\u001a\u00020\t8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0086\u0084\u0002R\"\u0010\u0014\u001a\u00020\u00158G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\n\u0010\u0016¨\u0006\u0086\u0084\u0002R(\u0010\u0013\u001a\u0004\u0018\u00010\u00178\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a\"\u0004\b\u0007\u0010\u001b¨\u0006\u0086\u000eR&\u0010\u0018\u001a\u00020\u001c8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\r\u0010!¨\u0006\u0086\u000eR&\u0010\"\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0007\u0010$¨\u0006\u0086\u000eR&\u0010%\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010#\u001a\u0004\b\"\u0010\u000f\"\u0004\b\r\u0010$¨\u0006\u0086\u000eR&\u0010(\u001a\u00020\u001c8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b\u0007\u0010!¨\u0006\u0086\u000eR&\u0010&\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b%\u0010\u000f\"\u0004\b\u0005\u0010$¨\u0006\u0086\u000eR&\u0010\u001d\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000f\"\u0004\b\u0003\u0010$¨\u0006\u0086\u000eR&\u0010)\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000f\"\u0004\b\n\u0010$¨\u0006\u0086\u000eR&\u0010+\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u000f\"\u0004\b\u0014\u0010$¨\u0006\u0086\u000eR\"\u0010-\u001a\u00020\u000e8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\r\u0010\u000f¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/ⴔ;", "La/ⴔ$ⲋ;", "p0", "ᴃᎲ", "La/ⅹ;", "u", "()La/ⴔ$ⲋ;", "ⲋ", "(La/ⴔ$ⲋ;)V", "", "〥ҳⱆ", "()Z", "(Z)V", "ĂƂ", "", "()D", "", "ƶ", "()Ljava/lang/String;", "ϛⰄ", "Ἒⅾ", "", "()I", "Lnet/minecraft/client/entity/EntityPlayerSP;", "ς", "Lnet/minecraft/client/entity/EntityPlayerSP;", "()Lnet/minecraft/client/entity/EntityPlayerSP;", "(Lnet/minecraft/client/entity/EntityPlayerSP;)V", "", "Ɏ", "F", "ᶐ", "()F", "(F)V", "Ꜥ", "D", "(D)V", "ⲡ", "ᵴἥ", "ⱛṧ", "Đ", "ɡ", "Ӄ", "ⴜ", "Ⱬ", "ͷ", "Ἒ", "", "ʅ", "()V", "La/ⱛṧ;", "(La/ⱛṧ;)V", "La/ἒű;", "(La/ἒű;)V", "La/Ꮐ꯴;", "(La/Ꮐ꯴;)V", "Ἠ", "ἶṗ", "<init>", "La/ⳅ;"}
)
public final class ⴔ extends ⳅ {
   public ⴔ() {
      super(lIIllIIlll[lIIllIlllI[12]], lIIllIIlll[lIIllIlllI[13]], ı５.ς, lIIllIlllI[1], (boolean)lIIllIlllI[1], (boolean)lIIllIlllI[1], lIIllIlllI[14], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIllIIlll[lIIllIlllI[15]], 1.0D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      this.u = this.ⲋ(lIIllIIlll[lIIllIlllI[16]], 1.0D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      this.ᴃᎲ = this.ⲋ(lIIllIIlll[lIIllIlllI[17]], ⴔ.ⲋ.ⲋ);
      this.〥ҳⱆ = this.ⲋ(lIIllIIlll[lIIllIlllI[18]], Boolean.valueOf((boolean)lIIllIlllI[1]));
      this.Ἒⅾ = this.ⲋ(lIIllIIlll[lIIllIlllI[19]], lIIllIlllI[14]).ĂƂ((Function0)(new Function0<Unit>() {
         static {
            llIllIIlIl();
         }

         private static void llIllIIlIl() {
            llIlIIIll = new int[1];
            llIlIIIll[0] = (14 ^ 39) & ~(121 ^ 80);
         }

         public final void ⲋ() {
            // $FF: Couldn't be decompiled
         }
      }));
      this.ϛⰄ = this.ⲋ(lIIllIIlll[lIIllIlllI[20]], Boolean.valueOf((boolean)lIIllIlllI[1]));
      ⅹ var10000 = this.ⲋ((String)lIIllIIlll[lIIllIlllI[21]]);
      ⅹ var1;
      if (lIlIIllIIll(var10000)) {
         var1 = var10000;
         int var2 = lIIllIlllI[1];
         int var3 = lIIllIlllI[1];
         int var5 = lIIllIlllI[1];
         var1.ⲋ().ⲋ((Function1)(new ⴔ$1(this)));
         "".length();
         if (((44 ^ 77) & ~(44 ^ 77)) == "  ".length()) {
            throw null;
         }
      } else {
         "".length();
      }

      var1 = null;
   }

   public void ἶṗ() {
      super.ἶṗ();
      if (lIlIIllIlII(this.u(), ⴔ.ⲋ.ĂƂ)) {
         EntityPlayerSP var1 = this.ς;
         if (lIlIIllIIll(var1)) {
            var1.field_70126_B = this.ᵴἥ;
            var1.field_70127_C = this.Ɏ;
            float var2 = this.ɡ().field_71474_y.field_74341_c * 0.6F + 0.2F;
            float var3 = var2 * var2 * var2 * 8.0F;
            float var4 = (float)this.ɡ().field_71417_B.field_74377_a * var3;
            float var5 = (float)this.ɡ().field_71417_B.field_74375_b * var3;
            var1.func_70082_c(var4, var5);
            this.ᵴἥ = var1.field_70177_z;
            this.Ɏ = var1.field_70125_A;
         }
      }

   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.〥ҳⱆ.ⲋ(this, ⲋ[lIIllIlllI[4]], var1);
   }

   private static void lIlIIlIlIll() {
      lIIllIIlll = new String[lIIllIlllI[22]];
      lIIllIIlll[lIIllIlllI[1]] = lIlIIIllllI("tCLJkRWJuj0=", "smsoL");
      lIIllIIlll[lIIllIlllI[2]] = lIlIIIllllI("nTA4BFPSWRe/T9EvTzxYvA==", "jfJbv");
      lIIllIIlll[lIIllIlllI[3]] = lIlIIIllllI("d/KWc/6zEfg=", "VtDQK");
      lIIllIIlll[lIIllIlllI[4]] = lIlIIIlllll("2I21pQfYs3Vx4Hwmq7J8Rw==", "zxOmb");
      lIIllIIlll[lIIllIlllI[5]] = lIlIIIlllll("Zveb8Rp/TzYuXqj/y58kVg==", "OgKDD");
      lIIllIIlll[lIIllIlllI[6]] = lIlIIIlllll("mi86J101RkfUt7H67L3vAf3OhWPzajv9z/in2FTHH1kDPXFAil2qs17SITwwAsFMR+T9wM0L0nzWF3wyqku+woVuzgOngVpz", "lsOkw");
      lIIllIIlll[lIIllIlllI[0]] = lIlIIIllllI("gbKskx6SDnvhN6is3OD8Yw==", "BOZfj");
      lIIllIIlll[lIIllIlllI[7]] = lIlIIlIIlll("EC04Nj8bJCMHABspNRUiX2EW", "wHLpP");
      lIIllIIlll[lIIllIlllI[8]] = lIlIIIllllI("HmvV3iu0yz3X0sHUBXy7WoYAueB/XILK", "KFxmI");
      lIIllIIlll[lIIllIlllI[9]] = lIlIIIllllI("ivYm5ujsn2VjERMhCIMg/7kLcS99vuFC", "ltzJP");
      lIIllIIlll[lIIllIlllI[10]] = lIlIIIlllll("k+PrzLHDRRqN3hajKfwAXg==", "fAjru");
      lIIllIIlll[lIIllIlllI[11]] = lIlIIIlllll("gSi37X+TAsJg8kqicEGJG8A8nS/0iHh/", "lRRNT");
      lIIllIIlll[lIIllIlllI[12]] = lIlIIIlllll("UI7i3bET4Mw=", "nekXN");
      lIIllIIlll[lIIllIlllI[13]] = lIlIIlIIlll("BRxjKTYiHGMjLSwcYy5kJRAxK2U=", "GyCOD");
      lIIllIIlll[lIIllIlllI[15]] = lIlIIlIIlll("GW43IxY0Jw==", "QCdSs");
      lIIllIIlll[lIIllIlllI[16]] = lIlIIlIIlll("BUw6Eg42BQ==", "Saibk");
      lIIllIIlll[lIIllIlllI[17]] = lIlIIIlllll("QbtI1GkCQxHAaxaTEvnQUg==", "jimMV");
      lIIllIIlll[lIIllIlllI[18]] = lIlIIIlllll("beZQs+l+i2xmrikTxwMSaw==", "EVZql");
      lIIllIIlll[lIIllIlllI[19]] = lIlIIlIIlll("PykCJRkOZiYtGx80Ci5VJikBJw==", "kFeBu");
      lIIllIIlll[lIIllIlllI[20]] = lIlIIIlllll("EeULWA9bw3naN9WbNAE79g==", "AywAk");
      lIIllIIlll[lIIllIlllI[21]] = lIlIIlIIlll("BTw+BCM0cwIELTo2IA==", "CSRhL");
   }

   private static boolean lIlIIllIlll(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIlIIlIIlll(String lIlIIIlIIlIlIIl, String lIlIIIlIIlIlIII) {
      lIlIIIlIIlIlIIl = new String(Base64.getDecoder().decode(lIlIIIlIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception lIlIIIlIIlIIlll = new StringBuilder();
      char[] lIlIIIlIIlIlIll = lIlIIIlIIlIlIII.toCharArray();
      int lIlIIIlIIlIlIlI = lIIllIlllI[1];
      int lIlIIIlIIlIIlII = lIlIIIlIIlIlIIl.toCharArray();
      double lIlIIIlIIlIIIll = lIlIIIlIIlIIlII.length;
      int lIlIIIlIIlIIIlI = lIIllIlllI[1];

      do {
         if (!lIlIIllllll(lIlIIIlIIlIIIlI, lIlIIIlIIlIIIll)) {
            return String.valueOf(lIlIIIlIIlIIlll);
         }

         double lIlIIIlIIlIIIIl = lIlIIIlIIlIIlII[lIlIIIlIIlIIIlI];
         lIlIIIlIIlIIlll.append((char)(lIlIIIlIIlIIIIl ^ lIlIIIlIIlIlIll[lIlIIIlIIlIlIlI % lIlIIIlIIlIlIll.length]));
         "".length();
         ++lIlIIIlIIlIlIlI;
         ++lIlIIIlIIlIIIlI;
         "".length();
      } while((231 ^ 164 ^ 233 ^ 175) != 0);

      return null;
   }

   @JvmName(
      name = "ⱛṧ"
   )
   public final float ⱛṧ() {
      return this.ᵴἥ;
   }

   public void Ἠ() {
      super.Ἠ();
      EntityPlayerSP lIlIIIlIlIlllll = lIlIIIlIllIIIII.ς;
      if (lIlIIllIIll(lIlIIIlIlIlllll)) {
         lIlIIIlIlIlllll.field_70142_S = lIlIIIlIllIIIII.Ꜥ;
         lIlIIIlIlIlllll.field_70137_T = lIlIIIlIllIIIII.ⲡ;
         lIlIIIlIlIlllll.field_70136_U = lIlIIIlIllIIIII.Đ;
         lIlIIIlIlIlllll.field_70169_q = lIlIIIlIllIIIII.Ꜥ;
         lIlIIIlIlIlllll.field_70167_r = lIlIIIlIllIIIII.ⲡ;
         lIlIIIlIlIlllll.field_70166_s = lIlIIIlIllIIIII.Đ;
         if (lIlIIllIlII(lIlIIIlIllIIIII.u(), ⴔ.ⲋ.ĂƂ)) {
            byte lIlIIIlIlIllllI = lIlIIIlIllIIIII.ɡ().field_71474_y.field_74351_w.func_151470_d();
            byte lIlIIIlIlIlllIl = lIlIIIlIllIIIII.ɡ().field_71474_y.field_74370_x.func_151470_d();
            byte lIlIIIlIlIlllII = lIlIIIlIllIIIII.ɡ().field_71474_y.field_74368_y.func_151470_d();
            byte lIlIIIlIlIllIll = lIlIIIlIllIIIII.ɡ().field_71474_y.field_74366_z.func_151470_d();
            byte var6 = lIlIIIlIllIIIII.ɡ().field_71474_y.field_74314_A.func_151470_d();
            byte lIlIIIlIlIllIIl = lIlIIIlIllIIIII.ɡ().field_71474_y.field_74311_E.func_151470_d();
            if (lIlIIllIlIl(var6)) {
               lIlIIIlIlIlllll.field_70181_x = lIlIIIlIllIIIII.ĂƂ();
               "".length();
               if (-" ".length() > -" ".length()) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIllIIl)) {
               lIlIIIlIlIlllll.field_70181_x = -lIlIIIlIllIIIII.ĂƂ();
               "".length();
               if (" ".length() > (78 + 83 - 10 + 0 ^ 141 + 70 - 179 + 115)) {
                  return;
               }
            } else {
               lIlIIIlIlIlllll.field_70181_x = 0.0D;
            }

            double lIlIIIlIlIllIII = (float)Math.toRadians((double)lIlIIIlIlIlllll.field_70177_z);
            if (lIlIIllIlIl(lIlIIIlIlIllllI) && lIlIIllIlIl(lIlIIIlIlIlllIl)) {
               lIlIIIlIlIlllll.field_70159_w = (double)(-MathHelper.func_76126_a(lIlIIIlIlIllIII - 0.7853982F)) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)MathHelper.func_76134_b(lIlIIIlIlIllIII - 0.7853982F) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if ("  ".length() > (17 + 11 - -85 + 16 ^ 41 + 95 - 119 + 116)) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIllllI) && lIlIIllIlIl(lIlIIIlIlIllIll)) {
               lIlIIIlIlIlllll.field_70159_w = (double)(-MathHelper.func_76126_a(lIlIIIlIlIllIII + 0.7853982F)) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)MathHelper.func_76134_b(lIlIIIlIlIllIII + 0.7853982F) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIlllII) && lIlIIllIlIl(lIlIIIlIlIlllIl)) {
               lIlIIIlIlIlllll.field_70159_w = (double)MathHelper.func_76126_a(lIlIIIlIlIllIII + 0.7853982F) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)(-MathHelper.func_76134_b(lIlIIIlIlIllIII + 0.7853982F)) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if (((78 ^ 11) & ~(192 ^ 133)) != 0) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIlllII) && lIlIIllIlIl(lIlIIIlIlIllIll)) {
               lIlIIIlIlIlllll.field_70159_w = (double)MathHelper.func_76126_a(lIlIIIlIlIllIII - 0.7853982F) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)(-MathHelper.func_76134_b(lIlIIIlIlIllIII - 0.7853982F)) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if (((220 ^ 152) & ~(246 ^ 178)) > 0) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIllllI)) {
               lIlIIIlIlIlllll.field_70159_w = (double)(-MathHelper.func_76126_a(lIlIIIlIlIllIII)) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)MathHelper.func_76134_b(lIlIIIlIlIllIII) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if ((156 ^ 184 ^ 79 ^ 111) <= "   ".length()) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIlllII)) {
               lIlIIIlIlIlllll.field_70159_w = (double)MathHelper.func_76126_a(lIlIIIlIlIllIII) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)(-MathHelper.func_76134_b(lIlIIIlIlIllIII)) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if (null != null) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIlllIl)) {
               lIlIIIlIlIlllll.field_70159_w = (double)(-MathHelper.func_76126_a(lIlIIIlIlIllIII - 1.5707964F)) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)MathHelper.func_76134_b(lIlIIIlIlIllIII - 1.5707964F) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if (((177 ^ 146) & ~(72 ^ 107)) > 0) {
                  return;
               }
            } else if (lIlIIllIlIl(lIlIIIlIlIllIll)) {
               lIlIIIlIlIlllll.field_70159_w = (double)(-MathHelper.func_76126_a(lIlIIIlIlIllIII + 1.5707964F)) * lIlIIIlIllIIIII.ⲋ();
               lIlIIIlIlIlllll.field_70179_y = (double)MathHelper.func_76134_b(lIlIIIlIlIllIII + 1.5707964F) * lIlIIIlIllIIIII.ⲋ();
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }
            } else {
               lIlIIIlIlIlllll.field_70159_w = 0.0D;
               lIlIIIlIlIlllll.field_70179_y = 0.0D;
            }
         }

         lIlIIIlIllIIIII.Ꜥ = lIlIIIlIlIlllll.field_70165_t;
         lIlIIIlIllIIIII.ⲡ = lIlIIIlIlIlllll.field_70163_u;
         lIlIIIlIllIIIII.Đ = lIlIIIlIlIlllll.field_70161_v;
         if (lIlIIllIlIl(lIlIIIlIllIIIII.ᴃᎲ())) {
            lIlIIIlIllIIIII.ɡ += lIlIIIlIlIlllll.field_70159_w;
            lIlIIIlIllIIIII.ⴜ += lIlIIIlIlIlllll.field_70181_x;
            lIlIIIlIllIIIII.ͷ += lIlIIIlIlIlllll.field_70179_y;
            lIlIIIlIlIlllll.field_70165_t = lIlIIIlIllIIIII.ɡ().field_71439_g.field_70165_t + lIlIIIlIllIIIII.ɡ;
            lIlIIIlIlIlllll.field_70163_u = lIlIIIlIllIIIII.ɡ().field_71439_g.field_70163_u + lIlIIIlIllIIIII.ⴜ;
            lIlIIIlIlIlllll.field_70161_v = lIlIIIlIllIIIII.ɡ().field_71439_g.field_70161_v + lIlIIIlIllIIIII.ͷ;
            "".length();
            if (-" ".length() >= ((68 ^ 46 ^ 220 ^ 131) & (34 + 106 - 56 + 58 ^ 117 + 144 - 189 + 115 ^ -" ".length()))) {
               return;
            }
         } else {
            lIlIIIlIlIlllll.field_70165_t += lIlIIIlIlIlllll.field_70159_w;
            lIlIIIlIlIlllll.field_70163_u += lIlIIIlIlIlllll.field_70181_x;
            lIlIIIlIlIlllll.field_70161_v += lIlIIIlIlIlllll.field_70179_y;
         }

         lIlIIIlIlIlllll.field_70159_w *= 0.998D;
         lIlIIIlIlIlllll.field_70181_x *= 0.998D;
         lIlIIIlIlIlllll.field_70179_y *= 0.998D;
      }

   }

   protected void Đ() {
      super.Đ();
      if (lIlIIllIIIl(lIlIIIllIIIIIll.ɡ().field_71439_g)) {
         lIlIIIllIIIIIll.ꙑứ();
      } else {
         lIlIIIllIIIIIll.ⲋ((boolean)lIIllIlllI[1]);
         lIlIIIllIIIIIll.ⲋ(ⴔ.ⲋ.ⲋ);
         lIlIIIllIIIIIll.ς = new EntityPlayerSP(lIlIIIllIIIIIll.ɡ(), (World)lIlIIIllIIIIIll.ɡ().field_71441_e, lIlIIIllIIIIIll.ɡ().field_71439_g.field_71174_a, lIlIIIllIIIIIll.ɡ().field_71439_g.func_146107_m(), lIlIIIllIIIIIll.ɡ().field_71439_g.func_192035_E());
         EntityPlayerSP var10000 = lIlIIIllIIIIIll.ς;
         if (lIlIIllIIll(var10000)) {
            long lIlIIIllIIIIIlI = var10000;
            String lIlIIIllIIIIIIl = lIIllIlllI[1];
            String lIlIIIllIIIIIII = lIIllIlllI[1];
            double lIlIIIlIllllllI = lIIllIlllI[1];
            lIlIIIllIIIIIlI.func_82149_j((Entity)lIlIIIllIIIIIll.ɡ().field_71439_g);
            lIlIIIllIIIIIlI.field_70177_z = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70177_z;
            lIlIIIllIIIIIlI.field_70125_A = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70125_A;
            lIlIIIllIIIIIlI.field_70759_as = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70759_as;
            lIlIIIllIIIIIlI.field_70145_X = (boolean)lIIllIlllI[2];
            lIlIIIllIIIIIlI.func_82142_c((boolean)lIIllIlllI[2]);
            "".length();
            if (((18 ^ 38) & ~(90 ^ 110)) != 0) {
               return;
            }
         } else {
            "".length();
         }

         lIlIIIllIIIIIll.Ꜥ = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70165_t;
         lIlIIIllIIIIIll.ⲡ = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70163_u;
         lIlIIIllIIIIIll.Đ = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70161_v;
         lIlIIIllIIIIIll.Ɏ = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70125_A;
         lIlIIIllIIIIIll.ᵴἥ = lIlIIIllIIIIIll.ɡ().field_71439_g.field_70177_z;
         lIlIIIllIIIIIll.ɡ = 0.0D;
         lIlIIIllIIIIIll.ⴜ = 0.0D;
         lIlIIIllIIIIIll.ͷ = 0.0D;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIIllIlllI[1]])).doubleValue();
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(float var1) {
      this.ᵴἥ = var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(double var1) {
      this.ɡ = var1;
   }

   protected void ʅ() {
      super.ʅ();
      if (!lIlIIllIIIl(this.ɡ().field_71439_g)) {
         this.ⲋ(ⴔ.ⲋ.ⲋ);
         this.ɡ().func_175607_a((Entity)this.ɡ().field_71439_g);
      }
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final int 〥ҳⱆ() {
      return ((Number)this.Ἒⅾ.ⲋ(this, ⲋ[lIIllIlllI[5]])).intValue();
   }

   @JvmName(
      name = "u"
   )
   public final void u(double var1) {
      this.Đ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ⴔ.ⲋ var1) {
      this.ᴃᎲ.ⲋ(this, ⲋ[lIIllIlllI[3]], var1);
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final void Ἒⅾ(double var1) {
      this.ͷ = var1;
   }

   @JvmName(
      name = "ⲡ"
   )
   public final double ⲡ() {
      return this.Đ;
   }

   @JvmName(
      name = "Ⱬ"
   )
   public final double Ⱬ() {
      return this.ⴜ;
   }

   @JvmName(
      name = "Ӄ"
   )
   public final double Ӄ() {
      return this.ɡ;
   }

   @JvmName(
      name = "ς"
   )
   public final double ς() {
      return this.Ꜥ;
   }

   private static String lIlIIIlllll(String lIlIIIlIIIlIlll, String lIlIIIlIIIlIllI) {
      try {
         float lIlIIIlIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIllIlllI[8]), "DES");
         Cipher lIlIIIlIIIllIll = Cipher.getInstance("DES");
         lIlIIIlIIIllIll.init(lIIllIlllI[3], lIlIIIlIIIlIlIl);
         return new String(lIlIIIlIIIllIll.doFinal(Base64.getDecoder().decode(lIlIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      return this.u().toString();
   }

   private static String lIlIIIllllI(String lIlIIIlIIlllllI, String lIlIIIlIIlllIll) {
      try {
         int lIlIIIlIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIlIIIlIlIIIIII = Cipher.getInstance("Blowfish");
         lIlIIIlIlIIIIII.init(lIIllIlllI[3], lIlIIIlIIlllIlI);
         return new String(lIlIIIlIlIIIIII.doFinal(Base64.getDecoder().decode(lIlIIIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[lIIllIlllI[2]])).doubleValue();
   }

   private static boolean lIlIIllIlIl(int var0) {
      return var0 != 0;
   }

   @ȵ
   public final void ⲋ(@NotNull ⱛṧ var1) {
      if (lIlIIllIlIl(Intrinsics.areEqual((Object)var1.ᴃᎲ(), (Object)this.ɡ().field_71439_g)) && lIlIIllIlII(this.u(), ⴔ.ⲋ.ĂƂ)) {
         var1.ĂƂ();
      }

   }

   @ȵ(
      ⲋ = 10
   )
   public final void ⲋ(@NotNull ἒű var1) {
      if (lIlIIllIlII(this.u(), ⴔ.ⲋ.ĂƂ)) {
         var1.ᴃᎲ().field_187257_e = (boolean)lIIllIlllI[1];
         var1.ᴃᎲ().field_187258_f = (boolean)lIIllIlllI[1];
         var1.ᴃᎲ().field_187255_c = (boolean)lIIllIlllI[1];
         var1.ᴃᎲ().field_187256_d = (boolean)lIIllIlllI[1];
         var1.ᴃᎲ().field_192832_b = 0.0F;
         var1.ᴃᎲ().field_78902_a = 0.0F;
         var1.ᴃᎲ().field_78901_c = (boolean)lIIllIlllI[1];
         var1.ᴃᎲ().field_78899_d = (boolean)lIIllIlllI[1];
      }

   }

   @ȵ
   public final void ⲋ(@NotNull Ꮐ꯴ lIlIIIlIlIlIlII) {
      if (lIlIIllIlIl(lIlIIIlIlIlIlII.ᴃᎲ() instanceof CPacketUseEntity)) {
         Entity var10000 = ((CPacketUseEntity)lIlIIIlIlIlIlII.ᴃᎲ()).func_149564_a((World)lIlIIIlIlIlIlIl.ɡ().field_71441_e);
         int var2;
         if (lIlIIllIIll(var10000)) {
            var2 = var10000.field_145783_c;
            "".length();
            if ("   ".length() < 0) {
               return;
            }
         } else {
            "".length();
            var2 = lIIllIlllI[1];
         }

         if (lIlIIllIlll(var2, lIlIIIlIlIlIlIl.ɡ().field_71439_g.field_145783_c)) {
            lIlIIIlIlIlIlII.ĂƂ();
            "".length();
            if (((143 ^ 171 ^ 184 ^ 193) & (240 ^ 131 ^ 136 ^ 166 ^ -" ".length())) > "  ".length()) {
               return;
            }
         }
      } else if (lIlIIllIlIl(lIlIIIlIlIlIlII.ᴃᎲ() instanceof CPacketPlayer)) {
         ((CPacketPlayer)lIlIIIlIlIlIlII.ᴃᎲ()).field_149479_a = lIlIIIlIlIlIlIl.ɡ().field_71439_g.field_70165_t;
         ((CPacketPlayer)lIlIIIlIlIlIlII.ᴃᎲ()).field_149477_b = lIlIIIlIlIlIlIl.ɡ().field_71439_g.field_70163_u;
         ((CPacketPlayer)lIlIIIlIlIlIlII.ᴃᎲ()).field_149478_c = lIlIIIlIlIlIlIl.ɡ().field_71439_g.field_70161_v;
      }

   }

   private static void lIlIIlIllIl() {
      lIIllIlllI = new int[23];
      lIIllIlllI[0] = 91 + 118 - 160 + 78 ^ 219 ^ 162;
      lIIllIlllI[1] = (115 ^ 116 ^ 206 ^ 195) & (78 + 38 - 26 + 87 ^ 22 + 168 - 122 + 119 ^ -" ".length());
      lIIllIlllI[2] = " ".length();
      lIIllIlllI[3] = "  ".length();
      lIIllIlllI[4] = "   ".length();
      lIIllIlllI[5] = 160 + 131 - 241 + 124 ^ 49 + 124 - 17 + 14;
      lIIllIlllI[6] = 16 ^ 119 ^ 41 ^ 75;
      lIIllIlllI[7] = 42 + 33 - -32 + 38 ^ 92 + 144 - 211 + 125;
      lIIllIlllI[8] = 138 ^ 192 ^ 246 ^ 180;
      lIIllIlllI[9] = 1 ^ 8;
      lIIllIlllI[10] = 186 ^ 176;
      lIIllIlllI[11] = 95 ^ 16 ^ 72 ^ 12;
      lIIllIlllI[12] = 75 ^ 71;
      lIIllIlllI[13] = 139 ^ 134;
      lIIllIlllI[14] = 106 ^ 82;
      lIIllIlllI[15] = 116 + 1 - 38 + 103 ^ 131 + 103 - 62 + 12;
      lIIllIlllI[16] = 251 ^ 139 ^ 119 + 55 - 92 + 45;
      lIIllIlllI[17] = 1 ^ 95 ^ 136 ^ 198;
      lIIllIlllI[18] = 48 ^ 19 ^ 35 ^ 17;
      lIIllIlllI[19] = 0 ^ 18;
      lIIllIlllI[20] = 90 ^ 73;
      lIIllIlllI[21] = 22 ^ 119 ^ 238 ^ 155;
      lIIllIlllI[22] = 69 ^ 80;
   }

   static {
      lIlIIlIllIl();
      lIlIIlIlIll();
      KProperty[] var10000 = new KProperty[lIIllIlllI[0]];
      var10000[lIIllIlllI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⴔ.class), lIIllIIlll[lIIllIlllI[1]], lIIllIIlll[lIIllIlllI[2]]));
      var10000[lIIllIlllI[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⴔ.class), lIIllIIlll[lIIllIlllI[3]], lIIllIIlll[lIIllIlllI[4]]));
      var10000[lIIllIlllI[3]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⴔ.class), lIIllIIlll[lIIllIlllI[5]], lIIllIIlll[lIIllIlllI[6]]));
      var10000[lIIllIlllI[4]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⴔ.class), lIIllIIlll[lIIllIlllI[0]], lIIllIIlll[lIIllIlllI[7]]));
      var10000[lIIllIlllI[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⴔ.class), lIIllIIlll[lIIllIlllI[8]], lIIllIIlll[lIIllIlllI[9]]));
      var10000[lIIllIlllI[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⴔ.class), lIIllIIlll[lIIllIlllI[10]], lIIllIIlll[lIIllIlllI[11]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(float var1) {
      this.Ɏ = var1;
   }

   private static boolean lIlIIllIlII(Object var0, Object var1) {
      return var0 != var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(double var1) {
      this.ⲡ = var1;
   }

   @JvmName(
      name = "Ἒ"
   )
   public final double Ἒ() {
      return this.ͷ;
   }

   private static boolean lIlIIllIIIl(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final void 〥ҳⱆ(double var1) {
      this.ⴜ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.Ꜥ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable EntityPlayerSP var1) {
      this.ς = var1;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final double Ꜥ() {
      return this.ⲡ;
   }

   @JvmName(
      name = "ᶐ"
   )
   public final float ᶐ() {
      return this.Ɏ;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final boolean Ἒⅾ() {
      return (Boolean)this.ϛⰄ.ⲋ(this, ⲋ[lIIllIlllI[6]]);
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final EntityPlayerSP ϛⰄ() {
      return this.ς;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final boolean ᴃᎲ() {
      return (Boolean)this.〥ҳⱆ.ⲋ(this, ⲋ[lIIllIlllI[4]]);
   }

   private static boolean lIlIIllIIll(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIIllllll(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "u"
   )
   public final ⴔ.ⲋ u() {
      return (ⴔ.ⲋ)this.ᴃᎲ.ⲋ(this, ⲋ[lIIllIlllI[3]]);
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ⴔ$ⲋ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private static String lIIIIlIlII(String llIllIIlIlIIIll, String llIllIIlIlIIlII) {
         try {
            double llIllIIlIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Exception llIllIIlIlIIIII = Cipher.getInstance("Blowfish");
            llIllIIlIlIIIII.init(llllIlIl[0], llIllIIlIlIIIIl);
            return new String(llIllIIlIlIIIII.doFinal(Base64.getDecoder().decode(llIllIIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIIIIllIll() {
         llllIlIl = new int[3];
         llllIlIl[0] = "  ".length();
         llllIlIl[1] = (21 ^ 66) & ~(79 ^ 24);
         llllIlIl[2] = " ".length();
      }

      private ⲋ() {
      }

      static {
         lIIIIllIll();
         lIIIIllIIl();
         ⴔ.ⲋ[] var10001 = new ⴔ.ⲋ[llllIlIl[0]];
         var10001[llllIlIl[1]] = ⲋ = new ⴔ.ⲋ(llllIIll[llllIlIl[1]], llllIlIl[1]);
         var10001[llllIlIl[2]] = ĂƂ = new ⴔ.ⲋ(llllIIll[llllIlIl[2]], llllIlIl[2]);
      }

      private static void lIIIIllIIl() {
         llllIIll = new String[llllIlIl[0]];
         llllIIll[llllIlIl[1]] = lIIIIlIlII("75h/akYDEDk=", "bzsEz");
         llllIIll[llllIlIl[2]] = lIIIIlIlII("1k/GFF9zcY4=", "ZoyFR");
      }
   }
}
