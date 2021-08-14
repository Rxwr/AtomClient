package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020&B\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u001eJ\u0017\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001fH\u0007¢\u0006\u0004\b\u0004\u0010 J\u001f\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\u0004\u0010#J\u0017\u0010\t\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0082\u000eR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0082\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0082\u0004R\u001a\u0010\u0007\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0082\u000eR&\u0010\u0002\u001a\u00020\u00158\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0004\u0010\u0019¨\u0006\u0096\u000eR\u001a\u0010\u000b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u0082\u0004"},
   d2 = {"La/Я;", "La/ⲽ;", "Ἒⅾ", "La/ⲽ;", "ⲋ", "La/ᵭ;", "", "〥ҳⱆ", "La/ᵭ;", "ĂƂ", "La/ᾑ;", "ϛⰄ", "La/ᾑ;", "u", "", "Ꜥ", "Ljava/util/List;", "ᴃᎲ", "", "ⲡ", "I", "La/ʁᎴ;", "La/ʁᎴ;", "ς", "()La/ʁᎴ;", "(La/ʁᎴ;)V", "La/฿᠗ȏ;", "La/฿᠗ȏ;", "p0", "", "(Ljava/lang/String;)V", "La/öỴʘѷ;", "(La/öỴʘѷ;)V", "", "p1", "(IC)V", "<init>", "()V", "La/Ḥ;"}
)
public final class Я extends Ḥ {
   private static boolean lIlIlllI(int var0) {
      return var0 == 0;
   }

   private final void ⲋ(String llllIlIIlllIIlI) {
      int var3 = lIIllIl[0];
      if (lIlIllIl(llllIlIIlllIIlI)) {
         throw new TypeCastException(lIIlIlI[lIIllIl[3]]);
      } else {
         String var10000 = llllIlIIlllIIlI.toLowerCase();
         Intrinsics.checkExpressionValueIsNotNull(var10000, lIIlIlI[lIIllIl[4]]);
         String llllIlIIlllIIIl = var10000;
         switch(llllIlIIlllIIIl.hashCode()) {
         case 94746189:
            if (lIlIllII(llllIlIIlllIIIl.equals(lIIlIlI[lIIllIl[2]]))) {
               llllIlIIlllIIll.〥ҳⱆ.ⲋ((Object)lIIlIlI[lIIllIl[5]]);
               llllIlIIlllIIll.ϛⰄ.ⱯꝣѺ();
               ᶔ.ⲋ.〥ҳⱆ();
               "".length();
               if ((135 ^ 139 ^ 109 ^ 101) == 0) {
                  return;
               }
               break;
            }
         default:
            a.ϛⰄ.ⲋ.ĂƂ(llllIlIIlllIIlI);
         }

         if (!lIlIlllI(llllIlIIlllIIll.Ꜥ.isEmpty()) || lIlIllII(Intrinsics.areEqual((Object)((String)CollectionsKt.last(llllIlIIlllIIll.Ꜥ)), (Object)llllIlIIlllIIlI) ^ lIIllIl[1])) {
            llllIlIIlllIIll.Ꜥ.add(llllIlIIlllIIlI);
            "".length();
         }

         llllIlIIlllIIll.ⲡ = lIIllIl[0];
      }
   }

   private static boolean lIlIllll(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lIllIIlI(int var0) {
      return var0 > 0;
   }

   private static void lIlIlIIl() {
      lIIlIlI = new String[lIIllIl[21]];
      lIIlIlI[lIIllIl[0]] = lIIllIIl("FrNuXADk4mg=", "jSIZd");
      lIIlIlI[lIIllIl[1]] = lIIllIlI("w5c=", "pazhw");
      lIIlIlI[lIIllIl[3]] = lIIllIIl("YkZkESDeeKPPukcVWPe7uK+LfCH8CfEk3xDYHDpJZ5UHLYSpwDDkTUZSJedAzhGs56kLxqcSaCw=", "JxUiX");
      lIIlIlI[lIIllIl[4]] = lIIllIll("qT4TA8rEkww=", "apgGC");
      lIIlIlI[lIIllIl[2]] = lIIllIll("wMnjH8bntcs=", "rhLtg");
      lIIlIlI[lIIllIl[5]] = lIIllIlI("", "NEnuW");
      lIIlIlI[lIIllIl[9]] = lIIllIIl("8AzZej8mVGuROa5Byx6NDLFbqM8yhf4V3JgeDSQ1iEWs0uqi9cx4ewh7cay8L1KNzbpDodn80XM=", "HHTaB");
      lIIlIlI[lIIllIl[10]] = lIIllIlI("", "IIqBC");
      lIIlIlI[lIIllIl[11]] = lIIllIll("13vXq5STpos=", "KvRNs");
      lIIlIlI[lIIllIl[12]] = lIIllIlI("LAk9AwQDAw==", "ofSpk");
      lIIlIlI[lIIllIl[6]] = lIIllIll("x3DUhdoNriY=", "pnnib");
      lIIlIlI[lIIllIl[16]] = lIIllIll("lFYc1fHJqVnxm0It8Z3qwA==", "EmbPX");
   }

   private static boolean lIlIllIl(Object var0) {
      return var0 == null;
   }

   private static boolean lIllIIIl(int var0, int var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "ς"
   )
   public ʁᎴ ς() {
      return this.ᴃᎲ;
   }

   public Я() {
      super(lIIlIlI[lIIllIl[12]], lIIllIl[13], lIIllIl[14], (boolean)lIIllIl[1]);
      this.ᴃᎲ = (ʁᎴ)(new Ꮱ((Β)null, (Β)null, л.ⲋ, Ⴝ.ĂƂ, (boolean)lIIllIl[0], (boolean)lIIllIl[0], lIIllIl[15], (DefaultConstructorMarker)null));
      this.〥ҳⱆ = new ᵭ(lIIlIlI[lIIllIl[6]], (boolean)lIIllIl[0], lIIllIl[3], (DefaultConstructorMarker)null);
      this.Ἒⅾ = new ⲽ((ᵭ)null, lIIlIlI[lIIllIl[16]], lIIllIl[0], (Regex)null, (String)null, lIIllIl[0], lIIllIl[17], (DefaultConstructorMarker)null);
      this.ϛⰄ = new ᾑ(this.〥ҳⱆ, (Ҿ)null, (Color)null, (boolean)lIIllIl[1], (String)null, (String)null, lIIllIl[18], (DefaultConstructorMarker)null);
      ė var10003 = new ė(lIIllIl[19], lIIllIl[20]);
      Color var1 = Color.black;
      double var2 = 0.0D;
      ė var4 = var10003;
      this.ς = new ฿᠗ȏ(var1, var2, var4, lIIllIl[3], (DefaultConstructorMarker)null);
      int var8 = lIIllIl[0];
      List var7 = (List)(new ArrayList());
      this.Ꜥ = var7;
      ฿᠗ȏ var9 = this.ς;
      int var10 = lIIllIl[0];
      int var3 = lIIllIl[0];
      int var5 = lIIllIl[0];
      var9.ⲋ((ʁᎴ)(new Ꮱ((Β)null, new Β(lIIllIl[5], lIIllIl[5], lIIllIl[5], lIIllIl[5]), (л)null, (Ⴝ)null, (boolean)lIIllIl[0], (boolean)lIIllIl[0], lIIllIl[17], (DefaultConstructorMarker)null)));
      var9.ĂƂ((Ữ)this.ϛⰄ);
      this.ĂƂ((Ữ)var9);
      this.ĂƂ((Ữ)this.Ἒⅾ);
      this.Ἒⅾ.ĂƂ((Function1)(new Function1<ⲽ, Unit>() {
         public final void ⲋ(@NotNull ⲽ lIIlllIlIIlIlll) {
            Я.this.ĂƂ(String.valueOf((new StringBuilder()).append(lIlIIIIIIl[lIlIIIIIlI[0]]).append(lIIlllIlIIlIlll.ĂƂ())));
            CharSequence var2 = (CharSequence)lIIlllIlIIlIlll.ĂƂ();
            int var3 = lIlIIIIIlI[0];
            int var10000;
            if (lIlIlIllIll(StringsKt.isBlank(var2))) {
               var10000 = lIlIIIIIlI[1];
               "".length();
               if ((187 ^ 191) <= ((59 ^ 5) & ~(126 ^ 64))) {
                  return;
               }
            } else {
               var10000 = lIlIIIIIlI[0];
            }

            if (lIlIlIlllII(var10000)) {
               Я.this.ⲋ(lIIlllIlIIlIlll.ĂƂ());
            }

            lIIlllIlIIlIlll.ⲋ(lIlIIIIIIl[lIlIIIIIlI[1]]);
         }

         static {
            lIlIlIllIlI();
            lIlIlIllIIl();
         }

         private static boolean lIlIlIlllII(int var0) {
            return var0 != 0;
         }

         private static boolean lIlIlIlllIl(int var0, int var1) {
            return var0 < var1;
         }

         private static void lIlIlIllIIl() {
            lIlIIIIIIl = new String[lIlIIIIIlI[2]];
            lIlIIIIIIl[lIlIIIIIlI[0]] = lIlIlIlIlll("dMOoCQ==", "JOode");
            lIlIIIIIIl[lIlIIIIIlI[1]] = lIlIlIllIII("sUq59jHjcVA=", "fjsyx");
         }

         private static void lIlIlIllIlI() {
            lIlIIIIIlI = new int[4];
            lIlIIIIIlI[0] = (123 ^ 24) & ~(21 ^ 118);
            lIlIIIIIlI[1] = " ".length();
            lIlIIIIIlI[2] = "  ".length();
            lIlIIIIIlI[3] = 31 ^ 23;
         }

         private static String lIlIlIllIII(String lIIlllIlIIIlIll, String lIIlllIlIIIllII) {
            try {
               SecretKeySpec lIIlllIlIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIlIIIllII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlI[3]), "DES");
               byte lIIlllIlIIIlIII = Cipher.getInstance("DES");
               lIIlllIlIIIlIII.init(lIlIIIIIlI[2], lIIlllIlIIlIIII);
               return new String(lIIlllIlIIIlIII.doFinal(Base64.getDecoder().decode(lIIlllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         private static boolean lIlIlIllIll(int var0) {
            return var0 == 0;
         }

         private static String lIlIlIlIlll(String lIIlllIIlllllIl, String lIIlllIIlllllII) {
            lIIlllIIlllllIl = new String(Base64.getDecoder().decode(lIIlllIIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            Exception lIIlllIIlllIllI = new StringBuilder();
            float lIIlllIIlllIlIl = lIIlllIIlllllII.toCharArray();
            int lIIlllIIllllIIl = lIlIIIIIlI[0];
            float lIIlllIIlllIIll = lIIlllIIlllllIl.toCharArray();
            Exception lIIlllIIlllIIlI = lIIlllIIlllIIll.length;
            int lIIlllIIlllIIIl = lIlIIIIIlI[0];

            do {
               if (!lIlIlIlllIl(lIIlllIIlllIIIl, lIIlllIIlllIIlI)) {
                  return String.valueOf(lIIlllIIlllIllI);
               }

               boolean lIIlllIIlllIIII = lIIlllIIlllIIll[lIIlllIIlllIIIl];
               lIIlllIIlllIllI.append((char)(lIIlllIIlllIIII ^ lIIlllIIlllIlIl[lIIlllIIllllIIl % lIIlllIIlllIlIl.length]));
               "".length();
               ++lIIlllIIllllIIl;
               ++lIIlllIIlllIIIl;
               "".length();
            } while(null == null);

            return null;
         }
      }));
      "".length();
      ƶ.ⲋ.ĂƂ(this);
   }

   private static String lIIllIlI(String llllIlIIIlIlIIl, String llllIlIIIlIlIII) {
      llllIlIIIlIlIIl = new String(Base64.getDecoder().decode(llllIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean llllIlIIIlIIIlI = new StringBuilder();
      char llllIlIIIlIIIIl = llllIlIIIlIlIII.toCharArray();
      int llllIlIIIlIIlIl = lIIllIl[0];
      long llllIlIIIIlllll = llllIlIIIlIlIIl.toCharArray();
      int llllIlIIIIllllI = llllIlIIIIlllll.length;
      int llllIlIIIIlllIl = lIIllIl[0];

      do {
         if (!lIllIIII(llllIlIIIIlllIl, llllIlIIIIllllI)) {
            return String.valueOf(llllIlIIIlIIIlI);
         }

         byte llllIlIIIIlllII = llllIlIIIIlllll[llllIlIIIIlllIl];
         llllIlIIIlIIIlI.append((char)(llllIlIIIIlllII ^ llllIlIIIlIIIIl[llllIlIIIlIIlIl % llllIlIIIlIIIIl.length]));
         "".length();
         ++llllIlIIIlIIlIl;
         ++llllIlIIIIlllIl;
         "".length();
      } while(null == null);

      return null;
   }

   public void ⲋ(int var1, char var2) {
      super.ⲋ(var1, var2);
      switch(var1) {
      case 200:
         if (lIllIIII(llllIlIIlIlIIIl.ⲡ, llllIlIIlIlIIIl.Ꜥ.size())) {
            llllIlIIlIlIIIl.Ἒⅾ.ⲋ((String)llllIlIIlIlIIIl.Ꜥ.get(llllIlIIlIlIIIl.Ꜥ.size() - llllIlIIlIlIIIl.ⲡ - lIIllIl[1]));
            llllIlIIlIlIIIl.ⲡ += lIIllIl[1];
            "".length();
            if (-(" ".length() ^ 147 ^ 150) >= 0) {
               return;
            }
         }
         break;
      case 208:
         if (lIllIIlI(llllIlIIlIlIIIl.ⲡ)) {
            llllIlIIlIlIIIl.ⲡ += lIIllIl[8];
            llllIlIIlIlIIIl.Ἒⅾ.ⲋ((String)llllIlIIlIlIIIl.Ꜥ.get(llllIlIIlIlIIIl.Ꜥ.size() - llllIlIIlIlIIIl.ⲡ - lIIllIl[1]));
            "".length();
            if ("   ".length() == -" ".length()) {
               return;
            }
         } else {
            llllIlIIlIlIIIl.ⲡ = lIIllIl[0];
            llllIlIIlIlIIIl.Ἒⅾ.ⲋ(lIIlIlI[lIIllIl[11]]);
            "".length();
            if (-" ".length() >= "   ".length()) {
               return;
            }
         }
      }

   }

   private static String lIIllIIl(String llllIlIIIllIlll, String llllIlIIIlllIII) {
      try {
         SecretKeySpec llllIlIIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIIIlllIII.getBytes(StandardCharsets.UTF_8)), lIIllIl[11]), "DES");
         float llllIlIIIllIlII = Cipher.getInstance("DES");
         llllIlIIIllIlII.init(lIIllIl[3], llllIlIIIllllII);
         return new String(llllIlIIIllIlII.doFinal(Base64.getDecoder().decode(llllIlIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIII(int var0, int var1) {
      return var0 < var1;
   }

   @ȵ
   public final void ⲋ(@NotNull öỴʘѷ var1) {
      Iterable var2 = (Iterable)StringsKt.lines((CharSequence)var1.ᴃᎲ());
      int var3 = lIIllIl[0];
      Iterator llllIlIIllllIll = var2.iterator();

      do {
         if (!lIlIllII(llllIlIIllllIll.hasNext())) {
            return;
         }

         int llllIlIIllllIlI = llllIlIIllllIll.next();
         long llllIlIIllllIIl = (String)llllIlIIllllIlI;
         Exception llllIlIIllllIII = lIIllIl[0];
         llllIlIIlllllll.ĂƂ(StringsKt.replace$default(llllIlIIllllIIl, lIIlIlI[lIIllIl[0]], lIIlIlI[lIIllIl[1]], (boolean)lIIllIl[0], lIIllIl[2], (Object)null));
         "".length();
      } while((194 ^ 198) > ((100 ^ 51) & ~(91 ^ 12)));

   }

   @JvmName(
      name = "ⲋ"
   )
   public void ⲋ(@NotNull ʁᎴ var1) {
      this.ᴃᎲ = var1;
   }

   private static String lIIllIll(String llllIlIIlIIIllI, String llllIlIIlIIIIll) {
      try {
         boolean llllIlIIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean llllIlIIlIIIIIl = Cipher.getInstance("Blowfish");
         llllIlIIlIIIIIl.init(lIIllIl[3], llllIlIIlIIIIlI);
         return new String(llllIlIIlIIIIIl.doFinal(Base64.getDecoder().decode(llllIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private final void ĂƂ(String var1) {
      ᵭ var10000 = llllIlIIllIIIlI.〥ҳⱆ;
      var10000.ⲋ((Object)String.valueOf((new StringBuilder()).append((String)var10000.ⲋ()).append((char)lIIllIl[6]).append(var1)));
      llllIlIIllIIIlI.ς.ɡ();
      if (lIlIllll(llllIlIIllIIIlI.ϛⰄ.ⲡ().ĂƂ(), lIIllIl[7])) {
         CharSequence llllIlIIlIlllll = (CharSequence)llllIlIIllIIIlI.〥ҳⱆ.ⲋ();
         int llllIlIIlIllllI = lIIllIl[0];
         int llllIlIIlIlllIl = lIIllIl[0];
         int llllIlIIlIlllII = llllIlIIlIlllll.length();

         int var15;
         label35: {
            while(lIllIIII(llllIlIIlIlllIl, llllIlIIlIlllII)) {
               int llllIlIIlIllIll = llllIlIIlIlllll.charAt(llllIlIIlIlllIl);
               boolean llllIlIIlIllIlI = lIIllIl[0];
               if (lIllIIIl(llllIlIIlIllIll, lIIllIl[6])) {
                  var15 = lIIllIl[1];
                  "".length();
                  if (((26 ^ 47) & ~(129 ^ 180)) > 0) {
                     return;
                  }
               } else {
                  var15 = lIIllIl[0];
               }

               if (lIlIllII(var15)) {
                  var15 = llllIlIIlIlllIl;
                  "".length();
                  if (-" ".length() >= ((79 ^ 8) & ~(87 ^ 16))) {
                     return;
                  }
                  break label35;
               }

               ++llllIlIIlIlllIl;
               "".length();
               if (null != null) {
                  return;
               }
            }

            var15 = lIIllIl[8];
         }

         byte llllIlIIllIIIII = var15;
         llllIlIIlIllllI = lIIllIl[0];
         llllIlIIlIlllIl = lIIllIl[0];
         int llllIlIIlIllIll = lIIllIl[0];
         var10000 = llllIlIIllIIIlI.〥ҳⱆ;
         boolean llllIlIIlIllIlI = (String)llllIlIIllIIIlI.〥ҳⱆ.ⲋ();
         double llllIlIIlIllIIl = llllIlIIllIIIII + lIIllIl[1];
         float llllIlIIlIllIII = var10000;
         short llllIlIIlIlIlll = lIIllIl[0];
         if (lIlIllIl(llllIlIIlIllIlI)) {
            throw new TypeCastException(lIIlIlI[lIIllIl[9]]);
         }

         String var16 = llllIlIIlIllIlI.substring(llllIlIIlIllIIl);
         Intrinsics.checkExpressionValueIsNotNull(var16, lIIlIlI[lIIllIl[10]]);
         Exception llllIlIIlIlIllI = var16;
         llllIlIIlIllIII.ⲋ((Object)llllIlIIlIlIllI);
         llllIlIIllIIIlI.ϛⰄ.ⱯꝣѺ();
         llllIlIIllIIIlI.ς.ɡ();
      }

   }

   private static boolean lIlIllII(int var0) {
      return var0 != 0;
   }

   private static void lIlIlIll() {
      lIIllIl = new int[22];
      lIIllIl[0] = (123 + 132 - 194 + 113 ^ 14 + 54 - -38 + 57) & (25 ^ 88 ^ 240 ^ 188 ^ -" ".length());
      lIIllIl[1] = " ".length();
      lIIllIl[2] = 45 ^ 32 ^ 21 ^ 28;
      lIIllIl[3] = "  ".length();
      lIIllIl[4] = "   ".length();
      lIIllIl[5] = 45 ^ 40;
      lIIllIl[6] = 7 ^ 13;
      lIIllIl[7] = 144 + 87 - 0 + 14;
      lIIllIl[8] = -" ".length();
      lIIllIl[9] = 20 ^ 18;
      lIIllIl[10] = 172 ^ 171;
      lIIllIl[11] = 32 ^ 40;
      lIIllIl[12] = 1 + 8 - -129 + 29 ^ 6 + 111 - 113 + 170;
      lIIllIl[13] = -18433 & 18932;
      lIIllIl[14] = -(-17925 & 28247) & -20481 & 31102;
      lIIllIl[15] = 1 ^ 50;
      lIIllIl[16] = 123 ^ 112;
      lIIllIl[17] = 180 ^ 138 ^ "   ".length();
      lIIllIl[18] = 87 ^ 3 ^ 226 ^ 128;
      lIIllIl[19] = -(-434 & 32763) & -129 & 32747;
      lIIllIl[20] = (140 ^ 134) + 65 + 94 - 112 + 80 - (53 ^ 29) + 149 + 110 - 190 + 84;
      lIIllIl[21] = 189 ^ 177;
   }

   static {
      lIlIlIll();
      lIlIlIIl();
   }
}
