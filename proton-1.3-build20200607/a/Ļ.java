package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0006\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0006\u0010\u001dR&\u0010\u0006\u001a\u0006*\u00020\u00010\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\b\u001a\u00020\u00078G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\u0086\u0084\u0002R0\u0010\u0004\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\t\"\u0004\b\u0006\u0010\u000b¨\u0006\u0086\u008e\u0002R0\u0010\u0002\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\t\"\u0004\b\u0004\u0010\u000b¨\u0006\u0086\u008e\u0002R0\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e8G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0003\u001a\u0004\b\f\u0010\u0010\"\u0004\b\u0004\u0010\u0011¨\u0006\u0086\u008e\u0002R0\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0002\u0010\t\"\u0004\b\b\u0010\u000b¨\u0006\u0086\u008e\u0002R\"\u0010\u0015\u001a\u00020\u00148G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0086\u0084\u0002R\"\u0010\r\u001a\u00020\u00178G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0086\u0084\u0002R\"\u0010\f\u001a\u00020\u000e8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/Ļ;", "Ljava/awt/Color;", "ᴃᎲ", "La/ⅹ;", "u", "()Ljava/awt/Color;", "ⲋ", "", "ĂƂ", "()Z", "p0", "(Z)V", "Ꜥ", "ς", "", "ⲡ", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "〥ҳⱆ", "Ἒⅾ", "La/Ӑѕ;", "ϛⰄ", "()La/Ӑѕ;", "La/ᶂ;", "()La/ᶂ;", "La/ꝱᶁ;", "", "(La/ꝱᶁ;)V", "La/Ꮐ꯴;", "(La/Ꮐ꯴;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class Ļ extends ⳅ {
   private static String lIIll(String lllllIllllIIIll, String lllllIllllIIlII) {
      try {
         SecretKeySpec lllllIllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllllIIlII.getBytes(StandardCharsets.UTF_8)), lIlll[9]), "DES");
         Cipher lllllIllllIIlll = Cipher.getInstance("DES");
         lllllIllllIIlll.init(lIlll[3], lllllIllllIlIII);
         return new String(lllllIllllIIlll.doFinal(Base64.getDecoder().decode(lllllIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIIIIlI() {
      lIlll = new int[41];
      lIlll[0] = 68 + 46 - 40 + 71 ^ 48 + 124 - 39 + 19;
      lIlll[1] = (186 ^ 172 ^ 68 ^ 67) & ((209 ^ 131) & ~(100 ^ 54) ^ 46 ^ 63 ^ -" ".length());
      lIlll[2] = " ".length();
      lIlll[3] = "  ".length();
      lIlll[4] = "   ".length();
      lIlll[5] = 58 + 115 - -7 + 0 ^ 55 + 148 - 118 + 91;
      lIlll[6] = 91 + 174 - 234 + 157 ^ 24 + 1 - -11 + 149;
      lIlll[7] = 125 ^ 123;
      lIlll[8] = 34 + 172 - 202 + 187 ^ 102 + 106 - 99 + 75;
      lIlll[9] = 63 + 57 - 64 + 128 ^ 15 + 31 - -56 + 74;
      lIlll[10] = 166 + 44 - 87 + 66 ^ 157 + 41 - 178 + 163;
      lIlll[11] = 187 ^ 176;
      lIlll[12] = 12 ^ 0;
      lIlll[13] = 130 ^ 143;
      lIlll[14] = 36 ^ 42;
      lIlll[15] = 96 + 38 - 122 + 159 ^ 52 + 163 - 169 + 118;
      lIlll[16] = 56 ^ 123 ^ 252 ^ 175;
      lIlll[17] = 2 ^ 19;
      lIlll[18] = 45 ^ 63;
      lIlll[19] = 112 + 133 - 222 + 115 ^ 40 + 74 - -10 + 29;
      lIlll[20] = 113 ^ 81;
      lIlll[21] = 29 ^ 9;
      lIlll[22] = 126 ^ 107;
      lIlll[23] = 95 + 224 - 153 + 61 ^ 154 + 56 - 204 + 191;
      lIlll[24] = 107 + 123 - 135 + 41 ^ 5 + 86 - 55 + 122;
      lIlll[25] = 117 ^ 98;
      lIlll[26] = 65 + 119 - 103 + 71 ^ 81 + 117 - 78 + 8;
      lIlll[27] = 92 ^ 69 ^ 51 ^ 18;
      lIlll[28] = 98 ^ 123;
      lIlll[29] = 101 ^ 6 ^ 124 ^ 5;
      lIlll[30] = 122 ^ 10 ^ 86 ^ 61;
      lIlll[31] = 147 ^ 143;
      lIlll[32] = 1 ^ 28;
      lIlll[33] = 80 + 39 - 73 + 86 ^ 14 + 67 - 31 + 104;
      lIlll[34] = 135 ^ 143 ^ 135 ^ 144;
      lIlll[35] = 37 ^ 4;
      lIlll[36] = 178 + 129 - 255 + 130 ^ 97 + 81 - 116 + 86;
      lIlll[37] = 90 ^ 121;
      lIlll[38] = 64 ^ 107 ^ 78 ^ 65;
      lIlll[39] = 154 ^ 191;
      lIlll[40] = 110 ^ 32 ^ 231 ^ 142;
   }

   private static boolean lIIIlII(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final String Ꜥ() {
      return (String)this.ⲡ.ⲋ(this, ⲋ[lIlll[9]]);
   }

   @JvmName(
      name = "u"
   )
   public final void u(@NotNull String var1) {
      this.ⲡ.ⲋ(this, ⲋ[lIlll[9]], var1);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return (Boolean)this.u.ⲋ(this, ⲋ[lIlll[2]]);
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final Ӑѕ Ἒⅾ() {
      return (Ӑѕ)this.ϛⰄ.ⲋ(this, ⲋ[lIlll[6]]);
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final ᶂ 〥ҳⱆ() {
      return (ᶂ)this.Ἒⅾ.ⲋ(this, ⲋ[lIlll[5]]);
   }

   static {
      lIIIIlI();
      llllII();
      KProperty[] var10000 = new KProperty[lIlll[0]];
      var10000[lIlll[1]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[1]], lIIl[lIlll[2]]));
      var10000[lIlll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[3]], lIIl[lIlll[4]]));
      var10000[lIlll[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[5]], lIIl[lIlll[6]]));
      var10000[lIlll[4]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[7]], lIIl[lIlll[8]]));
      var10000[lIlll[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[9]], lIIl[lIlll[0]]));
      var10000[lIlll[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[10]], lIIl[lIlll[11]]));
      var10000[lIlll[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[12]], lIIl[lIlll[13]]));
      var10000[lIlll[8]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[14]], lIIl[lIlll[15]]));
      var10000[lIlll[9]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ļ.class), lIIl[lIlll[16]], lIIl[lIlll[17]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final String ϛⰄ() {
      return (String)this.ς.ⲋ(this, ⲋ[lIlll[7]]);
   }

   private final String ⲡ() {
      SimpleDateFormat var1 = new SimpleDateFormat(this.〥ҳⱆ().ⲋ());
      return var1.format(Calendar.getInstance().getTime());
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.ĂƂ.ⲋ(this, ⲋ[lIlll[1]], var1);
   }

   @ȵ
   public final void ⲋ(@NotNull Ꮐ꯴ llllllIIIlIIIII) {
      if (!lIIIIll(llllllIIIlIIIII.ᴃᎲ() instanceof CPacketChatMessage)) {
         if (lIIIlII(llllllIIIlIIIIl.ς())) {
            boolean llllllIIIIlllll = (CharSequence)llllllIIIlIIIIl.Ꜥ();
            Exception llllllIIIIllllI = lIlll[1];
            int var10000;
            if (lIIIIll(StringsKt.isBlank(llllllIIIIlllll))) {
               var10000 = lIlll[2];
               "".length();
               if ("   ".length() > "   ".length()) {
                  return;
               }
            } else {
               var10000 = lIlll[1];
            }

            if (lIIIlII(var10000)) {
               boolean llllllIIIIlllll = ((CPacketChatMessage)llllllIIIlIIIII.ᴃᎲ()).field_149440_a;
               llllllIIIIllllI = lIlll[1];
               if (lIIIlIl(llllllIIIIlllll)) {
                  throw new TypeCastException(lIIl[lIlll[18]]);
               }

               if (lIIIIll(StringsKt.startsWith$default(StringsKt.trim((CharSequence)llllllIIIIlllll).toString(), lIIl[lIlll[19]], (boolean)lIlll[1], lIlll[3], (Object)null))) {
                  CPacketChatMessage var5 = (CPacketChatMessage)llllllIIIlIIIII.ᴃᎲ();
                  String var10001 = var5.field_149440_a;
                  var5.field_149440_a = String.valueOf((new StringBuilder()).append(var10001).append((char)lIlll[20]).append(llllllIIIlIIIIl.Ꜥ()));
               }
            }
         }

      }
   }

   @JvmName(
      name = "ς"
   )
   public final boolean ς() {
      return (Boolean)this.Ꜥ.ⲋ(this, ⲋ[lIlll[8]]);
   }

   private static boolean lIIIIll(int var0) {
      return var0 == 0;
   }

   private static void llllII() {
      lIIl = new String[lIlll[40]];
      lIIl[lIlll[1]] = lIIII("MxcjIAozDSA=", "ZyEId");
      lIIl[lIlll[2]] = lIIIl("PsaWIF2eNbsZUcE3u3wzKw==", "PjnZe");
      lIIl[lIlll[3]] = lIIIl("4ksa6BYbHE9l0ovRIEzHuA==", "uvUuw");
      lIIl[lIlll[4]] = lIIll("i+uZ24RluO6u5l6EDbekwQnMoAkBQDBy", "xDJWI");
      lIIl[lIlll[5]] = lIIIl("kdtsqjj4Cmo=", "tQhjk");
      lIIl[lIlll[6]] = lIIII("DSE/MRgGKzlaXiYuKgQWRSU8BlgpKycdBVE=", "jDKrw");
      lIIl[lIlll[7]] = lIIll("jB3mQb1W/4yBq4ZdWiwHOw==", "tsYnJ");
      lIIl[lIlll[8]] = lIIIl("jqWuXocYNbXxXOLvytqQVw==", "JeCxX");
      lIIl[lIlll[9]] = lIIII("IgA8NCciCDwhEjkbPDAg", "ViQQT");
      lIIl[lIlll[0]] = lIIIl("liK+7Y1ZXzaccOvSLZoXCotxcO84gWSD+j1qpgSEsgkiw7qQrwPF9UGGiV8jJwaMre8OlOee83lVyLPkRouEeA==", "gQHJs");
      lIIl[lIlll[10]] = lIIll("qtX97XoPiKRHqeIADP8PeQ==", "FeUEx");
      lIIl[lIlll[11]] = lIIII("JTY1ETwvNjIxNC8jAio5LSFpbBkvNm4rICE/JDAmbSMzKiEtPW4wISs/bgg8LDYiNzQkJwIqOS0hMn4=", "BSAEU");
      lIIl[lIlll[12]] = lIIll("vj0B9cfEPHGKoR2uYEblBGrKRfQyW2Nd", "SkkNf");
      lIIl[lIlll[13]] = lIIIl("PyzS0t1zZMr83XFfgT/ceMoIhTX8j0+Vwv1ThZS7kef0VPwU5WLsW3RLKpEZ1GVB", "InDCx");
      lIIl[lIlll[14]] = lIIII("CgMwMS8B", "yvVWF");
      lIIl[lIlll[15]] = lIIll("S2+AeZkQtUUTjeF/GQO5Tw==", "RwDNd");
      lIIl[lIlll[16]] = lIIII("HTQPDgIWFQwQHw==", "nAihk");
      lIIl[lIlll[17]] = lIIll("TN+hyBBqYtIbbQ4ryAmClVNobBgb+mJjHQ++ytCXf5NYtbfpNmpMjw==", "Qvvvo");
      lIIl[lIlll[18]] = lIIIl("5jeoUFAousrO+9CAv3VQhMwHbTBEa9RwaDoXfpbSp02TZp60nQr21S+5aSlY6ZQ7/SLopnvFm/AOl7qJYaH4oA==", "QVUfe");
      lIIl[lIlll[19]] = lIIll("Xa/SAFSXp4s=", "dwJRA");
      lIIl[lIlll[21]] = lIIIl("x9FhEVPWv/k=", "kkTPm");
      lIIl[lIlll[22]] = lIIIl("1qtkPsQXFrk=", "jlIiS");
      lIIl[lIlll[24]] = lIIII("RTZs", "cDLTK");
      lIIl[lIlll[25]] = lIIII("NCkDGxMAJAMENA==", "wAboG");
      lIIl[lIlll[26]] = lIIll("UUsk2zO4XyltrSTrCcOpquunITuQmfQyjPnW4kTeHF4=", "ekgDa");
      lIIl[lIlll[28]] = lIIII("BRQLBz4lDgg=", "LzmnP");
      lIIl[lIlll[29]] = lIIll("SzqPWFK+rOzl7NvWhyoPaw==", "wHawI");
      lIIl[lIlll[30]] = lIIII("CSYgIwc=", "JILLu");
      lIIl[lIlll[31]] = lIIIl("EyeHAYct/LDQ3WMgnU2fvw==", "KLsBv");
      lIIl[lIlll[32]] = lIIll("0lmvWchNTzlnYasvMR3LO1DB0dyP/gTogIirCatL5ILN0RNoXNgA9VD7nqm36J4BQZEEkVr1nVE=", "ZKwOx");
      lIIl[lIlll[33]] = lIIll("QFp3QGHx9/sLSSKegMvO9Q==", "Wdrks");
      lIIl[lIlll[34]] = lIIIl("htVq23VdZNPK74YFOK9EYA==", "uJCWF");
      lIIl[lIlll[20]] = lIIIl("G+Fo6bUuiXRoMwu4Ez2nQf7BdgolLPx+", "xxFbW");
      lIIl[lIlll[35]] = lIIll("6z3+2YQEj+I=", "dAmBE");
      lIIl[lIlll[36]] = lIIII("MhMgLCEEWi0jLBMbLT8oE1ohJSEYVA==", "azNKM");
      lIIl[lIlll[37]] = lIIll("rhYWfimzyNQ=", "uchoD");
      lIIl[lIlll[38]] = lIIll("Z1GoSvpstkvwFK+oCqZE2ncCAww5s8wuWZmbdz9GIwRNk46NBl/kOSYU88YpS+j4", "Fattx");
      lIIl[lIlll[39]] = lIIIl("MKIGB7jaaKuVkEXgQ8NEJA==", "ksdcK");
      lIIl[lIlll[23]] = lIIIl("YeuVYfVevS4=", "hKLRT");
   }

   @JvmName(
      name = "ⲋ"
   )
   public final boolean ⲋ() {
      return (Boolean)this.ĂƂ.ⲋ(this, ⲋ[lIlll[1]]);
   }

   @JvmName(
      name = "u"
   )
   public final Color u() {
      return (Color)this.ᴃᎲ.ⲋ(this, ⲋ[lIlll[3]]);
   }

   @ȵ
   public final void ⲋ(@NotNull ꝱᶁ llllllIIIIlIllI) {
      if (!lIIIIll(llllllIIIIlIllI.ᴃᎲ() instanceof SPacketChat)) {
         if (lIIIlII(llllllIIIIlIlll.ᴃᎲ())) {
            byte llllllIIIIlIlIl = lIIl[lIlll[21]];
            byte llllllIIIIlIlII = lIIl[lIlll[22]];
            if (lIIIllI(llllllIIIIlIlll.ϛⰄ().length(), lIlll[2])) {
               llllllIIIIlIlIl = String.valueOf(llllllIIIIlIlll.ϛⰄ().charAt(lIlll[1]));
            }

            if (lIIIllI(llllllIIIIlIlll.ϛⰄ().length(), lIlll[3])) {
               llllllIIIIlIlII = String.valueOf(llllllIIIIlIlll.ϛⰄ().charAt(lIlll[2]));
            }

            long llllllIIIIlIIll = String.valueOf((new StringBuilder()).append((char)lIlll[23]).append(llllllIIIIlIlll.Ἒⅾ().ⲋ()).append(llllllIIIIlIlIl).append(llllllIIIIlIlll.ⲡ()).append(llllllIIIIlIlII).append(lIIl[lIlll[24]]));
            float llllllIIIIlIIlI = new Y.ⲋ(llllllIIIIlIIll);
            llllllIIIIlIIlI.func_150257_a(((SPacketChat)llllllIIIIlIllI.ᴃᎲ()).field_148919_a);
            "".length();
            ((SPacketChat)llllllIIIIlIllI.ᴃᎲ()).field_148919_a = (ITextComponent)llllllIIIIlIIlI;
         }

      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      this.〥ҳⱆ.ⲋ(this, ⲋ[lIlll[4]], var1);
   }

   private static boolean lIIIllI(int var0, int var1) {
      return var0 >= var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final boolean ᴃᎲ() {
      return (Boolean)this.〥ҳⱆ.ⲋ(this, ⲋ[lIlll[4]]);
   }

   private static String lIIIl(String llllllIIIIIlIII, String llllllIIIIIIlll) {
      try {
         Exception llllllIIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllllIIIIIllII = Cipher.getInstance("Blowfish");
         llllllIIIIIllII.init(lIlll[3], llllllIIIIIIllI);
         return new String(llllllIIIIIllII.doFinal(Base64.getDecoder().decode(llllllIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIII(String lllllIlllllIlIl, String lllllIllllllIIl) {
      lllllIlllllIlIl = new String(Base64.getDecoder().decode(lllllIlllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lllllIlllllIIll = new StringBuilder();
      char[] lllllIlllllIlll = lllllIllllllIIl.toCharArray();
      char lllllIlllllIIIl = lIlll[1];
      float lllllIlllllIIII = lllllIlllllIlIl.toCharArray();
      short lllllIllllIllll = lllllIlllllIIII.length;
      int lllllIllllIlllI = lIlll[1];

      do {
         if (!lIIIlll(lllllIllllIlllI, lllllIllllIllll)) {
            return String.valueOf(lllllIlllllIIll);
         }

         byte lllllIllllIllIl = lllllIlllllIIII[lllllIllllIlllI];
         lllllIlllllIIll.append((char)(lllllIllllIllIl ^ lllllIlllllIlll[lllllIlllllIIIl % lllllIlllllIlll.length]));
         "".length();
         ++lllllIlllllIIIl;
         ++lllllIllllIlllI;
         "".length();
      } while(" ".length() < "   ".length());

      return null;
   }

   public Ļ() {
      super(lIIl[lIlll[25]], lIIl[lIlll[26]], ı５.u, lIlll[1], (boolean)lIlll[1], (boolean)lIlll[1], lIlll[27], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIl[lIlll[28]], Boolean.valueOf((boolean)lIlll[2]));
      this.u = this.ⲋ(lIIl[lIlll[29]], Boolean.valueOf((boolean)lIlll[2]));
      this.ᴃᎲ = this.ⲋ(lIIl[lIlll[30]], Color.black);
      this.〥ҳⱆ = this.ⲋ(lIIl[lIlll[31]], Boolean.valueOf((boolean)lIlll[2])).u(lIIl[lIlll[32]]);
      this.Ἒⅾ = this.ⲋ(lIIl[lIlll[33]], ᶂ.ⲋ);
      this.ϛⰄ = this.ⲋ(lIIl[lIlll[34]], Ӑѕ.ɡ);
      this.ς = this.ⲋ(lIIl[lIlll[20]], lIIl[lIlll[35]]).u(lIIl[lIlll[36]]);
      this.Ꜥ = this.ⲋ(lIIl[lIlll[37]], Boolean.valueOf((boolean)lIlll[1])).u(lIIl[lIlll[38]]);
      this.ⲡ = this.ⲋ(lIIl[lIlll[39]], lIIl[lIlll[23]]);
   }

   private static boolean lIIIlll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIIlIl(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      this.Ꜥ.ⲋ(this, ⲋ[lIlll[8]], var1);
   }
}
