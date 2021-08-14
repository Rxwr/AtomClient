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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBow;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.math.BlockPos;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\rB\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR0\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007¨\u0006\u0086\u008e\u0002"},
   d2 = {"La/Ⱥ;", "", "p0", "ĂƂ", "La/ⅹ;", "ⲋ", "()Z", "(Z)V", "", "ʅ", "()V", "Ἠ", "<init>", "La/ⳅ;"}
)
public final class Ⱥ extends ⳅ {
   @JvmName(
      name = "ⲋ"
   )
   public final boolean ⲋ() {
      return (Boolean)this.ĂƂ.ⲋ(this, ⲋ[llIlIlll[1]]);
   }

   private static String lllIllIlI(String llIlllIIlIIIlll, String llIlllIIlIIIIIl) {
      llIlllIIlIIIlll = new String(Base64.getDecoder().decode(llIlllIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char llIlllIIlIIIIII = new StringBuilder();
      byte llIlllIIIllllll = llIlllIIlIIIIIl.toCharArray();
      float llIlllIIIlllllI = llIlIlll[1];
      int llIlllIIIllllIl = llIlllIIlIIIlll.toCharArray();
      short llIlllIIIllllII = llIlllIIIllllIl.length;
      int llIlllIIIlllIll = llIlIlll[1];

      do {
         if (!llllIIIIl(llIlllIIIlllIll, llIlllIIIllllII)) {
            return String.valueOf(llIlllIIlIIIIII);
         }

         char llIlllIIIlllIlI = llIlllIIIllllIl[llIlllIIIlllIll];
         llIlllIIlIIIIII.append((char)(llIlllIIIlllIlI ^ llIlllIIIllllll[llIlllIIIlllllI % llIlllIIIllllll.length]));
         "".length();
         ++llIlllIIIlllllI;
         ++llIlllIIIlllIll;
         "".length();
      } while(" ".length() != "   ".length());

      return null;
   }

   private static boolean lllIlllll(int var0) {
      return var0 != 0;
   }

   public void Ἠ() {
      llIlllIIlIlIIlI.ɡ().field_71467_ac = llIlIlll[2];
      if (lllIllllI(llIlllIIlIlIIlI.ɡ().field_71439_g.func_184614_ca().field_151002_e instanceof ItemBlock)) {
         llIlllIIlIlIIlI.ɡ().field_71467_ac = llIlIlll[1];
      }

      if (lllIlllll(llIlllIIlIlIIlI.ⲋ()) && lllIlllll(llIlllIIlIlIIlI.ɡ().field_71439_g.func_184614_ca().field_151002_e instanceof ItemBow) && llllIIIII(llIlllIIlIlIIlI.ɡ().field_71439_g.func_184612_cw(), llIlIlll[3])) {
         llIlllIIlIlIIlI.ɡ().field_71439_g.field_71174_a.func_147297_a((Packet)(new CPacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.field_177992_a, llIlllIIlIlIIlI.ɡ().field_71439_g.func_174811_aO())));
         llIlllIIlIlIIlI.ɡ().field_71439_g.field_71174_a.func_147297_a((Packet)(new CPacketPlayerTryUseItem(llIlllIIlIlIIlI.ɡ().field_71439_g.func_184600_cs())));
         llIlllIIlIlIIlI.ɡ().field_71439_g.func_184597_cx();
      }

   }

   protected void ʅ() {
      this.ɡ().field_71467_ac = llIlIlll[2];
   }

   private static void lllIlllII() {
      llIlIllI = new String[llIlIlll[6]];
      llIlIllI[llIlIlll[1]] = lllIllIIl("SIibth3yj+8=", "Aiynw");
      llIlIllI[llIlIlll[0]] = lllIllIlI("EDUtGA0AAyk7D195Aw==", "wPYZb");
      llIlIllI[llIlIlll[4]] = lllIllIlI("JSweBT8QKA==", "cMmqj");
      llIlIllI[llIlIlll[3]] = lllIllIIl("nyHHTQEyvBNbhZtJBMuRmB+cR+HQ8GOQKWNcUsQOhe8=", "KXhqT");
      llIlIllI[llIlIlll[2]] = lllIllIll("bP+empVK5kc=", "pQMFo");
   }

   static {
      lllIlllIl();
      lllIlllII();
      KProperty[] var10000 = new KProperty[llIlIlll[0]];
      var10000[llIlIlll[1]] = (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ⱥ.class), llIlIllI[llIlIlll[1]], llIlIllI[llIlIlll[0]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.ĂƂ.ⲋ(this, ⲋ[llIlIlll[1]], var1);
   }

   private static boolean llllIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static String lllIllIIl(String llIlllIIIIlllll, String llIlllIIIlIIIII) {
      try {
         int llIlllIIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIIlIIIII.getBytes(StandardCharsets.UTF_8)), llIlIlll[7]), "DES");
         byte llIlllIIIIlllII = Cipher.getInstance("DES");
         llIlllIIIIlllII.init(llIlIlll[4], llIlllIIIIlllIl);
         return new String(llIlllIIIIlllII.doFinal(Base64.getDecoder().decode(llIlllIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lllIllllI(int var0) {
      return var0 == 0;
   }

   private static String lllIllIll(String llIlllIIIlIlllI, String llIlllIIIlIllIl) {
      try {
         SecretKeySpec llIlllIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte llIlllIIIlIlIIl = Cipher.getInstance("Blowfish");
         llIlllIIIlIlIIl.init(llIlIlll[4], llIlllIIIllIIlI);
         return new String(llIlllIIIlIlIIl.doFinal(Base64.getDecoder().decode(llIlllIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lllIlllIl() {
      llIlIlll = new int[8];
      llIlIlll[0] = " ".length();
      llIlIlll[1] = (13 ^ 73) & ~(4 ^ 64);
      llIlIlll[2] = 27 ^ 31;
      llIlIlll[3] = "   ".length();
      llIlIlll[4] = "  ".length();
      llIlIlll[5] = 63 ^ 7;
      llIlIlll[6] = 135 + 144 - 129 + 11 ^ 163 + 155 - 289 + 135;
      llIlIlll[7] = 119 ^ 34 ^ 246 ^ 171;
   }

   private static boolean llllIIIII(int var0, int var1) {
      return var0 >= var1;
   }

   public Ⱥ() {
      super(llIlIllI[llIlIlll[4]], llIlIllI[llIlIlll[3]], ı５.ⲋ, llIlIlll[1], (boolean)llIlIlll[1], (boolean)llIlIlll[1], llIlIlll[5], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIlIllI[llIlIlll[2]], Boolean.valueOf((boolean)llIlIlll[0]));
   }
}
