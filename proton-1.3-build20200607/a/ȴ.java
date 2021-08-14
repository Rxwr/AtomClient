package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020-:\u0002\b\u0006B\u0007¢\u0006\u0004\b,\u0010'J\u0015\u0010\b\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001e¢\u0006\u0004\b\b\u0010 J/\u0010\b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b\b\u0010%J\u000f\u0010&\u001a\u00020\u001fH\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020(H\u0007¢\u0006\u0004\b\u0006\u0010)J\u0017\u0010\b\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020(H\u0007¢\u0006\u0004\b\b\u0010)J\u0017\u0010\b\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020*H\u0007¢\u0006\u0004\b\b\u0010+J\r\u0010\u0002\u001a\u00020\u001f¢\u0006\u0004\b\u0002\u0010'R&\u0010\b\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR0\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0005\"\u0004\b\b\u0010\u0007¨\u0006\u0086\u008e\u0002R\u001a\u0010\f\u001a\u00020\r8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0096\u0004R\"\u0010\n\u001a\u00020\u00108G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\b\u0010\u0011¨\u0006\u0086\u0084\u0002R&\u0010\u0015\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\b\u0010\u0017¨\u0006\u0086\u000eR&\u0010\u0013\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b\u0006\u0010\u0017¨\u0006\u0086\u000eR\"\u0010\u0004\u001a\u00020\u00188G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0006\u0010\u0019¨\u0006\u0086\u0084\u0002R(\u0010\u0002\u001a\u0004\u0018\u00010\u001a8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\n\u0010\u001c\"\u0004\b\b\u0010\u001d¨\u0006\u0086\u000e"},
   d2 = {"La/ȴ;", "", "ς", "Z", "ϛⰄ", "()Z", "ĂƂ", "(Z)V", "ⲋ", "p0", "ᴃᎲ", "La/ⅹ;", "u", "", "ƶ", "()Ljava/lang/String;", "La/ȴ$ⲋ;", "()La/ȴ$ⲋ;", "", "Ἒⅾ", "F", "〥ҳⱆ", "()F", "(F)V", "", "()D", "La/ȴ$ĂƂ;", "La/ȴ$ĂƂ;", "()La/ȴ$ĂƂ;", "(La/ȴ$ĂƂ;)V", "Lnet/minecraft/util/math/Vec3d;", "", "(Lnet/minecraft/util/math/Vec3d;)V", "p1", "p2", "Lnet/minecraft/entity/player/EntityPlayer;", "p3", "(DDDLnet/minecraft/entity/player/EntityPlayer;)La/ȴ$ĂƂ;", "Đ", "()V", "La/ᶐ;", "(La/ᶐ;)V", "La/Ꮐ꯴;", "(La/Ꮐ꯴;)V", "<init>", "La/ⳅ;"}
)
public final class ȴ extends ⳅ {
   private static boolean llIIIIlIIl(Object var0, Object var1) {
      return var0 != var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ȴ.ĂƂ ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(float var1) {
      this.Ἒⅾ = var1;
   }

   private static String lIlllllIIl(String llIIlIlIIlIlllI, String llIIlIlIIlIllIl) {
      try {
         String llIIlIlIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), lIllIlllI[8]), "DES");
         Cipher llIIlIlIIllIIII = Cipher.getInstance("DES");
         llIIlIlIIllIIII.init(lIllIlllI[3], llIIlIlIIlIlIlI);
         return new String(llIIlIlIIllIIII.doFinal(Base64.getDecoder().decode(llIIlIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @ȵ(
      ĂƂ = Ѿ.POST,
      ⲋ = 100
   )
   public final void ĂƂ(@NotNull ᶐ var1) {
      if (llIIIIlIII(this.〥ҳⱆ) && !llIIIIlIIl(this.ⲋ(), ȴ.ⲋ.ⲋ)) {
         this.ɡ().field_71439_g.field_70125_A = this.Ἒⅾ;
         this.ɡ().field_71439_g.field_70177_z = this.ϛⰄ;
      }
   }

   public ȴ() {
      super(lIllIlIIl[lIllIlllI[9]], lIllIlIIl[lIllIlllI[10]], ı５.ⲋ, lIllIlllI[1], (boolean)lIllIlllI[1], (boolean)lIllIlllI[1], lIllIlllI[11], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIllIlIIl[lIllIlllI[12]], ȴ.ⲋ.ⲋ);
      this.u = this.ⲋ(lIllIlIIl[lIllIlllI[13]], 0.01D).u((Object)0.0D).ᴃᎲ((Object)1.0D);
      this.ᴃᎲ = this.ⲋ(lIllIlIIl[lIllIlllI[14]], Boolean.valueOf((boolean)lIllIlllI[1]));
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.u.ⲋ(this, ⲋ[lIllIlllI[2]])).doubleValue();
   }

   private static boolean llIIIIlIlI(Object var0) {
      return var0 == null;
   }

   private static String lIlllllIlI(String llIIlIlIIIIIlll, String llIIlIlIIIIIllI) {
      try {
         SecretKeySpec llIIlIlIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIlIlIIIIlIll = Cipher.getInstance("Blowfish");
         llIIlIlIIIIlIll.init(lIllIlllI[3], llIIlIlIIIIllII);
         return new String(llIIlIlIIIIlIll.doFinal(Base64.getDecoder().decode(llIIlIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean llIIIIlIII(Object var0) {
      return var0 != null;
   }

   private static void lIlllllllI() {
      lIllIlIIl = new String[lIllIlllI[15]];
      lIllIlIIl[lIllIlllI[1]] = lIlllllIII("KiMTFA==", "GLwqU");
      lIllIlIIl[lIllIlllI[2]] = lIlllllIIl("UtiNnE7tbhkPrMTKDWr7yE/tvvmorM2DgRJt3u98PTzylqjQwgXj+gcKoWNv33/90aXx6OcZRm0xi3MYjAv9xg==", "KuhbU");
      lIllIlIIl[lIllIlllI[3]] = lIlllllIlI("3rWUpmp+95NSYOroyFeJjg==", "yTHZy");
      lIllIlIIl[lIllIlllI[0]] = lIlllllIII("NTcVMyQ8NicAJiY9E0lsFg==", "RRaaE");
      lIllIlIIl[lIllIlllI[4]] = lIlllllIII("FRAXGwo=", "quunm");
      lIllIlIIl[lIllIlllI[5]] = lIlllllIlI("H6OOhWdvkgnrdhy4Xi45/w==", "kuWsi");
      lIllIlIIl[lIllIlllI[6]] = lIlllllIIl("Z77tUGyYa9hzoTJSUMrThA==", "Czwxf");
      lIllIlIIl[lIllIlllI[7]] = lIlllllIIl("rhfcXqC1Gnk=", "JIjjp");
      lIllIlIIl[lIllIlllI[8]] = lIlllllIlI("Zj2PE20GZqU=", "boJqF");
      lIllIlIIl[lIllIlllI[9]] = lIlllllIII("MyAFIzcG", "rIhAX");
      lIllIlIIl[lIllIlllI[10]] = lIlllllIIl("bCHfJKRgDDyd7cDbiAU2lzjE5RXSqf2wwZ/ERwJmTGiaBuAM8vU8vQ==", "CxHco");
      lIllIlIIl[lIllIlllI[12]] = lIlllllIIl("SDjq18hZIws=", "qCaJl");
      lIllIlIIl[lIllIlllI[13]] = lIlllllIII("JhkFMRoZWC00FgAXGQ==", "txkUu");
      lIllIlIIl[lIllIlllI[14]] = lIlllllIIl("3qLGywe+seU=", "SIOCb");
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ȴ.ⲋ ⲋ() {
      return (ȴ.ⲋ)this.ĂƂ.ⲋ(this, ⲋ[lIllIlllI[1]]);
   }

   private static void lIllllllll() {
      lIllIlllI = new int[16];
      lIllIlllI[0] = "   ".length();
      lIllIlllI[1] = (108 ^ 32) & ~(140 ^ 192);
      lIllIlllI[2] = " ".length();
      lIllIlllI[3] = "  ".length();
      lIllIlllI[4] = 26 + 81 - 63 + 150 ^ 139 + 44 - 172 + 187;
      lIllIlllI[5] = 34 ^ 39;
      lIllIlllI[6] = 0 ^ 40 ^ 100 ^ 74;
      lIllIlllI[7] = 187 ^ 188;
      lIllIlllI[8] = 72 ^ 64;
      lIllIlllI[9] = 2 + 34 - 1 + 124 ^ 20 + 101 - 86 + 115;
      lIllIlllI[10] = 20 ^ 30;
      lIllIlllI[11] = 168 ^ 135 ^ 109 ^ 122;
      lIllIlllI[12] = 174 + 124 - 212 + 104 ^ 28 + 3 - -120 + 30;
      lIllIlllI[13] = 66 ^ 122 ^ 50 ^ 6;
      lIllIlllI[14] = 44 ^ 33;
      lIllIlllI[15] = 36 ^ 42;
   }

   static {
      lIllllllll();
      lIlllllllI();
      KProperty[] var10000 = new KProperty[lIllIlllI[0]];
      var10000[lIllIlllI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ȴ.class), lIllIlIIl[lIllIlllI[1]], lIllIlIIl[lIllIlllI[2]]));
      var10000[lIllIlllI[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ȴ.class), lIllIlIIl[lIllIlllI[3]], lIllIlIIl[lIllIlllI[0]]));
      var10000[lIllIlllI[3]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ȴ.class), lIllIlIIl[lIllIlllI[4]], lIllIlIIl[lIllIlllI[5]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.ᴃᎲ.ⲋ(this, ⲋ[lIllIlllI[3]], var1);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(float var1) {
      this.ϛⰄ = var1;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final float 〥ҳⱆ() {
      return this.Ἒⅾ;
   }

   private static boolean llIIIIlIll(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable ȴ.ĂƂ var1) {
      this.〥ҳⱆ = var1;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final float Ἒⅾ() {
      return this.ϛⰄ;
   }

   private final ȴ.ĂƂ ⲋ(double var1, double var3, double var5, EntityPlayer var7) {
      double var8 = var7.field_70165_t - var1;
      double var10 = var7.field_70163_u - var3;
      double var12 = var7.field_70161_v - var5;
      double var16 = var8 * var8 + var10 * var10 + var12 * var12;
      int var18 = lIllIlllI[1];
      double var14 = Math.sqrt(var16);
      var8 /= var14;
      var10 /= var14;
      var12 /= var14;
      var18 = lIllIlllI[1];
      var16 = Math.asin(var10);
      int var20 = lIllIlllI[1];
      double var21 = Math.atan2(var12, var8);
      var16 = var16 * 180.0D / 3.141592653589793D;
      var21 = var21 * 180.0D / 3.141592653589793D;
      var21 += 90.0D;
      return new ȴ.ĂƂ((float)var21, (float)var16);
   }

   private static boolean llIIIIllII(Object var0, Object var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final boolean ϛⰄ() {
      return this.ς;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      this.ς = var1;
   }

   private static boolean llIIIIllIl(int var0, int var1) {
      return var0 < var1;
   }

   @ȵ(
      ĂƂ = Ѿ.PRE,
      ⲋ = 100
   )
   public final void ⲋ(@NotNull ᶐ var1) {
      if (llIIIIlIII(llIIlIlIlIIlllI.〥ҳⱆ) && !llIIIIlIIl(llIIlIlIlIIlllI.ⲋ(), ȴ.ⲋ.ⲋ)) {
         llIIlIlIlIIlllI.Ἒⅾ = llIIlIlIlIIlllI.ɡ().field_71439_g.field_70125_A;
         llIIlIlIlIIlllI.ϛⰄ = llIIlIlIlIIlllI.ɡ().field_71439_g.field_70177_z;
         EntityPlayerSP var10000 = llIIlIlIlIIlllI.ɡ().field_71439_g;
         ȴ.ĂƂ var10001 = llIIlIlIlIIlllI.〥ҳⱆ;
         if (llIIIIlIlI(var10001)) {
            Intrinsics.throwNpe();
         }

         var10000.field_70125_A = var10001.ĂƂ() + Random.Default.nextFloat() * (float)llIIlIlIlIIlllI.ĂƂ();
         var10000 = llIIlIlIlIIlllI.ɡ().field_71439_g;
         var10001 = llIIlIlIlIIlllI.〥ҳⱆ;
         if (llIIIIlIlI(var10001)) {
            Intrinsics.throwNpe();
         }

         var10000.field_70177_z = var10001.ⲋ() + Random.Default.nextFloat() * (float)llIIlIlIlIIlllI.ĂƂ();
      }
   }

   @ȵ
   public final void ⲋ(@NotNull Ꮐ꯴ llIIlIlIlIIlIII) {
      if (llIIIIlIll(llIIlIlIlIIlIII.ᴃᎲ() instanceof CPacketPlayer) && llIIIIlIII(llIIlIlIlIIlIIl.〥ҳⱆ) && llIIIIllII(llIIlIlIlIIlIIl.ⲋ(), ȴ.ⲋ.ĂƂ)) {
         CPacketPlayer var10000 = (CPacketPlayer)llIIlIlIlIIlIII.ᴃᎲ();
         ȴ.ĂƂ var10001 = llIIlIlIlIIlIIl.〥ҳⱆ;
         if (llIIIIlIlI(var10001)) {
            Intrinsics.throwNpe();
         }

         var10000.field_149476_e = var10001.ⲋ() + Random.Default.nextFloat() * (float)llIIlIlIlIIlIIl.ĂƂ();
         var10000 = (CPacketPlayer)llIIlIlIlIIlIII.ᴃᎲ();
         var10001 = llIIlIlIlIIlIIl.〥ҳⱆ;
         if (llIIIIlIlI(var10001)) {
            Intrinsics.throwNpe();
         }

         var10000.field_149473_f = var10001.ĂƂ() + Random.Default.nextFloat() * (float)llIIlIlIlIIlIIl.ĂƂ();
         ((CPacketPlayer)llIIlIlIlIIlIII.ᴃᎲ()).field_149481_i = (boolean)lIllIlllI[2];
      }

   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      StringBuilder var10000 = (new StringBuilder()).append(llIIlIlIIllllII.ⲋ().toString());
      String var10001;
      if (llIIIIlIII(llIIlIlIIllllII.〥ҳⱆ) && llIIIIlIll(llIIlIlIIllllII.u())) {
         StringCompanionObject var1 = StringCompanionObject.INSTANCE;
         String llIIlIlIIlllIlI = lIllIlIIl[lIllIlllI[6]];
         Object[] var8 = new Object[lIllIlllI[3]];
         int var10003 = lIllIlllI[1];
         ȴ.ĂƂ var10004 = llIIlIlIIllllII.〥ҳⱆ;
         if (llIIIIlIlI(var10004)) {
            Intrinsics.throwNpe();
         }

         var8[var10003] = var10004.ⲋ();
         var10003 = lIllIlllI[2];
         var10004 = llIIlIlIIllllII.〥ҳⱆ;
         if (llIIIIlIlI(var10004)) {
            Intrinsics.throwNpe();
         }

         var8[var10003] = var10004.ĂƂ();
         short llIIlIlIIlllIIl = var8;
         String llIIlIlIIllIlll = var10000;
         double llIIlIlIIlllIII = lIllIlllI[1];
         String var7 = String.format(llIIlIlIIlllIlI, Arrays.copyOf(llIIlIlIIlllIIl, llIIlIlIIlllIIl.length));
         Intrinsics.checkExpressionValueIsNotNull(var7, lIllIlIIl[lIllIlllI[7]]);
         float llIIlIlIIllIllI = var7;
         var10000 = llIIlIlIIllIlll;
         var10001 = llIIlIlIIllIllI;
         "".length();
         if ((130 ^ 134) == 0) {
            return null;
         }
      } else {
         var10001 = lIllIlIIl[lIllIlllI[8]];
      }

      return String.valueOf(var10000.append(var10001));
   }

   public final void ς() {
      this.〥ҳⱆ = (ȴ.ĂƂ)null;
   }

   public final void ⲋ(@NotNull Vec3d var1) {
      llIIlIlIlIIIlIl.〥ҳⱆ = llIIlIlIlIIIlIl.ⲋ(var1.field_72450_a, var1.field_72448_b, var1.field_72449_c, (EntityPlayer)llIIlIlIlIIIlIl.ɡ().field_71439_g);
      llIIlIlIlIIIlIl.ς = (boolean)lIllIlllI[2];
      if (llIIIIllII(llIIlIlIlIIIlIl.ⲋ(), ȴ.ⲋ.ĂƂ)) {
         NetHandlerPlayClient var10000 = llIIlIlIlIIIlIl.ɡ().field_71439_g.field_71174_a;
         Rotation var10001 = new Rotation;
         ȴ.ĂƂ var10003 = llIIlIlIlIIIlIl.〥ҳⱆ;
         if (llIIIIlIlI(var10003)) {
            Intrinsics.throwNpe();
         }

         float var2 = var10003.ⲋ();
         ȴ.ĂƂ var10004 = llIIlIlIlIIIlIl.〥ҳⱆ;
         if (llIIIIlIlI(var10004)) {
            Intrinsics.throwNpe();
         }

         var10001.<init>(var2, var10004.ĂƂ(), llIIlIlIlIIIlIl.ɡ().field_71439_g.field_70122_E);
         var10000.func_147297_a((Packet)var10001);
      }

   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return (Boolean)this.ᴃᎲ.ⲋ(this, ⲋ[lIllIlllI[3]]);
   }

   protected void Đ() {
      super.Đ();
      this.ς = (boolean)lIllIlllI[2];
   }

   private static String lIlllllIII(String llIIlIlIIIllllI, String llIIlIlIIIllIII) {
      llIIlIlIIIllllI = new String(Base64.getDecoder().decode(llIIlIlIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String llIIlIlIIIlIlll = new StringBuilder();
      boolean llIIlIlIIIlIllI = llIIlIlIIIllIII.toCharArray();
      int llIIlIlIIIllIlI = lIllIlllI[1];
      Exception llIIlIlIIIlIlII = llIIlIlIIIllllI.toCharArray();
      char llIIlIlIIIlIIll = llIIlIlIIIlIlII.length;
      int llIIlIlIIIlIIlI = lIllIlllI[1];

      do {
         if (!llIIIIllIl(llIIlIlIIIlIIlI, llIIlIlIIIlIIll)) {
            return String.valueOf(llIIlIlIIIlIlll);
         }

         char llIIlIlIIIlIIIl = llIIlIlIIIlIlII[llIIlIlIIIlIIlI];
         llIIlIlIIIlIlll.append((char)(llIIlIlIIIlIIIl ^ llIIlIlIIIlIllI[llIIlIlIIIllIlI % llIIlIlIIIlIllI.length]));
         "".length();
         ++llIIlIlIIIllIlI;
         ++llIIlIlIIIlIIlI;
         "".length();
      } while(null == null);

      return null;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ȴ$ⲋ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private static void lIIIlIlIll() {
         llllllII = new String[lIIIIIIlI[0]];
         llllllII[lIIIIIIlI[1]] = lIIIlIIlIl("WBvDiq/+dS4=", "ukKbM");
         llllllII[lIIIIIIlI[2]] = lIIIlIlIIl("oY3cTbjuymQ=", "nhzQJ");
      }

      static {
         lIIIlIllll();
         lIIIlIlIll();
         ȴ.ⲋ[] var10001 = new ȴ.ⲋ[lIIIIIIlI[0]];
         var10001[lIIIIIIlI[1]] = ⲋ = new ȴ.ⲋ(llllllII[lIIIIIIlI[1]], lIIIIIIlI[1]);
         var10001[lIIIIIIlI[2]] = ĂƂ = new ȴ.ⲋ(llllllII[lIIIIIIlI[2]], lIIIIIIlI[2]);
      }

      private static String lIIIlIIlIl(String llIllIIIIlIIIlI, String llIllIIIIIlllll) {
         try {
            SecretKeySpec llIllIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIIIlllll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlI[3]), "DES");
            Cipher llIllIIIIlIIlII = Cipher.getInstance("DES");
            llIllIIIIlIIlII.init(lIIIIIIlI[0], llIllIIIIlIIlIl);
            return new String(llIllIIIIlIIlII.doFinal(Base64.getDecoder().decode(llIllIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIIIlIllll() {
         lIIIIIIlI = new int[4];
         lIIIIIIlI[0] = "  ".length();
         lIIIIIIlI[1] = (86 + 63 - 54 + 122 ^ 10 + 67 - -3 + 113) & (112 ^ 118 ^ 120 ^ 102 ^ -" ".length());
         lIIIIIIlI[2] = " ".length();
         lIIIIIIlI[3] = 103 ^ 111;
      }

      private static String lIIIlIlIIl(String llIllIIIIlIllIl, String llIllIIIIlIllII) {
         try {
            double llIllIIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            float llIllIIIIlIlIlI = Cipher.getInstance("Blowfish");
            llIllIIIIlIlIlI.init(lIIIIIIlI[0], llIllIIIIlIlIll);
            return new String(llIllIIIIlIlIlI.doFinal(Base64.getDecoder().decode(llIllIIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private ⲋ() {
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0000\b\u0007\u0018\u00002\u00020\nB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0005\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0086\u0004R\u001d\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0003\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0086\u0004"},
      d2 = {"La/ȴ$ĂƂ;", "", "ĂƂ", "F", "()F", "ⲋ", "p0", "p1", "<init>", "(FF)V", ""}
   )
   public static final class ĂƂ {
      public ĂƂ(float var1, float var2) {
         this.ⲋ = var1;
         this.ĂƂ = var2;
      }

      @JvmName(
         name = "ĂƂ"
      )
      public final float ĂƂ() {
         return this.ĂƂ;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final float ⲋ() {
         return this.ⲋ;
      }
   }
}
