package a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020#B\t\b\u0002¢\u0006\u0004\b\"\u0010 J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0007\u0010\u0017J\u001f\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0004\u0010\u001dJ\u0017\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0006\u0010\u001eJ\u0019\u0010\b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\b\u0010\u001eJ\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0002\u0010\u001fJ\r\u0010\u0010\u001a\u00020\u001b¢\u0006\u0004\b\u0010\u0010 J\u000f\u0010\n\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\n\u0010 J\r\u0010\u0019\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010 J\u0017\u0010\u0005\u001a\u00020\u001b2\b\b\u0002\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u0005\u0010\u0017J\r\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b\u0018\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010 R\u001a\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004R\u001a\u0010\u0006\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003¨\u0006\u0082\u0004R\u001a\u0010\b\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003¨\u0006\u0082\u0004R\u001a\u0010\u0005\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003¨\u0006\u0082\u0004R\u001a\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0003¨\u0006\u0082\u0004R&\u0010\u0002\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\f\"\u0004\b\b\u0010\r¨\u0006\u0086\u000eR#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012¨\u0006\u0086\u0004R&\u0010\u0018\u001a\u00020\u00138\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016\"\u0004\b\u0004\u0010\u0017¨\u0006\u0086\u000eR&\u0010\u0019\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0006\u0010\f\"\u0004\b\u0004\u0010\r¨\u0006\u0086\u000eR&\u0010\u0014\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\b\u0010\f\"\u0004\b\u0006\u0010\r¨\u0006\u0086\u000e"},
   d2 = {"La/Ἠ;", "Ljava/nio/file/Path;", "Ἒⅾ", "Ljava/nio/file/Path;", "ⲋ", "ᴃᎲ", "ĂƂ", "〥ҳⱆ", "u", "", "Đ", "Z", "()Z", "(Z)V", "", "La/ʅ;", "ϛⰄ", "Ljava/util/List;", "()Ljava/util/List;", "", "ⲡ", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "ς", "Ꜥ", "p0", "", "p1", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)La/ʅ;", "()La/ʅ;", "()V", "ᵴἥ", "<init>", ""}
)
public final class Ἠ {
   private static boolean lIIlIlIIIll(Object var0) {
      return var0 == null;
   }

   public final void ς() {
      FilesKt.writeText$default(new File(ᴃᎲ.toString()), ⲡ, (Charset)null, lIIIlIIIII[2], (Object)null);
   }

   private static void lIIlIIllIlI() {
      lIIIIlIIll = new String[lIIIlIIIII[30]];
      lIIIIlIIll[lIIIlIIIII[0]] = lIIlIIIIlll("FfYpBc3ehCw=", "mMmcy");
      lIIIIlIIll[lIIIlIIIII[1]] = lIIlIIIIlll("9pj+44baKEC9+ENpceDFdpLkDckkh2s8XuICFU/p36hMikjcShcrhE4NVlf0JElCfugdgEDbxlI=", "IEHAB");
      lIIIIlIIll[lIIIlIIIII[2]] = lIIlIIIIlll("mK1KbFRIAG8=", "aqLPs");
      lIIIIlIIll[lIIIlIIIII[3]] = lIIlIIIlIll("p/SVdx9prOY=", "ZbDsp");
      lIIIIlIIll[lIIIlIIIII[4]] = lIIlIIIIlll("SFk5mO421L0=", "cjwCB");
      lIIIIlIIll[lIIIlIIIII[5]] = lIIlIIIllIl("Bg0IHxgxTAsaEyweXFE=", "Elfqw");
      lIIIIlIIll[lIIIlIIIII[7]] = lIIlIIIIlll("qk9RnLcYSSs=", "MXpDS");
      lIIIIlIIll[lIIIlIIIII[8]] = lIIlIIIlIll("uGd34xc5k0w=", "HcQCQ");
      lIIIIlIIll[lIIIlIIIII[9]] = lIIlIIIllIl("BR8BOQ==", "DknTH");
      lIIIIlIIll[lIIIlIIIII[10]] = lIIlIIIIlll("udTsvMCteq8=", "EZfBt");
      lIIIIlIIll[lIIIlIIIII[11]] = lIIlIIIIlll("XREGiYVJ0dI=", "cdGcT");
      lIIIIlIIll[lIIIlIIIII[12]] = lIIlIIIllIl("LBsdIRM+HAU9BBgY", "mhdOp");
      lIIIIlIIll[lIIIlIIIII[13]] = lIIlIIIIlll("SSeXdiyHJFw=", "Srjne");
      lIIIIlIIll[lIIIlIIIII[14]] = lIIlIIIIlll("PUuvNlgAPN8=", "RbzGR");
      lIIIIlIIll[lIIIlIIIII[15]] = lIIlIIIIlll("EMFtl6ibI9rTAekDViolZg==", "ZgcqQ");
      lIIIIlIIll[lIIIlIIIII[16]] = lIIlIIIlIll("S0P2DTT4a8E=", "AEHQo");
      lIIIIlIIll[lIIIlIIIII[17]] = lIIlIIIlIll("Cw+ztv6JgFxKNDJvPowdJw==", "aQbaA");
      lIIIIlIIll[lIIIlIIIII[18]] = lIIlIIIIlll("UqZ6tnVqYJo=", "cIiZV");
      lIIIIlIIll[lIIIlIIIII[19]] = lIIlIIIIlll("15/+Go7NM3bGE3jzg+rrnQQmPYEY40NY", "lVWui");
      lIIIIlIIll[lIIIlIIIII[20]] = lIIlIIIlIll("lEw55yiNpbAD6wtuJ9F+L2uPy0q6uurefaqaEr3bLzk=", "AhCvD");
      lIIIIlIIll[lIIIlIIIII[21]] = lIIlIIIlIll("bxn0kn4urzTASk8eKEq5X5NtAG5n50kZ", "vFOhy");
      lIIIIlIIll[lIIIlIIIII[22]] = lIIlIIIllIl("OT8DBgYfKUYFExkmExdIWg==", "zMfgr");
      lIIIIlIIll[lIIIlIIIII[23]] = lIIlIIIlIll("iX7m/qUxKdCUNx1qK/bktg==", "oAapJ");
      lIIIIlIIll[lIIIlIIIII[24]] = lIIlIIIlIll("sr/ZjVQafIk=", "NhgQC");
      lIIIIlIIll[lIIIlIIIII[25]] = lIIlIIIlIll("fdIaLLLNRdzfxcByoxXG4w==", "KMBiC");
      lIIIIlIIll[lIIIlIIIII[26]] = lIIlIIIllIl("LywcOA4iLTE6GSM/ByYOYi0WPg==", "LYnJk");
      lIIIIlIIll[lIIIlIIIII[27]] = lIIlIIIllIl("FyIWATQRK1YNKBk=", "pGxdF");
      lIIIIlIIll[lIIIlIIIII[28]] = lIIlIIIllIl("AwchLjkRFQ==", "afBEL");
      lIIIIlIIll[lIIIlIIIII[29]] = lIIlIIIllIl("FB8/GwccDg==", "pzYzr");
   }

   public final void Ꜥ() {
      ϛⰄ.clear();
      File var1 = new File(u.toString());
      File[] var10000 = var1.listFiles();
      if (lIIlIlIIlII(var10000)) {
         File[] var2 = var10000;
         int var3 = lIIIlIIIII[0];
         File[] lIlIllIlIIIlIIl = var2;
         int lIlIllIlIIIlIII = var2.length;
         int lIlIllIlIIIIlll = lIIIlIIIII[0];

         while(lIIlIlIIlIl(lIlIllIlIIIIlll, lIlIllIlIIIlIII)) {
            int lIlIllIlIIIIllI = lIlIllIlIIIlIIl[lIlIllIlIIIIlll];
            Exception lIlIllIlIIIIlII = lIIIlIIIII[0];
            if (lIIlIlIIIIl(StringsKt.equals(FilesKt.getExtension(lIlIllIlIIIIllI), lIIIIlIIll[lIIIlIIIII[7]], (boolean)lIIIlIIIII[1]))) {
               String lIlIllIlIIIIIll = Ҷ.ⲋ(lIlIllIlIIIIllI.getAbsolutePath());
               ϛⰄ.add(new ʅ(FilesKt.getNameWithoutExtension(lIlIllIlIIIIllI), lIlIllIlIIIIIll));
               "".length();
            }

            ++lIlIllIlIIIIlll;
            "".length();
            if ("   ".length() == ((100 ^ 33) & ~(103 ^ 34))) {
               return;
            }
         }

         "".length();
         if (-(74 ^ 79) >= 0) {
            return;
         }
      } else {
         "".length();
      }

      String lIlIllIlIIIlIll = FilesKt.readText$default(new File(ᴃᎲ.toString()), (Charset)null, lIIIlIIIII[1], (Object)null);
      String lIlIllIlIIIlIlI = (Iterable)ϛⰄ;
      short lIlIllIlIIIlIIl = lIIIlIIIII[0];
      int var17;
      if (lIIlIlIIIIl(lIlIllIlIIIlIlI instanceof Collection) && lIIlIlIIIIl(((Collection)lIlIllIlIIIlIlI).isEmpty())) {
         var17 = lIIIlIIIII[0];
         "".length();
         if (" ".length() < " ".length()) {
            return;
         }
      } else {
         Iterator lIlIllIlIIIlIII = lIlIllIlIIIlIlI.iterator();

         while(true) {
            if (!lIIlIlIIIIl(lIlIllIlIIIlIII.hasNext())) {
               var17 = lIIIlIIIII[0];
               break;
            }

            long lIlIllIlIIIIlll = lIlIllIlIIIlIII.next();
            int lIlIllIlIIIIllI = (ʅ)lIlIllIlIIIIlll;
            short lIlIllIlIIIIlIl = lIIIlIIIII[0];
            if (lIIlIlIIIIl(Intrinsics.areEqual((Object)lIlIllIlIIIIllI.ⲋ(), (Object)lIlIllIlIIIlIll))) {
               var17 = lIIIlIIIII[1];
               "".length();
               if (" ".length() == 0) {
                  return;
               }
               break;
            }
         }
      }

      if (lIIlIlIIIIl(var17)) {
         ⲡ = lIlIllIlIIIlIll;
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      } else {
         ⲡ = lIIIIlIIll[lIIIlIIIII[8]];
      }

   }

   @JvmName(
      name = "ⲋ"
   )
   public final List<ʅ> ⲋ() {
      return ϛⰄ;
   }

   static {
      lIIlIlIIIII();
      lIIlIIllIlI();
      Ἠ var0 = new Ἠ();
      ⲋ = var0;
      String var10000 = System.getProperty(lIIIIlIIll[lIIIlIIIII[23]]).toString();
      String[] var10001 = new String[lIIIlIIIII[1]];
      var10001[lIIIlIIIII[0]] = lIIIIlIIll[lIIIlIIIII[24]];
      ĂƂ = Paths.get(var10000, var10001);
      var10000 = ĂƂ.toString();
      var10001 = new String[lIIIlIIIII[1]];
      var10001[lIIIlIIIII[0]] = lIIIIlIIll[lIIIlIIIII[25]];
      u = Paths.get(var10000, var10001);
      var10000 = ĂƂ.toString();
      var10001 = new String[lIIIlIIIII[1]];
      var10001[lIIIlIIIII[0]] = lIIIIlIIll[lIIIlIIIII[26]];
      ᴃᎲ = Paths.get(var10000, var10001);
      var10000 = ĂƂ.toString();
      var10001 = new String[lIIIlIIIII[1]];
      var10001[lIIIlIIIII[0]] = lIIIIlIIll[lIIIlIIIII[27]];
      〥ҳⱆ = Paths.get(var10000, var10001);
      var10000 = ĂƂ.toString();
      var10001 = new String[lIIIlIIIII[1]];
      var10001[lIIIlIIIII[0]] = lIIIIlIIll[lIIIlIIIII[28]];
      Ἒⅾ = Paths.get(var10000, var10001);
      int var1 = lIIIlIIIII[0];
      ϛⰄ = (List)(new ArrayList());
      ⲡ = lIIIIlIIll[lIIIlIIIII[29]];
      Đ = (boolean)lIIIlIIIII[1];
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull String var1) {
      ⲡ = var1;
   }

   private final void ⲋ(String var1, String lIlIllIlIlIIIII) {
      File var3 = new File(var1);
      if (lIIlIlIIIlI(var3.exists())) {
         Charset var5 = Charsets.UTF_8;
         int lIlIllIlIIlllII = lIIIlIIIII[6];
         int var7 = lIIIlIIIII[0];
         int var9 = lIIIlIIIII[0];
         int var11 = lIIIlIIIII[0];
         OutputStream var10 = (OutputStream)(new FileOutputStream(var3));
         var11 = lIIIlIIIII[0];
         Writer lIlIllIlIIllIlI = (Writer)(new OutputStreamWriter(var10, var5));
         var9 = lIIIlIIIII[0];
         BufferedWriter var10000;
         if (lIIlIlIIIIl(lIlIllIlIIllIlI instanceof BufferedWriter)) {
            var10000 = (BufferedWriter)lIlIllIlIIllIlI;
            "".length();
            if (((164 ^ 148) & ~(35 ^ 19)) != 0) {
               return;
            }
         } else {
            var10000 = new BufferedWriter(lIlIllIlIIllIlI, lIlIllIlIIlllII);
         }

         Exception lIlIllIlIIllllI = (Closeable)var10000;
         boolean lIlIllIlIIlllIl = lIIIlIIIII[0];
         Throwable lIlIllIlIIlllII = (Throwable)null;

         try {
            float lIlIllIlIIllIll = (BufferedWriter)lIlIllIlIIllllI;
            Exception lIlIllIlIIllIlI = lIIIlIIIII[0];
            lIlIllIlIIllIll.write(lIlIllIlIlIIIII);
            Unit var19 = Unit.INSTANCE;
         } catch (Throwable var14) {
            lIlIllIlIIlllII = var14;
            throw var14;
         } finally {
            CloseableKt.closeFinally(lIlIllIlIIllllI, lIlIllIlIIlllII);
         }

         "".length();
         if (null != null) {
            return;
         }
      }

   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return ς;
   }

   private static String lIIlIIIllIl(String lIlIllIIllIIllI, String lIlIllIIllIIlIl) {
      lIlIllIIllIIllI = new String(Base64.getDecoder().decode(lIlIllIIllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      double lIlIllIIlIlllll = new StringBuilder();
      float lIlIllIIlIllllI = lIlIllIIllIIlIl.toCharArray();
      Exception lIlIllIIlIlllIl = lIIIlIIIII[0];
      short lIlIllIIlIlllII = lIlIllIIllIIllI.toCharArray();
      String lIlIllIIlIllIll = lIlIllIIlIlllII.length;
      int lIlIllIIlIllIlI = lIIIlIIIII[0];

      do {
         if (!lIIlIlIIlIl(lIlIllIIlIllIlI, lIlIllIIlIllIll)) {
            return String.valueOf(lIlIllIIlIlllll);
         }

         char lIlIllIIllIIlll = lIlIllIIlIlllII[lIlIllIIlIllIlI];
         lIlIllIIlIlllll.append((char)(lIlIllIIllIIlll ^ lIlIllIIlIllllI[lIlIllIIlIlllIl % lIlIllIIlIllllI.length]));
         "".length();
         ++lIlIllIIlIlllIl;
         ++lIlIllIIlIllIlI;
         "".length();
      } while("  ".length() != 0);

      return null;
   }

   private static boolean lIIlIlIIIIl(int var0) {
      return var0 != 0;
   }

   public final void ᴃᎲ(@NotNull String var1) {
      if (lIIlIlIIIIl(Ꜥ)) {
         Map var2 = ơ߀.ⲋ.Ꜥ();
         String var10000 = u.toString();
         String[] var10001 = new String[lIIIlIIIII[1]];
         var10001[lIIIlIIIII[0]] = String.valueOf((new StringBuilder()).append(var1).append(lIIIIlIIll[lIIIlIIIII[4]]));
         Ҷ.ⲋ(Paths.get(var10000, var10001).toString(), var2);
         this.ᵴἥ();
      }

   }

   private static boolean lIIlIlIIlII(Object var0) {
      return var0 != null;
   }

   private static boolean lIIlIlIIIlI(int var0) {
      return var0 == 0;
   }

   public final boolean ⲡ() {
      String var1 = (new SimpleDateFormat(lIIIIlIIll[lIIIlIIIII[17]])).format(new Date());
      String var10000 = Ἒⅾ.toString();
      String[] var10001 = new String[lIIIlIIIII[1]];
      var10001[lIIIlIIIII[0]] = String.valueOf((new StringBuilder()).append(var1).append(lIIIIlIIll[lIIIlIIIII[18]]));
      String lIlIllIIlllIIll = Paths.get(var10000, var10001).toString();
      boolean var8 = false;

      label44: {
         int lIlIllIIlllIIIl;
         try {
            var8 = true;
            Ꙭ.ⲋ.ⲋ(u.toString(), lIlIllIIlllIIll);
            var8 = false;
            break label44;
         } catch (Exception var9) {
            a.〥ҳⱆ.〥ҳⱆ.ⲋ().error(String.valueOf((new StringBuilder()).append(lIIIIlIIll[lIIIlIIIII[20]]).append(var9.getMessage())));
            lIlIllIIlllIIIl = lIIIlIIIII[0];
            var8 = false;
         } finally {
            if (var8) {
               a.〥ҳⱆ.〥ҳⱆ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIIlIIll[lIIIlIIIII[22]]).append(lIlIllIIlllIIll)));
            }
         }

         a.〥ҳⱆ.〥ҳⱆ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIIlIIll[lIIIlIIIII[21]]).append(lIlIllIIlllIIll)));
         return (boolean)lIlIllIIlllIIIl;
      }

      a.〥ҳⱆ.〥ҳⱆ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIIlIIll[lIIIlIIIII[19]]).append(lIlIllIIlllIIll)));
      "".length();
      return (boolean)("   ".length() == " ".length() ? "   ".length() & ("   ".length() ^ -" ".length()) : lIIIlIIIII[1]);
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final boolean 〥ҳⱆ() {
      return Đ;
   }

   private static boolean lIIlIlIIlIl(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      ς = var1;
   }

   private static void lIIlIlIIIII() {
      lIIIlIIIII = new int[31];
      lIIIlIIIII[0] = (4 + 50 - -51 + 36 ^ 105 + 132 - 206 + 138) & (88 + 151 - 130 + 54 ^ 61 + 39 - 63 + 98 ^ -" ".length());
      lIIIlIIIII[1] = " ".length();
      lIIIlIIIII[2] = "  ".length();
      lIIIlIIIII[3] = "   ".length();
      lIIIlIIIII[4] = 191 ^ 187;
      lIIIlIIIII[5] = 243 ^ 149 ^ 106 ^ 9;
      lIIIlIIIII[6] = -20285 & 28476;
      lIIIlIIIII[7] = 88 ^ 93 ^ "   ".length();
      lIIIlIIIII[8] = 79 ^ 49 ^ 106 ^ 19;
      lIIIlIIIII[9] = 59 ^ 49 ^ "  ".length();
      lIIIlIIIII[10] = 150 ^ 152 ^ 151 ^ 144;
      lIIIlIIIII[11] = 77 ^ 71;
      lIIIlIIIII[12] = 203 ^ 192;
      lIIIlIIIII[13] = 31 ^ 32 ^ 52 ^ 7;
      lIIIlIIIII[14] = 44 ^ 33;
      lIIIlIIIII[15] = 126 ^ 112;
      lIIIlIIIII[16] = 48 ^ 63;
      lIIIlIIIII[17] = 95 ^ 76 ^ "   ".length();
      lIIIlIIIII[18] = 164 ^ 135 ^ 141 ^ 191;
      lIIIlIIIII[19] = 94 ^ 76;
      lIIIlIIIII[20] = 181 ^ 166;
      lIIIlIIIII[21] = 188 ^ 168;
      lIIIlIIIII[22] = 150 ^ 131;
      lIIIlIIIII[23] = 0 ^ 22;
      lIIIlIIIII[24] = 35 ^ 126 ^ 199 ^ 141;
      lIIIlIIIII[25] = 103 ^ 127;
      lIIIlIIIII[26] = 172 + 73 - 53 + 26 ^ 20 + 34 - 1 + 142;
      lIIIlIIIII[27] = 87 ^ 64 ^ 112 ^ 125;
      lIIIlIIIII[28] = 4 + 7 - -131 + 80 ^ 154 + 3 - -37 + 3;
      lIIIlIIIII[29] = 155 + 175 - 232 + 78 ^ 24 + 151 - 77 + 74;
      lIIIlIIIII[30] = 94 ^ 90 ^ 72 ^ 81;
   }

   public final void ϛⰄ() {
      int var10000;
      if (lIIlIlIIIlI((new File(ĂƂ.toString())).exists())) {
         var10000 = lIIIlIIIII[1];
         "".length();
         if ((98 + 105 - 148 + 74 ^ 17 + 120 - 90 + 86) < " ".length()) {
            return;
         }
      } else {
         var10000 = lIIIlIIIII[0];
      }

      ς = (boolean)var10000;
      lIlIllIllIIlIlI.〥ҳⱆ(ĂƂ.toString());
      lIlIllIllIIlIlI.〥ҳⱆ(u.toString());
      lIlIllIllIIlIlI.〥ҳⱆ(Ἒⅾ.toString());
      lIlIllIllIIlIlI.ⲋ(ᴃᎲ.toString(), lIIIIlIIll[lIIIlIIIII[0]]);
      lIlIllIllIIlIlI.ⲋ(〥ҳⱆ.toString(), lIIIIlIIll[lIIIlIIIII[1]]);
      lIlIllIllIIlIlI.Ꜥ();
      lIlIllIllIIlIlI.Đ();
      byte lIlIllIllIIlIIl = (Iterable)ϛⰄ;
      boolean lIlIllIllIIlIII = lIIIlIIIII[0];
      double lIlIllIllIIIllI = lIIIlIIIII[0];
      Iterator lIlIllIllIIIlIl = lIlIllIllIIlIIl.iterator();

      Object var17;
      while(true) {
         if (lIIlIlIIIIl(lIlIllIllIIIlIl.hasNext())) {
            int lIlIllIllIIIlII = lIlIllIllIIIlIl.next();
            short lIlIllIllIIIIll = (ʅ)lIlIllIllIIIlII;
            byte lIlIllIllIIIIlI = lIIIlIIIII[0];
            if (!lIIlIlIIIIl(Intrinsics.areEqual((Object)lIlIllIllIIIIll.ⲋ(), (Object)lIIIIlIIll[lIIIlIIIII[2]]))) {
               continue;
            }

            var17 = lIlIllIllIIIlII;
            "".length();
            if ("  ".length() < 0) {
               return;
            }
            break;
         }

         var17 = null;
         break;
      }

      if (lIIlIlIIIll(var17)) {
         double lIlIllIllIIIIII = lIIIIlIIll[lIIIlIIIII[3]];
         Exception lIlIllIllIIIIIl = ϛⰄ;
         byte lIlIllIllIIlIIl = lIIIlIIIII[0];
         int lIlIllIlIllllll = new HashMap();
         float lIlIllIlIlllllI = (Map)lIlIllIlIllllll;
         lIlIllIllIIIIIl.add(new ʅ(lIlIllIllIIIIII, lIlIllIlIlllllI));
         "".length();
      }

      lIlIllIllIIlIlI.ⲡ();
      "".length();
      Ꜥ = (boolean)lIIIlIIIII[1];
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final String ᴃᎲ() {
      return ⲡ;
   }

   private Ἠ() {
   }

   private final void Đ() {
      Map var1 = Ҷ.ⲋ(〥ҳⱆ.toString());
      Map lIlIllIIlllllII = (Map)var1.get(lIIIIlIIll[lIIIlIIIII[9]]);
      if (lIIlIlIIlII(lIlIllIIlllllII)) {
         Object lIlIllIIllllIll = lIlIllIIlllllII.get(lIIIIlIIll[lIIIlIIIII[10]]);
         if (lIIlIlIIIIl(lIlIllIIllllIll instanceof String)) {
            CharSequence var4 = (CharSequence)lIlIllIIllllIll;
            int var5 = lIIIlIIIII[0];
            int var10000;
            if (lIIlIlIIIlI(StringsKt.isBlank(var4))) {
               var10000 = lIIIlIIIII[1];
               "".length();
               if (((115 ^ 65) & ~(136 ^ 186)) >= "  ".length()) {
                  return;
               }
            } else {
               var10000 = lIIIlIIIII[0];
            }

            if (lIIlIlIIIIl(var10000)) {
               a.ϛⰄ.ⲋ.ⲋ((String)lIlIllIIllllIll);
            }
         }

         String lIlIllIIllllIlI = lIlIllIIlllllII.get(lIIIIlIIll[lIIIlIIIII[11]]);
         if (lIIlIlIIIIl(lIlIllIIllllIlI instanceof Double)) {
            ⱉȬ.ᴃᎲ.ⲋ(((Number)lIlIllIIllllIlI).doubleValue());
         }

         float lIlIllIIllllIIl = lIlIllIIlllllII.get(lIIIIlIIll[lIIIlIIIII[12]]);
         if (lIIlIlIIIIl(lIlIllIIllllIIl instanceof Boolean)) {
            Đ = (Boolean)lIlIllIIllllIIl;
         }
      }

   }

   private static String lIIlIIIIlll(String lIlIllIIlIlIIIl, String lIlIllIIlIlIIII) {
      try {
         SecretKeySpec lIlIllIIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIlIllIIlIlIIll = Cipher.getInstance("Blowfish");
         lIlIllIIlIlIIll.init(lIIIlIIIII[2], lIlIllIIlIlIlII);
         return new String(lIlIllIIlIlIIll.doFinal(Base64.getDecoder().decode(lIlIllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      Ꜥ = var1;
   }

   @Nullable
   public final ʅ u(@NotNull String lIlIllIlllIIIIl) {
      Iterable var2 = (Iterable)ϛⰄ;
      int var3 = lIIIlIIIII[0];
      int var5 = lIIIlIIIII[0];
      Iterator lIlIllIllIlllII = var2.iterator();

      Object var10000;
      while(true) {
         if (lIIlIlIIIIl(lIlIllIllIlllII.hasNext())) {
            long lIlIllIllIllIll = lIlIllIllIlllII.next();
            char lIlIllIllIllIlI = (ʅ)lIlIllIllIllIll;
            float lIlIllIllIllIIl = lIIIlIIIII[0];
            if (!lIIlIlIIIIl(StringsKt.equals(lIlIllIllIllIlI.ⲋ(), lIlIllIlllIIIIl, (boolean)lIIIlIIIII[1]))) {
               continue;
            }

            var10000 = lIlIllIllIllIll;
            "".length();
            if (-"  ".length() > 0) {
               return null;
            }
            break;
         }

         var10000 = null;
         break;
      }

      return (ʅ)var10000;
   }

   private final void ᵴἥ() {
      Pair[] var10000 = new Pair[lIIIlIIIII[3]];
      var10000[lIIIlIIIII[0]] = TuplesKt.to(lIIIIlIIll[lIIIlIIIII[13]], a.ϛⰄ.ⲋ.u());
      var10000[lIIIlIIIII[1]] = TuplesKt.to(lIIIIlIIll[lIIIlIIIII[14]], ⱉȬ.ᴃᎲ.ƶ());
      var10000[lIIIlIIIII[2]] = TuplesKt.to(lIIIIlIIll[lIIIlIIIII[15]], Đ);
      HashMap var1 = MapsKt.hashMapOf(var10000);
      String var2 = 〥ҳⱆ.toString();
      Pair[] var10001 = new Pair[lIIIlIIIII[1]];
      var10001[lIIIlIIIII[0]] = TuplesKt.to(lIIIIlIIll[lIIIlIIIII[16]], var1);
      Ҷ.ⲋ(var2, (Map)MapsKt.hashMapOf(var10001));
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      Đ = var1;
   }

   private static String lIIlIIIlIll(String lIlIllIIlIIIlII, String lIlIllIIlIIIIll) {
      try {
         SecretKeySpec lIlIllIIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIIII[9]), "DES");
         String lIlIllIIIllllll = Cipher.getInstance("DES");
         lIlIllIIIllllll.init(lIIIlIIIII[2], lIlIllIIlIIIlll);
         return new String(lIlIllIIIllllll.doFinal(Base64.getDecoder().decode(lIlIllIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @NotNull
   public final ʅ ĂƂ(@NotNull String var1) {
      int var3 = lIIIlIIIII[0];
      HashMap var7 = new HashMap();
      Map var8 = (Map)var7;
      ʅ var2 = new ʅ(var1, var8);
      ϛⰄ.add(var2);
      "".length();
      return var2;
   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return Ꜥ;
   }

   @Nullable
   public final ʅ Ἒⅾ() {
      return this.u(ⲡ);
   }

   private final void 〥ҳⱆ(String var1) {
      File var2 = new File(var1);
      var2.mkdir();
      "".length();
      if (lIIlIlIIIlI(var2.exists())) {
         throw (Throwable)(new IOException(String.valueOf((new StringBuilder()).append(lIIIIlIIll[lIIIlIIIII[5]]).append(ĂƂ))));
      }
   }
}
