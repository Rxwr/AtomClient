package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u001e:\u0002\u0006\bB\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\b\u001a\u00020\u00078G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\t¨\u0006\u0086\u0084\u0002R&\u0010\r\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e¨\u0006\u0086\u000eR\"\u0010\u0010\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\u0012\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\u0011\u001a\u00020\u00138G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0086\u0084\u0002R\"\u0010\u0004\u001a\u00020\u00158G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\b\u0010\u0016¨\u0006\u0086\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00178G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0086\u0084\u0002R\"\u0010\u000f\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\f\u001a\u00020\u00158G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\r\u0010\u0016¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/ⰱ;", "", "ς", "La/ⅹ;", "ϛⰄ", "()Z", "ⲋ", "", "ĂƂ", "()I", "Đ", "I", "ⲡ", "u", "(I)V", "Ꜥ", "ᴃᎲ", "Ἒⅾ", "〥ҳⱆ", "La/ⰱ$ⲋ;", "()La/ⰱ$ⲋ;", "", "()D", "La/ⰱ$ĂƂ;", "()La/ⰱ$ĂƂ;", "", "ʅ", "()V", "Ἠ", "<init>", "La/ⳅ;"}
)
public final class ⰱ extends ⳅ {
   @JvmName(
      name = "Ꜥ"
   )
   public final boolean Ꜥ() {
      return (Boolean)this.ⲡ.ⲋ(this, ⲋ[llIlIl[9]]);
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final boolean ϛⰄ() {
      return (Boolean)this.ς.ⲋ(this, ⲋ[llIlIl[7]]);
   }

   private static boolean lIIIlIII(int var0) {
      return var0 <= 0;
   }

   private static void lIIIIIll() {
      llIlIl = new int[35];
      llIlIl[0] = 146 ^ 155;
      llIlIl[1] = (36 ^ 31 ^ 209 ^ 197) & (105 ^ 14 ^ 64 ^ 8 ^ -" ".length());
      llIlIl[2] = " ".length();
      llIlIl[3] = "  ".length();
      llIlIl[4] = "   ".length();
      llIlIl[5] = 164 ^ 160;
      llIlIl[6] = 10 ^ 17 ^ 97 ^ 127;
      llIlIl[7] = 72 + 130 - 98 + 51 ^ 78 + 36 - 82 + 125;
      llIlIl[8] = 195 ^ 148 ^ 147 ^ 195;
      llIlIl[9] = 1 ^ 102 ^ 254 ^ 145;
      llIlIl[10] = 75 ^ 65;
      llIlIl[11] = 144 ^ 155;
      llIlIl[12] = 90 ^ 86;
      llIlIl[13] = 186 ^ 183;
      llIlIl[14] = 151 + 126 - 229 + 138 ^ 177 + 93 - 257 + 167;
      llIlIl[15] = 150 + 55 - 150 + 126 ^ 38 + 185 - 89 + 52;
      llIlIl[16] = 186 ^ 170;
      llIlIl[17] = 32 ^ 109 ^ 40 ^ 116;
      llIlIl[18] = 70 + 117 - 14 + 1 ^ 109 + 100 - 156 + 135;
      llIlIl[19] = 96 ^ 83 ^ 110 ^ 78;
      llIlIl[20] = 127 ^ 87;
      llIlIl[21] = 33 ^ 53;
      llIlIl[22] = 80 + 57 - 48 + 38 ^ 208 ^ 186;
      llIlIl[23] = 53 ^ 13;
      llIlIl[24] = 36 ^ 50;
      llIlIl[25] = 71 ^ 80;
      llIlIl[26] = 31 ^ 48 ^ 107 ^ 92;
      llIlIl[27] = 42 ^ 51;
      llIlIl[28] = 87 ^ 77;
      llIlIl[29] = 172 ^ 183;
      llIlIl[30] = 85 ^ 55 ^ 213 ^ 171;
      llIlIl[31] = 24 ^ 5;
      llIlIl[32] = 125 ^ 99;
      llIlIl[33] = 125 ^ 98;
      llIlIl[34] = 68 ^ 51 ^ 123 ^ 44;
   }

   @JvmName(
      name = "u"
   )
   public final void u(int var1) {
      this.Đ = var1;
   }

   @JvmName(
      name = "ς"
   )
   public final boolean ς() {
      return (Boolean)this.Ꜥ.ⲋ(this, ⲋ[llIlIl[8]]);
   }

   private static boolean lIIIIlII(int var0) {
      return var0 != 0;
   }

   public ⰱ() {
      super(llIIIl[llIlIl[21]], llIIIl[llIlIl[22]], ı５.ⲋ, llIlIl[1], (boolean)llIlIl[1], (boolean)llIlIl[1], llIlIl[23], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIIIl[llIlIl[24]], llIlIl[2]).u((Object)llIlIl[2]).ᴃᎲ((Object)llIlIl[19]);
      this.u = this.ⲋ(llIIIl[llIlIl[25]], 4.0D).u((Object)0.0D).ᴃᎲ((Object)6.0D);
      this.ᴃᎲ = this.ⲋ(llIIIl[llIlIl[26]], 3.0D).u((Object)0.0D).ᴃᎲ((Object)6.0D);
      this.〥ҳⱆ = this.ⲋ(llIIIl[llIlIl[27]], ⰱ.ⲋ.ⲋ);
      this.Ἒⅾ = this.ⲋ(llIIIl[llIlIl[28]], ⰱ.ĂƂ.ⲋ);
      this.ϛⰄ = this.ⲋ(llIIIl[llIlIl[29]], Boolean.valueOf((boolean)llIlIl[2]));
      this.ς = this.ⲋ(llIIIl[llIlIl[30]], Boolean.valueOf((boolean)llIlIl[2]));
      this.Ꜥ = this.ⲋ(llIIIl[llIlIl[31]], Boolean.valueOf((boolean)llIlIl[2]));
      this.ⲡ = this.ⲋ(llIIIl[llIlIl[32]], Boolean.valueOf((boolean)llIlIl[2])).u(llIIIl[llIlIl[33]]);
   }

   private static boolean lIIIllII(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIIIIIll();
      llllIll();
      KProperty[] var10000 = new KProperty[llIlIl[0]];
      var10000[llIlIl[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[1]], llIIIl[llIlIl[2]]));
      var10000[llIlIl[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[3]], llIIIl[llIlIl[4]]));
      var10000[llIlIl[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[5]], llIIIl[llIlIl[6]]));
      var10000[llIlIl[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[7]], llIIIl[llIlIl[8]]));
      var10000[llIlIl[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[9]], llIIIl[llIlIl[0]]));
      var10000[llIlIl[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[10]], llIIIl[llIlIl[11]]));
      var10000[llIlIl[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[12]], llIIIl[llIlIl[13]]));
      var10000[llIlIl[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[14]], llIIIl[llIlIl[15]]));
      var10000[llIlIl[9]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⰱ.class), llIIIl[llIlIl[16]], llIIIl[llIlIl[17]]));
      ⲋ = var10000;
   }

   private static String llIlllI(String llllIlllIIlIIlI, String llllIlllIIlIIIl) {
      try {
         SecretKeySpec llllIlllIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllIlllIIlIllI = Cipher.getInstance("Blowfish");
         llllIlllIIlIllI.init(llIlIl[3], llllIlllIIlIlll);
         return new String(llllIlllIIlIllI.doFinal(Base64.getDecoder().decode(llllIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void llllIll() {
      llIIIl = new String[llIlIl[34]];
      llIIIl[llIlIl[1]] = llIlllI("FE22P9kmkrc=", "OEwnH");
      llIIIl[llIlIl[2]] = lllIIII("FQQhDRoGMzQxFlpIHA==", "raUEs");
      llIIIl[llIlIl[3]] = lllIIIl("f6GZEv5NbzA=", "RypTl");
      llIIIl[llIlIl[4]] = llIlllI("N8thSe3JWNuejWWBuy2aJw==", "gIkgc");
      llIIIl[llIlIl[5]] = lllIIII("FQULPhsDCgA3", "bdgRI");
      llIIIl[llIlIl[6]] = lllIIII("KicSOwAhLjQNDyonTkUl", "MBfla");
      llIIIl[llIlIl[7]] = llIlllI("Zx5fhFsIC7iuoqsvXuRgQw==", "kUMjl");
      llIIIl[llIlIl[8]] = llIlllI("6seZPdt7F1NVnU9uoJOY6gkROYck14oRCkdJNM31Oi0lPYSlDAh8VXEmpZT1PtP6cWoJ9iA+tn4HEILKKALX+A==", "eLMLl");
      llIIIl[llIlIl[9]] = llIlllI("+9frvO7/ZhA=", "SXpgW");
      llIIIl[llIlIl[0]] = lllIIII("ISIhHgM0IDA+Sm8LOC9NKDI2JgczNHo6ECkzOiRNKygxPw4jNHopDSslND5NBzInK0YSJictBzJ8", "FGUJb");
      llIIIl[llIlIl[10]] = lllIIIl("39h/917J9hY=", "SJTsu");
      llIIIl[llIlIl[11]] = lllIIIl("WkAICnxKknF20Tl/wIeB/Q==", "wkVAq");
      llIIIl[llIlIl[12]] = lllIIIl("256YdauBtSU=", "kYgWY");
      llIIIl[llIlIl[13]] = llIlllI("MczQikkWocBI93tMeOoBGw==", "bxeNh");
      llIIIl[llIlIl[14]] = llIlllI("rDJZtADOr2M=", "kcfTl");
      llIIIl[llIlIl[15]] = llIlllI("uPg9jt09OMvO7vu8IlnhIw==", "ghlTT");
      llIIIl[llIlIl[16]] = lllIIIl("8Yl3jfoEZDmTBjJGE9+cbA==", "hshes");
      llIIIl[llIlIl[17]] = lllIIII("Iy4fHRYhCgIlBys/Q2E/", "DKkHe");
      llIIIl[llIlIl[18]] = llIlllI("PX08CbMtlzHBJ3Sx9Uu/G2HQW07fTkG7BJ6GLSaxRQQRDFqKZj/RlG8UYSPFSF/u01eiQfHSf+1QRDNV+K6wGqmYlfc/MYmxB8+a6TgJEoA=", "NTXnk");
      llIIIl[llIlIl[19]] = lllIIII("ByU/NFQKMT02Gx1wMT1UCjEgLFQdP3M2Gwd9PS0YBXAnIQQMcD49WgclMDQRHCN9KAYGJDw2WgQ/Ny0YDCN9OxsEMjIsWig5PjobHQ==", "iPSXt");
      llIIIl[llIlIl[21]] = lllIIII("KRI1Aw==", "hgGbN");
      llIIIl[llIlIl[22]] = llIlllI("fgYXQ2DudSL1ISnATzGgbeW3sfzVlDxP", "HowuM");
      llIIIl[llIlIl[24]] = lllIIIl("oIaZDgqVk83ouFm+/U4HZA==", "hOqpL");
      llIIIl[llIlIl[25]] = lllIIIl("yHYDiHRdQEU=", "kJPyW");
      llIIIl[llIlIl[26]] = llIlllI("Vs3J8QgqJZKJs4e6AMFe5A==", "ZNnuF");
      llIIIl[llIlIl[27]] = llIlllI("9ROK4LbwcCVaSAyfWjqJtg==", "ILlPW");
      llIIIl[llIlIl[28]] = lllIIII("MzEzMDAT", "gPAWU");
      llIIIl[llIlIl[29]] = llIlllI("m8N09sAy5QA=", "dcJdj");
      llIIIl[llIlIl[30]] = llIlllI("HQ2t7euC7wQ=", "MTGRB");
      llIIIl[llIlIl[31]] = lllIIIl("PnFjMF9bm1o=", "BWgGM");
      llIIIl[llIlIl[32]] = lllIIIl("YkpjQYlSc8k=", "YaGcK");
      llIIIl[llIlIl[33]] = lllIIII("CQk2RS8xCDdFLDgPMEUsJRQtADxwCS1L", "PfCeX");
   }

   private static int lIIIIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   @JvmName(
      name = "u"
   )
   public final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[llIlIl[3]])).doubleValue();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ⰱ.ⲋ ᴃᎲ() {
      return (ⰱ.ⲋ)this.〥ҳⱆ.ⲋ(this, ⲋ[llIlIl[4]]);
   }

   private static int lIIIIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIIlIIl(int var0) {
      return var0 > 0;
   }

   protected void ʅ() {
      super.ʅ();
      if (lIIIIlII(this.Ꜥ())) {
         ơ߀ var1 = ơ߀.ⲋ;
         Class var2 = ȴ.class;
         int var3 = llIlIl[1];
         Object var10000 = var1.ⲋ().get(ȴ.class);
         if (lIIIIlIl(var10000)) {
            throw new TypeCastException(llIIIl[llIlIl[18]]);
         }

         ((ȴ)((ⳅ)((ȴ)var10000))).ꙑứ();
      }

      this.Đ = llIlIl[1];
   }

   public void Ἠ() {
      // $FF: Couldn't be decompiled
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final boolean Ἒⅾ() {
      return (Boolean)this.ϛⰄ.ⲋ(this, ⲋ[llIlIl[6]]);
   }

   private static String lllIIII(String llllIllIlllIlll, String llllIllIlllIllI) {
      llllIllIlllIlll = new String(Base64.getDecoder().decode(llllIllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      double llllIllIlllIIII = new StringBuilder();
      boolean llllIllIllIllll = llllIllIlllIllI.toCharArray();
      int llllIllIlllIIll = llIlIl[1];
      float llllIllIllIllIl = llllIllIlllIlll.toCharArray();
      double llllIllIllIllII = llllIllIllIllIl.length;
      int llllIllIllIlIll = llIlIl[1];

      do {
         if (!lIIIllII(llllIllIllIlIll, llllIllIllIllII)) {
            return String.valueOf(llllIllIlllIIII);
         }

         String llllIllIllIlIlI = llllIllIllIllIl[llllIllIllIlIll];
         llllIllIlllIIII.append((char)(llllIllIllIlIlI ^ llllIllIllIllll[llllIllIlllIIll % llllIllIllIllll.length]));
         "".length();
         ++llllIllIlllIIll;
         ++llllIllIllIlIll;
         "".length();
      } while((99 ^ 103) != 0);

      return null;
   }

   @JvmName(
      name = "ⲡ"
   )
   public final int ⲡ() {
      return this.Đ;
   }

   private static boolean lIIIlIlI(int var0) {
      return var0 == 0;
   }

   private static String lllIIIl(String llllIlllIIIIlIl, String llllIlllIIIIlII) {
      try {
         SecretKeySpec llllIlllIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), llIlIl[9]), "DES");
         float llllIlllIIIIIlI = Cipher.getInstance("DES");
         llllIlllIIIIIlI.init(llIlIl[3], llllIlllIIIlIlI);
         return new String(llllIlllIIIIIlI.doFinal(Base64.getDecoder().decode(llllIlllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[llIlIl[2]])).doubleValue();
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[llIlIl[1]])).intValue();
   }

   private static boolean lIIIIlIl(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final ⰱ.ĂƂ 〥ҳⱆ() {
      return (ⰱ.ĂƂ)this.Ἒⅾ.ⲋ(this, ⲋ[llIlIl[5]]);
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ⰱ$ⲋ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private ⲋ() {
      }

      private static boolean lllIIllII(int var0, int var1) {
         return var0 < var1;
      }

      private static String lllIIlIII(String llIlllllIlllIll, String llIlllllIlllIlI) {
         llIlllllIlllIll = new String(Base64.getDecoder().decode(llIlllllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         float llIlllllIlllIIl = new StringBuilder();
         float llIlllllIlllIII = llIlllllIlllIlI.toCharArray();
         char llIlllllIllIlll = llIIlllI[1];
         long llIlllllIllIllI = llIlllllIlllIll.toCharArray();
         short llIlllllIllIlIl = llIlllllIllIllI.length;
         int llIlllllIllIlII = llIIlllI[1];

         do {
            if (!lllIIllII(llIlllllIllIlII, llIlllllIllIlIl)) {
               return String.valueOf(llIlllllIlllIIl);
            }

            char llIlllllIllIIll = llIlllllIllIllI[llIlllllIllIlII];
            llIlllllIlllIIl.append((char)(llIlllllIllIIll ^ llIlllllIlllIII[llIlllllIllIlll % llIlllllIlllIII.length]));
            "".length();
            ++llIlllllIllIlll;
            ++llIlllllIllIlII;
            "".length();
         } while(" ".length() <= "   ".length());

         return null;
      }

      private static String lllIIlIIl(String llIlllllIlIlIIl, String llIlllllIlIlIlI) {
         try {
            boolean llIlllllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            String llIlllllIlIIllI = Cipher.getInstance("Blowfish");
            llIlllllIlIIllI.init(llIIlllI[0], llIlllllIlIIlll);
            return new String(llIlllllIlIIllI.doFinal(Base64.getDecoder().decode(llIlllllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lllIIlIll() {
         llIIlllI = new int[3];
         llIIlllI[0] = "  ".length();
         llIIlllI[1] = (168 + 115 - 138 + 24 ^ 69 + 110 - 136 + 114) & (227 ^ 174 ^ 39 ^ 94 ^ -" ".length());
         llIIlllI[2] = " ".length();
      }

      private static void lllIIlIlI() {
         llIIllIl = new String[llIIlllI[0]];
         llIIllIl[llIIlllI[1]] = lllIIlIII("KjIEAzY3Iw==", "dwEQs");
         llIIllIl[llIIlllI[2]] = lllIIlIIl("uHD4Z+OHZEU=", "GaYQy");
      }

      static {
         lllIIlIll();
         lllIIlIlI();
         ⰱ.ⲋ[] var10001 = new ⰱ.ⲋ[llIIlllI[0]];
         var10001[llIIlllI[1]] = ⲋ = new ⰱ.ⲋ(llIIllIl[llIIlllI[1]], llIIlllI[1]);
         var10001[llIIlllI[2]] = ĂƂ = new ⰱ.ⲋ(llIIllIl[llIIlllI[2]], llIIlllI[2]);
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003"},
      d2 = {"La/ⰱ$ĂƂ;", "ⲋ", "ĂƂ", "u", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ĂƂ {
      private static String lIIllIIIIIl(String lIlIlIIllIllIll, String lIlIlIIllIlllII) {
         try {
            byte lIlIlIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIllIlllII.getBytes(StandardCharsets.UTF_8)), lIIIllIllI[4]), "DES");
            byte lIlIlIIllIllIII = Cipher.getInstance("DES");
            lIlIlIIllIllIII.init(lIIIllIllI[3], lIlIlIIllIllIIl);
            return new String(lIlIlIIllIllIII.doFinal(Base64.getDecoder().decode(lIlIlIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIIllIIIlII() {
         lIIIllIIII = new String[lIIIllIllI[0]];
         lIIIllIIII[lIIIllIllI[1]] = lIIllIIIIIl("fr/gPiNRkOI=", "IRcqk");
         lIIIllIIII[lIIIllIllI[2]] = lIIllIIIIll("ACcgBw==", "HbaCS");
         lIIIllIIII[lIIIllIllI[3]] = lIIllIIIIIl("wy44YZYliO8=", "NzeFg");
      }

      private static void lIIllIlIIlI() {
         lIIIllIllI = new int[5];
         lIIIllIllI[0] = "   ".length();
         lIIIllIllI[1] = (57 ^ 95 ^ 17 ^ 20) & (128 + 140 - 155 + 116 ^ 60 + 42 - 59 + 91 ^ -" ".length());
         lIIIllIllI[2] = " ".length();
         lIIIllIllI[3] = "  ".length();
         lIIIllIllI[4] = 132 ^ 140;
      }

      private ĂƂ() {
      }

      private static boolean lIIllIlIIll(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIIllIIIIll(String lIlIlIIlllIllIl, String lIlIlIIllllIIIl) {
         lIlIlIIlllIllIl = new String(Base64.getDecoder().decode(lIlIlIIlllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lIlIlIIllllIIII = new StringBuilder();
         int lIlIlIIlllIlIlI = lIlIlIIllllIIIl.toCharArray();
         int lIlIlIIlllIlllI = lIIIllIllI[1];
         String lIlIlIIlllIlIII = lIlIlIIlllIllIl.toCharArray();
         int lIlIlIIlllIIlll = lIlIlIIlllIlIII.length;
         int lIlIlIIlllIIllI = lIIIllIllI[1];

         do {
            if (!lIIllIlIIll(lIlIlIIlllIIllI, lIlIlIIlllIIlll)) {
               return String.valueOf(lIlIlIIllllIIII);
            }

            char lIlIlIIllllIIll = lIlIlIIlllIlIII[lIlIlIIlllIIllI];
            lIlIlIIllllIIII.append((char)(lIlIlIIllllIIll ^ lIlIlIIlllIlIlI[lIlIlIIlllIlllI % lIlIlIIlllIlIlI.length]));
            "".length();
            ++lIlIlIIlllIlllI;
            ++lIlIlIIlllIIllI;
            "".length();
         } while(-" ".length() < (59 ^ 63));

         return null;
      }

      static {
         lIIllIlIIlI();
         lIIllIIIlII();
         ⰱ.ĂƂ[] var10001 = new ⰱ.ĂƂ[lIIIllIllI[0]];
         var10001[lIIIllIllI[1]] = ⲋ = new ⰱ.ĂƂ(lIIIllIIII[lIIIllIllI[1]], lIIIllIllI[1]);
         var10001[lIIIllIllI[2]] = ĂƂ = new ⰱ.ĂƂ(lIIIllIIII[lIIIllIllI[2]], lIIIllIllI[2]);
         var10001[lIIIllIllI[3]] = u = new ⰱ.ĂƂ(lIIIllIIII[lIIIllIllI[3]], lIIIllIllI[3]);
      }
   }
}
