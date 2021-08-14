package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0000\b'\u0018\u0000 \u00012\u00020::\u0001\u0001B\u0007¢\u0006\u0004\b9\u0010)J\u0015\u0010\u000b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010$J+\u0010\u0001\u001a\u00020\u001a2\u001c\u0010&\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017j\u0002`\u0018¢\u0006\u0004\b\u0001\u0010'J+\u0010\u000b\u001a\u00020\u001a2\u001c\u0010&\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017j\u0002`\u0018¢\u0006\u0004\b\u000b\u0010'J\u000f\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0005¢\u0006\u0004\b*\u0010#J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0005¢\u0006\u0004\b,\u0010-J\u001f\u0010\u0001\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020.2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b\u0001\u00101J\u001f\u0010\u0001\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00192\u0006\u00100\u001a\u00020.H\u0016¢\u0006\u0004\b\u0001\u00102J\u001f\u0010\u000b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00192\u0006\u00100\u001a\u00020.H\u0016¢\u0006\u0004\b\u000b\u00102J\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0001\u00103J\u0017\u0010\u0011\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0011\u00103J\u0017\u0010\u000b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u000b\u00103J\u0017\u0010\u0007\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0007\u00103J\u001f\u0010\u0007\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00192\u0006\u00100\u001a\u00020.H\u0016¢\u0006\u0004\b\u0007\u00102J\u000f\u00104\u001a\u00020\u001aH\u0016¢\u0006\u0004\b4\u0010)J\u000f\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u0010)J\u0015\u0010\u0007\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u00106J\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020+H\u0004¢\u0006\u0004\b\u0001\u00107J\u000f\u00108\u001a\u00020\u001aH\u0004¢\u0006\u0004\b8\u0010)R\u001a\u0010\u0001\u001a\u00020\u00028W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0096\u0004R-\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0005j\b\u0012\u0004\u0012\u00020\u0000`\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0086\u0004R&\u0010\u0007\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u0004\"\u0004\b\u000b\u0010\u000e¨\u0006\u0096\u000eR \u0010\u0011\u001a\u00020\u00028\u0017@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0096\u0004R&\u0010\u0016\u001a\u00020\u00128\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014\"\u0004\b\u0001\u0010\u0015¨\u0006\u0096\u000eRV\u0010\u001b\u001a>\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017j\u0002`\u00180\u0005j\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017j\u0002`\u0018`\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0082\u0004R&\u0010\t\u001a\u00020\u001c8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0001\u0010!¨\u0006\u0086\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\"\u001a\u0004\b\u001b\u0010#\"\u0004\b\u0001\u0010$¨\u0006\u0086\u000eR&\u0010\u001d\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u001d\u0010\u0004\"\u0004\b\u0001\u0010\u000e¨\u0006\u0096\u000eR \u0010\r\u001a\u00020\u00028\u0017@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0001\u0010\u0004¨\u0006\u0096\u0004R&\u0010\u0010\u001a\u00020\u001c8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b\u000b\u0010!¨\u0006\u0086\u000eRV\u0010\u001f\u001a>\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017j\u0002`\u00180\u0005j\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017j\u0002`\u0018`\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\b¨\u0006\u0082\u0004"},
   d2 = {"La/Ữ;", "ⲋ", "La/ė;", "Ꞑ", "()La/ė;", "Ljava/util/ArrayList;", "Lkotlin/collections/ⲋ;", "u", "Ljava/util/ArrayList;", "ϛⰄ", "()Ljava/util/ArrayList;", "ĂƂ", "La/ė;", "ⲡ", "(La/ė;)V", "ς", "Đ", "ᴃᎲ", "La/ʁᎴ;", "La/ʁᎴ;", "()La/ʁᎴ;", "(La/ʁᎴ;)V", "〥ҳⱆ", "Lkotlin/Function2;", "La/MouseButtonHandler;", "La/ⅵ;", "", "Ἒⅾ", "", "Ꜥ", "Z", "ᵴἥ", "()Z", "(Z)V", "La/Ữ;", "()La/Ữ;", "(La/Ữ;)V", "Ɏ", "p0", "(Lkotlin/jvm/functions/Function2;)V", "ɡ", "()V", "ͷ", "La/Ḥ;", "Ⳓ", "()La/Ḥ;", "", "", "p1", "(IC)V", "(La/ⅵ;I)V", "(La/ⅵ;)V", "b_", "ⴜ", "(La/ė;)Z", "(La/Ḥ;)V", "Ꙗ", "<init>", ""}
)
public abstract class Ữ {
   private static String llIlllIII(String lllIIIIIIIlIllI, String lllIIIIIIIlIlIl) {
      try {
         SecretKeySpec lllIIIIIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllIIIIIIIllIII = Cipher.getInstance("Blowfish");
         lllIIIIIIIllIII.init(llIIlIll[5], lllIIIIIIIllIIl);
         return new String(lllIIIIIIIllIII.doFinal(Base64.getDecoder().decode(lllIIIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final ArrayList<Ữ> ϛⰄ() {
      return this.u;
   }

   public void ⲋ(@NotNull ⅵ var1) {
      this.Ꜥ = (boolean)llIIlIll[0];
   }

   @JvmName(
      name = "ĂƂ"
   )
   public void ĂƂ(@NotNull ė var1) {
      this.ϛⰄ = var1;
   }

   protected final void Ꙗ() {
      if (llIlllllI(lllIIIIIIlllIII instanceof Ḥ)) {
         ((Ḥ)lllIIIIIIlllIII).〥ҳⱆ((boolean)llIIlIll[0]);
         "".length();
         if (((243 ^ 165 ^ 72 ^ 32) & (94 + 30 - 120 + 126 ^ 22 + 98 - -39 + 29 ^ -" ".length())) != 0) {
            return;
         }
      } else {
         Ữ var10000 = lllIIIIIIlllIII.ⲋ;
         if (lllIIIlIl(var10000)) {
            var10000.Ꙗ();
            "".length();
            if (-" ".length() > 0) {
               return;
            }
         } else {
            "".length();
         }
      }

   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable Ữ var1) {
      this.ⲋ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public void ⲋ(@NotNull ʁᎴ var1) {
      this.ᴃᎲ = var1;
   }

   protected final void ⲋ(@NotNull Ḥ var1) {
      var1.ⴜ();
      var1.ɡ();
      var1.ɡ();
      var1.ⲋ(this.Ꞑ().u(new ė(this.ⲡ().ⲋ() + llIIlIll[2], llIIlIll[3])));
      ᶔ.ⲋ.ĂƂ(var1);
   }

   public void u(@NotNull ⅵ lllIIIIlIlllIlI) {
      this.ⲡ = (boolean)llIIlIll[1];
      Iterable lllIIIIlIlllIIl = (Iterable)this.u;
      int lllIIIIlIlllIII = llIIlIll[1];
      Collection lllIIIIlIllIllI = (Collection)(new ArrayList());
      int var6 = llIIlIll[1];
      Iterator lllIIIIlIllIlII = lllIIIIlIlllIIl.iterator();

      int lllIIIIlIllIIIl;
      while(llIlllllI(lllIIIIlIllIlII.hasNext())) {
         Exception lllIIIIlIllIIll = lllIIIIlIllIlII.next();
         char lllIIIIlIllIIlI = (Ữ)lllIIIIlIllIIll;
         lllIIIIlIllIIIl = llIIlIll[1];
         int var10000;
         if (llIllllIl(lllIIIIlIllIIlI.Ꜥ) && !llIlllllI(lllIIIIlIllIIlI.ⲡ)) {
            var10000 = llIIlIll[1];
         } else {
            var10000 = llIIlIll[0];
            "".length();
            if (null != null) {
               return;
            }
         }

         if (llIlllllI(var10000)) {
            lllIIIIlIllIllI.add(lllIIIIlIllIIll);
            "".length();
            "".length();
            if (((14 ^ 29) & ~(155 ^ 136)) > "   ".length()) {
               return;
            }
         }
      }

      lllIIIIlIlllIIl = (Iterable)((List)lllIIIIlIllIllI);
      lllIIIIlIlllIII = llIIlIll[1];
      Iterator lllIIIIlIllIlll = lllIIIIlIlllIIl.iterator();

      do {
         if (!llIlllllI(lllIIIIlIllIlll.hasNext())) {
            return;
         }

         Exception lllIIIIlIllIllI = lllIIIIlIllIlll.next();
         float lllIIIIlIllIlIl = (Ữ)lllIIIIlIllIllI;
         float lllIIIIlIllIlII = llIIlIll[1];
         lllIIIIlIllIIIl = llIIlIll[1];
         double lllIIIIlIllIIII = new ⅵ(lllIIIIlIlllIlI.ⲋ().ĂƂ(lllIIIIlIllIlIl.Ꜥ()), lllIIIIlIlllIlI.ĂƂ());
         lllIIIIlIllIlIl.u(lllIIIIlIllIIII);
         "".length();
      } while(null == null);

   }

   static {
      llIllllII();
      llIlllIIl();
      ⲋ = new Ữ.ⲋ((DefaultConstructorMarker)null);
   }

   private static boolean lllIIIlIl(Object var0) {
      return var0 != null;
   }

   private static boolean llIlllllI(int var0) {
      return var0 != 0;
   }

   public final void ⲋ(@NotNull Function2<? super Ữ, ? super ⅵ, Unit> var1) {
      if (llIllllIl(this.Đ.contains(var1))) {
         this.Đ.add(var1);
         "".length();
      }

   }

   private static String llIllIlll(String lllIIIIIIlIIllI, String lllIIIIIIlIlIlI) {
      lllIIIIIIlIIllI = new String(Base64.getDecoder().decode(lllIIIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIIIIIIlIlIIl = new StringBuilder();
      char[] lllIIIIIIlIlIII = lllIIIIIIlIlIlI.toCharArray();
      int lllIIIIIIlIIIlI = llIIlIll[1];
      long lllIIIIIIlIIIIl = lllIIIIIIlIIllI.toCharArray();
      long lllIIIIIIlIIIII = lllIIIIIIlIIIIl.length;
      int lllIIIIIIIlllll = llIIlIll[1];

      do {
         if (!lllIIIlII(lllIIIIIIIlllll, lllIIIIIIlIIIII)) {
            return String.valueOf(lllIIIIIIlIlIIl);
         }

         char lllIIIIIIlIllII = lllIIIIIIlIIIIl[lllIIIIIIIlllll];
         lllIIIIIIlIlIIl.append((char)(lllIIIIIIlIllII ^ lllIIIIIIlIlIII[lllIIIIIIlIIIlI % lllIIIIIIlIlIII.length]));
         "".length();
         ++lllIIIIIIlIIIlI;
         ++lllIIIIIIIlllll;
         "".length();
      } while(null == null);

      return null;
   }

   private static boolean lllIIIlII(int var0, int var1) {
      return var0 < var1;
   }

   @Nullable
   protected final Ḥ Ⳓ() {
      if (llIlllllI(lllIIIIIIlllIlI instanceof Ḥ)) {
         return (Ḥ)lllIIIIIIlllIlI;
      } else {
         Ữ var10000 = lllIIIIIIlllIlI.ⲋ;
         Ḥ var1;
         if (lllIIIlIl(var10000)) {
            var1 = var10000.Ⳓ();
            "".length();
            if (((4 + 92 - -92 + 10 ^ 128 + 97 - 144 + 72) & (160 + 12 - 121 + 154 ^ 2 + 53 - 50 + 141 ^ -" ".length())) <= -" ".length()) {
               return null;
            }
         } else {
            "".length();
            var1 = null;
         }

         return var1;
      }
   }

   @Nullable
   protected final Ữ ͷ() {
      Ữ var10000 = lllIIIIIIllllII.ⲋ;
      if (lllIIIlIl(var10000)) {
         var10000 = var10000.ͷ();
         if (lllIIIlIl(var10000)) {
            "".length();
            if ((166 ^ 146 ^ 27 ^ 43) == " ".length()) {
               return null;
            }

            return var10000;
         }
      }

      "".length();
      var10000 = lllIIIIIIllllII;
      return var10000;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      this.ⲡ = var1;
   }

   @JvmName(
      name = "Đ"
   )
   public ė Đ() {
      return this.ς;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final Ữ Ἒⅾ() {
      return this.ⲋ;
   }

   public Ữ() {
      this.〥ҳⱆ = new ė(llIIlIll[1], llIIlIll[1], llIIlIll[4], (DefaultConstructorMarker)null);
      this.Ἒⅾ = new ė(llIIlIll[1], llIIlIll[1], llIIlIll[4], (DefaultConstructorMarker)null);
      this.ϛⰄ = new ė(llIIlIll[1], llIIlIll[1], llIIlIll[4], (DefaultConstructorMarker)null);
      this.ς = new ė(llIIlIll[1], llIIlIll[1], llIIlIll[4], (DefaultConstructorMarker)null);
      this.Đ = new ArrayList();
      this.ᵴἥ = new ArrayList();
   }

   @JvmName(
      name = "Ꞑ"
   )
   public ė Ꞑ() {
      ė var10000 = this.Ꜥ();
      Ữ var10001 = this.ⲋ;
      ė var1;
      if (lllIIIlIl(var10001)) {
         var1 = var10001.Ꞑ();
         if (lllIIIlIl(var1)) {
            "".length();
            if (((221 ^ 159) & ~(97 ^ 35)) <= -" ".length()) {
               return null;
            }

            return var10000.u(var1);
         }
      }

      "".length();
      var1 = ė.ⲋ.ⲋ();
      return var10000.u(var1);
   }

   public void ⲋ(int lllIIIIIlllIIll, char lllIIIIIlllIIlI) {
      Iterable var3 = (Iterable)this.u;
      int var4 = llIIlIll[1];
      Iterator lllIIIIIllIllll = var3.iterator();

      do {
         if (!llIlllllI(lllIIIIIllIllll.hasNext())) {
            return;
         }

         boolean lllIIIIIllIlllI = lllIIIIIllIllll.next();
         int lllIIIIIllIllIl = (Ữ)lllIIIIIllIlllI;
         byte lllIIIIIllIllII = llIIlIll[1];
         lllIIIIIllIllIl.ⲋ(lllIIIIIlllIIll, lllIIIIIlllIIlI);
         "".length();
      } while(" ".length() >= 0);

   }

   public final void ĂƂ(@NotNull Function2<? super Ữ, ? super ⅵ, Unit> var1) {
      if (llIllllIl(this.ᵴἥ.contains(var1))) {
         this.ᵴἥ.add(var1);
         "".length();
      }

   }

   public void ⴜ() {
      Iterable var1 = (Iterable)this.u;
      int var2 = llIIlIll[1];
      Iterator lllIIIIIlIlIIll = var1.iterator();

      do {
         if (!llIlllllI(lllIIIIIlIlIIll.hasNext())) {
            this.ĂƂ(this.ς().ⲋ(this));
            return;
         }

         short lllIIIIIlIlIIlI = lllIIIIIlIlIIll.next();
         long lllIIIIIlIlIIIl = (Ữ)lllIIIIIlIlIIlI;
         short lllIIIIIlIlIIII = llIIlIll[1];
         lllIIIIIlIlIIIl.ⴜ();
         "".length();
      } while((12 ^ 8) > "   ".length());

   }

   @JvmName(
      name = "ς"
   )
   public ʁᎴ ς() {
      return this.ᴃᎲ;
   }

   public void ⲋ(@NotNull ⅵ lllIIIIlllIllIl, int lllIIIIlllIllII) {
      lllIIIIlllIlllI.ⲡ = (boolean)llIIlIll[0];
      Iterable lllIIIIlllIlIll;
      int lllIIIIlllIlIlI;
      Iterator lllIIIIlllIlIIl;
      Object lllIIIIlllIlIII;
      Function2 lllIIIIlllIIlll;
      int lllIIIIlllIIllI;
      switch(lllIIIIlllIllII) {
      case 0:
         lllIIIIlllIlIll = (Iterable)lllIIIIlllIlllI.Đ;
         lllIIIIlllIlIlI = llIIlIll[1];
         lllIIIIlllIlIIl = lllIIIIlllIlIll.iterator();

         while(llIlllllI(lllIIIIlllIlIIl.hasNext())) {
            lllIIIIlllIlIII = lllIIIIlllIlIIl.next();
            lllIIIIlllIIlll = (Function2)lllIIIIlllIlIII;
            lllIIIIlllIIllI = llIIlIll[1];
            lllIIIIlllIIlll.invoke(lllIIIIlllIlllI, lllIIIIlllIllIl);
            "".length();
            "".length();
            if ("  ".length() >= "   ".length()) {
               return;
            }
         }

         "".length();
         if (-" ".length() == "  ".length()) {
            return;
         }
         break;
      case 1:
         lllIIIIlllIlIll = (Iterable)lllIIIIlllIlllI.ᵴἥ;
         lllIIIIlllIlIlI = llIIlIll[1];
         lllIIIIlllIlIIl = lllIIIIlllIlIll.iterator();

         while(llIlllllI(lllIIIIlllIlIIl.hasNext())) {
            lllIIIIlllIlIII = lllIIIIlllIlIIl.next();
            lllIIIIlllIIlll = (Function2)lllIIIIlllIlIII;
            lllIIIIlllIIllI = llIIlIll[1];
            lllIIIIlllIIlll.invoke(lllIIIIlllIlllI, lllIIIIlllIllIl);
            "".length();
            "".length();
            if (null != null) {
               return;
            }
         }

         "".length();
         if (" ".length() <= 0) {
            return;
         }
      }

      lllIIIIlllIlIll = (Iterable)lllIIIIlllIlllI.u;
      lllIIIIlllIlIlI = llIIlIll[1];
      String lllIIIIlllIlIII = (Collection)(new ArrayList());
      byte lllIIIIlllIIlll = llIIlIll[1];
      Iterator lllIIIIlllIIllI = lllIIIIlllIlIll.iterator();

      int lllIIIIlllIIIll;
      while(llIlllllI(lllIIIIlllIIllI.hasNext())) {
         Exception lllIIIIlllIIlIl = lllIIIIlllIIllI.next();
         char lllIIIIlllIIlII = (Ữ)lllIIIIlllIIlIl;
         lllIIIIlllIIIll = llIIlIll[1];
         if (llIlllllI(lllIIIIlllIIlII.Ꜥ)) {
            lllIIIIlllIlIII.add(lllIIIIlllIIlIl);
            "".length();
            "".length();
            if ("  ".length() == "   ".length()) {
               return;
            }
         }
      }

      lllIIIIlllIlIll = (Iterable)((List)lllIIIIlllIlIII);
      lllIIIIlllIlIlI = llIIlIll[1];
      lllIIIIlllIlIIl = lllIIIIlllIlIll.iterator();

      do {
         if (!llIlllllI(lllIIIIlllIlIIl.hasNext())) {
            lllIIIIlllIlllI.ĂƂ(lllIIIIlllIllIl, lllIIIIlllIllII);
            return;
         }

         lllIIIIlllIlIII = lllIIIIlllIlIIl.next();
         byte lllIIIIlllIIlll = (Ữ)lllIIIIlllIlIII;
         lllIIIIlllIIllI = llIIlIll[1];
         lllIIIIlllIIIll = llIIlIll[1];
         Exception lllIIIIlllIIIlI = new ⅵ(lllIIIIlllIllIl.ⲋ().ĂƂ(lllIIIIlllIIlll.Ꜥ()), lllIIIIlllIllIl.ĂƂ());
         lllIIIIlllIIlll.ⲋ(lllIIIIlllIIIlI, lllIIIIlllIllII);
         "".length();
      } while((143 ^ 151 ^ 52 ^ 40) == (121 ^ 126 ^ "   ".length()));

   }

   public void u(@NotNull ⅵ lllIIIIlIIIlIIl, int lllIIIIlIIIlIII) {
      Iterable lllIIIIlIIIIlll = (Iterable)this.u;
      int lllIIIIlIIIIllI = llIIlIll[1];
      Collection lllIIIIlIIIIlII = (Collection)(new ArrayList());
      int var7 = llIIlIll[1];
      Iterator lllIIIIlIIIIIlI = lllIIIIlIIIIlll.iterator();

      int lllIIIIIlllllll;
      while(llIlllllI(lllIIIIlIIIIIlI.hasNext())) {
         boolean lllIIIIlIIIIIIl = lllIIIIlIIIIIlI.next();
         long lllIIIIlIIIIIII = (Ữ)lllIIIIlIIIIIIl;
         lllIIIIIlllllll = llIIlIll[1];
         if (llIlllllI(lllIIIIlIIIIIII.Ꜥ)) {
            lllIIIIlIIIIlII.add(lllIIIIlIIIIIIl);
            "".length();
            "".length();
            if (-" ".length() > (241 ^ 133 ^ 213 ^ 165)) {
               return;
            }
         }
      }

      lllIIIIlIIIIlll = (Iterable)((List)lllIIIIlIIIIlII);
      lllIIIIlIIIIllI = llIIlIll[1];
      Iterator lllIIIIlIIIIlIl = lllIIIIlIIIIlll.iterator();

      do {
         if (!llIlllllI(lllIIIIlIIIIlIl.hasNext())) {
            return;
         }

         byte lllIIIIlIIIIlII = lllIIIIlIIIIlIl.next();
         double lllIIIIlIIIIIll = (Ữ)lllIIIIlIIIIlII;
         String lllIIIIlIIIIIlI = llIIlIll[1];
         lllIIIIIlllllll = llIIlIll[1];
         char lllIIIIIllllllI = new ⅵ(lllIIIIlIIIlIIl.ⲋ().ĂƂ(lllIIIIlIIIIIll.Ꜥ()), lllIIIIlIIIlIIl.ĂƂ());
         lllIIIIlIIIIIll.u(lllIIIIIllllllI, lllIIIIlIIIlIII);
         "".length();
      } while(null == null);

   }

   public final boolean u(@NotNull ė var1) {
      int var10000;
      if (lllIIIIll(var1.ⲋ(), this.Ꜥ().ⲋ()) && lllIIIlII(var1.ⲋ(), this.Ꜥ().ⲋ() + this.ⲡ().ⲋ()) && lllIIIIll(var1.ĂƂ(), this.Ꜥ().ĂƂ()) && lllIIIlII(var1.ĂƂ(), this.Ꜥ().ĂƂ() + this.ⲡ().ĂƂ())) {
         var10000 = llIIlIll[0];
         "".length();
         if (null != null) {
            return (boolean)((180 ^ 194 ^ 176 ^ 148) & (168 + 151 - 237 + 137 ^ 86 + 50 - 107 + 108 ^ -" ".length()));
         }
      } else {
         var10000 = llIIlIll[1];
      }

      return (boolean)var10000;
   }

   public void ĂƂ(@NotNull ⅵ lllIIIIllIlIIll, int lllIIIIllIlIIlI) {
      Iterable lllIIIIllIlIIIl = (Iterable)this.u;
      int lllIIIIllIlIIII = llIIlIll[1];
      Collection lllIIIIllIIlllI = (Collection)(new ArrayList());
      int var7 = llIIlIll[1];
      Iterator lllIIIIllIIllII = lllIIIIllIlIIIl.iterator();

      int lllIIIIllIIlIIl;
      while(llIlllllI(lllIIIIllIIllII.hasNext())) {
         Exception lllIIIIllIIlIll = lllIIIIllIIllII.next();
         byte lllIIIIllIIlIlI = (Ữ)lllIIIIllIIlIll;
         lllIIIIllIIlIIl = llIIlIll[1];
         int var10000;
         if (llIllllIl(lllIIIIllIIlIlI.Ꜥ)) {
            var10000 = llIIlIll[0];
            "".length();
            if (-"  ".length() > 0) {
               return;
            }
         } else {
            var10000 = llIIlIll[1];
         }

         if (llIlllllI(var10000)) {
            lllIIIIllIIlllI.add(lllIIIIllIIlIll);
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
               return;
            }
         }
      }

      lllIIIIllIlIIIl = (Iterable)((List)lllIIIIllIIlllI);
      lllIIIIllIlIIII = llIIlIll[1];
      Iterator lllIIIIllIIllll = lllIIIIllIlIIIl.iterator();

      do {
         if (!llIlllllI(lllIIIIllIIllll.hasNext())) {
            return;
         }

         byte lllIIIIllIIlllI = lllIIIIllIIllll.next();
         String lllIIIIllIIllIl = (Ữ)lllIIIIllIIlllI;
         int lllIIIIllIIllII = llIIlIll[1];
         lllIIIIllIIlIIl = llIIlIll[1];
         char lllIIIIllIIlIII = new ⅵ(lllIIIIllIlIIll.ⲋ().ĂƂ(lllIIIIllIIllIl.Ꜥ()), lllIIIIllIlIIll.ĂƂ());
         lllIIIIllIIllIl.ĂƂ(lllIIIIllIIlIII, lllIIIIllIlIIlI);
         "".length();
      } while(null == null);

   }

   @JvmName(
      name = "Ꜥ"
   )
   public ė Ꜥ() {
      return this.〥ҳⱆ;
   }

   public void ᴃᎲ(@NotNull ⅵ lllIIIIlIlIIIlI) {
      Iterable lllIIIIlIlIIIIl = (Iterable)lllIIIIlIlIIIll.u;
      int lllIIIIlIlIIIII = llIIlIll[1];
      Collection lllIIIIlIIllllI = (Collection)(new ArrayList());
      int lllIIIIlIIlllIl = llIIlIll[1];
      Iterator lllIIIIlIIlllII = lllIIIIlIlIIIIl.iterator();

      Object lllIIIIlIIllIll;
      Ữ lllIIIIlIIllIlI;
      int lllIIIIlIIllIIl;
      int var10000;
      while(llIlllllI(lllIIIIlIIlllII.hasNext())) {
         lllIIIIlIIllIll = lllIIIIlIIlllII.next();
         lllIIIIlIIllIlI = (Ữ)lllIIIIlIIllIll;
         lllIIIIlIIllIIl = llIIlIll[1];
         if (llIllllIl(lllIIIIlIIllIlI.Ꜥ) && llIlllllI(lllIIIIlIIllIlI.u(lllIIIIlIlIIIlI.ⲋ()))) {
            var10000 = llIIlIll[0];
            "".length();
            if ("  ".length() < "  ".length()) {
               return;
            }
         } else {
            var10000 = llIIlIll[1];
         }

         if (llIlllllI(var10000)) {
            lllIIIIlIIllllI.add(lllIIIIlIIllIll);
            "".length();
            "".length();
            if ("   ".length() <= ((128 + 103 - 142 + 71 ^ 29 + 17 - -68 + 23) & (113 ^ 89 ^ " ".length() ^ -" ".length()))) {
               return;
            }
         }
      }

      lllIIIIlIlIIIIl = (Iterable)((List)lllIIIIlIIllllI);
      lllIIIIlIlIIIII = llIIlIll[1];
      Iterator lllIIIIlIIlllll = lllIIIIlIlIIIIl.iterator();

      ⅵ lllIIIIlIIllIII;
      Object lllIIIIlIIllllI;
      Ữ lllIIIIlIIlllIl;
      int lllIIIIlIIlllII;
      while(llIlllllI(lllIIIIlIIlllll.hasNext())) {
         lllIIIIlIIllllI = lllIIIIlIIlllll.next();
         lllIIIIlIIlllIl = (Ữ)lllIIIIlIIllllI;
         lllIIIIlIIlllII = llIIlIll[1];
         lllIIIIlIIllIIl = llIIlIll[1];
         lllIIIIlIIllIII = new ⅵ(lllIIIIlIlIIIlI.ⲋ().ĂƂ(lllIIIIlIIlllIl.Ꜥ()), lllIIIIlIlIIIlI.ĂƂ());
         lllIIIIlIIlllIl.ⲋ(lllIIIIlIIllIII);
         "".length();
         if ((184 ^ 147 ^ 14 ^ 33) < 0) {
            return;
         }
      }

      lllIIIIlIlIIIIl = (Iterable)lllIIIIlIlIIIll.u;
      lllIIIIlIlIIIII = llIIlIll[1];
      lllIIIIlIIllllI = (Collection)(new ArrayList());
      lllIIIIlIIlllIl = llIIlIll[1];
      lllIIIIlIIlllII = lllIIIIlIlIIIIl.iterator();

      while(llIlllllI(lllIIIIlIIlllII.hasNext())) {
         lllIIIIlIIllIll = lllIIIIlIIlllII.next();
         lllIIIIlIIllIlI = (Ữ)lllIIIIlIIllIll;
         lllIIIIlIIllIIl = llIIlIll[1];
         if (llIlllllI(lllIIIIlIIllIlI.Ꜥ) && llIllllIl(lllIIIIlIIllIlI.u(lllIIIIlIlIIIlI.ⲋ()))) {
            var10000 = llIIlIll[0];
            "".length();
            if (" ".length() < 0) {
               return;
            }
         } else {
            var10000 = llIIlIll[1];
         }

         if (llIlllllI(var10000)) {
            lllIIIIlIIllllI.add(lllIIIIlIIllIll);
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
               return;
            }
         }
      }

      lllIIIIlIlIIIIl = (Iterable)((List)lllIIIIlIIllllI);
      lllIIIIlIlIIIII = llIIlIll[1];
      lllIIIIlIIlllll = lllIIIIlIlIIIIl.iterator();

      while(llIlllllI(lllIIIIlIIlllll.hasNext())) {
         lllIIIIlIIllllI = lllIIIIlIIlllll.next();
         lllIIIIlIIlllIl = (Ữ)lllIIIIlIIllllI;
         lllIIIIlIIlllII = llIIlIll[1];
         lllIIIIlIIllIIl = llIIlIll[1];
         lllIIIIlIIllIII = new ⅵ(lllIIIIlIlIIIlI.ⲋ().ĂƂ(lllIIIIlIIlllIl.Ꜥ()), lllIIIIlIlIIIlI.ĂƂ());
         lllIIIIlIIlllIl.ĂƂ(lllIIIIlIIllIII);
         "".length();
         if ("   ".length() < " ".length()) {
            return;
         }
      }

      lllIIIIlIlIIIIl = (Iterable)lllIIIIlIlIIIll.u;
      lllIIIIlIlIIIII = llIIlIll[1];
      lllIIIIlIIllllI = (Collection)(new ArrayList());
      lllIIIIlIIlllIl = llIIlIll[1];
      lllIIIIlIIlllII = lllIIIIlIlIIIIl.iterator();

      while(llIlllllI(lllIIIIlIIlllII.hasNext())) {
         lllIIIIlIIllIll = lllIIIIlIIlllII.next();
         lllIIIIlIIllIlI = (Ữ)lllIIIIlIIllIll;
         lllIIIIlIIllIIl = llIIlIll[1];
         if (llIllllIl(lllIIIIlIIllIlI.Ꜥ) && !llIlllllI(lllIIIIlIIllIlI.ⲡ)) {
            var10000 = llIIlIll[1];
         } else {
            var10000 = llIIlIll[0];
            "".length();
            if ((133 ^ 129) < 0) {
               return;
            }
         }

         if (llIlllllI(var10000)) {
            lllIIIIlIIllllI.add(lllIIIIlIIllIll);
            "".length();
            "".length();
            if (" ".length() != " ".length()) {
               return;
            }
         }
      }

      lllIIIIlIlIIIIl = (Iterable)((List)lllIIIIlIIllllI);
      lllIIIIlIlIIIII = llIIlIll[1];
      lllIIIIlIIlllll = lllIIIIlIlIIIIl.iterator();

      do {
         if (!llIlllllI(lllIIIIlIIlllll.hasNext())) {
            return;
         }

         lllIIIIlIIllllI = lllIIIIlIIlllll.next();
         lllIIIIlIIlllIl = (Ữ)lllIIIIlIIllllI;
         lllIIIIlIIlllII = llIIlIll[1];
         lllIIIIlIIllIIl = llIIlIll[1];
         lllIIIIlIIllIII = new ⅵ(lllIIIIlIlIIIlI.ⲋ().ĂƂ(lllIIIIlIIlllIl.Ꜥ()), lllIIIIlIlIIIlI.ĂƂ());
         lllIIIIlIIlllIl.ᴃᎲ(lllIIIIlIIllIII);
         "".length();
      } while(-(127 ^ 116 ^ 4 ^ 11) <= 0);

   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.Ꜥ = var1;
   }

   public void ĂƂ(@NotNull ⅵ lllIIIlIIIIIllI) {
      this.Ꜥ = (boolean)llIIlIll[1];
      Iterable lllIIIlIIIIIlIl = (Iterable)this.u;
      int lllIIIlIIIIIlII = llIIlIll[1];
      Collection lllIIIlIIIIIIlI = (Collection)(new ArrayList());
      int var6 = llIIlIll[1];
      Iterator lllIIIlIIIIIIII = lllIIIlIIIIIlIl.iterator();

      int lllIIIIllllllIl;
      while(llIlllllI(lllIIIlIIIIIIII.hasNext())) {
         long lllIIIIllllllll = lllIIIlIIIIIIII.next();
         boolean lllIIIIlllllllI = (Ữ)lllIIIIllllllll;
         lllIIIIllllllIl = llIIlIll[1];
         if (llIlllllI(lllIIIIlllllllI.Ꜥ)) {
            lllIIIlIIIIIIlI.add(lllIIIIllllllll);
            "".length();
            "".length();
            if ((179 ^ 183) < 0) {
               return;
            }
         }
      }

      lllIIIlIIIIIlIl = (Iterable)((List)lllIIIlIIIIIIlI);
      lllIIIlIIIIIlII = llIIlIll[1];
      Iterator lllIIIlIIIIIIll = lllIIIlIIIIIlIl.iterator();

      do {
         if (!llIlllllI(lllIIIlIIIIIIll.hasNext())) {
            return;
         }

         long lllIIIlIIIIIIlI = lllIIIlIIIIIIll.next();
         boolean lllIIIlIIIIIIIl = (Ữ)lllIIIlIIIIIIlI;
         long lllIIIlIIIIIIII = llIIlIll[1];
         lllIIIIllllllIl = llIIlIll[1];
         int lllIIIIllllllII = new ⅵ(lllIIIlIIIIIllI.ⲋ().ĂƂ(lllIIIlIIIIIIIl.Ꜥ()), lllIIIlIIIIIllI.ĂƂ());
         lllIIIlIIIIIIIl.ĂƂ(lllIIIIllllllII);
         "".length();
      } while(((76 ^ 88 ^ 70 ^ 9) & (242 + 205 - 378 + 177 ^ 160 + 55 - 99 + 57 ^ -" ".length())) == 0);

   }

   @JvmName(
      name = "ⲡ"
   )
   public ė ⲡ() {
      return this.ϛⰄ;
   }

   @JvmName(
      name = "Ɏ"
   )
   public final boolean Ɏ() {
      return this.ⲡ;
   }

   private static boolean llIllllIl(int var0) {
      return var0 == 0;
   }

   public final void ĂƂ(@NotNull Ữ var1) {
      this.u.add(var1);
      "".length();
      var1.ⲋ = (Ữ)this;
   }

   private static boolean lllIIIIll(int var0, int var1) {
      return var0 >= var1;
   }

   public void b_() {
      Iterable var1 = (Iterable)this.u;
      int var2 = llIIlIll[1];
      Iterator lllIIIIIlIIIlIl = var1.iterator();

      do {
         if (!llIlllllI(lllIIIIIlIIIlIl.hasNext())) {
            return;
         }

         long lllIIIIIlIIIlII = lllIIIIIlIIIlIl.next();
         Exception lllIIIIIlIIIIll = (Ữ)lllIIIIIlIIIlII;
         float lllIIIIIlIIIIlI = llIIlIll[1];
         GL11.glTranslated((double)lllIIIIIlIIIIll.Ꜥ().ⲋ(), (double)lllIIIIIlIIIIll.Ꜥ().ĂƂ(), 0.0D);
         a.ᴃᎲ.u.ⲋ(String.valueOf((new StringBuilder()).append(lllIIIIIlIIIIll.getClass().getSimpleName()).append(llIIlIlI[llIIlIll[1]])));
         lllIIIIIlIIIIll.b_();
         a.ᴃᎲ.u.ĂƂ(String.valueOf((new StringBuilder()).append(lllIIIIIlIIIIll.getClass().getSimpleName()).append(llIIlIlI[llIIlIll[0]])));
         if (llIlllllI(ⱉȬ.ᴃᎲ.ɡ())) {
            ⲋ.ⲋ(lllIIIIIlIIIIll);
         }

         GL11.glTranslated(-((double)lllIIIIIlIIIIll.Ꜥ().ⲋ()), -((double)lllIIIIIlIIIIll.Ꜥ().ĂƂ()), 0.0D);
         "".length();
      } while(((64 ^ 71) & ~(184 ^ 191)) >= 0);

   }

   @JvmName(
      name = "ᵴἥ"
   )
   public final boolean ᵴἥ() {
      return this.Ꜥ;
   }

   private static void llIllllII() {
      llIIlIll = new int[6];
      llIIlIll[0] = " ".length();
      llIIlIll[1] = (51 ^ 34) & ~(41 ^ 56);
      llIIlIll[2] = 70 ^ 88;
      llIIlIll[3] = -(60 + 37 - 3 + 97 ^ 130 + 99 - 184 + 116);
      llIIlIll[4] = "   ".length();
      llIIlIll[5] = "  ".length();
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return this.Ἒⅾ;
   }

   private static void llIlllIIl() {
      llIIlIlI = new String[llIIlIll[5]];
      llIIlIlI[llIIlIll[1]] = llIllIlll("UlUAPyoNAQs0Cg==", "hooQx");
      llIIlIlI[llIIlIll[0]] = llIlllIII("IAX1G4p5KvNxwIFGisPZvQ==", "AzrHq");
   }

   @JvmName(
      name = "ⲋ"
   )
   public void ⲋ(@NotNull ė var1) {
      this.〥ҳⱆ = var1;
   }

   public void ɡ() {
      Iterable var1 = (Iterable)this.u;
      int var2 = llIIlIll[1];
      Iterator lllIIIIIllIIIIl = var1.iterator();

      do {
         if (!llIlllllI(lllIIIIIllIIIIl.hasNext())) {
            this.ς().ĂƂ(this);
            return;
         }

         short lllIIIIIllIIIII = lllIIIIIllIIIIl.next();
         String lllIIIIIlIlllll = (Ữ)lllIIIIIllIIIII;
         Exception lllIIIIIlIllllI = llIIlIll[1];
         lllIIIIIlIlllll.ɡ();
         "".length();
      } while("   ".length() != "  ".length());

   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"},
      d2 = {"La/Ữ$ⲋ;", "La/Ữ;", "p0", "", "ⲋ", "(La/Ữ;)V", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      static {
         llIlllllIl();
      }

      private ⲋ() {
      }

      private static void llIlllllIl() {
         llIlIllll = new int[1];
         llIlIllll[0] = (59 ^ 32) + (45 ^ 53) - (16 ^ 15) + 162 + 109 - 212 + 121;
      }

      public final void ⲋ(@NotNull Ữ var1) {
         ⲙ.ⲋ.ⲋ(0.0D, 0.0D, (double)var1.ⲡ().ⲋ(), (double)var1.ⲡ().ĂƂ(), ſ.ⲋ(Color.red, llIlIllll[0]));
      }
   }
}
