package a;

import kotlin.Metadata;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\t"},
   d2 = {"Lnet/minecraft/entity/Entity;", "p0", "", "p1", "Lnet/minecraft/util/math/Vec3d;", "ⲋ", "(Lnet/minecraft/entity/Entity;D)Lnet/minecraft/util/math/Vec3d;", "ĂƂ", "", "(Lnet/minecraft/entity/Entity;)Z"}
)
public final class Ṑ {
   private static void llIIlIllll() {
      llIIIIllI = new int[2];
      llIIIIllI[0] = (37 + 67 - -43 + 6 ^ 86 + 175 - 186 + 106) & (51 ^ 103 ^ 37 ^ 93 ^ -" ".length());
      llIIIIllI[1] = " ".length();
   }

   @NotNull
   public static final Vec3d ⲋ(@NotNull Entity var0, double var1) {
      return new Vec3d((var0.field_70165_t - var0.field_70142_S) * var1, (var0.field_70163_u - var0.field_70137_T) * var1, (var0.field_70161_v - var0.field_70136_U) * var1);
   }

   public static final boolean ⲋ(@NotNull Entity llIIlIIIllIlIlI) {
      if (llIIllIIII(llIIlIIIllIlIlI instanceof EntityWolf) && llIIllIIII(((EntityWolf)llIIlIIIllIlIlI).func_70919_bu())) {
         return (boolean)llIIIIllI[0];
      } else if (llIIllIIIl(llIIlIIIllIlIlI instanceof EntityAnimal) && llIIllIIIl(llIIlIIIllIlIlI instanceof EntityAgeable) && llIIllIIIl(llIIlIIIllIlIlI instanceof EntityTameable) && llIIllIIIl(llIIlIIIllIlIlI instanceof EntityAmbientCreature) && !llIIllIIII(llIIlIIIllIlIlI instanceof EntitySquid)) {
         return (boolean)(llIIllIIII(llIIlIIIllIlIlI instanceof EntityIronGolem) && llIIllIIll(((EntityIronGolem)llIIlIIIllIlIlI).func_70643_av()) ? llIIIIllI[1] : llIIIIllI[0]);
      } else {
         return (boolean)llIIIIllI[1];
      }
   }

   private static boolean llIIllIIIl(int var0) {
      return var0 == 0;
   }

   @NotNull
   public static final Vec3d ĂƂ(@NotNull Entity var0, double var1) {
      return (new Vec3d(var0.field_70142_S, var0.field_70137_T, var0.field_70136_U)).func_178787_e(ⲋ(var0, var1));
   }

   static {
      llIIlIllll();
   }

   private static boolean llIIllIIll(Object var0) {
      return var0 == null;
   }

   private static boolean llIIllIIII(int var0) {
      return var0 != 0;
   }
}
