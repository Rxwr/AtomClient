package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\b\u0007\u0018\u0000 \u00012\u00020\u0012:\u0001\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0001\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007¨\u0006\u0086\u000eR&\u0010\t\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0003\u0010\u0007¨\u0006\u0086\u000eR&\u0010\f\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\u000b\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u000b\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\n\u0010\u0007¨\u0006\u0086\u000eR&\u0010\n\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u0004\b\t\u0010\u0007¨\u0006\u0086\u000eR&\u0010\r\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\r\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u0004\b\f\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0001\u0010\u0006\"\u0004\b\u0001\u0010\u0007¨\u0006\u0086\u000eR&\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\b\u0010\u0006\"\u0004\b\b\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000e\u0010\u0007¨\u0006\u0086\u000e"},
   d2 = {"La/Ὴ;", "ⲋ", "Ljava/awt/Color;", "ς", "Ljava/awt/Color;", "ϛⰄ", "()Ljava/awt/Color;", "(Ljava/awt/Color;)V", "Ꜥ", "ĂƂ", "〥ҳⱆ", "ᴃᎲ", "u", "Ἒⅾ", "ⲡ", "Đ", "<init>", "()V", ""}
)
public final class Ὴ {
   public Ὴ() {
      this.ĂƂ = Color.white;
      this.u = Color.white;
      this.ᴃᎲ = Color.white;
      this.〥ҳⱆ = Color.white;
      this.Ἒⅾ = Color.white;
      this.ϛⰄ = Color.white;
      this.ς = Color.white;
      this.Ꜥ = Color.white;
      this.ⲡ = Color.white;
      this.Đ = Color.white;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final Color ⲋ() {
      return this.ĂƂ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(@NotNull Color var1) {
      this.u = var1;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final void 〥ҳⱆ(@NotNull Color var1) {
      this.Ἒⅾ = var1;
   }

   @JvmName(
      name = "ⲡ"
   )
   public final Color ⲡ() {
      return this.Đ;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(@NotNull Color var1) {
      this.〥ҳⱆ = var1;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final Color Ꜥ() {
      return this.ⲡ;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final Color Ἒⅾ() {
      return this.ϛⰄ;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final void Ꜥ(@NotNull Color var1) {
      this.ⲡ = var1;
   }

   @JvmName(
      name = "ς"
   )
   public final void ς(@NotNull Color var1) {
      this.Ꜥ = var1;
   }

   @JvmName(
      name = "u"
   )
   public final Color u() {
      return this.ᴃᎲ;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final void ϛⰄ(@NotNull Color var1) {
      this.ς = var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final Color ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   static {
      lIlllIIIll();
      ⲋ = new Ὴ.ⲋ((DefaultConstructorMarker)null);
      ɡ = new Color(lIllIIIlI[0], lIllIIIlI[0], lIllIIIlI[0]);
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final Color 〥ҳⱆ() {
      return this.Ἒⅾ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final Color ĂƂ() {
      return this.u;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final void Ἒⅾ(@NotNull Color var1) {
      this.ϛⰄ = var1;
   }

   @JvmName(
      name = "u"
   )
   public final void u(@NotNull Color var1) {
      this.ᴃᎲ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull Color var1) {
      this.ĂƂ = var1;
   }

   private static void lIlllIIIll() {
      lIllIIIlI = new int[1];
      lIllIIIlI[0] = 86 ^ 22 ^ 245 ^ 135;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final Color ϛⰄ() {
      return this.ς;
   }

   @JvmName(
      name = "ς"
   )
   public final Color ς() {
      return this.Ꜥ;
   }

   @JvmName(
      name = "ⲡ"
   )
   public final void ⲡ(@NotNull Color var1) {
      this.Đ = var1;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\u0013B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\tR&\u0010\u0006\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR\u0017\u0010\n\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u0086\u0004R\u001a\u0010\u0004\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0082.R\u001a\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0082."},
      d2 = {"La/Ὴ$ⲋ;", "Ljava/awt/Color;", "ɡ", "Ljava/awt/Color;", "u", "()Ljava/awt/Color;", "ⲋ", "(Ljava/awt/Color;)V", "La/Ὴ;", "()La/Ὴ;", "ĂƂ", "Ɏ", "La/Ὴ;", "ᵴἥ", "ᴃᎲ", "", "()V", "〥ҳⱆ", "<init>", ""}
   )
   public static final class ⲋ {
      private ⲋ() {
      }

      private static void lllIIlIllI() {
         llIllIllI = new String[llIlllIIl[27]];
         llIllIllI[llIlllIIl[0]] = lllIIlIlII("5P07gqPiUdLyblJKF8oUpfdX9W8B/BKfdBuuSlKa3d+X9OpIQer/L3vw9cYvRBuC0UlZMY1dlHk5fwaNXAhUOc2p0rqZHxeo", "GGjsU");
         llIllIllI[llIlllIIl[1]] = lllIIlIlIl("L01r1YmHUR179JamHyhUng==", "RaNjF");
      }

      @JvmName(
         name = "u"
      )
      public final Color u() {
         return Ὴ.ɡ;
      }

      private static String lllIIlIlII(String llIIIIIlllllIII, String llIIIIIllllIlll) {
         try {
            SecretKeySpec llIIIIIlllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIllllIlll.getBytes(StandardCharsets.UTF_8)), llIlllIIl[28]), "DES");
            Cipher llIIIIIlllllIlI = Cipher.getInstance("DES");
            llIIIIIlllllIlI.init(llIlllIIl[27], llIIIIIlllllIll);
            return new String(llIIIIIlllllIlI.doFinal(Base64.getDecoder().decode(llIIIIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static boolean lllIIllIlI(Object var0) {
         return var0 == null;
      }

      private static boolean lllIIllIll(int var0) {
         return var0 != 0;
      }

      static {
         lllIIllIIl();
         lllIIlIllI();
      }

      public final void ĂƂ() {
         Ὴ.ᵴἥ = ((Ὴ.ⲋ)this).ᴃᎲ();
         Ὴ.Ɏ = ((Ὴ.ⲋ)this).〥ҳⱆ();
      }

      @JvmName(
         name = "ⲋ"
      )
      public final Ὴ ⲋ() {
         Ὴ.ⲋ var1 = Ὴ.ⲋ;
         int var2 = llIlllIIl[0];
         int var3 = llIlllIIl[0];
         int var5 = llIlllIIl[0];
         ơ߀ var6 = ơ߀.ⲋ;
         Class var7 = ƙＰ.class;
         int var8 = llIlllIIl[0];
         Object var10000 = var6.ⲋ().get(ƙＰ.class);
         if (lllIIllIlI(var10000)) {
            throw new TypeCastException(llIllIllI[llIlllIIl[0]]);
         } else {
            char llIIIIlIIIIIIII = (ƙＰ)((ⳅ)((ƙＰ)var10000));
            if (lllIIllIll(llIIIIlIIIIIIII.Ɏ())) {
               return llIIIIlIIIIIIII.ⲋ();
            } else {
               Ὴ var10 = Ὴ.Ɏ;
               if (lllIIllIlI(var10)) {
                  Intrinsics.throwUninitializedPropertyAccessException(llIllIllI[llIlllIIl[1]]);
               }

               return var10;
            }
         }
      }

      private final Ὴ 〥ҳⱆ() {
         Ὴ var1 = new Ὴ();
         var1.ⲋ(new Color(llIlllIIl[10], llIlllIIl[10], llIlllIIl[10]));
         var1.ĂƂ(new Color(llIlllIIl[11], llIlllIIl[12], llIlllIIl[13]));
         var1.ᴃᎲ(new Color(llIlllIIl[14], llIlllIIl[15], llIlllIIl[16]));
         var1.〥ҳⱆ(var1.ᴃᎲ().darker());
         var1.Ἒⅾ(var1.ᴃᎲ().brighter());
         var1.ϛⰄ(new Color(llIlllIIl[17], llIlllIIl[18], llIlllIIl[19]));
         var1.u(new Color(llIlllIIl[20], llIlllIIl[21], llIlllIIl[22], llIlllIIl[10]));
         var1.ς(Color.white);
         var1.Ꜥ(new Color(llIlllIIl[23], llIlllIIl[24], llIlllIIl[25]));
         var1.ⲡ(new Color(llIlllIIl[26], llIlllIIl[26], llIlllIIl[26]));
         return var1;
      }

      private static String lllIIlIlIl(String llIIIIIlllIlIIl, String llIIIIIlllIlIII) {
         try {
            String llIIIIIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIlllIllIl = Cipher.getInstance("Blowfish");
            llIIIIIlllIllIl.init(llIlllIIl[27], llIIIIIlllIIlll);
            return new String(llIIIIIlllIllIl.doFinal(Base64.getDecoder().decode(llIIIIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static void lllIIllIIl() {
         llIlllIIl = new int[29];
         llIlllIIl[0] = (194 ^ 177 ^ 64 ^ 36) & (69 ^ 38 ^ 110 ^ 26 ^ -" ".length());
         llIlllIIl[1] = " ".length();
         llIlllIIl[2] = 164 ^ 150;
         llIlllIIl[3] = 83 ^ 119 ^ 3 ^ 67;
         llIlllIIl[4] = 55 ^ 82 ^ 72 ^ 4;
         llIlllIIl[5] = (185 ^ 146) + (34 ^ 109) - (18 ^ 56) + (229 ^ 131);
         llIlllIIl[6] = 235 + 168 - 378 + 221;
         llIlllIIl[7] = 86 + 151 - 234 + 177;
         llIlllIIl[8] = 42 + 105 - 99 + 129 + (124 ^ 109) - (90 ^ 32) + 13 + 28 - 0 + 117;
         llIlllIIl[9] = (161 ^ 142) + 196 + 142 - 266 + 138 - (20 ^ 103) + (107 ^ 9);
         llIlllIIl[10] = 1 + 136 - -6 + 112;
         llIlllIIl[11] = (200 ^ 175) + 28 + 39 - -52 + 13 - (148 + 55 - -3 + 26) + 83 + 24 - 31 + 57;
         llIlllIIl[12] = 24 + 131 - 118 + 116;
         llIlllIIl[13] = 121 + 144 - 235 + 116 + (39 ^ 10) - (49 + 62 - 18 + 85) + 129 + 152 - 138 + 10;
         llIlllIIl[14] = 161 + 82 - 110 + 30 ^ 177 + 94 - 222 + 133;
         llIlllIIl[15] = 167 ^ 135;
         llIlllIIl[16] = 81 ^ 122;
         llIlllIIl[17] = 110 ^ 115;
         llIlllIIl[18] = 18 + 107 - -30 + 6;
         llIlllIIl[19] = (182 ^ 172) + (98 ^ 3) - (87 ^ 29) + 148 + 163 - 190 + 72;
         llIlllIIl[20] = 110 ^ 91;
         llIlllIIl[21] = 202 + 207 - 254 + 100 ^ 173 + 110 - 153 + 56;
         llIlllIIl[22] = 74 ^ 27;
         llIlllIIl[23] = 128 + 17 - 9 + 46 ^ 111 + 51 - 140 + 153;
         llIlllIIl[24] = 111 ^ 72;
         llIlllIIl[25] = 36 + 51 - -29 + 75 ^ 37 + 108 - 67 + 61;
         llIlllIIl[26] = 8 ^ 116 ^ 101 ^ 19;
         llIlllIIl[27] = "  ".length();
         llIlllIIl[28] = 21 ^ 29;
      }

      private final Ὴ ᴃᎲ() {
         Ὴ var1 = new Ὴ();
         var1.ⲋ(new Color(llIlllIIl[2], llIlllIIl[2], llIlllIIl[2]));
         var1.ĂƂ(new Color(llIlllIIl[3], llIlllIIl[3], llIlllIIl[3]));
         var1.ᴃᎲ(Color.white);
         var1.ϛⰄ(new Color(llIlllIIl[4], llIlllIIl[5], llIlllIIl[6], llIlllIIl[7]));
         var1.u(new Color(llIlllIIl[8], llIlllIIl[8], llIlllIIl[8]));
         var1.ς(Color.white);
         var1.Ꜥ(new Color(llIlllIIl[9], llIlllIIl[9], llIlllIIl[9]));
         return var1;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final void ⲋ(@NotNull Color var1) {
         Ὴ.ɡ = var1;
      }
   }
}
