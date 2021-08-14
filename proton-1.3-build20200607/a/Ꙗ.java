package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"},
   d2 = {"La/Ꙗ;", "La/Ἒⅾ$u;", "p0", "", "ⲋ", "(La/Ἒⅾ$u;)V", "<init>", "()V", "La/Ἒⅾ;"}
)
public final class Ꙗ extends Ἒⅾ {
   private static String llIIllllIl(String llIIIlIllIlIIll, String llIIIlIllIIllIl) {
      llIIIlIllIlIIll = new String(Base64.getDecoder().decode(llIIIlIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIIIlIllIlIIIl = new StringBuilder();
      char[] llIIIlIllIlIIII = llIIIlIllIIllIl.toCharArray();
      String llIIIlIllIIlIlI = llIIlIlII[1];
      short llIIIlIllIIlIIl = llIIIlIllIlIIll.toCharArray();
      String llIIIlIllIIlIII = llIIIlIllIIlIIl.length;
      int llIIIlIllIIIlll = llIIlIlII[1];

      do {
         if (!llIlIIlllI(llIIIlIllIIIlll, llIIIlIllIIlIII)) {
            return String.valueOf(llIIIlIllIlIIIl);
         }

         int llIIIlIllIIIllI = llIIIlIllIIlIIl[llIIIlIllIIIlll];
         llIIIlIllIlIIIl.append((char)(llIIIlIllIIIllI ^ llIIIlIllIlIIII[llIIIlIllIIlIlI % llIIIlIllIlIIII.length]));
         "".length();
         ++llIIIlIllIIlIlI;
         ++llIIIlIllIIIlll;
         "".length();
      } while("  ".length() != ((124 + 63 - 153 + 125 ^ 125 + 37 - -14 + 7) & (11 + 98 - 71 + 117 ^ 41 + 78 - 102 + 162 ^ -" ".length())));

      return null;
   }

   private static boolean llIlIIlllI(int var0, int var1) {
      return var0 < var1;
   }

   private static void llIlIIIIIl() {
      llIIIlIIl = new String[llIIlIlII[32]];
      llIIIlIIl[llIIlIlII[1]] = llIIlllIlI("HtdDgE14x2dp76yeFpn8lsmLu6wEmv3lKcwo783pm6GKV3DsCbaVuA==", "PeKso");
      llIIIlIIl[llIIlIlII[0]] = llIIlllIlI("ak7hgy4JUoYfAHVkmgnq9A==", "GgDcL");
      llIIIlIIl[llIIlIlII[3]] = llIIllllIl("ZktQKGsg", "FmgsM");
      llIIIlIIl[llIIlIlII[4]] = llIIlllIlI("13XayVOcPkg=", "CxRrb");
      llIIIlIIl[llIIlIlII[5]] = llIIllllIl("VmBVZwVQ", "pWyAc");
      llIIIlIIl[llIIlIlII[7]] = llIIlllIlI("gsZ6Q1OUj9Su1xWx6efD3w==", "nLtZa");
      llIIIlIIl[llIIlIlII[8]] = llIIllllll("XHvcHbt11OzT6gFBd5z9nw==", "TQIgs");
      llIIIlIIl[llIIlIlII[9]] = llIIlllIlI("D9s10oWN2no=", "vZXRN");
      llIIIlIIl[llIIlIlII[10]] = llIIlllIlI("uCqZTi3VMu3wvrZbUMlnWA==", "IMfXh");
      llIIIlIIl[llIIlIlII[11]] = llIIllllll("fLQdhLixRvzmO8Rk/6ZohSVBtRonq3JQcgr9Drf8tcg=", "dtHNe");
      llIIIlIIl[llIIlIlII[2]] = llIIlllIlI("8kDEU9BBHgw=", "fiPff");
      llIIIlIIl[llIIlIlII[12]] = llIIllllIl("IDYCJRgCNkk4EgEsACUQ", "uXiKw");
      llIIIlIIl[llIIlIlII[13]] = llIIllllIl("KzEeOUkmJRw7BjFkEDBJJiUBIUkxK1I7BitpHCAFKWQGLBkgZBg0HyRqHjQHImohIRssKhU=", "EDrUi");
      llIIIlIIl[llIIlIlII[14]] = llIIlllIlI("4mxXO5z3WsQ=", "FyRrJ");
      llIIIlIIl[llIIlIlII[15]] = llIIllllIl("JjQu", "GPJEx");
      llIIIlIIl[llIIlIlII[16]] = llIIlllIlI("0bi4AlfDZl/+9HVp98Fj9YGVGlSTaZYYi8ZL6aLSQZVYUB6X2Amaqkpn05SRRMnb28jGD0+FvHPKriBPxptEqg3Zuzo8ifZ1qIiu9JY1eN+lacP4FglMPA==", "meDff");
      llIIIlIIl[llIIlIlII[17]] = llIIllllll("KBu2lEfaVjbf0w7zfI2hlA==", "BYzcL");
      llIIIlIIl[llIIlIlII[18]] = llIIllllIl("QENUbDINRUUq", "becLF");
      llIIIlIIl[llIIlIlII[19]] = llIIllllll("LFDP9PNGxJ0=", "xNrqo");
      llIIIlIIl[llIIlIlII[20]] = llIIllllIl("Bj4=", "tSTCc");
      llIIIlIIl[llIIlIlII[21]] = llIIlllIlI("Lue5fd8qfDM=", "KVdKK");
      llIIIlIIl[llIIlIlII[22]] = llIIllllIl("HTIf", "yWsWE");
      llIIIlIIl[llIIlIlII[23]] = llIIllllll("4aJjZjlFmimKdti5ehZp3K4cd/CzltPaDKD9HYT6GZysixe9BTlaS7nbEYhZydG6bpevscB/7+J1baCCsaBsZ912DfylVBmccmOdJSdQ6WRPlyInXo7Ddg==", "lKxqW");
      llIIIlIIl[llIIlIlII[24]] = llIIllllll("+K5wN9NEzL/U/3Q7UVvy0Q==", "MbFgJ");
      llIIIlIIl[llIIlIlII[25]] = llIIlllIlI("itI6hscdavFgCKU0JKgILw==", "rhcWT");
      llIIIlIIl[llIIlIlII[26]] = llIIlllIlI("Rg5CkPQzPDAL51RTe2XgFP19+KxlRCgS", "oGFrr");
      llIIIlIIl[llIIlIlII[27]] = llIIlllIlI("n3mwlLJFmbc=", "OVnPZ");
      llIIIlIIl[llIIlIlII[28]] = llIIllllIl("dllUAjdwSBU=", "PntvX");
      llIIIlIIl[llIIlIlII[29]] = llIIllllll("NLyqQ3iTUb4=", "TNzhi");
      llIIIlIIl[llIIlIlII[30]] = llIIllllIl("Eh06", "axNcg");
      llIIIlIIl[llIIlIlII[31]] = llIIlllIlI("5V6NlIsCc63QfMu2jgC/GgW/NVJ/Oz4ueNnaK2G3eDQ=", "jNtxR");
   }

   private static String llIIllllll(String llIIIlIlIlllllI, String llIIIlIlIllllIl) {
      try {
         SecretKeySpec llIIIlIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short llIIIlIlIlllIIl = Cipher.getInstance("Blowfish");
         llIIIlIlIlllIIl.init(llIIlIlII[3], llIIIlIllIIIIIl);
         return new String(llIIIlIlIlllIIl.doFinal(Base64.getDecoder().decode(llIIIlIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIlIlIlIl(int var0) {
      return var0 == 0;
   }

   private static boolean llIlIIllll(Object var0) {
      return var0 == null;
   }

   private static boolean llIlIlIIlI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean llIlIlIIIl(int var0) {
      return var0 != 0;
   }

   public void ⲋ(@NotNull Ἒⅾ.u llIIIlIlllllIII) {
      // $FF: Couldn't be decompiled
   }

   private static boolean llIlIlIIII(int var0, int var1) {
      return var0 == var1;
   }

   static {
      llIlIIllIl();
      llIlIIIIIl();
   }

   public Ꙗ() {
      super(llIIIlIIl[llIIlIlII[30]], llIIIlIIl[llIIlIlII[31]], (List)null, llIIlIlII[5], (DefaultConstructorMarker)null);
   }

   private static String llIIlllIlI(String llIIIlIlllIIIIl, String llIIIlIlllIIIlI) {
      try {
         SecretKeySpec llIIIlIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), llIIlIlII[10]), "DES");
         boolean llIIIlIllIllllI = Cipher.getInstance("DES");
         llIIIlIllIllllI.init(llIIlIlII[3], llIIIlIlllIIllI);
         return new String(llIIIlIllIllllI.doFinal(Base64.getDecoder().decode(llIIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void llIlIIllIl() {
      llIIlIlII = new int[33];
      llIIlIlII[0] = " ".length();
      llIIlIlII[1] = (108 ^ 83 ^ 129 ^ 159) & (111 ^ 18 ^ 123 ^ 39 ^ -" ".length());
      llIIlIlII[2] = 1 ^ 11;
      llIIlIlII[3] = "  ".length();
      llIIlIlII[4] = "   ".length();
      llIIlIlII[5] = 104 + 166 - 229 + 153 ^ 187 + 5 - 163 + 169;
      llIIlIlII[6] = 100 ^ 90;
      llIIlIlII[7] = 115 ^ 118;
      llIIlIlII[8] = 144 + 164 - 152 + 26 ^ 134 + 15 - -2 + 25;
      llIIlIlII[9] = 15 ^ 127 ^ 226 ^ 149;
      llIIlIlII[10] = 155 ^ 147;
      llIIlIlII[11] = 216 ^ 183 ^ 24 ^ 126;
      llIIlIlII[12] = 90 ^ 29 ^ 114 ^ 62;
      llIIlIlII[13] = 182 ^ 186;
      llIIlIlII[14] = 143 ^ 130;
      llIIlIlII[15] = 171 ^ 165;
      llIIlIlII[16] = 42 ^ 37;
      llIIlIlII[17] = 96 + 50 - 21 + 19 ^ 121 + 127 - 213 + 93;
      llIIlIlII[18] = (84 ^ 8) & ~(68 ^ 24) ^ 89 ^ 72;
      llIIlIlII[19] = 212 ^ 198;
      llIIlIlII[20] = 167 ^ 180;
      llIIlIlII[21] = 133 ^ 145;
      llIIlIlII[22] = 180 ^ 173 ^ 50 ^ 62;
      llIIlIlII[23] = 1 ^ 23;
      llIIlIlII[24] = 47 + 6 - -122 + 16 ^ 90 + 144 - 117 + 51;
      llIIlIlII[25] = 54 ^ 46;
      llIIlIlII[26] = 27 ^ 2;
      llIIlIlII[27] = 10 ^ 16;
      llIIlIlII[28] = 64 + 21 - 7 + 58 ^ 119 + 62 - 60 + 26;
      llIIlIlII[29] = 110 ^ 23 ^ 250 ^ 159;
      llIIlIlII[30] = 102 + 30 - -20 + 9 ^ 139 + 107 - 73 + 15;
      llIIlIlII[31] = 56 ^ 39 ^ " ".length();
      llIIlIlII[32] = 46 ^ 106 ^ 103 ^ 60;
   }
}
