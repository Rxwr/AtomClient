package a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020#:\u0001\u0002B\t\b\u0002¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u000e\u001a\u00020\u001c¢\u0006\u0004\b\u000e\u0010\u001eJ\r\u0010\u0017\u001a\u00020\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010 J\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001eJ\r\u0010\u0013\u001a\u00020\u001c¢\u0006\u0004\b\u0013\u0010\u001eJ\u0015\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0086TR\u001a\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0086TR(\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u0002\u0010\u000b¨\u0006\u0086\u000eR&\u0010\b\u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\u0004\b\u0002\u0010\u0011¨\u0006\u0086\u000eR&\u0010\u0017\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\b\u0010\u0015\"\u0004\b\u0002\u0010\u0016¨\u0006\u0086\u000eR9\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0018j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\u00198\u0007@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b¨\u0006\u0086\u0004"},
   d2 = {"La/ᴃᎲ;", "", "ⲋ", "I", "", "ĂƂ", "Ljava/lang/String;", "La/ᴃᎲ$ⲋ;", "ᴃᎲ", "La/ᴃᎲ$ⲋ;", "()La/ᴃᎲ$ⲋ;", "(La/ᴃᎲ$ⲋ;)V", "u", "", "Ἒⅾ", "Z", "()Z", "(Z)V", "", "ϛⰄ", "J", "()J", "(J)V", "〥ҳⱆ", "Ljava/util/HashMap;", "Lkotlin/collections/ĂƂ;", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "", "ς", "()V", "p0", "(Ljava/lang/String;)V", "Ꜥ", "<init>", ""}
)
public final class ᴃᎲ {
   public final void ĂƂ(@NotNull String lIlllIIIlIIlllI) {
      if (!lIIIIIIlllI(Ἒⅾ)) {
         short lIlllIIIlIIllIl = (ᴃᎲ.ⲋ)〥ҳⱆ.get(lIlllIIIlIIlllI);
         if (lIIIIIIllll(lIlllIIIlIIllIl)) {
            char lIlllIIIlIIllII = System.currentTimeMillis() - lIlllIIIlIIllIl.ᴃᎲ();
            boolean lIlllIIIlIIlIll = (Collection)lIlllIIIlIIllIl.u();
            int lIlllIIIlIIlIlI = llllIIIII[1];
            if (lIIIIIlIIII(lIlllIIIlIIlIll.size(), llllIIIII[3])) {
               lIlllIIIlIIllIl.u().remove(llllIIIII[1]);
               "".length();
               lIlllIIIlIIllIl.u().add(llllIIIII[1], lIlllIIIlIIllII);
               lIlllIIIlIIllIl.u().clear();
               "".length();
               if (-(10 ^ 46 ^ 167 ^ 134) >= 0) {
                  return;
               }
            } else {
               lIlllIIIlIIllIl.u().add(lIlllIIIlIIllII);
               "".length();
            }

            ᴃᎲ = lIlllIIIlIIllIl.〥ҳⱆ();
         }

      }
   }

   private ᴃᎲ() {
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final HashMap<String, ᴃᎲ.ⲋ> ĂƂ() {
      return 〥ҳⱆ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(long var1) {
      ϛⰄ = var1;
   }

   private static boolean lIIIIIIlllI(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final long ᴃᎲ() {
      return ϛⰄ;
   }

   public final void ⲋ(@NotNull String lIlllIIIlIlIlIl) {
      if (!lIIIIIIlllI(Ἒⅾ)) {
         if (lIIIIIIlllI(〥ҳⱆ.containsKey(lIlllIIIlIlIlIl))) {
            ((Map)〥ҳⱆ).put(lIlllIIIlIlIlIl, new ᴃᎲ.ⲋ((List)null, 0L, (ᴃᎲ.ⲋ)null, llllIIIII[2], (DefaultConstructorMarker)null));
            "".length();
         }

         byte lIlllIIIlIlIlII = (ᴃᎲ.ⲋ)〥ҳⱆ.get(lIlllIIIlIlIlIl);
         if (lIIIIIIllll(lIlllIIIlIlIlII)) {
            lIlllIIIlIlIlII.ⲋ(System.currentTimeMillis());
            "".length();
            if (((22 ^ 5 ^ 154 ^ 181) & (145 + 19 - 43 + 26 ^ 88 + 133 - 160 + 114 ^ -" ".length())) != 0) {
               return;
            }
         } else {
            "".length();
         }

         if (lIIIIIIllll(lIlllIIIlIlIlII)) {
            lIlllIIIlIlIlII.ⲋ(ᴃᎲ);
            ᴃᎲ = lIlllIIIlIlIlII;
         }

      }
   }

   public final void ς() {
      ϛⰄ = System.currentTimeMillis();
   }

   private static void lIIIIIIllIl() {
      llllIIIII = new int[8];
      llllIIIII[0] = " ".length();
      llllIIIII[1] = (220 ^ 148) & ~(40 ^ 96);
      llllIIIII[2] = 104 + 165 - 97 + 17 ^ 129 + 139 - 178 + 96;
      llllIIIII[3] = -25618 & 26617;
      llllIIIII[4] = -(-2065 & 23935) & -1 & 30062;
      llllIIIII[5] = "  ".length();
      llllIIIII[6] = "   ".length();
      llllIIIII[7] = 85 ^ 81;
   }

   public final void Ἒⅾ() {
      Ἒⅾ = (boolean)llllIIIII[1];
   }

   private static String lIIIIIIlIIl(String lIlllIIIIIlIIll, String lIlllIIIIIlIlll) {
      lIlllIIIIIlIIll = new String(Base64.getDecoder().decode(lIlllIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlllIIIIIlIllI = new StringBuilder();
      short lIlllIIIIIlIIII = lIlllIIIIIlIlll.toCharArray();
      int lIlllIIIIIlIlII = llllIIIII[1];
      double lIlllIIIIIIlllI = lIlllIIIIIlIIll.toCharArray();
      char lIlllIIIIIIllIl = lIlllIIIIIIlllI.length;
      int lIlllIIIIIIllII = llllIIIII[1];

      do {
         if (!lIIIIIlIlII(lIlllIIIIIIllII, lIlllIIIIIIllIl)) {
            return String.valueOf(lIlllIIIIIlIllI);
         }

         long lIlllIIIIIIlIll = lIlllIIIIIIlllI[lIlllIIIIIIllII];
         lIlllIIIIIlIllI.append((char)(lIlllIIIIIIlIll ^ lIlllIIIIIlIIII[lIlllIIIIIlIlII % lIlllIIIIIlIIII.length]));
         "".length();
         ++lIlllIIIIIlIlII;
         ++lIlllIIIIIIllII;
         "".length();
      } while((46 ^ 43) > 0);

      return null;
   }

   public final void Ꜥ() {
   }

   public final void 〥ҳⱆ() {
      Ἒⅾ = (boolean)llllIIIII[0];
      〥ҳⱆ.clear();
   }

   private static boolean lIIIIIIllll(Object var0) {
      return var0 != null;
   }

   private static void lIIIIIIlIlI() {
      lllIlllII = new String[llllIIIII[7]];
      lllIlllII[llllIIIII[1]] = lIIIIIIIllI("Wp7QfaUKPCKJp6tE2vwotA==", "GwFfY");
      lllIlllII[llllIIIII[0]] = lIIIIIIIllI("etDfftmRkV0=", "eeDdW");
      lllIlllII[llllIIIII[5]] = lIIIIIIlIIl("XBQQKmY=", "UgeGF");
      lllIlllII[llllIIIII[6]] = lIIIIIIlIIl("KggDNhk2Hx5+BCIO", "ZzlPp");
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ᴃᎲ.ⲋ ⲋ() {
      return ᴃᎲ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      Ἒⅾ = var1;
   }

   private static boolean lIIIIIlIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIIIIlIIll(int var0) {
      return var0 != 0;
   }

   public final void ϛⰄ() {
      File var1 = new File(lllIlllII[llllIIIII[1]]);
      Charset var3 = Charsets.UTF_8;
      int var4 = llllIIIII[1];
      int lIlllIIIIllIlll = llllIIIII[4];
      int var7 = llllIIIII[1];
      int var9 = llllIIIII[1];
      int var11 = llllIIIII[1];
      OutputStream var10 = (OutputStream)(new FileOutputStream(var1));
      var11 = llllIIIII[1];
      Writer lIlllIIIIllIlIl = (Writer)(new OutputStreamWriter(var10, var3));
      var9 = llllIIIII[1];
      BufferedWriter var10000;
      if (lIIIIIlIIll(lIlllIIIIllIlIl instanceof BufferedWriter)) {
         var10000 = (BufferedWriter)lIlllIIIIllIlIl;
         "".length();
         if ("  ".length() > "   ".length()) {
            return;
         }
      } else {
         var10000 = new BufferedWriter(lIlllIIIIllIlIl, lIlllIIIIllIlll);
      }

      double lIlllIIIIllIIIl = var10000;
      int lIlllIIIIllIIII = (Writer)lIlllIIIIllIIIl;
      Exception lIlllIIIIlllIll = (Closeable)(new PrintWriter(lIlllIIIIllIIII));
      Exception lIlllIIIIlllIlI = llllIIIII[1];
      Throwable lIlllIIIIlllIIl = (Throwable)null;

      try {
         int lIlllIIIIlllIII = (PrintWriter)lIlllIIIIlllIll;
         lIlllIIIIllIlll = llllIIIII[1];
         float lIlllIIIIllIllI = (Iterable)MapsKt.toList((Map)〥ҳⱆ);
         double lIlllIIIIllIlIl = llllIIIII[1];
         float lIlllIIIIllIIll = llllIIIII[1];
         short lIlllIIIIllIIlI = (Comparator)(new ᴃᎲ$1());
         lIlllIIIIllIllI = (Iterable)CollectionsKt.sortedWith(lIlllIIIIllIllI, lIlllIIIIllIIlI);
         lIlllIIIIllIlIl = llllIIIII[1];
         Iterator lIlllIIIIllIlII = lIlllIIIIllIllI.iterator();

         while(lIIIIIlIIll(lIlllIIIIllIlII.hasNext())) {
            float lIlllIIIIllIIll = lIlllIIIIllIlII.next();
            short lIlllIIIIllIIlI = (Pair)lIlllIIIIllIIll;
            double lIlllIIIIllIIIl = llllIIIII[1];
            lIlllIIIIlllIII.println(String.valueOf((new StringBuilder()).append((String)lIlllIIIIllIIlI.getFirst()).append(lllIlllII[llllIIIII[0]]).append(((ᴃᎲ.ⲋ)lIlllIIIIllIIlI.getSecond()).ⲋ()).append(lllIlllII[llllIIIII[5]]).append(((ᴃᎲ.ⲋ)lIlllIIIIllIIlI.getSecond()).ĂƂ())));
            "".length();
            if ((66 + 48 - 59 + 81 ^ 84 + 3 - -52 + 1) <= "   ".length()) {
               return;
            }
         }

         Unit var20 = Unit.INSTANCE;
      } catch (Throwable var16) {
         lIlllIIIIlllIIl = var16;
         throw var16;
      } finally {
         CloseableKt.closeFinally(lIlllIIIIlllIll, lIlllIIIIlllIIl);
      }

      "".length();
      if (" ".length() <= " ".length()) {
         ;
      }
   }

   private static String lIIIIIIIllI(String lIlllIIIIlIlIII, String lIlllIIIIlIIlIl) {
      try {
         short lIlllIIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte lIlllIIIIlIIIll = Cipher.getInstance("Blowfish");
         lIlllIIIIlIIIll.init(llllIIIII[5], lIlllIIIIlIIlII);
         return new String(lIlllIIIIlIIIll.doFinal(Base64.getDecoder().decode(lIlllIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable ᴃᎲ.ⲋ var1) {
      ᴃᎲ = var1;
   }

   private static boolean lIIIIIlIIII(int var0, int var1) {
      return var0 >= var1;
   }

   static {
      lIIIIIIllIl();
      lIIIIIIlIlI();
      ⲋ = llllIIIII[3];
      ĂƂ = lllIlllII[llllIIIII[6]];
      ᴃᎲ var0 = new ᴃᎲ();
      u = var0;
      int var1 = llllIIIII[1];
      〥ҳⱆ = new HashMap();
   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return Ἒⅾ;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\b\u0007\u0018\u00002\u00020\u0017B-\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0086\u0004R(\u0010\t\u001a\u0004\u0018\u00010\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\u0002\u0010\b¨\u0006\u0086\u000eR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\f\u001a\u0004\b\u0004\u0010\r¨\u0006\u0086\u0004R&\u0010\u000f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0002\u0010\u0011¨\u0006\u0086\u000eR\u0017\u0010\u0006\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003¨\u0006\u0086\u0004"},
      d2 = {"La/ᴃᎲ$ⲋ;", "", "ⲋ", "()D", "u", "La/ᴃᎲ$ⲋ;", "〥ҳⱆ", "()La/ᴃᎲ$ⲋ;", "(La/ᴃᎲ$ⲋ;)V", "ĂƂ", "", "", "Ljava/util/List;", "()Ljava/util/List;", "J", "ᴃᎲ", "()J", "(J)V", "p0", "p1", "p2", "<init>", "(Ljava/util/List;JLa/ᴃᎲ$ⲋ;)V", ""}
   )
   public static final class ⲋ {
      static {
         lllIIlIl();
      }

      private static void lllIIlIl() {
         llIIIll = new int[6];
         llIIIll[0] = (85 ^ 109) & ~(25 ^ 33);
         llIIIll[1] = 6 ^ 12;
         llIIIll[2] = " ".length();
         llIIIll[3] = "  ".length();
         llIIIll[4] = 89 ^ 93;
         llIIIll[5] = 53 ^ 50;
      }

      public ⲋ(@NotNull List<Long> var1, long var2, @Nullable ᴃᎲ.ⲋ var4) {
         super();
         this.ⲋ = var1;
         this.ĂƂ = var2;
         this.u = var4;
      }

      private static boolean lllIlIII(int var0) {
         return var0 != 0;
      }

      @JvmName(
         name = "ᴃᎲ"
      )
      public final long ᴃᎲ() {
         return this.ĂƂ;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final double ⲋ() {
         return CollectionsKt.averageOfLong((Iterable)this.ⲋ);
      }

      @JvmName(
         name = "〥ҳⱆ"
      )
      public final ᴃᎲ.ⲋ 〥ҳⱆ() {
         return this.u;
      }

      @JvmName(
         name = "u"
      )
      public final List<Long> u() {
         return this.ⲋ;
      }

      public ⲋ() {
         this((List)null, 0L, (ᴃᎲ.ⲋ)null, llIIIll[5], (DefaultConstructorMarker)null);
      }

      @JvmName(
         name = "ĂƂ"
      )
      public final double ĂƂ() {
         Iterable var1 = (Iterable)this.ⲋ;
         int var2 = llIIIll[0];
         Collection llllIIIllIIIllI = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var1, llIIIll[1])));
         int var5 = llIIIll[0];
         Iterator llllIIIllIIIlII = var1.iterator();

         do {
            if (!lllIlIII(llllIIIllIIIlII.hasNext())) {
               return CollectionsKt.sumOfDouble((Iterable)((List)llllIIIllIIIllI));
            }

            String llllIIIllIIIIll = llllIIIllIIIlII.next();
            byte llllIIIllIIIIlI = ((Number)llllIIIllIIIIll).longValue();
            String llllIIIllIIIIIl = llIIIll[0];
            double llllIIIlIllllll = (double)llllIIIllIIIIlI;
            llllIIIllIIIllI.add(llllIIIlIllllll);
            "".length();
            "".length();
         } while(-"   ".length() < 0);

         return 0.0D;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final void ⲋ(@Nullable ᴃᎲ.ⲋ var1) {
         this.u = var1;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final void ⲋ(long var1) {
         this.ĂƂ = var1;
      }
   }
}
