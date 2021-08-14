package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00012\u00020\u0019:\u0001\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0001\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\t\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\t\u0010\u0014R\u001a\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0082.R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0082\u0004R\u001a\u0010\f\u001a\u00020\n8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u000b¨\u0006\u0096\u0004"},
   d2 = {"La/ⱦ;", "ⲋ", "La/ⱙ;", "〥ҳⱆ", "La/ⱙ;", "La/ᵭ;", "", "Ἒⅾ", "La/ᵭ;", "ĂƂ", "La/ė;", "()La/ė;", "u", "La/ⅵ;", "p0", "", "p1", "", "(La/ⅵ;I)V", "b_", "()V", "ⴜ", "ᴃᎲ", "<init>", "(La/ᵭ;)V", "La/Ữ;"}
)
public final class ⱦ extends Ữ {
   private static String lIIlllIIII(String llIlIIlIIIIIIll, String llIlIIlIIIIIIlI) {
      try {
         float llIlIIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double llIlIIIlllllllI = Cipher.getInstance("Blowfish");
         llIlIIIlllllllI.init(lIIllIIll[4], llIlIIIllllllll);
         return new String(llIlIIIlllllllI.doFinal(Base64.getDecoder().decode(llIlIIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIlIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIIlIIll(Object var0) {
      return var0 == null;
   }

   private static String lIIllllIlI(String llIlIIlIIIllIII, String llIlIIlIIIlIlll) {
      llIlIIlIIIllIII = new String(Base64.getDecoder().decode(llIlIIlIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIlIIlIIIlIllI = new StringBuilder();
      short llIlIIlIIIlIIII = llIlIIlIIIlIlll.toCharArray();
      char llIlIIlIIIIllll = lIIllIIll[2];
      char llIlIIlIIIIlllI = llIlIIlIIIllIII.toCharArray();
      long llIlIIlIIIIllIl = llIlIIlIIIIlllI.length;
      int llIlIIlIIIIllII = lIIllIIll[2];

      do {
         if (!lIlIIlIlIl(llIlIIlIIIIllII, llIlIIlIIIIllIl)) {
            return String.valueOf(llIlIIlIIIlIllI);
         }

         char llIlIIlIIIllIIl = llIlIIlIIIIlllI[llIlIIlIIIIllII];
         llIlIIlIIIlIllI.append((char)(llIlIIlIIIllIIl ^ llIlIIlIIIlIIII[llIlIIlIIIIllll % llIlIIlIIIlIIII.length]));
         "".length();
         ++llIlIIlIIIIllll;
         ++llIlIIlIIIIllII;
         "".length();
      } while(null == null);

      return null;
   }

   public ⱦ() {
      this((ᵭ)null, lIIllIIll[3], (DefaultConstructorMarker)null);
   }

   private static boolean lIlIIlIlII(int var0) {
      return var0 != 0;
   }

   private static void lIlIIIllII() {
      lIIlIlIII = new String[lIIllIIll[13]];
      lIIlIlIII[lIIllIIll[2]] = lIIlllIIII("QNWWbAEqJ/A7QucJn9hmBg==", "erKxp");
      lIIlIlIII[lIIllIIll[3]] = lIIlllIIII("l7FZL6AqWc+NlFPW0490KA==", "tpmQh");
      lIIlIlIII[lIIllIIll[4]] = lIIlllIIII("6Fzj32XUwh0pAt4d9PB4Rg==", "FmaZy");
      lIIlIlIII[lIIllIIll[5]] = lIIlllIIII("5ZwVlKfyh69cUbGypFvUDg==", "CgBYI");
      lIIlIlIII[lIIllIIll[6]] = lIIllllIIl("SXNdRBSsTIoVNvgXmoOSHw==", "NMdnH");
      lIIlIlIII[lIIllIIll[9]] = lIIllllIIl("qIGbe/yzrfRF7RvNOHKtdw==", "HrTsg");
      lIIlIlIII[lIIllIIll[10]] = lIIllllIlI("KTAZNAUkEBk5BCAlHj8H", "AQwPi");
      lIIlIlIII[lIIllIIll[11]] = lIIlllIIII("BIMnkyi5PFMdFx/ceH9s0Q==", "nOEuV");
      lIIlIlIII[lIIllIIll[12]] = lIIllllIlI("GAsFAz8VKwUOPhEeAgg9", "pjkgS");
   }

   public void ⴜ() {
      super.ⴜ();
      ⱙ var10000 = llIlIIlIIllIlIl.〥ҳⱆ;
      if (lIlIIlIIll(var10000)) {
         Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[2]]);
      }

      if (lIlIIlIlII(var10000.ɡ())) {
         llIlIIlIIllIlIl.Ꙗ();
      }

   }

   public ⱦ(@NotNull ᵭ<Boolean> var1) {
      llIlIIlIIlIlIlI.Ἒⅾ = var1;
      llIlIIlIIlIlIlI.Ἒⅾ.ⲋ((Function1)(new Function1<ᵭ<Boolean>, Unit>() {
         static {
            lIlIllIIl();
         }

         public final void ⲋ(@NotNull ᵭ<Boolean> var1) {
            llIlIIlIIlIlIlI.ᴃᎲ();
         }

         private static void lIlIllIIl() {
            lIlIIIIl = new int[1];
            lIlIIIIl[0] = " ".length();
         }
      }));
      llIlIIlIIlIlIlI.〥ҳⱆ = (new ⱙ()).ᴃᎲ(1.0D).〥ҳⱆ(17.0D).u(Ὴ.ⲋ.ⲋ().u()).ᴃᎲ(Ὴ.ⲋ.ⲋ().ϛⰄ()).ĂƂ(ⰺ.ĂƂ).Ἒⅾ(0.1D);
      ⱙ var10000;
      if (lIlIIlIlII((Boolean)llIlIIlIIlIlIlI.Ἒⅾ.ⲋ())) {
         var10000 = llIlIIlIIlIlIlI.〥ҳⱆ;
         if (lIlIIlIIll(var10000)) {
            Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[9]]);
         }

         var10000.ⴜ();
         var10000 = llIlIIlIIlIlIlI.〥ҳⱆ;
         if (lIlIIlIIll(var10000)) {
            Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[10]]);
         }

         var10000.ς();
         "".length();
         if ("   ".length() > (178 + 48 - 171 + 127 ^ 152 + 166 - 206 + 66)) {
            throw null;
         }
      } else {
         var10000 = llIlIIlIIlIlIlI.〥ҳⱆ;
         if (lIlIIlIIll(var10000)) {
            Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[11]]);
         }

         var10000.ͷ();
         var10000 = llIlIIlIIlIlIlI.〥ҳⱆ;
         if (lIlIIlIIll(var10000)) {
            Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[12]]);
         }

         var10000.ς();
      }

   }

   static {
      lIlIIlIIII();
      lIlIIIllII();
      ⲋ = lIIllIIll[1];
      ⲋ = new ⱦ.ⲋ((DefaultConstructorMarker)null);
   }

   private static boolean lIlIIlIIlI(int var0) {
      return var0 == 0;
   }

   private static void lIlIIlIIII() {
      lIIllIIll = new int[14];
      lIIllIIll[0] = 72 + 95 - 126 + 99 ^ 63 + 70 - 70 + 105;
      lIIllIIll[1] = 123 ^ 2 ^ 109 ^ 6;
      lIIllIIll[2] = (25 ^ 85) & ~(82 ^ 30);
      lIIllIIll[3] = " ".length();
      lIIllIIll[4] = "  ".length();
      lIIllIIll[5] = "   ".length();
      lIIllIIll[6] = 66 ^ 70;
      lIIllIIll[7] = -30410 & 30665;
      lIIllIIll[8] = 137 ^ 191 ^ 141 ^ 163;
      lIIllIIll[9] = 193 + 51 - 161 + 113 ^ 61 + 84 - 122 + 170;
      lIIllIIll[10] = 181 ^ 148 ^ 5 ^ 34;
      lIIllIIll[11] = 85 + 24 - -23 + 17 ^ 69 + 92 - 150 + 135;
      lIIllIIll[12] = 145 ^ 153;
      lIIllIIll[13] = 79 ^ 70;
   }

   public void ⲋ(@NotNull ⅵ var1, int var2) {
      super.ⲋ(var1, var2);
      if (lIlIIlIIlI(var2)) {
         this.ĂƂ();
      }

   }

   private final void ĂƂ() {
      ᵭ var10000 = this.Ἒⅾ;
      int var10001;
      if (lIlIIlIIlI((Boolean)this.Ἒⅾ.ⲋ())) {
         var10001 = lIIllIIll[3];
         "".length();
         if ("  ".length() == 0) {
            return;
         }
      } else {
         var10001 = lIIllIIll[2];
      }

      var10000.ⲋ((Object)Boolean.valueOf((boolean)var10001));
      this.ᴃᎲ();
   }

   private static String lIIllllIIl(String llIlIIIllllIllI, String llIlIIIllllIlIl) {
      try {
         SecretKeySpec llIlIIIlllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIllllIlIl.getBytes(StandardCharsets.UTF_8)), lIIllIIll[12]), "DES");
         String llIlIIIllllIIIl = Cipher.getInstance("DES");
         llIlIIIllllIIIl.init(lIIllIIll[4], llIlIIIlllllIIl);
         return new String(llIlIIIllllIIIl.doFinal(Base64.getDecoder().decode(llIlIIIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private final void ᴃᎲ() {
      ⱙ var10000;
      if (lIlIIlIlII((Boolean)llIlIIlIIllIIIl.Ἒⅾ.ⲋ())) {
         var10000 = llIlIIlIIllIIIl.〥ҳⱆ;
         if (lIlIIlIIll(var10000)) {
            Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[3]]);
         }

         var10000.ⴜ();
         "".length();
         if (-" ".length() >= ((212 ^ 129 ^ 164 ^ 182) & (58 + 196 - 226 + 218 ^ 131 + 145 - 122 + 23 ^ -" ".length()))) {
            return;
         }
      } else {
         var10000 = llIlIIlIIllIIIl.〥ҳⱆ;
         if (lIlIIlIIll(var10000)) {
            Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[4]]);
         }

         var10000.ͷ();
      }

   }

   public void b_() {
      double llIlIIlIIlIllIl = 9.0D;
      ⲙ var10000 = ⲙ.ⲋ;
      double var10004 = (double)lIIllIIll[1];
      ⱙ var10006 = llIlIIlIIlIlllI.〥ҳⱆ;
      if (lIlIIlIIll(var10006)) {
         Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[5]]);
      }

      var10000.ⲋ(0.0D, 0.0D, 36.0D, var10004, llIlIIlIIlIllIl, var10006.ⲡ());
      ⲙ.ⲋ(Ὴ.ⲋ.ⲋ().ⲋ());
      ⱙ var10001 = llIlIIlIIlIlllI.〥ҳⱆ;
      if (lIlIIlIIll(var10001)) {
         Intrinsics.throwUninitializedPropertyAccessException(lIIlIlIII[lIIllIIll[6]]);
      }

      ⲙ.ⲋ$default(llIlIIlIIlIllIl + var10001.Ꜥ(), llIlIIlIIlIllIl, llIlIIlIIlIllIl - 1.0D, lIIllIIll[2], lIIllIIll[2], lIIllIIll[7], lIIllIIll[8], (Object)null);
      super.b_();
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return new ė(lIIllIIll[0], lIIllIIll[1]);
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0086TR\u001a\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\u0086T"},
      d2 = {"La/ⱦ$ⲋ;", "", "u", "D", "ⲋ", "", "I", "ĂƂ", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private ⲋ() {
      }
   }
}
