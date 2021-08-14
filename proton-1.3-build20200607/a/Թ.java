package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.client.gui.GuiScreen;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0013\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0013\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0002\u0010\t¨\u0006\u0086\u0004R\"\u0010\u0004\u001a\u00020\u000b8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e¨\u0006\u0086\u0084\u0002R\"\u0010\u0002\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\b\u0010\u0011¨\u0006\u0086\u0084\u0002R\"\u0010\b\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0086\u0084\u0002R\"\u0010\u0010\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0086\u0084\u0002R\"\u0010\u0012\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0003\u001a\u0004\b\f\u0010\u0011¨\u0006\u0086\u0084\u0002R\"\u0010\r\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u0006\u0010\u0011¨\u0006\u0086\u0084\u0002R\"\u0010\f\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0086\u0084\u0002R\"\u0010\u0014\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\n\u0010\u0005¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/Թ;", "", "ᴃᎲ", "La/ⅹ;", "u", "()Z", "ⲋ", "La/ⅹ;", "〥ҳⱆ", "()La/ⅹ;", "ĂƂ", "", "Ꜥ", "ς", "()D", "", "Ἒⅾ", "()I", "ϛⰄ", "Đ", "ⲡ", "", "()V", "<init>", "La/ⳅ;"}
)
public final class Թ extends ⳅ {
   @JvmName(
      name = "〥ҳⱆ"
   )
   public final int 〥ҳⱆ() {
      return ((Number)this.Ἒⅾ.ⲋ(this, ⲋ[lllll[4]])).intValue();
   }

   @JvmName(
      name = "ⲡ"
   )
   public final int ⲡ() {
      return ((Number)this.Đ.ⲋ(this, ⲋ[lllll[9]])).intValue();
   }

   private static String lIIlIlI(String lllllIIlIlIIllI, String lllllIIlIlIIlll) {
      try {
         char lllllIIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllIIlIlIlIlI = Cipher.getInstance("Blowfish");
         lllllIIlIlIlIlI.init(lllll[3], lllllIIlIlIIlII);
         return new String(lllllIIlIlIlIlI.doFinal(Base64.getDecoder().decode(lllllIIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIlIl() {
      lllll = new int[45];
      lllll[0] = 1 ^ 8;
      lllll[1] = (71 ^ 97) & ~(173 ^ 139);
      lllll[2] = " ".length();
      lllll[3] = "  ".length();
      lllll[4] = "   ".length();
      lllll[5] = 121 + 164 - 193 + 101 ^ 111 + 195 - 199 + 90;
      lllll[6] = 34 ^ 39;
      lllll[7] = 19 + 67 - -64 + 7 ^ 9 + 108 - 113 + 151;
      lllll[8] = 171 ^ 147 ^ 155 ^ 164;
      lllll[9] = 9 ^ 1;
      lllll[10] = 143 ^ 133;
      lllll[11] = 139 ^ 128;
      lllll[12] = 143 ^ 131;
      lllll[13] = 163 ^ 174;
      lllll[14] = 55 ^ 57;
      lllll[15] = 205 ^ 194;
      lllll[16] = 120 ^ 104;
      lllll[17] = 19 ^ 24 ^ 83 ^ 73;
      lllll[18] = 150 ^ 132;
      lllll[19] = 87 + 97 - 47 + 17 ^ 56 + 96 - 102 + 87;
      lllll[20] = 141 ^ 161;
      lllll[21] = 96 + 49 - 128 + 139 ^ 118 + 167 - 273 + 160;
      lllll[22] = 186 + 87 - 145 + 61 ^ 132 + 120 - 88 + 5;
      lllll[23] = 130 ^ 186 ^ 6 ^ 12;
      lllll[24] = 231 ^ 131;
      lllll[25] = 39 ^ 50;
      lllll[26] = 60 + 95 - 19 + 20 ^ 60 + 65 - 110 + 123;
      lllll[27] = 104 ^ 88 ^ 103 ^ 64;
      lllll[28] = 219 ^ 160 ^ 49 ^ 82;
      lllll[29] = 186 ^ 169 ^ 19 ^ 25;
      lllll[30] = 127 ^ 88 ^ 165 ^ 152;
      lllll[31] = 117 ^ 83 ^ 153 ^ 164;
      lllll[32] = 127 ^ 99;
      lllll[33] = 130 ^ 170;
      lllll[34] = 185 ^ 164;
      lllll[35] = (225 ^ 197) & ~(147 ^ 183) ^ 55 ^ 41;
      lllll[36] = 120 ^ 103;
      lllll[37] = 82 + 144 - 93 + 33 ^ 91 + 120 - 171 + 94;
      lllll[38] = 58 + 60 - 106 + 160 + (168 ^ 174) - (146 + 141 - 244 + 116) + 85 + 100 - 164 + 160;
      lllll[39] = (73 ^ 52) + (158 ^ 152) - (129 ^ 142) + (65 ^ 99);
      lllll[40] = -(-4433 & 24412) & -8193 & 28671;
      lllll[41] = 112 ^ 81;
      lllll[42] = -23634 & 23933;
      lllll[43] = -4114 & 5113;
      lllll[44] = 253 ^ 192 ^ 143 ^ 144;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ⅹ<Boolean> ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   static {
      lIlIlIl();
      lIlIlII();
      KProperty[] var10000 = new KProperty[lllll[0]];
      var10000[lllll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[1]], llIlI[lllll[2]]));
      var10000[lllll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[3]], llIlI[lllll[4]]));
      var10000[lllll[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[5]], llIlI[lllll[6]]));
      var10000[lllll[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[7]], llIlI[lllll[8]]));
      var10000[lllll[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[9]], llIlI[lllll[0]]));
      var10000[lllll[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[10]], llIlI[lllll[11]]));
      var10000[lllll[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[12]], llIlI[lllll[13]]));
      var10000[lllll[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[14]], llIlI[lllll[15]]));
      var10000[lllll[9]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Թ.class), llIlI[lllll[16]], llIlI[lllll[17]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return (Boolean)this.u.ⲋ(this, ⲋ[lllll[2]]);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lllll[1]])).intValue();
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final int Ꜥ() {
      return ((Number)this.ⲡ.ⲋ(this, ⲋ[lllll[8]])).intValue();
   }

   public Թ() {
      super(llIlI[lllll[18]], llIlI[lllll[19]], ı５.ϛⰄ, lllll[20], (boolean)lllll[1], (boolean)lllll[1], lllll[21], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIlI[lllll[22]], lllll[23]).u((Object)lllll[2]).ᴃᎲ((Object)lllll[24]).ᴃᎲ(llIlI[lllll[25]]).u(llIlI[lllll[26]]);
      this.u = this.ⲋ(llIlI[lllll[27]], Boolean.valueOf((boolean)lllll[2])).u(llIlI[lllll[28]]);
      this.ᴃᎲ = this.ⲋ(llIlI[lllll[29]], Boolean.valueOf((boolean)lllll[1]));
      this.〥ҳⱆ = this.ⲋ(llIlI[lllll[30]], Boolean.valueOf((boolean)lllll[1])).u(llIlI[lllll[31]]);
      this.Ἒⅾ = this.ⲋ(llIlI[lllll[32]], lllll[32]).u((Object)lllll[2]).ᴃᎲ((Object)lllll[33]);
      this.ϛⰄ = this.ⲋ(llIlI[lllll[34]], lllll[22]).u((Object)lllll[2]).ᴃᎲ((Object)lllll[33]);
      this.ς = this.ⲋ(llIlI[lllll[35]], lllll[33]).u((Object)lllll[2]).ᴃᎲ((Object)lllll[24]);
      this.Ꜥ = this.ⲋ(llIlI[lllll[36]], 2.0D).u((Object)0.0D).ᴃᎲ((Object)5.0D);
      this.ⲡ = this.ⲋ(llIlI[lllll[37]], lllll[38]).u((Object)lllll[39]).ᴃᎲ((Object)lllll[40]);
      this.Đ = this.ⲋ(llIlI[lllll[41]], lllll[42]).u((Object)lllll[38]).ᴃᎲ((Object)lllll[43]);
      this.〥ҳⱆ.ⲋ().ⲋ((Function1)null.ⲋ);
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final int Ἒⅾ() {
      return ((Number)this.ϛⰄ.ⲋ(this, ⲋ[lllll[5]])).intValue();
   }

   private static void lIlIlII() {
      llIlI = new String[lllll[44]];
      llIlI[lllll[1]] = lIIlIII("ISAjFwghFywHCA==", "SEMsm");
      llIlI[lllll[2]] = lIIlIII("Eh8fHgwbHg4+OxQODmRAPA==", "uzkLi");
      llIlI[lllll[3]] = lIIlIIl("p5NPajwuPJ4=", "wdnjE");
      llIlI[lllll[4]] = lIIlIIl("t0exHXNtTqqtOQKY/rJ9pg==", "OmKTi");
      llIlI[lllll[5]] = lIIlIlI("QH7Z3OvWRIY=", "VqjhO");
      llIlI[lllll[6]] = lIIlIII("ATAaMDkLJQ8QIk58NA==", "fUnsV");
      llIlI[lllll[7]] = lIIlIII("ExYcMhocAxc=", "uyrFI");
      llIlI[lllll[8]] = lIIlIII("CiwxHgsDPRYxHghhbBE=", "mIEXd");
      llIlI[lllll[9]] = lIIlIII("AAwiGAE1Di0APhobJg==", "saCtm");
      llIlI[lllll[0]] = lIIlIIl("MN1rlfbyWt9UHR3OfaQ+x1uV3VBPzMph", "fVTQo");
      llIlI[lllll[10]] = lIIlIII("LBM0IDwqEgMPKSE=", "DfPfS");
      llIlI[lllll[11]] = lIIlIII("FyERJhsUAgoAGiMtHwtGWQ0=", "pDenn");
      llIlI[lllll[12]] = lIIlIlI("PrDoQMY5Ix5U3PhamshNthfyPVLUe0MO", "pUDWz");
      llIlI[lllll[13]] = lIIlIII("NjU+Hxk/JBkxFzU/PRYQNyMvLV54FA==", "QPJYv");
      llIlI[lllll[14]] = lIIlIII("BCUAJC4HIBcEEAAgDBs=", "iDxsG");
      llIlI[lllll[15]] = lIIlIlI("bTFdcax4k3LowsPw1mVKWiWcSsFGuipp", "sBLYo");
      llIlI[lllll[16]] = lIIlIII("GxQTPjkYEQQeGBMcDAEk", "vukiP");
      llIlI[lllll[17]] = lIIlIlI("HFnfLYvyGWkfbgOfic+Q6aIt2G75H6kq", "DWsUd");
      llIlI[lllll[18]] = lIIlIlI("r/6Bc1PAvu0abzNjK982hg==", "cBTcI");
      llIlI[lllll[19]] = lIIlIlI("cbcI6Gjj2I2l/m955FkgLtk7c11qBEWZ", "DVZYE");
      llIlI[lllll[22]] = lIIlIII("IiokLxYCbxgqBxU=", "pOJKs");
      llIlI[lllll[25]] = lIIlIlI("3buAqrrih2I=", "EQtlF");
      llIlI[lllll[26]] = lIIlIIl("SwQ33p7J94v/igH457uean9NrnKdd8JR02uBpCJh0RI=", "SMmxg");
      llIlI[lllll[27]] = lIIlIII("EQg9FCE=", "FgRgI");
      llIlI[lllll[28]] = lIIlIIl("5o4MmdF19uKjh/g+7b7we1gblP7wOwGUVmjI/EKVg3w=", "rjogP");
      llIlI[lllll[29]] = lIIlIIl("iV4AGcqJIIc=", "LZwHi");
      llIlI[lllll[30]] = lIIlIII("OQYmIgQXNTo4Hw==", "zsUVk");
      llIlI[lllll[31]] = lIIlIIl("PCARb9AyDJFuzipwaI3rQ5SGX70rO/rCnesNhbQXi9basvkMYzv44GL/EI3YyV+2DiNGZTbeNdgutitcj3vD9ik+ndBp8Onmke2Esoa/WB3uc73WboGQkSwts0a0MA1ehwHaEK3xv/fxiknDWBTem/wAutTlytZNf3mPUWfEOBP5COazHJCH8tylErUOeIWP", "Wsxit");
      llIlI[lllll[32]] = lIIlIII("Nz0YA1YiOwwS", "qRvwv");
      llIlI[lllll[34]] = lIIlIII("FAoKDh1nIQQMBWc0AhgU", "Ggkbq");
      llIlI[lllll[35]] = lIIlIIl("CZ+GiS+FfLmdNfRiCR5EIw==", "KLyIm");
      llIlI[lllll[36]] = lIIlIII("NAssJE0hDCM0AgVEDTYLAQE2", "rdBPm");
      llIlI[lllll[37]] = lIIlIII("OAYgDBUYTxkBHhsH", "ooNhz");
      llIlI[lllll[41]] = lIIlIII("ERE8ASMxWBoAJSEQJg==", "FxReL");
   }

   private static String lIIlIII(String lllllIIlIIllIII, String lllllIIlIIlIlll) {
      lllllIIlIIllIII = new String(Base64.getDecoder().decode(lllllIIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllIIlIIlIllI = new StringBuilder();
      float lllllIIlIIlIIII = lllllIIlIIlIlll.toCharArray();
      long lllllIIlIIIllll = lllll[1];
      int lllllIIlIIIlllI = lllllIIlIIllIII.toCharArray();
      float lllllIIlIIIllIl = lllllIIlIIIlllI.length;
      int lllllIIlIIIllII = lllll[1];

      do {
         if (!llIlIll(lllllIIlIIIllII, lllllIIlIIIllIl)) {
            return String.valueOf(lllllIIlIIlIllI);
         }

         char lllllIIlIIllIIl = lllllIIlIIIlllI[lllllIIlIIIllII];
         lllllIIlIIlIllI.append((char)(lllllIIlIIllIIl ^ lllllIIlIIlIIII[lllllIIlIIIllll % lllllIIlIIlIIII.length]));
         "".length();
         ++lllllIIlIIIllll;
         ++lllllIIlIIIllII;
         "".length();
      } while(-"  ".length() <= 0);

      return null;
   }

   private static boolean llIlIIl(int var0) {
      return var0 == 0;
   }

   private static boolean llIlIll(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ς"
   )
   public final double ς() {
      return ((Number)this.Ꜥ.ⲋ(this, ⲋ[lllll[7]])).doubleValue();
   }

   protected void Đ() {
      if (llIlIIl(this.ɡ().field_71462_r instanceof Ꚑ)) {
         ⱉȬ.ᴃᎲ.ꙑứ();
         this.ɡ().func_147108_a((GuiScreen)(new Ꚑ(this.ɡ().field_71462_r)));
      }

   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return (Boolean)this.ᴃᎲ.ⲋ(this, ⲋ[lllll[3]]);
   }

   private static String lIIlIIl(String lllllIIlIIIIIll, String lllllIIlIIIIIII) {
      try {
         SecretKeySpec lllllIIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), lllll[9]), "DES");
         Cipher lllllIIlIIIIlIl = Cipher.getInstance("DES");
         lllllIIlIIIIlIl.init(lllll[3], lllllIIlIIIIllI);
         return new String(lllllIIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllIIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final int ϛⰄ() {
      return ((Number)this.ς.ⲋ(this, ⲋ[lllll[6]])).intValue();
   }
}
