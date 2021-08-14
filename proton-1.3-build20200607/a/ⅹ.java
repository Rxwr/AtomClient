package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010<*\u00020,2\u00020,B\u0017\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00028\u0000¢\u0006\u0004\b:\u0010;J\u0015\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040*H\u0007¢\u0006\u0004\b\u0001\u0010+J&\u0010\u0003\u001a\u00028\u00002\b\u0010-\u001a\u0004\u0018\u00010,2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030.H\u0087\u0002¢\u0006\u0004\b\u0003\u00100J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u00101J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\u001a\u00102J'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\u0010-\u001a\f\u0012\u0004\u0012\u00020\u001e0\u001cj\u0002`\u001dH\u0007¢\u0006\u0004\b\u0005\u00103J\u0015\u0010\u000f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b\u000f\u0010\u0017J\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u00104J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u00104J\r\u00105\u001a\u00020\u001e¢\u0006\u0004\b5\u00106J.\u0010\u0003\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010,2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030.2\u0006\u00107\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u00108J\u000f\u00109\u001a\u00020\u0004H\u0017¢\u0006\u0004\b9\u0010\u0007J\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010-\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u00101R\u001a\u0010\u0003\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0082\u0004R&\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\u0003\u0010\b¨\u0006\u0086\u000eR&\u0010\u000e\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\u0005\u0010\r¨\u0006\u0086\u000eR&\u0010\u0010\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0003\u0010\r¨\u0006\u0086\u000eR&\u0010\u000f\u001a\u00020\u00118\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\"\u0004\b\u0003\u0010\u0014¨\u0006\u0086\u000eR(\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0005\u0010\u0017¨\u0006\u0086\u000eR(\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u0003\u0010\u0017¨\u0006\u0086\u000eR\u001d\u0010\u0015\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u0086\u0004R4\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0018\u0010 \"\u0004\b\u0003\u0010!¨\u0006\u0086\u000eR#\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010$¨\u0006\u0086\u0004R&\u0010\u001a\u001a\u00020&8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010'\u001a\u0004\b%\u0010(\"\u0004\b\u0003\u0010)¨\u0006\u0086\u000eR&\u0010\u0001\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0005\u0010\b¨\u0006\u0086\u000e"},
   d2 = {"La/ⅹ;", "ᵴἥ", "Ljava/lang/Object;", "ⲋ", "", "ĂƂ", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "Ꜥ", "Z", "()Z", "(Z)V", "u", "〥ҳⱆ", "ᴃᎲ", "La/ʞ;", "La/ʞ;", "()La/ʞ;", "(La/ʞ;)V", "ς", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "Ἒⅾ", "ϛⰄ", "Đ", "ɡ", "Lkotlin/Function0;", "La/OnBindHandler;", "", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "La/ᵭ;", "La/ᵭ;", "()La/ᵭ;", "ⲡ", "", "I", "()I", "(I)V", "", "()Ljava/util/List;", "", "p0", "Lkotlin/reflect/KProperty;", "p1", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "(Ljava/lang/String;)La/ⅹ;", "()La/ⅹ;", "(Lkotlin/jvm/functions/Function0;)La/ⅹ;", "(Ljava/lang/Object;)La/ⅹ;", "Ɏ", "()V", "p2", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "T"}
)
public final class ⅹ<T> {
   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable Function0<Unit> var1) {
      this.Ἒⅾ = var1;
   }

   private static boolean lIIlIllIl(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final boolean 〥ҳⱆ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final Function0<Unit> Ἒⅾ() {
      return this.Ἒⅾ;
   }

   @NotNull
   public final ⅹ<T> ĂƂ(@NotNull Function0<Unit> var1) {
      this.〥ҳⱆ = (boolean)lIIIIllI[0];
      this.Ἒⅾ = var1;
      return this;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      this.Ꜥ = var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final String ĂƂ() {
      return this.ĂƂ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(@Nullable T var1) {
      this.ς = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      this.ⲡ = var1;
   }

   private static boolean lIIlIlIlI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIIlIlIIl() {
      lIIIIllI = new int[7];
      lIIIIllI[0] = " ".length();
      lIIIIllI[1] = (61 ^ 94) & ~(14 ^ 109);
      lIIIIllI[2] = "  ".length();
      lIIIIllI[3] = "   ".length();
      lIIIIllI[4] = 38 ^ 34;
      lIIIIllI[5] = 86 ^ 51 ^ 199 ^ 167;
      lIIIIllI[6] = 159 + 121 - 155 + 48 ^ 70 + 137 - 103 + 61;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull String var1) {
      this.ĂƂ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ᵭ<T> ⲋ() {
      return this.ⲋ;
   }

   @NotNull
   public final T ⲋ(@Nullable Object var1, @NotNull KProperty<?> var2) {
      return this.ⲋ.ⲋ();
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable T var1) {
      this.ϛⰄ = var1;
   }

   @NotNull
   public final ⅹ<T> Đ() {
      this.Ꜥ = (boolean)lIIIIllI[0];
      return this;
   }

   private static boolean lIIlIllII(int var0, int var1) {
      return var0 < var1;
   }

   public final void ⲋ(@Nullable Object var1, @NotNull KProperty<?> var2, @NotNull T var3) {
      this.ⲋ.ⲋ(var3);
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final boolean Ꜥ() {
      return this.Ꜥ;
   }

   public final void 〥ҳⱆ(@NotNull Object lllIlIllIIIIlll) {
      if (lIIlIlIlI(lllIlIllIIIlIII.u, ʞ.〥ҳⱆ)) {
         Class var2 = lllIlIllIIIlIII.ᵴἥ.getClass();
         Object[] var3 = var2.getEnumConstants();
         if (lIIlIlIll(lllIlIllIIIIlll instanceof String)) {
            int lllIlIllIIIIIlI = lIIIIllI[1];
            int var8 = lIIIIllI[1];
            Object[] lllIlIlIlllllll = var3;
            int lllIlIlIllllllI = var3.length;
            int lllIlIlIlllllIl = lIIIIllI[1];

            Object var10000;
            while(true) {
               if (!lIIlIllII(lllIlIlIlllllIl, lllIlIlIllllllI)) {
                  var10000 = null;
                  break;
               }

               char lllIlIlIlllllII = lllIlIlIlllllll[lllIlIlIlllllIl];
               String lllIlIlIllllIlI = lIIIIllI[1];
               if (lIIlIlIll(Intrinsics.areEqual((Object)lllIlIlIlllllII.toString(), (Object)lllIlIllIIIIlll))) {
                  var10000 = lllIlIlIlllllII;
                  "".length();
                  if (-"   ".length() >= 0) {
                     return;
                  }
                  break;
               }

               ++lllIlIlIlllllIl;
               "".length();
               if ((216 ^ 145 ^ 14 ^ 66) == 0) {
                  return;
               }
            }

            char lllIlIllIIIIlII = var10000;
            if (lIIlIllIl(lllIlIllIIIIlII)) {
               lllIlIllIIIIIlI = lIIIIllI[1];
               int lllIlIllIIIIIIl = lIIIIllI[1];
               char lllIlIlIlllllll = lIIIIllI[1];
               lllIlIllIIIlIII.ⲋ.ⲋ(lllIlIllIIIIlII);
               "".length();
               if (-"   ".length() >= 0) {
                  return;
               }
            } else {
               "".length();
               "".length();
               if (null != null) {
                  return;
               }
            }
         }
      } else {
         if (lIIlIlIlI(lllIlIllIIIlIII.u, ʞ.ⲋ) && lIIlIlIll(lllIlIllIIIIlll instanceof Boolean)) {
            lllIlIllIIIlIII.ⲋ.ⲋ(lllIlIllIIIIlll);
         }

         if (lIIlIlIlI(lllIlIllIIIlIII.u, ʞ.ĂƂ) && lIIlIlIll(lllIlIllIIIIlll instanceof Integer)) {
            lllIlIllIIIlIII.ⲋ.ⲋ(lllIlIllIIIIlll);
         }

         if (lIIlIlIlI(lllIlIllIIIlIII.u, ʞ.u) && lIIlIlIll(lllIlIllIIIIlll instanceof Double)) {
            lllIlIllIIIlIII.ⲋ.ⲋ(lllIlIllIIIIlll);
         }

         if (lIIlIlIlI(lllIlIllIIIlIII.u, ʞ.ᴃᎲ) && lIIlIlIll(lllIlIllIIIIlll instanceof String)) {
            lllIlIllIIIlIII.ⲋ.ⲋ(lllIlIllIIIIlll);
         }

         ᵭ var16;
         if (lIIlIlIlI(lllIlIllIIIlIII.u, ʞ.ϛⰄ) && lIIlIlIll(TypeIntrinsics.isMutableList(lllIlIllIIIIlll))) {
            var16 = lllIlIllIIIlIII.ⲋ;
            if (lIIlIlllI(lllIlIllIIIIlll)) {
               throw new TypeCastException(lIIIIlIl[lIIIIllI[1]]);
            }

            var16.ⲋ(lllIlIllIIIIlll);
         }

         if (lIIlIlIlI(lllIlIllIIIlIII.u, ʞ.Ἒⅾ)) {
            if (lIIlIlIll(lllIlIllIIIIlll instanceof Color)) {
               lllIlIllIIIlIII.ⲋ.ⲋ(lllIlIllIIIIlll);
               "".length();
               if ((79 + 74 - 87 + 85 ^ 65 + 145 - 81 + 18) == 0) {
                  return;
               }
            } else if (lIIlIlIll(lllIlIllIIIIlll instanceof String)) {
               var16 = lllIlIllIIIlIII.ⲋ;
               Color var10001 = ҋ.ⲋ.ⲋ((String)lllIlIllIIIIlll);
               if (lIIlIlllI(var10001)) {
                  throw new TypeCastException(lIIIIlIl[lIIIIllI[0]]);
               }

               var16.ⲋ((Object)var10001);
            }
         }
      }

   }

   @NotNull
   public final ⅹ<T> ᴃᎲ(@NotNull String var1) {
      this.ᴃᎲ = var1;
      return this;
   }

   @JvmName(
      name = "u"
   )
   public final ʞ u() {
      return this.u;
   }

   static {
      lIIlIlIIl();
      lIIlIlIII();
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final T ϛⰄ() {
      return this.ϛⰄ;
   }

   private static boolean lIIlIlIll(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(@NotNull String var1) {
      this.ᴃᎲ = var1;
   }

   @NotNull
   public String toString() {
      // $FF: Couldn't be decompiled
   }

   @JvmName(
      name = "ς"
   )
   public final T ς() {
      return this.ς;
   }

   private static void lIIlIlIII() {
      lIIIIlIl = new String[lIIIIllI[5]];
      lIIIIlIl[lIIIIllI[1]] = lIIlIIllI("Qq9df9vVdv3IArHg3xQTUYBTVY94sMedVJCwVBV8C7CKVwx1Z6qVWw==", "TrOjj");
      lIIIIlIl[lIIIIllI[0]] = lIIlIIllI("e2YYNhbtw9HZYZZD+pNFSCbuJ4XPBqgJaje7MB7c3s14xPG4/rlV+w==", "rPgSu");
      lIIIIlIl[lIIIIllI[2]] = lIIlIIlll("pHK+oVQ2riiJhi5HJmbzQxV2gTYPpFwNA4xtqMuTVUdsUZJXpRqj+hH1XMZUUAqMIPF86eaHOr4=", "LeAEQ");
      lIIIIlIl[lIIIIllI[3]] = lIIlIIllI("HUpaqpYItj8=", "AmBgv");
      lIIIIlIl[lIIIIllI[4]] = lIIlIIlll("2xVXNH8ByQI=", "ihFyM");
   }

   @NotNull
   public final ⅹ<T> u(@NotNull T var1) {
      this.ϛⰄ = var1;
      return this;
   }

   private static boolean lIIlIlllI(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "ɡ"
   )
   public final String ɡ() {
      return this.Đ;
   }

   @NotNull
   public final List<String> ᵴἥ() {
      if (lIIlIlIlI(this.u, ʞ.〥ҳⱆ)) {
         Class var15 = this.ᵴἥ.getClass();
         Object[] var2 = var15.getEnumConstants();
         int var3 = lIIIIllI[1];
         Collection lllIlIlIllIIIll = (Collection)(new ArrayList(var2.length));
         int var6 = lIIIIllI[1];
         Object[] lllIlIlIllIIIIl = var2;
         int lllIlIlIllIIIII = var2.length;
         int lllIlIlIlIlllll = lIIIIllI[1];

         do {
            if (!lIIlIllII(lllIlIlIlIlllll, lllIlIlIllIIIII)) {
               return CollectionsKt.sorted((Iterable)((List)lllIlIlIllIIIll));
            }

            int lllIlIlIlIllllI = lllIlIlIllIIIIl[lllIlIlIlIlllll];
            double lllIlIlIlIlllII = lIIIIllI[1];
            char lllIlIlIlIllIlI = lllIlIlIlIllllI.toString();
            lllIlIlIllIIIll.add(lllIlIlIlIllIlI);
            "".length();
            ++lllIlIlIlIlllll;
            "".length();
         } while(" ".length() <= (40 ^ 18 ^ 135 ^ 185));

         return null;
      } else {
         int var1 = lIIIIllI[1];
         return CollectionsKt.emptyList();
      }
   }

   private static String lIIlIIllI(String lllIlIlIlIlIIII, String lllIlIlIlIlIIIl) {
      try {
         SecretKeySpec lllIlIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIIIllI[6]), "DES");
         double lllIlIlIlIIllIl = Cipher.getInstance("DES");
         lllIlIlIlIIllIl.init(lIIIIllI[2], lllIlIlIlIlIlIl);
         return new String(lllIlIlIlIIllIl.doFinal(Base64.getDecoder().decode(lllIlIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull ʞ var1) {
      this.u = var1;
   }

   public ⅹ(@NotNull String var1, @NotNull T var2) {
      this.Đ = var1;
      this.ᵴἥ = var2;
      this.ⲋ = new ᵭ(this.ᵴἥ, (boolean)lIIIIllI[1], lIIIIllI[2], (DefaultConstructorMarker)null);
      this.ĂƂ = lIIIIlIl[lIIIIllI[3]];
      this.u = ʞ.ς;
      this.ᴃᎲ = lIIIIlIl[lIIIIllI[4]];
   }

   @JvmName(
      name = "ⲡ"
   )
   public final int ⲡ() {
      return this.ⲡ;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final String ᴃᎲ() {
      return this.ᴃᎲ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.〥ҳⱆ = var1;
   }

   private static String lIIlIIlll(String lllIlIlIlIIIlIl, String lllIlIlIlIIIlII) {
      try {
         SecretKeySpec lllIlIlIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         long lllIlIlIlIIIIII = Cipher.getInstance("Blowfish");
         lllIlIlIlIIIIII.init(lIIIIllI[2], lllIlIlIlIIlIII);
         return new String(lllIlIlIlIIIIII.doFinal(Base64.getDecoder().decode(lllIlIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @NotNull
   public final ⅹ<T> u(@NotNull String var1) {
      this.ĂƂ = var1;
      return this;
   }

   public final void Ɏ() {
      this.ⲋ.ⲋ(this.ᵴἥ);
   }

   @NotNull
   public final ⅹ<T> ᴃᎲ(@NotNull T var1) {
      this.ς = var1;
      return this;
   }
}
