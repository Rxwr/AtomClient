package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"La/ꙑứ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class ꙑứ extends Ἒⅾ {
   private static void llIIIlIlII() {
      lIlllIlIl = new String[lIllllIlI[7]];
      lIlllIlIl[lIllllIlI[0]] = llIIIIlllI("LRIodCsMCD8xJg1aPjcpFR9tPTtZX2NmLg==", "yzMTH");
      lIlllIlIl[lIllllIlI[1]] = llIIIIllll("5zx6/rY1+eY=", "BYaEQ");
      lIlllIlIl[lIllllIlI[2]] = llIIIlIIII("OsfgS8wx/TuZH7mvd3kr5UGPuhEXp1Jf", "GBLYq");
      lIlllIlIl[lIllllIlI[3]] = llIIIlIIII("e4u6I5pBjlp2uOLMD3vjrXMdaPPIrIkKTApGSBjNgZI=", "VtMGW");
      lIlllIlIl[lIllllIlI[4]] = llIIIIllll("pK6iRiSf37uCKhOzadCueLsB1eB5u5df", "vroAL");
      lIlllIlIl[lIllllIlI[5]] = llIIIIlllI("IRgCCDs4FA==", "TqqkZ");
      lIlllIlIl[lIllllIlI[6]] = llIIIIlllI("LC4+HVMEOWodFh84ahobDmsfJ1MYKCsCFkU=", "kKJns");
   }

   private static boolean llIIIllIll(int var0) {
      return var0 > 0;
   }

   private static void llIIIlIllI() {
      lIllllIlI = new int[9];
      lIllllIlI[0] = (164 ^ 179 ^ 125 ^ 112) & (186 ^ 145 ^ 135 ^ 182 ^ -" ".length());
      lIllllIlI[1] = " ".length();
      lIllllIlI[2] = "  ".length();
      lIllllIlI[3] = "   ".length();
      lIllllIlI[4] = 113 ^ 117;
      lIllllIlI[5] = 71 ^ 66;
      lIllllIlI[6] = 71 ^ 65;
      lIllllIlI[7] = 47 ^ 40;
      lIllllIlI[8] = 94 ^ 108 ^ 74 ^ 112;
   }

   private static boolean llIIIlllII(int var0, int var1) {
      return var0 < var1;
   }

   private static String llIIIIlllI(String llIIlIIlIllIIIl, String llIIlIIlIllIIII) {
      llIIlIIlIllIIIl = new String(Base64.getDecoder().decode(llIIlIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      short llIIlIIlIlIllll = new StringBuilder();
      int llIIlIIlIlIlllI = llIIlIIlIllIIII.toCharArray();
      int llIIlIIlIllIIlI = lIllllIlI[0];
      boolean llIIlIIlIlIllII = llIIlIIlIllIIIl.toCharArray();
      double llIIlIIlIlIlIll = llIIlIIlIlIllII.length;
      int llIIlIIlIlIlIlI = lIllllIlI[0];

      do {
         if (!llIIIlllII(llIIlIIlIlIlIlI, llIIlIIlIlIlIll)) {
            return String.valueOf(llIIlIIlIlIllll);
         }

         char llIIlIIlIllIlll = llIIlIIlIlIllII[llIIlIIlIlIlIlI];
         llIIlIIlIlIllll.append((char)(llIIlIIlIllIlll ^ llIIlIIlIlIlllI[llIIlIIlIllIIlI % llIIlIIlIlIlllI.length]));
         "".length();
         ++llIIlIIlIllIIlI;
         ++llIIlIIlIlIlIlI;
         "".length();
      } while(-" ".length() <= 0);

      return null;
   }

   private static String llIIIlIIII(String llIIIllllllllII, String llIIIllllllllIl) {
      try {
         SecretKeySpec llIIlIIIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllllllllIl.getBytes(StandardCharsets.UTF_8)), lIllllIlI[8]), "DES");
         Cipher llIIlIIIIIIIIII = Cipher.getInstance("DES");
         llIIlIIIIIIIIII.init(lIllllIlI[2], llIIlIIIIIIIIIl);
         return new String(llIIlIIIIIIIIII.doFinal(Base64.getDecoder().decode(llIIIllllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIIIllIlI(int var0, int var1) {
      return var0 != var1;
   }

   private static int llIIIllIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public ꙑứ() {
      super(lIlllIlIl[lIllllIlI[5]], lIlllIlIl[lIllllIlI[6]], (List)null, lIllllIlI[4], (DefaultConstructorMarker)null);
   }

   public void ⲋ(@NotNull Ἒⅾ.u llIIlIIllIlIlII) {
      if (llIIIllIIl(llIIlIIllIlIlII.ⲋ())) {
         Y var10000 = Y.ĂƂ;
         StringCompanionObject var8 = StringCompanionObject.INSTANCE;
         String var3 = lIlllIlIl[lIllllIlI[0]];
         Object[] var10001 = new Object[lIllllIlI[1]];
         var10001[lIllllIlI[0]] = ⱉȬ.ᴃᎲ.ƶ();
         Object[] var4 = var10001;
         Y var6 = var10000;
         int var5 = lIllllIlI[0];
         String var9 = String.format(var3, Arrays.copyOf(var4, var4.length));
         Intrinsics.checkExpressionValueIsNotNull(var9, lIlllIlIl[lIllllIlI[1]]);
         String var7 = var9;
         var6.ⲋ(var7);
      } else if (llIIIllIlI(llIIlIIllIlIlII.ⲋ(), lIllllIlI[1])) {
         Y.ĂƂ.ⲋ(lIlllIlIl[lIllllIlI[2]]);
      } else {
         byte llIIlIIllIlIIll = llIIlIIllIlIlII.ⲋ(lIllllIlI[0]).ⲋ();
         if (llIIIllIll(llIIIlIlll(llIIlIIllIlIIll, 0.0D)) && !llIIIllIll(llIIIllIII(llIIlIIllIlIIll, 5.0D))) {
            ⱉȬ.ᴃᎲ.ⲋ(llIIlIIllIlIIll);
            ᶔ.ⲋ.〥ҳⱆ();
            Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIlllIlIl[lIllllIlI[4]]).append(llIIlIIllIlIIll)));
         } else {
            Y.ĂƂ.u(lIlllIlIl[lIllllIlI[3]]);
         }
      }
   }

   static {
      llIIIlIllI();
      llIIIlIlII();
   }

   private static String llIIIIllll(String llIIlIIllIIIlII, String llIIlIIllIIIIll) {
      try {
         SecretKeySpec llIIlIIllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIlIIllIIlIII = Cipher.getInstance("Blowfish");
         llIIlIIllIIlIII.init(lIllllIlI[2], llIIlIIllIIlIIl);
         return new String(llIIlIIllIIlIII.doFinal(Base64.getDecoder().decode(llIIlIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static int llIIIlIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean llIIIllIIl(int var0) {
      return var0 == 0;
   }
}
