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
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.IBlockAccess;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u001bB\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0006\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u000b\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u0082\u0084\u0002R&\u0010\u0004\u001a\u0006*\u00020\f0\f8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u000b\u0010\r¨\u0006\u0082\u0084\u0002R&\u0010\u0002\u001a\u0006*\u00020\f0\f8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\u0002\u0010\r¨\u0006\u0082\u0084\u0002R\"\u0010\t\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\b\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\n¨\u0006\u0082\u0084\u0002R\"\u0010\u0010\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u000f\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\b\u0010\n¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/Ꙓ;", "", "ᴃᎲ", "La/ⅹ;", "u", "()D", "ⲋ", "", "Ἒⅾ", "〥ҳⱆ", "()Z", "ĂƂ", "Ljava/awt/Color;", "()Ljava/awt/Color;", "Ꜥ", "ς", "ϛⰄ", "Lnet/minecraft/util/math/BlockPos;", "p0", "", "(Lnet/minecraft/util/math/BlockPos;)V", "Lnet/minecraft/util/math/AxisAlignedBB;", "p1", "(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;)V", "ἶṗ", "()V", "<init>", "La/ⳅ;"}
)
public final class Ꙓ extends ⳅ {
   private static String llIIlIlIIl(String llIIIlllIllIIIl, String llIIIlllIllIIII) {
      try {
         SecretKeySpec llIIIlllIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlllIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception llIIIlllIlIllII = Cipher.getInstance("Blowfish");
         llIIIlllIlIllII.init(llIIIllll[3], llIIIlllIllIlII);
         return new String(llIIIlllIlIllII.doFinal(Base64.getDecoder().decode(llIIIlllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIlIIlIII(Object var0) {
      return var0 != null;
   }

   public void ἶṗ() {
      if (!llIlIIIlll(llIIIllllIIIlll.ɡ().field_71439_g)) {
         RayTraceResult var10000 = llIIIllllIIIlll.ɡ().field_71439_g.func_174822_a(llIIIllllIIIlll.ⲋ(), 0.5F);
         if (llIlIIlIII(var10000)) {
            "".length();
            if ((28 ^ 24) != ((75 ^ 89) & ~(135 ^ 149))) {
               byte llIIIllllIIIllI = var10000;
               if (llIlIIlIIl(llIIIllllIIIllI.field_72313_a, Type.BLOCK)) {
                  short llIIIllllIIIlIl = llIIIllllIIIllI.func_178782_a();
                  IBlockState var7 = llIIIllllIIIlll.ɡ().field_71441_e.func_180495_p(llIIIllllIIIlIl);
                  if (!llIlIIlIII(var7)) {
                     "".length();
                     return;
                  }

                  "".length();
                  if ("  ".length() < 0) {
                     return;
                  }

                  double llIIIllllIIIlII = var7;
                  char llIIIllllIIIIll = llIIIllllIIIlII.func_185904_a().func_76222_j();
                  ItemStack var8 = llIIIllllIIIlll.ɡ().field_71439_g.func_184614_ca();
                  if (!llIlIIlIII(var8)) {
                     "".length();
                     return;
                  }

                  "".length();
                  if (-" ".length() >= 0) {
                     return;
                  }

                  char llIIIllllIIIIlI = var8;
                  if (llIlIIIllI(llIIIllllIIIIlI.field_151002_e instanceof ItemBlock) && llIlIIIlIl(llIIIllllIIIIll) && llIlIIIllI(llIIIllllIIIlll.〥ҳⱆ())) {
                     llIIIllllIIIlIl = llIIIllllIIIlIl.func_177972_a(llIIIllllIIIllI.field_178784_b);
                  }

                  if (llIlIIIllI(llIIIllllIIIIlI.field_151002_e instanceof ItemBlock) && !llIlIIIlIl(llIIIllllIIIlll.〥ҳⱆ())) {
                     llIIIllllIIIlll.ⲋ(llIIIllllIIIlIl);
                  } else {
                     Exception llIIIllllIIIIIl = llIIIllllIIIlII.func_185900_c((IBlockAccess)llIIIllllIIIlll.ɡ().field_71441_e, llIIIllllIIIlIl);
                     llIIIllllIIIlll.ⲋ(llIIIllllIIIlIl, llIIIllllIIIIIl);
                     "".length();
                     if (" ".length() >= "  ".length()) {
                        return;
                     }
                  }
               }

            }
         } else {
            "".length();
         }
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final Color ĂƂ() {
      return (Color)this.u.ⲋ(this, ⲋ[llIIIllll[2]]);
   }

   @JvmName(
      name = "ⲋ"
   )
   private final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[llIIIllll[1]])).doubleValue();
   }

   @JvmName(
      name = "ϛⰄ"
   )
   private final boolean ϛⰄ() {
      return (Boolean)this.ς.ⲋ(this, ⲋ[llIIIllll[7]]);
   }

   @JvmName(
      name = "ς"
   )
   private final double ς() {
      return ((Number)this.Ꜥ.ⲋ(this, ⲋ[llIIIllll[8]])).doubleValue();
   }

   private static boolean llIlIIlIIl(Object var0, Object var1) {
      return var0 == var1;
   }

   public Ꙓ() {
      super(llIIIIIlI[llIIIllll[17]], llIIIIIlI[llIIIllll[18]], ı５.〥ҳⱆ, llIIIllll[1], (boolean)llIIIllll[1], (boolean)llIIIllll[1], llIIIllll[19], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIIIIIlI[llIIIllll[20]], 8.0D).u((Object)0.0D).ᴃᎲ((Object)20.0D);
      this.u = this.ⲋ(llIIIIIlI[llIIIllll[21]], Color.blue);
      this.ᴃᎲ = this.ⲋ(llIIIIIlI[llIIIllll[22]], 0.5D).u((Object)0.0D).ᴃᎲ((Object)1.0D);
      this.〥ҳⱆ = this.ⲋ(llIIIIIlI[llIIIllll[23]], Color.red);
      this.Ἒⅾ = this.ⲋ(llIIIIIlI[llIIIllll[24]], Boolean.valueOf((boolean)llIIIllll[1]));
      this.ϛⰄ = this.ⲋ(llIIIIIlI[llIIIllll[25]], Boolean.valueOf((boolean)llIIIllll[2]));
      this.ς = this.ⲋ(llIIIIIlI[llIIIllll[26]], Boolean.valueOf((boolean)llIIIllll[2]));
      this.Ꜥ = this.ⲋ(llIIIIIlI[llIIIllll[27]], 2.0D).u((Object)0.1D).ᴃᎲ((Object)10.0D);
   }

   private static void llIlIIIIII() {
      llIIIIIlI = new String[llIIIllll[28]];
      llIIIIIlI[llIIIllll[1]] = llIIlIlIIl("8KkaIdVj9pM=", "lXRfT");
      llIIIIIlI[llIIIllll[2]] = llIIlIlllI("IjwnKDwBMCAOYGwd", "EYSzH");
      llIIIIIlI[llIIIllll[3]] = llIIlIlllI("Oj4gCjk=", "YQLeK");
      llIIIIIlI[llIIIllll[4]] = llIIlIlIIl("zhDtziUn3hOKNUe2bWWVSzQPAt0gJnutc/5bN7+OFHU=", "ldUMd");
      llIIIIIlI[llIIIllll[5]] = llIIllIIlI("goIKvHtJB7s=", "Gdprf");
      llIIIIIlI[llIIIllll[6]] = llIIllIIlI("i0HPSNH3wOlkB4AwfRA9NA==", "qMfkw");
      llIIIIIlI[llIIIllll[7]] = llIIllIIlI("Rck2AryIGiDcAVU2YNFqXg==", "QUFPt");
      llIIIIIlI[llIIIllll[8]] = llIIllIIlI("XssCGwbINpvIEk74Nat+XsXSScsQzc8VhPBOFP4hEH4=", "fCAHJ");
      llIIIIIlI[llIIIllll[0]] = llIIlIlIIl("fg8BNxNc888qxuA2I9Ixiw==", "vcNRB");
      llIIIIIlI[llIIIllll[9]] = llIIllIIlI("9PBCgQYkYB4s0cSB/m6qVc+3ZKYVJMop", "SIGJs");
      llIIIIIlI[llIIIllll[10]] = llIIlIlIIl("u72co4NyjTA=", "TESRM");
      llIIIIIlI[llIIIllll[11]] = llIIlIlIIl("IhSaFx6WL6r1N48ibSthBg==", "jhOJO");
      llIIIIIlI[llIIIllll[12]] = llIIlIlIIl("20KpRjsVN18=", "lrtaZ");
      llIIIIIlI[llIIIllll[13]] = llIIlIlIIl("4GySH89pInWOvccQrQM29Q==", "Okkik");
      llIIIIIlI[llIIIllll[14]] = llIIlIlIIl("iLzZwUW8qrrscRFrOd1PQw==", "BcYnc");
      llIIIIIlI[llIIIllll[15]] = llIIllIIlI("6k2pAsYzSvMDD2abf1cDsw==", "dUNuT");
      llIIIIIlI[llIIIllll[17]] = llIIllIIlI("6osOgVrjrsvBwKerdxxhgA==", "LiCBP");
      llIIIIIlI[llIIIllll[18]] = llIIlIlllI("IDMJPwkBPQYjFkguBjJFCjYBNA5IIwEiQho/TjsKBzEHOQJIOxp5", "hZnWe");
      llIIIIIlI[llIIIllll[20]] = llIIlIlllI("AhUsOSYxFzApPSMA", "PtUmT");
      llIIIIIlI[llIIIllll[21]] = llIIllIIlI("xg+273Ctwzw=", "etZTl");
      llIIIIIlI[llIIIllll[22]] = llIIllIIlI("OIuPCfzq8FI=", "loxYV");
      llIIIIIlI[llIIIllll[23]] = llIIlIlIIl("XutEQRYo3/fvmuKB/W7QqA==", "QKmEs");
      llIIIIIlI[llIIIllll[24]] = llIIlIlllI("EiUqLygAOyA6KjU+", "PIELC");
      llIIIIIlI[llIIIllll[25]] = llIIlIlIIl("31inmrtL2qE=", "XDKTY");
      llIIIIIlI[llIIIllll[26]] = llIIlIlIIl("CzSSROqTNYM=", "NTeNU");
      llIIIIIlI[llIIIllll[27]] = llIIlIlIIl("MXFZT7nk4n8vXHgalBfwBA==", "SHIYT");
   }

   private static void llIlIIIlII() {
      llIIIllll = new int[29];
      llIIIllll[0] = 100 ^ 63 ^ 245 ^ 166;
      llIIIllll[1] = (145 ^ 133) & ~(98 ^ 118);
      llIIIllll[2] = " ".length();
      llIIIllll[3] = "  ".length();
      llIIIllll[4] = "   ".length();
      llIIIllll[5] = 153 ^ 157;
      llIIIllll[6] = 25 ^ 81 ^ 104 ^ 37;
      llIIIllll[7] = 131 + 159 - 144 + 14 ^ 73 + 109 - 34 + 18;
      llIIIllll[8] = 232 ^ 139 ^ 221 ^ 185;
      llIIIllll[9] = 67 ^ 43 ^ 5 ^ 100;
      llIIIllll[10] = 205 ^ 199;
      llIIIllll[11] = 135 + 65 - 56 + 21 ^ 92 + 164 - 217 + 135;
      llIIIllll[12] = 103 ^ 73 ^ 92 ^ 126;
      llIIIllll[13] = 19 + 103 - 65 + 79 ^ 22 + 1 - 22 + 132;
      llIIIllll[14] = 30 ^ 118 ^ 207 ^ 169;
      llIIIllll[15] = 9 ^ 6;
      llIIIllll[16] = 38 ^ 68 ^ 91 ^ 6;
      llIIIllll[17] = 110 ^ 126;
      llIIIllll[18] = 124 ^ 95 ^ 124 ^ 78;
      llIIIllll[19] = 36 + 3 - -55 + 72 ^ 86 + 123 - 88 + 37;
      llIIIllll[20] = 36 ^ 54;
      llIIIllll[21] = "   ".length() ^ 40 ^ 56;
      llIIIllll[22] = 52 ^ 113 ^ 53 ^ 100;
      llIIIllll[23] = 135 + 16 - 119 + 127 ^ 136 + 124 - 123 + 1;
      llIIIllll[24] = 39 ^ 55 ^ 63 ^ 57;
      llIIIllll[25] = 144 ^ 135;
      llIIIllll[26] = 34 ^ 58;
      llIIIllll[27] = 180 ^ 173;
      llIIIllll[28] = 162 ^ 184;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   private final boolean 〥ҳⱆ() {
      return (Boolean)this.Ἒⅾ.ⲋ(this, ⲋ[llIIIllll[5]]);
   }

   static {
      llIlIIIlII();
      llIlIIIIII();
      KProperty[] var10000 = new KProperty[llIIIllll[0]];
      var10000[llIIIllll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[1]], llIIIIIlI[llIIIllll[2]]));
      var10000[llIIIllll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[3]], llIIIIIlI[llIIIllll[4]]));
      var10000[llIIIllll[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[5]], llIIIIIlI[llIIIllll[6]]));
      var10000[llIIIllll[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[7]], llIIIIIlI[llIIIllll[8]]));
      var10000[llIIIllll[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[0]], llIIIIIlI[llIIIllll[9]]));
      var10000[llIIIllll[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[10]], llIIIIIlI[llIIIllll[11]]));
      var10000[llIIIllll[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[12]], llIIIIIlI[llIIIllll[13]]));
      var10000[llIIIllll[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꙓ.class), llIIIIIlI[llIIIllll[14]], llIIIIIlI[llIIIllll[15]]));
      ⲋ = var10000;
   }

   private static boolean llIlIIlIlI(int var0, int var1) {
      return var0 < var1;
   }

   private final void ⲋ(BlockPos llIIIllllIlIlIl, AxisAlignedBB llIIIllllIlIlII) {
      if (!llIlIIIlIl(llIIIllllIlIllI.Ἒⅾ()) || !llIlIIIlIl(llIIIllllIlIllI.ϛⰄ())) {
         String llIIIllllIlIIll = ᾣŦ.ⲋ;
         byte llIIIllllIlIIlI = llIIIllll[1];
         float llIIIllllIlIIIl = llIIIllll[1];
         Exception llIIIllllIIllll = llIIIllll[1];
         if (llIlIIIllI(llIIIllllIlIllI.Ἒⅾ())) {
            llIIIllllIlIIll.ⲋ(llIIIllll[8]);
            llIIIllllIlIIll.ⲋ(llIIIllllIlIlIl, llIIIllllIlIlII, ſ.ĂƂ(ſ.ⲋ(llIIIllllIlIllI.ĂƂ(), llIIIllllIlIllI.u())), llIIIllll[16]);
            llIIIllllIlIIll.ĂƂ();
         }

         if (llIlIIIllI(llIIIllllIlIllI.ϛⰄ())) {
            llIIIllllIlIIll.ⲋ(llIIIllll[2]);
            GlStateManager.func_187441_d((float)llIIIllllIlIllI.ς());
            llIIIllllIlIIll.ĂƂ(llIIIllllIlIlIl, llIIIllllIlIlII, ſ.ĂƂ(ſ.ⲋ(llIIIllllIlIllI.ᴃᎲ(), llIIIllllIlIllI.u())), llIIIllll[16]);
            llIIIllllIlIIll.ĂƂ();
         }

      }
   }

   private static boolean llIlIIIlIl(int var0) {
      return var0 == 0;
   }

   private final void ⲋ(BlockPos llIIIlllllIIlII) {
      if (!llIlIIIlIl(llIIIlllllIIlIl.Ἒⅾ()) || !llIlIIIlIl(llIIIlllllIIlIl.ϛⰄ())) {
         String llIIIlllllIIIll = ᾣŦ.ⲋ;
         byte llIIIlllllIIIlI = llIIIllll[1];
         String llIIIlllllIIIIl = llIIIllll[1];
         char llIIIllllIlllll = llIIIllll[1];
         if (llIlIIIllI(llIIIlllllIIlIl.Ἒⅾ())) {
            llIIIlllllIIIll.ⲋ(llIIIllll[8]);
            llIIIlllllIIIll.ⲋ(llIIIlllllIIlII, ſ.ĂƂ(ſ.ⲋ(llIIIlllllIIlIl.ĂƂ(), llIIIlllllIIlIl.u())), llIIIllll[16]);
            llIIIlllllIIIll.ĂƂ();
         }

         if (llIlIIIllI(llIIIlllllIIlIl.ϛⰄ())) {
            llIIIlllllIIIll.ⲋ(llIIIllll[2]);
            GlStateManager.func_187441_d((float)llIIIlllllIIlIl.ς());
            llIIIlllllIIIll.ⲋ(llIIIlllllIIlII, ſ.ⲋ(llIIIlllllIIlIl.ᴃᎲ(), llIIIlllllIIlIl.u()));
            llIIIlllllIIIll.ĂƂ();
         }

      }
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final Color ᴃᎲ() {
      return (Color)this.〥ҳⱆ.ⲋ(this, ⲋ[llIIIllll[4]]);
   }

   private static boolean llIlIIIllI(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   private final boolean Ἒⅾ() {
      return (Boolean)this.ϛⰄ.ⲋ(this, ⲋ[llIIIllll[6]]);
   }

   @JvmName(
      name = "u"
   )
   private final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[llIIIllll[3]])).doubleValue();
   }

   private static String llIIlIlllI(String llIIIlllIlIIIIl, String llIIIlllIIllIll) {
      llIIIlllIlIIIIl = new String(Base64.getDecoder().decode(llIIIlllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long llIIIlllIIllIlI = new StringBuilder();
      char[] llIIIlllIIllllI = llIIIlllIIllIll.toCharArray();
      int llIIIlllIIllIII = llIIIllll[1];
      long llIIIlllIIlIlll = llIIIlllIlIIIIl.toCharArray();
      int llIIIlllIIlIllI = llIIIlllIIlIlll.length;
      int llIIIlllIIlIlIl = llIIIllll[1];

      do {
         if (!llIlIIlIlI(llIIIlllIIlIlIl, llIIIlllIIlIllI)) {
            return String.valueOf(llIIIlllIIllIlI);
         }

         char llIIIlllIlIIIlI = llIIIlllIIlIlll[llIIIlllIIlIlIl];
         llIIIlllIIllIlI.append((char)(llIIIlllIlIIIlI ^ llIIIlllIIllllI[llIIIlllIIllIII % llIIIlllIIllllI.length]));
         "".length();
         ++llIIIlllIIllIII;
         ++llIIIlllIIlIlIl;
         "".length();
      } while(" ".length() >= 0);

      return null;
   }

   private static boolean llIlIIIlll(Object var0) {
      return var0 == null;
   }

   private static String llIIllIIlI(String llIIIlllIIIlIlI, String llIIIlllIIIlIIl) {
      try {
         SecretKeySpec llIIIlllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), llIIIllll[0]), "DES");
         short llIIIlllIIIIlll = Cipher.getInstance("DES");
         llIIIlllIIIIlll.init(llIIIllll[3], llIIIlllIIIllll);
         return new String(llIIIlllIIIIlll.doFinal(Base64.getDecoder().decode(llIIIlllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
