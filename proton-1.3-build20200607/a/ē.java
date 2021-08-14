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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.potion.Potion;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020F:\u0003\u0006\t\rB\u0007¢\u0006\u0004\bE\u0010@J/\u0010\u0006\u001a\u0002022\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b\u0006\u00103J\u001d\u0010\u0006\u001a\u0002022\u0006\u0010-\u001a\u0002042\u0006\u0010.\u001a\u000200¢\u0006\u0004\b\u0006\u00105J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b\t\u00106J)\u0010\u0006\u001a\u0002022\u0006\u0010-\u001a\u0002072\u0006\u0010.\u001a\u0002022\b\u0010/\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b\u0006\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020#0:H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010\u0006\u001a\u0002022\u0006\u0010-\u001a\u000202H\u0002¢\u0006\u0004\b\u0006\u0010=J\u000f\u0010?\u001a\u00020>H\u0014¢\u0006\u0004\b?\u0010@J\u0017\u0010\u0006\u001a\u00020>2\u0006\u0010-\u001a\u00020AH\u0007¢\u0006\u0004\b\u0006\u0010BJ\u000f\u0010C\u001a\u00020>H\u0016¢\u0006\u0004\bC\u0010@J\u000f\u0010D\u001a\u00020>H\u0016¢\u0006\u0004\bD\u0010@R&\u0010\u0006\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR\"\u0010\t\u001a\u00020\b8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0086\u0084\u0002R\"\u0010\r\u001a\u00020\f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\u000e¨\u0006\u0086\u0084\u0002R\"\u0010\u0013\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0086\u0084\u0002R\"\u0010\u0016\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0086\u0084\u0002R&\u0010\u0011\u001a\u0006*\u00020\u00170\u00178G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u0086\u0084\u0002R\"\u0010\u0010\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u0086\u0084\u0002R\"\u0010\u001f\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u0086\u0084\u0002R\"\u0010 \u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b \u0010\u0012¨\u0006\u0086\u0084\u0002R\"\u0010\u001e\u001a\u00020\b8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0086\u0084\u0002R\"\u0010\u001d\u001a\u00020\f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0086\u0084\u0002R\"\u0010\u001b\u001a\u00020!8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0016\u0010\"¨\u0006\u0086\u0084\u0002R(\u0010)\u001a\u0004\u0018\u00010#8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\u0006\u0010(¨\u0006\u0086\u000eR\"\u0010\u0018\u001a\u00020*8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b+\u0010,¨\u0006\u0086\u0084\u0002R\"\u0010\u0014\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0086\u0084\u0002R\"\u0010$\u001a\u00020\u000f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001f\u0010\u0012¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/ē;", "La/ē$ⲋ;", "Ⳓ", "La/ē$ⲋ;", "ꝱᶁ", "()La/ē$ⲋ;", "ⲋ", "(La/ē$ⲋ;)V", "", "ĂƂ", "La/ⅹ;", "()Z", "", "u", "()I", "", "ϛⰄ", "Ἒⅾ", "()D", "ᴃᎲ", "ⴜ", "Ⱬ", "〥ҳⱆ", "Ljava/awt/Color;", "ɡ", "Ӄ", "()Ljava/awt/Color;", "ᵴἥ", "ⱛṧ", "Đ", "ⲡ", "ς", "Ꜥ", "La/ē$ĂƂ;", "()La/ē$ĂƂ;", "Lnet/minecraft/util/math/BlockPos;", "ͷ", "Lnet/minecraft/util/math/BlockPos;", "Ἒ", "()Lnet/minecraft/util/math/BlockPos;", "(Lnet/minecraft/util/math/BlockPos;)V", "Ɏ", "La/ē$u;", "ᶐ", "()La/ē$u;", "p0", "p1", "p2", "Lnet/minecraft/entity/Entity;", "p3", "", "(DDDLnet/minecraft/entity/Entity;)F", "Lnet/minecraft/entity/item/EntityEnderCrystal;", "(Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/entity/Entity;)F", "(Lnet/minecraft/util/math/BlockPos;)Z", "Lnet/minecraft/entity/EntityLivingBase;", "Lnet/minecraft/world/Explosion;", "(Lnet/minecraft/entity/EntityLivingBase;FLnet/minecraft/world/Explosion;)F", "", "Ꮐ꯴", "()Ljava/util/List;", "(F)F", "", "ʅ", "()V", "La/ꝱᶁ;", "(La/ꝱᶁ;)V", "Ἠ", "ἶṗ", "<init>", "La/ⳅ;"}
)
public final class ē extends ⳅ {
   @JvmName(
      name = "ꝱᶁ"
   )
   public final ē.ⲋ ꝱᶁ() {
      return this.Ⳓ;
   }

   private static boolean lIllIIIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private final boolean ĂƂ(BlockPos var1) {
      BlockPos llIIlllIlIllIlI = var1.func_177982_a(lIlIIIIlI[1], lIlIIIIlI[2], lIlIIIIlI[1]);
      BlockPos llIIlllIlIllIIl = var1.func_177982_a(lIlIIIIlI[1], lIlIIIIlI[3], lIlIIIIlI[1]);
      int var10000;
      if ((!lIlIllllll(llIIlllIlIlllII.ɡ().field_71441_e.func_180495_p(var1).func_177230_c(), Blocks.field_150357_h) || lIlIllllIl(llIIlllIlIlllII.ɡ().field_71441_e.func_180495_p(var1).func_177230_c(), Blocks.field_150343_Z)) && lIlIllllIl(llIIlllIlIlllII.ɡ().field_71441_e.func_180495_p(llIIlllIlIllIlI).func_177230_c(), Blocks.field_150350_a) && lIlIllllIl(llIIlllIlIlllII.ɡ().field_71441_e.func_180495_p(llIIlllIlIllIIl).func_177230_c(), Blocks.field_150350_a) && lIlIllIIll(llIIlllIlIlllII.ɡ().field_71441_e.func_72872_a(Entity.class, new AxisAlignedBB(llIIlllIlIllIlI)).isEmpty()) && lIlIllIIll(llIIlllIlIlllII.ɡ().field_71441_e.func_72872_a(Entity.class, new AxisAlignedBB(llIIlllIlIllIIl)).isEmpty())) {
         var10000 = lIlIIIIlI[2];
         "".length();
         if (" ".length() <= 0) {
            return (boolean)((37 ^ 98 ^ 25 ^ 73) & (95 + 121 - 207 + 143 ^ 49 + 26 - 44 + 112 ^ -" ".length()));
         }
      } else {
         var10000 = lIlIIIIlI[1];
      }

      return (boolean)var10000;
   }

   private final float ⲋ(float var1) {
      int llIIlllIIlIlIll = this.ɡ().field_71441_e.func_175659_aa().func_151525_a();
      float var10001;
      if (lIlIllIlII(llIIlllIIlIlIll)) {
         var10001 = 0.0F;
         "".length();
         if ("  ".length() == 0) {
            return 0.0F;
         }
      } else if (lIllIIIIll(llIIlllIIlIlIll, lIlIIIIlI[3])) {
         var10001 = 1.0F;
         "".length();
         if (null != null) {
            return 0.0F;
         }
      } else if (lIllIIIIll(llIIlllIIlIlIll, lIlIIIIlI[2])) {
         var10001 = 0.5F;
         "".length();
         if (null != null) {
            return 0.0F;
         }
      } else {
         var10001 = 1.5F;
      }

      return var1 * var10001;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable BlockPos var1) {
      this.ͷ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ē.ⲋ var1) {
      this.Ⳓ = var1;
   }

   private static boolean lIlIllllIl(Object var0, Object var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final double Ꜥ() {
      return ((Number)this.ⲡ.ⲋ(this, ⲋ[lIlIIIIlI[9]])).doubleValue();
   }

   public void Ἠ() {
      // $FF: Couldn't be decompiled
   }

   private final List<BlockPos> Ꮐ꯴() {
      List var1 = šⱙ.ⲋ.ⲋ(this.ɡ().field_71439_g.func_180425_c(), (float)this.ϛⰄ(), (int)this.ϛⰄ(), (boolean)lIlIIIIlI[1], (boolean)lIlIIIIlI[2], lIlIIIIlI[1]);
      Iterable var2 = (Iterable)var1;
      ē llIIlllIllIlIIl = this;
      int var4 = lIlIIIIlI[1];
      Collection llIIlllIllIIllI = (Collection)(new ArrayList());
      int var7 = lIlIIIIlI[1];
      Iterator llIIlllIllIIlII = var2.iterator();

      while(lIlIllIIll(llIIlllIllIIlII.hasNext())) {
         Exception llIIlllIllIIIll = llIIlllIllIIlII.next();
         Exception llIIlllIllIIIlI = (BlockPos)llIIlllIllIIIll;
         char llIIlllIllIIIIl = lIlIIIIlI[1];
         if (lIlIllIIll(((ē)llIIlllIllIlIIl).ĂƂ(llIIlllIllIIIlI))) {
            llIIlllIllIIllI.add(llIIlllIllIIIll);
            "".length();
            "".length();
            if (-" ".length() < -" ".length()) {
               return null;
            }
         }
      }

      return (List)llIIlllIllIIllI;
   }

   @JvmName(
      name = "Ӄ"
   )
   public final Color Ӄ() {
      return (Color)this.ɡ.ⲋ(this, ⲋ[lIlIIIIlI[13]]);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final int ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[lIlIIIIlI[2]])).intValue();
   }

   private static boolean lIlIlllIII(int var0) {
      return var0 < 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final boolean ⲋ() {
      return (Boolean)this.ĂƂ.ⲋ(this, ⲋ[lIlIIIIlI[1]]);
   }

   protected void ʅ() {
      super.ʅ();
      ơ߀ var1 = ơ߀.ⲋ;
      Class var2 = ȴ.class;
      int var3 = lIlIIIIlI[1];
      Object var10000 = var1.ⲋ().get(ȴ.class);
      if (lIlIlIlllI(var10000)) {
         throw new TypeCastException(lIIIIIllI[lIlIIIIlI[28]]);
      } else {
         ((ȴ)((ⳅ)((ȴ)var10000))).ꙑứ();
      }
   }

   private final float ⲋ(double var1, double var3, double var5, Entity var7) {
      float var8 = 12.0F;
      double var9 = var7.func_70011_f(var1, var3, var5) / (double)var8;
      Vec3d var11 = new Vec3d(var1, var3, var5);
      double var12 = (double)var7.field_70170_p.func_72842_a(var11, var7.func_174813_aQ());
      double var14 = (1.0D - var9) * var12;
      float var16 = (float)((int)((var14 * var14 + var14) / 2.0D * 7.0D * (double)var8 + 1.0D));
      double var17 = 1.0D;
      if (lIlIllIIll(var7 instanceof EntityLivingBase)) {
         var17 = (double)this.ⲋ((EntityLivingBase)var7, this.ⲋ(var16), new Explosion((World)this.ɡ().field_71441_e, (Entity)null, var1, var3, var5, 6.0F, (boolean)lIlIIIIlI[1], (boolean)lIlIIIIlI[2]));
      }

      return (float)var17;
   }

   @JvmName(
      name = "ⱛṧ"
   )
   public final double ⱛṧ() {
      return ((Number)this.ᵴἥ.ⲋ(this, ⲋ[lIlIIIIlI[11]])).doubleValue();
   }

   private static String lIIIllllII(String llIIlllIIIlIIll, String llIIlllIIIlIIlI) {
      llIIlllIIIlIIll = new String(Base64.getDecoder().decode(llIIlllIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      short llIIlllIIIIllII = new StringBuilder();
      String llIIlllIIIIlIll = llIIlllIIIlIIlI.toCharArray();
      short llIIlllIIIIlIlI = lIlIIIIlI[1];
      int llIIlllIIIIlIIl = llIIlllIIIlIIll.toCharArray();
      byte llIIlllIIIIlIII = llIIlllIIIIlIIl.length;
      int llIIlllIIIIIlll = lIlIIIIlI[1];

      do {
         if (!lIllIIIlIl(llIIlllIIIIIlll, llIIlllIIIIlIII)) {
            return String.valueOf(llIIlllIIIIllII);
         }

         char llIIlllIIIlIlII = llIIlllIIIIlIIl[llIIlllIIIIIlll];
         llIIlllIIIIllII.append((char)(llIIlllIIIlIlII ^ llIIlllIIIIlIll[llIIlllIIIIlIlI % llIIlllIIIIlIll.length]));
         "".length();
         ++llIIlllIIIIlIlI;
         ++llIIlllIIIIIlll;
         "".length();
      } while(" ".length() != 0);

      return null;
   }

   private static int lIlIlIllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public ē() {
      super(lIIIIIllI[lIlIIIIlI[32]], lIIIIIllI[lIlIIIIlI[33]], ı５.ⲋ, lIlIIIIlI[1], (boolean)lIlIIIIlI[1], (boolean)lIlIIIIlI[1], lIlIIIIlI[34], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIIIIllI[lIlIIIIlI[35]], Boolean.valueOf((boolean)lIlIIIIlI[2]));
      this.u = this.ⲋ(lIIIIIllI[lIlIIIIlI[36]], lIlIIIIlI[2]).u((Object)lIlIIIIlI[1]).ᴃᎲ((Object)lIlIIIIlI[20]);
      this.ᴃᎲ = this.ⲋ(lIIIIIllI[lIlIIIIlI[37]], Boolean.valueOf((boolean)lIlIIIIlI[2]));
      this.〥ҳⱆ = this.ⲋ(lIIIIIllI[lIlIIIIlI[38]], lIlIIIIlI[2]).u((Object)lIlIIIIlI[1]).ᴃᎲ((Object)lIlIIIIlI[20]);
      this.Ἒⅾ = this.ⲋ(lIIIIIllI[lIlIIIIlI[39]], ē.ĂƂ.ⲋ);
      this.ϛⰄ = this.ⲋ(lIIIIIllI[lIlIIIIlI[40]], 5.0D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      this.ς = this.ⲋ(lIIIIIllI[lIlIIIIlI[41]], 5.0D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      this.Ꜥ = this.ⲋ(lIIIIIllI[lIlIIIIlI[42]], 3.0D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      this.ⲡ = this.ⲋ(lIIIIIllI[lIlIIIIlI[43]], 5.0D).u((Object)0.0D).ᴃᎲ((Object)20.0D);
      this.Đ = this.ⲋ(lIIIIIllI[lIlIIIIlI[44]], 5.0D).u((Object)0.0D).ᴃᎲ((Object)36.0D);
      this.ᵴἥ = this.ⲋ(lIIIIIllI[lIlIIIIlI[45]], 5.0D).u((Object)0.0D).ᴃᎲ((Object)36.0D).u(lIIIIIllI[lIlIIIIlI[46]]);
      this.Ɏ = this.ⲋ(lIIIIIllI[lIlIIIIlI[47]], ē.u.ĂƂ);
      this.ɡ = this.ⲋ(lIIIIIllI[lIlIIIIlI[48]], Color.red);
      this.ⴜ = this.ⲋ(lIIIIIllI[lIlIIIIlI[49]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.Ⳓ = ē.ⲋ.ⲋ;
   }

   private static void lIlIlIllIl() {
      lIlIIIIlI = new int[51];
      lIlIIIIlI[0] = 107 ^ 101;
      lIlIIIIlI[1] = (0 ^ 97) & ~(89 ^ 56);
      lIlIIIIlI[2] = " ".length();
      lIlIIIIlI[3] = "  ".length();
      lIlIIIIlI[4] = "   ".length();
      lIlIIIIlI[5] = 105 ^ 34 ^ 60 ^ 115;
      lIlIIIIlI[6] = 105 + 49 - 83 + 95 ^ 142 + 71 - 181 + 131;
      lIlIIIIlI[7] = 69 ^ 67;
      lIlIIIIlI[8] = 199 ^ 192;
      lIlIIIIlI[9] = 57 ^ 49;
      lIlIIIIlI[10] = 185 ^ 176;
      lIlIIIIlI[11] = 205 ^ 199;
      lIlIIIIlI[12] = 188 ^ 183;
      lIlIIIIlI[13] = 57 ^ 53;
      lIlIIIIlI[14] = 37 ^ 40;
      lIlIIIIlI[15] = 22 ^ 24 ^ " ".length();
      lIlIIIIlI[16] = 100 ^ 116;
      lIlIIIIlI[17] = 130 ^ 147;
      lIlIIIIlI[18] = 75 + 68 - 83 + 118 ^ 9 + 106 - 41 + 86;
      lIlIIIIlI[19] = 146 ^ 176 ^ 75 ^ 122;
      lIlIIIIlI[20] = 4 + 129 - 0 + 14 ^ 48 + 95 - 58 + 50;
      lIlIIIIlI[21] = 137 + 88 - 176 + 166 ^ 169 + 186 - 284 + 123;
      lIlIIIIlI[22] = 76 ^ 90;
      lIlIIIIlI[23] = 138 + 25 - 100 + 91 ^ 122 + 54 - 86 + 51;
      lIlIIIIlI[24] = 82 ^ 74;
      lIlIIIIlI[25] = 184 ^ 161;
      lIlIIIIlI[26] = 112 + 53 - 161 + 138 ^ 90 + 125 - 88 + 21;
      lIlIIIIlI[27] = 49 ^ 42;
      lIlIIIIlI[28] = 48 ^ 44;
      lIlIIIIlI[29] = 102 ^ 123;
      lIlIIIIlI[30] = (184 ^ 162) + (38 ^ 57) - (138 ^ 148) + 10 + 124 - 26 + 34;
      lIlIIIIlI[31] = " ".length() ^ 187 ^ 133;
      lIlIIIIlI[32] = 148 ^ 138;
      lIlIIIIlI[33] = 35 ^ 58 ^ 168 ^ 174;
      lIlIIIIlI[34] = 2 + 8 - -119 + 31 ^ 56 + 140 - 186 + 142;
      lIlIIIIlI[35] = 91 ^ 123;
      lIlIIIIlI[36] = 156 ^ 189;
      lIlIIIIlI[37] = 229 ^ 199;
      lIlIIIIlI[38] = 159 ^ 188;
      lIlIIIIlI[39] = 175 ^ 139;
      lIlIIIIlI[40] = 132 ^ 156 ^ 109 ^ 80;
      lIlIIIIlI[41] = 186 ^ 142 ^ 213 ^ 199;
      lIlIIIIlI[42] = 83 ^ 116;
      lIlIIIIlI[43] = 105 ^ 65;
      lIlIIIIlI[44] = 159 ^ 182;
      lIlIIIIlI[45] = 85 ^ 127;
      lIlIIIIlI[46] = 12 ^ 39;
      lIlIIIIlI[47] = 114 + 120 - 78 + 15 ^ 63 + 111 - 117 + 78;
      lIlIIIIlI[48] = 119 ^ 16 ^ 86 ^ 28;
      lIlIIIIlI[49] = 18 ^ 37 ^ 88 ^ 65;
      lIlIIIIlI[50] = 106 ^ 69;
   }

   private static int lIlIlllllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final int ᴃᎲ() {
      return ((Number)this.〥ҳⱆ.ⲋ(this, ⲋ[lIlIIIIlI[4]])).intValue();
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final ē.ĂƂ 〥ҳⱆ() {
      return (ē.ĂƂ)this.Ἒⅾ.ⲋ(this, ⲋ[lIlIIIIlI[5]]);
   }

   private static boolean lIlIllIlII(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "ς"
   )
   public final double ς() {
      return ((Number)this.Ꜥ.ⲋ(this, ⲋ[lIlIIIIlI[8]])).doubleValue();
   }

   private static void lIlIIIlIIl() {
      lIIIIIllI = new String[lIlIIIIlI[50]];
      lIIIIIllI[lIlIIIIlI[1]] = lIIIlllIII("iwhvIN87WSI=", "qDRhU");
      lIIIIIllI[lIlIIIIlI[2]] = lIIIlllIII("I3Na19vLH+vQRlFSLK3hag==", "Drztv");
      lIIIIIllI[lIlIIIIlI[3]] = lIIIlllIII("pT2E6tcqfh5AxS+Klu5l0Q==", "zmWhl");
      lIIIIIllI[lIlIIIIlI[4]] = lIIIllllII("MiMyMTslKikQJhEjKhU6fW8P", "UFFtC");
      lIIIIIllI[lIlIIIIlI[5]] = lIIIllllIl("/5NfaYHy7K0=", "ucciG");
      lIIIIIllI[lIlIIIIlI[6]] = lIIIllllIl("6tUWn+RExpBvtjejfbE5TA==", "xEDnA");
      lIIIIIllI[lIlIIIIlI[7]] = lIIIlllIII("A+jWQOtuIcOXzTOme0Gz2Q==", "fchJL");
      lIIIIIllI[lIlIIIIlI[8]] = lIIIlllIII("URv03oH4S9qXiNwcuaFuiWn++4S8+tHU", "EJQtE");
      lIIIIIllI[lIlIIIIlI[9]] = lIIIllllII("NS4TAgsILRYE", "EBran");
      lIIIIIllI[lIlIIIIlI[10]] = lIIIllllII("HjcePx4YMQ8iHR03QkY+FDdFAQcaPg8aAVYiGAAGFjxFAh0dJwYKAVYxBQIQGCZFLgcNPSkdCwomCwNWKT4LDBc0PQ4KSQ==", "yRjor");
      lIIIIIllI[lIlIIIIlI[11]] = lIIIllllIl("vLkY8bKtIwUEP/noiynQBg==", "PTegA");
      lIIIIIllI[lIlIIIIlI[12]] = lIIIllllIl("/npCvQDhJAeicWANvj+xiTN1qOxWnJgR", "KusvH");
      lIIIIIllI[lIlIIIIlI[13]] = lIIIlllIII("nTBBVWjcjjV3IchEjEEljg==", "ftQsz");
      lIIIIIllI[lIlIIIIlI[14]] = lIIIlllIII("ZMX+0o98xruY3M2xht7IFX0eX1rbg/0U", "xlDnm");
      lIIIIIllI[lIlIIIIlI[0]] = lIIIllllII("IDMtBgAFMy8NFg==", "WRAjs");
      lIIIIIllI[lIlIIIIlI[15]] = lIIIllllIl("gBbdVg+oksXX9KJx90a0OHAevQIs426e", "nFYIm");
      lIIIIIllI[lIlIIIIlI[16]] = lIIIllllIl("qCGRFwcqKtY=", "OxDUi");
      lIIIIIllI[lIlIIIIlI[17]] = lIIIllllII("Mw0OBzg6LBcteX0s", "ThzJQ");
      lIIIIIllI[lIlIIIIlI[18]] = lIIIlllIII("toP8MDbaSaoM2temEKSwpw==", "jBMRF");
      lIIIIIllI[lIlIIIIlI[19]] = lIIIllllII("DQ83AgsSOSYjDC4HJGdDLg==", "jjCOj");
      lIIIIIllI[lIlIIIIlI[20]] = lIIIllllIl("gJna+lC2FFM6HU/52NGmPg==", "NFaoL");
      lIIIIIllI[lIlIIIIlI[21]] = lIIIllllIl("hKWk5Tp6juhMP4cyEen5Fw==", "MxYkU");
      lIIIIIllI[lIlIIIIlI[22]] = lIIIlllIII("0V8mmrArmKK1eY9pDfbtEw==", "NMBrm");
      lIIIIIllI[lIlIIIIlI[23]] = lIIIllllIl("0Xh0mOGf18meYXK9Fh3zErvYeyjsL1BHs/N8gKl8ukzqHjRQtHTNXkTnHhLnTDM/bQf8Te4Qb6NOCUO84zKkMywVuFi6UCvK6HQ6MPQq7a8=", "kKxOz");
      lIIIIIllI[lIlIIIIlI[24]] = lIIIlllIII("GQ1RXzwX1iq4Ja3jQeZYwg==", "xjqAP");
      lIIIIIllI[lIlIIIIlI[25]] = lIIIllllII("ATIOEhoBPxYzFA4jOTUfCSVScz8MNgw7XAcgDnUwCTsVKEg=", "fWzZs");
      lIIIIIllI[lIlIIIIlI[26]] = lIIIllllII("Ig0IDAEjAwcQLCYUBwU=", "Jdodm");
      lIIIIIllI[lIlIIIIlI[27]] = lIIIllllII("MB0XEAUwEA8xCz8MIjQcPxlLcSg=", "WxcXl");
      lIIIIIllI[lIlIIIIlI[28]] = lIIIllllIl("2k4Vhk9gCFaHbjnvTYD7uwiYhulXP0GUlg+Mm2lADTeUjp+p7oLz+ax6hIUFXM2byGSJV5KDYfdVQEFpdVPVRPfzAw970r/TW7LgKFYKzso=", "RxzTk");
      lIIIIIllI[lIlIIIIlI[29]] = lIIIllllII("JyUIL3AqMQotPz1wBiZwKjEXN3A9P0QtPyd9CjY8JXAQOiAscAkmficlBy81PCNKMyImJAstfiQ/ADY8LCNKID8kMgU3fgg5CSE/PQ==", "IPdCP");
      lIIIIIllI[lIlIIIIlI[32]] = lIIIlllIII("2ofdNkv36R7TiqgyP1ax7Q==", "XjmfU");
      lIIIIIllI[lIlIIIIlI[33]] = lIIIlllIII("cS8CRw3CwT2jZs3toAnnjl5EZdN87jzXDtXdJW7PUyvXKlLvPRj8o1hYc+iltjaW", "HqgnZ");
      lIIIIIllI[lIlIIIIlI[35]] = lIIIllllIl("3hH401jHUmk=", "cuDID");
      lIIIIIllI[lIlIIIIlI[36]] = lIIIllllII("DCsBACotNlEoICUyCA==", "ISqlE");
      lIIIIIllI[lIlIIIIlI[37]] = lIIIlllIII("vmsEXoXFf4U=", "NLorr");
      lIIIIIllI[lIlIIIIlI[38]] = lIIIllllII("GRY1OzFpPjE0NTA=", "IzTXT");
      lIIIIIllI[lIlIIIIlI[39]] = lIIIlllIII("U0O5MlL+nO3eTZKBWLfp8w==", "ebupX");
      lIIIIIllI[lIlIIIIlI[40]] = lIIIllllIl("6migt/FW2fsa+V9pf6yrXw==", "RIPtI");
      lIIIIIllI[lIlIIIIlI[41]] = lIIIlllIII("cqqqH7KkdJy7R0+hHHvvEw==", "MmHqv");
      lIIIIIllI[lIlIIIIlI[42]] = lIIIllllII("BAcIBVgBBwoOHQ==", "Sfdix");
      lIIIIIllI[lIlIIIIlI[43]] = lIIIllllIl("r01wLneQT4MtOGdRcyvwQA==", "hywae");
      lIIIIIllI[lIlIIIIlI[44]] = lIIIlllIII("u5H694AxzEuKazUX2tCgFWiSUP/iRR+b", "mRtWt");
      lIIIIIllI[lIlIIIIlI[45]] = lIIIllllII("IjQmJC4CcRoc", "nQRLO");
      lIIIIIllI[lIlIIIIlI[46]] = lIIIllllII("LhxHHj8SCEcIIBcVCQI+E1oOFHAFHwsIJ0cODw4jRzI3S3ATCB5HJAhaFwsxBB9HBCIeCRMGPBRaFQI3BggDCzUUCUcINkcODwJwChMJDj0SF0cDMQobAAJwCAhHCjEfEwoSPUcJAgs2Rx4GCjEAH0k=", "gzggP");
      lIIIIIllI[lIlIIIIlI[47]] = lIIIllllIl("QznU9/vDfS6gXDkhNjp0+w==", "sCYjK");
      lIIIIIllI[lIlIIIIlI[48]] = lIIIllllII("CxMKPjsqHQUidwAVATkl", "CzmVW");
      lIIIIIllI[lIlIIIIlI[49]] = lIIIllllIl("byhu50Wy8OM=", "PcSMk");
   }

   private static int lIlIllIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIlIllllII(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIlIllIllI(int var0) {
      return var0 > 0;
   }

   @ȵ
   public final void ⲋ(@NotNull ꝱᶁ llIIllllIIlIllI) {
      if (lIlIllIIll(llIIllllIIlIllI.ᴃᎲ() instanceof SPacketSoundEffect) && lIlIllllIl(((SPacketSoundEffect)llIIllllIIlIllI.ᴃᎲ()).field_186980_b, SoundCategory.BLOCKS) && lIlIllIIll(Intrinsics.areEqual((Object)((SPacketSoundEffect)llIIllllIIlIllI.ᴃᎲ()).field_186979_a, (Object)SoundEvents.field_187539_bB))) {
         Iterable llIIllllIIlIlIl = (Iterable)this.ɡ().field_71441_e.field_72996_f;
         int llIIllllIIlIlII = lIlIIIIlI[1];
         Collection llIIllllIIlIIlI = (Collection)(new ArrayList());
         int var6 = lIlIIIIlI[1];
         Iterator llIIllllIIlIIII = llIIllllIIlIlIl.iterator();

         while(lIlIllIIll(llIIllllIIlIIII.hasNext())) {
            float llIIllllIIIllll = llIIllllIIlIIII.next();
            if (lIlIllIIll(llIIllllIIIllll instanceof EntityEnderCrystal)) {
               llIIllllIIlIIlI.add(llIIllllIIIllll);
               "".length();
               "".length();
               if (-(118 ^ 114) >= 0) {
                  return;
               }
            }
         }

         llIIllllIIlIlIl = (Iterable)((List)llIIllllIIlIIlI);
         llIIllllIIlIlII = lIlIIIIlI[1];
         Iterator llIIllllIIlIIll = llIIllllIIlIlIl.iterator();

         while(lIlIllIIll(llIIllllIIlIIll.hasNext())) {
            long llIIllllIIlIIlI = llIIllllIIlIIll.next();
            boolean llIIllllIIlIIIl = (EntityEnderCrystal)llIIllllIIlIIlI;
            byte llIIllllIIlIIII = lIlIIIIlI[1];
            if (lIlIlllIll(lIlIlllllI(llIIllllIIlIIIl.func_70011_f(((SPacketSoundEffect)llIIllllIIlIllI.ᴃᎲ()).func_149207_d(), ((SPacketSoundEffect)llIIllllIIlIllI.ᴃᎲ()).func_149211_e(), ((SPacketSoundEffect)llIIllllIIlIllI.ᴃᎲ()).func_149210_f()), (double)6.0F))) {
               llIIllllIIlIIIl.func_70106_y();
            }

            "".length();
            if ("   ".length() < ((118 ^ 121) & ~(106 ^ 101))) {
               return;
            }
         }
      }

   }

   private static boolean lIlIllllll(Object var0, Object var1) {
      return var0 != var1;
   }

   public final float ⲋ(@NotNull EntityEnderCrystal var1, @NotNull Entity var2) {
      return this.ⲋ(var1.field_70165_t + 0.5D, var1.field_70163_u + 1.0D, var1.field_70161_v + 0.5D, var2);
   }

   private static boolean lIlIlllIll(int var0) {
      return var0 <= 0;
   }

   @JvmName(
      name = "ᶐ"
   )
   public final ē.u ᶐ() {
      return (ē.u)this.Ɏ.ⲋ(this, ⲋ[lIlIIIIlI[12]]);
   }

   private static boolean lIlIlllIlI(int var0) {
      return var0 >= 0;
   }

   @JvmName(
      name = "Ⱬ"
   )
   public final double Ⱬ() {
      return ((Number)this.ⴜ.ⲋ(this, ⲋ[lIlIIIIlI[14]])).doubleValue();
   }

   private static boolean lIlIllIIll(int var0) {
      return var0 != 0;
   }

   private static int lIlIllIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private final float ⲋ(EntityLivingBase llIIlllIIlllIII, float var2, Explosion var3) {
      float var10000;
      float llIIlllIIllIlIl;
      if (lIlIllIIll(llIIlllIIlllIII instanceof EntityPlayer)) {
         DamageSource var6 = DamageSource.func_94539_a(var3);
         llIIlllIIllIlIl = CombatRules.func_189427_a(var2, (float)((EntityPlayer)llIIlllIIlllIII).func_70658_aO(), (float)llIIlllIIlllIII.func_110148_a(SharedMonsterAttributes.field_189429_h).func_111126_e());
         int var7 = EnchantmentHelper.func_77508_a(((EntityPlayer)llIIlllIIlllIII).func_184193_aE(), var6);
         float var8 = MathHelper.func_76131_a((float)var7, 0.0F, 20.0F);
         llIIlllIIllIlIl *= 1.0F - var8 / 25.0F;
         if (lIlIllIIll(llIIlllIIlllIII.func_70644_a(Potion.func_188412_a(lIlIIIIlI[12])))) {
            llIIlllIIllIlIl -= llIIlllIIllIlIl / (float)lIlIIIIlI[5];
         }

         var10000 = llIIlllIIllIlIl;
         "".length();
         if (null != null) {
            return 0.0F;
         }
      } else {
         llIIlllIIllIlIl = CombatRules.func_189427_a(var2, (float)llIIlllIIlllIII.func_70658_aO(), (float)llIIlllIIlllIII.func_110148_a(SharedMonsterAttributes.field_189429_h).func_111126_e());
         var10000 = llIIlllIIllIlIl;
      }

      return var10000;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final double ϛⰄ() {
      return ((Number)this.ς.ⲋ(this, ⲋ[lIlIIIIlI[7]])).doubleValue();
   }

   private static String lIIIllllIl(String llIIllIllllllII, String llIIllIlllllIll) {
      try {
         String llIIllIlllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIlllllIll.getBytes(StandardCharsets.UTF_8)), lIlIIIIlI[9]), "DES");
         Cipher llIIlllIIIIIIII = Cipher.getInstance("DES");
         llIIlllIIIIIIII.init(lIlIIIIlI[3], llIIllIlllllIlI);
         return new String(llIIlllIIIIIIII.doFinal(Base64.getDecoder().decode(llIIllIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIIIlllIII(String llIIlllIIlIIIll, String llIIlllIIlIIIlI) {
      try {
         float llIIlllIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int llIIlllIIIllllI = Cipher.getInstance("Blowfish");
         llIIlllIIIllllI.init(lIlIIIIlI[3], llIIlllIIIlllll);
         return new String(llIIlllIIIllllI.doFinal(Base64.getDecoder().decode(llIIlllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final double Ἒⅾ() {
      return ((Number)this.ϛⰄ.ⲋ(this, ⲋ[lIlIIIIlI[6]])).doubleValue();
   }

   @JvmName(
      name = "Ἒ"
   )
   public final BlockPos Ἒ() {
      return this.ͷ;
   }

   @JvmName(
      name = "ⲡ"
   )
   public final double ⲡ() {
      return ((Number)this.Đ.ⲋ(this, ⲋ[lIlIIIIlI[10]])).doubleValue();
   }

   private static boolean lIlIlllIIl(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIlIlllI(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return (Boolean)this.ᴃᎲ.ⲋ(this, ⲋ[lIlIIIIlI[3]]);
   }

   static {
      lIlIlIllIl();
      lIlIIIlIIl();
      KProperty[] var10000 = new KProperty[lIlIIIIlI[0]];
      var10000[lIlIIIIlI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[1]], lIIIIIllI[lIlIIIIlI[2]]));
      var10000[lIlIIIIlI[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[3]], lIIIIIllI[lIlIIIIlI[4]]));
      var10000[lIlIIIIlI[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[5]], lIIIIIllI[lIlIIIIlI[6]]));
      var10000[lIlIIIIlI[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[7]], lIIIIIllI[lIlIIIIlI[8]]));
      var10000[lIlIIIIlI[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[9]], lIIIIIllI[lIlIIIIlI[10]]));
      var10000[lIlIIIIlI[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[11]], lIIIIIllI[lIlIIIIlI[12]]));
      var10000[lIlIIIIlI[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[13]], lIIIIIllI[lIlIIIIlI[14]]));
      var10000[lIlIIIIlI[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[0]], lIIIIIllI[lIlIIIIlI[15]]));
      var10000[lIlIIIIlI[9]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[16]], lIIIIIllI[lIlIIIIlI[17]]));
      var10000[lIlIIIIlI[10]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[18]], lIIIIIllI[lIlIIIIlI[19]]));
      var10000[lIlIIIIlI[11]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[20]], lIIIIIllI[lIlIIIIlI[21]]));
      var10000[lIlIIIIlI[12]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[22]], lIIIIIllI[lIlIIIIlI[23]]));
      var10000[lIlIIIIlI[13]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[24]], lIIIIIllI[lIlIIIIlI[25]]));
      var10000[lIlIIIIlI[14]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ē.class), lIIIIIllI[lIlIIIIlI[26]], lIIIIIllI[lIlIIIIlI[27]]));
      ⲋ = var10000;
   }

   public void ἶṗ() {
      if (lIlIlllIIl(llIIllllIIIIIll.ͷ)) {
         int var2 = lIlIIIIlI[1];
         int var3 = lIlIIIIlI[1];
         int var5 = lIlIIIIlI[1];
         ᾣŦ var6 = ᾣŦ.ⲋ;
         int var7 = lIlIIIIlI[1];
         int var8 = lIlIIIIlI[1];
         int var10 = lIlIIIIlI[1];
         var6.ⲋ(lIlIIIIlI[8]);
         BlockPos var10001 = llIIllllIIIIIll.ͷ;
         if (lIlIlIlllI(var10001)) {
            Intrinsics.throwNpe();
         }

         var6.ⲋ(var10001, llIIllllIIIIIll.Ӄ().getRed(), llIIllllIIIIIll.Ӄ().getGreen(), llIIllllIIIIIll.Ӄ().getBlue(), (int)(llIIllllIIIIIll.Ⱬ() * 255.0D), lIlIIIIlI[31]);
         var6.ĂƂ();
         "".length();
         if (-" ".length() >= 0) {
            return;
         }
      } else {
         "".length();
      }

   }

   private static boolean lIllIIIIll(int var0, int var1) {
      return var0 == var1;
   }

   private static int lIlIllIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ē$ĂƂ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ĂƂ {
      private static void lllllIllI() {
         lllIIIIl = new int[4];
         lllIIIIl[0] = "  ".length();
         lllIIIIl[1] = (21 ^ 108 ^ 225 ^ 199) & (138 + 153 - 157 + 77 ^ 56 + 56 - 72 + 100 ^ -" ".length());
         lllIIIIl[2] = " ".length();
         lllIIIIl[3] = 87 ^ 95;
      }

      private static String lllllIIIl(String llIllIllIIllllI, String llIllIllIIlllll) {
         try {
            double llIllIllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllIIlllll.getBytes(StandardCharsets.UTF_8)), lllIIIIl[3]), "DES");
            Cipher llIllIllIlIIIlI = Cipher.getInstance("DES");
            llIllIllIlIIIlI.init(lllIIIIl[0], llIllIllIIlllII);
            return new String(llIllIllIlIIIlI.doFinal(Base64.getDecoder().decode(llIllIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static boolean lllllIlll(int var0, int var1) {
         return var0 < var1;
      }

      private static String lllllIlII(String llIllIllIllIlIl, String llIllIllIlIllll) {
         llIllIllIllIlIl = new String(Base64.getDecoder().decode(llIllIllIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         String llIllIllIlIlllI = new StringBuilder();
         char[] llIllIllIllIIlI = llIllIllIlIllll.toCharArray();
         int llIllIllIllIIIl = lllIIIIl[1];
         double llIllIllIlIlIll = llIllIllIllIlIl.toCharArray();
         double llIllIllIlIlIlI = llIllIllIlIlIll.length;
         int llIllIllIlIlIIl = lllIIIIl[1];

         do {
            if (!lllllIlll(llIllIllIlIlIIl, llIllIllIlIlIlI)) {
               return String.valueOf(llIllIllIlIlllI);
            }

            short llIllIllIlIlIII = llIllIllIlIlIll[llIllIllIlIlIIl];
            llIllIllIlIlllI.append((char)(llIllIllIlIlIII ^ llIllIllIllIIlI[llIllIllIllIIIl % llIllIllIllIIlI.length]));
            "".length();
            ++llIllIllIllIIIl;
            ++llIllIllIlIlIIl;
            "".length();
         } while(-"  ".length() <= 0);

         return null;
      }

      private static void lllllIlIl() {
         lllIIIII = new String[lllIIIIl[0]];
         lllIIIII[lllIIIIl[1]] = lllllIIIl("dRuWuy3GaHY=", "aHFyg");
         lllIIIII[lllIIIIl[2]] = lllllIlII("Nzk7Hyc=", "zlwKn");
      }

      static {
         lllllIllI();
         lllllIlIl();
         ē.ĂƂ[] var10001 = new ē.ĂƂ[lllIIIIl[0]];
         var10001[lllIIIIl[1]] = ⲋ = new ē.ĂƂ(lllIIIII[lllIIIIl[1]], lllIIIIl[1]);
         var10001[lllIIIIl[2]] = ĂƂ = new ē.ĂƂ(lllIIIII[lllIIIIl[2]], lllIIIIl[2]);
      }

      private ĂƂ() {
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003"},
      d2 = {"La/ē$ⲋ;", "ⲋ", "ĂƂ", "u", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      static {
         lIlIlIIlIIl();
         lIlIlIIIlll();
         ē.ⲋ[] var10001 = new ē.ⲋ[lIIlllIIll[0]];
         var10001[lIIlllIIll[1]] = ⲋ = new ē.ⲋ(lIIlllIIIl[lIIlllIIll[1]], lIIlllIIll[1]);
         var10001[lIIlllIIll[2]] = ĂƂ = new ē.ⲋ(lIIlllIIIl[lIIlllIIll[2]], lIIlllIIll[2]);
         var10001[lIIlllIIll[3]] = u = new ē.ⲋ(lIIlllIIIl[lIIlllIIll[3]], lIIlllIIll[3]);
      }

      private static String lIlIlIIIIll(String lIlIIIIIIIIIIll, String lIlIIIIIIIIIIII) {
         try {
            SecretKeySpec lIlIIIIIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Exception lIIlllllllllllI = Cipher.getInstance("Blowfish");
            lIIlllllllllllI.init(lIIlllIIll[3], lIlIIIIIIIIIllI);
            return new String(lIIlllllllllllI.doFinal(Base64.getDecoder().decode(lIlIIIIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private ⲋ() {
      }

      private static void lIlIlIIlIIl() {
         lIIlllIIll = new int[5];
         lIIlllIIll[0] = "   ".length();
         lIIlllIIll[1] = (14 ^ 17 ^ 160 ^ 137) & (7 ^ 105 ^ 115 ^ 43 ^ -" ".length());
         lIIlllIIll[2] = " ".length();
         lIIlllIIll[3] = "  ".length();
         lIIlllIIll[4] = 186 ^ 178;
      }

      private static void lIlIlIIIlll() {
         lIIlllIIIl = new String[lIIlllIIll[0]];
         lIIlllIIIl[lIIlllIIll[1]] = lIlIlIIIIlI("zKPtjNKrVjM=", "mOehL");
         lIIlllIIIl[lIIlllIIll[2]] = lIlIlIIIIll("TlDN8iddDOw=", "UZczH");
         lIIlllIIIl[lIIlllIIll[3]] = lIlIlIIIIll("0C4XxxwUi1c=", "ZhguT");
      }

      private static String lIlIlIIIIlI(String lIlIIIIIIlIIIll, String lIlIIIIIIlIIlII) {
         try {
            SecretKeySpec lIlIIIIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIIlllIIll[4]), "DES");
            Cipher lIlIIIIIIlIlIIl = Cipher.getInstance("DES");
            lIlIIIIIIlIlIIl.init(lIIlllIIll[3], lIlIIIIIIlIlIlI);
            return new String(lIlIIIIIIlIlIIl.doFinal(Base64.getDecoder().decode(lIlIIIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ē$u;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum u {
      private u() {
      }

      private static String lIlIIlIIIII(String lIlIIlIlIlIlIll, String lIlIIlIlIlIlIII) {
         try {
            int lIlIIlIlIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIlIlIlIII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIl[3]), "DES");
            short lIlIIlIlIlIIllI = Cipher.getInstance("DES");
            lIlIIlIlIlIIllI.init(lIIllIlIIl[0], lIlIIlIlIlIIlll);
            return new String(lIlIIlIlIlIIllI.doFinal(Base64.getDecoder().decode(lIlIIlIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIIlIIIIl() {
         lIIllIlIII = new String[lIIllIlIIl[0]];
         lIIllIlIII[lIIllIlIIl[1]] = lIlIIlIIIII("vXjOSL7gJPT8V6DkuIC8JA==", "vntZi");
         lIIllIlIII[lIIllIlIIl[2]] = lIlIIlIIIII("5GUL/l3AJk8=", "YxbGO");
      }

      static {
         lIlIIlIIIlI();
         lIlIIlIIIIl();
         ē.u[] var10001 = new ē.u[lIIllIlIIl[0]];
         var10001[lIIllIlIIl[1]] = ⲋ = new ē.u(lIIllIlIII[lIIllIlIIl[1]], lIIllIlIIl[1]);
         var10001[lIIllIlIIl[2]] = ĂƂ = new ē.u(lIIllIlIII[lIIllIlIIl[2]], lIIllIlIIl[2]);
      }

      private static void lIlIIlIIIlI() {
         lIIllIlIIl = new int[4];
         lIIllIlIIl[0] = "  ".length();
         lIIllIlIIl[1] = (183 ^ 135) & ~(113 ^ 65);
         lIIllIlIIl[2] = " ".length();
         lIIllIlIIl[3] = 16 + 121 - 8 + 23 ^ 79 + 29 - 3 + 39;
      }
   }
}
