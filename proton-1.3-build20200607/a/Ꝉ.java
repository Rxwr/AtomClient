package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.RenderLivingEvent.Post;
import net.minecraftforge.client.event.RenderLivingEvent.Pre;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020B:\u0001\u0005B\u0007¢\u0006\u0004\bA\u00109J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b\u0005\u00105J\u0017\u0010\u0005\u001a\u00020\n2\u0006\u00104\u001a\u000206H\u0002¢\u0006\u0004\b\u0005\u00107J\u000f\u0010\u001c\u001a\u000208H\u0014¢\u0006\u0004\b\u001c\u00109J\u001d\u0010\u0005\u001a\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u0002030:H\u0007¢\u0006\u0004\b\u0005\u0010;J\u001d\u0010\u0005\u001a\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u0002030<H\u0007¢\u0006\u0004\b\u0005\u0010=J\u000f\u0010>\u001a\u000208H\u0016¢\u0006\u0004\b>\u00109J\u000f\u0010?\u001a\u000208H\u0016¢\u0006\u0004\b?\u00109J\u0017\u0010\u0005\u001a\u0004\u0018\u000102*\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\u0005\u0010@R\"\u0010\u0005\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0082\u0084\u0002R\"\u0010\t\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u0082\u0084\u0002R&\u0010\u000e\u001a\u0006*\u00020\n0\n8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r¨\u0006\u0082\u0084\u0002R\"\u0010\u0011\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\b¨\u0006\u0082\u0084\u0002R&\u0010\u0002\u001a\u0006*\u00020\n0\n8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0011\u0010\r¨\u0006\u0082\u0084\u0002R\"\u0010\u0013\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0012\u0010\b¨\u0006\u0082\u0084\u0002R\"\u0010\u0016\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0082\u0084\u0002R&\u0010\u0019\u001a\u0006*\u00020\n0\n8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\r¨\u0006\u0082\u0084\u0002R\"\u0010\u0007\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u001b\u0010\b¨\u0006\u0082\u0084\u0002R\"\u0010\u0012\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\b¨\u0006\u0082\u0084\u0002R\"\u0010\u001c\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0082\u0084\u0002R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006\u0082\u0004R\"\u0010\u000b\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\b¨\u0006\u0082\u0084\u0002R\"\u0010%\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0019\u0010\b¨\u0006\u0082\u0084\u0002R\"\u0010(\u001a\u00020&8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000e\u0010'¨\u0006\u0082\u0084\u0002R$\u0010\u001a\u001a\f\u0012\b\u0012\u0006*\u00020\u001f0\u001f0)8C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006\u0082\u0004R\"\u0010\u0017\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0016\u0010\b¨\u0006\u0082\u0084\u0002R\"\u0010#\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\t\u0010\u0004¨\u0006\u0082\u0084\u0002R&\u0010\u0014\u001a\u00020\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0005\u0010.¨\u0006\u0086\u000eR&\u0010!\u001a\u0006*\u00020\n0\n8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0003\u001a\u0004\b/\u0010\r¨\u0006\u0082\u0084\u0002R\"\u00101\u001a\u00020\u00068C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0003\u001a\u0004\b0\u0010\b¨\u0006\u0082\u0084\u0002R&\u0010,\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020 0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\"¨\u0006\u0082\u0004"},
   d2 = {"La/Ꝉ;", "", "〥ҳⱆ", "La/ⅹ;", "()D", "ⲋ", "", "Ꜥ", "()Z", "ĂƂ", "Ljava/awt/Color;", "Ɏ", "Ӄ", "()Ljava/awt/Color;", "u", "ᵴἥ", "ᶐ", "ᴃᎲ", "ⲡ", "Ἒⅾ", "Ꞑ", "ἒű", "ϛⰄ", "Ⳓ", "Ꮐ꯴", "ς", "ͷ", "ꝱᶁ", "Đ", "ⱛṧ", "Ljava/util/concurrent/ConcurrentHashMap;", "Lnet/minecraft/entity/Entity;", "", "ⱯꝣѺ", "Ljava/util/concurrent/ConcurrentHashMap;", "Ꙗ", "ᾥ", "ɡ", "La/Ꝉ$ⲋ;", "()La/Ꝉ$ⲋ;", "ⴜ", "", "ı５", "()Ljava/util/List;", "ɧῙ", "Z", "(Z)V", "Ἒ", "Ⱬ", "ꙑứ", "Ljava/util/UUID;", "Lnet/minecraft/entity/EntityLivingBase;", "p0", "(Lnet/minecraft/entity/EntityLivingBase;)Z", "Lnet/minecraft/tileentity/TileEntity;", "(Lnet/minecraft/tileentity/TileEntity;)Ljava/awt/Color;", "", "()V", "Lnet/minecraftforge/client/event/RenderLivingEvent$Post;", "(Lnet/minecraftforge/client/event/RenderLivingEvent$Post;)V", "Lnet/minecraftforge/client/event/RenderLivingEvent$Pre;", "(Lnet/minecraftforge/client/event/RenderLivingEvent$Pre;)V", "Ἠ", "ἶṗ", "(Lnet/minecraft/entity/Entity;)Ljava/util/UUID;", "<init>", "La/ⳅ;"}
)
public final class Ꝉ extends ⳅ {
   @JvmName(
      name = "ⱛṧ"
   )
   private final boolean ⱛṧ() {
      return (Boolean)this.Đ.ⲋ(this, ⲋ[lllllIIlI[10]]);
   }

   @JvmName(
      name = "ꝱᶁ"
   )
   private final boolean ꝱᶁ() {
      return (Boolean)this.ͷ.ⲋ(this, ⲋ[lllllIIlI[15]]);
   }

   private static String llllIIlIIl(String lIlIllllllIIIlI, String lIlIllllllIIIIl) {
      try {
         String lIlIlllllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllllllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIlIllllllIIlII = Cipher.getInstance("Blowfish");
         lIlIllllllIIlII.init(lllllIIlI[3], lIlIlllllIllllI);
         return new String(lIlIllllllIIlII.doFinal(Base64.getDecoder().decode(lIlIllllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private final boolean ⲋ(EntityLivingBase var1) {
      int var2 = lllllIIlI[1];
      int var3 = lllllIIlI[1];
      int var5 = lllllIIlI[1];
      int var10000;
      if (lIIIIlllllI(lIllIIIIlIIIlIl.ϛⰄ()) && lIIIIlllllI(var1 instanceof EntityPlayer) && !lIIIIllllll(Intrinsics.areEqual((Object)var1, (Object)lIllIIIIlIIIlIl.ɡ().field_71439_g) ^ lllllIIlI[2]) || lIIIIlllllI(lIllIIIIlIIIlIl.ς()) && !lIIIIllllll(var1 instanceof EntityMob) || lIIIIlllllI(lIllIIIIlIIIlIl.Ꜥ()) && lIIIIlllllI(Ṑ.ⲋ((Entity)var1))) {
         var10000 = lllllIIlI[2];
         "".length();
         if ((" ".length() & (" ".length() ^ -" ".length())) > "   ".length()) {
            return (boolean)((56 ^ 24 ^ 48 ^ 59) & (218 ^ 135 ^ 254 ^ 136 ^ -" ".length()));
         }
      } else {
         var10000 = lllllIIlI[1];
      }

      return (boolean)var10000;
   }

   private static boolean lIIIlIlIIIl(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "Ἒ"
   )
   private final Color Ἒ() {
      return (Color)this.ⴜ.ⲋ(this, ⲋ[lllllIIlI[14]]);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.ɧῙ = var1;
   }

   @JvmName(
      name = "Ꮐ꯴"
   )
   private final Color Ꮐ꯴() {
      return (Color)this.Ⳓ.ⲋ(this, ⲋ[lllllIIlI[16]]);
   }

   @JvmName(
      name = "ı５"
   )
   private final List<Entity> ı５() {
      Iterable lIllIIIlIlIIllI = (Iterable)lIllIIIlIlIIlll.ɡ().field_71441_e.field_72996_f;
      int lIllIIIlIlIIlIl = lllllIIlI[1];
      Collection lIllIIIlIlIIIll = (Collection)(new ArrayList());
      int lIllIIIlIlIIIlI = lllllIIlI[1];
      Iterator lIllIIIlIlIIIIl = lIllIIIlIlIIllI.iterator();

      int var10000;
      Object lIllIIIlIlIIIII;
      Entity lIllIIIlIIlllll;
      int lIllIIIlIIllllI;
      while(lIIIIlllllI(lIllIIIlIlIIIIl.hasNext())) {
         lIllIIIlIlIIIII = lIllIIIlIlIIIIl.next();
         lIllIIIlIIlllll = (Entity)lIllIIIlIlIIIII;
         lIllIIIlIIllllI = lllllIIlI[1];
         if (lIIIIllllll(lIllIIIlIIlllll instanceof AbstractHorse) && !lIIIIlllllI(lIllIIIlIIlllll instanceof EntityTameable)) {
            var10000 = lllllIIlI[1];
         } else {
            var10000 = lllllIIlI[2];
            "".length();
            if (((108 ^ 41) & ~(83 ^ 22)) != 0) {
               return null;
            }
         }

         if (lIIIIlllllI(var10000)) {
            lIllIIIlIlIIIll.add(lIllIIIlIlIIIII);
            "".length();
            "".length();
            if (((229 + 3 - 191 + 206 ^ 97 + 155 - 65 + 12) & (62 + 17 - 18 + 112 ^ 124 + 91 - 193 + 135 ^ -" ".length())) > 0) {
               return null;
            }
         }
      }

      lIllIIIlIlIIllI = (Iterable)((List)lIllIIIlIlIIIll);
      lIllIIIlIlIIlIl = lllllIIlI[1];
      lIllIIIlIlIIIll = (Collection)(new ArrayList());
      lIllIIIlIlIIIlI = lllllIIlI[1];
      lIllIIIlIlIIIIl = lIllIIIlIlIIllI.iterator();

      while(lIIIIlllllI(lIllIIIlIlIIIIl.hasNext())) {
         lIllIIIlIlIIIII = lIllIIIlIlIIIIl.next();
         lIllIIIlIIlllll = (Entity)lIllIIIlIlIIIII;
         lIllIIIlIIllllI = lllllIIlI[1];
         if (lIIIlIIIIII(lIIIIllllIl(lIllIIIlIlIIlll.ɡ().field_71439_g.func_70032_d(lIllIIIlIIlllll), (float)lIllIIIlIlIIlll.ĂƂ()))) {
            var10000 = lllllIIlI[2];
            "".length();
            if (((177 ^ 162 ^ 27 ^ 82) & (59 ^ 11 ^ 65 ^ 43 ^ -" ".length())) >= "  ".length()) {
               return null;
            }
         } else {
            var10000 = lllllIIlI[1];
         }

         if (lIIIIlllllI(var10000)) {
            lIllIIIlIlIIIll.add(lIllIIIlIlIIIII);
            "".length();
            "".length();
            if (-"  ".length() > 0) {
               return null;
            }
         }
      }

      return (List)lIllIIIlIlIIIll;
   }

   private static String llllIIlllI(String lIlIlllllIIllIl, String lIlIlllllIlIIIl) {
      lIlIlllllIIllIl = new String(Base64.getDecoder().decode(lIlIlllllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlIlllllIlIIII = new StringBuilder();
      boolean lIlIlllllIIlIlI = lIlIlllllIlIIIl.toCharArray();
      int lIlIlllllIIlllI = lllllIIlI[1];
      int lIlIlllllIIlIII = lIlIlllllIIllIl.toCharArray();
      int lIlIlllllIIIlll = lIlIlllllIIlIII.length;
      int lIlIlllllIIIllI = lllllIIlI[1];

      do {
         if (!lIIIlIlIIIl(lIlIlllllIIIllI, lIlIlllllIIIlll)) {
            return String.valueOf(lIlIlllllIlIIII);
         }

         char lIlIlllllIlIIll = lIlIlllllIIlIII[lIlIlllllIIIllI];
         lIlIlllllIlIIII.append((char)(lIlIlllllIlIIll ^ lIlIlllllIIlIlI[lIlIlllllIIlllI % lIlIlllllIIlIlI.length]));
         "".length();
         ++lIlIlllllIIlllI;
         ++lIlIlllllIIIllI;
         "".length();
      } while(" ".length() > ((216 ^ 147) & ~(97 ^ 42)));

      return null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   private final double 〥ҳⱆ() {
      return ((Number)this.〥ҳⱆ.ⲋ(this, ⲋ[lllllIIlI[4]])).doubleValue();
   }

   public void ἶṗ() {
      super.ἶṗ();
      Iterable lIllIIIIIIIlIll = (Iterable)lIllIIIIIIIllll.ɡ().field_71441_e.field_72996_f;
      int lIllIIIIIIIlIIl = lllllIIlI[1];
      Collection lIllIIIIIIIIlIl = (Collection)(new ArrayList());
      int lIllIIIIIIIIIll = lllllIIlI[1];
      Iterator lIllIIIIIIIIIIl = lIllIIIIIIIlIll.iterator();

      Object lIllIIIIIIIIIII;
      Entity lIlIlllllllllll;
      int lIlIlllllllllIl;
      int var10000;
      while(lIIIIlllllI(lIllIIIIIIIIIIl.hasNext())) {
         lIllIIIIIIIIIII = lIllIIIIIIIIIIl.next();
         lIlIlllllllllll = (Entity)lIllIIIIIIIIIII;
         lIlIlllllllllIl = lllllIIlI[1];
         if (lIIIIlllllI(Intrinsics.areEqual((Object)lIllIIIIIIIllll.ɡ().field_71439_g, (Object)lIlIlllllllllll) ^ lllllIIlI[2]) && lIIIlIIIIII(lIIIlIIIlll(lIllIIIIIIIllll.ɡ().field_71439_g.func_70032_d(lIlIlllllllllll), (float)lIllIIIIIIIllll.ĂƂ()))) {
            var10000 = lllllIIlI[2];
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var10000 = lllllIIlI[1];
         }

         if (lIIIIlllllI(var10000)) {
            lIllIIIIIIIIlIl.add(lIllIIIIIIIIIII);
            "".length();
            "".length();
            if (((23 ^ 15) & ~(175 ^ 183)) != ((0 ^ 75) & ~(64 ^ 11))) {
               return;
            }
         }
      }

      lIllIIIIIIIlIll = (Iterable)((List)lIllIIIIIIIIlIl);
      lIllIIIIIIIlIIl = lllllIIlI[1];
      lIllIIIIIIIIlIl = (Collection)(new ArrayList());
      lIllIIIIIIIIIll = lllllIIlI[1];
      lIllIIIIIIIIIIl = lIllIIIIIIIlIll.iterator();

      while(lIIIIlllllI(lIllIIIIIIIIIIl.hasNext())) {
         lIllIIIIIIIIIII = lIllIIIIIIIIIIl.next();
         lIlIlllllllllll = (Entity)lIllIIIIIIIIIII;
         lIlIlllllllllIl = lllllIIlI[1];
         if (lIIIIlllllI(lIllIIIIIIIllll.ⲡ()) && !lIIIIllllll(lIlIlllllllllll instanceof EntityEnderCrystal) || lIIIIlllllI(lIllIIIIIIIllll.ⱛṧ()) && !lIIIIllllll(lIlIlllllllllll instanceof EntityItem) || lIIIIlllllI(lIllIIIIIIIllll.ϛⰄ()) && !lIIIIllllll(lIlIlllllllllll instanceof EntityPlayer) || lIIIIlllllI(lIllIIIIIIIllll.ς()) && !lIIIIllllll(lIlIlllllllllll instanceof EntityMob) || lIIIIlllllI(lIllIIIIIIIllll.Ꜥ()) && lIIIIlllllI(Ṑ.ⲋ(lIlIlllllllllll))) {
            var10000 = lllllIIlI[2];
            "".length();
            if ((118 ^ 56 ^ 65 ^ 11) == "   ".length()) {
               return;
            }
         } else {
            var10000 = lllllIIlI[1];
         }

         if (lIIIIlllllI(var10000)) {
            lIllIIIIIIIIlIl.add(lIllIIIIIIIIIII);
            "".length();
            "".length();
            if (((45 ^ 57 ^ 179 ^ 155) & (125 ^ 11 ^ 92 ^ 22 ^ -" ".length())) != 0) {
               return;
            }
         }
      }

      int lIllIIIIIIIllIl = (List)lIllIIIIIIIIlIl;
      short lIllIIIIIIIlIIl = (Iterable)lIllIIIIIIIllll.ɡ().field_71441_e.field_147482_g;
      byte lIllIIIIIIIIlll = lllllIIlI[1];
      char lIllIIIIIIIIIll = (Collection)(new ArrayList());
      float lIllIIIIIIIIIIl = lllllIIlI[1];
      Iterator lIllIIIIIIIIIII = lIllIIIIIIIlIIl.iterator();

      int lIlIlllllllllII;
      Object lIlIlllllllllll;
      TileEntity lIlIlllllllllIl;
      while(lIIIIlllllI(lIllIIIIIIIIIII.hasNext())) {
         lIlIlllllllllll = lIllIIIIIIIIIII.next();
         lIlIlllllllllIl = (TileEntity)lIlIlllllllllll;
         lIlIlllllllllII = lllllIIlI[1];
         if (lIIIlIIIIII(lIIIlIIlIII(lIllIIIIIIIllll.ɡ().field_71439_g.func_174831_c(lIlIlllllllllIl.func_174877_v()), (double)((float)(lIllIIIIIIIllll.ĂƂ() * lIllIIIIIIIllll.ĂƂ()))))) {
            var10000 = lllllIIlI[2];
            "".length();
            if (" ".length() >= "  ".length()) {
               return;
            }
         } else {
            var10000 = lllllIIlI[1];
         }

         if (lIIIIlllllI(var10000)) {
            lIllIIIIIIIIIll.add(lIlIlllllllllll);
            "".length();
            "".length();
            if (((167 ^ 141) & ~(189 ^ 151)) >= "  ".length()) {
               return;
            }
         }
      }

      lIllIIIIIIIlIIl = (Iterable)((List)lIllIIIIIIIIIll);
      lIllIIIIIIIIlll = lllllIIlI[1];
      lIllIIIIIIIIIll = (Collection)(new ArrayList());
      lIllIIIIIIIIIIl = lllllIIlI[1];
      lIllIIIIIIIIIII = lIllIIIIIIIlIIl.iterator();

      while(lIIIIlllllI(lIllIIIIIIIIIII.hasNext())) {
         lIlIlllllllllll = lIllIIIIIIIIIII.next();
         lIlIlllllllllIl = (TileEntity)lIlIlllllllllll;
         lIlIlllllllllII = lllllIIlI[1];
         if (lIIIIlllllI(lIllIIIIIIIllll.ᶐ()) && !lIIIIllllll(lIlIlllllllllIl instanceof TileEntityChest) || lIIIIlllllI(lIllIIIIIIIllll.Ⱬ()) && !lIIIIllllll(lIlIlllllllllIl instanceof TileEntityShulkerBox) || lIIIIlllllI(lIllIIIIIIIllll.ꝱᶁ()) && lIIIIlllllI(lIlIlllllllllIl instanceof TileEntityEnderChest)) {
            var10000 = lllllIIlI[2];
            "".length();
            if ("   ".length() < 0) {
               return;
            }
         } else {
            var10000 = lllllIIlI[1];
         }

         if (lIIIIlllllI(var10000)) {
            lIllIIIIIIIIIll.add(lIlIlllllllllll);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
               return;
            }
         }
      }

      lIllIIIIIIIlIIl = (Iterable)((List)lIllIIIIIIIIIll);
      lIllIIIIIIIIlll = lllllIIlI[1];
      lIllIIIIIIIIIll = lllllIIlI[1];
      float lIllIIIIIIIIIIl = (Comparator)(new Ꝉ$2(lIllIIIIIIIllll));
      long lIllIIIIIIIlIll = CollectionsKt.sortedWith(lIllIIIIIIIlIIl, lIllIIIIIIIIIIl);
      if (!lIIIIlllllI(lIllIIIIIIIllIl.isEmpty()) || !lIIIIlllllI(lIllIIIIIIIlIll.isEmpty())) {
         int lIlIllllllllIIl;
         double lIlIlllllllIlll;
         Entity var10001;
         ᾣŦ lIllIIIIIIIlIIl;
         int lIllIIIIIIIIlIl;
         Iterator lIllIIIIIIIIlIl;
         ᾣŦ lIllIIIIIIIIIll;
         Object lIllIIIIIIIIIll;
         Entity lIllIIIIIIIIIIl;
         Iterable lIllIIIIIIIIIII;
         int lIllIIIIIIIIIII;
         int lIlIlllllllllll;
         Vec3d lIlIlllllllllll;
         Iterator lIlIlllllllllIl;
         Object lIlIlllllllllII;
         float lIlIlllllllllIl;
         float lIlIlllllllllII;
         double lIlIllllllllIIl;
         Unit var50;
         Vec3d var51;
         RenderManager var52;
         GameSettings var53;
         Entity var54;
         if (lIIIlIIIlII(lIllIIIIIIIllll.u(), Ꝉ.ⲋ.ĂƂ)) {
            lIllIIIIIIIlIIl = ᾣŦ.ⲋ;
            lIllIIIIIIIIlll = lllllIIlI[1];
            lIllIIIIIIIIlIl = lllllIIlI[1];
            lIllIIIIIIIIIll = lIllIIIIIIIlIIl;
            lIllIIIIIIIIIIl = lllllIIlI[1];
            lIllIIIIIIIlIIl.ⲋ(lllllIIlI[8]);
            lIllIIIIIIIIIII = (Iterable)lIllIIIIIIIllIl;
            lIlIlllllllllll = lllllIIlI[1];
            lIlIlllllllllIl = lIllIIIIIIIIIII.iterator();

            Entity lIlIllllllllIll;
            while(lIIIIlllllI(lIlIlllllllllIl.hasNext())) {
               lIlIlllllllllII = lIlIlllllllllIl.next();
               lIlIllllllllIll = (Entity)lIlIlllllllllII;
               lIlIllllllllIIl = lllllIIlI[1];
               lIllIIIIIIIIIll.ⲋ(lIlIllllllllIll, ſ.ĂƂ(ſ.ⲋ(lIllIIIIIIIllll.ᴃᎲ(), lIllIIIIIIIllll.〥ҳⱆ())), lllllIIlI[42]);
               "".length();
               if ("  ".length() < 0) {
                  return;
               }
            }

            lIllIIIIIIIIIll.ĂƂ();
            lIllIIIIIIIIIll.ⲋ(lllllIIlI[2]);
            lIllIIIIIIIIIII = (Iterable)lIllIIIIIIIllIl;
            lIlIlllllllllll = lllllIIlI[1];
            lIlIlllllllllIl = lIllIIIIIIIIIII.iterator();

            while(lIIIIlllllI(lIlIlllllllllIl.hasNext())) {
               lIlIlllllllllII = lIlIlllllllllIl.next();
               lIlIllllllllIll = (Entity)lIlIlllllllllII;
               lIlIllllllllIIl = lllllIIlI[1];
               lIllIIIIIIIIIll.ĂƂ(lIlIllllllllIll, ſ.ĂƂ(ſ.ⲋ(lIllIIIIIIIllll.ᴃᎲ(), lIllIIIIIIIllll.Ἒⅾ())), lllllIIlI[42]);
               "".length();
               if ("   ".length() < 0) {
                  return;
               }
            }

            lIllIIIIIIIIIll.ĂƂ();
            var50 = Unit.INSTANCE;
            "".length();
            "".length();
            if ((172 + 145 - 251 + 128 ^ 65 + 0 - -95 + 39) <= 0) {
               return;
            }
         } else if (lIIIlIIIlII(lIllIIIIIIIllll.u(), Ꝉ.ⲋ.u)) {
            GlStateManager.func_179097_i();
            lIllIIIIIIIlIIl = (Iterable)lIllIIIIIIIllIl;
            lIllIIIIIIIIlll = lllllIIlI[1];
            lIllIIIIIIIIlIl = lIllIIIIIIIlIIl.iterator();

            while(lIIIIlllllI(lIllIIIIIIIIlIl.hasNext())) {
               lIllIIIIIIIIIll = lIllIIIIIIIIlIl.next();
               lIllIIIIIIIIIIl = (Entity)lIllIIIIIIIIIll;
               lIllIIIIIIIIIII = lllllIIlI[1];
               GL11.glPushMatrix();
               var51 = Ṑ.ĂƂ(lIllIIIIIIIIIIl, (double)lIllIIIIIIIllll.ɡ().func_184121_ak());
               var10001 = lIllIIIIIIIllll.ɡ().field_175622_Z;
               if (lIIIlIIIIIl(var10001)) {
                  Intrinsics.throwNpe();
               }

               label246: {
                  label245: {
                     lIlIlllllllllll = var51.func_178788_d(Ṑ.ĂƂ(var10001, (double)lIllIIIIIIIllll.ɡ().func_184121_ak())).func_178787_e(lIllIIIIIIIIIIl.field_70121_D.func_189972_c().func_178788_d(lIllIIIIIIIIIIl.func_174791_d()));
                     lIlIlllllllllIl = lIllIIIIIIIllll.ɡ().func_175598_ae().field_78735_i;
                     lIlIlllllllllII = lIllIIIIIIIllll.ɡ().func_175598_ae().field_78732_j;
                     var52 = lIllIIIIIIIllll.ɡ().field_175616_W;
                     if (lIIIlIIIIlI(var52)) {
                        var53 = var52.field_78733_k;
                        if (lIIIlIIIIlI(var53)) {
                           if (lIIIlIIlIIl(var53.field_74320_O, lllllIIlI[3])) {
                              var10000 = lllllIIlI[2];
                              "".length();
                              if ((109 + 49 - 63 + 50 ^ 13 + 41 - -94 + 0) <= 0) {
                                 return;
                              }
                              break label246;
                           }
                           break label245;
                        }
                     }

                     "".length();
                  }

                  var10000 = lllllIIlI[1];
               }

               GlStateManager.func_179137_b(lIlIlllllllllll.field_72450_a, lIlIlllllllllll.field_72448_b, lIlIlllllllllll.field_72449_c);
               GlStateManager.func_179114_b(-lIlIlllllllllIl, 0.0F, 1.0F, 0.0F);
               var54 = lIllIIIIIIIllll.ɡ().field_175622_Z;
               if (lIIIlIIIIIl(var54)) {
                  Intrinsics.throwNpe();
               }

               lIlIllllllllIIl = Ṑ.ĂƂ(var54, (double)lIllIIIIIIIllll.ɡ().func_184121_ak()).func_72438_d(Ṑ.ĂƂ(lIllIIIIIIIIIIl, (double)lIllIIIIIIIllll.ɡ().func_184121_ak()));
               GL11.glDisable(lllllIIlI[43]);
               GL11.glEnable(lllllIIlI[44]);
               GL11.glHint(lllllIIlI[45], lllllIIlI[46]);
               lIlIlllllllIlll = lIllIIIIIIIIIIl.field_70121_D.field_72336_d - lIllIIIIIIIIIIl.field_70121_D.field_72340_a + 0.2D;
               byte lIlIlllllllIllI = lIllIIIIIIIIIIl.field_70121_D.field_72337_e - lIllIIIIIIIIIIl.field_70121_D.field_72338_b + 0.2D;
               GlStateManager.func_187441_d((float)lIllIIIIIIIllll.ἒű());
               GL11.glBegin(lllllIIlI[2]);
               GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.0F);
               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glEnd();
               GlStateManager.func_187441_d((float)lIllIIIIIIIllll.ἒű() / 2.0F);
               GL11.glBegin(lllllIIlI[2]);
               if (lIIIIlllllI(lIllIIIIIIIllll.ɡ().field_71439_g.func_70685_l(lIllIIIIIIIIIIl))) {
                  GL11.glColor4f(1.0F, 0.0F, 0.0F, 1.0F);
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  GL11.glColor4f(1.0F, 1.0F, 0.0F, 1.0F);
               }

               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, -lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glVertex3d(-lIlIlllllllIlll / 2.0D, lIlIlllllllIllI / 2.0D, 0.0D);
               GL11.glEnd();
               if (lIIIIlllllI(lIllIIIIIIIIIIl instanceof EntityLivingBase)) {
                  double lIlIlllllllIlII = ((EntityLivingBase)lIllIIIIIIIIIIl).func_110143_aJ() / ((EntityLivingBase)lIllIIIIIIIIIIl).func_110138_aP();
                  String lIlIlllllllIIll = (float)lIlIlllllllIllI * lIlIlllllllIlII;
                  byte lIlIlllllllIIlI = -0.1D;
                  GlStateManager.func_187441_d((float)lIllIIIIIIIllll.ἒű());
                  GL11.glBegin(lllllIIlI[2]);
                  GL11.glColor4f(0.0F, 0.0F, 0.0F, 1.0F);
                  GL11.glVertex3d(lIlIlllllllIlll / 2.0D - lIlIlllllllIIlI, lIlIlllllllIllI / 2.0D, 0.0D);
                  GL11.glVertex3d(lIlIlllllllIlll / 2.0D - lIlIlllllllIIlI, -lIlIlllllllIllI / 2.0D, 0.0D);
                  GL11.glEnd();
                  GlStateManager.func_187441_d((float)lIllIIIIIIIllll.ἒű() / 2.0F);
                  GL11.glBegin(lllllIIlI[2]);
                  GL11.glColor4f(0.0F, 1.0F, 0.0F, 1.0F);
                  GL11.glVertex3d(lIlIlllllllIlll / 2.0D - lIlIlllllllIIlI, -lIlIlllllllIllI / 2.0D, 0.0D);
                  GL11.glVertex3d(lIlIlllllllIlll / 2.0D - lIlIlllllllIIlI, -lIlIlllllllIllI / 2.0D + (double)lIlIlllllllIIll, 0.0D);
                  GL11.glEnd();
               }

               GL11.glDisable(lllllIIlI[44]);
               GL11.glPopMatrix();
               "".length();
               if (" ".length() == 0) {
                  return;
               }
            }

            GlStateManager.func_179126_j();
         }

         short lIllIIIIIIIlIIl = (Collection)lIllIIIIIIIlIll;
         lIllIIIIIIIIlll = lllllIIlI[1];
         if (lIIIIllllll(lIllIIIIIIIlIIl.isEmpty())) {
            var10000 = lllllIIlI[2];
            "".length();
            if ("   ".length() < "  ".length()) {
               return;
            }
         } else {
            var10000 = lllllIIlI[1];
         }

         if (lIIIIlllllI(var10000)) {
            lIllIIIIIIIlIIl = ᾣŦ.ⲋ;
            lIllIIIIIIIIlll = lllllIIlI[1];
            lIllIIIIIIIIlIl = lllllIIlI[1];
            lIllIIIIIIIIIll = lIllIIIIIIIlIIl;
            lIllIIIIIIIIIIl = lllllIIlI[1];
            lIllIIIIIIIlIIl.ⲋ(lllllIIlI[8]);
            lIllIIIIIIIIIII = (Iterable)lIllIIIIIIIlIll;
            lIlIlllllllllll = lllllIIlI[1];
            lIlIlllllllllIl = lIllIIIIIIIIIII.iterator();

            AxisAlignedBB lIlIllllllllIII;
            TileEntity lIlIllllllllIll;
            while(lIIIIlllllI(lIlIlllllllllIl.hasNext())) {
               lIlIlllllllllII = lIlIlllllllllIl.next();
               lIlIllllllllIll = (TileEntity)lIlIlllllllllII;
               lIlIllllllllIIl = lllllIIlI[1];
               lIlIllllllllIII = lIllIIIIIIIllll.ɡ().field_71441_e.func_180495_p(lIlIllllllllIll.func_174877_v()).func_185890_d((IBlockAccess)lIllIIIIIIIllll.ɡ().field_71441_e, lIlIllllllllIll.func_174877_v());
               if (lIIIlIIIIlI(lIlIllllllllIII)) {
                  lIllIIIIIIIIIll.ⲋ(lIlIllllllllIll.func_174877_v(), lIlIllllllllIII, ſ.ĂƂ(ſ.ⲋ(lIllIIIIIIIllll.ⲋ(lIlIllllllllIll), lIllIIIIIIIllll.〥ҳⱆ())), lllllIIlI[42]);
                  "".length();
                  if (-" ".length() >= "  ".length()) {
                     return;
                  }
               } else {
                  lIllIIIIIIIIIll.ⲋ(lIlIllllllllIll.func_174877_v(), ſ.ĂƂ(ſ.ⲋ(lIllIIIIIIIllll.ⲋ(lIlIllllllllIll), lIllIIIIIIIllll.〥ҳⱆ())), lllllIIlI[42]);
               }

               "".length();
               if ((62 + 79 - 54 + 99 ^ 55 + 30 - -18 + 87) < " ".length()) {
                  return;
               }
            }

            lIllIIIIIIIIIll.ĂƂ();
            lIllIIIIIIIIIll.ⲋ(lllllIIlI[2]);
            lIllIIIIIIIIIII = (Iterable)lIllIIIIIIIlIll;
            lIlIlllllllllll = lllllIIlI[1];
            lIlIlllllllllIl = lIllIIIIIIIIIII.iterator();

            while(lIIIIlllllI(lIlIlllllllllIl.hasNext())) {
               lIlIlllllllllII = lIlIlllllllllIl.next();
               lIlIllllllllIll = (TileEntity)lIlIlllllllllII;
               lIlIllllllllIIl = lllllIIlI[1];
               lIlIllllllllIII = lIllIIIIIIIllll.ɡ().field_71441_e.func_180495_p(lIlIllllllllIll.func_174877_v()).func_185890_d((IBlockAccess)lIllIIIIIIIllll.ɡ().field_71441_e, lIlIllllllllIll.func_174877_v());
               if (lIIIlIIIIlI(lIlIllllllllIII)) {
                  lIllIIIIIIIIIll.ĂƂ(lIlIllllllllIll.func_174877_v(), lIlIllllllllIII, ſ.ĂƂ(ſ.ⲋ(lIllIIIIIIIllll.ⲋ(lIlIllllllllIll), lIllIIIIIIIllll.Ἒⅾ())), lllllIIlI[42]);
                  "".length();
                  if ((130 ^ 134) <= 0) {
                     return;
                  }
               } else {
                  lIllIIIIIIIIIll.ⲋ(lIlIllllllllIll.func_174877_v(), ſ.ⲋ(lIllIIIIIIIllll.ⲋ(lIlIllllllllIll), lIllIIIIIIIllll.Ἒⅾ()));
               }

               "".length();
               if ((207 ^ 194 ^ 10 ^ 3) < 0) {
                  return;
               }
            }

            lIllIIIIIIIIIll.ĂƂ();
            var50 = Unit.INSTANCE;
            "".length();
         }

         if (lIIIIlllllI(lIllIIIIIIIllll.ᾥ()) && lIIIlIIIIlI(lIllIIIIIIIllll.ɡ().field_71439_g) && lIIIlIIIIlI(lIllIIIIIIIllll.ɡ().field_175616_W) && lIIIlIIIIlI(lIllIIIIIIIllll.ɡ().field_175622_Z)) {
            GlStateManager.func_179097_i();
            GlStateManager.func_179098_w();
            lIllIIIIIIIlIIl = (Iterable)lIllIIIIIIIllll.ı５();
            lIllIIIIIIIIlll = lllllIIlI[1];
            lIllIIIIIIIIlIl = lIllIIIIIIIlIIl.iterator();

            while(lIIIIlllllI(lIllIIIIIIIIlIl.hasNext())) {
               lIllIIIIIIIIIll = lIllIIIIIIIIlIl.next();
               lIllIIIIIIIIIIl = (Entity)lIllIIIIIIIIIll;
               lIllIIIIIIIIIII = lllllIIlI[1];
               GL11.glPushMatrix();
               var51 = Ṑ.ĂƂ(lIllIIIIIIIIIIl, (double)lIllIIIIIIIllll.ɡ().func_184121_ak());
               var10001 = lIllIIIIIIIllll.ɡ().field_175622_Z;
               if (lIIIlIIIIIl(var10001)) {
                  Intrinsics.throwNpe();
               }

               label199: {
                  label198: {
                     lIlIlllllllllll = var51.func_178788_d(Ṑ.ĂƂ(var10001, (double)lIllIIIIIIIllll.ɡ().func_184121_ak())).func_178787_e(lIllIIIIIIIIIIl.field_70121_D.func_189972_c().func_178788_d(lIllIIIIIIIIIIl.func_174791_d()));
                     lIlIlllllllllIl = lIllIIIIIIIllll.ɡ().func_175598_ae().field_78735_i;
                     lIlIlllllllllII = lIllIIIIIIIllll.ɡ().func_175598_ae().field_78732_j;
                     var52 = lIllIIIIIIIllll.ɡ().field_175616_W;
                     if (lIIIlIIIIlI(var52)) {
                        var53 = var52.field_78733_k;
                        if (lIIIlIIIIlI(var53)) {
                           if (lIIIlIIlIIl(var53.field_74320_O, lllllIIlI[3])) {
                              var10000 = lllllIIlI[2];
                              "".length();
                              if (((50 ^ 24 ^ 151 ^ 163) & (104 + 52 - 45 + 30 ^ 6 + 133 - 114 + 122 ^ -" ".length())) >= "  ".length()) {
                                 return;
                              }
                              break label199;
                           }
                           break label198;
                        }
                     }

                     "".length();
                  }

                  var10000 = lllllIIlI[1];
               }

               byte lIlIllllllllIll = var10000;
               GlStateManager.func_179137_b(lIlIlllllllllll.field_72450_a, lIlIlllllllllll.field_72448_b + (double)lIllIIIIIIIIIIl.field_70131_O / 2.0D, lIlIlllllllllll.field_72449_c);
               GlStateManager.func_179114_b(-lIlIlllllllllIl, 0.0F, 1.0F, 0.0F);
               if (lIIIIlllllI(lIlIllllllllIll)) {
                  var10000 = lllllIIlI[47];
                  "".length();
                  if (-(208 ^ 192 ^ 41 ^ 61) >= 0) {
                     return;
                  }
               } else {
                  var10000 = lllllIIlI[2];
               }

               GlStateManager.func_179114_b((float)var10000 * lIlIlllllllllII, 1.0F, 0.0F, 0.0F);
               var54 = lIllIIIIIIIllll.ɡ().field_175622_Z;
               if (lIIIlIIIIIl(var54)) {
                  Intrinsics.throwNpe();
               }

               lIlIllllllllIIl = Ṑ.ĂƂ(var54, (double)lIllIIIIIIIllll.ɡ().func_184121_ak()).func_72438_d(Ṑ.ĂƂ(lIllIIIIIIIIIIl, (double)lIllIIIIIIIllll.ɡ().func_184121_ak()));
               lIlIlllllllIlll = MathHelper.func_151237_a(lIlIllllllllIIl / (double)8.0F, 0.5D, 1.5D);
               GlStateManager.func_179139_a(lIlIlllllllIlll, lIlIlllllllIlll, lIlIlllllllIlll);
               GlStateManager.func_179152_a(-0.025F, -0.025F, 0.025F);
               byte lIlIlllllllIllI = (String)lIllIIIIIIIllll.ⱯꝣѺ.get(lIllIIIIIIIIIIl);
               if (lIIIlIIIIlI(lIlIlllllllIllI)) {
                  char lIlIlllllllIlIl = ⱉȬ.ᴃᎲ.ⲋ();
                  GlStateManager.func_179137_b((double)(-lIlIlllllllIlIl.ĂƂ(lIlIlllllllIllI)) / 2.0D, 0.0D, 0.0D);
                  lIlIlllllllIlIl.ⲋ(lllllIIlI[1], lllllIIlI[1], Color.white, lIlIlllllllIllI, (boolean)lllllIIlI[2]);
               }

               GL11.glPopMatrix();
               "".length();
               if ("   ".length() <= -" ".length()) {
                  return;
               }
            }

            GlStateManager.func_179126_j();
            GlStateManager.func_179090_x();
         }

      }
   }

   @JvmName(
      name = "ἒű"
   )
   private final double ἒű() {
      return ((Number)this.Ꞑ.ⲋ(this, ⲋ[lllllIIlI[18]])).doubleValue();
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   private final double Ἒⅾ() {
      return ((Number)this.Ἒⅾ.ⲋ(this, ⲋ[lllllIIlI[5]])).doubleValue();
   }

   private final Color ⲋ(TileEntity var1) {
      Color var10000;
      if (lIIIIlllllI(var1 instanceof TileEntityChest)) {
         var10000 = lIllIIIIlIIlllI.Ӄ();
         "".length();
         if (" ".length() <= 0) {
            return null;
         }
      } else if (lIIIIlllllI(var1 instanceof TileEntityShulkerBox)) {
         var10000 = lIllIIIIlIIlllI.Ἒ();
         "".length();
         if ((149 ^ 144) <= 0) {
            return null;
         }
      } else if (lIIIIlllllI(var1 instanceof TileEntityEnderChest)) {
         var10000 = lIllIIIIlIIlllI.Ꮐ꯴();
         "".length();
         if (" ".length() >= "  ".length()) {
            return null;
         }
      } else {
         var10000 = Color.white;
      }

      return var10000;
   }

   private static int lIIIIllllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static void lIIIIlllIII() {
      lllIIIIlI = new String[lllllIIlI[68]];
      lllIIIIlI[lllllIIlI[1]] = llllIIlIIl("F027a/7jm7U=", "MYyTA");
      lllIIIIlI[lllllIIlI[2]] = llllIIlIIl("iU0TOZWTchud7EqobJzuMg==", "qttOw");
      lllIIIIlI[lllllIIlI[3]] = llllIIlIIl("cu6hvyD78BE=", "vPZdG");
      lllIIIIlI[lllllIIlI[4]] = llllIIlllI("FCQeGyAXJEJ/Ax4kRTg6EC0PIzxcMRg5OxwvRTsgFzQGMzxcMw84KxYzRRMcI2UvBR8+Lg4zdA==", "sAjVO");
      lllIIIIlI[lllllIIlI[5]] = llllIIlIIl("92oov2ggJKg=", "BjSCa");
      lllIIIIlI[lllllIIlI[6]] = llllIIlllI("LxUMFQ0kHwp+SwQaGSADZxEPIk0LHxQ5EHM=", "HpxVb");
      lllIIIIlI[lllllIIlI[7]] = llllIlIIII("ORoTkk+y+jw=", "zeYyL");
      lllIIIIlI[lllllIIlI[8]] = llllIIlIIl("3epvIjWy5J3FUzubGwtNiw==", "nKrus");
      lllIIIIlI[lllllIIlI[9]] = llllIlIIII("gQuclXSmjl357MxP8xLU1Q==", "ksdDL");
      lllIIIIlI[lllllIIlI[10]] = llllIIlIIl("JeOEb1xhPcHfmygO7q1GXw==", "DuajN");
      lllIIIIlI[lllllIIlI[11]] = llllIIlllI("JB81LgQmAA==", "TsTWa");
      lllIIIIlI[lllllIIlI[12]] = llllIlIIII("bqDgm016qNUNreN7JmRVPg==", "yggun");
      lllIIIIlI[lllllIIlI[13]] = llllIIlIIl("l2Nc9S408Ew=", "aIHme");
      lllIIIIlI[lllllIIlI[14]] = llllIIlIIl("S6mQP6ICTE4Xx1ladYYSyQ==", "Lzwru");
      lllIIIIlI[lllllIIlI[15]] = llllIlIIII("TyGxWGUjC4o=", "dqDUj");
      lllIIIIlI[lllllIIlI[16]] = llllIIlllI("AAkEGTkOARE0JE9FKg==", "glpXW");
      lllIIIIlI[lllllIIlI[17]] = llllIIlIIl("X3AljypQY4SISvsSrSz6lw==", "VJaYf");
      lllIIIIlI[lllllIIlI[18]] = llllIIlllI("BSY2DDMbMDYuLRFraxU=", "bCBOA");
      lllIIIIlI[lllllIIlI[0]] = llllIlIIII("m/CgSw788BU=", "WBlFQ");
      lllIIIIlI[lllllIIlI[19]] = llllIIlllI("AAg6MyECAD1SfD0=", "gmNzU");
      lllIIIIlI[lllllIIlI[20]] = llllIlIIII("WRBtglA0ZrA=", "zgCbA");
      lllIIIIlI[lllllIIlI[21]] = llllIlIIII("s4yvfT84FA6rS4ob0nBCMw==", "BNicu");
      lllIIIIlI[lllllIIlI[22]] = llllIIlllI("FCsdFRA0LBQJFg==", "wCxfd");
      lllIIIIlI[lllllIIlI[23]] = llllIIlIIl("4e4h0lIPBqeVMHMvyxcMewfuqi88+e3DNz8Xu5g8TaE=", "BNirH");
      lllIIIIlI[lllllIIlI[24]] = llllIIlIIl("ALzndPABZHKu2GAGCN+c9g==", "HDqXd");
      lllIIIIlI[lllllIIlI[25]] = llllIIlllI("DDMuPxAeOjEJChh+czY=", "kVZlx");
      lllIIIIlI[lllllIIlI[26]] = llllIlIIII("7B3jUng2iZA9vcEzwfamYA==", "yVkQQ");
      lllIIIIlI[lllllIIlI[27]] = llllIIlllI("PRItPAYvGzIKHBkYNQAccl4VBQ8sFnYOGS5YGgACNQVi", "ZwYon");
      lllIIIIlI[lllllIIlI[28]] = llllIlIIII("UIfE+ycgcK4+8nfU8wedDw==", "upUyZ");
      lllIIIIlI[lllllIIlI[29]] = llllIIlllI("ChwxKRcJHDcvEQgKMR9RRCM=", "myEly");
      lllIIIIlI[lllllIIlI[30]] = llllIIlIIl("zBHyvSTaTfLdY5PRVIF0zA==", "LhMDD");
      lllIIIIlI[lllllIIlI[31]] = llllIIlIIl("QPOBz1SOVcWsVy1pgiDoBJzu3qPv8Mz/q3ynxWewCjmViw6wVkP6Cw==", "OcpFC");
      lllIIIIlI[lllllIIlI[32]] = llllIlIIII("RPXAp0N75S19kWhQas54Dg==", "isxii");
      lllIIIIlI[lllllIIlI[33]] = llllIIlIIl("tLBSGWUlVNy2lBKGeSs3og==", "uJUpo");
      lllIIIIlI[lllllIIlI[34]] = llllIlIIII("3eGrzu3dArcwkA0EPG2k0A==", "JvNwq");
      lllIIIIlI[lllllIIlI[35]] = llllIIlIIl("vz02YBvLjsqny4EyG8cozA785vOK+oHV", "VHvIY");
      lllIIIIlI[lllllIIlI[36]] = llllIIlllI("LSg/RRwUKS4B", "cGKes");
      lllIIIIlI[lllllIIlI[37]] = llllIIlllI("fg==", "Sjuol");
      lllIIIIlI[lllllIIlI[38]] = llllIIlIIl("s7sRuVnuvXo=", "SrhBb");
      lllIIIIlI[lllllIIlI[48]] = llllIlIIII("R0TAsROiEmA=", "qUsmM");
      lllIIIIlI[lllllIIlI[49]] = llllIIlIIl("g3fXVhcjco+mNwT1JcJBn4GQ6GkXoWh2+CUFjk5Nyzc=", "WZdBM");
      lllIIIIlI[lllllIIlI[51]] = llllIIlIIl("r0nCvcGSSP4=", "hhMnt");
      lllIIIIlI[lllllIIlI[52]] = llllIIlIIl("VQMYSev4Ofs=", "Olxsp");
      lllIIIIlI[lllllIIlI[53]] = llllIlIIII("aqnoGN3GXJo=", "QaUAG");
      lllIIIIlI[lllllIIlI[54]] = llllIIlllI("DToIKSs=", "LVxAJ");
      lllIIIIlI[lllllIIlI[55]] = llllIIlllI("GwYMKHgWAxIlOQ==", "WobMX");
      lllIIIIlI[lllllIIlI[56]] = llllIIlllI("GjgnISE4Jw==", "JTFXD");
      lllIIIIlI[lllllIIlI[57]] = llllIIlIIl("v9OtOsnkmuM=", "VhQWN");
      lllIIIIlI[lllllIIlI[58]] = llllIIlIIl("aK2mnA5rVkI=", "vSOnz");
      lllIIIIlI[lllllIIlI[59]] = llllIlIIII("7oqPz7ul8nPKKE9gPXwYxQ==", "jSWeS");
      lllIIIIlI[lllllIIlI[60]] = llllIIlIIl("itTynUWewRs=", "hvfGe");
      lllIIIIlI[lllllIIlI[61]] = llllIIlllI("CSIUJAE5", "JJqWu");
      lllIIIIlI[lllllIIlI[62]] = llllIIlIIl("jeK+6jKfcGBwzlswQqxFqw==", "orUOS");
      lllIIIIlI[lllllIIlI[63]] = llllIIlIIl("VYaWIBs8YooGSYxaUiI2Ug==", "VHguZ");
      lllIIIIlI[lllllIIlI[64]] = llllIIlIIl("SxE5D99EzxFxGkXJKipDhw==", "LMKQm");
      lllIIIIlI[lllllIIlI[65]] = llllIlIIII("OTHQsfGg+IvYjOG2NzEX1A==", "FbynY");
      lllIIIIlI[lllllIIlI[50]] = llllIIlIIl("9ZIUrlGl9ryJr969SWfU30pYjZtjLaIl", "gToTd");
      lllIIIIlI[lllllIIlI[66]] = llllIlIIII("IjxuyONPEzap/f7KgiLVWQ==", "ejnDJ");
      lllIIIIlI[lllllIIlI[67]] = llllIIlIIl("gU41t0JQY3fMHAN0Hqnqlw==", "yYvGs");
   }

   @JvmName(
      name = "Ⱬ"
   )
   private final boolean Ⱬ() {
      return (Boolean)this.ɡ.ⲋ(this, ⲋ[lllllIIlI[13]]);
   }

   @JvmName(
      name = "u"
   )
   private final Ꝉ.ⲋ u() {
      return (Ꝉ.ⲋ)this.u.ⲋ(this, ⲋ[lllllIIlI[2]]);
   }

   @JvmName(
      name = "ⲡ"
   )
   private final boolean ⲡ() {
      return (Boolean)this.ⲡ.ⲋ(this, ⲋ[lllllIIlI[9]]);
   }

   protected void Đ() {
      super.Đ();
      this.ⱯꝣѺ.clear();
      this.ꙑứ.clear();
   }

   private static void lIIIIllllII() {
      lllllIIlI = new int[69];
      lllllIIlI[0] = 167 ^ 181;
      lllllIIlI[1] = (" ".length() ^ 120 ^ 27) & (32 + 148 - 122 + 184 ^ 94 + 83 - 80 + 47 ^ -" ".length());
      lllllIIlI[2] = " ".length();
      lllllIIlI[3] = "  ".length();
      lllllIIlI[4] = "   ".length();
      lllllIIlI[5] = 79 ^ 11 ^ 80 ^ 16;
      lllllIIlI[6] = 171 ^ 174;
      lllllIIlI[7] = 24 + 21 - -27 + 59 ^ 103 + 91 - 115 + 54;
      lllllIIlI[8] = 60 + 48 - 53 + 73 ^ 31 + 116 - 40 + 28;
      lllllIIlI[9] = 25 ^ 17;
      lllllIIlI[10] = 57 + 34 - 9 + 94 ^ 81 + 77 - 71 + 98;
      lllllIIlI[11] = 158 ^ 148;
      lllllIIlI[12] = 52 ^ 63;
      lllllIIlI[13] = 52 ^ 10 ^ 5 ^ 55;
      lllllIIlI[14] = 45 + 84 - 122 + 193 ^ 14 + 97 - 7 + 93;
      lllllIIlI[15] = 110 ^ 46 ^ 72 ^ 6;
      lllllIIlI[16] = 221 ^ 179 ^ 249 ^ 152;
      lllllIIlI[17] = 57 ^ 108 ^ 24 ^ 93;
      lllllIIlI[18] = 186 ^ 171;
      lllllIIlI[19] = 192 ^ 158 ^ 23 ^ 90;
      lllllIIlI[20] = 41 + 64 - 101 + 148 ^ 84 + 100 - 91 + 47;
      lllllIIlI[21] = 176 ^ 163 ^ 188 ^ 186;
      lllllIIlI[22] = 146 ^ 132;
      lllllIIlI[23] = 100 ^ 85 ^ 132 ^ 162;
      lllllIIlI[24] = 166 ^ 190;
      lllllIIlI[25] = 129 + 126 - 170 + 53 ^ 141 + 104 - 222 + 124;
      lllllIIlI[26] = 129 ^ 155;
      lllllIIlI[27] = 133 ^ 158;
      lllllIIlI[28] = 101 ^ 27 ^ 7 ^ 101;
      lllllIIlI[29] = 118 ^ 77 ^ 174 ^ 136;
      lllllIIlI[30] = 133 ^ 155;
      lllllIIlI[31] = 147 ^ 140;
      lllllIIlI[32] = 107 ^ 97 ^ 13 ^ 39;
      lllllIIlI[33] = 155 ^ 186;
      lllllIIlI[34] = 65 ^ 99;
      lllllIIlI[35] = 85 ^ 118;
      lllllIIlI[36] = 87 ^ 83 ^ 80 ^ 112;
      lllllIIlI[37] = 136 ^ 156 ^ 51 ^ 2;
      lllllIIlI[38] = 58 ^ 28;
      lllllIIlI[39] = -16561 & 17592;
      lllllIIlI[40] = -(-12681 & 30191) & -8209 & 32631;
      lllllIIlI[41] = -8262 & 15175;
      lllllIIlI[42] = 103 + 73 - 169 + 146 ^ 68 + 104 - 155 + 149;
      lllllIIlI[43] = -(-5249 & 29831) & -9 & 28143;
      lllllIIlI[44] = -20617 & 23464;
      lllllIIlI[45] = -25477 & 28630;
      lllllIIlI[46] = -(12 + 180 - 123 + 124) & -17418 & 21963;
      lllllIIlI[47] = -" ".length();
      lllllIIlI[48] = 83 ^ 116;
      lllllIIlI[49] = 51 ^ 27;
      lllllIIlI[50] = 76 ^ 36 ^ 232 ^ 184;
      lllllIIlI[51] = 118 ^ 95;
      lllllIIlI[52] = 181 ^ 159;
      lllllIIlI[53] = 174 ^ 133;
      lllllIIlI[54] = 254 ^ 160 ^ 71 ^ 53;
      lllllIIlI[55] = 10 ^ 64 ^ 77 ^ 42;
      lllllIIlI[56] = 69 ^ 107;
      lllllIIlI[57] = 91 ^ 116;
      lllllIIlI[58] = 10 ^ 58;
      lllllIIlI[59] = 131 ^ 178;
      lllllIIlI[60] = 63 ^ 13;
      lllllIIlI[61] = 109 ^ 94;
      lllllIIlI[62] = 28 ^ 40;
      lllllIIlI[63] = 52 ^ 1;
      lllllIIlI[64] = 24 ^ 46;
      lllllIIlI[65] = 4 ^ 51;
      lllllIIlI[66] = 21 ^ 44;
      lllllIIlI[67] = 69 ^ 127;
      lllllIIlI[68] = 67 ^ 120;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final Color ᴃᎲ() {
      return (Color)this.ᴃᎲ.ⲋ(this, ⲋ[lllllIIlI[3]]);
   }

   public void Ἠ() {
      super.Ἠ();
      if (!lIIIIllllll(lIllIIIIlllIlII.ᾥ())) {
         Exception lIllIIIIlllIIlI = (Iterable)lIllIIIIlllIlII.ı５();
         int lIllIIIIlllIIIl = lllllIIlI[1];
         Iterator lIllIIIIlllIIII = lIllIIIIlllIIlI.iterator();

         do {
            if (!lIIIIlllllI(lIllIIIIlllIIII.hasNext())) {
               return;
            }

            Exception lIllIIIIllIllll = lIllIIIIlllIIII.next();
            byte lIllIIIIllIlllI = (Entity)lIllIIIIllIllll;
            float lIllIIIIllIllIl = lllllIIlI[1];
            if (lIIIIllllll(lIllIIIIlllIlII.ⱯꝣѺ.containsKey(lIllIIIIllIlllI))) {
               short lIllIIIIllIllII = lIllIIIIlllIlII.ⲋ(lIllIIIIllIlllI);
               if (lIIIlIIIIIl(lIllIIIIllIllII)) {
                  ((Map)lIllIIIIlllIlII.ⱯꝣѺ).put(lIllIIIIllIlllI, lllIIIIlI[lllllIIlI[36]]);
                  "".length();
                  "".length();
                  if (-" ".length() > 0) {
                     return;
                  }
               } else {
                  double lIllIIIIllIlIll = (String)lIllIIIIlllIlII.ꙑứ.get(lIllIIIIllIllII);
                  if (lIIIlIIIIlI(lIllIIIIllIlIll)) {
                     ((Map)lIllIIIIlllIlII.ⱯꝣѺ).put(lIllIIIIllIlllI, lIllIIIIllIlIll);
                     "".length();
                     "".length();
                     if ((69 + 131 - 169 + 136 ^ 52 + 95 - -11 + 5) != (150 + 4 - 126 + 169 ^ 71 + 72 - 69 + 119)) {
                        return;
                     }
                  } else {
                     String lIllIIIIllIlIlI = StringsKt.replace$default(lIllIIIIllIllII.toString(), lllIIIIlI[lllllIIlI[37]], lllIIIIlI[lllllIIlI[38]], (boolean)lllllIIlI[1], lllllIIlI[5], (Object)null);
                     a.〥ҳⱆ.〥ҳⱆ.ĂƂ().execute((Runnable)(new Ꝉ$1(lIllIIIIllIlIlI, lIllIIIIllIllII, lIllIIIIllIlllI, lIllIIIIlllIlII)));
                  }
               }
            }

            "".length();
         } while(-"   ".length() <= 0);

      }
   }

   private static boolean lIIIlIIIIIl(Object var0) {
      return var0 == null;
   }

   @ȵ
   public final void ⲋ(@NotNull Pre<EntityLivingBase> lIllIIIIlIllllI) {
      if (lIIIlIIIlII(lIllIIIIlIlllll.u(), Ꝉ.ⲋ.ⲋ) && lIIIIlllllI(lIllIIIIlIlllll.ⲋ(lIllIIIIlIllllI.getEntity())) && lIIIIlllllI(lIllIIIIlIlllll.ɧῙ)) {
         GlStateManager.func_187441_d(1.5F);
         GlStateManager.func_187409_d(lllllIIlI[39], lllllIIlI[40]);
         GlStateManager.func_179097_i();
         GlStateManager.func_179090_x();
         GlStateManager.func_179140_f();
         if (lIIIIlllllI(lIllIIIIlIllllI.getEntity() instanceof EntityMob)) {
            GL11.glColor4f(1.0F, 0.0F, 0.0F, (float)lIllIIIIlIlllll.Ἒⅾ());
            "".length();
            if ((236 ^ 132 ^ 44 ^ 64) <= 0) {
               return;
            }
         } else if (lIIIIlllllI(Ṑ.ⲋ((Entity)lIllIIIIlIllllI.getEntity()))) {
            GL11.glColor4f(0.0F, 1.0F, 0.0F, (float)lIllIIIIlIlllll.Ἒⅾ());
            "".length();
            if (((133 ^ 199) & ~(90 ^ 24)) == -" ".length()) {
               return;
            }
         } else if (lIIIIlllllI(lIllIIIIlIllllI.getEntity() instanceof EntityPlayer)) {
            GL11.glColor4f(0.0F, 0.0F, 1.0F, (float)lIllIIIIlIlllll.Ἒⅾ());
            "".length();
            if (((112 + 13 - 60 + 77 ^ 61 + 149 - 75 + 36) & (130 + 34 - 52 + 57 ^ 90 + 125 - 123 + 48 ^ -" ".length())) < 0) {
               return;
            }
         }
      }

   }

   @JvmName(
      name = "Ӄ"
   )
   private final Color Ӄ() {
      return (Color)this.Ɏ.ⲋ(this, ⲋ[lllllIIlI[12]]);
   }

   @JvmName(
      name = "ϛⰄ"
   )
   private final boolean ϛⰄ() {
      return (Boolean)this.ϛⰄ.ⲋ(this, ⲋ[lllllIIlI[6]]);
   }

   static {
      lIIIIllllII();
      lIIIIlllIII();
      KProperty[] var10000 = new KProperty[lllllIIlI[0]];
      var10000[lllllIIlI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[1]], lllIIIIlI[lllllIIlI[2]]));
      var10000[lllllIIlI[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[3]], lllIIIIlI[lllllIIlI[4]]));
      var10000[lllllIIlI[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[5]], lllIIIIlI[lllllIIlI[6]]));
      var10000[lllllIIlI[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[7]], lllIIIIlI[lllllIIlI[8]]));
      var10000[lllllIIlI[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[9]], lllIIIIlI[lllllIIlI[10]]));
      var10000[lllllIIlI[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[11]], lllIIIIlI[lllllIIlI[12]]));
      var10000[lllllIIlI[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[13]], lllIIIIlI[lllllIIlI[14]]));
      var10000[lllllIIlI[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[15]], lllIIIIlI[lllllIIlI[16]]));
      var10000[lllllIIlI[9]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[17]], lllIIIIlI[lllllIIlI[18]]));
      var10000[lllllIIlI[10]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[0]], lllIIIIlI[lllllIIlI[19]]));
      var10000[lllllIIlI[11]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[20]], lllIIIIlI[lllllIIlI[21]]));
      var10000[lllllIIlI[12]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[22]], lllIIIIlI[lllllIIlI[23]]));
      var10000[lllllIIlI[13]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[24]], lllIIIIlI[lllllIIlI[25]]));
      var10000[lllllIIlI[14]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[26]], lllIIIIlI[lllllIIlI[27]]));
      var10000[lllllIIlI[15]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[28]], lllIIIIlI[lllllIIlI[29]]));
      var10000[lllllIIlI[16]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[30]], lllIIIIlI[lllllIIlI[31]]));
      var10000[lllllIIlI[17]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[32]], lllIIIIlI[lllllIIlI[33]]));
      var10000[lllllIIlI[18]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꝉ.class), lllIIIIlI[lllllIIlI[34]], lllIIIIlI[lllllIIlI[35]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ᾥ"
   )
   private final boolean ᾥ() {
      return (Boolean)this.Ꙗ.ⲋ(this, ⲋ[lllllIIlI[17]]);
   }

   private static int lIIIlIIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIIlIIIIII(int var0) {
      return var0 <= 0;
   }

   private static boolean lIIIlIIIIlI(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "ς"
   )
   private final boolean ς() {
      return (Boolean)this.ς.ⲋ(this, ⲋ[lllllIIlI[7]]);
   }

   @ȵ
   public final void ⲋ(@NotNull Post<EntityLivingBase> var1) {
      if (lIIIlIIIlII(this.u(), Ꝉ.ⲋ.ⲋ) && lIIIIlllllI(this.ⲋ(var1.getEntity()))) {
         if (lIIIIllllll(this.ɧῙ)) {
            this.ɧῙ = (boolean)lllllIIlI[2];
            var1.getRenderer().func_76986_a(var1.getEntity(), var1.getX(), var1.getY(), var1.getZ(), 0.0F, var1.getPartialRenderTick());
            this.ɧῙ = (boolean)lllllIIlI[1];
         }

         GL11.glColor3f(1.0F, 1.0F, 1.0F);
         GlStateManager.func_187441_d(1.0F);
         GlStateManager.func_187409_d(lllllIIlI[39], lllllIIlI[41]);
         GlStateManager.func_179126_j();
         GlStateManager.func_179098_w();
         GlStateManager.func_179145_e();
      }

   }

   @JvmName(
      name = "ᶐ"
   )
   private final boolean ᶐ() {
      return (Boolean)this.ᵴἥ.ⲋ(this, ⲋ[lllllIIlI[11]]);
   }

   @JvmName(
      name = "Ꜥ"
   )
   private final boolean Ꜥ() {
      return (Boolean)this.Ꜥ.ⲋ(this, ⲋ[lllllIIlI[8]]);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final boolean ⲋ() {
      return this.ɧῙ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final double ĂƂ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lllllIIlI[1]])).doubleValue();
   }

   public Ꝉ() {
      super(lllIIIIlI[lllllIIlI[48]], lllIIIIlI[lllllIIlI[49]], ı５.〥ҳⱆ, lllllIIlI[1], (boolean)lllllIIlI[1], (boolean)lllllIIlI[1], lllllIIlI[50], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lllIIIIlI[lllllIIlI[51]], 1000.0D).u((Object)0.0D).ᴃᎲ((Object)1000.0D);
      this.u = this.ⲋ(lllIIIIlI[lllllIIlI[52]], Ꝉ.ⲋ.ⲋ);
      this.ᴃᎲ = this.ⲋ(lllIIIIlI[lllllIIlI[53]], Color.red);
      this.〥ҳⱆ = this.ⲋ(lllIIIIlI[lllllIIlI[54]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.Ἒⅾ = this.ⲋ(lllIIIIlI[lllllIIlI[55]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.ϛⰄ = this.ⲋ(lllIIIIlI[lllllIIlI[56]], Boolean.valueOf((boolean)lllllIIlI[2]));
      this.ς = this.ⲋ(lllIIIIlI[lllllIIlI[57]], Boolean.valueOf((boolean)lllllIIlI[2]));
      this.Ꜥ = this.ⲋ(lllIIIIlI[lllllIIlI[58]], Boolean.valueOf((boolean)lllllIIlI[2]));
      this.ⲡ = this.ⲋ(lllIIIIlI[lllllIIlI[59]], Boolean.valueOf((boolean)lllllIIlI[1]));
      this.Đ = this.ⲋ(lllIIIIlI[lllllIIlI[60]], Boolean.valueOf((boolean)lllllIIlI[1]));
      this.ᵴἥ = this.ⲋ(lllIIIIlI[lllllIIlI[61]], Boolean.valueOf((boolean)lllllIIlI[2]));
      this.Ɏ = this.ⲋ(lllIIIIlI[lllllIIlI[62]], Color.yellow);
      this.ɡ = this.ⲋ(lllIIIIlI[lllllIIlI[63]], Boolean.valueOf((boolean)lllllIIlI[2]));
      this.ⴜ = this.ⲋ(lllIIIIlI[lllllIIlI[64]], Color.pink);
      this.ͷ = this.ⲋ(lllIIIIlI[lllllIIlI[65]], Boolean.valueOf((boolean)lllllIIlI[2]));
      this.Ⳓ = this.ⲋ(lllIIIIlI[lllllIIlI[50]], Color.magenta.darker());
      this.Ꙗ = this.ⲋ(lllIIIIlI[lllllIIlI[66]], Boolean.valueOf((boolean)lllllIIlI[2]));
      this.Ꞑ = this.ⲋ(lllIIIIlI[lllllIIlI[67]], 5.0D).u((Object)1.0D).ᴃᎲ((Object)10.0D);
      this.ⱯꝣѺ = new ConcurrentHashMap();
      this.ꙑứ = new ConcurrentHashMap();
   }

   private static int lIIIlIIIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private final UUID ⲋ(@NotNull Entity lIllIIIlIIIlIll) {
      UUID var10000;
      if (lIIIIlllllI(lIllIIIlIIIlIll instanceof AbstractHorse)) {
         var10000 = ((AbstractHorse)lIllIIIlIIIlIll).func_184780_dh();
         "".length();
         if (((56 + 8 - -46 + 137 ^ 109 + 84 - 100 + 80) & (115 + 118 - 192 + 167 ^ 101 + 59 - 143 + 121 ^ -" ".length())) != 0) {
            return null;
         }
      } else if (lIIIIlllllI(lIllIIIlIIIlIll instanceof IEntityOwnable)) {
         var10000 = ((IEntityOwnable)lIllIIIlIIIlIll).func_184753_b();
         "".length();
         if ((123 + 106 - 213 + 126 ^ 122 + 21 - 14 + 10) <= 0) {
            return null;
         }
      } else {
         var10000 = null;
      }

      return var10000;
   }

   private static String llllIlIIII(String lIlIllllIllllIl, String lIlIllllIllllII) {
      try {
         int lIlIllllIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllllIllllII.getBytes(StandardCharsets.UTF_8)), lllllIIlI[9]), "DES");
         boolean lIlIllllIlllIII = Cipher.getInstance("DES");
         lIlIllllIlllIII.init(lllllIIlI[3], lIlIllllIlllIIl);
         return new String(lIlIllllIlllIII.doFinal(Base64.getDecoder().decode(lIlIllllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIlIIlIIl(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIIIIlllllI(int var0) {
      return var0 != 0;
   }

   private static boolean lIIIIllllll(int var0) {
      return var0 == 0;
   }

   private static boolean lIIIlIIIlII(Object var0, Object var1) {
      return var0 == var1;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003"},
      d2 = {"La/Ꝉ$ⲋ;", "ⲋ", "ĂƂ", "u", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private static void lIllllIII() {
         lIlIllll = new int[5];
         lIlIllll[0] = "   ".length();
         lIlIllll[1] = (172 ^ 165) & ~(207 ^ 198);
         lIlIllll[2] = " ".length();
         lIlIllll[3] = "  ".length();
         lIlIllll[4] = 163 ^ 171;
      }

      static {
         lIllllIII();
         lIlllIlIl();
         Ꝉ.ⲋ[] var10001 = new Ꝉ.ⲋ[lIlIllll[0]];
         var10001[lIlIllll[1]] = ⲋ = new Ꝉ.ⲋ(lIlIllIl[lIlIllll[1]], lIlIllll[1]);
         var10001[lIlIllll[2]] = ĂƂ = new Ꝉ.ⲋ(lIlIllIl[lIlIllll[2]], lIlIllll[2]);
         var10001[lIlIllll[3]] = u = new Ꝉ.ⲋ(lIlIllIl[lIlIllll[3]], lIlIllll[3]);
      }

      private static void lIlllIlIl() {
         lIlIllIl = new String[lIlIllll[0]];
         lIlIllIl[lIlIllll[1]] = lIlllIIll("9wQ0Zw7nBjMZEs5f+Wen+w==", "ffbiF");
         lIlIllIl[lIlIllll[2]] = lIlllIlII("MkDCqJPcupE=", "FyegZ");
         lIlIllIl[lIlIllll[3]] = lIlllIlII("0Sv+jsyY+KY=", "DInvr");
      }

      private static String lIlllIIll(String lllIIllIlIIlIll, String lllIIllIlIIlIlI) {
         try {
            SecretKeySpec lllIIllIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIllll[4]), "DES");
            Cipher lllIIllIlIIllll = Cipher.getInstance("DES");
            lllIIllIlIIllll.init(lIlIllll[3], lllIIllIlIlIIII);
            return new String(lllIIllIlIIllll.doFinal(Base64.getDecoder().decode(lllIIllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private ⲋ() {
      }

      private static String lIlllIlII(String lllIIllIlIllIlI, String lllIIllIlIllIIl) {
         try {
            SecretKeySpec lllIIllIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            String lllIIllIlIlIlIl = Cipher.getInstance("Blowfish");
            lllIIllIlIlIlIl.init(lIlIllll[3], lllIIllIlIlllIl);
            return new String(lllIIllIlIlIlIl.doFinal(Base64.getDecoder().decode(lllIIllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }
}
