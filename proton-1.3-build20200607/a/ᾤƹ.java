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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.network.play.server.SPacketExplosion;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\tR\"\u0010\u0004\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/ᾤƹ;", "", "ĂƂ", "La/ⅹ;", "ⲋ", "()Z", "La/ꝱᶁ;", "p0", "", "(La/ꝱᶁ;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class ᾤƹ extends ⳅ {
   @JvmName(
      name = "ⲋ"
   )
   private final boolean ⲋ() {
      return (Boolean)this.ĂƂ.ⲋ(this, ⲋ[llIIIIlI[1]]);
   }

   @ȵ
   public final void ⲋ(@NotNull ꝱᶁ var1) {
      if (llIlIIIIl(var1.ᴃᎲ() instanceof SPacketExplosion) && llIlIIIIl(this.ⲋ())) {
         var1.ĂƂ();
      }

   }

   static {
      llIlIIIII();
      llIIlIlII();
      KProperty[] var10000 = new KProperty[llIIIIlI[0]];
      var10000[llIIIIlI[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ᾤƹ.class), lIllllll[llIIIIlI[1]], lIllllll[llIIIIlI[0]]));
      ⲋ = var10000;
   }

   public ᾤƹ() {
      super(lIllllll[llIIIIlI[2]], lIllllll[llIIIIlI[3]], ı５.〥ҳⱆ, llIIIIlI[1], (boolean)llIIIIlI[1], (boolean)llIIIIlI[1], llIIIIlI[4], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIllllll[llIIIIlI[5]], Boolean.valueOf((boolean)llIIIIlI[0]));
   }

   private static boolean llIlIIIIl(int var0) {
      return var0 != 0;
   }

   private static String llIIlIIlI(String lllIIlIIlllllll, String lllIIlIIllllllI) {
      try {
         byte lllIIlIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIIllllllI.getBytes(StandardCharsets.UTF_8)), llIIIIlI[7]), "DES");
         Exception lllIIlIIlllllII = Cipher.getInstance("DES");
         lllIIlIIlllllII.init(llIIIIlI[2], lllIIlIIlllllIl);
         return new String(lllIIlIIlllllII.doFinal(Base64.getDecoder().decode(lllIIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIlIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static void llIIlIlII() {
      lIllllll = new String[llIIIIlI[6]];
      lIllllll[llIIIIlI[1]] = llIIlIIlI("545YKynH2Hopf+JuejgkIg==", "LtgyU");
      lIllllll[llIIIIlI[0]] = llIIlIIll("FC82DyADJi05MRwkMWJxKQ==", "sJBJX");
      lIllllll[llIIIIlI[2]] = llIIlIIlI("sahtTZ1cm31q4N48Gk/VhQ==", "ALfZy");
      lIllllll[llIIIIlI[3]] = llIIlIIlI("AB0R1VZLhQmc2ekgn8sqsXVg7T5FKbzpEXVgLAynw4LmiqQ21IvlWlaxFNQDHnXz", "AIknL");
      lIllllll[llIIIIlI[5]] = llIIlIIll("CRMkOBU/Ajs6CQ==", "LkTTz");
   }

   private static void llIlIIIII() {
      llIIIIlI = new int[8];
      llIIIIlI[0] = " ".length();
      llIIIIlI[1] = (198 ^ 134 ^ 101 ^ 40) & (76 ^ 1 ^ 74 ^ 10 ^ -" ".length());
      llIIIIlI[2] = "  ".length();
      llIIIIlI[3] = "   ".length();
      llIIIIlI[4] = 16 ^ 39 ^ 89 ^ 86;
      llIIIIlI[5] = 245 ^ 193 ^ 120 ^ 72;
      llIIIIlI[6] = 53 ^ 48;
      llIIIIlI[7] = 124 + 11 - 3 + 49 ^ 128 + 133 - 241 + 169;
   }

   private static String llIIlIIll(String lllIIlIlIIlIllI, String lllIIlIlIIlIIII) {
      lllIIlIlIIlIllI = new String(Base64.getDecoder().decode(lllIIlIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIIlIlIIlIlII = new StringBuilder();
      char[] lllIIlIlIIlIIll = lllIIlIlIIlIIII.toCharArray();
      int lllIIlIlIIlIIlI = llIIIIlI[1];
      byte lllIIlIlIIIllII = lllIIlIlIIlIllI.toCharArray();
      short lllIIlIlIIIlIll = lllIIlIlIIIllII.length;
      int lllIIlIlIIIlIlI = llIIIIlI[1];

      do {
         if (!llIlIIIlI(lllIIlIlIIIlIlI, lllIIlIlIIIlIll)) {
            return String.valueOf(lllIIlIlIIlIlII);
         }

         char lllIIlIlIIlIlll = lllIIlIlIIIllII[lllIIlIlIIIlIlI];
         lllIIlIlIIlIlII.append((char)(lllIIlIlIIlIlll ^ lllIIlIlIIlIIll[lllIIlIlIIlIIlI % lllIIlIlIIlIIll.length]));
         "".length();
         ++lllIIlIlIIlIIlI;
         ++lllIIlIlIIIlIlI;
         "".length();
      } while((132 ^ 128) > "  ".length());

      return null;
   }
}
