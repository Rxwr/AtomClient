package a;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020)B\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0004\u0010!J\u0017\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0004\u0010\"J\u0017\u0010\u000b\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u000b\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$J%\u0010\u0004\u001a\u00020\u001b2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u001a¢\u0006\u0004\b\u0004\u0010%J\u000f\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010\u0014\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0014\u0010$R\u001a\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004R&\u0010\u000b\u001a\u00020\u00058\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\u0004\u0010\n¨\u0006\u0096\u000eR#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0002\u0010\u0010¨\u0006\u0086\u0004R\u001a\u0010\u0002\u001a\u00020\u00118W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0012¨\u0006\u0096\u0004R\u001d\u0010\u0014\u001a\u00020\u00138\u0007@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016¨\u0006\u0086\u0004RJ\u0010\u000e\u001a2\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u001a0\u0017j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u001a`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001c¨\u0006\u0082\u000e"},
   d2 = {"La/Ė;", "La/ⱙ;", "ᴃᎲ", "La/ⱙ;", "ⲋ", "La/ʁᎴ;", "u", "La/ʁᎴ;", "ς", "()La/ʁᎴ;", "(La/ʁᎴ;)V", "ĂƂ", "La/ᵭ;", "", "Ἒⅾ", "La/ᵭ;", "()La/ᵭ;", "La/ė;", "()La/ė;", "", "〥ҳⱆ", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ⲋ;", "Lkotlin/Function1;", "La/ToggleHandler;", "", "Ljava/util/ArrayList;", "La/ⅵ;", "p0", "", "p1", "(La/ⅵ;I)V", "(La/ⅵ;)V", "b_", "()V", "(Lkotlin/jvm/functions/Function1;)V", "ⴜ", "<init>", "(Ljava/lang/String;La/ᵭ;)V", "La/Ữ;"}
)
public final class Ė extends Ữ {
   public void ⲋ(@NotNull ⅵ var1, int var2) {
      super.ⲋ(var1, var2);
      if (lIIlllIlIll(var2)) {
         this.〥ҳⱆ();
      }

   }

   @JvmName(
      name = "ĂƂ"
   )
   public final String ĂƂ() {
      return this.〥ҳⱆ;
   }

   public Ė(@NotNull String var1, @NotNull ᵭ<Boolean> var2) {
      this.〥ҳⱆ = var1;
      this.Ἒⅾ = var2;
      this.ⲋ = new ArrayList();
      this.u = (ʁᎴ)(new Ꮱ((Β)null, new Β(lIIlIIlIII[2], lIIlIIlIII[3], lIIlIIlIII[2], lIIlIIlIII[3]), (л)null, (Ⴝ)null, (boolean)lIIlIIlIII[1], (boolean)lIIlIIlIII[1], lIIlIIlIII[4], (DefaultConstructorMarker)null));
      this.ĂƂ((Ữ)(new Ṃ(this.〥ҳⱆ, (Ҿ)null, (Color)null, (boolean)lIIlIIlIII[1], lIIlIIlIII[5], (DefaultConstructorMarker)null)));
      this.ᴃᎲ = (new ⱙ()).u(ſ.ⲋ(Ὴ.ⲋ.ⲋ().u(), lIIlIIlIII[1])).ᴃᎲ(Ὴ.ⲋ.ⲋ().u()).Ἒⅾ(0.1D);
   }

   @JvmName(
      name = "ς"
   )
   public ʁᎴ ς() {
      return this.u;
   }

   private final void 〥ҳⱆ() {
      ᵭ var10000 = lIlIlIIIIlIlIIl.Ἒⅾ;
      int var10001;
      if (lIIlllIlIll((Boolean)lIlIlIIIIlIlIIl.Ἒⅾ.ⲋ())) {
         var10001 = lIIlIIlIII[0];
         "".length();
         if (-" ".length() >= " ".length()) {
            return;
         }
      } else {
         var10001 = lIIlIIlIII[1];
      }

      var10000.ⲋ((Object)Boolean.valueOf((boolean)var10001));
      double lIlIlIIIIlIlIII = (Iterable)lIlIlIIIIlIlIIl.ⲋ;
      char lIlIlIIIIlIIlll = lIIlIIlIII[1];
      Iterator lIlIlIIIIlIIllI = lIlIlIIIIlIlIII.iterator();

      do {
         if (!lIIlllIlIlI(lIlIlIIIIlIIllI.hasNext())) {
            return;
         }

         byte lIlIlIIIIlIIlIl = lIlIlIIIIlIIllI.next();
         byte lIlIlIIIIlIIlII = (Function1)lIlIlIIIIlIIlIl;
         byte lIlIlIIIIlIIIll = lIIlIIlIII[1];
         lIlIlIIIIlIIlII.invoke(lIlIlIIIIlIlIIl.Ἒⅾ.ⲋ());
         "".length();
         "".length();
      } while(null == null);

   }

   private static boolean lIIlllIlIlI(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   public void ⲋ(@NotNull ʁᎴ var1) {
      this.u = var1;
   }

   private static boolean lIIlllIlIll(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ᵭ<Boolean> ᴃᎲ() {
      return this.Ἒⅾ;
   }

   public void ⲋ(@NotNull ⅵ var1) {
      super.ⲋ(var1);
      this.ᴃᎲ.ⴜ();
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return ⱉȬ.ᴃᎲ.ⲋ().u(this.〥ҳⱆ);
   }

   public void b_() {
      if (lIIlllIlIlI((Boolean)lIlIlIIIIlIIIIl.Ἒⅾ.ⲋ())) {
         ⲙ.ⲋ(0.0F, 0.0F, (float)lIlIlIIIIlIIIIl.ⲡ().ⲋ(), (float)lIlIlIIIIlIIIIl.ⲡ().ĂƂ(), Ὴ.ⲋ.ⲋ().ϛⰄ());
         "".length();
         if (null != null) {
            return;
         }
      } else if (!lIIlllIlIll(lIlIlIIIIlIIIIl.ᵴἥ()) || lIIlllIlIlI(lIlIlIIIIlIIIIl.ᴃᎲ.ɡ())) {
         ⲙ.ⲋ(0.0F, 0.0F, (float)lIlIlIIIIlIIIIl.ⲡ().ⲋ(), (float)lIlIlIIIIlIIIIl.ⲡ().ĂƂ(), lIlIlIIIIlIIIIl.ᴃᎲ.ⲡ());
      }

      super.b_();
   }

   public void ĂƂ(@NotNull ⅵ var1) {
      super.ĂƂ(var1);
      this.ᴃᎲ.ͷ();
   }

   static {
      lIIlllIlIIl();
   }

   public final void ⲋ(@NotNull Function1<? super Boolean, Unit> var1) {
      this.ⲋ.add(var1);
      "".length();
   }

   public void ⴜ() {
      super.ⴜ();
      if (lIIlllIlIlI(this.ᴃᎲ.ɡ())) {
         this.Ꙗ();
      }

   }

   private static void lIIlllIlIIl() {
      lIIlIIlIII = new int[7];
      lIIlIIlIII[0] = " ".length();
      lIIlIIlIII[1] = (46 ^ 90 ^ 36 ^ 65) & (19 ^ 104 ^ 202 ^ 160 ^ -" ".length());
      lIIlIIlIII[2] = 109 + 146 - 201 + 99 ^ 142 + 83 - 172 + 103;
      lIIlIIlIII[3] = 144 + 71 - 107 + 68 ^ 157 + 55 - 200 + 174;
      lIIlIIlIII[4] = 149 + 88 - 131 + 76 ^ 5 + 1 - -26 + 107;
      lIIlIIlIII[5] = (106 ^ 111) & ~(38 ^ 35) ^ 22 ^ 24;
      lIIlIIlIII[6] = "  ".length();
   }
}
