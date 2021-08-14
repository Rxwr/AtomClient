package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020#B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u0004\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0004\u0010\u0010J\u0017\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0002\u0010\u0012JE\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0004\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\bJ\u0015\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0004\u0010 R\u001e\u0010\u0004\u001a\u0006*\u00020\u00010\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004"},
   d2 = {"La/šⱙ;", "Lnet/minecraft/client/Minecraft;", "ĂƂ", "Lnet/minecraft/client/Minecraft;", "ⲋ", "Lnet/minecraft/util/math/BlockPos;", "p0", "", "(Lnet/minecraft/util/math/BlockPos;)Z", "u", "Lnet/minecraft/util/math/Vec3d;", "", "(Lnet/minecraft/util/math/Vec3d;)V", "Lnet/minecraft/block/Block;", "〥ҳⱆ", "(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;", "()Lnet/minecraft/util/math/Vec3d;", "", "(Lnet/minecraft/util/math/Vec3d;)[F", "", "p1", "", "p2", "p3", "p4", "p5", "", "(Lnet/minecraft/util/math/BlockPos;FIZZI)Ljava/util/List;", "Lnet/minecraft/block/state/IBlockState;", "Ἒⅾ", "(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;", "ᴃᎲ", "(Lnet/minecraft/util/math/BlockPos;)V", "<init>", "()V", ""}
)
public final class šⱙ {
   private final IBlockState Ἒⅾ(BlockPos var1) {
      return ĂƂ.field_71441_e.func_180495_p(var1);
   }

   @NotNull
   public final List<BlockPos> ⲋ(@NotNull BlockPos var1, float lllIIllllllIlll, int lllIIllllllIllI, boolean lllIIllllllIlIl, boolean lllIIllllllIlII, int lllIIllllllIIll) {
      int lllIIllllllIIIl = lIIlllll[0];
      ArrayList lllIIllllllIIlI = new ArrayList();
      lllIIllllllIIIl = var1.func_177958_n();
      int lllIIllllllIIII = var1.func_177956_o();
      int lllIIlllllIllll = var1.func_177952_p();
      int lllIIlllllIlllI = lllIIllllllIIIl - (int)lllIIllllllIlll;

      do {
         if (!lIlIlllll(lIlIlllIl((float)lllIIlllllIlllI, (float)lllIIllllllIIIl + lllIIllllllIlll))) {
            return (List)lllIIllllllIIlI;
         }

         int lllIIlllllIllIl = lllIIlllllIllll - (int)lllIIllllllIlll;

         label63:
         while(lIlIlllll(lIlIlllIl((float)lllIIlllllIllIl, (float)lllIIlllllIllll + lllIIllllllIlll))) {
            int var10000;
            if (lIlIlllII(lllIIllllllIlII)) {
               var10000 = lllIIllllllIIII - (int)lllIIllllllIlll;
               "".length();
               if ("   ".length() < "  ".length()) {
                  return null;
               }
            } else {
               var10000 = lllIIllllllIIII;
            }

            int lllIIlllllIllII = var10000;

            do {
               int var10001;
               if (lIlIlllII(lllIIllllllIlII)) {
                  var10001 = lllIIllllllIIII + (int)lllIIllllllIlll;
                  "".length();
                  if (null != null) {
                     return null;
                  }
               } else {
                  var10001 = lllIIllllllIIII + lllIIllllllIllI;
               }

               if (!lIlIlIllI(lllIIlllllIllII, var10001)) {
                  ++lllIIlllllIllIl;
                  "".length();
                  if (((49 ^ 30) & ~(152 ^ 183)) < 0) {
                     return null;
                  }
                  continue label63;
               }

               double var17 = (double)((lllIIllllllIIIl - lllIIlllllIlllI) * (lllIIllllllIIIl - lllIIlllllIlllI) + (lllIIlllllIllll - lllIIlllllIllIl) * (lllIIlllllIllll - lllIIlllllIllIl));
               if (lIlIlllII(lllIIllllllIlII)) {
                  var10001 = (lllIIllllllIIII - lllIIlllllIllII) * (lllIIllllllIIII - lllIIlllllIllII);
                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return null;
                  }
               } else {
                  var10001 = lIIlllll[0];
               }

               char lllIIlllllIlIll = var17 + (double)var10001;
               if (lIllIIIII(lIlIllllI(lllIIlllllIlIll, (double)(lllIIllllllIlll * lllIIllllllIlll))) && (!lIlIlllII(lllIIllllllIlIl) || lIllIIIIl(lIlIllllI(lllIIlllllIlIll, (double)((lllIIllllllIlll - (float)lIIlllll[2]) * (lllIIllllllIlll - (float)lIIlllll[2])))))) {
                  Exception lllIIlllllIlIlI = new BlockPos(lllIIlllllIlllI, lllIIlllllIllII + lllIIllllllIIll, lllIIlllllIllIl);
                  lllIIllllllIIlI.add(lllIIlllllIlIlI);
                  "".length();
               }

               ++lllIIlllllIllII;
               "".length();
            } while(null == null);

            return null;
         }

         ++lllIIlllllIlllI;
         "".length();
      } while(-"   ".length() < 0);

      return null;
   }

   public final void ⲋ(@NotNull BlockPos lllIlIIIIllIIII) {
      Vec3d lllIlIIIIlIllll = new Vec3d(ĂƂ.field_71439_g.field_70165_t, ĂƂ.field_71439_g.field_70163_u + (double)ĂƂ.field_71439_g.func_70047_e(), ĂƂ.field_71439_g.field_70161_v);
      EnumFacing[] lllIlIIIIlIllII = EnumFacing.values();
      int lllIlIIIIlIlIll = lllIlIIIIlIllII.length;
      int lllIlIIIIlIllIl = lIIlllll[0];

      do {
         if (!lIlIlIllI(lllIlIIIIlIllIl, lllIlIIIIlIlIll)) {
            return;
         }

         long lllIlIIIIlIlllI = lllIlIIIIlIllII[lllIlIIIIlIllIl];
         short lllIlIIIIlIlIlI = lllIlIIIIllIIII.func_177972_a(lllIlIIIIlIlllI);
         byte lllIlIIIIlIlIIl = lllIlIIIIlIlllI.func_176734_d();
         if (lIlIllIII(lllIlIIIIllIIIl.ĂƂ(lllIlIIIIlIlIlI))) {
            "".length();
            if ("   ".length() < " ".length()) {
               return;
            }
         } else {
            short lllIlIIIIlIlIII = (new Vec3d((Vec3i)lllIlIIIIlIlIlI)).func_178787_e(new Vec3d(0.5D, 0.5D, 0.5D)).func_178787_e((new Vec3d(lllIlIIIIlIlIIl.func_176730_m())).func_186678_a(0.5D));
            if (!lIlIllIlI(lIlIlIlII(lllIlIIIIlIllll.func_72436_e(lllIlIIIIlIlIII), 18.0625D))) {
               lllIlIIIIllIIIl.ⲋ(lllIlIIIIlIlIII);
               ĂƂ.field_71442_b.func_187099_a(ĂƂ.field_71439_g, ĂƂ.field_71441_e, lllIlIIIIlIlIlI, lllIlIIIIlIlIIl, lllIlIIIIlIlIII, EnumHand.MAIN_HAND);
               "".length();
               ĂƂ.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
               ĂƂ.field_71467_ac = lIIlllll[1];
               return;
            }

            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         }

         ++lllIlIIIIlIllIl;
         "".length();
      } while(" ".length() >= 0);

   }

   private static boolean lIlIllIII(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIllIll(Object var0) {
      return var0 == null;
   }

   public final void ⲋ(@Nullable Vec3d var1) {
      if (lIlIllIll(var1)) {
         Intrinsics.throwNpe();
      }

      float[] var2 = this.ĂƂ(var1);
      ĂƂ.field_71439_g.field_71174_a.func_147297_a((Packet)(new Rotation(var2[lIIlllll[0]], var2[lIIlllll[2]], ĂƂ.field_71439_g.field_70122_E)));
   }

   public final boolean ĂƂ(@NotNull BlockPos var1) {
      return this.〥ҳⱆ(var1).func_176209_a(this.Ἒⅾ(var1), (boolean)lIIlllll[0]);
   }

   private static boolean lIllIIIIl(int var0) {
      return var0 >= 0;
   }

   private static int lIlIlllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIlIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIlIlIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public final boolean ᴃᎲ(@NotNull BlockPos lllIlIIIIIIllIl) {
      EnumFacing[] lllIlIIIIIIlIlI = EnumFacing.values();
      int lllIlIIIIIIlIIl = lllIlIIIIIIlIlI.length;
      int lllIlIIIIIIlIll = lIIlllll[0];

      do {
         if (!lIlIlIllI(lllIlIIIIIIlIll, lllIlIIIIIIlIIl)) {
            return (boolean)lIIlllll[0];
         }

         double lllIlIIIIIIllII = lllIlIIIIIIlIlI[lllIlIIIIIIlIll];
         double lllIlIIIIIIlIII = lllIlIIIIIIllIl.func_177972_a(lllIlIIIIIIllII);
         if (lIlIllIII(Minecraft.func_71410_x().field_71441_e.func_180495_p(lllIlIIIIIIlIII).func_185904_a().func_76222_j())) {
            return (boolean)lIIlllll[2];
         }

         ++lllIlIIIIIIlIll;
         "".length();
      } while(null == null);

      return (boolean)((28 ^ 84 ^ 5 ^ 67) & (38 + 59 - -37 + 46 ^ 143 + 106 - 248 + 185 ^ -" ".length()));
   }

   public final boolean u(@NotNull BlockPos lllIlIIIIIllIIl) {
      if (lIlIllIII(lllIlIIIIIllIlI.ᴃᎲ(lllIlIIIIIllIIl))) {
         EnumFacing[] lllIlIIIIIlIllI = EnumFacing.values();
         int lllIlIIIIIlIlIl = lllIlIIIIIlIllI.length;
         int lllIlIIIIIlIlll = lIIlllll[0];

         do {
            if (!lIlIlIllI(lllIlIIIIIlIlll, lllIlIIIIIlIlIl)) {
               return (boolean)lIIlllll[0];
            }

            Exception lllIlIIIIIllIII = lllIlIIIIIlIllI[lllIlIIIIIlIlll];
            float lllIlIIIIIlIlII = lllIlIIIIIllIIl.func_177972_a(lllIlIIIIIllIII);
            if (lIlIlllII(lllIlIIIIIllIlI.ᴃᎲ(lllIlIIIIIlIlII))) {
               return (boolean)lIIlllll[2];
            }

            ++lllIlIIIIIlIlll;
            "".length();
         } while((163 ^ 184 ^ 15 ^ 16) > "   ".length());

         return (boolean)((140 ^ 153 ^ 0 ^ 78) & (29 + 196 - 2 + 8 ^ 55 + 159 - 32 + 6 ^ -" ".length()));
      } else {
         return (boolean)lIIlllll[2];
      }
   }

   private static int lIlIllllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private šⱙ() {
   }

   private static boolean lIlIllIlI(int var0) {
      return var0 > 0;
   }

   private static void lIlIlIIll() {
      lIIlllll = new int[4];
      lIIlllll[0] = (2 ^ 48) & ~(190 ^ 140);
      lIIlllll[1] = 44 + 75 - 51 + 123 ^ 13 + 176 - 142 + 140;
      lIIlllll[2] = " ".length();
      lIIlllll[3] = "  ".length();
   }

   private static boolean lIlIlllll(int var0) {
      return var0 <= 0;
   }

   private final Vec3d ⲋ() {
      return new Vec3d(ĂƂ.field_71439_g.field_70165_t, ĂƂ.field_71439_g.field_70163_u + (double)ĂƂ.field_71439_g.func_70047_e(), ĂƂ.field_71439_g.field_70161_v);
   }

   private final Block 〥ҳⱆ(BlockPos var1) {
      return this.Ἒⅾ(var1).func_177230_c();
   }

   private static boolean lIlIlllII(int var0) {
      return var0 != 0;
   }

   @NotNull
   public final float[] ĂƂ(@NotNull Vec3d var1) {
      Vec3d var2 = this.ⲋ();
      double var3 = var1.field_72450_a - var2.field_72450_a;
      double var5 = var1.field_72448_b - var2.field_72448_b;
      double var7 = var1.field_72449_c - var2.field_72449_c;
      double var11 = var3 * var3 + var7 * var7;
      int var13 = lIIlllll[0];
      double var9 = Math.sqrt(var11);
      int var12 = lIIlllll[0];
      float var14 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      var13 = lIIlllll[0];
      float var15 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      float[] var10000 = new float[lIIlllll[3]];
      var10000[lIIlllll[0]] = ĂƂ.field_71439_g.field_70177_z + MathHelper.func_76142_g(var14 - ĂƂ.field_71439_g.field_70177_z);
      var10000[lIIlllll[2]] = ĂƂ.field_71439_g.field_70125_A + MathHelper.func_76142_g(var15 - ĂƂ.field_71439_g.field_70125_A);
      return var10000;
   }

   static {
      lIlIlIIll();
      šⱙ var0 = new šⱙ();
      ⲋ = var0;
      ĂƂ = Minecraft.func_71410_x();
   }

   private static boolean lIllIIIII(int var0) {
      return var0 < 0;
   }
}
