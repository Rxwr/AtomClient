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
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0004\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00068G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0002\u0010\b¨\u0006\u0086\u0084\u0002R\"\u0010\u0007\u001a\u00020\t8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/Ꞁ;", "", "ĂƂ", "La/ⅹ;", "ⲋ", "()I", "", "u", "()D", "", "ᴃᎲ", "()Z", "La/Ｆ;", "p0", "", "(La/Ｆ;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class Ꞁ extends ⳅ {
   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[lIllIlIII[2]])).doubleValue();
   }

   private static String lIlllIlllI(String llIIlIlllIlIlll, String llIIlIlllIlIIIl) {
      llIIlIlllIlIlll = new String(Base64.getDecoder().decode(llIIlIlllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int llIIlIlllIlIIII = new StringBuilder();
      char[] llIIlIlllIlIlII = llIIlIlllIlIIIl.toCharArray();
      int llIIlIlllIIlllI = lIllIlIII[1];
      int llIIlIlllIIllIl = llIIlIlllIlIlll.toCharArray();
      byte llIIlIlllIIllII = llIIlIlllIIllIl.length;
      int llIIlIlllIIlIll = lIllIlIII[1];

      do {
         if (!lIllllIlll(llIIlIlllIIlIll, llIIlIlllIIllII)) {
            return String.valueOf(llIIlIlllIlIIII);
         }

         double llIIlIlllIIlIlI = llIIlIlllIIllIl[llIIlIlllIIlIll];
         llIIlIlllIlIIII.append((char)(llIIlIlllIIlIlI ^ llIIlIlllIlIlII[llIIlIlllIIlllI % llIIlIlllIlIlII.length]));
         "".length();
         ++llIIlIlllIIlllI;
         ++llIIlIlllIIlIll;
         "".length();
      } while(((145 ^ 133) & ~(85 ^ 65)) <= 0);

      return null;
   }

   private static String lIlllIllII(String llIIlIlllIIIIlI, String llIIlIllIllllll) {
      try {
         SecretKeySpec llIIlIlllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIllIllllll.getBytes(StandardCharsets.UTF_8)), lIllIlIII[10]), "DES");
         int llIIlIllIllllIl = Cipher.getInstance("DES");
         llIIlIllIllllIl.init(lIllIlIII[3], llIIlIlllIIIlIl);
         return new String(llIIlIllIllllIl.doFinal(Base64.getDecoder().decode(llIIlIlllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return (Boolean)this.ᴃᎲ.ⲋ(this, ⲋ[lIllIlIII[3]]);
   }

   static {
      lIllllIIll();
      lIllllIIlI();
      KProperty[] var10000 = new KProperty[lIllIlIII[0]];
      var10000[lIllIlIII[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꞁ.class), lIllIIlIl[lIllIlIII[1]], lIllIIlIl[lIllIlIII[2]]));
      var10000[lIllIlIII[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꞁ.class), lIllIIlIl[lIllIlIII[3]], lIllIIlIl[lIllIlIII[0]]));
      var10000[lIllIlIII[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꞁ.class), lIllIIlIl[lIllIlIII[4]], lIllIIlIl[lIllIlIII[5]]));
      ⲋ = var10000;
   }

   @ȵ
   public final void ⲋ(@NotNull Ｆ llIIlIllllIIIlI) {
      if (lIllllIlII(llIIlIllllIIIll.ɡ().field_71439_g.func_70090_H()) && !lIllllIlIl(llIIlIllllIIIll.ɡ().field_71439_g.func_180799_ab())) {
         if (!lIllllIlII(llIIlIllllIIIll.ɡ().field_71439_g.field_70122_E) || !lIllllIlIl(llIIlIllllIIIll.u())) {
            if (lIllllIllI(Random.Default.nextInt(lIllIlIII[6]), llIIlIllllIIIll.ⲋ())) {
               llIIlIllllIIIll.ɡ().field_71439_g.field_71174_a.func_147297_a((Packet)(new Position(llIIlIllllIIIll.ɡ().field_71439_g.field_70165_t, llIIlIllllIIIll.ɡ().field_71439_g.field_70163_u + (double)((float)llIIlIllllIIIll.ĂƂ()), llIIlIllllIIIll.ɡ().field_71439_g.field_70161_v, (boolean)lIllIlIII[1])));
               llIIlIllllIIIll.ɡ().field_71439_g.field_71174_a.func_147297_a((Packet)(new Position(llIIlIllllIIIll.ɡ().field_71439_g.field_70165_t, llIIlIllllIIIll.ɡ().field_71439_g.field_70163_u, llIIlIllllIIIll.ɡ().field_71439_g.field_70161_v, (boolean)lIllIlIII[1])));
               llIIlIllllIIIll.ɡ().field_71439_g.func_71009_b(llIIlIllllIIIlI.ᴃᎲ());
            }

         }
      }
   }

   private static void lIllllIIlI() {
      lIllIIlIl = new String[lIllIlIII[14]];
      lIllIIlIl[lIllIlIII[1]] = lIlllIllII("peIExsekPYM=", "nFswS");
      lIllIIlIl[lIllIlIII[2]] = lIlllIllIl("5n2yAITjaaOAownIbL1aVw==", "JwleX");
      lIllIIlIl[lIllIlIII[3]] = lIlllIlllI("NiwvBQItEw==", "YJIvg");
      lIllIIlIl[lIllIlIII[0]] = lIlllIllIl("iK7+jzlS+deKhh1T94KxUg==", "nqepA");
      lIllIIlIl[lIllIlIII[4]] = lIlllIlllI("GR4oOiQDHgsHJRoJ", "vpoHK");
      lIllIIlIl[lIllIlIII[5]] = lIlllIlllI("CCM7HQsoNCAnCwsJIT4cR28V", "oFORe");
      lIllIIlIl[lIllIlIII[7]] = lIlllIllII("k2KUvJYSKvsdKMGSkWX0jw==", "oCiSz");
      lIllIIlIl[lIllIlIII[8]] = lIlllIllII("7bp0fk/aoWquaqW/U3WEeXCyHWn1mlhTb2iB2zC4rI053GzclGFRTeylyNEuOo7Z", "JAMhM");
      lIllIIlIl[lIllIlIII[10]] = lIlllIllIl("3hGBrN3bO33VVlUR0jqc9Q==", "lyaJT");
      lIllIIlIl[lIllIlIII[11]] = lIlllIllIl("619xfe5zt24=", "oTTyM");
      lIllIIlIl[lIllIlIII[12]] = lIlllIllIl("EIWSmZM59/9lUPVE3imvdA==", "WVFCJ");
      lIllIIlIl[lIllIlIII[13]] = lIlllIllIl("Ttiv11Cm6tN1GwYK7BIiGg==", "mdRYt");
   }

   private static boolean lIllllIllI(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean lIllllIlll(int var0, int var1) {
      return var0 < var1;
   }

   public Ꞁ() {
      super(lIllIIlIl[lIllIlIII[7]], lIllIIlIl[lIllIlIII[8]], ı５.ⲋ, lIllIlIII[1], (boolean)lIllIlIII[1], (boolean)lIllIlIII[1], lIllIlIII[9], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIllIIlIl[lIllIlIII[10]], lIllIlIII[6]).u((Object)lIllIlIII[1]).ᴃᎲ((Object)lIllIlIII[6]).ᴃᎲ(lIllIIlIl[lIllIlIII[11]]);
      this.u = this.ⲋ(lIllIIlIl[lIllIlIII[12]], 0.1D).u((Object)0.0D).ᴃᎲ((Object)1.0D);
      this.ᴃᎲ = this.ⲋ(lIllIIlIl[lIllIlIII[13]], Boolean.valueOf((boolean)lIllIlIII[2]));
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIllIlIII[1]])).intValue();
   }

   private static void lIllllIIll() {
      lIllIlIII = new int[15];
      lIllIlIII[0] = "   ".length();
      lIllIlIII[1] = (139 ^ 150 ^ 84 ^ 122) & (203 ^ 151 ^ 224 ^ 143 ^ -" ".length());
      lIllIlIII[2] = " ".length();
      lIllIlIII[3] = "  ".length();
      lIllIlIII[4] = 17 ^ 21;
      lIllIlIII[5] = 41 ^ 44;
      lIllIlIII[6] = 240 ^ 145 ^ 76 ^ 73;
      lIllIlIII[7] = 70 + 54 - 71 + 99 ^ 105 + 99 - 174 + 128;
      lIllIlIII[8] = 119 ^ 112;
      lIllIlIII[9] = 8 + 55 - -71 + 7 ^ 23 + 34 - -24 + 100;
      lIllIlIII[10] = 200 ^ 192;
      lIllIlIII[11] = 38 ^ 47;
      lIllIlIII[12] = 46 + 51 - -37 + 13 ^ 118 + 124 - 217 + 128;
      lIllIlIII[13] = 163 ^ 143 ^ 15 ^ 40;
      lIllIlIII[14] = 72 + 167 - 136 + 69 ^ 45 + 124 - 53 + 44;
   }

   private static boolean lIllllIlIl(int var0) {
      return var0 != 0;
   }

   private static String lIlllIllIl(String llIIlIllIllIlIl, String llIIlIllIllIlII) {
      try {
         short llIIlIllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIlIllIllIlll = Cipher.getInstance("Blowfish");
         llIIlIllIllIlll.init(lIllIlIII[3], llIIlIllIllIIIl);
         return new String(llIIlIllIllIlll.doFinal(Base64.getDecoder().decode(llIIlIllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllllIlII(int var0) {
      return var0 == 0;
   }
}
