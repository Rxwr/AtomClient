package a;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020+B\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\f¢\u0006\u0004\b*\u0010\u0010J%\u0010\b\u001a\u00020\u00182\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00180\u0016j\u0002`\u0017¢\u0006\u0004\b\b\u0010\u001bJ\u001f\u0010\u0004\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\u0004\u0010#J\u001f\u0010\u0004\u001a\u00020\u00182\u0006\u0010 \u001a\u00020$2\u0006\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0004\u0010%J\u0017\u0010\u0004\u001a\u00020\u00182\u0006\u0010 \u001a\u00020$H\u0016¢\u0006\u0004\b\u0004\u0010&J\u0017\u0010\b\u001a\u00020\u00182\u0006\u0010 \u001a\u00020$H\u0016¢\u0006\u0004\b\b\u0010&J\u000f\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010(R\u001a\u0010\u0004\u001a\u00020\u00018C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004R\u001a\u0010\b\u001a\u00020\u00058C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0082\u0004R\u001a\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0082\u0004R&\u0010\u0011\u001a\u00020\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0004\u0010\u0010¨\u0006\u0086\u000eR&\u0010\r\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\b\u0010\u0014\"\u0004\b\n\u0010\u0015¨\u0006\u0086\u000eR:\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a\"\u0004\b\u0004\u0010\u001b¨\u0006\u0086\u000eR\u001a\u0010\u001f\u001a\u00020\u001d8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u001e¨\u0006\u0096\u0004"},
   d2 = {"La/ðẔ;", "", "ꙑứ", "()Ljava/lang/String;", "ⲋ", "La/Ꞓ;", "ⱯꝣѺ", "()La/Ꞓ;", "ĂƂ", "La/ⱙ;", "u", "La/ⱙ;", "", "〥ҳⱆ", "I", "()I", "(I)V", "ᴃᎲ", "", "Z", "()Z", "(Z)V", "Lkotlin/Function1;", "La/OnChangeHandler;", "", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "Ἒⅾ", "La/ė;", "()La/ė;", "ϛⰄ", "p0", "", "p1", "(IC)V", "La/ⅵ;", "(La/ⅵ;I)V", "(La/ⅵ;)V", "b_", "()V", "ⴜ", "<init>", "La/Ữ;"}
)
public final class ðẔ extends Ữ {
   private static void llIIlllII() {
      llIIIIIl = new String[llIIIIll[0]];
      llIIIIIl[llIIIIll[1]] = llIIllIll("PxwQFwMdHA0E", "succf");
   }

   @JvmName(
      name = "ꙑứ"
   )
   private final String ꙑứ() {
      byte lllIIlIIllIIIII = lllIIlIIllIIIIl.ⲋ;
      String var10000;
      if (llIlIlIIl(lllIIlIIllIIIII, llIIIIll[0])) {
         var10000 = llIIIIIl[llIIIIll[1]];
         "".length();
         if (-(56 ^ 54 ^ 180 ^ 191) >= 0) {
            return null;
         }
      } else {
         if (!llIlIlIII(lllIIlIIllIIIII)) {
            throw new NoWhenBranchMatchedException();
         }

         var10000 = ᾞ.ⲋ.ⲋ(lllIIlIIllIIIIl.〥ҳⱆ);
         "".length();
         if (-" ".length() > "  ".length()) {
            return null;
         }
      }

      return var10000;
   }

   private static boolean llIlIlIlI(int var0, int var1) {
      return var0 < var1;
   }

   static {
      llIlIIlII();
      llIIlllII();
   }

   private static boolean llIlIIlll(Object var0) {
      return var0 != null;
   }

   private static void llIlIIlII() {
      llIIIIll = new int[4];
      llIIIIll[0] = " ".length();
      llIIIIll[1] = (242 ^ 181 ^ " ".length()) & (120 + 101 - 155 + 62 ^ 146 + 92 - 236 + 196 ^ -" ".length());
      llIIIIll[2] = 177 ^ 191;
      llIIIIll[3] = 88 ^ 72;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final int 〥ҳⱆ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      this.ⲋ = var1;
   }

   public void ⲋ(int lllIIlIIllIIlIl, char var2) {
      super.ⲋ(lllIIlIIllIIlIl, var2);
      if (llIlIIlIl(lllIIlIIllIIllI.ⲋ)) {
         int var10001;
         if (llIlIlIIl(lllIIlIIllIIlIl, llIIIIll[2])) {
            var10001 = llIIIIll[1];
            "".length();
            if (" ".length() <= ((4 ^ 109 ^ 61 ^ 5) & (116 ^ 84 ^ 62 ^ 79 ^ -" ".length()))) {
               return;
            }
         } else {
            var10001 = lllIIlIIllIIlIl;
         }

         lllIIlIIllIIllI.〥ҳⱆ = var10001;
         Function1 var10000 = lllIIlIIllIIllI.ᴃᎲ;
         if (llIlIIlll(var10000)) {
            Unit var3 = (Unit)var10000.invoke(lllIIlIIllIIllI.〥ҳⱆ);
            "".length();
            "".length();
            if (((21 ^ 13) & ~(41 ^ 49)) > 0) {
               return;
            }
         } else {
            "".length();
         }

         lllIIlIIllIIllI.ⲋ = (boolean)llIIIIll[1];
         lllIIlIIllIIllI.u.ͷ();
      }

   }

   private static boolean llIlIIllI(int var0, int var1) {
      return var0 != var1;
   }

   public void ⲋ(@NotNull ⅵ var1, int lllIIlIIllIlllI) {
      super.ⲋ(var1, lllIIlIIllIlllI);
      if (llIlIIlIl(lllIIlIIlllIIII.ⲋ)) {
         if (llIlIIlIl(lllIIlIIllIlllI) && llIlIIllI(lllIIlIIllIlllI, llIIIIll[0])) {
            lllIIlIIlllIIII.〥ҳⱆ = -lllIIlIIllIlllI;
            Function1 var10000 = lllIIlIIlllIIII.ᴃᎲ;
            if (llIlIIlll(var10000)) {
               Unit var3 = (Unit)var10000.invoke(lllIIlIIlllIIII.〥ҳⱆ);
               "".length();
               "".length();
               if ("   ".length() <= -" ".length()) {
                  return;
               }
            } else {
               "".length();
            }

            lllIIlIIlllIIII.ⲋ = (boolean)llIIIIll[1];
            lllIIlIIlllIIII.u.ͷ();
            "".length();
            if (((220 ^ 144) & ~(136 ^ 196)) != ((96 ^ 2) & ~(0 ^ 98))) {
               return;
            }
         }
      } else if (llIlIlIII(lllIIlIIllIlllI)) {
         lllIIlIIlllIIII.ⲋ = (boolean)llIIIIll[0];
      }

   }

   private static boolean llIlIIlIl(int var0) {
      return var0 != 0;
   }

   public ðẔ(int var1) {
      this.〥ҳⱆ = var1;
      this.u = (new ⱙ()).u(ſ.ⲋ(Ὴ.ⲋ.ⲋ().u(), llIIIIll[1])).ᴃᎲ(Ὴ.ⲋ.ⲋ().u()).Ἒⅾ(0.1D);
      this.u.ͷ();
      this.u.ς();
   }

   @JvmName(
      name = "ⱯꝣѺ"
   )
   private final Ꞓ ⱯꝣѺ() {
      return ⱉȬ.ᴃᎲ.ⲋ();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return this.ⲋ;
   }

   private static String llIIllIll(String lllIIlIIlIIllll, String lllIIlIIlIIlllI) {
      lllIIlIIlIIllll = new String(Base64.getDecoder().decode(lllIIlIIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean lllIIlIIlIIlIII = new StringBuilder();
      Exception lllIIlIIlIIIlll = lllIIlIIlIIlllI.toCharArray();
      int lllIIlIIlIIIllI = llIIIIll[1];
      boolean lllIIlIIlIIIlIl = lllIIlIIlIIllll.toCharArray();
      double lllIIlIIlIIIlII = lllIIlIIlIIIlIl.length;
      int lllIIlIIlIIIIll = llIIIIll[1];

      do {
         if (!llIlIlIlI(lllIIlIIlIIIIll, lllIIlIIlIIIlII)) {
            return String.valueOf(lllIIlIIlIIlIII);
         }

         long lllIIlIIlIIIIlI = lllIIlIIlIIIlIl[lllIIlIIlIIIIll];
         lllIIlIIlIIlIII.append((char)(lllIIlIIlIIIIlI ^ lllIIlIIlIIIlll[lllIIlIIlIIIllI % lllIIlIIlIIIlll.length]));
         "".length();
         ++lllIIlIIlIIIllI;
         ++lllIIlIIlIIIIll;
         "".length();
      } while(-" ".length() < 0);

      return null;
   }

   public ðẔ() {
      this(llIIIIll[1], llIIIIll[0], (DefaultConstructorMarker)null);
   }

   public void ĂƂ(@NotNull ⅵ var1) {
      super.ĂƂ(var1);
      if (llIlIlIII(this.ⲋ)) {
         this.u.ͷ();
      }

   }

   private static boolean llIlIlIIl(int var0, int var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      this.〥ҳⱆ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable Function1<? super Integer, Unit> var1) {
      this.ᴃᎲ = var1;
   }

   public void ⴜ() {
      super.ⴜ();
      if (llIlIIlIl(this.u.ɡ())) {
         this.Ꙗ();
      }

   }

   private static boolean llIlIlIII(int var0) {
      return var0 == 0;
   }

   public void ⲋ(@NotNull ⅵ var1) {
      super.ⲋ(var1);
      this.u.ⴜ();
   }

   public void b_() {
      int var1 = this.ⱯꝣѺ().ĂƂ(this.ꙑứ());
      ⲙ.ⲋ(0.0F, 0.0F, (float)this.ⲡ().ⲋ(), (float)this.ⲡ().ĂƂ(), this.u.ⲡ());
      Ꞓ.DefaultImpls.ⲋ$default(this.ⱯꝣѺ(), this.ⲡ().ⲋ() - var1, llIIIIll[1], Ὴ.ⲋ.ⲋ().ĂƂ(), this.ꙑứ(), (boolean)llIIIIll[1], llIIIIll[3], (Object)null);
      super.b_();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final Function1<Integer, Unit> ᴃᎲ() {
      return this.ᴃᎲ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return this.ⱯꝣѺ().u(this.ꙑứ());
   }

   public final void ĂƂ(@NotNull Function1<? super Integer, Unit> var1) {
      this.ᴃᎲ = var1;
   }
}
