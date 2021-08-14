package a;

import java.awt.Color;
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
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0013B\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u000b\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u0082\u0084\u0002R&\u0010\u0004\u001a\u0006*\u00020\f0\f8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u000b\u0010\r¨\u0006\u0082\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\u000e\u0010\n¨\u0006\u0082\u0084\u0002R\"\u0010\u000e\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u0002\u0010\n¨\u0006\u0082\u0084\u0002R\"\u0010\t\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/ɧԈ;", "", "ᴃᎲ", "La/ⅹ;", "u", "()D", "ⲋ", "", "ϛⰄ", "Ἒⅾ", "()Z", "ĂƂ", "Ljava/awt/Color;", "()Ljava/awt/Color;", "〥ҳⱆ", "", "ἶṗ", "()V", "<init>", "La/ⳅ;"}
)
public final class ɧԈ extends ⳅ {
   private static boolean lIIlIlIIIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIIlIlIlII(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final boolean ᴃᎲ() {
      return (Boolean)this.〥ҳⱆ.ⲋ(this, ⲋ[lIIIIllll[4]]);
   }

   static {
      lIIlIIllIl();
      lIIlIIIIll();
      KProperty[] var10000 = new KProperty[lIIIIllll[0]];
      var10000[lIIIIllll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ɧԈ.class), lIIIIIlII[lIIIIllll[1]], lIIIIIlII[lIIIIllll[2]]));
      var10000[lIIIIllll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ɧԈ.class), lIIIIIlII[lIIIIllll[3]], lIIIIIlII[lIIIIllll[4]]));
      var10000[lIIIIllll[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ɧԈ.class), lIIIIIlII[lIIIIllll[5]], lIIIIIlII[lIIIIllll[6]]));
      var10000[lIIIIllll[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ɧԈ.class), lIIIIIlII[lIIIIllll[0]], lIIIIIlII[lIIIIllll[7]]));
      var10000[lIIIIllll[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ɧԈ.class), lIIIIIlII[lIIIIllll[8]], lIIIIIlII[lIIIIllll[9]]));
      var10000[lIIIIllll[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ɧԈ.class), lIIIIIlII[lIIIIllll[10]], lIIIIIlII[lIIIIllll[11]]));
      ⲋ = var10000;
   }

   private static String lIIIllIllI(String llIlIllIIlIIIlI, String llIlIllIIlIIIIl) {
      llIlIllIIlIIIlI = new String(Base64.getDecoder().decode(llIlIllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception llIlIllIIlIIIII = new StringBuilder();
      char[] llIlIllIIlIIlII = llIlIllIIlIIIIl.toCharArray();
      int llIlIllIIlIIIll = lIIIIllll[1];
      byte llIlIllIIIlllIl = llIlIllIIlIIIlI.toCharArray();
      char llIlIllIIIlllII = llIlIllIIIlllIl.length;
      int llIlIllIIIllIll = lIIIIllll[1];

      do {
         if (!lIIlIlIlIl(llIlIllIIIllIll, llIlIllIIIlllII)) {
            return String.valueOf(llIlIllIIlIIIII);
         }

         char llIlIllIIlIlIII = llIlIllIIIlllIl[llIlIllIIIllIll];
         llIlIllIIlIIIII.append((char)(llIlIllIIlIlIII ^ llIlIllIIlIIlII[llIlIllIIlIIIll % llIlIllIIlIIlII.length]));
         "".length();
         ++llIlIllIIlIIIll;
         ++llIlIllIIIllIll;
         "".length();
      } while("  ".length() >= 0);

      return null;
   }

   private static void lIIlIIIIll() {
      lIIIIIlII = new String[lIIIIllll[21]];
      lIIIIIlII[lIIIIllll[1]] = lIIIllIlII("jGJNB8ldPpM=", "PUgef");
      lIIIIIlII[lIIIIllll[2]] = lIIIllIlII("ksT7EGho0aULyBVphObJOA==", "qmuqT");
      lIIIIIlII[lIIIIllll[3]] = lIIIllIlII("nNpnJVSRmHI=", "nOWbU");
      lIIIIIlII[lIIIIllll[4]] = lIIIllIlII("ibTD7I/GCJOhJg4d8tjZlFbGGZ7mvLp1QdJr1btBsaY=", "OByeX");
      lIIIIIlII[lIIIIllll[5]] = lIIIllIlII("eRe1IDXvDpw=", "bUSbb");
      lIIIIIlII[lIIIIllll[6]] = lIIIllIllI("FiglBgYBJTBvQzU=", "qMQGj");
      lIIIIIlII[lIIIIllll[0]] = lIIIllIlll("CoJWl3y5cNs=", "hGowS");
      lIIIIIlII[lIIIIllll[7]] = lIIIllIlll("DQ5eLWhYpH/MPC6pJ5Ywtw==", "CIbKc");
      lIIIIIlII[lIIIIllll[8]] = lIIIllIllI("PwUGPA==", "RjdOB");
      lIIIIIlII[lIIIIllll[9]] = lIIIllIlII("qV6mrfeaS/W4mHt5a+RJaQ==", "bJzZd");
      lIIIIIlII[lIIIIllll[10]] = lIIIllIlII("7l/y7meJEvg=", "CLKAz");
      lIIIIIlII[lIIIIllll[11]] = lIIIllIlll("k9rbm0gT1uUX5LKskg4n7Q==", "lGPuM");
      lIIIIIlII[lIIIIllll[12]] = lIIIllIlII("CdWzLiyxrsk=", "yOCwU");
      lIIIIIlII[lIIIIllll[13]] = lIIIllIlII("gg9orPhT6Xp4LC3FWVcYC40u+argiDxw", "aAIFm");
      lIIIIIlII[lIIIIllll[15]] = lIIIllIlII("MFSC+5BpkU8=", "XNTbO");
      lIIIIIlII[lIIIIllll[16]] = lIIIllIlII("2w/9+0Dh2xU=", "kEtsD");
      lIIIIIlII[lIIIIllll[17]] = lIIIllIlII("qumpbHtnSbU=", "GlJfN");
      lIIIIIlII[lIIIIllll[18]] = lIIIllIllI("ERktEAwzBg==", "AuLii");
      lIIIIIlII[lIIIIllll[19]] = lIIIllIlll("Y9Xv7GHxj0c=", "JALcH");
      lIIIIIlII[lIIIIllll[20]] = lIIIllIlII("qldhkwFKMkU=", "GOSCE");
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final Color ĂƂ() {
      return (Color)this.u.ⲋ(this, ⲋ[lIIIIllll[2]]);
   }

   private static boolean lIIlIlIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIlIlIIlI(int var0) {
      return var0 <= 0;
   }

   private static int lIIlIIllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIIlIlIIll(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   private final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIIIIllll[1]])).doubleValue();
   }

   @JvmName(
      name = "u"
   )
   private final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[lIIIIllll[3]])).doubleValue();
   }

   public ɧԈ() {
      super(lIIIIIlII[lIIIIllll[12]], lIIIIIlII[lIIIIllll[13]], ı５.〥ҳⱆ, lIIIIllll[1], (boolean)lIIIIllll[1], (boolean)lIIIIllll[1], lIIIIllll[14], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIIIIlII[lIIIIllll[15]], 1000.0D).u((Object)0.0D).ᴃᎲ((Object)1000.0D);
      this.u = this.ⲋ(lIIIIIlII[lIIIIllll[16]], Color.red);
      this.ᴃᎲ = this.ⲋ(lIIIIIlII[lIIIIllll[17]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.〥ҳⱆ = this.ⲋ(lIIIIIlII[lIIIIllll[18]], Boolean.valueOf((boolean)lIIIIllll[2]));
      this.Ἒⅾ = this.ⲋ(lIIIIIlII[lIIIIllll[19]], Boolean.valueOf((boolean)lIIIIllll[2]));
      this.ϛⰄ = this.ⲋ(lIIIIIlII[lIIIIllll[20]], Boolean.valueOf((boolean)lIIIIllll[2]));
   }

   private static void lIIlIIllIl() {
      lIIIIllll = new int[22];
      lIIIIllll[0] = 74 ^ 76;
      lIIIIllll[1] = (71 ^ 124 ^ 93 ^ 89) & (39 ^ 92 ^ 237 ^ 169 ^ -" ".length());
      lIIIIllll[2] = " ".length();
      lIIIIllll[3] = "  ".length();
      lIIIIllll[4] = "   ".length();
      lIIIIllll[5] = 38 ^ 34;
      lIIIIllll[6] = 121 ^ 80 ^ 129 ^ 173;
      lIIIIllll[7] = 53 ^ 3 ^ 35 ^ 18;
      lIIIIllll[8] = 168 ^ 160;
      lIIIIllll[9] = 28 ^ 21;
      lIIIIllll[10] = 72 ^ 66;
      lIIIIllll[11] = 86 ^ 93;
      lIIIIllll[12] = 166 ^ 170;
      lIIIIllll[13] = 17 ^ 28;
      lIIIIllll[14] = 191 ^ 135;
      lIIIIllll[15] = 138 + 141 - 242 + 136 ^ 82 + 0 - -13 + 68;
      lIIIIllll[16] = 46 ^ 33;
      lIIIIllll[17] = 11 ^ 27;
      lIIIIllll[18] = 113 ^ 117 ^ 134 ^ 147;
      lIIIIllll[19] = 48 ^ 34;
      lIIIIllll[20] = 214 ^ 197;
      lIIIIllll[21] = 229 ^ 155 ^ 52 ^ 94;
   }

   public void ἶṗ() {
      super.ἶṗ();
      Iterable llIlIllIlIllIIl = (Iterable)llIlIllIlIllIll.ɡ().field_71441_e.field_72996_f;
      int llIlIllIlIllIII = lIIIIllll[1];
      Collection llIlIllIlIlIllI = (Collection)(new ArrayList());
      int llIlIllIlIlIlIl = lIIIIllll[1];
      Iterator llIlIllIlIlIlII = llIlIllIlIllIIl.iterator();

      Object llIlIllIlIlIIll;
      Entity llIlIllIlIlIIlI;
      int llIlIllIlIlIIIl;
      int var10000;
      while(lIIlIlIIIl(llIlIllIlIlIlII.hasNext())) {
         llIlIllIlIlIIll = llIlIllIlIlIlII.next();
         llIlIllIlIlIIlI = (Entity)llIlIllIlIlIIll;
         llIlIllIlIlIIIl = lIIIIllll[1];
         if (lIIlIlIIIl(Intrinsics.areEqual((Object)llIlIllIlIlIIlI, (Object)llIlIllIlIllIll.ɡ().field_71439_g) ^ lIIIIllll[2]) && lIIlIlIIlI(lIIlIIllll(llIlIllIlIllIll.ɡ().field_71439_g.func_70032_d(llIlIllIlIlIIlI), (float)llIlIllIlIllIll.ⲋ()))) {
            var10000 = lIIIIllll[2];
            "".length();
            if (" ".length() <= 0) {
               return;
            }
         } else {
            var10000 = lIIIIllll[1];
         }

         if (lIIlIlIIIl(var10000)) {
            llIlIllIlIlIllI.add(llIlIllIlIlIIll);
            "".length();
            "".length();
            if (-" ".length() == "   ".length()) {
               return;
            }
         }
      }

      llIlIllIlIllIIl = (Iterable)((List)llIlIllIlIlIllI);
      llIlIllIlIllIII = lIIIIllll[1];
      llIlIllIlIlIllI = (Collection)(new ArrayList());
      llIlIllIlIlIlIl = lIIIIllll[1];
      llIlIllIlIlIlII = llIlIllIlIllIIl.iterator();

      while(lIIlIlIIIl(llIlIllIlIlIlII.hasNext())) {
         llIlIllIlIlIIll = llIlIllIlIlIlII.next();
         llIlIllIlIlIIlI = (Entity)llIlIllIlIlIIll;
         llIlIllIlIlIIIl = lIIIIllll[1];
         if ((!lIIlIlIIIl(llIlIllIlIllIll.ᴃᎲ()) || lIIlIlIIll(llIlIllIlIlIIlI instanceof EntityPlayer)) && (!lIIlIlIIIl(llIlIllIlIllIll.〥ҳⱆ()) || lIIlIlIIll(llIlIllIlIlIIlI instanceof EntityMob)) && (!lIIlIlIIIl(llIlIllIlIllIll.Ἒⅾ()) || !lIIlIlIIIl(llIlIllIlIlIIlI instanceof EntityAnimal))) {
            var10000 = lIIIIllll[1];
         } else {
            var10000 = lIIIIllll[2];
            "".length();
            if (null != null) {
               return;
            }
         }

         if (lIIlIlIIIl(var10000)) {
            llIlIllIlIlIllI.add(llIlIllIlIlIIll);
            "".length();
            "".length();
            if (null != null) {
               return;
            }
         }
      }

      double llIlIllIlIllIlI = (List)llIlIllIlIlIllI;
      if (!lIIlIlIIIl(llIlIllIlIllIlI.isEmpty())) {
         long llIlIllIlIllIIl = ᾣŦ.ⲋ;
         llIlIllIlIllIII = lIIIIllll[1];
         short llIlIllIlIlIlll = lIIIIllll[1];
         Exception llIlIllIlIlIllI = llIlIllIlIllIIl;
         llIlIllIlIlIlIl = lIIIIllll[1];
         llIlIllIlIllIIl.ⲋ(lIIIIllll[2]);
         Entity var21 = llIlIllIlIllIll.ɡ().field_175622_Z;
         if (lIIlIlIlII(var21)) {
            Intrinsics.throwNpe();
         }

         int llIlIllIlIlIlII = var21;
         char llIlIllIlIlIIll = (new Vec3d(0.0D, 0.0D, 1.0D)).func_178789_a((float)(-Math.toRadians((double)llIlIllIlIlIlII.field_70125_A))).func_178785_b((float)(-Math.toRadians((double)llIlIllIlIlIlII.field_70177_z))).func_72441_c(0.0D, (double)llIlIllIlIllIll.ɡ().field_71439_g.func_70047_e(), 0.0D).func_72441_c(llIlIllIlIllIll.ɡ().field_175616_W.field_78725_b, llIlIllIlIllIll.ɡ().field_175616_W.field_78726_c, llIlIllIlIllIll.ɡ().field_175616_W.field_78723_d);
         short llIlIllIlIlIIlI = (Iterable)llIlIllIlIllIlI;
         llIlIllIlIlIIIl = lIIIIllll[1];
         Iterator llIlIllIlIlIIII = llIlIllIlIlIIlI.iterator();

         do {
            if (!lIIlIlIIIl(llIlIllIlIlIIII.hasNext())) {
               llIlIllIlIlIllI.ĂƂ();
               return;
            }

            int llIlIllIlIIllll = llIlIllIlIlIIII.next();
            double llIlIllIlIIlllI = (Entity)llIlIllIlIIllll;
            int llIlIllIlIIllIl = lIIIIllll[1];
            float llIlIllIlIIllII = llIlIllIlIIlllI.field_70121_D.func_189972_c().func_178787_e(Ṑ.ⲋ(llIlIllIlIIlllI, (double)llIlIllIlIllIll.ɡ().func_184121_ak()));
            llIlIllIlIlIllI.ⲋ(llIlIllIlIlIIll, llIlIllIlIIllII, ſ.ĂƂ(ſ.ⲋ(llIlIllIlIllIll.ĂƂ(), llIlIllIlIllIll.u())));
            "".length();
         } while((115 ^ 119) != 0);

      }
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   private final boolean 〥ҳⱆ() {
      return (Boolean)this.Ἒⅾ.ⲋ(this, ⲋ[lIIIIllll[5]]);
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   private final boolean Ἒⅾ() {
      return (Boolean)this.ϛⰄ.ⲋ(this, ⲋ[lIIIIllll[6]]);
   }

   private static String lIIIllIlll(String llIlIllIlIIIIlI, String llIlIllIlIIIIll) {
      try {
         short llIlIllIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIIllll[8]), "DES");
         double llIlIllIIllllll = Cipher.getInstance("DES");
         llIlIllIIllllll.init(lIIIIllll[3], llIlIllIlIIIIII);
         return new String(llIlIllIIllllll.doFinal(Base64.getDecoder().decode(llIlIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIIIllIlII(String llIlIllIIllIlIl, String llIlIllIIllIlII) {
      try {
         float llIlIllIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int llIlIllIIllIIlI = Cipher.getInstance("Blowfish");
         llIlIllIIllIIlI.init(lIIIIllll[3], llIlIllIIllIIll);
         return new String(llIlIllIIllIIlI.doFinal(Base64.getDecoder().decode(llIlIllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
