package a;

import java.awt.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00012\u00020,:\u0001\u0001B?\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\u0017\u0010\f\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020!H\u0016¢\u0006\u0004\b\f\u0010#J\u000f\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010\u000b\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0018R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u0004R\u001d\u0010\u000b\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0086\u0004R\u001d\u0010\u000e\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0086\u0004R\u001d\u0010\f\u001a\u00020\u000f8\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0086\u0004R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0082\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0082\u000eR(\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\n\"\u0004\b\u0001\u0010\u0018¨\u0006\u0086\u000eR\u001a\u0010\u0010\u001a\u00020\u00198W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001a¨\u0006\u0096\u0004R\u0017\u0010\u001b\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0086\u0004R\u001a\u0010\u001d\u001a\u00020\u00028C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n¨\u0006\u0082\u0004R\u0017\u0010\u001f\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\n¨\u0006\u0086\u0004R\u0017\u0010 \u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n¨\u0006\u0086\u0004"},
   d2 = {"La/ꞌ;", "ⲋ", "", "ϛⰄ", "Ljava/lang/Double;", "ʅ", "()Ljava/lang/Double;", "〥ҳⱆ", "D", "ɧῙ", "()D", "ĂƂ", "ᴃᎲ", "ꙑứ", "u", "", "ς", "I", "Ἠ", "()I", "La/ᵭ;", "Ἒⅾ", "La/ᵭ;", "p0", "(D)V", "La/ė;", "()La/ė;", "Ꜥ", "ƶ", "ⲡ", "ⱯꝣѺ", "Đ", "ᵴἥ", "La/ⅵ;", "", "(La/ⅵ;)V", "b_", "()V", "p1", "p2", "p3", "p4", "<init>", "(DDLa/ᵭ;Ljava/lang/Double;I)V", "La/Ữ;"}
)
public final class ꞌ extends Ữ {
   @JvmName(
      name = "ʅ"
   )
   public final Double ʅ() {
      return this.ϛⰄ;
   }

   @JvmName(
      name = "ꙑứ"
   )
   public final double ꙑứ() {
      return this.ᴃᎲ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return this.u;
   }

   private static boolean lIllIlI(int var0) {
      return var0 != 0;
   }

   public ꞌ(double var1, double var3, @Nullable ᵭ<Double> var5, @Nullable Double var6, int var7) {
      lllllIlIIIIllll.ᴃᎲ = var1;
      lllllIlIIIIllll.〥ҳⱆ = var3;
      lllllIlIIIIllll.Ἒⅾ = var5;
      lllllIlIIIIllll.ϛⰄ = var6;
      lllllIlIIIIllll.ς = var7;
      if (lIllIIl(lllllIlIIIIllll.Ἒⅾ)) {
         int var9 = llllI[0];
         int var10 = llllI[0];
         int var12 = llllI[0];
         lllllIlIIIIllll.ĂƂ(((Number)lllllIlIIIIllll.Ἒⅾ.ⲋ()).doubleValue());
         "".length();
         if ("  ".length() == ((28 ^ 8 ^ 49 ^ 56) & (81 + 49 - 33 + 43 ^ 136 + 74 - 173 + 108 ^ -" ".length()))) {
            throw null;
         }
      } else {
         "".length();
      }

      ᵭ var10000 = lllllIlIIIIllll.Ἒⅾ;
      if (lIllIIl(var10000)) {
         var10000.ⲋ((Function1)(new Function1<ᵭ<Double>, Unit>() {
            static {
               lllIIlIlll();
            }

            public final void ⲋ(@NotNull ᵭ<Double> var1) {
               lllllIlIIIIllll.ĂƂ(((Number)var1.ⲋ()).doubleValue());
            }

            private static void lllIIlIlll() {
               llIlllIII = new int[1];
               llIlllIII[0] = " ".length();
            }
         }));
         "".length();
         if ((153 + 30 - 102 + 97 ^ 130 + 102 - 124 + 74) < 0) {
            throw null;
         }
      } else {
         "".length();
      }

   }

   @JvmName(
      name = "ⱯꝣѺ"
   )
   public final double ⱯꝣѺ() {
      Double var10000 = lllllIlIIIlllll.ϛⰄ;
      double var2;
      if (lIllIIl(var10000)) {
         var2 = var10000;
         "".length();
         if ((123 ^ 64 ^ 111 ^ 80) < 0) {
            return 0.0D;
         }
      } else {
         "".length();
         var2 = (lllllIlIIIlllll.〥ҳⱆ - lllllIlIIIlllll.ᴃᎲ) / 100.0D;
      }

      return var2;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final double 〥ҳⱆ() {
      double var1 = MathHelper.func_151237_a(this.ĂƂ() * (this.〥ҳⱆ - this.ᴃᎲ) + this.ᴃᎲ, this.ᴃᎲ, this.〥ҳⱆ);
      double var5 = var1 / this.ⱯꝣѺ();
      int var7 = llllI[0];
      double var3 = Math.floor(var5);
      return var3 * this.ⱯꝣѺ();
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final double ᴃᎲ() {
      return (this.〥ҳⱆ() - this.ᴃᎲ) / (this.〥ҳⱆ - this.ᴃᎲ);
   }

   private static boolean lIllIIl(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "ɧῙ"
   )
   public final double ɧῙ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return new ė(this.ς, Đ + (int)Ꜥ);
   }

   @JvmName(
      name = "ƶ"
   )
   private final double ƶ() {
      return (double)RangesKt.coerceAtLeast(this.ⲡ().ⲋ(), this.ς) - Ꜥ * 2.0D;
   }

   static {
      lIIllll();
      Đ = llllI[5];
      ⲡ = llllI[6];
      ⲋ = new ꞌ.ⲋ((DefaultConstructorMarker)null);
      Ꜥ = 6.0D;
      ⲡ = llllI[6];
      Đ = llllI[5];
   }

   public void b_() {
      double var1 = Ꜥ;
      ⲙ.ⲋ.ⲋ(var1, Ꜥ / 2.0D, this.ƶ(), (double)Đ, (double)Đ / 2.0D, Ὴ.ⲋ.ⲋ().u());
      ⲙ.ⲋ.ⲋ(var1, Ꜥ / 2.0D, this.ƶ() * this.ᴃᎲ(), (double)Đ, (double)Đ / 2.0D, Ὴ.ⲋ.ⲋ().ϛⰄ());
      double var3 = Ꜥ;
      double var5 = MathHelper.func_151237_a(this.ƶ() * this.ᴃᎲ(), -var3, this.ƶ());
      ⲙ.ⲋ(Color.white);
      ⲙ.ⲋ$default(var1 + var5, (double)Đ / 2.0D + var3 / 2.0D, var3, llllI[0], llllI[0], llllI[0], llllI[1], (Object)null);
      super.b_();
   }

   public void ᴃᎲ(@NotNull ⅵ var1) {
      super.ᴃᎲ(var1);
      if (lIllIlI(this.Ɏ())) {
         this.ⲋ(((double)var1.ⲋ().ⲋ() - Ꜥ) / this.ƶ());
         ᵭ var10000 = this.Ἒⅾ;
         if (lIllIIl(var10000)) {
            var10000.ⲋ((Object)this.〥ҳⱆ());
            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         } else {
            "".length();
         }
      }

   }

   private static void lIIllll() {
      llllI = new int[7];
      llllI[0] = (56 + 125 - 68 + 51 ^ 59 + 107 - 147 + 161) & (81 ^ 60 ^ 249 ^ 132 ^ -" ".length());
      llllI[1] = 37 ^ 29;
      llllI[2] = 187 + 42 - 93 + 60 ^ 32 + 1 - 8 + 167;
      llllI[3] = 112 ^ 61 ^ 105 ^ 44;
      llllI[4] = 92 ^ 76;
      llllI[5] = "   ".length();
      llllI[6] = 121 ^ 29;
   }

   private final void ĂƂ(double var1) {
      this.ⲋ((var1 - this.ᴃᎲ) / (this.〥ҳⱆ - this.ᴃᎲ));
   }

   @JvmName(
      name = "Ἠ"
   )
   public final int Ἠ() {
      return this.ς;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.u = ԥ.ⲋ.ĂƂ(var1);
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u00020\u00018\u0007@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086DR \u0010\b\u001a\u00020\u00018\u0007@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\u0086DR \u0010\u0004\u001a\u00020\t8\u0007@\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\f¨\u0006\u0086D"},
      d2 = {"La/ꞌ$ⲋ;", "", "Đ", "I", "u", "()I", "ⲋ", "ⲡ", "ĂƂ", "", "Ꜥ", "D", "()D", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      @JvmName(
         name = "u"
      )
      public final int u() {
         return ꞌ.Đ;
      }

      private ⲋ() {
      }

      @JvmName(
         name = "ⲋ"
      )
      public final double ⲋ() {
         return ꞌ.Ꜥ;
      }

      @JvmName(
         name = "ĂƂ"
      )
      public final int ĂƂ() {
         return ꞌ.ⲡ;
      }
   }
}
