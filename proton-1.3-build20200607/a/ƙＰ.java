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
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0005\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0005\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0082\u0084\u0002R&\u0010\u0007\u001a\u0006*\u00020\u00010\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0082\u0084\u0002R\"\u0010\t\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\b\u0010\u0004¨\u0006\u0082\u0084\u0002R&\u0010\b\u001a\u0006*\u00020\u00010\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\n\u0010\u0004¨\u0006\u0082\u0084\u0002R\"\u0010\n\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\t\u0010\u0004¨\u0006\u0082\u0084\u0002R&\u0010\u000b\u001a\u0006*\u00020\u00010\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0082\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\f\u0010\u0004¨\u0006\u0082\u0084\u0002R\"\u0010\f\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0007\u0010\u0004¨\u0006\u0082\u0084\u0002R\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\r\u0010\u0004¨\u0006\u0082\u0084\u0002R\"\u0010\r\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/ƙＰ;", "Ljava/awt/Color;", "ϛⰄ", "La/ⅹ;", "()Ljava/awt/Color;", "ⲋ", "Ꜥ", "ĂƂ", "ᴃᎲ", "u", "〥ҳⱆ", "Ἒⅾ", "ς", "ⲡ", "Đ", "ⱛṧ", "La/Ὴ;", "()La/Ὴ;", "<init>", "()V", "La/ⳅ;"}
)
public final class ƙＰ extends ⳅ {
   static {
      lllllllII();
      llllIIlll();
      KProperty[] var10000 = new KProperty[lllIIIll[0]];
      var10000[lllIIIll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[1]], llIlIlIl[lllIIIll[2]]));
      var10000[lllIIIll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[3]], llIlIlIl[lllIIIll[4]]));
      var10000[lllIIIll[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[5]], llIlIlIl[lllIIIll[6]]));
      var10000[lllIIIll[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[7]], llIlIlIl[lllIIIll[8]]));
      var10000[lllIIIll[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[9]], llIlIlIl[lllIIIll[10]]));
      var10000[lllIIIll[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[0]], llIlIlIl[lllIIIll[11]]));
      var10000[lllIIIll[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[12]], llIlIlIl[lllIIIll[13]]));
      var10000[lllIIIll[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[14]], llIlIlIl[lllIIIll[15]]));
      var10000[lllIIIll[9]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[16]], llIlIlIl[lllIIIll[17]]));
      var10000[lllIIIll[10]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ƙＰ.class), llIlIlIl[lllIIIll[18]], llIlIlIl[lllIIIll[19]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "u"
   )
   private final Color u() {
      return (Color)this.u.ⲋ(this, ⲋ[lllIIIll[2]]);
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   private final Color Ἒⅾ() {
      return (Color)this.Ἒⅾ.ⲋ(this, ⲋ[lllIIIll[5]]);
   }

   private static void llllIIlll() {
      llIlIlIl = new String[lllIIIll[29]];
      llIlIlIl[lllIIIll[1]] = lllIlIllI("sqfUJXvz9Gk8mtRn26xeGw==", "hWmxx");
      llIlIlIl[lllIIIll[2]] = lllIlIlll("DTENITUSIDoaPAUmUVwcADUPFH8LIw1aEwU4Fgdr", "jTyuP");
      llIlIlIl[lllIIIll[3]] = lllIllIII("qBRxqcgHB5M1/9lQGNM6gg==", "aMXAP");
      llIlIlIl[lllIIIll[4]] = lllIllIII("hipg4IoHF0fArUNSSdp3rga3+vsbTahTANhrDNjaBeZltxbDQGm27g==", "wphHP");
      llIlIlIl[lllIIIll[5]] = lllIllIII("7oj85top5FGQ+M/HHK8dxg==", "ONhcm");
      llIlIlIl[lllIIIll[6]] = lllIlIllI("eU31/TaA04T+d1TfpN8Aw5XEAr0MJ/oApqvkrY285TZeFl5m8fIDwg==", "zBfWt");
      llIlIlIl[lllIIIll[7]] = lllIlIllI("jPKR3iutVDMsSvg5IC7xSvDdSOTFwFd8", "hITNT");
      llIlIlIl[lllIIIll[8]] = lllIlIllI("RwwIKKJmlQ36W/AGY+vePCJOjpwBLtmTlib2tk6M6aAuLVvYLwscvWyY0pJAzLF3", "wvwtz");
      llIlIlIl[lllIIIll[9]] = lllIlIllI("MUMRbV+S14ezt4VM6F6x/Qio7BfYy9S7", "vKokc");
      llIlIlIl[lllIIIll[10]] = lllIlIlll("IzQiNAwwJT8JDjcTNwQCIyM5EgcgEjkLBjZ5fysDJSc3SAgzJXkkBig+JFw=", "DQVgi");
      llIlIlIl[lllIIIll[0]] = lllIlIllI("nKU20v40iQ/yGdSSA+/Pag==", "DMpLN");
      llIlIlIl[lllIIIll[11]] = lllIlIllI("xvF7ZNd/ifRuZLneY8xKF8JbF80ouaemb+kuXnLL1SMFElrTHSJlkQ==", "GaTHN");
      llIlIlIl[lllIIIll[12]] = lllIlIllI("hT+5Cp3EIsOOh4aXNdbY9A==", "MCCEc");
      llIlIlIl[lllIIIll[13]] = lllIllIII("G/lD8qRxx3KQkyqTRqUNqU5us7fyFeKk/OqqaNoTssM=", "jtZZB");
      llIlIlIl[lllIIIll[14]] = lllIlIlll("OywBHBs/GxANGRkgGRof", "ZOuum");
      llIlIlIl[lllIIIll[15]] = lllIllIII("YMKHiDu265u3+bJckO3heIsGe5gpm+VHsMpTt4MRPONS/gdzjLO5/A==", "YAKdF");
      llIlIlIl[lllIIIll[16]] = lllIlIlll("IB0vEzkgNi4FMjIGAhg6OAY=", "WtAwV");
      llIlIlIl[lllIIIll[17]] = lllIlIlll("AwMfHwAKAgQ/KwsUDy0bJwkHJxtMTyciCBIHRCkeEEkoJwULFFA=", "dfkHi");
      llIlIlIl[lllIIIll[18]] = lllIlIllI("e3AMGhZTsGOX5ZMyDkcvGYj625q/FAcc", "ZQWeH");
      llIlIlIl[lllIIIll[19]] = lllIllIII("Y91hmwEfsfWQ9/nblk9pgwppNuZ8Fkd8wytUWM0mAQ5RJB8pOF5biw==", "acNIg");
      llIlIlIl[lllIIIll[20]] = lllIlIlll("Ei82PDA=", "FGSQU");
      llIlIlIl[lllIIIll[21]] = lllIlIllI("VPGe8vK3q6M5J1kMYNmW+BGASYcDx2yy", "tFYXb");
      llIlIlIl[lllIIIll[23]] = lllIllIII("jd5xzRSfHv4=", "zePEw");
      llIlIlIl[lllIIIll[25]] = lllIlIlll("LDsDFw1BGhIKHQ==", "aNwri");
      llIlIlIl[lllIIIll[22]] = lllIlIllI("++2VrgUhCgJUVWqra7Ky1Q==", "Eqlnj");
      llIlIlIl[lllIIIll[31]] = lllIlIllI("TbPOEIdISd4X+0XO9vncPv8157OCbozM", "fuKqO");
      llIlIlIl[lllIIIll[32]] = lllIlIlll("EC4QMj0tLBdmFiIoDyEmLD4KIg==", "CKdFT");
      llIlIlIl[lllIIIll[33]] = lllIllIII("4nnl1GNRLD4=", "uJDan");
      llIlIlIl[lllIIIll[37]] = lllIlIllI("voHuL6xi+gc=", "ENQfw");
      llIlIlIl[lllIIIll[34]] = lllIlIllI("rTCvJtU2w1Mo/h7XuNiqFQ==", "cSmjg");
      llIlIlIl[lllIIIll[41]] = lllIlIllI("4hJQEcv7StS9qM5hjaOwrQ==", "BRizA");
      llIlIlIl[lllIIIll[44]] = lllIllIII("uet1lTp66f0ybnP+EA3oUQ==", "JEmPq");
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final Color ĂƂ() {
      return (Color)this.ĂƂ.ⲋ(this, ⲋ[lllIIIll[1]]);
   }

   @JvmName(
      name = "ϛⰄ"
   )
   private final Color ϛⰄ() {
      return (Color)this.ϛⰄ.ⲋ(this, ⲋ[lllIIIll[6]]);
   }

   private static String lllIlIlll(String llIllIlIlIIlIII, String llIllIlIlIIIlll) {
      llIllIlIlIIlIII = new String(Base64.getDecoder().decode(llIllIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIllIlIlIIIllI = new StringBuilder();
      long llIllIlIlIIIIII = llIllIlIlIIIlll.toCharArray();
      int llIllIlIlIIIlII = lllIIIll[1];
      byte llIllIlIIlllllI = llIllIlIlIIlIII.toCharArray();
      short llIllIlIIllllIl = llIllIlIIlllllI.length;
      int llIllIlIIllllII = lllIIIll[1];

      do {
         if (!llllllllI(llIllIlIIllllII, llIllIlIIllllIl)) {
            return String.valueOf(llIllIlIlIIIllI);
         }

         Exception llIllIlIIlllIll = llIllIlIIlllllI[llIllIlIIllllII];
         llIllIlIlIIIllI.append((char)(llIllIlIIlllIll ^ llIllIlIlIIIIII[llIllIlIlIIIlII % llIllIlIlIIIIII.length]));
         "".length();
         ++llIllIlIlIIIlII;
         ++llIllIlIIllllII;
         "".length();
      } while("  ".length() != 0);

      return null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   private final Color 〥ҳⱆ() {
      return (Color)this.〥ҳⱆ.ⲋ(this, ⲋ[lllIIIll[4]]);
   }

   private static boolean llllllllI(int var0, int var1) {
      return var0 < var1;
   }

   public ƙＰ() {
      super(llIlIlIl[lllIIIll[20]], llIlIlIl[lllIIIll[21]], ı５.ϛⰄ, lllIIIll[1], (boolean)lllIIIll[1], (boolean)lllIIIll[2], lllIIIll[22], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIlIlIl[lllIIIll[23]], new Color(lllIIIll[24], lllIIIll[24], lllIIIll[24]));
      this.u = this.ⲋ(llIlIlIl[lllIIIll[25]], new Color(lllIIIll[26], lllIIIll[27], lllIIIll[28]));
      this.ᴃᎲ = this.ⲋ(llIlIlIl[lllIIIll[22]], new Color(lllIIIll[21], lllIIIll[29], lllIIIll[30]));
      this.〥ҳⱆ = this.ⲋ(llIlIlIl[lllIIIll[31]], this.ᴃᎲ().darker());
      this.Ἒⅾ = this.ⲋ(llIlIlIl[lllIIIll[32]], this.ᴃᎲ().brighter());
      this.ϛⰄ = this.ⲋ(llIlIlIl[lllIIIll[33]], new Color(lllIIIll[34], lllIIIll[35], lllIIIll[36]));
      this.ς = this.ⲋ(llIlIlIl[lllIIIll[37]], new Color(lllIIIll[38], lllIIIll[39], lllIIIll[40], lllIIIll[24]));
      this.Ꜥ = this.ⲋ(llIlIlIl[lllIIIll[34]], Color.white);
      this.ⲡ = this.ⲋ(llIlIlIl[lllIIIll[41]], new Color(lllIIIll[31], lllIIIll[42], lllIIIll[43]));
      this.Đ = this.ⲋ(llIlIlIl[lllIIIll[44]], new Color(lllIIIll[0], lllIIIll[0], lllIIIll[0]));
   }

   private static void lllllllII() {
      lllIIIll = new int[45];
      lllIIIll[0] = 56 + 36 - 61 + 98 ^ 112 + 70 - 47 + 4;
      lllIIIll[1] = (22 ^ 102 ^ 96 ^ 13) & ((41 ^ 101) & ~(70 ^ 10) ^ 222 ^ 195 ^ -" ".length());
      lllIIIll[2] = " ".length();
      lllIIIll[3] = "  ".length();
      lllIIIll[4] = "   ".length();
      lllIIIll[5] = 165 ^ 161;
      lllIIIll[6] = 125 ^ 17 ^ 86 ^ 63;
      lllIIIll[7] = 75 ^ 103 ^ 101 ^ 79;
      lllIIIll[8] = 170 + 0 - 23 + 34 ^ 75 + 13 - 79 + 169;
      lllIIIll[9] = 83 + 22 - -15 + 10 ^ 1 + 41 - -30 + 66;
      lllIIIll[10] = 201 ^ 192;
      lllIIIll[11] = 192 ^ 155 ^ 119 ^ 39;
      lllIIIll[12] = 5 ^ 9;
      lllIIIll[13] = 90 ^ 11 ^ 48 ^ 108;
      lllIIIll[14] = 122 ^ 116;
      lllIIIll[15] = 56 + 139 - 158 + 124 ^ 59 + 122 - 171 + 164;
      lllIIIll[16] = 141 + 32 - 97 + 113 ^ 41 + 44 - 81 + 169;
      lllIIIll[17] = 21 ^ 107 ^ 59 ^ 84;
      lllIIIll[18] = 95 ^ 77;
      lllIIIll[19] = 208 ^ 195;
      lllIIIll[20] = 95 ^ 75;
      lllIIIll[21] = 91 ^ 28 ^ 24 ^ 74;
      lllIIIll[22] = 71 ^ 106 ^ 126 ^ 75;
      lllIIIll[23] = 78 ^ 88;
      lllIIIll[24] = (147 ^ 128) + 59 + 10 - -87 + 36 - -(54 ^ 56) + (19 ^ 13);
      lllIIIll[25] = 93 ^ 74;
      lllIIIll[26] = 35 + 23 - -43 + 35;
      lllIIIll[27] = 146 + 95 - 106 + 18;
      lllIIIll[28] = (231 ^ 175) + (12 ^ 35) - -(57 ^ 32) + (185 ^ 175);
      lllIIIll[29] = 10 ^ 42;
      lllIIIll[30] = 119 ^ 92;
      lllIIIll[31] = 160 ^ 185;
      lllIIIll[32] = 57 ^ 35;
      lllIIIll[33] = 252 ^ 174 ^ 108 ^ 37;
      lllIIIll[34] = 225 ^ 144 ^ 253 ^ 145;
      lllIIIll[35] = (8 ^ 61) + 41 + 25 - -40 + 30 - (140 ^ 180) + (54 ^ 42);
      lllIIIll[36] = 41 + 16 - -16 + 56 + (57 ^ 80) - (109 ^ 37) + (41 ^ 121);
      lllIIIll[37] = 145 + 7 - 136 + 145 ^ 44 + 47 - -77 + 21;
      lllIIIll[38] = 66 ^ 106 ^ 172 ^ 177;
      lllIIIll[39] = 73 ^ 12;
      lllIIIll[40] = 88 ^ 9;
      lllIIIll[41] = 88 + 92 - 65 + 38 ^ 102 + 39 - 46 + 40;
      lllIIIll[42] = 104 ^ 38 ^ 58 ^ 83;
      lllIIIll[43] = 109 ^ 89;
      lllIIIll[44] = 109 ^ 114;
   }

   private static String lllIllIII(String llIllIlIIlIIllI, String llIllIlIIlIIlIl) {
      try {
         long llIllIlIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lllIIIll[9]), "DES");
         Cipher llIllIlIIlIlIII = Cipher.getInstance("DES");
         llIllIlIIlIlIII.init(lllIIIll[3], llIllIlIIlIIIlI);
         return new String(llIllIlIIlIlIII.doFinal(Base64.getDecoder().decode(llIllIlIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲡ"
   )
   private final Color ⲡ() {
      return (Color)this.ⲡ.ⲋ(this, ⲋ[lllIIIll[9]]);
   }

   @NotNull
   public final Ὴ ⲋ() {
      Ὴ var1 = new Ὴ();
      var1.ⲋ(this.ĂƂ());
      var1.ĂƂ(this.u());
      var1.ᴃᎲ(this.ᴃᎲ());
      var1.〥ҳⱆ(this.〥ҳⱆ());
      var1.Ἒⅾ(this.Ἒⅾ());
      var1.ϛⰄ(this.ϛⰄ());
      var1.u(this.ς());
      var1.ς(this.Ꜥ());
      var1.Ꜥ(this.ⲡ());
      var1.ⲡ(this.ⱛṧ());
      return var1;
   }

   @JvmName(
      name = "Ꜥ"
   )
   private final Color Ꜥ() {
      return (Color)this.Ꜥ.ⲋ(this, ⲋ[lllIIIll[8]]);
   }

   private static String lllIlIllI(String llIllIlIIllIIIl, String llIllIlIIllIIlI) {
      try {
         SecretKeySpec llIllIlIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIllIlIIllIlIl = Cipher.getInstance("Blowfish");
         llIllIlIIllIlIl.init(lllIIIll[3], llIllIlIIllIllI);
         return new String(llIllIlIIllIlIl.doFinal(Base64.getDecoder().decode(llIllIlIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final Color ᴃᎲ() {
      return (Color)this.ᴃᎲ.ⲋ(this, ⲋ[lllIIIll[3]]);
   }

   @JvmName(
      name = "ⱛṧ"
   )
   private final Color ⱛṧ() {
      return (Color)this.Đ.ⲋ(this, ⲋ[lllIIIll[10]]);
   }

   @JvmName(
      name = "ς"
   )
   private final Color ς() {
      return (Color)this.ς.ⲋ(this, ⲋ[lllIIIll[7]]);
   }
}
