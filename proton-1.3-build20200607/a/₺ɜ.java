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
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u000eB\u0007¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004R\"\u0010\u0007\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/₺ɜ;", "Lnet/minecraft/util/ResourceLocation;", "u", "Lnet/minecraft/util/ResourceLocation;", "ⲋ", "()Lnet/minecraft/util/ResourceLocation;", "", "ĂƂ", "La/ⅹ;", "()D", "", "ἶṗ", "()V", "<init>", "La/ⳅ;"}
)
public final class ₺ɜ extends ⳅ {
   private static void lIllIllIlI() {
      lIlIllIll = new int[16];
      lIlIllIll[0] = " ".length();
      lIlIllIll[1] = (2 ^ 36) & ~(32 ^ 6);
      lIlIllIll[2] = -16387 & 19939;
      lIlIllIll[3] = -(-143 & 25599) & -1159 & 32759;
      lIlIllIll[4] = "  ".length();
      lIlIllIll[5] = -(-3506 & 12219) & -4097 & 13309;
      lIlIllIll[6] = -(-2795 & 32507) & -2054 & 32765;
      lIlIllIll[7] = 186 ^ 136;
      lIlIllIll[8] = 103 ^ 3;
      lIlIllIll[9] = -(86 ^ 79);
      lIlIllIll[10] = "   ".length();
      lIlIllIll[11] = 77 ^ 117;
      lIlIllIll[12] = 132 ^ 128 ^ (75 ^ 122) & ~(87 ^ 102);
      lIlIllIll[13] = 238 ^ 134 ^ 6 ^ 107;
      lIlIllIll[14] = 25 ^ 104 ^ 88 ^ 47;
      lIlIllIll[15] = 7 ^ 15;
   }

   private static boolean lIllIlllIl(int var0) {
      return var0 <= 0;
   }

   public ₺ɜ() {
      super(lIlIllIlI[lIlIllIll[4]], lIlIllIlI[lIlIllIll[10]], ı５.ĂƂ, lIlIllIll[1], (boolean)lIlIllIll[1], (boolean)lIlIllIll[1], lIlIllIll[11], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIlIllIlI[lIlIllIll[12]], 1000.0D).u((Object)0.0D).ᴃᎲ((Object)1000.0D);
      this.u = new ResourceLocation(lIlIllIlI[lIlIllIll[13]]);
   }

   public void ἶṗ() {
      super.ἶṗ();
      Iterable llIIllIlIIIIIIl = (Iterable)llIIllIlIIIIIll.ɡ().field_71441_e.field_72996_f;
      int llIIllIlIIIIIII = lIlIllIll[1];
      Collection llIIllIIllllllI = (Collection)(new ArrayList());
      int llIIllIIlllllIl = lIlIllIll[1];
      Iterator llIIllIIlllllII = llIIllIlIIIIIIl.iterator();

      Object llIIllIIllllIll;
      int var10000;
      while(lIllIlllII(llIIllIIlllllII.hasNext())) {
         llIIllIIllllIll = llIIllIIlllllII.next();
         short llIIllIIllllIlI = (Entity)llIIllIIllllIll;
         float llIIllIIllllIIl = lIlIllIll[1];
         if (lIllIlllII(Intrinsics.areEqual((Object)llIIllIlIIIIIll.ɡ().field_71439_g, (Object)llIIllIIllllIlI) ^ lIlIllIll[0]) && lIllIlllIl(lIllIllIll(llIIllIlIIIIIll.ɡ().field_71439_g.func_70032_d(llIIllIIllllIlI), (float)llIIllIlIIIIIll.ĂƂ()))) {
            var10000 = lIlIllIll[0];
            "".length();
            if (((47 ^ 15) & ~(183 ^ 151)) > 0) {
               return;
            }
         } else {
            var10000 = lIlIllIll[1];
         }

         if (lIllIlllII(var10000)) {
            llIIllIIllllllI.add(llIIllIIllllIll);
            "".length();
            "".length();
            if (((100 ^ 63) & ~(14 ^ 85)) > 0) {
               return;
            }
         }
      }

      llIIllIlIIIIIIl = (Iterable)((List)llIIllIIllllllI);
      llIIllIlIIIIIII = lIlIllIll[1];
      llIIllIIllllllI = (Collection)(new ArrayList());
      llIIllIIlllllIl = lIlIllIll[1];
      llIIllIIlllllII = llIIllIlIIIIIIl.iterator();

      while(lIllIlllII(llIIllIIlllllII.hasNext())) {
         llIIllIIllllIll = llIIllIIlllllII.next();
         if (lIllIlllII(llIIllIIllllIll instanceof EntityMob)) {
            llIIllIIllllllI.add(llIIllIIllllIll);
            "".length();
            "".length();
            if (" ".length() >= "   ".length()) {
               return;
            }
         }
      }

      double llIIllIlIIIIIlI = (List)llIIllIIllllllI;
      GL11.glEnable(lIlIllIll[2]);
      GL11.glDisable(lIlIllIll[3]);
      GlStateManager.func_179129_p();
      llIIllIlIIIIIIl = (Iterable)llIIllIlIIIIIlI;
      llIIllIlIIIIIII = lIlIllIll[1];
      Iterator llIIllIIlllllll = llIIllIlIIIIIIl.iterator();

      do {
         if (!lIllIlllII(llIIllIIlllllll.hasNext())) {
            GL11.glEnable(lIlIllIll[2]);
            GL11.glEnable(lIlIllIll[3]);
            GlStateManager.func_179089_o();
            return;
         }

         double llIIllIIllllllI = llIIllIIlllllll.next();
         byte llIIllIIlllllIl = (EntityMob)llIIllIIllllllI;
         int llIIllIIlllllII = lIlIllIll[1];
         GL11.glPushMatrix();
         Vec3d var22 = Ṑ.ĂƂ((Entity)llIIllIIlllllIl, (double)llIIllIlIIIIIll.ɡ().func_184121_ak());
         Entity var10001 = llIIllIlIIIIIll.ɡ().field_175622_Z;
         if (lIllIllllI(var10001)) {
            Intrinsics.throwNpe();
         }

         Vec3d llIIllIIllllIll;
         float llIIllIIllllIlI;
         label53: {
            label52: {
               llIIllIIllllIll = var22.func_178788_d(Ṑ.ĂƂ(var10001, (double)llIIllIlIIIIIll.ɡ().func_184121_ak())).func_178787_e(llIIllIIlllllIl.field_70121_D.func_189972_c().func_178788_d(llIIllIIlllllIl.func_174791_d()));
               llIIllIIllllIlI = llIIllIlIIIIIll.ɡ().func_175598_ae().field_78735_i;
               float llIIllIIllllIIl = llIIllIlIIIIIll.ɡ().func_175598_ae().field_78732_j;
               RenderManager var23 = llIIllIlIIIIIll.ɡ().field_175616_W;
               if (lIllIlllll(var23)) {
                  GameSettings var24 = var23.field_78733_k;
                  if (lIllIlllll(var24)) {
                     if (lIlllIIIII(var24.field_74320_O, lIlIllIll[4])) {
                        var10000 = lIlIllIll[0];
                        "".length();
                        if ("  ".length() == 0) {
                           return;
                        }
                        break label53;
                     }
                     break label52;
                  }
               }

               "".length();
            }

            var10000 = lIlIllIll[1];
         }

         GlStateManager.func_179137_b(llIIllIIllllIll.field_72450_a, llIIllIIllllIll.field_72448_b + (double)llIIllIIlllllIl.field_70131_O, llIIllIIllllIll.field_72449_c);
         GlStateManager.func_179114_b(-llIIllIIllllIlI, 0.0F, 1.0F, 0.0F);
         Entity var25 = llIIllIlIIIIIll.ɡ().field_175622_Z;
         if (lIllIllllI(var25)) {
            Intrinsics.throwNpe();
         }

         Ṑ.ĂƂ(var25, (double)llIIllIlIIIIIll.ɡ().func_184121_ak()).func_72438_d(Ṑ.ĂƂ((Entity)llIIllIIlllllIl, (double)llIIllIlIIIIIll.ɡ().func_184121_ak()));
         GlStateManager.func_179152_a(-0.025F, -0.025F, 0.025F);
         Exception llIIllIIlllIllI = new ė(lIlIllIll[5], lIlIllIll[6]);
         char llIIllIIlllIlIl = new ė(lIlIllIll[7], (int)llIIllIIlllllIl.field_70131_O * lIlIllIll[8]);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(llIIllIlIIIIIll.u);
         ⲙ.ⲋ.ⲋ(lIlIllIll[9], lIlIllIll[1], 0.0F, 0.0F, llIIllIIlllIllI.ⲋ(), llIIllIIlllIllI.ĂƂ(), llIIllIIlllIlIl.ⲋ(), llIIllIIlllIlIl.ĂƂ(), (float)llIIllIIlllIllI.ⲋ(), (float)llIIllIIlllIllI.ĂƂ());
         GL11.glPopMatrix();
         "".length();
      } while(-" ".length() <= 0);

   }

   private static boolean lIllIlllII(int var0) {
      return var0 != 0;
   }

   private static boolean lIllIllllI(Object var0) {
      return var0 == null;
   }

   private static boolean lIlllIIIII(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIllIlIllI(String llIIllIIlIllllI, String llIIllIIlIlllIl) {
      try {
         SecretKeySpec llIIllIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIllIIllIIIlI = Cipher.getInstance("Blowfish");
         llIIllIIllIIIlI.init(lIlIllIll[4], llIIllIIllIIIll);
         return new String(llIIllIIllIIIlI.doFinal(Base64.getDecoder().decode(llIIllIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static int lIllIllIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static String lIllIlIlll(String llIIllIIlIlIIII, String llIIllIIlIIlIlI) {
      llIIllIIlIlIIII = new String(Base64.getDecoder().decode(llIIllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIIllIIlIIlllI = new StringBuilder();
      char[] llIIllIIlIIllIl = llIIllIIlIIlIlI.toCharArray();
      int llIIllIIlIIllII = lIlIllIll[1];
      long llIIllIIlIIIllI = llIIllIIlIlIIII.toCharArray();
      char llIIllIIlIIIlIl = llIIllIIlIIIllI.length;
      int llIIllIIlIIIlII = lIlIllIll[1];

      do {
         if (!lIlllIIIIl(llIIllIIlIIIlII, llIIllIIlIIIlIl)) {
            return String.valueOf(llIIllIIlIIlllI);
         }

         char llIIllIIlIlIIIl = llIIllIIlIIIllI[llIIllIIlIIIlII];
         llIIllIIlIIlllI.append((char)(llIIllIIlIlIIIl ^ llIIllIIlIIllIl[llIIllIIlIIllII % llIIllIIlIIllIl.length]));
         "".length();
         ++llIIllIIlIIllII;
         ++llIIllIIlIIIlII;
         "".length();
      } while(-(121 ^ 125) <= 0);

      return null;
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final double ĂƂ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIlIllIll[1]])).doubleValue();
   }

   private static boolean lIlllIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIllIlllll(Object var0) {
      return var0 != null;
   }

   static {
      lIllIllIlI();
      lIllIllIII();
      KProperty[] var10000 = new KProperty[lIlIllIll[0]];
      var10000[lIlIllIll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(₺ɜ.class), lIlIllIlI[lIlIllIll[1]], lIlIllIlI[lIlIllIll[0]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ResourceLocation ⲋ() {
      return this.u;
   }

   private static String lIllIlIlIl(String llIIllIIllIlIll, String llIIllIIllIllII) {
      try {
         char llIIllIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIIllIllII.getBytes(StandardCharsets.UTF_8)), lIlIllIll[15]), "DES");
         Cipher llIIllIIllIllll = Cipher.getInstance("DES");
         llIIllIIllIllll.init(lIlIllIll[4], llIIllIIllIlIIl);
         return new String(llIIllIIllIllll.doFinal(Base64.getDecoder().decode(llIIllIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIllIllIII() {
      lIlIllIlI = new String[lIlIllIll[14]];
      lIlIllIlI[lIlIllIll[1]] = lIllIlIlIl("jx0LtW6Yttg=", "ewwan");
      lIlIllIlI[lIlIllIll[0]] = lIllIlIllI("ZdV8d4V8A5pPFH/vtMNJpg==", "BWBqW");
      lIlIllIlI[lIlIllIll[4]] = lIllIlIlIl("prfx0CKq2Ymkdsg2OzYVsQ==", "GCnfq");
      lIlIllIlI[lIlIllIll[10]] = lIllIlIlll("ADJqICRh", "OZJNK");
      lIlIllIlI[lIlIllIll[12]] = lIllIlIlll("MRcbPh0=", "cvuYx");
      lIlIllIlI[lIlIllIll[13]] = lIllIlIlll("ET8+BwEWI2QYAxc=", "pLJhm");
   }
}
