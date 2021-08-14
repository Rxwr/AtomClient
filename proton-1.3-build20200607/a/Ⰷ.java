package a;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketMultiBlockChange;
import net.minecraft.network.play.server.SPacketUnloadChunk;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.world.ChunkEvent.Load;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u000204B\u0007¢\u0006\u0004\b3\u0010*J/\u0010\u0006\u001a\u00020$2\u001e\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110#\u0012\u0004\u0012\u00020$0!H\u0002¢\u0006\u0004\b\u0006\u0010&J\u0017\u0010\u0006\u001a\u00020$2\u0006\u0010%\u001a\u00020'H\u0007¢\u0006\u0004\b\u0006\u0010(J\u000f\u0010)\u001a\u00020$H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010\u001b\u001a\u00020$H\u0014¢\u0006\u0004\b\u001b\u0010*J\u0017\u0010\u0006\u001a\u00020$2\u0006\u0010%\u001a\u00020+H\u0007¢\u0006\u0004\b\u0006\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020$H\u0016¢\u0006\u0004\b.\u0010*J\u0017\u0010\u0006\u001a\u00020$2\u0006\u0010%\u001a\u00020/H\u0002¢\u0006\u0004\b\u0006\u00100J\u000f\u0010\u001d\u001a\u00020$H\u0002¢\u0006\u0004\b\u001d\u0010*J\u000f\u0010\u001f\u001a\u00020$H\u0002¢\u0006\u0004\b\u001f\u0010*J\u0017\u0010\u0006\u001a\u00020$2\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b\u0006\u00101J\u0017\u0010\u0006\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0006\u00102R\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u000b\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u0082\u0084\u0002R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\f8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0082\u0084\u0002R,\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0082\u0004R\"\u0010\t\u001a\u00020\u00148C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0003\u001a\u0004\b\b\u0010\u0016¨\u0006\u0082\u0084\u0002R&\u0010\b\u001a\u0006*\u00020\u00170\u00178C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u000b\u0010\u0018¨\u0006\u0082\u0084\u0002R\u001a\u0010\u0015\u001a\u00020\r8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u0096\u0004R\u001a\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u0082\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\u0082\u000eR\"\u0010\u0012\u001a\u00020\u00148C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0082\u0084\u0002R\"\u0010\u001b\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\u0002\u0010\n¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/Ⰷ;", "", "ᴃᎲ", "La/ⅹ;", "u", "()D", "ⲋ", "", "Ἒⅾ", "〥ҳⱆ", "()Z", "ĂƂ", "", "", "()Ljava/util/List;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lnet/minecraft/util/math/BlockPos;", "ⲡ", "Ljava/util/concurrent/ConcurrentHashMap;", "", "ϛⰄ", "()I", "Ljava/awt/Color;", "()Ljava/awt/Color;", "ƶ", "()Ljava/lang/String;", "Đ", "I", "ς", "Ljava/util/concurrent/ExecutorService;", "Ꜥ", "Ljava/util/concurrent/ExecutorService;", "Lkotlin/Function2;", "Lnet/minecraft/util/math/ChunkPos;", "", "", "p0", "(Lkotlin/jvm/functions/Function2;)V", "Lnet/minecraftforge/event/world/ChunkEvent$Load;", "(Lnet/minecraftforge/event/world/ChunkEvent$Load;)V", "ʅ", "()V", "La/ꝱᶁ;", "(La/ꝱᶁ;)V", "Ἠ", "ἶṗ", "Lnet/minecraft/world/chunk/Chunk;", "(Lnet/minecraft/world/chunk/Chunk;)V", "(Lnet/minecraft/util/math/ChunkPos;)V", "(Lnet/minecraft/util/math/BlockPos;)V", "<init>", "La/ⳅ;"}
)
public final class Ⰷ extends ⳅ {
   public Ⰷ() {
      super(llIllIIll[llIlllIlI[16]], llIllIIll[llIlllIlI[18]], ı５.〥ҳⱆ, llIlllIlI[1], (boolean)llIlllIlI[1], (boolean)llIlllIlI[1], llIlllIlI[19], (DefaultConstructorMarker)null);
      String var10002 = llIllIIll[llIlllIlI[20]];
      String[] var10003 = new String[llIlllIlI[5]];
      var10003[llIlllIlI[1]] = llIllIIll[llIlllIlI[21]];
      var10003[llIlllIlI[2]] = llIllIIll[llIlllIlI[22]];
      var10003[llIlllIlI[3]] = llIllIIll[llIlllIlI[23]];
      var10003[llIlllIlI[4]] = llIllIIll[llIlllIlI[24]];
      this.ĂƂ = this.ⲋ(var10002, CollectionsKt.mutableListOf(var10003)).Đ();
      this.u = this.ⲋ(llIllIIll[llIlllIlI[25]], Color.red);
      this.ᴃᎲ = this.ⲋ(llIllIIll[llIlllIlI[26]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.〥ҳⱆ = this.ⲋ(llIllIIll[llIlllIlI[27]], Boolean.valueOf((boolean)llIlllIlI[2]));
      this.Ἒⅾ = this.ⲋ(llIllIIll[llIlllIlI[28]], Boolean.valueOf((boolean)llIlllIlI[1]));
      this.ϛⰄ = this.ⲋ(llIllIIll[llIlllIlI[29]], llIlllIlI[16]).u((Object)llIlllIlI[5]).ᴃᎲ((Object)llIlllIlI[30]);
      this.ς = this.ⲋ(llIllIIll[llIlllIlI[31]], llIlllIlI[5]).u((Object)llIlllIlI[2]).ᴃᎲ((Object)llIlllIlI[15]).u(llIllIIll[llIlllIlI[32]]);
      this.ⲡ = new ConcurrentHashMap();
      ⅹ var10000 = this.ⲋ((String)llIllIIll[llIlllIlI[33]]);
      if (lllIIlllIl(var10000)) {
         ᵭ var1 = var10000.ⲋ();
         if (lllIIlllIl(var1)) {
            var1.ⲋ((Function1)(new Function1<ᵭ<? extends Object>, Unit>() {
               static {
                  llIllIlIlI();
               }

               private static void llIllIlIlI() {
                  llIlIIllI = new int[1];
                  llIlIIllI[0] = " ".length();
               }

               public final void ⲋ(@NotNull ᵭ<? extends Object> var1) {
                  Ⰷ.this.Ꜥ();
                  Ⰷ.this.ς();
               }
            }));
            "".length();
            if ("   ".length() == ((102 ^ 125) & ~(102 ^ 125))) {
               throw null;
            }

            return;
         }
      }

      "".length();
   }

   private final void ⲋ(final ChunkPos llIIIIIIllllIIl) {
      if (lllIIlllIl(llIIIIIIllllIlI.Ꜥ)) {
         ExecutorService var10000 = llIIIIIIllllIlI.Ꜥ;
         if (lllIIlllIl(var10000)) {
            var10000.execute((Runnable)(new Runnable() {
               public final void run() {
                  long var1 = ChunkPos.func_77272_a(llIIIIIIllllIIl.field_77276_a, llIIIIIIllllIIl.field_77275_b);
                  llIIIIIIllllIlI.ⲡ.remove(var1);
                  "".length();
               }
            }));
            "".length();
            if (((45 ^ 53) & ~(126 ^ 102)) != ((46 ^ 29) & ~(136 ^ 187) & ~((176 ^ 156) & ~(71 ^ 107)))) {
               return;
            }
         } else {
            "".length();
            "".length();
            if (" ".length() == 0) {
               return;
            }
         }
      } else {
         char llIIIIIIllllIII = ChunkPos.func_77272_a(llIIIIIIllllIIl.field_77276_a, llIIIIIIllllIIl.field_77275_b);
         llIIIIIIllllIlI.ⲡ.remove(llIIIIIIllllIII);
         "".length();
      }

   }

   private static int lllIIlllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private final void ς() {
      WorldClient var10000 = llIIIIIllIllIII.ɡ().field_71441_e;
      if (lllIIlllIl(var10000)) {
         ChunkProviderClient var9 = var10000.func_72863_F();
         if (lllIIlllIl(var9)) {
            Long2ObjectMap var10 = var9.field_73236_b;
            if (lllIIlllIl(var10)) {
               Map var1 = (Map)var10;
               int var2 = llIlllIlI[1];
               int var4 = llIlllIlI[1];
               Iterator llIIIIIllIlIIll = var1.entrySet().iterator();

               while(lllIIllllI(llIIIIIllIlIIll.hasNext())) {
                  boolean llIIIIIllIlIIlI = (Entry)llIIIIIllIlIIll.next();
                  short llIIIIIllIlIIII = llIlllIlI[1];
                  llIIIIIllIllIII.ⲋ((Chunk)llIIIIIllIlIIlI.getValue());
                  "".length();
                  if (" ".length() > "   ".length()) {
                     return;
                  }
               }

               "".length();
               if ((17 ^ 21) <= -" ".length()) {
                  return;
               }

               return;
            }
         }
      }

      "".length();
   }

   public void Ἠ() {
      super.Ἠ();
      Enumeration var2 = llIIIIIlIllllII.ⲡ.keys();
      int var3 = llIlllIlI[1];
      ArrayList var10000 = Collections.list(var2);
      Intrinsics.checkExpressionValueIsNotNull(var10000, llIllIIll[llIlllIlI[14]]);
      List var1 = (List)var10000;
      Iterable var19 = (Iterable)var1;
      var3 = llIlllIlI[1];
      Iterator llIIIIIlIlllIII = var19.iterator();

      do {
         if (!lllIIllllI(llIIIIIlIlllIII.hasNext())) {
            llIIIIIlIllllII.Đ = llIlllIlI[1];
            llIIIIIlIllllII.ⲋ((Function2)(new Function2<ChunkPos, List<? extends BlockPos>, Unit>() {
               private static void llIlIlllIl() {
                  llIIlllIl = new int[1];
                  llIIlllIl[0] = "  ".length();
               }

               static {
                  llIlIlllIl();
               }

               public final void ⲋ(@NotNull ChunkPos var1, @NotNull List<? extends BlockPos> var2) {
                  Ⰷ var10000 = llIIIIIlIllllII;
                  var10000.Đ = var10000.Đ + var2.size();
               }
            }));
            return;
         }

         float llIIIIIlIllIlll = llIIIIIlIlllIII.next();
         char llIIIIIlIllIllI = (Long)llIIIIIlIllIlll;
         float llIIIIIlIllIlIl = llIlllIlI[1];
         byte llIIIIIlIllIlII = (int)(llIIIIIlIllIllI & 4294967295L);
         boolean llIIIIIlIllIIll = (int)(llIIIIIlIllIllI >> llIlllIlI[15] & 4294967295L);
         Exception llIIIIIlIllIIlI = llIIIIIlIllllII.ɡ().field_71439_g.func_180425_c().field_177962_a / llIlllIlI[16];
         float llIIIIIlIllIIIl = llIIIIIlIllllII.ɡ().field_71439_g.func_180425_c().field_177961_c / llIlllIlI[16];
         String llIIIIIlIllIIII = llIIIIIlIllIIlI - llIIIIIlIllIlII;
         int llIIIIIlIlIllll = llIIIIIlIllIIIl - llIIIIIlIllIIll;
         long llIIIIIlIlIlllI = (double)(llIIIIIlIllIIII * llIIIIIlIllIIII + llIIIIIlIlIllll * llIIIIIlIlIllll);
         long llIIIIIlIlIllIl = llIlllIlI[1];
         boolean llIIIIIlIlIllII = Math.sqrt(llIIIIIlIlIlllI);
         if (lllIlIIIII(lllIIlllll(llIIIIIlIlIllII, (double)llIIIIIlIllllII.Ἒⅾ()))) {
            llIIIIIlIllllII.ⲋ(new ChunkPos(llIIIIIlIllIlII, llIIIIIlIllIIll));
         }

         "".length();
      } while((82 ^ 86) >= 0);

   }

   private static boolean lllIlIIIII(int var0) {
      return var0 >= 0;
   }

   private final void ⲋ(final Chunk llIIIIIIllIIIIl) {
      Iterable llIIIIIIlIlllll = (Iterable)llIIIIIIllIIIlI.ⲋ();
      int llIIIIIIlIllllI = llIlllIlI[1];
      Collection llIIIIIIlIlllII = (Collection)(new ArrayList());
      int llIIIIIIlIllIll = llIlllIlI[1];
      int var9 = llIlllIlI[1];
      Iterator llIIIIIIlIllIII = llIIIIIIlIlllll.iterator();

      do {
         if (!lllIIllllI(llIIIIIIlIllIII.hasNext())) {
            llIIIIIIlIlllll = (Iterable)((List)llIIIIIIlIlllII);
            llIIIIIIlIllllI = llIlllIlI[1];
            llIIIIIIlIlllII = (Collection)(new ArrayList());
            llIIIIIIlIllIll = llIlllIlI[1];
            Iterator llIIIIIIlIllIlI = llIIIIIIlIlllll.iterator();

            while(lllIIllllI(llIIIIIIlIllIlI.hasNext())) {
               long llIIIIIIlIllIIl = llIIIIIIlIllIlI.next();
               float llIIIIIIlIllIII = (Block)llIIIIIIlIllIIl;
               double llIIIIIIlIlIlll = llIlllIlI[1];
               int var24;
               if (lllIlIIIlI(llIIIIIIlIllIII instanceof BlockAir)) {
                  var24 = llIlllIlI[2];
                  "".length();
                  if (((169 ^ 192 ^ 106 ^ 99) & (23 ^ 117 ^ "  ".length() ^ -" ".length())) == "  ".length()) {
                     return;
                  }
               } else {
                  var24 = llIlllIlI[1];
               }

               if (lllIIllllI(var24)) {
                  llIIIIIIlIlllII.add(llIIIIIIlIllIIl);
                  "".length();
                  "".length();
                  if (null != null) {
                     return;
                  }
               }
            }

            final int llIIIIIIllIIIII = (List)llIIIIIIlIlllII;
            ExecutorService var25 = llIIIIIIllIIIlI.Ꜥ;
            if (lllIIlllIl(var25)) {
               var25.execute((Runnable)(new Runnable() {
                  public final void run() {
                     long var1 = ChunkPos.func_77272_a(llIIIIIIllIIIIl.func_76632_l().field_77276_a, llIIIIIIllIIIIl.func_76632_l().field_77275_b);
                     llIIIIIIllIIIlI.ⲡ.remove(var1);
                     "".length();
                     int lllIlllIIIIIIlI = llIllIl[0];
                     List lllIlllIIIIIIll = (List)(new ArrayList());
                     lllIlllIIIIIIlI = llIllIl[0];
                     int lllIlllIIIIIIIl = llIllIl[1];

                     do {
                        if (!lllllIIl(lllIlllIIIIIIlI, lllIlllIIIIIIIl)) {
                           ((Map)llIIIIIIllIIIlI.ⲡ).put(var1, lllIlllIIIIIIll);
                           "".length();
                           return;
                        }

                        byte lllIlllIIIIIIII = llIllIl[0];
                        int lllIllIllllllll = llIllIl[1];

                        while(lllllIIl(lllIlllIIIIIIII, lllIllIllllllll)) {
                           double lllIllIlllllllI = llIllIl[0];
                           int lllIllIllllllIl = llIllIl[2];

                           while(lllllIIl(lllIllIlllllllI, lllIllIllllllIl)) {
                              int lllIllIllllllII = llIIIIIIllIIIIl.func_186032_a(lllIlllIIIIIIlI, lllIllIlllllllI, lllIlllIIIIIIII);
                              if (lllllIlI(llIIIIIIllIIIII.contains(lllIllIllllllII.func_177230_c()))) {
                                 lllIlllIIIIIIll.add(new BlockPos(lllIlllIIIIIIlI, lllIllIlllllllI, lllIlllIIIIIIII));
                                 "".length();
                              }

                              ++lllIllIlllllllI;
                              "".length();
                              if (((" ".length() ^ 128 ^ 166) & (185 ^ 144 ^ 147 ^ 157 ^ -" ".length()) & ((160 + 117 - 110 + 3 ^ 105 + 83 - 139 + 134) & (61 ^ 20 ^ 161 ^ 149 ^ -" ".length()) ^ -" ".length())) >= (39 ^ 78 ^ 127 ^ 18)) {
                                 return;
                              }
                           }

                           ++lllIlllIIIIIIII;
                           "".length();
                           if (((178 ^ 155) & ~(115 ^ 90)) != 0) {
                              return;
                           }
                        }

                        ++lllIlllIIIIIIlI;
                        "".length();
                     } while(-(46 ^ 43) < 0);

                  }

                  private static boolean lllllIIl(int var0, int var1) {
                     return var0 <= var1;
                  }

                  private static void lllllIII() {
                     llIllIl = new int[3];
                     llIllIl[0] = (211 ^ 135) & ~(64 ^ 20);
                     llIllIl[1] = 126 ^ 113;
                     llIllIl[2] = 91 + 240 - 198 + 122;
                  }

                  private static boolean lllllIlI(int var0) {
                     return var0 != 0;
                  }

                  static {
                     lllllIII();
                  }
               }));
               "".length();
               if ((127 ^ 123) < -" ".length()) {
                  return;
               }
            } else {
               "".length();
            }

            return;
         }

         double llIIIIIIlIlIlll = llIIIIIIlIllIII.next();
         long llIIIIIIlIlIlIl = llIlllIlI[1];
         float llIIIIIIlIlIlII = (String)llIIIIIIlIlIlll;
         float llIIIIIIlIlIIll = llIlllIlI[1];
         Block var10000 = Block.func_149684_b(llIIIIIIlIlIlII);
         if (lllIIlllIl(var10000)) {
            Exception llIIIIIIlIlIIlI = var10000;
            String llIIIIIIlIlIIIl = llIlllIlI[1];
            float llIIIIIIlIlIIII = llIlllIlI[1];
            Exception llIIIIIIlIIlllI = llIlllIlI[1];
            llIIIIIIlIlllII.add(llIIIIIIlIlIIlI);
            "".length();
            "".length();
            if ((42 ^ 12 ^ 98 ^ 64) < 0) {
               return;
            }
         } else {
            "".length();
         }

         "".length();
      } while("   ".length() == "   ".length());

   }

   private final void ⲋ(Function2<? super ChunkPos, ? super List<? extends BlockPos>, Unit> llIIIIIlIIllIll) {
      Enumeration var3 = llIIIIIlIIlllII.ⲡ.keys();
      int var4 = llIlllIlI[1];
      ArrayList var10000 = Collections.list(var3);
      Intrinsics.checkExpressionValueIsNotNull(var10000, llIllIIll[llIlllIlI[17]]);
      List var2 = (List)var10000;
      Iterable var16 = (Iterable)var2;
      var4 = llIlllIlI[1];
      Iterator llIIIIIlIIlIlll = var16.iterator();

      do {
         if (!lllIIllllI(llIIIIIlIIlIlll.hasNext())) {
            return;
         }

         float llIIIIIlIIlIllI = llIIIIIlIIlIlll.next();
         double llIIIIIlIIlIlIl = (Long)llIIIIIlIIlIllI;
         long llIIIIIlIIlIlII = llIlllIlI[1];
         char llIIIIIlIIlIIll = (int)(llIIIIIlIIlIlIl & 4294967295L);
         int llIIIIIlIIlIIlI = (int)(llIIIIIlIIlIlIl >> llIlllIlI[15] & 4294967295L);
         Function2 var17 = llIIIIIlIIllIll;
         ChunkPos var10001 = new ChunkPos(llIIIIIlIIlIIll, llIIIIIlIIlIIlI);
         List var10002 = (List)llIIIIIlIIlllII.ⲡ.get(llIIIIIlIIlIlIl);
         if (lllIIlllIl(var10002)) {
            "".length();
            if ("  ".length() == -" ".length()) {
               return;
            }
         } else {
            "".length();
            float llIIIIIlIIlIIIl = var10001;
            short llIIIIIlIIIllll = llIlllIlI[1];
            long llIIIIIlIIIlllI = CollectionsKt.emptyList();
            var17 = llIIIIIlIIllIll;
            var10001 = llIIIIIlIIlIIIl;
            var10002 = llIIIIIlIIIlllI;
         }

         var17.invoke(var10001, var10002);
         "".length();
         "".length();
      } while("  ".length() >= 0);

   }

   @JvmName(
      name = "ĂƂ"
   )
   private final Color ĂƂ() {
      return (Color)this.u.ⲋ(this, ⲋ[llIlllIlI[2]]);
   }

   private static boolean lllIlIIlII(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   private final int ϛⰄ() {
      return ((Number)this.ς.ⲋ(this, ⲋ[llIlllIlI[7]])).intValue();
   }

   public void ἶṗ() {
      super.ἶṗ();
      ᾣŦ var1 = ᾣŦ.ⲋ;
      int var2 = llIlllIlI[1];
      int var3 = llIlllIlI[1];
      int var5 = llIlllIlI[1];
      if (lllIIllllI(llIIIIIlIIIIlIl.ᴃᎲ())) {
         var1.ⲋ(llIlllIlI[2]);
         Entity var10000 = llIIIIIlIIIIlIl.ɡ().field_175622_Z;
         if (lllIlIIIIl(var10000)) {
            Intrinsics.throwNpe();
         }

         float llIIIIIIlllllll = var10000;
         boolean llIIIIIIllllllI = (new Vec3d(0.0D, 0.0D, 1.0D)).func_178789_a((float)(-Math.toRadians((double)llIIIIIIlllllll.field_70125_A))).func_178785_b((float)(-Math.toRadians((double)llIIIIIIlllllll.field_70177_z))).func_72441_c(0.0D, (double)llIIIIIlIIIIlIl.ɡ().field_71439_g.func_70047_e(), 0.0D).func_72441_c(llIIIIIlIIIIlIl.ɡ().field_175616_W.field_78725_b, llIIIIIlIIIIlIl.ɡ().field_175616_W.field_78726_c, llIIIIIlIIIIlIl.ɡ().field_175616_W.field_78723_d);
         llIIIIIlIIIIlIl.ⲋ((Function2)(new Ⰷ$3(var1, llIIIIIIllllllI, llIIIIIlIIIIlIl)));
         var1.ĂƂ();
      }

      if (lllIIllllI(llIIIIIlIIIIlIl.〥ҳⱆ())) {
         var1.ⲋ(llIlllIlI[0]);
         llIIIIIlIIIIlIl.ⲋ((Function2)(new Ⰷ$4(var1, llIIIIIlIIIIlIl)));
         var1.ĂƂ();
      }

   }

   private static boolean lllIlIIIll(int var0, int var1) {
      return var0 == var1;
   }

   private static String lllIIIlIII(String llIIIIIIIIIIIIl, String llIIIIIIIIIIIII) {
      llIIIIIIIIIIIIl = new String(Base64.getDecoder().decode(llIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlllllllllllll = new StringBuilder();
      char[] lIllllllllllllI = llIIIIIIIIIIIII.toCharArray();
      boolean lIllllllllllIII = llIlllIlI[1];
      String lIlllllllllIlll = llIIIIIIIIIIIIl.toCharArray();
      float lIlllllllllIllI = lIlllllllllIlll.length;
      int lIlllllllllIlIl = llIlllIlI[1];

      do {
         if (!lllIlIIlII(lIlllllllllIlIl, lIlllllllllIllI)) {
            return String.valueOf(lIlllllllllllll);
         }

         String lIlllllllllIlII = lIlllllllllIlll[lIlllllllllIlIl];
         lIlllllllllllll.append((char)(lIlllllllllIlII ^ lIllllllllllllI[lIllllllllllIII % lIllllllllllllI.length]));
         "".length();
         ++lIllllllllllIII;
         ++lIlllllllllIlIl;
         "".length();
      } while(" ".length() <= "  ".length());

      return null;
   }

   @ȵ
   public final void ⲋ(@NotNull Load var1) {
      this.ⲋ(var1.getChunk());
   }

   private final void Ꜥ() {
      this.ⲡ.clear();
      this.Đ = llIlllIlI[1];
   }

   private final void ⲋ(BlockPos llIIIIIIIllIlll) {
      Iterable var3 = (Iterable)llIIIIIIIlllIII.ⲋ();
      int llIIIIIIIllIlII = llIlllIlI[1];
      Collection llIIIIIIIllIIlI = (Collection)(new ArrayList());
      int var7 = llIlllIlI[1];
      int var9 = llIlllIlI[1];
      Iterator llIIIIIIIlIlllI = var3.iterator();

      do {
         if (!lllIIllllI(llIIIIIIIlIlllI.hasNext())) {
            boolean llIIIIIIIllIllI = (List)llIIIIIIIllIIlI;
            String llIIIIIIIllIlIl = llIIIIIIIlllIII.ɡ().field_71441_e.func_180495_p(llIIIIIIIllIlll);
            llIIIIIIIllIlII = llIIIIIIIllIlll.field_177962_a / llIlllIlI[16];
            float llIIIIIIIllIIll = llIIIIIIIllIlll.field_177961_c / llIlllIlI[16];
            byte llIIIIIIIllIIlI = ChunkPos.func_77272_a(llIIIIIIIllIlII, llIIIIIIIllIIll);
            short llIIIIIIIllIIII = (List)llIIIIIIIlllIII.ⲡ.get(llIIIIIIIllIIlI);
            short llIIIIIIIlIllll = new BlockPos(llIIIIIIIllIlll.field_177962_a - llIIIIIIIllIlII * llIlllIlI[16], llIIIIIIIllIlll.field_177960_b, llIIIIIIIllIlll.field_177961_c - llIIIIIIIllIIll * llIlllIlI[16]);
            if (lllIIllllI(llIIIIIIIllIllI.contains(llIIIIIIIllIlIl.func_177230_c()))) {
               if (lllIIlllIl(llIIIIIIIllIIII)) {
                  if (lllIlIIIlI(llIIIIIIIllIIII.contains(llIIIIIIIlIllll))) {
                     "".length();
                     if (" ".length() >= (179 ^ 183)) {
                        return;
                     }

                     llIIIIIIIllIIII.add(llIIIIIIIlIllll);
                     "".length();
                     "".length();
                     if (null != null) {
                        return;
                     }
                  }
               } else {
                  "".length();
                  "".length();
                  if (((141 ^ 178) & ~(131 ^ 188)) != 0) {
                     return;
                  }
               }
            } else if (lllIIlllIl(llIIIIIIIllIIII)) {
               if (lllIlIIIll(llIIIIIIIllIIII.contains(llIIIIIIIlIllll), llIlllIlI[2])) {
                  "".length();
                  if (((147 ^ 154 ^ 142 ^ 183) & (12 ^ 116 ^ 206 ^ 134 ^ -" ".length())) < -" ".length()) {
                     return;
                  }

                  llIIIIIIIllIIII.remove(llIIIIIIIlIllll);
                  "".length();
               }
            } else {
               "".length();
               "".length();
               if (-(31 ^ 27) > 0) {
                  return;
               }
            }

            return;
         }

         char llIIIIIIIlIllIl = llIIIIIIIlIlllI.next();
         char llIIIIIIIlIlIll = llIlllIlI[1];
         double llIIIIIIIlIlIlI = (String)llIIIIIIIlIllIl;
         Exception llIIIIIIIlIlIIl = llIlllIlI[1];
         Block var10000 = Block.func_149684_b(llIIIIIIIlIlIlI);
         if (lllIIlllIl(var10000)) {
            boolean llIIIIIIIlIlIII = var10000;
            short llIIIIIIIlIIlll = llIlllIlI[1];
            char llIIIIIIIlIIllI = llIlllIlI[1];
            int llIIIIIIIlIIlII = llIlllIlI[1];
            llIIIIIIIllIIlI.add(llIIIIIIIlIlIII);
            "".length();
            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         } else {
            "".length();
         }

         "".length();
      } while(-" ".length() <= -" ".length());

   }

   @JvmName(
      name = "Ἒⅾ"
   )
   private final int Ἒⅾ() {
      return ((Number)this.ϛⰄ.ⲋ(this, ⲋ[llIlllIlI[6]])).intValue();
   }

   private static boolean lllIIlllIl(Object var0) {
      return var0 != null;
   }

   private static String lllIIIlIIl(String lIllllllllIllII, String lIllllllllIlIll) {
      try {
         int lIllllllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIllllllllIlllI = Cipher.getInstance("Blowfish");
         lIllllllllIlllI.init(llIlllIlI[3], lIllllllllIlIII);
         return new String(lIllllllllIlllI.doFinal(Base64.getDecoder().decode(lIllllllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   private final boolean 〥ҳⱆ() {
      return (Boolean)this.Ἒⅾ.ⲋ(this, ⲋ[llIlllIlI[5]]);
   }

   @ȵ
   public final void ⲋ(@NotNull ꝱᶁ llIIIIIIIIlIlll) {
      Packet llIIIIIIIIlIllI = llIIIIIIIIlIlll.ᴃᎲ();
      if (lllIIllllI(llIIIIIIIIlIllI instanceof SPacketBlockChange)) {
         llIIIIIIIIllIII.ⲋ(((SPacketBlockChange)llIIIIIIIIlIlll.ᴃᎲ()).func_179827_b());
         "".length();
         if (-" ".length() >= "   ".length()) {
            return;
         }
      } else if (lllIIllllI(llIIIIIIIIlIllI instanceof SPacketMultiBlockChange)) {
         long llIIIIIIIIlIlIl = ((SPacketMultiBlockChange)llIIIIIIIIlIlll.ᴃᎲ()).func_179844_a();
         byte llIIIIIIIIlIlII = llIlllIlI[1];
         String llIIIIIIIIlIIll = llIIIIIIIIlIlIl;
         int llIIIIIIIIlIIlI = llIIIIIIIIlIlIl.length;
         int llIIIIIIIIlIIIl = llIlllIlI[1];

         while(lllIlIIlII(llIIIIIIIIlIIIl, llIIIIIIIIlIIlI)) {
            short llIIIIIIIIlIIII = llIIIIIIIIlIIll[llIIIIIIIIlIIIl];
            char llIIIIIIIIIlllI = llIlllIlI[1];
            llIIIIIIIIllIII.ⲋ(llIIIIIIIIlIIII.func_180090_a());
            ++llIIIIIIIIlIIIl;
            "".length();
            if (" ".length() == 0) {
               return;
            }
         }

         "".length();
         if ("  ".length() <= " ".length()) {
            return;
         }
      } else if (lllIIllllI(llIIIIIIIIlIllI instanceof SPacketUnloadChunk)) {
         llIIIIIIIIllIII.ⲋ(new ChunkPos(((SPacketUnloadChunk)llIIIIIIIIlIlll.ᴃᎲ()).func_186940_a(), ((SPacketUnloadChunk)llIIIIIIIIlIlll.ᴃᎲ()).func_186941_b()));
         "".length();
         if ("   ".length() != "   ".length()) {
            return;
         }
      }

   }

   @JvmName(
      name = "ⲋ"
   )
   private final List<String> ⲋ() {
      return (List)this.ĂƂ.ⲋ(this, ⲋ[llIlllIlI[1]]);
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      return String.valueOf(this.Đ);
   }

   private static boolean lllIlIIIIl(Object var0) {
      return var0 == null;
   }

   protected void ʅ() {
      super.ʅ();
      ExecutorService var10000 = this.Ꜥ;
      if (lllIIlllIl(var10000)) {
         var10000.shutdownNow();
         "".length();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         "".length();
      }

      this.Ꜥ = (ExecutorService)null;
      this.ⲡ.clear();
   }

   private static String lllIIIIllI(String lIlllllllIlllll, String lIlllllllIlllII) {
      try {
         long lIlllllllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllllllIlllII.getBytes(StandardCharsets.UTF_8)), llIlllIlI[8]), "DES");
         Cipher lIllllllllIIIIl = Cipher.getInstance("DES");
         lIllllllllIIIIl.init(llIlllIlI[3], lIlllllllIllIll);
         return new String(lIllllllllIIIIl.doFinal(Base64.getDecoder().decode(lIlllllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lllIIlllII() {
      llIlllIlI = new int[35];
      llIlllIlI[0] = 69 ^ 66;
      llIlllIlI[1] = (38 + 75 - -6 + 8 ^ 80 ^ 19) & (166 + 102 - 238 + 155 ^ 48 + 47 - 45 + 83 ^ -" ".length());
      llIlllIlI[2] = " ".length();
      llIlllIlI[3] = "  ".length();
      llIlllIlI[4] = "   ".length();
      llIlllIlI[5] = 145 ^ 136 ^ 70 ^ 91;
      llIlllIlI[6] = 224 ^ 187 ^ 224 ^ 190;
      llIlllIlI[7] = 186 ^ 188;
      llIlllIlI[8] = 204 ^ 196;
      llIlllIlI[9] = 26 ^ 16 ^ "   ".length();
      llIlllIlI[10] = 40 ^ 104 ^ 61 ^ 119;
      llIlllIlI[11] = 64 ^ 75;
      llIlllIlI[12] = 121 ^ 110 ^ 160 ^ 187;
      llIlllIlI[13] = 127 ^ 114;
      llIlllIlI[14] = 37 + 59 - 59 + 97 ^ 106 + 21 - 71 + 80;
      llIlllIlI[15] = 115 + 43 - 79 + 81 ^ 64 + 29 - 69 + 104;
      llIlllIlI[16] = 51 + 92 - 123 + 159 ^ 39 + 34 - -41 + 49;
      llIlllIlI[17] = 166 ^ 169;
      llIlllIlI[18] = 89 ^ 72;
      llIlllIlI[19] = 23 ^ 47;
      llIlllIlI[20] = 126 ^ 117 ^ 126 ^ 103;
      llIlllIlI[21] = 161 ^ 189 ^ 153 ^ 150;
      llIlllIlI[22] = 25 ^ 38 ^ 50 ^ 25;
      llIlllIlI[23] = 47 ^ 59 ^ " ".length();
      llIlllIlI[24] = 9 ^ 1 ^ 170 ^ 180;
      llIlllIlI[25] = 68 ^ 93 ^ 94 ^ 80;
      llIlllIlI[26] = 11 ^ 19;
      llIlllIlI[27] = 18 + 96 - 7 + 49 ^ 28 + 93 - 118 + 130;
      llIlllIlI[28] = 105 + 94 - 172 + 129 ^ 10 + 126 - 110 + 108;
      llIlllIlI[29] = 84 ^ 126 ^ 179 ^ 130;
      llIlllIlI[30] = 142 ^ 134 ^ 215 ^ 159;
      llIlllIlI[31] = 12 ^ 16;
      llIlllIlI[32] = 156 ^ 129;
      llIlllIlI[33] = 67 + 124 - 57 + 8 ^ 111 + 40 - 62 + 55;
      llIlllIlI[34] = 128 ^ 159;
   }

   protected void Đ() {
      super.Đ();
      this.Ꜥ = Executors.newFixedThreadPool(this.ϛⰄ());
      this.ς();
   }

   @JvmName(
      name = "u"
   )
   private final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[llIlllIlI[3]])).doubleValue();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final boolean ᴃᎲ() {
      return (Boolean)this.〥ҳⱆ.ⲋ(this, ⲋ[llIlllIlI[4]]);
   }

   private static boolean lllIIllllI(int var0) {
      return var0 != 0;
   }

   private static boolean lllIlIIIlI(int var0) {
      return var0 == 0;
   }

   static {
      lllIIlllII();
      lllIIllIII();
      KProperty[] var10000 = new KProperty[llIlllIlI[0]];
      var10000[llIlllIlI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⰷ.class), llIllIIll[llIlllIlI[1]], llIllIIll[llIlllIlI[2]]));
      var10000[llIlllIlI[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⰷ.class), llIllIIll[llIlllIlI[3]], llIllIIll[llIlllIlI[4]]));
      var10000[llIlllIlI[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⰷ.class), llIllIIll[llIlllIlI[5]], llIllIIll[llIlllIlI[6]]));
      var10000[llIlllIlI[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⰷ.class), llIllIIll[llIlllIlI[7]], llIllIIll[llIlllIlI[0]]));
      var10000[llIlllIlI[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⰷ.class), llIllIIll[llIlllIlI[8]], llIllIIll[llIlllIlI[9]]));
      var10000[llIlllIlI[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⰷ.class), llIllIIll[llIlllIlI[10]], llIllIIll[llIlllIlI[11]]));
      var10000[llIlllIlI[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⰷ.class), llIllIIll[llIlllIlI[12]], llIllIIll[llIlllIlI[13]]));
      ⲋ = var10000;
   }

   private static void lllIIllIII() {
      llIllIIll = new String[llIlllIlI[34]];
      llIllIIll[llIlllIlI[1]] = lllIIIIllI("3UOFdw1V3oE=", "KmMrv");
      llIllIIll[llIlllIlI[2]] = lllIIIlIII("CBM+BRQAFSE0UEY6ICYODlk/MxEDWQYuCxtN", "ovJGx");
      llIllIIll[llIlllIlI[3]] = lllIIIlIIl("o7g2rSip9kc=", "urlQe");
      llIllIIll[llIlllIlI[4]] = lllIIIIllI("0wuQkYxECYJ8MmiAFuhdFMzeWkRmvp/N8OgQS9Gcoz8=", "mDHRF");
      llIllIIll[llIlllIlI[5]] = lllIIIIllI("XwEiU7UZ2xM=", "HOMvy");
      llIllIIll[llIlllIlI[6]] = lllIIIlIIl("djJcj6vdohrr+bLHwVwtAg==", "ZwisF");
      llIllIIll[llIlllIlI[7]] = lllIIIlIIl("QD/fOZeNmVk=", "FYEAL");
      llIllIIll[llIlllIlI[0]] = lllIIIIllI("ylc7rmAtFUTHkGItPBShYQ==", "YSiiD");
      llIllIIll[llIlllIlI[8]] = lllIIIlIII("AAAtCx8qBSUAGAsLKhw=", "blBht");
      llIllIIll[llIlllIlI[9]] = lllIIIIllI("dhrx7D855+xHmgLA5GoBl4bDW52gZKP3", "RDyUR");
      llIllIIll[llIlllIlI[10]] = lllIIIIllI("3WzNqIvfNsD8iJKHIeyhSw==", "rpIiX");
      llIllIIll[llIlllIlI[11]] = lllIIIlIII("Ph0+FiEsFiEHKDcfL31gEA==", "YxJUI");
      llIllIIll[llIlllIlI[12]] = lllIIIIllI("WGzVdUv7d1I=", "TlYGS");
      llIllIIll[llIlllIlI[13]] = lllIIIlIII("BiEGJjoTIRMWIUltOw==", "aDrrR");
      llIllIIll[llIlllIlI[14]] = lllIIIlIIl("ix/BmIuhKC0=", "qlJUa");
      llIllIIll[llIlllIlI[17]] = lllIIIIllI("IUFst0XHz0Y=", "KGFuq");
      llIllIIll[llIlllIlI[16]] = lllIIIlIII("OAgPBjAD", "kmntS");
      llIllIIll[llIlllIlI[18]] = lllIIIlIII("MgA6AidUCzgJNx8aeg==", "tiTfT");
      llIllIIll[llIlllIlI[20]] = lllIIIlIII("IzQlIBMS", "aXJCx");
      llIllIIll[llIlllIlI[21]] = lllIIIlIII("BiU2LAca", "vJDXf");
      llIllIIll[llIlllIlI[22]] = lllIIIlIIl("8YxJbbAfhSQ=", "LUSSM");
      llIllIIll[llIlllIlI[23]] = lllIIIIllI("fsroFQoOiDjgB7+4Fu9nhA==", "xluSv");
      llIllIIll[llIlllIlI[24]] = lllIIIIllI("b0laFNG7t2nG6ucdUVo46Q==", "Hgdzt");
      llIllIIll[llIlllIlI[25]] = lllIIIlIIl("kHZPXv3nC9g=", "JTAIq");
      llIllIIll[llIlllIlI[26]] = lllIIIlIII("Gxg3PRY=", "ZtGUw");
      llIllIIll[llIlllIlI[27]] = lllIIIIllI("FlQ8ZHQxA1s=", "MkpQf");
      llIllIIll[llIlllIlI[28]] = lllIIIlIIl("pZY4ZDRxxSU=", "izOCL");
      llIllIIll[llIlllIlI[29]] = lllIIIIllI("pwc0td/ei75oQjxmda4zVg==", "ZToQs");
      llIllIIll[llIlllIlI[31]] = lllIIIlIII("FzkxHzInIg==", "CQCzS");
      llIllIIll[llIlllIlI[32]] = lllIIIlIIl("uenKTBiAO+BuZ8LOxMnLs05D5W1WPj6G1aKiqtyRpOCwkA7/S5GZCI0UHNAjAFZsHE8N90oXfiqxKstax6VL6sOCWf9RGNeaUPeBO2msEKw=", "mehcB");
      llIllIIll[llIlllIlI[33]] = lllIIIlIII("IRkJECQQ", "cufsO");
   }
}
