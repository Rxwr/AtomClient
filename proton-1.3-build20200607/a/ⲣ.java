package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL20;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0007\u0018\u0000 \u00012\u00020\u0015:\u0001\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u000e\u0010\u0010J\r\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010R\u001d\u0010\u0001\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u0004R&\u0010\n\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\n\u0010\f¨\u0006\u0086\u000eR&\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000b\"\u0004\b\b\u0010\f¨\u0006\u0086\u000eR\u001d\u0010\r\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0086\u0004R&\u0010\u000e\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\u0001\u0010\u000b\"\u0004\b\u0001\u0010\f¨\u0006\u0086\u000e"},
   d2 = {"La/ⲣ;", "ⲋ", "", "Ἒⅾ", "Ljava/lang/String;", "ϛⰄ", "()Ljava/lang/String;", "", "u", "I", "ĂƂ", "()I", "(I)V", "ᴃᎲ", "〥ҳⱆ", "", "()V", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", ""}
)
public final class ⲣ {
   private static boolean lIIllllIlIl(int var0) {
      return var0 == 0;
   }

   public final void ᴃᎲ() {
      GL20.glUseProgram(this.ᴃᎲ);
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final String ϛⰄ() {
      return this.Ἒⅾ;
   }

   static {
      lIIllllIlII();
      lIIllllIIll();
      ⲋ = new ⲣ.ⲋ((DefaultConstructorMarker)null);
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final int ĂƂ() {
      return this.u;
   }

   public final void 〥ҳⱆ() {
      GL20.glUseProgram(lIIlIlIIlI[0]);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      this.ĂƂ = var1;
   }

   private static String lIIllllIIlI(String lIlIIllIllIIIll, String lIlIIllIllIIIlI) {
      try {
         SecretKeySpec lIlIIllIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short lIlIIllIllIIIII = Cipher.getInstance("Blowfish");
         lIlIIllIllIIIII.init(lIIlIlIIlI[6], lIlIIllIllIlIII);
         return new String(lIlIIllIllIIIII.doFinal(Base64.getDecoder().decode(lIlIIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "u"
   )
   public final int u() {
      return this.ᴃᎲ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return this.ĂƂ;
   }

   private static void lIIllllIIll() {
      lIIlIlIIII = new String[lIIlIlIIlI[5]];
      lIIlIlIIII[lIIlIlIIlI[0]] = lIIllllIIlI("W1XdIeDAu7OF3WDfvchs0XIbRPDDfQivrf288kT+tGg=", "Jygzj");
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(int var1) {
      this.u = var1;
   }

   public ⲣ(@NotNull String var1, @NotNull String var2) {
      this.〥ҳⱆ = var1;
      this.Ἒⅾ = var2;
      this.ĂƂ = ⲋ.ⲋ(this.〥ҳⱆ, lIIlIlIIlI[1]);
      this.u = ⲋ.ⲋ(this.Ἒⅾ, lIIlIlIIlI[2]);
      this.ᴃᎲ = GL20.glCreateProgram();
      GL20.glAttachShader(this.ᴃᎲ, this.ĂƂ);
      GL20.glAttachShader(this.ᴃᎲ, this.u);
      GL20.glLinkProgram(this.ᴃᎲ);
      if (lIIllllIlIl(GL20.glGetProgrami(this.ᴃᎲ, lIIlIlIIlI[3]))) {
         a.〥ҳⱆ.〥ҳⱆ.ⲋ().error(String.valueOf((new StringBuilder()).append(lIIlIlIIII[lIIlIlIIlI[0]]).append(GL20.glGetProgramInfoLog(this.ᴃᎲ, lIIlIlIIlI[4]))));
      }

   }

   @JvmName(
      name = "u"
   )
   public final void u(int var1) {
      this.ᴃᎲ = var1;
   }

   private static void lIIllllIlII() {
      lIIlIlIIlI = new int[7];
      lIIlIlIIlI[0] = (71 ^ 83) & ~(82 ^ 70);
      lIIlIlIIlI[1] = -20617 & '\udbb9';
      lIIlIlIIlI[2] = -(-600 & 5727) & -16393 & '\udf3f';
      lIIlIlIIlI[3] = -(-10721 & 28142) & -8225 & '\uefaf';
      lIIlIlIIlI[4] = -(-475 & 18910) & -12809 & 31743;
      lIIlIlIIlI[5] = " ".length();
      lIIlIlIIlI[6] = "  ".length();
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final String Ἒⅾ() {
      return this.〥ҳⱆ;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\tB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"},
      d2 = {"La/ⲣ$ⲋ;", "", "p0", "", "p1", "ⲋ", "(Ljava/lang/String;I)I", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private static String lIlIIlIlIIl(String lIlIIIIllllIIIl, String lIlIIIIllllIIII) {
         lIlIIIIllllIIIl = new String(Base64.getDecoder().decode(lIlIIIIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lIlIIIIlllIllll = new StringBuilder();
         float lIlIIIIlllIlIIl = lIlIIIIllllIIII.toCharArray();
         short lIlIIIIlllIlIII = lIIlllIIlI[1];
         float lIlIIIIlllIIlll = lIlIIIIllllIIIl.toCharArray();
         long lIlIIIIlllIIllI = lIlIIIIlllIIlll.length;
         int lIlIIIIlllIIlIl = lIIlllIIlI[1];

         do {
            if (!lIlIlIIIllI(lIlIIIIlllIIlIl, lIlIIIIlllIIllI)) {
               return String.valueOf(lIlIIIIlllIllll);
            }

            char lIlIIIIllllIIlI = lIlIIIIlllIIlll[lIlIIIIlllIIlIl];
            lIlIIIIlllIllll.append((char)(lIlIIIIllllIIlI ^ lIlIIIIlllIlIIl[lIlIIIIlllIlIII % lIlIIIIlllIlIIl.length]));
            "".length();
            ++lIlIIIIlllIlIII;
            ++lIlIIIIlllIIlIl;
            "".length();
         } while(-" ".length() != (159 ^ 155));

         return null;
      }

      private static boolean lIlIlIIIllI(int var0, int var1) {
         return var0 < var1;
      }

      private static void lIlIlIIIlII() {
         lIIlllIIlI = new int[5];
         lIIlllIIlI[0] = -105 & '诩';
         lIIlllIIlI[1] = (19 + 122 - 128 + 115 ^ 41 + 65 - 20 + 58) & (92 ^ 65 ^ 96 ^ 109 ^ -" ".length());
         lIIlllIIlI[2] = -27651 & 28150;
         lIIlllIIlI[3] = -" ".length();
         lIIlllIIlI[4] = " ".length();
      }

      private ⲋ() {
      }

      private static void lIlIIlIlIlI() {
         lIIllIllIl = new String[lIIlllIIlI[4]];
         lIIllIllIl[lIIlllIIlI[1]] = lIlIIlIlIIl("OwQ6Fi9YBSAOaxsEIgoiFA5vCSMZDyoIcQ==", "xkOzK");
      }

      public final int ⲋ(@NotNull String var1, int var2) {
         int var3 = GL20.glCreateShader(var2);
         GL20.glShaderSource(var3, (CharSequence)var1);
         GL20.glCompileShader(var3);
         if (lIlIlIIIlIl(GL20.glGetShaderi(var3, lIIlllIIlI[0]))) {
            a.〥ҳⱆ.〥ҳⱆ.ⲋ().error(String.valueOf((new StringBuilder()).append(lIIllIllIl[lIIlllIIlI[1]]).append(GL20.glGetShaderInfoLog(var3, lIIlllIIlI[2]))));
            return lIIlllIIlI[3];
         } else {
            return var3;
         }
      }

      static {
         lIlIlIIIlII();
         lIlIIlIlIlI();
      }

      private static boolean lIlIlIIIlIl(int var0) {
         return var0 == 0;
      }
   }
}
