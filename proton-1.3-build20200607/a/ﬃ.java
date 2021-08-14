package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0013B\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00068G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\u0086\u0084\u0002R\"\u0010\b\u001a\u00020\n8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0002\u0010\u000b¨\u0006\u0086\u0084\u0002R&\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\t\"\u0004\b\u0004\u0010\u000e¨\u0006\u0086\u000e"},
   d2 = {"La/ﬃ;", "", "ĂƂ", "La/ⅹ;", "ⲋ", "()I", "", "ᴃᎲ", "u", "()D", "", "()Z", "〥ҳⱆ", "D", "(D)V", "", "Ἠ", "()V", "<init>", "La/ⳅ;"}
)
public final class ﬃ extends ⳅ {
   private static boolean lIIlll(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "u"
   )
   public final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[llIl[3]])).doubleValue();
   }

   private static String I(String lllllllIIIIIIll, String lllllllIIIIIIlI) {
      lllllllIIIIIIll = new String(Base64.getDecoder().decode(lllllllIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      short llllllIllllllII = new StringBuilder();
      char[] lllllllIIIIIIII = lllllllIIIIIIlI.toCharArray();
      String llllllIlllllIlI = llIl[1];
      double llllllIlllllIIl = lllllllIIIIIIll.toCharArray();
      int llllllIlllllIII = llllllIlllllIIl.length;
      int llllllIllllIlll = llIl[1];

      do {
         if (!lIlIlI(llllllIllllIlll, llllllIlllllIII)) {
            return String.valueOf(llllllIllllllII);
         }

         char lllllllIIIIIlII = llllllIlllllIIl[llllllIllllIlll];
         llllllIllllllII.append((char)(lllllllIIIIIlII ^ lllllllIIIIIIII[llllllIlllllIlI % lllllllIIIIIIII.length]));
         "".length();
         ++llllllIlllllIlI;
         ++llllllIllllIlll;
         "".length();
      } while((31 ^ 27) != 0);

      return null;
   }

   static {
      llllI();
      lllII();
      KProperty[] var10000 = new KProperty[llIl[0]];
      var10000[llIl[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ﬃ.class), I[llIl[1]], I[llIl[2]]));
      var10000[llIl[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ﬃ.class), I[llIl[3]], I[llIl[0]]));
      var10000[llIl[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ﬃ.class), I[llIl[4]], I[llIl[5]]));
      ⲋ = var10000;
   }

   private static int lIIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static String lI(String llllllIlllIlllI, String llllllIlllIllIl) {
      try {
         SecretKeySpec llllllIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllllIllllIIII = Cipher.getInstance("Blowfish");
         llllllIllllIIII.init(llIl[3], llllllIllllIIIl);
         return new String(llllllIllllIIII.doFinal(Base64.getDecoder().decode(llllllIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIll(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.〥ҳⱆ = var1;
   }

   private static boolean lIlIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return (Boolean)this.u.ⲋ(this, ⲋ[llIl[2]]);
   }

   private static boolean lIIllI(int var0) {
      return var0 <= 0;
   }

   private static String llIll(String llllllIlllIIIIl, String llllllIlllIIIII) {
      try {
         SecretKeySpec llllllIlllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIlllIIIII.getBytes(StandardCharsets.UTF_8)), llIl[8]), "DES");
         Cipher llllllIlllIIIll = Cipher.getInstance("DES");
         llllllIlllIIIll.init(llIl[3], llllllIlllIIlII);
         return new String(llllllIlllIIIll.doFinal(Base64.getDecoder().decode(llllllIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlII(int var0) {
      return var0 != 0;
   }

   public ﬃ() {
      super(I[llIl[7]], I[llIl[8]], ı５.ς, llIl[1], (boolean)llIl[1], (boolean)llIl[1], llIl[9], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(I[llIl[10]], llIl[3]).u((Object)llIl[1]).ᴃᎲ((Object)llIl[11]);
      this.u = this.ⲋ(I[llIl[12]], Boolean.valueOf((boolean)llIl[2]));
      this.ᴃᎲ = this.ⲋ(I[llIl[13]], 0.42D).u((Object)0.0D).ᴃᎲ((Object)0.42D);
   }

   private static boolean lIlIII(Object var0) {
      return var0 != null;
   }

   private static void llllI() {
      llIl = new int[15];
      llIl[0] = "   ".length();
      llIl[1] = (42 ^ 95 ^ 73 ^ 11) & (69 + 173 - 70 + 3 ^ 95 + 3 - -17 + 37 ^ -" ".length());
      llIl[2] = " ".length();
      llIl[3] = "  ".length();
      llIl[4] = 32 ^ 40 ^ 178 ^ 190;
      llIl[5] = 152 ^ 157;
      llIl[6] = 75 + 75 - 126 + 126 ^ 143 + 110 - 195 + 86;
      llIl[7] = 69 ^ 89 ^ 165 ^ 190;
      llIl[8] = 138 ^ 159 ^ 190 ^ 163;
      llIl[9] = 186 ^ 130;
      llIl[10] = 116 ^ 102 ^ 75 ^ 80;
      llIl[11] = 50 ^ 8 ^ 158 ^ 176;
      llIl[12] = 126 + 57 - 154 + 115 ^ 10 + 63 - 42 + 123;
      llIl[13] = 142 ^ 133;
      llIl[14] = 86 ^ 90;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final double ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   private static void lllII() {
      I = new String[llIl[14]];
      I[llIl[1]] = I("Kj07LzAzByYpKTA=", "CSOJB");
      I[llIl[2]] = lI("GSt3mW/KKUHpNjQBE3OBe92HqwnJ08SM", "iSsht");
      I[llIl[3]] = lI("VvOQJR23+1U=", "sHdgu");
      I[llIl[0]] = lI("XGzhqy6paO0nTJkCaNyQtg==", "gtNDQ");
      I[llIl[4]] = lI("IgH9omg8qWI=", "PXbLc");
      I[llIl[5]] = I("EicYDBwBKwMvKl1rKA==", "uBlAs");
      I[llIl[6]] = lI("8ETnyRHUcJx3QBEOVLkbYSlPfM5ycLelfUzArb3+xQnXQBkxy5obo+JlLuUHS+eMR8p8b5tb3w09UMZrL3+po2ea4900NQPudFd5Zl+1h7Y=", "jOOhS");
      I[llIl[7]] = lI("8RCgbfAGM5CGByFjRc/BgA==", "pgDUO");
      I[llIl[8]] = llIll("kUCwVKE77HIvEoCb0Writsg0xS3devh9JfbFfBN3BojOiZnBXvzctuW5NYe8s33G", "lzyXC");
      I[llIl[10]] = I("PjkfIgIHOAcmBB44BQ==", "wWkGp");
      I[llIl[12]] = lI("VotjnBtphtU=", "rvvAD");
      I[llIl[13]] = lI("VD9f4vr99AoI6l4HXue0XQ==", "YRsNb");
   }

   private static boolean lIlIIl(int var0) {
      return var0 > 0;
   }

   public void Ἠ() {
      ơ߀ var2 = ơ߀.ⲋ;
      Class var3 = ⴔ.class;
      int var4 = llIl[1];
      Object var10000 = var2.ⲋ().get(ⴔ.class);
      if (lIIIll(var10000)) {
         throw new TypeCastException(I[llIl[6]]);
      } else {
         boolean lllllllIIIlIIll = (ⴔ)((ⳅ)((ⴔ)var10000));
         if (!lIIlII(lllllllIIIlIIll.Ɏ()) || !lIIlIl(lllllllIIIlIIll.u(), ⴔ.ⲋ.ĂƂ)) {
            int var10;
            if (lIIlII(lllllllIIIlIlII.ĂƂ()) && lIIlII(lllllllIIIlIlII.ɡ().field_71474_y.field_74314_A.func_151470_d())) {
               var10 = llIl[2];
               "".length();
               if (((82 ^ 15 ^ 140 ^ 199) & (107 + 125 - 141 + 59 ^ 109 + 103 - 92 + 8 ^ -" ".length())) == "   ".length()) {
                  return;
               }
            } else {
               var10 = llIl[1];
            }

            float lllllllIIIlIIlI = var10;
            Exception lllllllIIIlIIIl = Ṑ.ĂƂ((Entity)lllllllIIIlIlII.ɡ().field_71439_g, (double)lllllllIIIlIlII.ⲋ());
            if (lIIlII(lllllllIIIlIIlI)) {
               lllllllIIIlIIIl = Ṑ.ĂƂ((Entity)lllllllIIIlIlII.ɡ().field_71439_g, 2.0D);
               lllllllIIIlIlII.ɡ().field_71439_g.field_70159_w = 0.0D;
               lllllllIIIlIlII.ɡ().field_71439_g.field_70179_y = 0.0D;
            }

            long lllllllIIIlIIII = (new BlockPos(lllllllIIIlIIIl)).func_177977_b();
            if (lIIlII(lllllllIIIlIIlI)) {
               float var10001 = (float)lllllllIIIlIIII.field_177960_b;
               if (lIIllI(lIIIII(lllllllIIIlIlII.ɡ().field_71439_g.field_70163_u, (double)(var10001 + 1.0F)))) {
                  return;
               }
            }

            if (!lIIlll(lllllllIIIlIlII.ɡ().field_71441_e.func_180495_p(lllllllIIIlIIII).func_185904_a().func_76222_j())) {
               String lllllllIIIIllll = (Integer)SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(ⲉ.ⲋ.u(), (Function1)null.ⲋ), (Function1)null.ⲋ));
               if (lIlIII(lllllllIIIIllll)) {
                  short lllllllIIIIlllI = lllllllIIIlIlII.ɡ().field_71439_g.field_71071_by.field_70461_c;
                  lllllllIIIlIlII.ɡ().field_71439_g.field_71071_by.field_70461_c = lllllllIIIIllll;
                  if (lIIlII(šⱙ.ⲋ.u(lllllllIIIlIIII))) {
                     šⱙ.ⲋ.ⲋ(lllllllIIIlIIII);
                  }

                  if (lIIlII(lllllllIIIlIIlI)) {
                     if (lIIlII(lllllllIIIlIlII.ɡ().field_71439_g.field_70122_E)) {
                        lllllllIIIlIlII.〥ҳⱆ = lllllllIIIlIlII.ɡ().field_71439_g.field_70163_u;
                        lllllllIIIlIlII.ɡ().field_71439_g.field_70181_x = lllllllIIIlIlII.u();
                     }

                     if (lIlIIl(lIIIlI(lllllllIIIlIlII.ɡ().field_71439_g.field_70163_u, lllllllIIIlIlII.〥ҳⱆ + lllllllIIIlIlII.u()))) {
                        lllllllIIIlIlII.ɡ().field_71439_g.func_70107_b(lllllllIIIlIlII.ɡ().field_71439_g.field_70165_t, (double)MathKt.roundToInt(lllllllIIIlIlII.ɡ().field_71439_g.field_70163_u), lllllllIIIlIlII.ɡ().field_71439_g.field_70161_v);
                        lllllllIIIlIlII.ɡ().field_71439_g.field_70181_x = lllllllIIIlIlII.u();
                        lllllllIIIlIlII.〥ҳⱆ = lllllllIIIlIlII.ɡ().field_71439_g.field_70163_u;
                        "".length();
                        if (" ".length() != " ".length()) {
                           return;
                        }
                     }
                  } else {
                     lllllllIIIlIlII.〥ҳⱆ = 0.0D;
                  }

                  lllllllIIIlIlII.ɡ().field_71439_g.field_71071_by.field_70461_c = lllllllIIIIlllI;
               }

            }
         }
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[llIl[1]])).intValue();
   }

   private static boolean lIIlIl(Object var0, Object var1) {
      return var0 != var1;
   }
}
