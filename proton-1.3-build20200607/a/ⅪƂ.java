package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0016B\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0082\u0004R&\u0010\u0002\u001a\u0006*\u00020\u000b0\u000b8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u0006\u0010\f¨\u0006\u0082\u0084\u0002R\"\u0010\r\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/ⅪƂ;", "", "u", "La/ⅹ;", "ĂƂ", "()D", "ⲋ", "", "Lnet/minecraft/util/math/ChunkPos;", "〥ҳⱆ", "Ljava/util/List;", "Ljava/awt/Color;", "()Ljava/awt/Color;", "ᴃᎲ", "", "Đ", "()V", "La/ꝱᶁ;", "p0", "(La/ꝱᶁ;)V", "ἶṗ", "<init>", "La/ⳅ;"}
)
public final class ⅪƂ extends ⳅ {
   @JvmName(
      name = "u"
   )
   private final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[llllIIlIl[3]])).doubleValue();
   }

   private static String llllIlllIl(String lIllIlllIIlllII, String lIllIlllIIllIIl) {
      try {
         int lIllIlllIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlllIIllIIl.getBytes(StandardCharsets.UTF_8)), llllIIlIl[10]), "DES");
         Cipher lIllIlllIIllllI = Cipher.getInstance("DES");
         lIllIlllIIllllI.init(llllIIlIl[3], lIllIlllIIllIII);
         return new String(lIllIlllIIllllI.doFinal(Base64.getDecoder().decode(lIllIlllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   protected void Đ() {
      super.Đ();
      this.〥ҳⱆ.clear();
   }

   private static String llllIllllI(String lIllIlllIIIllIl, String lIllIlllIIIllII) {
      try {
         SecretKeySpec lIllIlllIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIllIlllIIlIIIl = Cipher.getInstance("Blowfish");
         lIllIlllIIlIIIl.init(llllIIlIl[3], lIllIlllIIlIIlI);
         return new String(lIllIlllIIlIIIl.doFinal(Base64.getDecoder().decode(lIllIlllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIIIIlIIIII();
      lllllIIllI();
      KProperty[] var10000 = new KProperty[llllIIlIl[0]];
      var10000[llllIIlIl[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⅪƂ.class), lllIIllII[llllIIlIl[1]], lllIIllII[llllIIlIl[2]]));
      var10000[llllIIlIl[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⅪƂ.class), lllIIllII[llllIIlIl[3]], lllIIllII[llllIIlIl[0]]));
      var10000[llllIIlIl[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ⅪƂ.class), lllIIllII[llllIIlIl[4]], lllIIllII[llllIIlIl[5]]));
      ⲋ = var10000;
   }

   private static boolean lIIIIlIIIll(int var0, int var1) {
      return var0 < var1;
   }

   private static String llllIlllII(String lIllIllIllllIlI, String lIllIllIllllllI) {
      lIllIllIllllIlI = new String(Base64.getDecoder().decode(lIllIllIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception lIllIllIllllIII = new StringBuilder();
      String lIllIllIlllIlll = lIllIllIllllllI.toCharArray();
      float lIllIllIlllIllI = llllIIlIl[1];
      byte lIllIllIlllIlIl = lIllIllIllllIlI.toCharArray();
      char lIllIllIlllIlII = lIllIllIlllIlIl.length;
      int lIllIllIlllIIll = llllIIlIl[1];

      do {
         if (!lIIIIlIIIll(lIllIllIlllIIll, lIllIllIlllIlII)) {
            return String.valueOf(lIllIllIllllIII);
         }

         long lIllIllIlllIIlI = lIllIllIlllIlIl[lIllIllIlllIIll];
         lIllIllIllllIII.append((char)(lIllIllIlllIIlI ^ lIllIllIlllIlll[lIllIllIlllIllI % lIllIllIlllIlll.length]));
         "".length();
         ++lIllIllIlllIllI;
         ++lIllIllIlllIIll;
         "".length();
      } while(null == null);

      return null;
   }

   private static boolean lIIIIlIIIIl(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   private final Color ⲋ() {
      return (Color)this.ĂƂ.ⲋ(this, ⲋ[llllIIlIl[1]]);
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[llllIIlIl[2]])).doubleValue();
   }

   private static void lIIIIlIIIII() {
      llllIIlIl = new int[14];
      llllIIlIl[0] = "   ".length();
      llllIIlIl[1] = (34 + 18 - -38 + 135 ^ 136 + 28 - 148 + 156) & (85 ^ 92 ^ 131 ^ 199 ^ -" ".length());
      llllIIlIl[2] = " ".length();
      llllIIlIl[3] = "  ".length();
      llllIIlIl[4] = 179 + 94 - 214 + 121 ^ 71 + 99 - 31 + 37;
      llllIIlIl[5] = 18 ^ 122 ^ 223 ^ 178;
      llllIIlIl[6] = 10 + 28 - 32 + 132 ^ 11 + 44 - -23 + 76;
      llllIIlIl[7] = 10 + 4 - -115 + 21 ^ 110 + 3 - 3 + 34;
      llllIIlIl[8] = 76 ^ 75;
      llllIIlIl[9] = 177 + 179 - 308 + 140 ^ 122 + 8 - 1 + 3;
      llllIIlIl[10] = 72 ^ 64;
      llllIIlIl[11] = 171 ^ 175 ^ 34 ^ 47;
      llllIIlIl[12] = 12 + 7 - -26 + 123 ^ 68 + 85 - 110 + 119;
      llllIIlIl[13] = 118 ^ 48 ^ 93 ^ 16;
   }

   @ȵ
   public final void ⲋ(@NotNull final ꝱᶁ var1) {
      if (lIIIIlIIIIl(var1.ᴃᎲ() instanceof SPacketChunkData) && lIIIIlIIIlI(((SPacketChunkData)var1.ᴃᎲ()).func_149274_i())) {
         this.ɡ().func_152344_a((Runnable)(new Runnable() {
            public final void run() {
               ⅪƂ.this.〥ҳⱆ.add(new ChunkPos(((SPacketChunkData)var1.ᴃᎲ()).func_149273_e(), ((SPacketChunkData)var1.ᴃᎲ()).func_149271_f()));
               "".length();
            }
         }));
         "".length();
      }

   }

   public ⅪƂ() {
      super(lllIIllII[llllIIlIl[7]], lllIIllII[llllIIlIl[8]], ı５.〥ҳⱆ, llllIIlIl[1], (boolean)llllIIlIl[1], (boolean)llllIIlIl[1], llllIIlIl[9], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lllIIllII[llllIIlIl[10]], Color.red);
      this.u = this.ⲋ(lllIIllII[llllIIlIl[11]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.ᴃᎲ = this.ⲋ(lllIIllII[llllIIlIl[12]], 0.0D).u((Object)0.0D).ᴃᎲ((Object)255.0D);
      int var1 = llllIIlIl[1];
      List var3 = (List)(new ArrayList());
      this.〥ҳⱆ = var3;
   }

   public void ἶṗ() {
      super.ἶṗ();
      if (!lIIIIlIIIIl(lIllIlllIlllIII.〥ҳⱆ.isEmpty())) {
         int lIllIlllIllIlll = ᾣŦ.ⲋ;
         String lIllIlllIllIllI = llllIIlIl[1];
         byte lIllIlllIllIlIl = llllIIlIl[1];
         Exception lIllIlllIllIlII = lIllIlllIllIlll;
         String lIllIlllIllIIll = llllIIlIl[1];
         lIllIlllIllIlll.ⲋ(llllIIlIl[2]);
         double lIllIlllIllIIlI = ſ.ĂƂ(ſ.ⲋ(lIllIlllIlllIII.ⲋ(), lIllIlllIlllIII.ĂƂ()));
         String lIllIlllIllIIIl = (Iterable)lIllIlllIlllIII.〥ҳⱆ;
         Exception lIllIlllIllIIII = llllIIlIl[1];
         Iterator lIllIlllIlIllll = lIllIlllIllIIIl.iterator();

         do {
            if (!lIIIIlIIIIl(lIllIlllIlIllll.hasNext())) {
               lIllIlllIllIlII.ĂƂ();
               return;
            }

            int lIllIlllIlIlllI = lIllIlllIlIllll.next();
            int lIllIlllIlIllIl = (ChunkPos)lIllIlllIlIlllI;
            char lIllIlllIlIllII = llllIIlIl[1];
            double lIllIlllIlIlIll = new Vec3d((double)(lIllIlllIlIllIl.field_77276_a * llllIIlIl[6]), lIllIlllIlllIII.u(), (double)(lIllIlllIlIllIl.field_77275_b * llllIIlIl[6]));
            byte lIllIlllIlIlIlI = lIllIlllIlIlIll.func_72441_c(16.0D, 0.0D, 0.0D);
            double lIllIlllIlIlIIl = lIllIlllIlIlIlI.func_72441_c(0.0D, 0.0D, 16.0D);
            long lIllIlllIlIlIII = lIllIlllIlIlIll.func_72441_c(0.0D, 0.0D, 16.0D);
            lIllIlllIllIlII.ⲋ(lIllIlllIlIlIll, lIllIlllIlIlIlI, lIllIlllIllIIlI);
            lIllIlllIllIlII.ⲋ(lIllIlllIlIlIlI, lIllIlllIlIlIIl, lIllIlllIllIIlI);
            lIllIlllIllIlII.ⲋ(lIllIlllIlIlIIl, lIllIlllIlIlIII, lIllIlllIllIIlI);
            lIllIlllIllIlII.ⲋ(lIllIlllIlIlIII, lIllIlllIlIlIll, lIllIlllIllIIlI);
            "".length();
         } while(((107 ^ 122 ^ 122 ^ 83) & (119 ^ 84 ^ 8 ^ 19 ^ -" ".length())) == ((110 + 14 - -20 + 19 ^ 37 + 76 - -38 + 27) & (46 + 125 - 166 + 140 ^ 93 + 78 - 92 + 49 ^ -" ".length())));

      }
   }

   private static boolean lIIIIlIIIlI(int var0) {
      return var0 == 0;
   }

   private static void lllllIIllI() {
      lllIIllII = new String[llllIIlIl[13]];
      lllIIllII[llllIIlIl[1]] = llllIlllII("FicWJh4=", "uHzIl");
      lllIIllII[llllIIlIl[2]] = llllIlllIl("2ohgzF+yMfxZlJDWi79u4Xr8nQiVOMnFwVeB2r29M6Q=", "yCHGB");
      lllIIllII[llllIIlIl[3]] = llllIlllIl("YcnNlqqPrs0=", "ZxrJS");
      lllIIllII[llllIIlIl[0]] = llllIlllII("AC8nFB0XIjJ9WCM=", "gJSUq");
      lllIIllII[llllIIlIl[4]] = llllIllllI("bPUdoyAOhLo=", "CLzNM");
      lllIIllII[llllIIlIl[5]] = llllIllllI("wkVAxrjMB+++F0EYEemlng==", "VAWqW");
      lllIIllII[llllIIlIl[7]] = llllIllllI("trDCe4hZZlV188z6JkhUhw==", "fACDC");
      lllIIllII[llllIIlIl[8]] = llllIlllII("LBAMDBgNHgMQB0QXDhNUBxEeCh8XVw==", "dykdt");
      lllIIllII[llllIIlIl[10]] = llllIlllII("JBsDOxM=", "gtoTa");
      lllIIllII[llllIIlIl[11]] = llllIllllI("89T0wGJ6W+Y=", "GLYNo");
      lllIIllII[llllIIlIl[12]] = llllIlllII("DlQhPyUkHBo=", "WynYC");
   }
}
