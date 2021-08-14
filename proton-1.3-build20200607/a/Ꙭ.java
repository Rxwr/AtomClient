package a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\n"},
   d2 = {"La/Ꙭ;", "", "p0", "p1", "", "ⲋ", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/zip/ZipOutputStream;", "Ljava/io/File;", "p2", "(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;)V", "<init>", "()V", ""}
)
public final class Ꙭ {
   static {
      lIIllIlII();
      lIIllIIll();
      Ꙭ var0 = new Ꙭ();
      ⲋ = var0;
   }

   private static String lIIllIIlI(String lllIlIIlllIllII, String lllIlIIlllIlIll) {
      try {
         SecretKeySpec lllIlIIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIlllIlIll.getBytes(StandardCharsets.UTF_8)), lIIIllII[6]), "DES");
         Cipher lllIlIIlllIlllI = Cipher.getInstance("DES");
         lllIlIIlllIlllI.init(lIIIllII[3], lllIlIIlllIllll);
         return new String(lllIlIIlllIlllI.doFinal(Base64.getDecoder().decode(lllIlIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllIIl(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIIlllIII(int var0) {
      return var0 != 0;
   }

   public final void ⲋ(@NotNull String var1, @NotNull String var2) {
      File lllIlIlIIlIIlll = new File(var1);
      Closeable lllIlIlIIlIIllI = (Closeable)(new ZipOutputStream((OutputStream)(new BufferedOutputStream((OutputStream)(new FileOutputStream(var2))))));
      int var5 = lIIIllII[0];
      Throwable lllIlIlIIlIIlII = (Throwable)null;

      try {
         short lllIlIlIIlIIIll = (ZipOutputStream)lllIlIlIIlIIllI;
         int lllIlIlIIlIIIlI = lIIIllII[0];
         ⲋ.ⲋ(lllIlIlIIlIIIll, lllIlIlIIlIIlll, lIIIlIll[lIIIllII[0]]);
         Unit var13 = Unit.INSTANCE;
      } catch (Throwable var11) {
         lllIlIlIIlIIlII = var11;
         throw var11;
      } finally {
         CloseableKt.closeFinally(lllIlIlIIlIIllI, lllIlIlIIlIIlII);
      }

      "".length();
      if (-"  ".length() <= 0) {
         ;
      }
   }

   private final void ⲋ(ZipOutputStream lllIlIlIIIIlIlI, File var2, String lllIlIlIIIIlIII) {
      byte[] lllIlIlIIIIIlll = new byte[lIIIllII[1]];
      File[] var10000 = var2.listFiles();
      if (!lIIllIlIl(var10000)) {
         "".length();
      } else {
         File[] var5 = var10000;
         int lllIlIlIIIIIlIl = lIIIllII[0];
         Collection lllIlIlIIIIIIll = (Collection)(new ArrayList());
         int var9 = lIIIllII[0];
         File[] lllIlIlIIIIIIIl = var5;
         int lllIlIlIIIIIIII = var5.length;
         int lllIlIIllllllll = lIIIllII[0];

         do {
            int lllIlIIllllllII;
            if (!lIIllIllI(lllIlIIllllllll, lllIlIlIIIIIIII)) {
               float lllIlIlIIIIIllI = (Iterable)((List)lllIlIlIIIIIIll);
               lllIlIlIIIIIlIl = lIIIllII[0];
               Iterator lllIlIlIIIIIlII = lllIlIlIIIIIllI.iterator();

               do {
                  if (!lIIlllIII(lllIlIlIIIIIlII.hasNext())) {
                     "".length();
                     if (((99 ^ 40) & ~(5 ^ 78)) != 0) {
                        return;
                     }

                     return;
                  }

                  short lllIlIlIIIIIIll = lllIlIlIIIIIlII.next();
                  long lllIlIlIIIIIIlI = (File)lllIlIlIIIIIIll;
                  char lllIlIlIIIIIIIl = lIIIllII[0];
                  if (lIIlllIII(lllIlIlIIIIIIlI.isDirectory())) {
                     String var46;
                     if (lIIlllIII(Intrinsics.areEqual((Object)lllIlIlIIIIlIII, (Object)lIIIlIll[lIIIllII[3]]))) {
                        var46 = lllIlIlIIIIIIlI.getName();
                        "".length();
                        if ("  ".length() < "  ".length()) {
                           return;
                        }
                     } else {
                        var46 = String.valueOf((new StringBuilder()).append(lllIlIlIIIIlIII).append(File.separator).append(lllIlIlIIIIIIlI.getName()));
                     }

                     short lllIlIlIIIIIIII = var46;
                     double lllIlIIllllllll = new ZipEntry(String.valueOf((new StringBuilder()).append(lllIlIlIIIIIIII).append(File.separator)));
                     lllIlIIllllllll.setTime(lllIlIlIIIIIIlI.lastModified());
                     lllIlIIllllllll.isDirectory();
                     "".length();
                     lllIlIIllllllll.setSize(lllIlIlIIIIIIlI.length());
                     lllIlIlIIIIlIlI.putNextEntry(lllIlIIllllllll);
                     ⲋ.ⲋ(lllIlIlIIIIlIlI, lllIlIlIIIIIIlI, lllIlIlIIIIIIII);
                     "".length();
                     if (-(169 ^ 193 ^ 17 ^ 125) >= 0) {
                        return;
                     }
                  } else {
                     short lllIlIlIIIIIIII = (Closeable)(new FileInputStream(lllIlIlIIIIIIlI));
                     lllIlIIllllllll = lIIIllII[0];
                     Throwable lllIlIIlllllllI = (Throwable)null;

                     try {
                        long lllIlIIllllllIl = (FileInputStream)lllIlIlIIIIIIII;
                        lllIlIIllllllII = lIIIllII[0];
                        String lllIlIIlllllIll = (Closeable)(new BufferedInputStream((InputStream)lllIlIIllllllIl));
                        float lllIlIIlllllIlI = lIIIllII[0];
                        Throwable lllIlIIlllllIIl = (Throwable)null;

                        try {
                           byte lllIlIIlllllIII = (BufferedInputStream)lllIlIIlllllIll;
                           String lllIlIIllllIlll = lIIIllII[0];
                           int lllIlIIllllIllI = String.valueOf((new StringBuilder()).append(lllIlIlIIIIlIII).append(File.separator).append(lllIlIlIIIIIIlI.getName()));
                           float lllIlIIllllIlIl = new ZipEntry(lllIlIIllllIllI);
                           lllIlIIllllIlIl.setTime(lllIlIlIIIIIIlI.lastModified());
                           lllIlIIllllIlIl.isDirectory();
                           "".length();
                           lllIlIIllllIlIl.setSize(lllIlIlIIIIIIlI.length());
                           lllIlIlIIIIlIlI.putNextEntry(lllIlIIllllIlIl);

                           while(true) {
                              String lllIlIIllllIlII = lllIlIIlllllIII.read(lllIlIlIIIIIlll);
                              if (lIIlllIIl(lllIlIIllllIlII, lIIIllII[4])) {
                                 "".length();
                                 if (-" ".length() > "   ".length()) {
                                    return;
                                 }

                                 Unit var47 = Unit.INSTANCE;
                                 break;
                              }

                              lllIlIlIIIIlIlI.write(lllIlIlIIIIIlll, lIIIllII[0], lllIlIIllllIlII);
                              "".length();
                              if ("   ".length() <= ((197 ^ 176 ^ 243 ^ 167) & (63 ^ 86 ^ 74 ^ 2 ^ -" ".length()))) {
                                 return;
                              }
                           }
                        } catch (Throwable var32) {
                           lllIlIIlllllIIl = var32;
                           throw var32;
                        } finally {
                           CloseableKt.closeFinally(lllIlIIlllllIll, lllIlIIlllllIIl);
                        }

                        "".length();
                        if ("   ".length() < 0) {
                           return;
                        }

                        Unit var44 = Unit.INSTANCE;
                     } catch (Throwable var34) {
                        lllIlIIlllllllI = var34;
                        throw var34;
                     } finally {
                        CloseableKt.closeFinally(lllIlIlIIIIIIII, lllIlIIlllllllI);
                     }

                     "".length();
                     if (((26 ^ 58) & ~(142 ^ 174)) >= " ".length()) {
                        return;
                     }
                  }

                  "".length();
               } while(null == null);

               return;
            }

            short lllIlIIlllllllI = lllIlIlIIIIIIIl[lllIlIIllllllll];
            lllIlIIllllllII = lIIIllII[0];
            int var45;
            if (lIIllIlll(lllIlIIlllllllI.isDirectory()) && !lIIlllIII(StringsKt.endsWith$default(lllIlIIlllllllI.getPath(), lIIIlIll[lIIIllII[2]], (boolean)lIIIllII[0], lIIIllII[3], (Object)null))) {
               var45 = lIIIllII[0];
            } else {
               var45 = lIIIllII[2];
               "".length();
               if ("   ".length() < "  ".length()) {
                  return;
               }
            }

            if (lIIlllIII(var45)) {
               lllIlIlIIIIIIll.add(lllIlIIlllllllI);
               "".length();
            }

            ++lllIlIIllllllll;
            "".length();
         } while(null == null);

      }
   }

   private static boolean lIIllIlIl(Object var0) {
      return var0 != null;
   }

   private static String lIIllIIIl(String lllIlIIllIlllIl, String lllIlIIllIlllII) {
      try {
         SecretKeySpec lllIlIIlllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         float lllIlIIllIllIlI = Cipher.getInstance("Blowfish");
         lllIlIIllIllIlI.init(lIIIllII[3], lllIlIIlllIIIlI);
         return new String(lllIlIIllIllIlI.doFinal(Base64.getDecoder().decode(lllIlIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private Ꙭ() {
   }

   private static boolean lIIllIlll(int var0) {
      return var0 == 0;
   }

   private static boolean lIIllIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIIllIlII() {
      lIIIllII = new int[7];
      lIIIllII[0] = (3 ^ 51 ^ 36 ^ 62) & (108 ^ 6 ^ 214 ^ 150 ^ -" ".length());
      lIIIllII[1] = -25175 & 27222;
      lIIIllII[2] = " ".length();
      lIIIllII[3] = "  ".length();
      lIIIllII[4] = -" ".length();
      lIIIllII[5] = "   ".length();
      lIIIllII[6] = 24 + 69 - 21 + 89 ^ 35 + 46 - -12 + 76;
   }

   private static void lIIllIIll() {
      lIIIlIll = new String[lIIIllII[5]];
      lIIIlIll[lIIIllII[0]] = lIIllIIIl("deoARbvyEHGgOrFIuKIXpg==", "nmPGU");
      lIIIlIll[lIIIllII[2]] = lIIllIIlI("+tqGmabq9qk=", "YDtgV");
      lIIIlIll[lIIIllII[3]] = lIIllIIIl("PeQ97gflUyg=", "mXJNZ");
   }
}
