package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreenServerList;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020.:\u0002\t\u0011B\u0007¢\u0006\u0004\b-\u0010(J\r\u0010\u0019\u001a\u00020'¢\u0006\u0004\b\u0019\u0010(J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\u000eJ\u0017\u0010\t\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b\t\u0010,J\r\u0010\u000b\u001a\u00020'¢\u0006\u0004\b\u000b\u0010(R9\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0086\u0004R&\u0010\u0011\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0086\u000eR\"\u0010\u000f\u001a\u00020\n8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0082\u0084\u0002R\"\u0010\u0007\u001a\u00020\n8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0082\u0084\u0002R\u0017\u0010\u0014\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0086\u0004R\"\u0010\r\u001a\u00020\u00168C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0082\u0084\u0002R&\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b\"\u0004\b\u000f\u0010\u001c¨\u0006\u0086\u000eR&\u0010 \u001a\u00020\u001d8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\t\u0010\"¨\u0006\u0086\u000eR9\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00028\u0007@\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0086\u0004R\u0017\u0010\u0019\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0086\u0004R\"\u0010\u001e\u001a\u00020#8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b$\u0010%¨\u0006\u0082\u0084\u0002R\"\u0010&\u001a\u00020\u00048G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\t\u0010\u001b¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/Ә;", "Ljava/util/HashMap;", "Lkotlin/collections/ĂƂ;", "Lnet/minecraft/block/Block;", "", "ϛⰄ", "Ljava/util/HashMap;", "ᴃᎲ", "()Ljava/util/HashMap;", "ⲋ", "", "Ꜥ", "Ljava/lang/String;", "Ἒⅾ", "()Ljava/lang/String;", "u", "(Ljava/lang/String;)V", "ĂƂ", "La/ⅹ;", "Ӄ", "〥ҳⱆ", "Ⱬ", "La/Ә$ⲋ;", "ⱛṧ", "()La/Ә$ⲋ;", "ⲡ", "I", "()I", "(I)V", "Lnet/minecraft/util/math/BlockPos;", "Đ", "Lnet/minecraft/util/math/BlockPos;", "ς", "()Lnet/minecraft/util/math/BlockPos;", "(Lnet/minecraft/util/math/BlockPos;)V", "La/Ә$ĂƂ;", "ᶐ", "()La/Ә$ĂƂ;", "ᵴἥ", "", "()V", "Ἒ", "La/Ꮐ꯴;", "p0", "(La/Ꮐ꯴;)V", "<init>", "La/ⳅ;"}
)
public final class Ә extends ⳅ {
   private static String llIIIlIlI(String lllIIIlIlIllllI, String lllIIIlIlIlllIl) {
      try {
         boolean lllIIIlIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), llIIIlIl[8]), "DES");
         Cipher lllIIIlIllIIIII = Cipher.getInstance("DES");
         lllIIIlIllIIIII.init(llIIIlIl[3], lllIIIlIlIllIlI);
         return new String(lllIIIlIllIIIII.doFinal(Base64.getDecoder().decode(lllIIIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public final void ⲡ() {
      String var25;
      if (llIlIllII(lllIIIlIlllIIll.ɡ().field_71439_g) && llIllIlIl(lllIIIlIlllIIll.ɡ().field_71439_g.field_71093_bK, lllIIIlIlllIIll.ⲡ)) {
         switch(lllIIIlIlllIIll.ɡ().field_71439_g.field_71093_bK) {
         case -1:
            var25 = lIlllIll[llIIIlIl[30]];
            "".length();
            if ((132 ^ 128) <= "  ".length()) {
               return;
            }
            break;
         case 0:
            var25 = lIlllIll[llIIIlIl[28]];
            "".length();
            if (" ".length() <= 0) {
               return;
            }
            break;
         case 1:
            var25 = lIlllIll[llIIIlIl[29]];
            "".length();
            if ("  ".length() <= -" ".length()) {
               return;
            }
            break;
         default:
            var25 = lIlllIll[llIIIlIl[31]];
         }

         short lllIIIlIlllIIlI = var25;
         lllIIIlIlllIIll.Ꜥ = String.valueOf((new StringBuilder()).append(lIlllIll[llIIIlIl[32]]).append(lllIIIlIlllIIlI));
      } else {
         if (llIlIllII(lllIIIlIlllIIll.ɡ().field_71462_r)) {
            if (llIllIIlI(lllIIIlIlllIIll.ɡ().field_71462_r instanceof GuiInventory)) {
               lllIIIlIlllIIll.Ꜥ = lIlllIll[llIIIlIl[33]];
               return;
            }

            if (llIllIIlI(lllIIIlIlllIIll.ɡ().field_71462_r instanceof GuiScreenServerList)) {
               lllIIIlIlllIIll.Ꜥ = lIlllIll[llIIIlIl[34]];
               return;
            }
         }

         Block lllIIIlIlllIIlI;
         Map lllIIIlIlllIIIl;
         int lllIIIlIlllIIII;
         Iterable lllIIIlIllIllll;
         int lllIIIlIllIlllI;
         Iterator lllIIIlIllIllIl;
         Object lllIIIlIllIllII;
         Entry lllIIIlIllIlIll;
         int lllIIIlIllIlIlI;
         Entry lllIIIlIllIlIIl;
         int lllIIIlIllIlIII;
         String lllIIIlIllIIllI;
         Object var10000;
         StringCompanionObject lllIIIlIlllIIIl;
         Object[] var10001;
         String lllIIIlIlllIIII;
         Object[] lllIIIlIllIllll;
         int lllIIIlIllIlIll;
         Object lllIIIlIllIlIlI;
         int lllIIIlIllIlIIl;
         Entry var24;
         if (llIllIIlI(lllIIIlIlllIIll.ϛⰄ.size())) {
            lllIIIlIlllIIIl = (Map)lllIIIlIlllIIll.ϛⰄ;
            lllIIIlIlllIIII = llIIIlIl[1];
            lllIIIlIllIllll = (Iterable)lllIIIlIlllIIIl.entrySet();
            lllIIIlIllIlllI = llIIIlIl[1];
            lllIIIlIllIllIl = lllIIIlIllIllll.iterator();
            if (llIllIIII(lllIIIlIllIllIl.hasNext())) {
               var10000 = null;
               "".length();
               if (" ".length() <= 0) {
                  return;
               }
            } else {
               lllIIIlIllIllII = lllIIIlIllIllIl.next();
               if (llIllIIII(lllIIIlIllIllIl.hasNext())) {
                  var10000 = lllIIIlIllIllII;
                  "".length();
                  if ("   ".length() <= 0) {
                     return;
                  }
               } else {
                  lllIIIlIllIlIll = (Entry)lllIIIlIllIllII;
                  lllIIIlIllIlIlI = llIIIlIl[1];
                  lllIIIlIllIlIll = ((Number)lllIIIlIllIlIll.getValue()).intValue();

                  do {
                     lllIIIlIllIlIlI = lllIIIlIllIllIl.next();
                     lllIIIlIllIlIIl = (Entry)lllIIIlIllIlIlI;
                     lllIIIlIllIlIII = llIIIlIl[1];
                     lllIIIlIllIlIIl = ((Number)lllIIIlIllIlIIl.getValue()).intValue();
                     if (llIllIllI(lllIIIlIllIlIll, lllIIIlIllIlIIl)) {
                        lllIIIlIllIllII = lllIIIlIllIlIlI;
                        lllIIIlIllIlIll = lllIIIlIllIlIIl;
                     }
                  } while(!llIllIIII(lllIIIlIllIllIl.hasNext()));

                  var10000 = lllIIIlIllIllII;
               }
            }

            var24 = (Entry)var10000;
            if (llIlIlllI(var24)) {
               Intrinsics.throwNpe();
            }

            lllIIIlIlllIIlI = (Block)var24.getKey();
            lllIIIlIlllIIIl = StringCompanionObject.INSTANCE;
            lllIIIlIlllIIII = lIlllIll[llIIIlIl[35]];
            var10001 = new Object[llIIIlIl[3]];
            var10001[llIIIlIl[1]] = lllIIIlIlllIIll.ϛⰄ.get(lllIIIlIlllIIlI);
            var10001[llIIIlIl[2]] = lllIIIlIlllIIlI.func_149732_F();
            lllIIIlIllIllll = var10001;
            lllIIIlIllIlllI = llIIIlIl[1];
            var25 = String.format(lllIIIlIlllIIII, Arrays.copyOf(lllIIIlIllIllll, lllIIIlIllIllll.length));
            Intrinsics.checkExpressionValueIsNotNull(var25, lIlllIll[llIIIlIl[36]]);
            lllIIIlIllIIllI = var25;
            lllIIIlIlllIIll.Ꜥ = lllIIIlIllIIllI;
         } else if (!llIllIIlI(lllIIIlIlllIIll.ς.size())) {
            if (llIlIllII(lllIIIlIlllIIll.ɡ().field_71439_g)) {
               short lllIIIlIlllIIlI = lllIIIlIlllIIll.ɡ().field_71439_g.func_180425_c();
               int lllIIIlIlllIIIl = lllIIIlIlllIIlI.func_185332_f(lllIIIlIlllIIll.Đ.func_177958_n(), lllIIIlIlllIIll.Đ.func_177956_o(), lllIIIlIlllIIll.Đ.func_177952_p());
               if (llIlIllll(llIllIlII(lllIIIlIlllIIIl, 1.0D))) {
                  if (llIllIIlI(lllIIIlIlllIIll.ɡ().field_71439_g.func_184613_cA())) {
                     lllIIIlIlllIIll.Ꜥ = lIlllIll[llIIIlIl[39]];
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     lllIIIlIlllIIll.Ꜥ = lIlllIll[llIIIlIl[40]];
                  }

                  return;
               }
            }

         } else {
            lllIIIlIlllIIIl = (Map)lllIIIlIlllIIll.ς;
            lllIIIlIlllIIII = llIIIlIl[1];
            lllIIIlIllIllll = (Iterable)lllIIIlIlllIIIl.entrySet();
            lllIIIlIllIlllI = llIIIlIl[1];
            lllIIIlIllIllIl = lllIIIlIllIllll.iterator();
            if (llIllIIII(lllIIIlIllIllIl.hasNext())) {
               var10000 = null;
               "".length();
               if (" ".length() <= -" ".length()) {
                  return;
               }
            } else {
               lllIIIlIllIllII = lllIIIlIllIllIl.next();
               if (llIllIIII(lllIIIlIllIllIl.hasNext())) {
                  var10000 = lllIIIlIllIllII;
                  "".length();
                  if (-"  ".length() > 0) {
                     return;
                  }
               } else {
                  lllIIIlIllIlIll = (Entry)lllIIIlIllIllII;
                  lllIIIlIllIlIlI = llIIIlIl[1];
                  lllIIIlIllIlIll = ((Number)lllIIIlIllIlIll.getValue()).intValue();

                  do {
                     lllIIIlIllIlIlI = lllIIIlIllIllIl.next();
                     lllIIIlIllIlIIl = (Entry)lllIIIlIllIlIlI;
                     lllIIIlIllIlIII = llIIIlIl[1];
                     lllIIIlIllIlIIl = ((Number)lllIIIlIllIlIIl.getValue()).intValue();
                     if (llIllIllI(lllIIIlIllIlIll, lllIIIlIllIlIIl)) {
                        lllIIIlIllIllII = lllIIIlIllIlIlI;
                        lllIIIlIllIlIll = lllIIIlIllIlIIl;
                     }
                  } while(!llIllIIII(lllIIIlIllIllIl.hasNext()));

                  var10000 = lllIIIlIllIllII;
               }
            }

            var24 = (Entry)var10000;
            if (llIlIlllI(var24)) {
               Intrinsics.throwNpe();
            }

            lllIIIlIlllIIlI = (Block)var24.getKey();
            lllIIIlIlllIIIl = StringCompanionObject.INSTANCE;
            lllIIIlIlllIIII = lIlllIll[llIIIlIl[37]];
            var10001 = new Object[llIIIlIl[3]];
            var10001[llIIIlIl[1]] = lllIIIlIlllIIll.ς.get(lllIIIlIlllIIlI);
            var10001[llIIIlIl[2]] = lllIIIlIlllIIlI.func_149732_F();
            lllIIIlIllIllll = var10001;
            lllIIIlIllIlllI = llIIIlIl[1];
            var25 = String.format(lllIIIlIlllIIII, Arrays.copyOf(lllIIIlIllIllll, lllIIIlIllIllll.length));
            Intrinsics.checkExpressionValueIsNotNull(var25, lIlllIll[llIIIlIl[38]]);
            lllIIIlIllIIllI = var25;
            lllIIIlIlllIIll.Ꜥ = lllIIIlIllIIllI;
         }
      }
   }

   private static int llIllIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final HashMap<Block, Integer> ᴃᎲ() {
      return this.ϛⰄ;
   }

   private static boolean llIllIllI(int var0, int var1) {
      return var0 < var1;
   }

   public Ә() {
      super(lIlllIll[llIIIlIl[41]], lIlllIll[llIIIlIl[42]], ı５.ĂƂ, llIIIlIl[1], (boolean)llIIIlIl[2], (boolean)llIIIlIl[1], llIIIlIl[42], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIlllIll[llIIIlIl[43]], Ә.ⲋ.u);
      this.u = this.ⲋ(lIlllIll[llIIIlIl[44]], Ә.ĂƂ.ĂƂ);
      this.ᴃᎲ = this.ⲋ(lIlllIll[llIIIlIl[19]], lIlllIll[llIIIlIl[45]]);
      this.〥ҳⱆ = this.ⲋ(lIlllIll[llIIIlIl[20]], lIlllIll[llIIIlIl[46]]);
      this.Ἒⅾ = this.ⲋ(lIlllIll[llIIIlIl[47]], llIIIlIl[48]).u((Object)llIIIlIl[49]).ᴃᎲ((Object)llIIIlIl[50]).ᴃᎲ(lIlllIll[llIIIlIl[51]]);
      this.ᵴἥ().ⲋ((Function1)null.ⲋ);
      int var1 = llIIIlIl[1];
      HashMap var3 = new HashMap();
      this.ϛⰄ = var3;
      var1 = llIIIlIl[1];
      var3 = new HashMap();
      this.ς = var3;
      this.Ꜥ = lIlllIll[llIIIlIl[52]];
      this.Đ = new BlockPos(llIIIlIl[1], llIIIlIl[1], llIIIlIl[1]);
   }

   private static boolean llIllIIII(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final String Ἒⅾ() {
      return this.Ꜥ;
   }

   @ȵ
   public final void ⲋ(@NotNull Ꮐ꯴ lllIIIllIIIlIIl) {
      Packet lllIIIllIIIlIII = lllIIIllIIIlIIl.ᴃᎲ();
      HashMap var10000;
      Block var10001;
      Integer var10002;
      Object var10003;
      if (llIllIIlI(lllIIIllIIIlIII instanceof CPacketPlayerTryUseItemOnBlock)) {
         EnumHand var3 = ((CPacketPlayerTryUseItemOnBlock)lllIIIllIIIlIIl.ᴃᎲ()).func_187022_c();
         ItemStack var4 = lllIIIllIIIlIlI.ɡ().field_71439_g.func_184586_b(var3);
         Item var5 = var4.field_151002_e;
         if (llIlIllII(var5) && llIllIIlI(var5 instanceof ItemBlock)) {
            var10000 = lllIIIllIIIlIlI.ς;
            var10001 = ((ItemBlock)var5).func_179223_d();
            var10002 = llIIIlIl[2];
            var10003 = (Function2)null.ⲋ;
            if (llIlIllII(var10003)) {
               Object var6 = var10003;
               var10003 = new ᾇ﹍((Function2)var6);
            }

            var10000.merge(var10001, var10002, (BiFunction)var10003);
            "".length();
            "".length();
            if ((49 ^ 53) <= -" ".length()) {
               return;
            }
         }
      } else if (llIllIIlI(lllIIIllIIIlIII instanceof CPacketPlayerDigging) && llIllIIll(((CPacketPlayerDigging)lllIIIllIIIlIIl.ᴃᎲ()).func_180762_c(), Action.STOP_DESTROY_BLOCK)) {
         var10000 = lllIIIllIIIlIlI.ϛⰄ;
         var10001 = lllIIIllIIIlIlI.ɡ().field_71441_e.func_180495_p(((CPacketPlayerDigging)lllIIIllIIIlIIl.ᴃᎲ()).func_179715_a()).func_177230_c();
         var10002 = llIIIlIl[2];
         var10003 = (Function2)null.ⲋ;
         if (llIlIllII(var10003)) {
            byte lllIIIllIIIIlll = var10003;
            var10003 = new ᾇ﹍((Function2)lllIIIllIIIIlll);
         }

         var10000.merge(var10001, var10002, (BiFunction)var10003);
         "".length();
         "".length();
         if ((104 ^ 108) == 0) {
            return;
         }
      }

   }

   private static String llIIIlIll(String lllIIIlIlIIlllI, String lllIIIlIlIIlIII) {
      lllIIIlIlIIlllI = new String(Base64.getDecoder().decode(lllIIIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIIIlIlIIllII = new StringBuilder();
      char[] lllIIIlIlIIlIll = lllIIIlIlIIlIII.toCharArray();
      int lllIIIlIlIIlIlI = llIIIlIl[1];
      float lllIIIlIlIIIlII = lllIIIlIlIIlllI.toCharArray();
      char lllIIIlIlIIIIll = lllIIIlIlIIIlII.length;
      int lllIIIlIlIIIIlI = llIIIlIl[1];

      do {
         if (!llIllIllI(lllIIIlIlIIIIlI, lllIIIlIlIIIIll)) {
            return String.valueOf(lllIIIlIlIIllII);
         }

         char lllIIIlIlIIIIIl = lllIIIlIlIIIlII[lllIIIlIlIIIIlI];
         lllIIIlIlIIllII.append((char)(lllIIIlIlIIIIIl ^ lllIIIlIlIIlIll[lllIIIlIlIIlIlI % lllIIIlIlIIlIll.length]));
         "".length();
         ++lllIIIlIlIIlIlI;
         ++lllIIIlIlIIIIlI;
         "".length();
      } while(("   ".length() & ("   ".length() ^ -" ".length())) == ((199 ^ 143 ^ 234 ^ 194) & (63 ^ 11 ^ 52 ^ 96 ^ -" ".length())));

      return null;
   }

   @JvmName(
      name = "u"
   )
   public final String u() {
      // $FF: Couldn't be decompiled
   }

   @JvmName(
      name = "Ӄ"
   )
   private final String Ӄ() {
      return (String)this.ᴃᎲ.ⲋ(this, ⲋ[llIIIlIl[3]]);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final String ĂƂ() {
      // $FF: Couldn't be decompiled
   }

   private static boolean llIlIllII(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return ((Number)this.Ἒⅾ.ⲋ(this, ⲋ[llIIIlIl[5]])).intValue();
   }

   public final void Ꜥ() {
      this.ϛⰄ.clear();
      this.ς.clear();
      this.Ꜥ = lIlllIll[llIIIlIl[27]];
      if (llIlIllII(this.ɡ().field_71439_g)) {
         this.ⲡ = this.ɡ().field_71439_g.field_71093_bK;
         this.Đ = this.ɡ().field_71439_g.func_180425_c();
      }

   }

   private final String Ἒ() {
      if (llIlIlllI(lllIIIllIlIIIII.ɡ().field_71439_g)) {
         return lIlllIll[llIIIlIl[15]];
      } else {
         float lllIIIllIIlllll = lIlllIll[llIIIlIl[16]];
         Exception lllIIIllIIllllI = 0.0D;
         int lllIIIllIIlllIl = lllIIIllIlIIIII.ɡ().field_71439_g.field_70165_t;
         float lllIIIllIIlllII = llIIIlIl[1];
         double var10000 = Math.abs(lllIIIllIIlllIl);
         lllIIIllIIlllIl = lllIIIllIlIIIII.ɡ().field_71439_g.field_70161_v;
         short lllIIIllIIlIlll = var10000;
         lllIIIllIIlllII = llIIIlIl[1];
         float lllIIIllIIlIllI = Math.abs(lllIIIllIIlllIl);
         if (llIlIllll(llIlIllIl(lllIIIllIIlIlll, lllIIIllIIlIllI))) {
            lllIIIllIIlllll = lIlllIll[llIIIlIl[17]];
            lllIIIllIIllllI = lllIIIllIlIIIII.ɡ().field_71439_g.field_70165_t;
            "".length();
            if ("  ".length() < " ".length()) {
               return null;
            }
         } else {
            lllIIIllIIlllll = lIlllIll[llIIIlIl[18]];
            lllIIIllIIllllI = lllIIIllIlIIIII.ɡ().field_71439_g.field_70161_v;
         }

         if (llIlIllll(llIlIllIl(lllIIIllIIllllI, 0.0D))) {
            lllIIIllIIlllll = String.valueOf((new StringBuilder()).append((char)llIIIlIl[19]).append(lllIIIllIIlllll));
            "".length();
            if ((8 ^ 13) == 0) {
               return null;
            }
         } else {
            lllIIIllIIlllll = String.valueOf((new StringBuilder()).append((char)llIIIlIl[20]).append(lllIIIllIIlllll));
         }

         if (llIllIIII(lllIIIllIlIIIII.ɡ().field_71439_g.field_71093_bK)) {
            lllIIIllIIllllI /= 8.0D;
         }

         lllIIIllIIlllIl = 3750000.0D;
         double lllIIIllIIllIll = llIIIlIl[1];
         float lllIIIllIIlllII = Math.abs(lllIIIllIIllllI) / lllIIIllIIlllIl * 100.0D;
         if (llIllIIIl(llIlIllIl(lllIIIllIIlllII, 100.0D))) {
            lllIIIllIIlllII = 100.0D;
         }

         StringCompanionObject var17 = StringCompanionObject.INSTANCE;
         String var9 = String.valueOf((new StringBuilder()).append(lllIIIllIIlllll).append(lIlllIll[llIIIlIl[21]]));
         Object[] var18 = new Object[llIIIlIl[2]];
         var18[llIIIlIl[1]] = lllIIIllIIlllII;
         Object[] var10 = var18;
         int var11 = llIIIlIl[1];
         String var19 = String.format(var9, Arrays.copyOf(var10, var10.length));
         Intrinsics.checkExpressionValueIsNotNull(var19, lIlllIll[llIIIlIl[22]]);
         return var19;
      }
   }

   private static boolean llIllIlIl(int var0, int var1) {
      return var0 != var1;
   }

   @JvmName(
      name = "ᶐ"
   )
   private final Ә.ĂƂ ᶐ() {
      return (Ә.ĂƂ)this.u.ⲋ(this, ⲋ[llIIIlIl[2]]);
   }

   @JvmName(
      name = "Ⱬ"
   )
   private final String Ⱬ() {
      return (String)this.〥ҳⱆ.ⲋ(this, ⲋ[llIIIlIl[4]]);
   }

   private static boolean llIllIIIl(int var0) {
      return var0 >= 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull BlockPos var1) {
      this.Đ = var1;
   }

   private static boolean llIlIllll(int var0) {
      return var0 > 0;
   }

   @JvmName(
      name = "ⱛṧ"
   )
   private final Ә.ⲋ ⱛṧ() {
      return (Ә.ⲋ)this.ĂƂ.ⲋ(this, ⲋ[llIIIlIl[1]]);
   }

   @JvmName(
      name = "ς"
   )
   public final BlockPos ς() {
      return this.Đ;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final HashMap<Block, Integer> 〥ҳⱆ() {
      return this.ς;
   }

   private static int llIlIllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      llIlIlIll();
      llIIlllll();
      KProperty[] var10000 = new KProperty[llIIIlIl[0]];
      var10000[llIIIlIl[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ә.class), lIlllIll[llIIIlIl[1]], lIlllIll[llIIIlIl[2]]));
      var10000[llIIIlIl[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ә.class), lIlllIll[llIIIlIl[3]], lIlllIll[llIIIlIl[4]]));
      var10000[llIIIlIl[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ә.class), lIlllIll[llIIIlIl[5]], lIlllIll[llIIIlIl[0]]));
      var10000[llIIIlIl[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ә.class), lIlllIll[llIIIlIl[6]], lIlllIll[llIIIlIl[7]]));
      var10000[llIIIlIl[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ә.class), lIlllIll[llIIIlIl[8]], lIlllIll[llIIIlIl[9]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "u"
   )
   public final void u(int var1) {
      this.ⲡ = var1;
   }

   private static String llIIIllIl(String lllIIIlIIllIlll, String lllIIIlIIlllIII) {
      try {
         SecretKeySpec lllIIIlIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllIIIlIIlllIll = Cipher.getInstance("Blowfish");
         lllIIIlIIlllIll.init(llIIIlIl[3], lllIIIlIIllllII);
         return new String(lllIIIlIIlllIll.doFinal(Base64.getDecoder().decode(lllIIIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIllIIlI(int var0) {
      return var0 != 0;
   }

   private static boolean llIlIlllI(Object var0) {
      return var0 == null;
   }

   private static boolean llIllIIll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void llIIlllll() {
      lIlllIll = new String[llIIIlIl[53]];
      lIlllIll[llIIIlIl[1]] = llIIIlIlI("2rUEHpg+H3eYmyns3swWlg==", "QxlDF");
      lIlllIll[llIIIlIl[2]] = llIIIlIlI("ultYA1Dzq8drSWL4wOughAP8Z7QvEFA2UsuNMezxd3myhGI1orDbc5T/AsUJgUrLlAXmtDtOoOBQXb8Y7WUP1cCI5etsV+4w", "TySAf");
      lIlllIll[llIIIlIl[3]] = llIIIlIll("JyAxHDcZOzQN", "TTPhR");
      lIlllIll[llIIIlIl[4]] = llIIIlIlI("PdhbZBTUj/fPcmEcumyjNdHWlQcD/U/fNjgKCoH/OQ3C4k0eAP/aEmKa++AmoZ1uhCbRZ61dSpePPFgJEXDAvGjz5ucwJnKm", "CJJla");
      lIlllIll[llIIIlIl[5]] = llIIIlIll("BiI1LiYIEyMuKAw7NQ==", "eWFZI");
      lIlllIll[llIIIlIl[0]] = llIIIlIlI("AyzLR7fbRHHsi4rwcG0NPY+mMVZc/cqTdfS9dLchYKuYU8A3X6HSNA==", "KbRMa");
      lIlllIll[llIIIlIl[6]] = llIIIlIlI("xY28ANScC4zoBXNljOC2CA==", "jkZvy");
      lIlllIll[llIIIlIl[7]] = llIIIlIll("Lz8fLi07LgQACzw7HwhwYRYBDC4pdQcMNi91OBkqITQMVg==", "HZkmX");
      lIlllIll[llIIIlIl[8]] = llIIIlIll("HyITGC0PGxkNPBgkFhU=", "jRwyY");
      lIlllIll[llIIIlIl[9]] = llIIIlIlI("gR9f3l+RmYadRD66+eiy+Kd9QexWpo2J", "KxcdU");
      lIlllIll[llIIIlIl[10]] = llIIIlIll("", "YzTVM");
      lIlllIll[llIIIlIl[11]] = llIIIlIlI("j+w3NSdesBHA32p57TTojg==", "wqAww");
      lIlllIll[llIIIlIl[12]] = llIIIlIll("MTU7EwEPPnoFBkE=", "aYZjh");
      lIlllIll[llIIIlIl[13]] = llIIIlIlI("zudg5VAvOBE=", "qjNqb");
      lIlllIll[llIIIlIl[14]] = llIIIlIlI("b3/BEJ7dlVRfRbfkqJfk1Q==", "ZgLSh");
      lIlllIll[llIIIlIl[15]] = llIIIlIlI("Tlpl9KCGOXE=", "hzLdr");
      lIlllIll[llIIIlIl[16]] = llIIIlIll("", "mVerC");
      lIlllIll[llIIIlIl[17]] = llIIIllIl("nyCekD1BB3U=", "EPzvS");
      lIlllIll[llIIIlIl[18]] = llIIIllIl("b2FXDF4J+dk=", "qmUbj");
      lIlllIll[llIIIlIl[21]] = llIIIlIll("chYLakx3b3s2SXc=", "RAIPl");
      lIlllIll[llIIIlIl[22]] = llIIIllIl("12Yze1DgYzU=", "jRIqU");
      lIlllIll[llIIIlIl[23]] = llIIIlIlI("MlvusKM567s=", "SONCe");
      lIlllIll[llIIIlIl[24]] = llIIIlIlI("X22T9cliXME85wHFFtvKoQ==", "vOewK");
      lIlllIll[llIIIlIl[25]] = llIIIlIlI("0b3ChK1jKsU=", "kXWZF");
      lIlllIll[llIIIlIl[26]] = llIIIlIlI("9JGo2h1RtK8=", "dCutO");
      lIlllIll[llIIIlIl[27]] = llIIIlIlI("1ttSglIGie4=", "IAYNl");
      lIlllIll[llIIIlIl[28]] = llIIIlIlI("8N1rKYT/2KFUj0qzjW5INQ==", "IADAh");
      lIlllIll[llIIIlIl[29]] = llIIIlIll("Jhol", "ctAAS");
      lIlllIll[llIIIlIl[30]] = llIIIlIll("FBQaBh0o", "Zqnnx");
      lIlllIll[llIIIlIl[31]] = llIIIlIll("", "zRmYo");
      lIlllIll[llIIIlIl[32]] = llIIIlIll("BQYYMHEmDFYwOTdD", "RcvDQ");
      lIlllIll[llIIIlIl[33]] = llIIIllIl("aPRsLdXbicX7ky9FgF0vyqvlLlUv3tLU", "aQyTo");
      lIlllIll[llIIIlIl[34]] = llIIIlIlI("QQmRv40/BvySqDPGs3l43wV15u7rjOM4", "JgcOh");
      lIlllIll[llIIIlIl[35]] = llIIIlIll("OhklOyxYTi5wbAs=", "xkJPI");
      lIlllIll[llIIIlIl[36]] = llIIIlIlI("F/zxlBdTOls=", "Twimu");
      lIlllIll[llIIIlIl[37]] = llIIIllIl("3KXyLLYnsJEjGhAgAUzUGQ==", "hfXTK");
      lIlllIll[llIIIlIl[38]] = llIIIllIl("oVsPBlpYcRg=", "GXFaP");
      lIlllIll[llIIIlIl[39]] = llIIIlIlI("GfhL/z1gmNk=", "gWlIp");
      lIlllIll[llIIIlIl[40]] = llIIIlIlI("zKWYPtx0wgo=", "UIefo");
      lIlllIll[llIIIlIl[41]] = llIIIlIlI("Uirzepj2MoDjGxkatc93LA==", "wgFDp");
      lIlllIll[llIIIlIl[42]] = llIIIlIlI("09x7FATQRi7MTDO6Z4Az+SMqa76zPOiYR3cum7nvqhpi4XrHbT9WHQ==", "uLIwR");
      lIlllIll[llIIIlIl[43]] = llIIIlIlI("mxLFCDz3cN4=", "OWpHI");
      lIlllIll[llIIIlIl[44]] = llIIIlIll("BD4wBi8=", "WJQrJ");
      lIlllIll[llIIIlIl[19]] = llIIIlIlI("Xf5fMUilfOU+Q1q9pshJKw==", "snJVM");
      lIlllIll[llIIIlIl[45]] = llIIIllIl("1gp6vqf9OI0=", "fEXSw");
      lIlllIll[llIIIlIl[20]] = llIIIlIll("ATsyIhcvbhIiGTYr", "BNAVx");
      lIlllIll[llIIIlIl[46]] = llIIIlIlI("S9txG5IbLjU=", "euCnN");
      lIlllIll[llIIIlIl[47]] = llIIIlIll("Pwk2CT8PWRsGPw8LJAkn", "jyRhK");
      lIlllIll[llIIIlIl[51]] = llIIIllIl("pkhF1hW19cE=", "pScQn");
      lIlllIll[llIIIlIl[52]] = llIIIlIll("", "FOVTR");
   }

   private static void llIlIlIll() {
      llIIIlIl = new int[54];
      llIIIlIl[0] = 172 ^ 169;
      llIIIlIl[1] = "  ".length() & ~"  ".length();
      llIIIlIl[2] = " ".length();
      llIIIlIl[3] = "  ".length();
      llIIIlIl[4] = "   ".length();
      llIIIlIl[5] = 9 ^ 103 ^ 115 ^ 25;
      llIIIlIl[6] = 172 ^ 170;
      llIIIlIl[7] = 89 ^ 15 ^ 193 ^ 144;
      llIIIlIl[8] = 93 + 55 - 70 + 54 ^ 36 + 76 - 30 + 58;
      llIIIlIl[9] = 78 + 35 - 64 + 120 ^ 62 + 7 - 36 + 127;
      llIIIlIl[10] = 87 + 83 - 167 + 125 ^ 45 + 20 - -28 + 45;
      llIIIlIl[11] = 173 + 100 - 123 + 28 ^ 176 + 59 - 221 + 171;
      llIIIlIl[12] = 13 + 8 - -8 + 156 ^ 58 + 121 - 94 + 96;
      llIIIlIl[13] = 98 ^ 119 ^ 40 ^ 48;
      llIIIlIl[14] = 200 ^ 198;
      llIIIlIl[15] = 36 ^ 95 ^ 212 ^ 160;
      llIIIlIl[16] = 4 ^ 20;
      llIIIlIl[17] = 0 + 130 - 115 + 170 ^ 42 + 114 - 37 + 49;
      llIIIlIl[18] = 120 ^ 106;
      llIIIlIl[19] = 158 ^ 181;
      llIIIlIl[20] = 85 ^ 120;
      llIIIlIl[21] = 152 ^ 139;
      llIIIlIl[22] = 156 + 136 - 243 + 126 ^ 12 + 160 - 110 + 125;
      llIIIlIl[23] = 188 ^ 169;
      llIIIlIl[24] = 49 + 75 - 120 + 163 ^ 66 + 82 - 117 + 146;
      llIIIlIl[25] = 164 ^ 179;
      llIIIlIl[26] = 33 ^ 57;
      llIIIlIl[27] = 219 ^ 156 ^ 255 ^ 161;
      llIIIlIl[28] = 18 ^ 99 ^ 193 ^ 170;
      llIIIlIl[29] = 63 + 104 - 77 + 50 ^ 32 + 41 - 58 + 136;
      llIIIlIl[30] = 86 ^ 74;
      llIIIlIl[31] = 68 ^ 20 ^ 92 ^ 17;
      llIIIlIl[32] = 219 ^ 176 ^ 203 ^ 190;
      llIIIlIl[33] = 141 ^ 146;
      llIIIlIl[34] = 5 ^ 66 ^ 213 ^ 178;
      llIIIlIl[35] = 1 ^ 108 ^ 86 ^ 26;
      llIIIlIl[36] = 222 ^ 154 ^ 41 ^ 79;
      llIIIlIl[37] = 127 ^ 58 ^ 121 ^ 31;
      llIIIlIl[38] = 86 ^ 114;
      llIIIlIl[39] = 161 ^ 194 ^ 204 ^ 138;
      llIIIlIl[40] = 176 ^ 186 ^ 237 ^ 193;
      llIIIlIl[41] = 171 ^ 140;
      llIIIlIl[42] = 39 ^ 15;
      llIIIlIl[43] = 57 ^ 16;
      llIIIlIl[44] = 73 ^ 99;
      llIIIlIl[45] = 180 ^ 152;
      llIIIlIl[46] = 96 ^ 78;
      llIIIlIl[47] = 104 ^ 54 ^ 107 ^ 26;
      llIIIlIl[48] = -(-49 & 24703) & -17 & 28670;
      llIIIlIl[49] = -8202 & 8701;
      llIIIlIl[50] = -(-2066 & 22591) & -65 & 30589;
      llIIIlIl[51] = 87 + 172 - 103 + 20 ^ 29 + 74 - -18 + 7;
      llIIIlIl[52] = 182 ^ 135;
      llIIIlIl[53] = 220 ^ 177 ^ 252 ^ 163;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final int ϛⰄ() {
      return this.ⲡ;
   }

   @JvmName(
      name = "u"
   )
   public final void u(@NotNull String var1) {
      this.Ꜥ = var1;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"},
      d2 = {"La/Ә$ĂƂ;", "ⲋ", "ĂƂ", "u", "ᴃᎲ", "〥ҳⱆ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ĂƂ {
      private static void lIIIllIIII() {
         lIIIIIIIl = new int[7];
         lIIIIIIIl[0] = 183 ^ 178;
         lIIIIIIIl[1] = (52 ^ 78 ^ 54 ^ 83) & (60 + 94 - 60 + 62 ^ 38 + 98 - 47 + 42 ^ -" ".length());
         lIIIIIIIl[2] = " ".length();
         lIIIIIIIl[3] = "  ".length();
         lIIIIIIIl[4] = "   ".length();
         lIIIIIIIl[5] = 158 + 163 - 307 + 176 ^ 150 + 79 - 128 + 85;
         lIIIIIIIl[6] = 185 ^ 177;
      }

      private static void lIIIlIlIlI() {
         llllllll = new String[lIIIIIIIl[0]];
         llllllll[lIIIIIIIl[1]] = lIIIlIIllI("LD8oJg==", "bpfcF");
         llllllll[lIIIIIIIl[2]] = lIIIlIIllI("ICIeAS0v", "aaJHb");
         llllllll[lIIIIIIIl[3]] = lIIIlIIllI("BAAlFD0FESwd", "LEiPb");
         llllllll[lIIIIIIIl[4]] = lIIIlIIllI("ITYcHxE0NhwXECQ=", "vyNSU");
         llllllll[lIIIIIIIl[5]] = lIIIlIlIII("5/z4rgn0sWE=", "eWduk");
      }

      private ĂƂ() {
      }

      private static String lIIIlIlIII(String llIllIIIIIlIIll, String llIllIIIIIlIIlI) {
         try {
            SecretKeySpec llIllIIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIl[6]), "DES");
            long llIllIIIIIlIIII = Cipher.getInstance("DES");
            llIllIIIIIlIIII.init(lIIIIIIIl[3], llIllIIIIIllIII);
            return new String(llIllIIIIIlIIII.doFinal(Base64.getDecoder().decode(llIllIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static String lIIIlIIllI(String llIllIIIIIIIIII, String llIllIIIIIIIlII) {
         llIllIIIIIIIIII = new String(Base64.getDecoder().decode(llIllIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         char llIlIlllllllllI = new StringBuilder();
         double llIlIllllllllIl = llIllIIIIIIIlII.toCharArray();
         byte llIlIllllllllII = lIIIIIIIl[1];
         char llIlIlllllllIll = llIllIIIIIIIIII.toCharArray();
         short llIlIlllllllIlI = llIlIlllllllIll.length;
         int llIlIlllllllIIl = lIIIIIIIl[1];

         do {
            if (!lIIIllIIIl(llIlIlllllllIIl, llIlIlllllllIlI)) {
               return String.valueOf(llIlIlllllllllI);
            }

            char llIllIIIIIIIllI = llIlIlllllllIll[llIlIlllllllIIl];
            llIlIlllllllllI.append((char)(llIllIIIIIIIllI ^ llIlIllllllllIl[llIlIllllllllII % llIlIllllllllIl.length]));
            "".length();
            ++llIlIllllllllII;
            ++llIlIlllllllIIl;
            "".length();
         } while("  ".length() != 0);

         return null;
      }

      static {
         lIIIllIIII();
         lIIIlIlIlI();
         Ә.ĂƂ[] var10001 = new Ә.ĂƂ[lIIIIIIIl[0]];
         var10001[lIIIIIIIl[1]] = ⲋ = new Ә.ĂƂ(llllllll[lIIIIIIIl[1]], lIIIIIIIl[1]);
         var10001[lIIIIIIIl[2]] = ĂƂ = new Ә.ĂƂ(llllllll[lIIIIIIIl[2]], lIIIIIIIl[2]);
         var10001[lIIIIIIIl[3]] = u = new Ә.ĂƂ(llllllll[lIIIIIIIl[3]], lIIIIIIIl[3]);
         var10001[lIIIIIIIl[4]] = ᴃᎲ = new Ә.ĂƂ(llllllll[lIIIIIIIl[4]], lIIIIIIIl[4]);
         var10001[lIIIIIIIl[5]] = 〥ҳⱆ = new Ә.ĂƂ(llllllll[lIIIIIIIl[5]], lIIIIIIIl[5]);
      }

      private static boolean lIIIllIIIl(int var0, int var1) {
         return var0 < var1;
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"},
      d2 = {"La/Ә$ⲋ;", "ⲋ", "ĂƂ", "u", "ᴃᎲ", "〥ҳⱆ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private ⲋ() {
      }

      private static String lIlll(String lllllllIIllIIlI, String lllllllIIllIIIl) {
         try {
            short lllllllIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Exception lllllllIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllIIlIllIl.init(lllI[3], lllllllIIlIlllI);
            return new String(lllllllIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void llIlI() {
         I = new String[lllI[0]];
         I[lllI[1]] = lIlll("A4SwM27RQ6w=", "PwZMg");
         I[lllI[2]] = llIII("JuDW2NpWf7a7c51ODFY/Ew==", "KGaGQ");
         I[lllI[3]] = lIlll("S775I3OrPd4=", "MptXo");
         I[lllI[4]] = llIIl("AhwTOxYPHR46FhMfBDs=", "AIAiS");
         I[lllI[5]] = llIIl("Oi8nGzw0", "yztOs");
      }

      private static void lllll() {
         lllI = new int[7];
         lllI[0] = 100 ^ 97;
         lllI[1] = (42 ^ 121) & ~(211 ^ 128);
         lllI[2] = " ".length();
         lllI[3] = "  ".length();
         lllI[4] = "   ".length();
         lllI[5] = 169 ^ 173;
         lllI[6] = 113 ^ 121;
      }

      private static boolean lIIIIl(int var0, int var1) {
         return var0 < var1;
      }

      private static String llIIl(String lllllllIlIIIIlI, String lllllllIlIIIIIl) {
         lllllllIlIIIIlI = new String(Base64.getDecoder().decode(lllllllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         float lllllllIlIIIIII = new StringBuilder();
         byte lllllllIIllllll = lllllllIlIIIIIl.toCharArray();
         int lllllllIlIIIIll = lllI[1];
         boolean lllllllIIllllIl = lllllllIlIIIIlI.toCharArray();
         boolean lllllllIIllllII = lllllllIIllllIl.length;
         int lllllllIIlllIll = lllI[1];

         do {
            if (!lIIIIl(lllllllIIlllIll, lllllllIIllllII)) {
               return String.valueOf(lllllllIlIIIIII);
            }

            float lllllllIIlllIlI = lllllllIIllllIl[lllllllIIlllIll];
            lllllllIlIIIIII.append((char)(lllllllIIlllIlI ^ lllllllIIllllll[lllllllIlIIIIll % lllllllIIllllll.length]));
            "".length();
            ++lllllllIlIIIIll;
            ++lllllllIIlllIll;
            "".length();
         } while(-(158 ^ 155) < 0);

         return null;
      }

      static {
         lllll();
         llIlI();
         Ә.ⲋ[] var10001 = new Ә.ⲋ[lllI[0]];
         var10001[lllI[1]] = ⲋ = new Ә.ⲋ(I[lllI[1]], lllI[1]);
         var10001[lllI[2]] = ĂƂ = new Ә.ⲋ(I[lllI[2]], lllI[2]);
         var10001[lllI[3]] = u = new Ә.ⲋ(I[lllI[3]], lllI[3]);
         var10001[lllI[4]] = ᴃᎲ = new Ә.ⲋ(I[lllI[4]], lllI[4]);
         var10001[lllI[5]] = 〥ҳⱆ = new Ә.ⲋ(I[lllI[5]], lllI[5]);
      }

      private static String llIII(String lllllllIIlIIlIl, String lllllllIIlIIlII) {
         try {
            byte lllllllIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllIIlIIlII.getBytes(StandardCharsets.UTF_8)), lllI[6]), "DES");
            long lllllllIIlIIIII = Cipher.getInstance("DES");
            lllllllIIlIIIII.init(lllI[3], lllllllIIlIIIIl);
            return new String(lllllllIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }
   }
}
