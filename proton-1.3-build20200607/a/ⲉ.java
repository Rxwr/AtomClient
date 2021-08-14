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
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u001bB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0002\u0010\u0015J\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0004\u0010\u0017J\u000f\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0004\u0010\tJ\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\fR\u001e\u0010\u0004\u001a\u0006*\u00020\u00010\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004"},
   d2 = {"La/ⲉ;", "Lnet/minecraft/client/Minecraft;", "ĂƂ", "Lnet/minecraft/client/Minecraft;", "ⲋ", "", "()Z", "Lnet/minecraft/util/math/Vec3d;", "Ἒⅾ", "()Lnet/minecraft/util/math/Vec3d;", "", "ᴃᎲ", "()D", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "", "Lnet/minecraft/item/ItemStack;", "u", "()Lkotlin/sequences/Sequence;", "Lnet/minecraft/item/Item;", "p0", "(Lnet/minecraft/item/Item;)I", "", "(Lnet/minecraft/item/Item;)Ljava/util/List;", "〥ҳⱆ", "<init>", "()V", ""}
)
public final class ⲉ {
   public final double ᴃᎲ() {
      float var1 = ĂƂ.field_71439_g.field_70177_z;
      if (lIllllIIII(lIlllIlIlI(ĂƂ.field_71439_g.field_191988_bg, 0.0F))) {
         var1 += 180.0F;
      }

      double llIIllIIIIIIIIl = 1.0F;
      if (lIllllIIII(lIlllIlIlI(ĂƂ.field_71439_g.field_191988_bg, 0.0F))) {
         llIIllIIIIIIIIl = -0.5F;
         "".length();
         if ("   ".length() == 0) {
            return 0.0D;
         }
      } else if (lIllllIIIl(lIlllIlIll(ĂƂ.field_71439_g.field_191988_bg, 0.0F))) {
         llIIllIIIIIIIIl = 0.5F;
      }

      if (lIllllIIIl(lIlllIlIll(ĂƂ.field_71439_g.field_70702_br, 0.0F))) {
         var1 -= 90.0F * llIIllIIIIIIIIl;
      }

      if (lIllllIIII(lIlllIlIlI(ĂƂ.field_71439_g.field_70702_br, 0.0F))) {
         var1 += 90.0F * llIIllIIIIIIIIl;
      }

      return Math.toRadians((double)var1);
   }

   public final int ĂƂ(@NotNull Item llIIllIIIIlIIIl) {
      if (lIlllIIlll(this.ĂƂ())) {
         Iterable llIIllIIIIIllll = (Iterable)ĂƂ.field_71439_g.field_71071_by.field_70462_a;
         int llIIllIIIIIlllI = lIllIIlII[0];
         Collection llIIllIIIIIllII = (Collection)(new ArrayList());
         int llIIllIIIIIlIll = lIllIIlII[0];
         Iterator llIIllIIIIIlIlI = llIIllIIIIIllll.iterator();

         Object llIIllIIIIIlIIl;
         ItemStack llIIllIIIIIlIII;
         int llIIllIIIIIIlll;
         while(lIlllIIlll(llIIllIIIIIlIlI.hasNext())) {
            llIIllIIIIIlIIl = llIIllIIIIIlIlI.next();
            llIIllIIIIIlIII = (ItemStack)llIIllIIIIIlIIl;
            llIIllIIIIIIlll = lIllIIlII[0];
            if (lIlllIIlll(Intrinsics.areEqual((Object)llIIllIIIIIlIII.field_151002_e, (Object)llIIllIIIIlIIIl))) {
               llIIllIIIIIllII.add(llIIllIIIIIlIIl);
               "".length();
               "".length();
               if (null != null) {
                  return (79 ^ 123) & ~(108 ^ 88);
               }
            }
         }

         llIIllIIIIIllll = (Iterable)((List)llIIllIIIIIllII);
         llIIllIIIIIlllI = lIllIIlII[0];
         llIIllIIIIIllII = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(llIIllIIIIIllll, lIllIIlII[3])));
         llIIllIIIIIlIll = lIllIIlII[0];
         llIIllIIIIIlIlI = llIIllIIIIIllll.iterator();

         do {
            if (!lIlllIIlll(llIIllIIIIIlIlI.hasNext())) {
               short llIIllIIIIlIIII = CollectionsKt.sumOfInt((Iterable)((List)llIIllIIIIIllII));
               if (lIlllIIlll(Intrinsics.areEqual((Object)ĂƂ.field_71439_g.func_184592_cb().field_151002_e, (Object)llIIllIIIIlIIIl))) {
                  llIIllIIIIlIIII += ĂƂ.field_71439_g.func_184592_cb().func_190916_E();
               }

               return llIIllIIIIlIIII;
            }

            llIIllIIIIIlIIl = llIIllIIIIIlIlI.next();
            llIIllIIIIIlIII = (ItemStack)llIIllIIIIIlIIl;
            llIIllIIIIIIlll = lIllIIlII[0];
            int llIIllIIIIIIlIl = llIIllIIIIIlIII.func_190916_E();
            llIIllIIIIIllII.add(llIIllIIIIIIlIl);
            "".length();
            "".length();
         } while(null == null);

         return (175 + 156 - 325 + 178 ^ 110 + 121 - 160 + 103) & (84 ^ 7 ^ 30 ^ 91 ^ -" ".length());
      } else {
         return lIllIIlII[0];
      }
   }

   public final double 〥ҳⱆ() {
      double var1 = ĂƂ.field_71439_g.field_70169_q - ĂƂ.field_71439_g.field_70165_t;
      double var3 = ĂƂ.field_71439_g.field_70167_r - ĂƂ.field_71439_g.field_70163_u;
      double var5 = ĂƂ.field_71439_g.field_70166_s - ĂƂ.field_71439_g.field_70161_v;
      double var7 = var1 * var1 + var3 * var3 + var5 * var5;
      int var9 = lIllIIlII[0];
      return Math.sqrt(var7) / (double)ĂƂ.field_71428_T.field_194149_e;
   }

   public final boolean ĂƂ() {
      int var10000;
      if (lIlllIlIII(Minecraft.func_71410_x().field_71439_g)) {
         var10000 = lIllIIlII[1];
         "".length();
         if (-" ".length() > "  ".length()) {
            return (boolean)((21 ^ 88) & ~(6 ^ 75));
         }
      } else {
         var10000 = lIllIIlII[0];
      }

      return (boolean)var10000;
   }

   private static int lIlllIlIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIllllIIIl(int var0) {
      return var0 > 0;
   }

   private static void lIlllIIlIl() {
      lIllIIlII = new int[6];
      lIllIIlII[0] = (88 ^ 97) & ~(251 ^ 194);
      lIllIIlII[1] = " ".length();
      lIllIIlII[2] = 77 ^ 96;
      lIllIIlII[3] = 155 ^ 145;
      lIllIIlII[4] = 76 + 64 - 90 + 100 ^ 139 + 65 - 48 + 2;
      lIllIIlII[5] = "  ".length();
   }

   private static boolean lIlllIIllI(Object var0) {
      return var0 == null;
   }

   @NotNull
   public final List<Integer> ⲋ(@NotNull Item llIIllIIIlIIlII) {
      int llIIllIIIlIIIlI = lIllIIlII[0];
      ArrayList llIIllIIIlIIIll = new ArrayList();
      if (lIlllIIlll(this.ĂƂ())) {
         llIIllIIIlIIIlI = lIllIIlII[0];
         int llIIllIIIlIIIIl = lIllIIlII[2];

         while(lIlllIlIIl(llIIllIIIlIIIlI, llIIllIIIlIIIIl)) {
            if (lIlllIIlll(Intrinsics.areEqual((Object)ĂƂ.field_71439_g.field_71071_by.func_70301_a(llIIllIIIlIIIlI).field_151002_e, (Object)llIIllIIIlIIlII))) {
               llIIllIIIlIIIll.add(llIIllIIIlIIIlI);
               "".length();
            }

            ++llIIllIIIlIIIlI;
            "".length();
            if ((193 ^ 150 ^ 20 ^ 70) == 0) {
               return null;
            }
         }
      }

      return (List)llIIllIIIlIIIll;
   }

   private static int lIlllIlIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private ⲉ() {
   }

   @NotNull
   public final Sequence<Pair<Integer, ItemStack>> u() {
      return SequencesKt.sequence((Function2)(new Function2<SequenceScope<? super Pair<? extends Integer, ? extends ItemStack>>, Continuation<? super Unit>, Object>((Continuation)null) {
         public final Object invoke(Object var1, Object var2) {
            return ((<undefinedtype>)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
         }

         private static boolean lIlIlIIlllI(Object var0, Object var1) {
            return var0 == var1;
         }

         private static boolean lIlIlIIllll(int var0, int var1) {
            return var0 < var1;
         }

         static {
            lIlIlIIllII();
            lIlIlIIlIll();
         }

         @Nullable
         public final Object invokeSuspend(@NotNull Object lIIlllIlllIlllI) {
            Object lIIlllIlllIlIlI = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            SequenceScope lIIlllIlllIllIl;
            int lIIlllIlllIllII;
            int lIIlllIlllIlIll;
            switch(lIIlllIlllIllll.ᴃᎲ) {
            case 0:
               ResultKt.throwOnFailure(lIIlllIlllIlllI);
               lIIlllIlllIllIl = lIIlllIlllIllll.〥ҳⱆ;
               lIIlllIlllIllII = lIIlllIlIl[0];
               lIIlllIlllIlIll = lIIlllIlIl[1];
               break;
            case 1:
               lIIlllIlllIlIll = lIIlllIlllIllll.u;
               lIIlllIlllIllII = lIIlllIlllIllll.ĂƂ;
               lIIlllIlllIllIl = (SequenceScope)lIIlllIlllIllll.ⲋ;
               ResultKt.throwOnFailure(lIIlllIlllIlllI);
               "".length();
               ++lIIlllIlllIllII;
               "".length();
               if ("   ".length() <= " ".length()) {
                  return null;
               }
               break;
            default:
               throw new IllegalStateException(lIIlllIlII[lIIlllIlIl[0]]);
            }

            do {
               if (!lIlIlIIllIl(lIIlllIlllIllII, lIIlllIlllIlIll)) {
                  return Unit.INSTANCE;
               }

               Pair var10001 = TuplesKt.to(Boxing.boxInt(lIIlllIlllIllII), ⲉ.ⲋ(ⲉ.ⲋ).field_71439_g.field_71071_by.func_70301_a(lIIlllIlllIllII));
               lIIlllIlllIllll.ⲋ = lIIlllIlllIllIl;
               lIIlllIlllIllll.ĂƂ = lIIlllIlllIllII;
               lIIlllIlllIllll.u = lIIlllIlllIlIll;
               lIIlllIlllIllll.ᴃᎲ = lIIlllIlIl[2];
               if (lIlIlIIlllI(lIIlllIlllIllIl.yield(var10001, lIIlllIlllIllll), lIIlllIlllIlIlI)) {
                  return lIIlllIlllIlIlI;
               }

               "".length();
               ++lIIlllIlllIllII;
               "".length();
            } while("   ".length() > " ".length());

            return null;
         }

         @NotNull
         public final Continuation<Unit> create(@Nullable Object var1, @NotNull Continuation<?> var2) {
            Function2 var3 = new <anonymous constructor>(var2);
            var3.〥ҳⱆ = (SequenceScope)var1;
            return var3;
         }

         private static boolean lIlIlIIllIl(int var0, int var1) {
            return var0 <= var1;
         }

         private static void lIlIlIIllII() {
            lIIlllIlIl = new int[4];
            lIIlllIlIl[0] = (16 ^ 14 ^ 59 ^ 121) & (79 + 92 - 162 + 149 ^ 153 + 19 - 153 + 175 ^ -" ".length());
            lIIlllIlIl[1] = 158 + 173 - 216 + 74 ^ 19 + 78 - 93 + 177;
            lIIlllIlIl[2] = " ".length();
            lIIlllIlIl[3] = "  ".length();
         }

         private static void lIlIlIIlIll() {
            lIIlllIlII = new String[lIIlllIlIl[2]];
            lIIlllIlII[lIIlllIlIl[0]] = lIlIlIIlIlI("LzQ9C2k4OnFAOykmJAosa3UzAi8jJzRHbiU7JwgiKXJxECA4PXEEJj46JBMgIjA=", "LUQgI");
         }

         private static String lIlIlIIlIlI(String lIIlllIllIlllll, String lIIlllIllIllIIl) {
            lIIlllIllIlllll = new String(Base64.getDecoder().decode(lIIlllIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            boolean lIIlllIllIllIII = new StringBuilder();
            char[] lIIlllIllIlllII = lIIlllIllIllIIl.toCharArray();
            short lIIlllIllIlIllI = lIIlllIlIl[0];
            String lIIlllIllIlIlIl = lIIlllIllIlllll.toCharArray();
            boolean lIIlllIllIlIlII = lIIlllIllIlIlIl.length;
            int lIIlllIllIlIIll = lIIlllIlIl[0];

            do {
               if (!lIlIlIIllll(lIIlllIllIlIIll, lIIlllIllIlIlII)) {
                  return String.valueOf(lIIlllIllIllIII);
               }

               char lIIlllIlllIIIII = lIIlllIllIlIlIl[lIIlllIllIlIIll];
               lIIlllIllIllIII.append((char)(lIIlllIlllIIIII ^ lIIlllIllIlllII[lIIlllIllIlIllI % lIIlllIllIlllII.length]));
               "".length();
               ++lIIlllIllIlIllI;
               ++lIIlllIllIlIIll;
               "".length();
            } while(" ".length() != 0);

            return null;
         }
      }));
   }

   private static boolean lIlllIlIIl(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean lIlllIlIII(Object var0) {
      return var0 != null;
   }

   private static boolean lIlllIIlll(int var0) {
      return var0 != 0;
   }

   private static boolean lIllllIIII(int var0) {
      return var0 < 0;
   }

   static {
      lIlllIIlIl();
      lIlllIIlII();
      ⲉ var0 = new ⲉ();
      ⲋ = var0;
      ĂƂ = Minecraft.func_71410_x();
   }

   @NotNull
   public final Vec3d ⲋ() {
      ơ߀ var2 = ơ߀.ⲋ;
      Class var3 = ₸ғ.class;
      int var4 = lIllIIlII[0];
      Object var10000 = var2.ⲋ().get(₸ғ.class);
      if (lIlllIIllI(var10000)) {
         throw new TypeCastException(lIllIIIll[lIllIIlII[0]]);
      } else {
         long llIIllIIIlIlllI = (₸ғ)((ⳅ)((₸ғ)var10000));
         Vec3d var5;
         if (lIlllIIlll(llIIllIIIlIlllI.Ɏ())) {
            var5 = llIIllIIIlIlllI.〥ҳⱆ();
            "".length();
            if ("  ".length() < " ".length()) {
               return null;
            }
         } else {
            var5 = ĂƂ.field_71439_g.func_174791_d();
         }

         return var5;
      }
   }

   @NotNull
   public final Vec3d Ἒⅾ() {
      EntityPlayerSP var1 = Minecraft.func_71410_x().field_71439_g;
      float var2 = MathHelper.func_76134_b(var1.field_70177_z * 0.017453292F - (float)3.141592653589793D);
      float var3 = MathHelper.func_76126_a(var1.field_70177_z * 0.017453292F - (float)3.141592653589793D);
      float var4 = -MathHelper.func_76134_b(var1.field_70125_A * 0.017453292F);
      float var5 = MathHelper.func_76126_a(var1.field_70125_A * 0.017453292F);
      return new Vec3d((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   private static String lIlllIIIlI(String llIIlIllllllIIl, String llIIlIllllllIII) {
      try {
         short llIIlIlllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIllllllIII.getBytes(StandardCharsets.UTF_8)), lIllIIlII[4]), "DES");
         String llIIlIlllllIlII = Cipher.getInstance("DES");
         llIIlIlllllIlII.init(lIllIIlII[5], llIIlIlllllIlIl);
         return new String(llIIlIlllllIlII.doFinal(Base64.getDecoder().decode(llIIlIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlllIIlII() {
      lIllIIIll = new String[lIllIIlII[1]];
      lIllIIIll[lIllIIlII[0]] = lIlllIIIlI("3yRa79SrQIrzmsb8D6rZAtIfhBkoKCOpCkTDX/MN4lsHP2rMkoflzOaZJ8sT56EI+Ju0dRwtY4FxjOjbLa9DoDqwvpmY27RBFP39n+DQ1e46neLfm7au2Q==", "ZDbJK");
   }
}
