package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0004\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0004\u0010\u0018J\u0017\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0004\u0010\u001aJ\u0015\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0086TR\u001a\u0010\u0005\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003¨\u0006\u0086TR\u001a\u0010\u0006\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003¨\u0006\u0086TR\u001a\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003¨\u0006\u0086TR&\u0010\f\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u0004\u0010\u000b¨\u0006\u0086\u000eR\u001d\u0010\u000e\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010¨\u0006\u0086\u0004R\u001d\u0010\u0012\u001a\u00020\u00118\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0086\u0004"},
   d2 = {"La/〥ҳⱆ;", "", "ᴃᎲ", "Ljava/lang/String;", "ⲋ", "ĂƂ", "u", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ς", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "〥ҳⱆ", "Lorg/apache/logging/log4j/Logger;", "Ἒⅾ", "Lorg/apache/logging/log4j/Logger;", "()Lorg/apache/logging/log4j/Logger;", "Ljava/util/concurrent/ExecutorService;", "ϛⰄ", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "Lnet/minecraftforge/fml/common/event/FMLInitializationEvent;", "p0", "", "(Lnet/minecraftforge/fml/common/event/FMLInitializationEvent;)V", "", "(Z)V", "(Ljava/lang/String;)V", "<init>", "()V", ""}
)
public final class 〥ҳⱆ {
   private static boolean lIlIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final ExecutorService ĂƂ() {
      return ϛⰄ;
   }

   private static void lIIllllll() {
      lIIIlllI = new int[14];
      lIIIlllI[0] = (69 ^ 84) & ~(159 ^ 142);
      lIIIlllI[1] = " ".length();
      lIIIlllI[2] = "  ".length();
      lIIIlllI[3] = "   ".length();
      lIIIlllI[4] = 179 ^ 183;
      lIIIlllI[5] = "   ".length() ^ 192 ^ 198;
      lIIIlllI[6] = 196 ^ 194;
      lIIIlllI[7] = 112 ^ 119;
      lIIIlllI[8] = 54 ^ 62;
      lIIIlllI[9] = 136 + 148 - 109 + 31 ^ 62 + 77 - -6 + 54;
      lIIIlllI[10] = 32 ^ 42;
      lIIIlllI[11] = 222 ^ 157 ^ 54 ^ 126;
      lIIIlllI[12] = 60 ^ 11 ^ 154 ^ 161;
      lIIIlllI[13] = 95 + 17 - 60 + 76 ^ 45 + 62 - 52 + 86;
   }

   @JvmName(
      name = "u"
   )
   public final AtomicBoolean u() {
      return ς;
   }

   private static String lIIlIllll(String lllIlIIlIIllIII, String lllIlIIlIIlIlIl) {
      try {
         SecretKeySpec lllIlIIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlllI[8]), "DES");
         Cipher lllIlIIlIIllIlI = Cipher.getInstance("DES");
         lllIlIIlIIllIlI.init(lIIIlllI[2], lllIlIIlIIllIll);
         return new String(lllIlIIlIIllIlI.doFinal(Base64.getDecoder().decode(lllIlIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final Logger ⲋ() {
      return Ἒⅾ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull AtomicBoolean var1) {
      ς = var1;
   }

   private static String lIIllIIII(String lllIlIIlIIIIIll, String lllIlIIlIIIIIlI) {
      lllIlIIlIIIIIll = new String(Base64.getDecoder().decode(lllIlIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception lllIlIIlIIIIIIl = new StringBuilder();
      double lllIlIIlIIIIIII = lllIlIIlIIIIIlI.toCharArray();
      long lllIlIIIlllllll = lIIIlllI[0];
      char lllIlIIIllllllI = lllIlIIlIIIIIll.toCharArray();
      byte lllIlIIIlllllIl = lllIlIIIllllllI.length;
      int lllIlIIIlllllII = lIIIlllI[0];

      do {
         if (!lIlIIIIlI(lllIlIIIlllllII, lllIlIIIlllllIl)) {
            return String.valueOf(lllIlIIlIIIIIIl);
         }

         short lllIlIIIllllIll = lllIlIIIllllllI[lllIlIIIlllllII];
         lllIlIIlIIIIIIl.append((char)(lllIlIIIllllIll ^ lllIlIIlIIIIIII[lllIlIIIlllllll % lllIlIIlIIIIIII.length]));
         "".length();
         ++lllIlIIIlllllll;
         ++lllIlIIIlllllII;
         "".length();
      } while(((61 ^ 50) & ~(142 ^ 129)) == 0);

      return null;
   }

   public final void ⲋ(@NotNull String var1) {
      Ἒⅾ.info(var1);
   }

   private final void ⲋ(boolean var1) {
      lllIlIIlIlIlIIl.ⲋ(lIIIIlll[lIIIlllI[0]]);
      ơ߀.ⲋ.ᴃᎲ();
      lllIlIIlIlIlIIl.ⲋ(lIIIIlll[lIIIlllI[1]]);
      if (lIlIIIIII(var1)) {
         Minecraft.func_71410_x().func_152344_a((Runnable)null.ⲋ);
         "".length();
         "".length();
         if ("   ".length() < 0) {
            return;
         }
      } else {
         ⱉȬ.ᴃᎲ.ⱯꝣѺ();
      }

      lllIlIIlIlIlIIl.ⲋ(lIIIIlll[lIIIlllI[2]]);
      float lllIlIIlIlIIlll = Ἠ.ⲋ.Ἒⅾ();
      if (lIlIIIIIl(lllIlIIlIlIIlll)) {
         long lllIlIIlIlIIlIl = lIIIlllI[0];
         float lllIlIIlIlIIlII = lIIIlllI[0];
         char lllIlIIlIlIIIlI = lIIIlllI[0];
         ơ߀.ⲋ.ⲋ(lllIlIIlIlIIlll.ĂƂ());
         "".length();
         if ("   ".length() == 0) {
            return;
         }
      } else {
         "".length();
      }

      ơ߀.ⲋ.〥ҳⱆ();
      lllIlIIlIlIlIIl.ⲋ(lIIIIlll[lIIIlllI[3]]);
      MinecraftForge.EVENT_BUS.register(a.u.ⲋ);
      ƶ.ⲋ.ĂƂ(a.u.ⲋ);
      ƶ.ⲋ.ĂƂ(Ȟ.ⲋ);
      ƶ.ⲋ.ĂƂ(ꞀⳢ.ⲋ);
      lllIlIIlIlIlIIl.ⲋ(lIIIIlll[lIIIlllI[4]]);
      ȉ.ⲋ.ᴃᎲ();
      lllIlIIlIlIlIIl.ⲋ(lIIIIlll[lIIIlllI[5]]);
      ς.set((boolean)lIIIlllI[1]);
   }

   private static boolean lIlIIIIIl(Object var0) {
      return var0 != null;
   }

   private 〥ҳⱆ() {
   }

   @EventHandler
   public final void ⲋ(@Nullable FMLInitializationEvent var1) {
      lllIlIIlIlIIIII.ⲋ(lIIIIlll[lIIIlllI[6]]);
      lllIlIIlIlIIIII.ⲋ(lIIIIlll[lIIIlllI[7]]);
      Ἠ.ⲋ.ϛⰄ();
      if (lIlIIIIII(Ἠ.ⲋ.〥ҳⱆ())) {
         ϛⰄ.execute((Runnable)null.ⲋ);
         "".length();
         if ((110 ^ 107) == 0) {
            return;
         }
      } else {
         lllIlIIlIlIIIII.ⲋ((boolean)lIIIlllI[0]);
      }

   }

   private static void lIIllllII() {
      lIIIIlll = new String[lIIIlllI[13]];
      lIIIIlll[lIIIlllI[0]] = lIIlIllll("F2kxvBZNbjh9uNGOpTnIrkJKC0aNqr6IzTUw5i7RSGE=", "zETbP");
      lIIIIlll[lIIIlllI[1]] = lIIlIllll("zzm4wt5SH6bql+7aoSi39dCuxm7cZGwC", "IoCmQ");
      lIIIIlll[lIIIlllI[2]] = lIIlIllll("67VEAz2uQf5n6oi+ELruBg==", "ZoHZz");
      lIIIIlll[lIIIlllI[3]] = lIIllIIII("OC0THzEeLQYfLA1oEQAnBDwH", "jHtvB");
      lIIIIlll[lIIIlllI[4]] = lIIllIIII("HwERNyg3AxE5KDgIWAAgJgotNyg6", "VoxCA");
      lIIIIlll[lIIIlllI[5]] = lIIlIllll("O3FhHMLf/SdusJ0QWYc7fwFuUhfIc9Eg", "RLXOn");
      lIIIIlll[lIIIlllI[6]] = lIIlIllll("7no3LysSHv52A7/JDoG97g==", "izQuB");
      lIIIIlll[lIIIlllI[7]] = lIIllIIII("DT8ZDTwlPRkDPCo2UDo6KjcZHhglPxEeMDY=", "DQpyU");
      lIIIIlll[lIIIlllI[8]] = lIIllIIII("QE9FVGZASkBVbEFBQ1ltQkBI", "vxplT");
      lIIIIlll[lIIIlllI[9]] = lIIlIllll("wxTZiueqJtI=", "PahwJ");
      lIIIIlll[lIIIlllI[10]] = lIIlIllll("EVI3E1LdyPM=", "aKhIP");
      lIIIIlll[lIIIlllI[11]] = lIIllIIII("A2VMSg==", "aTbyT");
      lIIIIlll[lIIIlllI[12]] = lIIlIllll("0xpWbmwmw8s=", "rUnKj");
   }

   static {
      lIIllllll();
      lIIllllII();
      ᴃᎲ = lIIIIlll[lIIIlllI[8]];
      ⲋ = lIIIIlll[lIIIlllI[9]];
      ĂƂ = lIIIIlll[lIIIlllI[10]];
      u = lIIIIlll[lIIIlllI[11]];
      〥ҳⱆ var0 = new 〥ҳⱆ();
      〥ҳⱆ = var0;
      Ἒⅾ = LogManager.getLogger(lIIIIlll[lIIIlllI[12]]);
      ϛⰄ = Executors.newFixedThreadPool(lIIIlllI[2]);
      ς = new AtomicBoolean();
   }

   private static boolean lIlIIIIII(int var0) {
      return var0 != 0;
   }
}
