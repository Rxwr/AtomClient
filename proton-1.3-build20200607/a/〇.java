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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020':\u0002\u0006\u000bB\u0007¢\u0006\u0004\b&\u0010\"J!\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000b\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J\u0015\u0010\u0006\u001a\u00020$*\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0006\u0010%R\"\u0010\u0006\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R\"\u0010\u000b\u001a\u00020\u00078G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u0086\u0084\u0002R&\u0010\t\u001a\u0006*\u00020\f0\f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\b\u0010\u000e¨\u0006\u0086\u0084\u0002R\"\u0010\b\u001a\u00020\f8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\r\u0010\u000e¨\u0006\u0086\u0084\u0002R,\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0082\u000eR\"\u0010\u0004\u001a\u00020\u00158G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0086\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00178G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\u000b\u0010\u0018¨\u0006\u0086\u0084\u0002R&\u0010\u001b\u001a\u00020\u00158\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\t\u0010\u001c¨\u0006\u0086\u000eR\"\u0010\u0019\u001a\u00020\u00158G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/〇;", "", "ϛⰄ", "La/ⅹ;", "Ἒⅾ", "()D", "ⲋ", "La/〇$ĂƂ;", "ᴃᎲ", "u", "()La/〇$ĂƂ;", "ĂƂ", "Ljava/awt/Color;", "〥ҳⱆ", "()Ljava/awt/Color;", "", "Lkotlin/Pair;", "Lnet/minecraft/util/math/BlockPos;", "La/〇$ⲋ;", "ⲡ", "Ljava/util/List;", "", "()I", "", "()Z", "Ꜥ", "I", "ς", "(I)V", "()Ljava/util/List;", "p0", "(Lnet/minecraft/util/math/BlockPos;)La/〇$ⲋ;", "", "Ἠ", "()V", "ἶṗ", "Lnet/minecraft/block/Block;", "(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/Block;", "<init>", "La/ⳅ;"}
)
public final class 〇 extends ⳅ {
   private static void lllIIl() {
      lIIIl = new int[32];
      lIIIl[0] = 101 + 81 - 46 + 39 ^ 87 + 109 - 124 + 96;
      lIIIl[1] = (64 ^ 111) & ~(237 ^ 194);
      lIIIl[2] = " ".length();
      lIIIl[3] = "  ".length();
      lIIIl[4] = "   ".length();
      lIIIl[5] = 14 ^ 55 ^ 107 ^ 86;
      lIIIl[6] = 62 ^ 59;
      lIIIl[7] = 49 + 42 - 6 + 78 ^ 76 + 49 - 14 + 54;
      lIIIl[8] = 156 ^ 148;
      lIIIl[9] = 58 ^ 42 ^ 186 ^ 163;
      lIIIl[10] = 189 ^ 183;
      lIIIl[11] = 120 + 18 - 67 + 110 ^ 156 + 81 - 83 + 36;
      lIIIl[12] = 177 ^ 189;
      lIIIl[13] = 206 ^ 195;
      lIIIl[14] = -" ".length();
      lIIIl[15] = 209 ^ 180;
      lIIIl[16] = 52 ^ 11;
      lIIIl[17] = 240 ^ 142 ^ 78 ^ 62;
      lIIIl[18] = 61 + 69 - 61 + 86 ^ 69 + 101 - 90 + 68;
      lIIIl[19] = 95 ^ 103;
      lIIIl[20] = 42 ^ 58;
      lIIIl[21] = 12 ^ 7 ^ 145 ^ 168;
      lIIIl[22] = 140 + 104 - 119 + 44 ^ 151 + 106 - 94 + 21;
      lIIIl[23] = 170 ^ 184;
      lIIIl[24] = 187 ^ 168;
      lIIIl[25] = 5 + 93 - -37 + 42 ^ 126 + 43 - 41 + 37;
      lIIIl[26] = 0 + 0 - -86 + 56 + (70 ^ 76) - (26 ^ 106) + 77 + 94 - 122 + 81;
      lIIIl[27] = 180 ^ 151;
      lIIIl[28] = 76 ^ 43 ^ 176 ^ 194;
      lIIIl[29] = 139 + 101 - 207 + 117 ^ 36 + 32 - -54 + 6;
      lIIIl[30] = 21 ^ 113;
      lIIIl[31] = 167 + 90 - 236 + 150 ^ 96 + 74 - 18 + 36;
   }

   private static String lIllI(String lllllIllIlIIIIl, String lllllIllIlIIIII) {
      try {
         SecretKeySpec lllllIllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte lllllIllIIllllI = Cipher.getInstance("Blowfish");
         lllllIllIIllllI.init(lIIIl[3], lllllIllIlIIllI);
         return new String(lllllIllIIllllI.doFinal(Base64.getDecoder().decode(lllllIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlII(String lllllIllIllIIII, String lllllIllIlIllll) {
      try {
         SecretKeySpec lllllIllIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllIlIllll.getBytes(StandardCharsets.UTF_8)), lIIIl[8]), "DES");
         Cipher lllllIllIllIIlI = Cipher.getInstance("DES");
         lllllIllIllIIlI.init(lIIIl[3], lllllIllIllIIll);
         return new String(lllllIllIllIIlI.doFinal(Base64.getDecoder().decode(lllllIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void ἶṗ() {
      // $FF: Couldn't be decompiled
   }

   private final 〇.ⲋ ĂƂ(BlockPos llllllIIlIIllII) {
      BlockPos llllllIIlIIlIll = llllllIIlIIllII.func_177982_a(lIIIl[1], lIIIl[2], lIIIl[1]);
      BlockPos var3 = llllllIIlIIllII.func_177982_a(lIIIl[1], lIIIl[3], lIIIl[1]);
      BlockPos var4 = llllllIIlIIllII.func_177982_a(lIIIl[1], lIIIl[3], lIIIl[1]);
      if (llllIl(Intrinsics.areEqual((Object)llllllIIlIIllIl.ⲋ(llllllIIlIIlIll), (Object)Blocks.field_150350_a) ^ lIIIl[2]) && llllIl(Intrinsics.areEqual((Object)llllllIIlIIllIl.ⲋ(var3), (Object)Blocks.field_150350_a) ^ lIIIl[2]) && !lllllI(Intrinsics.areEqual((Object)llllllIIlIIllIl.ⲋ(var4), (Object)Blocks.field_150350_a) ^ lIIIl[2])) {
         Block[] var10000 = new Block[lIIIl[6]];
         var10000[lIIIl[1]] = llllllIIlIIllIl.ⲋ(llllllIIlIIllII);
         var10000[lIIIl[2]] = llllllIIlIIllIl.ⲋ(llllllIIlIIlIll.func_177982_a(lIIIl[2], lIIIl[1], lIIIl[1]));
         var10000[lIIIl[3]] = llllllIIlIIllIl.ⲋ(llllllIIlIIlIll.func_177982_a(lIIIl[14], lIIIl[1], lIIIl[1]));
         var10000[lIIIl[4]] = llllllIIlIIllIl.ⲋ(llllllIIlIIlIll.func_177982_a(lIIIl[1], lIIIl[1], lIIIl[2]));
         var10000[lIIIl[5]] = llllllIIlIIllIl.ⲋ(llllllIIlIIlIll.func_177982_a(lIIIl[1], lIIIl[1], lIIIl[14]));
         char llllllIIlIIlIII = CollectionsKt.listOf(var10000);
         long llllllIIlIIIlll = (Iterable)llllllIIlIIlIII;
         boolean llllllIIlIIIllI = lIIIl[1];
         Iterator llllllIIlIIIlIl;
         Object llllllIIlIIIlII;
         Block llllllIIlIIIIll;
         int llllllIIlIIIIlI;
         int var12;
         if (lllllI(llllllIIlIIIlll instanceof Collection) && lllllI(((Collection)llllllIIlIIIlll).isEmpty())) {
            var12 = lIIIl[1];
            "".length();
            if (-" ".length() >= " ".length()) {
               return null;
            }
         } else {
            llllllIIlIIIlIl = llllllIIlIIIlll.iterator();

            while(true) {
               if (!lllllI(llllllIIlIIIlIl.hasNext())) {
                  var12 = lIIIl[1];
                  break;
               }

               llllllIIlIIIlII = llllllIIlIIIlIl.next();
               llllllIIlIIIIll = (Block)llllllIIlIIIlII;
               llllllIIlIIIIlI = lIIIl[1];
               if (lllllI(Intrinsics.areEqual((Object)llllllIIlIIIIll, (Object)Blocks.field_150343_Z) ^ lIIIl[2]) && lllllI(Intrinsics.areEqual((Object)llllllIIlIIIIll, (Object)Blocks.field_150357_h) ^ lIIIl[2])) {
                  var12 = lIIIl[2];
                  "".length();
                  if (((65 ^ 39 ^ 12 ^ 113) & (238 ^ 177 ^ 227 ^ 167 ^ -" ".length())) < 0) {
                     return null;
                  }
               } else {
                  var12 = lIIIl[1];
               }

               if (lllllI(var12)) {
                  var12 = lIIIl[2];
                  "".length();
                  if ("  ".length() < 0) {
                     return null;
                  }
                  break;
               }
            }
         }

         if (lllllI(var12)) {
            return 〇.ⲋ.ⲋ;
         } else {
            llllllIIlIIIlll = (Iterable)llllllIIlIIlIII;
            llllllIIlIIIllI = lIIIl[1];
            if (lllllI(llllllIIlIIIlll instanceof Collection) && lllllI(((Collection)llllllIIlIIIlll).isEmpty())) {
               var12 = lIIIl[2];
               "".length();
               if ((63 + 73 - 128 + 159 ^ 158 + 68 - 150 + 87) == 0) {
                  return null;
               }
            } else {
               llllllIIlIIIlIl = llllllIIlIIIlll.iterator();

               while(true) {
                  if (!lllllI(llllllIIlIIIlIl.hasNext())) {
                     var12 = lIIIl[2];
                     break;
                  }

                  llllllIIlIIIlII = llllllIIlIIIlIl.next();
                  llllllIIlIIIIll = (Block)llllllIIlIIIlII;
                  llllllIIlIIIIlI = lIIIl[1];
                  if (llllIl(Intrinsics.areEqual((Object)llllllIIlIIIIll, (Object)Blocks.field_150357_h))) {
                     var12 = lIIIl[1];
                     "".length();
                     if ((10 ^ 14) <= 0) {
                        return null;
                     }
                     break;
                  }
               }
            }

            〇.ⲋ var13;
            if (lllllI(var12)) {
               var13 = 〇.ⲋ.ĂƂ;
               "".length();
               if (((138 + 133 - 248 + 173 ^ 145 + 46 - 160 + 124) & (102 ^ 126 ^ 100 ^ 35 ^ -" ".length())) != 0) {
                  return null;
               }
            } else {
               var13 = 〇.ⲋ.u;
            }

            return var13;
         }
      } else {
         return 〇.ⲋ.ⲋ;
      }
   }

   public void Ἠ() {
      super.Ἠ();
      this.Ꜥ += lIIIl[2];
      int var10000 = this.Ꜥ;
      "".length();
      if (lllllI(this.ĂƂ()) && llllIl(this.Ꜥ % (lIIIl[15] - this.ϛⰄ()))) {
         this.ⲡ = this.Ꜥ();
      }

   }

   static {
      lllIIl();
      lIllll();
      KProperty[] var10000 = new KProperty[lIIIl[0]];
      var10000[lIIIl[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(〇.class), llII[lIIIl[1]], llII[lIIIl[2]]));
      var10000[lIIIl[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(〇.class), llII[lIIIl[3]], llII[lIIIl[4]]));
      var10000[lIIIl[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(〇.class), llII[lIIIl[5]], llII[lIIIl[6]]));
      var10000[lIIIl[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(〇.class), llII[lIIIl[7]], llII[lIIIl[0]]));
      var10000[lIIIl[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(〇.class), llII[lIIIl[8]], llII[lIIIl[9]]));
      var10000[lIIIl[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(〇.class), llII[lIIIl[10]], llII[lIIIl[11]]));
      var10000[lIIIl[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(〇.class), llII[lIIIl[12]], llII[lIIIl[13]]));
      ⲋ = var10000;
   }

   private final Block ⲋ(@NotNull BlockPos var1) {
      return this.ɡ().field_71441_e.func_180495_p(var1).func_177230_c();
   }

   @JvmName(
      name = "u"
   )
   public final void u(int var1) {
      this.Ꜥ = var1;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final double Ἒⅾ() {
      return ((Number)this.ϛⰄ.ⲋ(this, ⲋ[lIIIl[6]])).doubleValue();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return (Boolean)this.u.ⲋ(this, ⲋ[lIIIl[2]]);
   }

   private static boolean llllIl(int var0) {
      return var0 == 0;
   }

   private static boolean lIIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   private final List<Pair<BlockPos, 〇.ⲋ>> Ꜥ() {
      List var1 = šⱙ.ⲋ.ⲋ(llllllIIIllIlII.ɡ().field_71439_g.func_180425_c(), (float)llllllIIIllIlII.ⲋ(), llllllIIIllIlII.ⲋ(), (boolean)lIIIl[1], (boolean)lIIIl[2], lIIIl[1]);
      Iterable llllllIIIllIIlI = (Iterable)var1;
      int llllllIIIllIIIl = lIIIl[1];
      Collection llllllIIIlIllll = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(llllllIIIllIIlI, lIIIl[10])));
      int llllllIIIlIlllI = lIIIl[1];
      Iterator llllllIIIlIllIl = llllllIIIllIIlI.iterator();

      do {
         Object llllllIIIlIllII;
         int llllllIIIlIlIlI;
         if (!lllllI(llllllIIIlIllIl.hasNext())) {
            llllllIIIllIIlI = (Iterable)((List)llllllIIIlIllll);
            llllllIIIllIIIl = lIIIl[1];
            llllllIIIlIllll = (Collection)(new ArrayList());
            llllllIIIlIlllI = lIIIl[1];
            llllllIIIlIllIl = llllllIIIllIIlI.iterator();

            while(lllllI(llllllIIIlIllIl.hasNext())) {
               llllllIIIlIllII = llllllIIIlIllIl.next();
               int llllllIIIlIlIll = (Pair)llllllIIIlIllII;
               llllllIIIlIlIlI = lIIIl[1];
               int var10000;
               if (llllll((〇.ⲋ)llllllIIIlIlIll.getSecond(), 〇.ⲋ.ⲋ)) {
                  var10000 = lIIIl[2];
                  "".length();
                  if (-"   ".length() > 0) {
                     return null;
                  }
               } else {
                  var10000 = lIIIl[1];
               }

               if (lllllI(var10000)) {
                  llllllIIIlIllll.add(llllllIIIlIllII);
                  "".length();
                  "".length();
                  if (" ".length() < 0) {
                     return null;
                  }
               }
            }

            return (List)llllllIIIlIllll;
         }

         llllllIIIlIllII = llllllIIIlIllIl.next();
         int llllllIIIlIlIll = (BlockPos)llllllIIIlIllII;
         llllllIIIlIlIlI = lIIIl[1];
         Exception llllllIIIlIlIII = TuplesKt.to(llllllIIIlIlIll, llllllIIIllIlII.ĂƂ(llllllIIIlIlIll));
         llllllIIIlIllll.add(llllllIIIlIlIII);
         "".length();
         "".length();
      } while("  ".length() > ((55 ^ 2 ^ 58 ^ 91) & (146 + 130 - 237 + 211 ^ 168 + 111 - 268 + 163 ^ -" ".length())));

      return null;
   }

   private static boolean lIIIIII(Object var0, Object var1) {
      return var0 == var1;
   }

   private static String lIlIl(String lllllIllIIlIIll, String lllllIllIIIllIl) {
      lllllIllIIlIIll = new String(Base64.getDecoder().decode(lllllIllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllIllIIIllII = new StringBuilder();
      short lllllIllIIIlIll = lllllIllIIIllIl.toCharArray();
      Exception lllllIllIIIlIlI = lIIIl[1];
      String lllllIllIIIlIIl = lllllIllIIlIIll.toCharArray();
      String lllllIllIIIlIII = lllllIllIIIlIIl.length;
      int lllllIllIIIIlll = lIIIl[1];

      do {
         if (!lIIIIIl(lllllIllIIIIlll, lllllIllIIIlIII)) {
            return String.valueOf(lllllIllIIIllII);
         }

         char lllllIllIIlIlII = lllllIllIIIlIIl[lllllIllIIIIlll];
         lllllIllIIIllII.append((char)(lllllIllIIlIlII ^ lllllIllIIIlIll[lllllIllIIIlIlI % lllllIllIIIlIll.length]));
         "".length();
         ++lllllIllIIIlIlI;
         ++lllllIllIIIIlll;
         "".length();
      } while("  ".length() >= -" ".length());

      return null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final Color 〥ҳⱆ() {
      return (Color)this.Ἒⅾ.ⲋ(this, ⲋ[lIIIl[5]]);
   }

   @JvmName(
      name = "u"
   )
   public final 〇.ĂƂ u() {
      return (〇.ĂƂ)this.ᴃᎲ.ⲋ(this, ⲋ[lIIIl[3]]);
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final Color ᴃᎲ() {
      return (Color)this.〥ҳⱆ.ⲋ(this, ⲋ[lIIIl[4]]);
   }

   private static void lIllll() {
      llII = new String[lIIIl[31]];
      llII[lIIIl[1]] = lIlII("+bpknQNXr3A=", "OWNzW");
      llII[lIIIl[2]] = lIlIl("LzUDNAUmNxJOTQE=", "HPwfd");
      llII[lIIIl[3]] = lIlIl("GyAbHhgHJBEa", "hHtiP");
      llII[lIIIl[4]] = lIlII("eMBhm6jLAbSYyydwhScdRQ==", "fhdbu");
      llII[lIIIl[5]] = lIllI("oZ4e1AryFlItw1pIXd0CQA==", "KkHpY");
      llII[lIIIl[6]] = lIlII("SLn+KAGAtoXLrDJaPsa2Q46I8mjzyAUP3FAtTIMgCmZOLRTDWdPAX0TQWol5GCzP4GOWhiM03EPQopoSQNin+whC19BW4Gim", "SNtyK");
      llII[lIIIl[7]] = lIlII("HWneTATeMEzZmzY8RJFPjw==", "ETjRt");
      llII[lIIIl[0]] = lIlIl("JQoiDC0uCgUlJCcsOSgtMEd/CCgjGTdrIzUbeQctLgAkfw==", "BoVDB");
      llII[lIIIl[8]] = lIlIl("Hi09AhEDLj8kKBotIw==", "vBQgG");
      llII[lIIIl[9]] = lIlII("FSuDSjnclLOHaD+oa2B+GDO6lmDvU1CPZ/jEe5gzC+q6jleWFrUezA==", "thCPi");
      llII[lIIIl[10]] = lIllI("1rEkUu+eJjo=", "rxzAl");
      llII[lIIIl[11]] = lIlII("o+h0n3zS4PinEo+ZeCUkJw==", "SUDPr");
      llII[lIIIl[12]] = lIllI("sdQVNQuUSUmQjknGwLxUuQ==", "yUADa");
      llII[lIIIl[13]] = lIlII("Z1zvLxroRH9Z9oKUYddo9fmzO0EZRzow", "NIIOb");
      llII[lIIIl[17]] = lIllI("K079FqSuplePbHqxT8nbrQ==", "giaCA");
      llII[lIIIl[18]] = lIlIl("Lx81WT4FPkUaKhM/ERg0SjwTCXgYKQkYLA8oRQ0wAyICCnY=", "jLeyX");
      llII[lIIIl[20]] = lIlIl("CDsvIic=", "ZZAEB");
      llII[lIIIl[22]] = lIlII("tNiOLqhtfts=", "Xvbrb");
      llII[lIIIl[23]] = lIlII("y/Z2jHLONSw=", "XMcwV");
      llII[lIIIl[24]] = lIlII("aRNXt0mHyj19+VHTQ72Guw==", "kPuUq");
      llII[lIIIl[25]] = lIlIl("FBMDLGBiLgAuK2IlAC4hMA==", "BfoBN");
      llII[lIIIl[28]] = lIllI("ooHIIEsdanc=", "MusRZ");
      llII[lIIIl[29]] = lIllI("ja1uMb3BQUeV2xZq0h6vlQ==", "XfKdw");
   }

   public 〇() {
      super(llII[lIIIl[17]], llII[lIIIl[18]], ı５.ⲋ, lIIIl[1], (boolean)lIIIl[1], (boolean)lIIIl[1], lIIIl[19], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llII[lIIIl[20]], lIIIl[10]).u((Object)lIIIl[1]).ᴃᎲ((Object)lIIIl[21]);
      this.u = this.ⲋ(llII[lIIIl[22]], Boolean.valueOf((boolean)lIIIl[2]));
      this.ᴃᎲ = this.ⲋ(llII[lIIIl[23]], 〇.ĂƂ.ⲋ);
      this.〥ҳⱆ = this.ⲋ(llII[lIIIl[24]], Color.green);
      this.Ἒⅾ = this.ⲋ(llII[lIIIl[25]], new Color(lIIIl[26], lIIIl[27], lIIIl[27]));
      this.ϛⰄ = this.ⲋ(llII[lIIIl[28]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.ς = this.ⲋ(llII[lIIIl[29]], lIIIl[21]).u((Object)lIIIl[2]).ᴃᎲ((Object)lIIIl[30]);
      int var1 = lIIIl[1];
      List var3 = CollectionsKt.emptyList();
      this.ⲡ = var3;
   }

   @JvmName(
      name = "ς"
   )
   public final int ς() {
      return this.Ꜥ;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final int ϛⰄ() {
      return ((Number)this.ς.ⲋ(this, ⲋ[lIIIl[7]])).intValue();
   }

   private static boolean lllllI(int var0) {
      return var0 != 0;
   }

   private static boolean llllll(Object var0, Object var1) {
      return var0 != var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIIIl[1]])).intValue();
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/〇$ĂƂ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ĂƂ {
      private static void lIlIIllllI() {
         lIIlllIlI = new String[lIlIIIIII[0]];
         lIIlllIlI[lIlIIIIII[1]] = lIlIIlllIl("NQgvIw==", "sDnwt");
         lIIlllIlI[lIlIIIIII[2]] = lIlIIlllIl("HhwILQ==", "XIDaG");
      }

      private static boolean lIlIlIIlII(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIlIIlllIl(String llIlIIIIlllIlll, String llIlIIIIlllIllI) {
         llIlIIIIlllIlll = new String(Base64.getDecoder().decode(llIlIIIIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder llIlIIIIlllIlIl = new StringBuilder();
         char llIlIIIIllIllll = llIlIIIIlllIllI.toCharArray();
         long llIlIIIIllIlllI = lIlIIIIII[1];
         Exception llIlIIIIllIllIl = llIlIIIIlllIlll.toCharArray();
         byte llIlIIIIllIllII = llIlIIIIllIllIl.length;
         int llIlIIIIllIlIll = lIlIIIIII[1];

         do {
            if (!lIlIlIIlII(llIlIIIIllIlIll, llIlIIIIllIllII)) {
               return String.valueOf(llIlIIIIlllIlIl);
            }

            Exception llIlIIIIllIlIlI = llIlIIIIllIllIl[llIlIIIIllIlIll];
            llIlIIIIlllIlIl.append((char)(llIlIIIIllIlIlI ^ llIlIIIIllIllll[llIlIIIIllIlllI % llIlIIIIllIllll.length]));
            "".length();
            ++llIlIIIIllIlllI;
            ++llIlIIIIllIlIll;
            "".length();
         } while(" ".length() != 0);

         return null;
      }

      static {
         lIlIlIIIll();
         lIlIIllllI();
         〇.ĂƂ[] var10001 = new 〇.ĂƂ[lIlIIIIII[0]];
         var10001[lIlIIIIII[1]] = ⲋ = new 〇.ĂƂ(lIIlllIlI[lIlIIIIII[1]], lIlIIIIII[1]);
         var10001[lIlIIIIII[2]] = ĂƂ = new 〇.ĂƂ(lIIlllIlI[lIlIIIIII[2]], lIlIIIIII[2]);
      }

      private static void lIlIlIIIll() {
         lIlIIIIII = new int[3];
         lIlIIIIII[0] = "  ".length();
         lIlIIIIII[1] = (147 ^ 176) & ~(85 ^ 118);
         lIlIIIIII[2] = " ".length();
      }

      private ĂƂ() {
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003"},
      d2 = {"La/〇$ⲋ;", "ⲋ", "ĂƂ", "u", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private static String llllllllII(String lIlllIIIllIIlII, String lIlllIIIllIIIll) {
         lIlllIIIllIIlII = new String(Base64.getDecoder().decode(lIlllIIIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lIlllIIIllIIlll = new StringBuilder();
         char[] lIlllIIIllIIllI = lIlllIIIllIIIll.toCharArray();
         int lIlllIIIllIIlIl = lllIllIIl[1];
         String lIlllIIIlIlllll = lIlllIIIllIIlII.toCharArray();
         long lIlllIIIlIllllI = lIlllIIIlIlllll.length;
         int lIlllIIIlIlllIl = lllIllIIl[1];

         do {
            if (!lIIIIIIlIII(lIlllIIIlIlllIl, lIlllIIIlIllllI)) {
               return String.valueOf(lIlllIIIllIIlll);
            }

            char lIlllIIIlIlllII = lIlllIIIlIlllll[lIlllIIIlIlllIl];
            lIlllIIIllIIlll.append((char)(lIlllIIIlIlllII ^ lIlllIIIllIIllI[lIlllIIIllIIlIl % lIlllIIIllIIllI.length]));
            "".length();
            ++lIlllIIIllIIlIl;
            ++lIlllIIIlIlllIl;
            "".length();
         } while(-"   ".length() <= 0);

         return null;
      }

      private static void lIIIIIIIlll() {
         lllIllIIl = new int[4];
         lllIllIIl[0] = "   ".length();
         lllIllIIl[1] = (86 + 105 - 163 + 160 ^ 125 + 125 - 215 + 125) & (156 + 151 - 268 + 144 ^ 170 + 71 - 155 + 85 ^ -" ".length());
         lllIllIIl[2] = " ".length();
         lllIllIIl[3] = "  ".length();
      }

      private ⲋ() {
      }

      private static void llllllllIl() {
         lllIllIII = new String[lllIllIIl[0]];
         lllIllIII[lllIllIIl[1]] = llllllllII("NAQnFA==", "zKiQu");
         lllIllIII[lllIllIIl[2]] = llllllllII("OAUhAg==", "kDgGp");
         lllIllIII[lllIllIIl[3]] = llllllllII("PDgKIhc4LAQgFw==", "jmFlR");
      }

      private static boolean lIIIIIIlIII(int var0, int var1) {
         return var0 < var1;
      }

      static {
         lIIIIIIIlll();
         llllllllIl();
         〇.ⲋ[] var10001 = new 〇.ⲋ[lllIllIIl[0]];
         var10001[lllIllIIl[1]] = ⲋ = new 〇.ⲋ(lllIllIII[lllIllIIl[1]], lllIllIIl[1]);
         var10001[lllIllIIl[2]] = ĂƂ = new 〇.ⲋ(lllIllIII[lllIllIIl[2]], lllIllIIl[2]);
         var10001[lllIllIIl[3]] = u = new 〇.ⲋ(lllIllIII[lllIllIIl[3]], lllIllIIl[3]);
      }
   }
}
