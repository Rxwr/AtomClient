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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0016B\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u000b\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u0082\u0084\u0002R&\u0010\u0004\u001a\u0006*\u00020\f0\f8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u000b\u0010\r¨\u0006\u0082\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u000f\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\u0010\u0010\n¨\u0006\u0082\u0084\u0002R\"\u0010\u000e\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\n¨\u0006\u0082\u0084\u0002R\"\u0010\u0011\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u0010\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\t\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000e\u0010\n¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/Ẅ;", "", "ᴃᎲ", "La/ⅹ;", "u", "()D", "ⲋ", "", "ⲡ", "Ꜥ", "()Z", "ĂƂ", "Ljava/awt/Color;", "()Ljava/awt/Color;", "Ἒⅾ", "〥ҳⱆ", "ς", "ϛⰄ", "", "ἶṗ", "()V", "<init>", "La/ⳅ;"}
)
public final class Ẅ extends ⳅ {
   private static boolean lIlIIIIIIII(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   private final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIIlIllllI[1]])).doubleValue();
   }

   private static boolean lIlIIIIIIll(int var0) {
      return var0 == 0;
   }

   private static String lIIlllIIlII(String lIIllllIIllIlII, String lIIllllIIllIIIl) {
      try {
         SecretKeySpec lIIllllIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIllllI[9]), "DES");
         Cipher lIIllllIIllIllI = Cipher.getInstance("DES");
         lIIllllIIllIllI.init(lIIlIllllI[3], lIIllllIIllIlll);
         return new String(lIIllllIIllIllI.doFinal(Base64.getDecoder().decode(lIIllllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final Color ĂƂ() {
      return (Color)this.u.ⲋ(this, ⲋ[lIIlIllllI[2]]);
   }

   @JvmName(
      name = "u"
   )
   private final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[lIIlIllllI[3]])).doubleValue();
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   private final double 〥ҳⱆ() {
      return ((Number)this.Ἒⅾ.ⲋ(this, ⲋ[lIIlIllllI[5]])).doubleValue();
   }

   private static boolean lIlIIllIIII(int var0, int var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   private final boolean Ἒⅾ() {
      return (Boolean)this.ϛⰄ.ⲋ(this, ⲋ[lIIlIllllI[6]]);
   }

   @JvmName(
      name = "ϛⰄ"
   )
   private final boolean ϛⰄ() {
      return (Boolean)this.ς.ⲋ(this, ⲋ[lIIlIllllI[7]]);
   }

   private static int lIIllllllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   @JvmName(
      name = "ς"
   )
   private final boolean ς() {
      return (Boolean)this.Ꜥ.ⲋ(this, ⲋ[lIIlIllllI[8]]);
   }

   private static boolean lIlIIlIlllI(Object var0) {
      return var0 == null;
   }

   private static String lIIlllIIIII(String lIIllllIIIlIIlI, String lIIllllIIIlIIIl) {
      lIIllllIIIlIIlI = new String(Base64.getDecoder().decode(lIIllllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIIllllIIIlIlIl = new StringBuilder();
      char[] lIIllllIIIlIlII = lIIllllIIIlIIIl.toCharArray();
      int lIIllllIIIlIIll = lIIlIllllI[1];
      String lIIllllIIIIllIl = lIIllllIIIlIIlI.toCharArray();
      byte lIIllllIIIIllII = lIIllllIIIIllIl.length;
      int lIIllllIIIIlIll = lIIlIllllI[1];

      do {
         if (!lIlIIllIllI(lIIllllIIIIlIll, lIIllllIIIIllII)) {
            return String.valueOf(lIIllllIIIlIlIl);
         }

         char lIIllllIIIllIII = lIIllllIIIIllIl[lIIllllIIIIlIll];
         lIIllllIIIlIlIl.append((char)(lIIllllIIIllIII ^ lIIllllIIIlIlII[lIIllllIIIlIIll % lIIllllIIIlIlII.length]));
         "".length();
         ++lIIllllIIIlIIll;
         ++lIIllllIIIIlIll;
         "".length();
      } while("   ".length() > " ".length());

      return null;
   }

   public void ἶṗ() {
      super.ἶṗ();
      Iterable lIlIIIllIlIIlII = (Iterable)lIlIIIllIlIIllI.ɡ().field_71441_e.field_72996_f;
      int lIlIIIllIlIIIll = lIIlIllllI[1];
      Collection lIlIIIllIlIIIIl = (Collection)(new ArrayList());
      int lIlIIIllIlIIIII = lIIlIllllI[1];
      Iterator lIlIIIllIIlllll = lIlIIIllIlIIlII.iterator();

      Object lIlIIIllIIllllI;
      while(lIlIIIIIIII(lIlIIIllIIlllll.hasNext())) {
         lIlIIIllIIllllI = lIlIIIllIIlllll.next();
         if (lIlIIIIIIII(lIlIIIllIIllllI instanceof EntityLivingBase)) {
            lIlIIIllIlIIIIl.add(lIlIIIllIIllllI);
            "".length();
            "".length();
            if (" ".length() >= (131 + 110 - 138 + 59 ^ 88 + 143 - 189 + 124)) {
               return;
            }
         }
      }

      lIlIIIllIlIIlII = (Iterable)((List)lIlIIIllIlIIIIl);
      lIlIIIllIlIIIll = lIIlIllllI[1];
      lIlIIIllIlIIIIl = (Collection)(new ArrayList());
      lIlIIIllIlIIIII = lIIlIllllI[1];
      lIlIIIllIIlllll = lIlIIIllIlIIlII.iterator();

      EntityLivingBase lIlIIIllIIlllIl;
      int lIlIIIllIIlllII;
      int var10000;
      while(lIlIIIIIIII(lIlIIIllIIlllll.hasNext())) {
         lIlIIIllIIllllI = lIlIIIllIIlllll.next();
         lIlIIIllIIlllIl = (EntityLivingBase)lIlIIIllIIllllI;
         lIlIIIllIIlllII = lIIlIllllI[1];
         if (lIlIIIIIIIl(lIIlllllllI(lIlIIIllIlIIllI.ɡ().field_71439_g.func_70032_d((Entity)lIlIIIllIIlllIl), (float)lIlIIIllIlIIllI.ⲋ()))) {
            var10000 = lIIlIllllI[2];
            "".length();
            if ((126 ^ 122) < (104 ^ 108)) {
               return;
            }
         } else {
            var10000 = lIIlIllllI[1];
         }

         if (lIlIIIIIIII(var10000)) {
            lIlIIIllIlIIIIl.add(lIlIIIllIIllllI);
            "".length();
            "".length();
            if (((80 ^ 101) & ~(12 ^ 57)) < ((43 ^ 57) & ~(184 ^ 170))) {
               return;
            }
         }
      }

      lIlIIIllIlIIlII = (Iterable)((List)lIlIIIllIlIIIIl);
      lIlIIIllIlIIIll = lIIlIllllI[1];
      lIlIIIllIlIIIIl = (Collection)(new ArrayList());
      lIlIIIllIlIIIII = lIIlIllllI[1];
      lIlIIIllIIlllll = lIlIIIllIlIIlII.iterator();

      while(lIlIIIIIIII(lIlIIIllIIlllll.hasNext())) {
         lIlIIIllIIllllI = lIlIIIllIIlllll.next();
         lIlIIIllIIlllIl = (EntityLivingBase)lIlIIIllIIllllI;
         lIlIIIllIIlllII = lIIlIllllI[1];
         if (lIlIIIIIIII(lIlIIIllIlIIllI.ϛⰄ()) && !lIlIIIIIIll(lIlIIIllIIlllIl instanceof EntityPlayer) || lIlIIIIIIII(lIlIIIllIlIIllI.ς()) && !lIlIIIIIIll(lIlIIIllIIlllIl instanceof EntityMob) || lIlIIIIIIII(lIlIIIllIlIIllI.Ꜥ()) && lIlIIIIIIII(Ṑ.ⲋ((Entity)lIlIIIllIIlllIl))) {
            var10000 = lIIlIllllI[2];
            "".length();
            if ("  ".length() < 0) {
               return;
            }
         } else {
            var10000 = lIIlIllllI[1];
         }

         if (lIlIIIIIIII(var10000)) {
            lIlIIIllIlIIIIl.add(lIlIIIllIIllllI);
            "".length();
            "".length();
            if (((190 + 128 - 242 + 120 ^ 31 + 136 - 100 + 75) & (134 ^ 168 ^ 238 ^ 138 ^ -" ".length())) != 0) {
               return;
            }
         }
      }

      Exception lIlIIIllIlIIlIl = (List)lIlIIIllIlIIIIl;
      if (!lIlIIIIIIII(lIlIIIllIlIIlIl.isEmpty())) {
         GlStateManager.func_179097_i();
         lIlIIIllIlIIlII = (Iterable)lIlIIIllIlIIlIl;
         lIlIIIllIlIIIll = lIIlIllllI[1];
         Iterator lIlIIIllIlIIIlI = lIlIIIllIlIIlII.iterator();

         do {
            if (!lIlIIIIIIII(lIlIIIllIlIIIlI.hasNext())) {
               GlStateManager.func_179126_j();
               return;
            }

            byte lIlIIIllIlIIIIl = lIlIIIllIlIIIlI.next();
            short lIlIIIllIlIIIII = (EntityLivingBase)lIlIIIllIlIIIIl;
            boolean lIlIIIllIIlllll = lIIlIllllI[1];
            GL11.glPushMatrix();
            Vec3d var42 = Ṑ.ĂƂ((Entity)lIlIIIllIlIIIII, (double)lIlIIIllIlIIllI.ɡ().func_184121_ak());
            Entity var10001 = lIlIIIllIlIIllI.ɡ().field_175622_Z;
            if (lIlIIlIlllI(var10001)) {
               Intrinsics.throwNpe();
            }

            String lIlIIIllIIllllI = var42.func_178788_d(Ṑ.ĂƂ(var10001, (double)lIlIIIllIlIIllI.ɡ().func_184121_ak()));
            float var43 = lIlIIIllIlIIIII.field_70131_O + 0.5F;
            float var41;
            if (lIlIIIIIIII(lIlIIIllIlIIIII.func_70093_af())) {
               var41 = 0.25F;
               "".length();
               if ("   ".length() <= "  ".length()) {
                  return;
               }
            } else {
               var41 = 0.0F;
            }

            float lIlIIIllIIllIIl;
            float lIlIIIllIIllIII;
            float lIlIIIllIIlllIl;
            label107: {
               label106: {
                  lIlIIIllIIlllIl = var43 - var41;
                  char lIlIIIllIIlllII = lIlIIIllIIllllI.field_72450_a;
                  double var45 = lIlIIIllIIllllI.field_72448_b + (double)lIlIIIllIIlllIl;
                  int lIlIIIllIIllIlI = lIlIIIllIIllllI.field_72449_c;
                  lIlIIIllIIllIIl = lIlIIIllIlIIllI.ɡ().func_175598_ae().field_78735_i;
                  lIlIIIllIIllIII = lIlIIIllIlIIllI.ɡ().func_175598_ae().field_78732_j;
                  RenderManager var46 = lIlIIIllIlIIllI.ɡ().field_175616_W;
                  if (lIlIIlIllll(var46)) {
                     GameSettings var47 = var46.field_78733_k;
                     if (lIlIIlIllll(var47)) {
                        if (lIlIIllIIII(var47.field_74320_O, lIIlIllllI[3])) {
                           var10000 = lIIlIllllI[2];
                           "".length();
                           if ("   ".length() <= 0) {
                              return;
                           }
                           break label107;
                        }
                        break label106;
                     }
                  }

                  "".length();
               }

               var10000 = lIIlIllllI[1];
            }

            short lIlIIIllIIlIlll = var10000;
            GlStateManager.func_179137_b(lIlIIIllIIllllI.field_72450_a, lIlIIIllIIllllI.field_72448_b + (double)lIlIIIllIIlllIl, lIlIIIllIIllllI.field_72449_c);
            GlStateManager.func_179114_b(-lIlIIIllIIllIIl, 0.0F, 1.0F, 0.0F);
            if (lIlIIIIIIII(lIlIIIllIIlIlll)) {
               var10000 = lIIlIllllI[18];
               "".length();
               if (" ".length() <= -" ".length()) {
                  return;
               }
            } else {
               var10000 = lIIlIllllI[2];
            }

            GlStateManager.func_179114_b((float)var10000 * lIlIIIllIIllIII, 1.0F, 0.0F, 0.0F);
            Entity var48 = lIlIIIllIlIIllI.ɡ().field_175622_Z;
            if (lIlIIlIlllI(var48)) {
               Intrinsics.throwNpe();
            }

            Exception lIlIIIllIIlIllI = Ṑ.ĂƂ(var48, (double)lIlIIIllIlIIllI.ɡ().func_184121_ak()).func_72438_d(Ṑ.ĂƂ((Entity)lIlIIIllIlIIIII, (double)lIlIIIllIlIIllI.ɡ().func_184121_ak()));
            Exception lIlIIIllIIlIlIl = RangesKt.coerceAtMost(lIlIIIllIIlIllI / 8.0D, lIlIIIllIlIIllI.〥ҳⱆ());
            GlStateManager.func_179139_a(lIlIIIllIIlIlIl, lIlIIIllIIlIlIl, lIlIIIllIIlIlIl);
            int lIlIIIllIIlIlII = (float)lIlIIIllIlIIllI.ᴃᎲ() / 100.0F;
            GlStateManager.func_179152_a(-lIlIIIllIIlIlII, -lIlIIIllIIlIlII, lIlIIIllIIlIlII);
            short lIlIIIllIIlIIll = lIlIIIllIlIIIII.func_70005_c_();
            if (lIlIIIIIIII(lIlIIIllIlIIllI.Ἒⅾ())) {
               if (lIlIIIIIIII(lIlIIIllIlIIIII instanceof EntityPlayer)) {
                  var43 = ((EntityPlayer)lIlIIIllIlIIIII).func_110143_aJ() + ((EntityPlayer)lIlIIIllIlIIIII).func_110139_bj();
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var43 = lIlIIIllIlIIIII.func_110143_aJ();
               }

               char lIlIIIllIIlIIlI = var43;
               String var49;
               if (lIlIIllIIlI(lIIllllllll(lIlIIIllIIlIIlI, lIlIIIllIlIIIII.func_110138_aP() / (float)lIIlIllllI[3]))) {
                  var49 = lIIIllIIlI[lIIlIllllI[19]];
                  "".length();
                  if (-"  ".length() > 0) {
                     return;
                  }
               } else {
                  var49 = lIIIllIIlI[lIIlIllllI[20]];
               }

               int lIlIIIllIIlIIIl = var49;
               StringBuilder var50 = (new StringBuilder()).append(lIlIIIllIIlIIll).append(lIIIllIIlI[lIIlIllllI[21]]).append(lIlIIIllIIlIIIl);
               float lIlIIIllIIlIIII = StringCompanionObject.INSTANCE;
               boolean lIlIIIllIIIllll = lIIIllIIlI[lIIlIllllI[22]];
               Object[] var44 = new Object[lIIlIllllI[2]];
               var44[lIIlIllllI[1]] = lIlIIIllIIlIIlI;
               char lIlIIIllIIIlllI = var44;
               byte lIlIIIllIIIllIl = var50;
               int lIlIIIllIIIllII = lIIlIllllI[1];
               var49 = String.format(lIlIIIllIIIllll, Arrays.copyOf(lIlIIIllIIIlllI, lIlIIIllIIIlllI.length));
               Intrinsics.checkExpressionValueIsNotNull(var49, lIIIllIIlI[lIIlIllllI[23]]);
               float lIlIIIllIIIlIll = var49;
               lIlIIIllIIlIIll = String.valueOf(lIlIIIllIIIllIl.append(lIlIIIllIIIlIll));
            }

            short lIlIIIllIIIlIlI = 2.0D;
            float lIlIIIllIIlIIII = ⱉȬ.ᴃᎲ.ⲋ().u(lIlIIIllIIlIIll);
            GlStateManager.func_179137_b(-((double)lIlIIIllIIlIIII.ⲋ()) / 2.0D, 0.0D, 0.0D);
            GlStateManager.func_179147_l();
            GL11.glDisable(lIIlIllllI[24]);
            ⲙ.ⲋ.ⲋ(-lIlIIIllIIIlIlI, -lIlIIIllIIIlIlI, (double)lIlIIIllIIlIIII.ⲋ() + lIlIIIllIIIlIlI * 2.0D, (double)lIlIIIllIIlIIII.ĂƂ() + lIlIIIllIIIlIlI * 2.0D, 2.0D, ſ.ⲋ(lIlIIIllIlIIllI.ĂƂ(), lIlIIIllIlIIllI.u()));
            ⱉȬ.ᴃᎲ.ⲋ().ⲋ(lIIlIllllI[1], lIIlIllllI[1], Color.white, lIlIIIllIIlIIll, (boolean)lIIlIllllI[2]);
            GL11.glPopMatrix();
            "".length();
         } while(null == null);

      }
   }

   private static void lIIlllllIlI() {
      lIIIllIIlI = new String[lIIlIllllI[37]];
      lIIIllIIlI[lIIlIllllI[1]] = lIIllIIlIIl("0U2G+IjTuKk=", "aSMTG");
      lIIIllIIlI[lIIlIllllI[2]] = lIIlllIIIII("NS42MyI8LCdJahY=", "RKBaC");
      lIIIllIIlI[lIIlIllllI[3]] = lIIllIIlIIl("hnquhNA3QVY=", "ZsWaT");
      lIIIllIIlI[lIIlIllllI[4]] = lIIlllIIlII("CaxelZ7lGiJCDhErVWvXtCA15X5uDOA5la5+nzsI7Kw=", "jTSJq");
      lIIIllIIlI[lIIlIllllI[5]] = lIIlllIIlII("DWnPPT8Gqgo=", "Kxtjz");
      lIIIllIIlI[lIIlIllllI[6]] = lIIllIIlIIl("ua/SroLfazi5iwWi7kn0Gg==", "DNQzd");
      lIIIllIIlI[lIIlIllllI[7]] = lIIllIIlIIl("LJmYs0S7c0s=", "cgJPN");
      lIIIllIIlI[lIIlIllllI[8]] = lIIllIIlIIl("od4QJkWmXnuLYThFjBgNxw==", "wasqu");
      lIIIllIIlI[lIIlIllllI[9]] = lIIllIIlIIl("TI5fxUIzdJEY01/bVIbF9Q==", "PlEGV");
      lIIIllIIlI[lIIlIllllI[0]] = lIIllIIlIIl("7MhpWv6NythOSskzkpIUNsy+1ddhvVue", "PVmww");
      lIIIllIIlI[lIIlIllllI[10]] = lIIllIIlIIl("fnLDMT4lfOk3qR7gXjJ0Ag==", "pBpaI");
      lIIIllIIlI[lIIlIllllI[11]] = lIIlllIIlII("MT6Kd+8H9Y0stgDwnzo9ACt6kWd2S6vC", "sJwfR");
      lIIIllIIlI[lIIlIllllI[12]] = lIIlllIIIII("BhUVMgsECg==", "vytKn");
      lIIIllIIlI[lIIlIllllI[13]] = lIIlllIIlII("A0Pp66Y2Z5ahWi76gMN4jw==", "otDKy");
      lIIIllIIlI[lIIlIllllI[14]] = lIIllIIlIIl("lKm4QjvhOKg=", "aMazF");
      lIIIllIIlI[lIIlIllllI[15]] = lIIlllIIlII("NZiDhz4TmfvNepa0fEHtpQ==", "dSAQL");
      lIIIllIIlI[lIIlIllllI[16]] = lIIlllIIIII("EwIoBjYeHw==", "rlAkW");
      lIIIllIIlI[lIIlIllllI[17]] = lIIlllIIIII("NwwXNwI5BAIaH3hAOQ==", "Picvl");
      lIIIllIIlI[lIIlIllllI[19]] = lIIlllIIIII("Bg==", "goLMH");
      lIIIllIIlI[lIIlIllllI[20]] = lIIlllIIIII("FQ==", "vxZAs");
      lIIIllIIlI[lIIlIllllI[21]] = lIIlllIIIII("RsOB", "ffTCz");
      lIIIllIIlI[lIIlIllllI[22]] = lIIllIIlIIl("ELhJgNw1O/I=", "LLcWV");
      lIIIllIIlI[lIIlIllllI[23]] = lIIllIIlIIl("eKjlIDNAsbo=", "JeGwt");
      lIIIllIIlI[lIIlIllllI[25]] = lIIlllIIIII("DRMEMDUiFRo=", "CriUA");
      lIIIllIIlI[lIIlIllllI[26]] = lIIllIIlIIl("Z/qKKLHrN3Lmsm7091Aq2iG63mq7wD5K8UgFONm+dLPhm7RTtcQ4Vg==", "htvEZ");
      lIIIllIIlI[lIIlIllllI[28]] = lIIlllIIlII("1zQPXjvcd0o=", "MUVuK");
      lIIIllIIlI[lIIlIllllI[29]] = lIIlllIIlII("3G7iD1fgRzw=", "wSarG");
      lIIIllIIlI[lIIlIllllI[30]] = lIIllIIlIIl("1TfoZh+vep8=", "kmtEw");
      lIIIllIIlI[lIIlIllllI[31]] = lIIlllIIIII("OQ83GTI=", "jlVuW");
      lIIIllIIlI[lIIlIllllI[32]] = lIIlllIIIII("HhA1RBM8HiA=", "SqMdI");
      lIIIllIIlI[lIIlIllllI[33]] = lIIllIIlIIl("Izu+Gqp5BuY=", "SyOrO");
      lIIIllIIlI[lIIlIllllI[34]] = lIIlllIIIII("HBgCAwQ+Bw==", "Ltcza");
      lIIIllIIlI[lIIlIllllI[35]] = lIIllIIlIIl("t1xed/3Crt4=", "uZprl");
      lIIIllIIlI[lIIlIllllI[36]] = lIIlllIIIII("MS8rLg4cMg==", "pABCo");
   }

   public Ẅ() {
      super(lIIIllIIlI[lIIlIllllI[25]], lIIIllIIlI[lIIlIllllI[26]], ı５.〥ҳⱆ, lIIlIllllI[1], (boolean)lIIlIllllI[1], (boolean)lIIlIllllI[1], lIIlIllllI[27], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIIllIIlI[lIIlIllllI[28]], 1000.0D).u((Object)0.0D).ᴃᎲ((Object)1000.0D);
      this.u = this.ⲋ(lIIIllIIlI[lIIlIllllI[29]], Color.black);
      this.ᴃᎲ = this.ⲋ(lIIIllIIlI[lIIlIllllI[30]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.〥ҳⱆ = this.ⲋ(lIIIllIIlI[lIIlIllllI[31]], 2.5D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      this.Ἒⅾ = this.ⲋ(lIIIllIIlI[lIIlIllllI[32]], 1.5D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      this.ϛⰄ = this.ⲋ(lIIIllIIlI[lIIlIllllI[33]], Boolean.valueOf((boolean)lIIlIllllI[2]));
      this.ς = this.ⲋ(lIIIllIIlI[lIIlIllllI[34]], Boolean.valueOf((boolean)lIIlIllllI[2]));
      this.Ꜥ = this.ⲋ(lIIIllIIlI[lIIlIllllI[35]], Boolean.valueOf((boolean)lIIlIllllI[1]));
      this.ⲡ = this.ⲋ(lIIIllIIlI[lIIlIllllI[36]], Boolean.valueOf((boolean)lIIlIllllI[1]));
   }

   private static boolean lIlIIlIllll(Object var0) {
      return var0 != null;
   }

   private static String lIIllIIlIIl(String lIIllllIIlIIlll, String lIIllllIIlIIllI) {
      try {
         SecretKeySpec lIIllllIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIIllllIIlIlIIl = Cipher.getInstance("Blowfish");
         lIIllllIIlIlIIl.init(lIIlIllllI[3], lIIllllIIlIlIlI);
         return new String(lIIllllIIlIlIIl.doFinal(Base64.getDecoder().decode(lIIllllIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIllllllIl() {
      lIIlIllllI = new int[38];
      lIIlIllllI[0] = 40 + 107 - 113 + 98 ^ 86 + 50 - 109 + 114;
      lIIlIllllI[1] = (45 ^ 76 ^ 141 ^ 167) & (99 ^ 92 ^ 106 ^ 30 ^ -" ".length());
      lIIlIllllI[2] = " ".length();
      lIIlIllllI[3] = "  ".length();
      lIIlIllllI[4] = "   ".length();
      lIIlIllllI[5] = 99 ^ 103;
      lIIlIllllI[6] = 15 + 9 - -107 + 43 ^ 126 + 72 - 50 + 23;
      lIIlIllllI[7] = 108 ^ 106;
      lIIlIllllI[8] = 25 + 127 - 63 + 71 ^ 105 + 30 - 22 + 54;
      lIIlIllllI[9] = 26 ^ 18;
      lIIlIllllI[10] = 91 ^ 81;
      lIIlIllllI[11] = 109 ^ 102;
      lIIlIllllI[12] = 74 ^ 70;
      lIIlIllllI[13] = 204 ^ 193;
      lIIlIllllI[14] = 115 + 89 - 47 + 20 ^ 163 + 31 - 176 + 173;
      lIIlIllllI[15] = 58 + 106 - 73 + 73 ^ 113 + 71 - 172 + 159;
      lIIlIllllI[16] = 22 ^ 126 ^ 87 ^ 47;
      lIIlIllllI[17] = 112 ^ 97;
      lIIlIllllI[18] = -" ".length();
      lIIlIllllI[19] = " ".length() ^ 64 ^ 83;
      lIIlIllllI[20] = 139 ^ 140 ^ 52 ^ 32;
      lIIlIllllI[21] = "   ".length() ^ 51 ^ 36;
      lIIlIllllI[22] = 25 + 28 - -11 + 113 ^ 102 + 128 - 121 + 55;
      lIIlIllllI[23] = 147 ^ 133;
      lIIlIllllI[24] = -(-19801 & 28511) & -4105 & 16367;
      lIIlIllllI[25] = 219 ^ 190 ^ 49 ^ 67;
      lIIlIllllI[26] = 132 ^ 156;
      lIIlIllllI[27] = 139 ^ 179;
      lIIlIllllI[28] = 162 ^ 187;
      lIIlIllllI[29] = 140 ^ 150;
      lIIlIllllI[30] = 87 ^ 6 ^ 38 ^ 108;
      lIIlIllllI[31] = 77 + 8 - 46 + 97 ^ 14 + 54 - 13 + 93;
      lIIlIllllI[32] = 53 ^ 40;
      lIIlIllllI[33] = 72 + 15 - 79 + 154 ^ 46 + 72 - -8 + 62;
      lIIlIllllI[34] = 77 ^ 82;
      lIIlIllllI[35] = 190 ^ 158;
      lIIlIllllI[36] = 227 ^ 194;
      lIIlIllllI[37] = 161 ^ 131;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final double ᴃᎲ() {
      return ((Number)this.〥ҳⱆ.ⲋ(this, ⲋ[lIIlIllllI[4]])).doubleValue();
   }

   private static boolean lIlIIIIIIIl(int var0) {
      return var0 <= 0;
   }

   private static int lIIlllllllI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIIllIIlI(int var0) {
      return var0 >= 0;
   }

   private static boolean lIlIIllIllI(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIIllllllIl();
      lIIlllllIlI();
      KProperty[] var10000 = new KProperty[lIIlIllllI[0]];
      var10000[lIIlIllllI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[1]], lIIIllIIlI[lIIlIllllI[2]]));
      var10000[lIIlIllllI[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[3]], lIIIllIIlI[lIIlIllllI[4]]));
      var10000[lIIlIllllI[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[5]], lIIIllIIlI[lIIlIllllI[6]]));
      var10000[lIIlIllllI[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[7]], lIIIllIIlI[lIIlIllllI[8]]));
      var10000[lIIlIllllI[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[9]], lIIIllIIlI[lIIlIllllI[0]]));
      var10000[lIIlIllllI[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[10]], lIIIllIIlI[lIIlIllllI[11]]));
      var10000[lIIlIllllI[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[12]], lIIIllIIlI[lIIlIllllI[13]]));
      var10000[lIIlIllllI[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[14]], lIIIllIIlI[lIIlIllllI[15]]));
      var10000[lIIlIllllI[9]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ẅ.class), lIIIllIIlI[lIIlIllllI[16]], lIIIllIIlI[lIIlIllllI[17]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "Ꜥ"
   )
   private final boolean Ꜥ() {
      return (Boolean)this.ⲡ.ⲋ(this, ⲋ[lIIlIllllI[9]]);
   }
}
