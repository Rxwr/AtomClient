package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u001a:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0004\u0010\u0014J\r\u0010\n\u001a\u00020\u0015¢\u0006\u0004\b\n\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0016R \u0010\u0004\u001a\u00020\u00018\u0007@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086DR9\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0086\u0004R)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0002\u0010\u0011¨\u0006\u0086\u0004"},
   d2 = {"La/ȉ;", "", "ĂƂ", "Ljava/lang/String;", "ⲋ", "()Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/ĂƂ;", "La/ȉ$ⲋ;", "Lnet/minecraft/util/ResourceLocation;", "ᴃᎲ", "Ljava/util/HashMap;", "u", "()Ljava/util/HashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "Ljava/util/concurrent/ConcurrentHashMap;", "()Ljava/util/concurrent/ConcurrentHashMap;", "Lnet/minecraft/client/entity/AbstractClientPlayer;", "p0", "(Lnet/minecraft/client/entity/AbstractClientPlayer;)Lnet/minecraft/util/ResourceLocation;", "", "()V", "Ἒⅾ", "〥ҳⱆ", "<init>", ""}
)
public final class ȉ {
   private static boolean llIlIlll(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final ConcurrentHashMap<UUID, ȉ.ⲋ> ĂƂ() {
      return u;
   }

   private final void Ἒⅾ() {
      ((Map)ᴃᎲ).put(ȉ.ⲋ.ĂƂ, new ResourceLocation(lIllIlI[lIlllIl[0]]));
      "".length();
      ((Map)ᴃᎲ).put(ȉ.ⲋ.ⲋ, new ResourceLocation(lIllIlI[lIlllIl[1]]));
      "".length();
   }

   private static void llIlIlII() {
      lIllIlI = new String[lIlllIl[4]];
      lIllIlI[lIlllIl[0]] = llIIllII("aHgfZ9FkhxgQoGWUFtccFA==", "tNGeA");
      lIllIlI[lIlllIl[1]] = llIIllIl("tgJnfxTNSrDAigENn2fCiW1tn6xZrq8s", "wVeAd");
      lIllIlI[lIlllIl[2]] = llIIllll("DCUDPgZeflgpHBA9FixbBz4aYTsRMhsrABdoWC8BCzxaKBwINARhWEsjFjlaCTAEOhAWfhQvBQEiWToNEA==", "dQwNu");
      lIllIlI[lIlllIl[3]] = llIIllIl("rfCqaZHRGxlXdvXpw/+1Iq22kMZAe2kbZ+Rpg/CdnaF5Mms9/eqQCAu8f7iADrVwck+HMfSB56FbV0pMcxj39w==", "tIIjp");
   }

   private static String llIIllII(String llllIIlIIIIlIIl, String llllIIlIIIIlIlI) {
      try {
         double llllIIlIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIlllIl[5]), "DES");
         Cipher llllIIlIIIIllIl = Cipher.getInstance("DES");
         llllIIlIIIIllIl.init(lIlllIl[2], llllIIlIIIIIlll);
         return new String(llllIIlIIIIllIl.doFinal(Base64.getDecoder().decode(llllIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void llIlIlIl() {
      lIlllIl = new int[6];
      lIlllIl[0] = (204 ^ 135) & ~(82 ^ 25);
      lIlllIl[1] = " ".length();
      lIlllIl[2] = "  ".length();
      lIlllIl[3] = "   ".length();
      lIlllIl[4] = 251 ^ 159 ^ 117 ^ 21;
      lIlllIl[5] = 36 + 60 - -22 + 13 ^ 77 + 71 - 53 + 44;
   }

   static {
      llIlIlIl();
      llIlIlII();
      ĂƂ = lIllIlI[lIlllIl[2]];
      ȉ var0 = new ȉ();
      ⲋ = var0;
      ĂƂ = lIllIlI[lIlllIl[3]];
      u = new ConcurrentHashMap();
      int var1 = lIlllIl[0];
      ᴃᎲ = new HashMap();
   }

   @JvmName(
      name = "u"
   )
   public final HashMap<ȉ.ⲋ, ResourceLocation> u() {
      return ᴃᎲ;
   }

   private final void 〥ҳⱆ() {
      〥ҳⱆ.〥ҳⱆ.ĂƂ().execute((Runnable)null.ⲋ);
   }

   private static String llIIllll(String llllIIlIIIllIll, String llllIIlIIIllIlI) {
      llllIIlIIIllIll = new String(Base64.getDecoder().decode(llllIIlIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llllIIlIIIllllI = new StringBuilder();
      char[] llllIIlIIIlllIl = llllIIlIIIllIlI.toCharArray();
      int llllIIlIIIlllII = lIlllIl[0];
      double llllIIlIIIlIllI = llllIIlIIIllIll.toCharArray();
      String llllIIlIIIlIlIl = llllIIlIIIlIllI.length;
      int llllIIlIIIlIlII = lIlllIl[0];

      do {
         if (!llIlIlll(llllIIlIIIlIlII, llllIIlIIIlIlIl)) {
            return String.valueOf(llllIIlIIIllllI);
         }

         char llllIIlIIlIIIIl = llllIIlIIIlIllI[llllIIlIIIlIlII];
         llllIIlIIIllllI.append((char)(llllIIlIIlIIIIl ^ llllIIlIIIlllIl[llllIIlIIIlllII % llllIIlIIIlllIl.length]));
         "".length();
         ++llllIIlIIIlllII;
         ++llllIIlIIIlIlII;
         "".length();
      } while("  ".length() == "  ".length());

      return null;
   }

   public final void ᴃᎲ() {
      this.〥ҳⱆ();
      this.Ἒⅾ();
   }

   private static String llIIllIl(String llllIIlIIllIIII, String llllIIlIIlIllIl) {
      try {
         String llllIIlIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llllIIlIIllIIlI = Cipher.getInstance("Blowfish");
         llllIIlIIllIIlI.init(lIlllIl[2], llllIIlIIlIllII);
         return new String(llllIIlIIllIIlI.doFinal(Base64.getDecoder().decode(llllIIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private ȉ() {
   }

   @JvmStatic
   @Nullable
   public static final ResourceLocation ⲋ(@NotNull AbstractClientPlayer var0) {
      ȉ.ⲋ var10000 = (ȉ.ⲋ)u.get(var0.field_146106_i.getId());
      if (llIlIllI(var10000)) {
         "".length();
         if (null != null) {
            return null;
         } else {
            ȉ.ⲋ var1 = var10000;
            return (ResourceLocation)ᴃᎲ.get(var1);
         }
      } else {
         "".length();
         return null;
      }
   }

   private static boolean llIlIllI(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final String ⲋ() {
      return ĂƂ;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ȉ$ⲋ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private static void lIIIlIlIlll() {
         lIIIIIIlIl = new int[4];
         lIIIIIIlIl[0] = "  ".length();
         lIIIIIIlIl[1] = (190 ^ 184) & ~(56 ^ 62);
         lIIIIIIlIl[2] = " ".length();
         lIIIIIIlIl[3] = 51 ^ 59;
      }

      static {
         lIIIlIlIlll();
         lIIIlIIllll();
         ȉ.ⲋ[] var10001 = new ȉ.ⲋ[lIIIIIIlIl[0]];
         var10001[lIIIIIIlIl[1]] = ⲋ = new ȉ.ⲋ(lllllIlII[lIIIIIIlIl[1]], lIIIIIIlIl[1]);
         var10001[lIIIIIIlIl[2]] = ĂƂ = new ȉ.ⲋ(lllllIlII[lIIIIIIlIl[2]], lIIIIIIlIl[2]);
      }

      private static void lIIIlIIllll() {
         lllllIlII = new String[lIIIIIIlIl[0]];
         lllllIlII[lIIIIIIlIl[1]] = lIIIlIIllIl("8eWB5TXLjBg=", "MiTlk");
         lllllIlII[lIIIIIIlIl[2]] = lIIIlIIlllI("GAkgNgoK", "YJcsY");
      }

      private static boolean lIIIlIllIll(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIIIlIIlllI(String lIllIlIIIlIIIlI, String lIllIlIIIlIIIIl) {
         lIllIlIIIlIIIlI = new String(Base64.getDecoder().decode(lIllIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         float lIllIlIIIIllIll = new StringBuilder();
         double lIllIlIIIIllIlI = lIllIlIIIlIIIIl.toCharArray();
         int lIllIlIIIIllllI = lIIIIIIlIl[1];
         Exception lIllIlIIIIllIII = lIllIlIIIlIIIlI.toCharArray();
         short lIllIlIIIIlIlll = lIllIlIIIIllIII.length;
         int lIllIlIIIIlIllI = lIIIIIIlIl[1];

         do {
            if (!lIIIlIllIll(lIllIlIIIIlIllI, lIllIlIIIIlIlll)) {
               return String.valueOf(lIllIlIIIIllIll);
            }

            char lIllIlIIIlIIIll = lIllIlIIIIllIII[lIllIlIIIIlIllI];
            lIllIlIIIIllIll.append((char)(lIllIlIIIlIIIll ^ lIllIlIIIIllIlI[lIllIlIIIIllllI % lIllIlIIIIllIlI.length]));
            "".length();
            ++lIllIlIIIIllllI;
            ++lIllIlIIIIlIllI;
            "".length();
         } while((103 ^ 41 ^ 84 ^ 30) >= (3 + 107 - 20 + 42 ^ 15 + 59 - 72 + 126));

         return null;
      }

      private static String lIIIlIIllIl(String lIllIlIIIllIIII, String lIllIlIIIlIllll) {
         try {
            String lIllIlIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIIIlIllll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIl[3]), "DES");
            long lIllIlIIIlIllIl = Cipher.getInstance("DES");
            lIllIlIIIlIllIl.init(lIIIIIIlIl[0], lIllIlIIIlIlllI);
            return new String(lIllIlIIIlIllIl.doFinal(Base64.getDecoder().decode(lIllIlIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private ⲋ() {
      }
   }
}
