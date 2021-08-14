package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"La/ⲡ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class ⲡ extends Ἒⅾ {
   private static void lIIIlIlIlIl() {
      llllllllI = new String[lIIIIIlIIl[8]];
      llllllllI[lIIIIIlIIl[1]] = lIIIlIlIIll("Vw/GGL7SClYo5F0AWUbLwm4fdj/RE1LVWGksR8xcBEo=", "vQEzh");
      llllllllI[lIIIIIlIIl[2]] = lIIIlIlIIll("fxSqtSIO/jQ8Keczadb1+g9+vvNVnFco", "liKEy");
      llllllllI[lIIIIIlIIl[0]] = lIIIlIlIIll("jwEva9yAKKB3uoGVL06b/7QwLfWK62nv", "OnZRb");
      llllllllI[lIIIIIlIIl[3]] = lIIIlIlIIll("yrNlbTH2RHg=", "RWQEv");
      llllllllI[lIIIIIlIIl[4]] = lIIIlIlIlII("cBYqTQ==", "PbEmK");
      llllllllI[lIIIIIlIIl[6]] = lIIIlIlIlII("IRsbIQ==", "CruEM");
      llllllllI[lIIIIIlIIl[7]] = lIIIlIlIIll("V/6GVctcduZC2zH/U9gkVRYqQvURLxf5JMQ2z2OuaLO710KLYpZo9A==", "FWgaE");
   }

   public ⲡ() {
      super(llllllllI[lIIIIIlIIl[6]], llllllllI[lIIIIIlIIl[7]], (List)null, lIIIIIlIIl[4], (DefaultConstructorMarker)null);
   }

   private static void lIIIllIlIIl() {
      lIIIIIlIIl = new int[9];
      lIIIIIlIIl[0] = "  ".length();
      lIIIIIlIIl[1] = (69 + 145 - 189 + 213 ^ 148 + 72 - 170 + 116) & (139 ^ 168 ^ 227 ^ 136 ^ -" ".length());
      lIIIIIlIIl[2] = " ".length();
      lIIIIIlIIl[3] = "   ".length();
      lIIIIIlIIl[4] = 228 ^ 182 ^ 17 ^ 71;
      lIIIIIlIIl[5] = 19 ^ 30 ^ 170 ^ 137;
      lIIIIIlIIl[6] = 46 ^ 100 ^ 115 ^ 60;
      lIIIIIlIIl[7] = 29 ^ 92 ^ 5 ^ 66;
      lIIIIIlIIl[8] = 109 + 44 - 105 + 97 ^ 41 + 94 - 80 + 95;
   }

   private static boolean lIIIllIlIlI(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIIIllIllIl(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIIlIlIlII(String lIllIIllIIIIIII, String lIllIIllIIIIlII) {
      lIllIIllIIIIIII = new String(Base64.getDecoder().decode(lIllIIllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lIllIIlIllllllI = new StringBuilder();
      float lIllIIlIlllllIl = lIllIIllIIIIlII.toCharArray();
      int lIllIIllIIIIIIl = lIIIIIlIIl[1];
      char lIllIIlIllllIll = lIllIIllIIIIIII.toCharArray();
      char lIllIIlIllllIlI = lIllIIlIllllIll.length;
      int lIllIIlIllllIIl = lIIIIIlIIl[1];

      do {
         if (!lIIIllIllIl(lIllIIlIllllIIl, lIllIIlIllllIlI)) {
            return String.valueOf(lIllIIlIllllllI);
         }

         String lIllIIlIllllIII = lIllIIlIllllIll[lIllIIlIllllIIl];
         lIllIIlIllllllI.append((char)(lIllIIlIllllIII ^ lIllIIlIlllllIl[lIllIIllIIIIIIl % lIllIIlIlllllIl.length]));
         "".length();
         ++lIllIIllIIIIIIl;
         ++lIllIIlIllllIIl;
         "".length();
      } while(null == null);

      return null;
   }

   public void ⲋ(@NotNull Ἒⅾ.u lIllIIllIlIIIIl) {
      if (lIIIllIlIlI(lIllIIllIlIIIIl.ⲋ(), lIIIIIlIIl[0])) {
         Y.ĂƂ.ⲋ(llllllllI[lIIIIIlIIl[1]]);
      } else {
         char lIllIIllIlIIIII = lIllIIllIlIIIIl.ⲋ(lIIIIIlIIl[1]).Ἒⅾ();
         Exception lIllIIllIIlllll = ơ߀.ⲋ.ĂƂ(lIllIIllIlIIIIl.ⲋ(lIIIIIlIIl[1]).Ἒⅾ());
         if (lIIIllIlIll(lIllIIllIIlllll)) {
            Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(llllllllI[lIIIIIlIIl[2]]).append(lIllIIllIlIIIII)));
         } else {
            boolean lIllIIllIIllllI = lIllIIllIlIIIIl.ⲋ(lIIIIIlIIl[2]).Ἒⅾ();
            long lIllIIllIIlllIl = Keyboard.getKeyIndex(lIllIIllIIllllI);
            if (lIIIllIllII(lIllIIllIIlllIl)) {
               Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIllIIllIIllllI).append(llllllllI[lIIIIIlIIl[0]])));
            } else {
               lIllIIllIIlllll.ĂƂ(lIllIIllIIlllIl);
               Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(llllllllI[lIIIIIlIIl[3]]).append(lIllIIllIIlllll.ȵ()).append(llllllllI[lIIIIIlIIl[4]]).append(lIllIIllIIllllI).append((char)lIIIIIlIIl[5])));
            }
         }
      }
   }

   static {
      lIIIllIlIIl();
      lIIIlIlIlIl();
   }

   private static boolean lIIIllIllII(int var0) {
      return var0 == 0;
   }

   private static boolean lIIIllIlIll(Object var0) {
      return var0 == null;
   }

   private static String lIIIlIlIIll(String lIllIIllIIlIIll, String lIllIIllIIlIIlI) {
      try {
         SecretKeySpec lIllIIllIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIllIIllIIlIlll = Cipher.getInstance("Blowfish");
         lIllIIllIIlIlll.init(lIIIIIlIIl[0], lIllIIllIIllIII);
         return new String(lIllIIllIIlIlll.doFinal(Base64.getDecoder().decode(lIllIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
