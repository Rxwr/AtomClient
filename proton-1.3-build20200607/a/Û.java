package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00012\u00020!:\u0001\u0001B\u0007¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0007\u0010\u0017J\u001f\u0010\u0001\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0001\u0010\u001bJ\u0017\u0010\u0001\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0001\u0010\u001cJ\u0017\u0010\t\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\t\u0010\u001cJ\u0017\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0005\u0010\u001cJ\u0017\u0010\u000b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000b\u0010\u001cJ\u001f\u0010\u000b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u000b\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0001\u001a\u00020\u00028W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0096\u0004R\u001a\u0010\u0005\u001a\u00020\u00028W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0004¨\u0006\u0096\u0004R\u001d\u0010\u000b\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0086\u0004R&\u0010\t\u001a\u00020\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u0001\u0010\u000f¨\u0006\u0086\u000eR&\u0010\u0007\u001a\u00020\u00108\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u000b\u0010\u0014¨\u0006\u0086\u000e"},
   d2 = {"La/Û;", "ⲋ", "La/ė;", "Ꞑ", "()La/ė;", "ĂƂ", "La/ⱙ;", "〥ҳⱆ", "La/ⱙ;", "ᴃᎲ", "()La/ⱙ;", "u", "", "D", "()D", "(D)V", "", "Ἒⅾ", "Z", "()Z", "(Z)V", "La/ⅵ;", "p0", "(La/ⅵ;)La/ⅵ;", "", "p1", "", "(La/ⅵ;I)V", "(La/ⅵ;)V", "b_", "()V", "ⴜ", "<init>", "La/Ữ;"}
)
public final class Û extends Ữ {
   static {
      lIIIlllIl();
      lIIIlllII();
      ⲋ = new Û.ⲋ((DefaultConstructorMarker)null);
   }

   private static boolean lIIIllllI(Object var0) {
      return var0 != null;
   }

   public void b_() {
      Ḥ lllIlIlllIlIIIl = lllIlIlllIlIIlI.Ⳓ();
      Iterable var2 = (Iterable)lllIlIlllIlIIlI.ϛⰄ();
      int var3 = lIIIIIlI[0];
      Iterator lllIlIlllIIlllI = var2.iterator();

      do {
         if (!lIIlIIIlI(lllIlIlllIIlllI.hasNext())) {
            return;
         }

         label34: {
            long lllIlIlllIIllIl = lllIlIlllIIlllI.next();
            byte lllIlIlllIIllII = (Ữ)lllIlIlllIIllIl;
            double lllIlIlllIIlIll = lIIIIIlI[0];
            if (lIIlIIlII(ⲙ.ⲋ.ⲋ(lllIlIlllIIllII))) {
               String var10000;
               if (lIIIllllI(lllIlIlllIlIIIl)) {
                  var10000 = lllIlIlllIlIIIl.Ἠ();
                  "".length();
                  if ("   ".length() == ((35 ^ 119) & ~(43 ^ 127))) {
                     return;
                  }
               } else {
                  "".length();
                  var10000 = null;
               }

               if (!lIIlIIIlI(Intrinsics.areEqual((Object)var10000, (Object)lIIIIIIl[lIIIIIlI[0]]))) {
                  break label34;
               }
            }

            GL11.glTranslated((double)lllIlIlllIIllII.Ꜥ().ⲋ(), (double)lllIlIlllIIllII.Ꜥ().ĂƂ() + lllIlIlllIlIIlI.ᴃᎲ, 0.0D);
            a.ᴃᎲ.u.ⲋ(String.valueOf((new StringBuilder()).append(lllIlIlllIIllII.getClass().getSimpleName()).append(lIIIIIIl[lIIIIIlI[2]])));
            lllIlIlllIIllII.b_();
            a.ᴃᎲ.u.ĂƂ(String.valueOf((new StringBuilder()).append(lllIlIlllIIllII.getClass().getSimpleName()).append(lIIIIIIl[lIIIIIlI[4]])));
            if (lIIlIIIlI(ⱉȬ.ᴃᎲ.ɡ())) {
               Ữ.ⲋ.ⲋ(lllIlIlllIIllII);
            }

            GL11.glTranslated(-((double)lllIlIlllIIllII.Ꜥ().ⲋ()), -((double)lllIlIlllIIllII.Ꜥ().ĂƂ()) - lllIlIlllIlIIlI.ᴃᎲ, 0.0D);
         }

         "".length();
      } while((104 ^ 73 ^ 20 ^ 48) != 0);

   }

   private static void lIIIlllII() {
      lIIIIIIl = new String[lIIIIIlI[1]];
      lIIIIIIl[lIIIIIlI[0]] = lIIIllIlI("Mww2BjwNAzsF", "dmOvS");
      lIIIIIIl[lIIIIIlI[2]] = lIIIllIlI("TE0BPwgTGQo0KA==", "vwnQZ");
      lIIIIIIl[lIIIIIlI[4]] = lIIIllIll("JP6aYLzB9+Yvrq/GLNg9dw==", "GhZPT");
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return this.ᴃᎲ;
   }

   public void ⴜ() {
      super.ⴜ();
      if (lIIlIIIlI(lllIlIlllIlllII.〥ҳⱆ.ɡ())) {
         double lllIlIlllIllIll = lllIlIlllIlllII.〥ҳⱆ.Ꜥ();
         if (lIIlIIIlI(lllIlIlllIlllII.Ἒⅾ)) {
            lllIlIlllIllIll *= (double)lIIIIIlI[3];
         }

         lllIlIlllIlllII.ᴃᎲ += lllIlIlllIllIll;
      }

      int var10000;
      int var5;
      label33: {
         var10000 = -lllIlIlllIlllII.ⲡ().ĂƂ();
         Ữ var10001 = lllIlIlllIlllII.Ἒⅾ();
         if (lIIIllllI(var10001)) {
            ė var4 = var10001.ⲡ();
            if (lIIIllllI(var4)) {
               var5 = var4.ĂƂ();
               "".length();
               if (null != null) {
                  return;
               }
               break label33;
            }
         }

         "".length();
         var5 = lIIIIIlI[0];
      }

      Exception lllIlIlllIllIll = var10000 + var5;
      if (lIIlIIIlI(lllIlIlllIlllII.Ἒⅾ() instanceof Ḥ)) {
         lllIlIlllIllIll -= (int)30.0D;
      }

      if (lIIlIIIll(lIIlIIIII(lllIlIlllIlllII.ᴃᎲ, (double)lllIlIlllIllIll))) {
         lllIlIlllIlllII.ᴃᎲ = (double)lllIlIlllIllIll;
      }

      if (lIIIlllll(lIIlIIIIl(lllIlIlllIlllII.ᴃᎲ, 0.0D))) {
         lllIlIlllIlllII.ᴃᎲ = 0.0D;
      }

   }

   private static String lIIIllIlI(String lllIlIlllIIIIII, String lllIlIllIlllIlI) {
      lllIlIlllIIIIII = new String(Base64.getDecoder().decode(lllIlIlllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIlIllIlllllI = new StringBuilder();
      char lllIlIllIlllIII = lllIlIllIlllIlI.toCharArray();
      char lllIlIllIllIlll = lIIIIIlI[0];
      long lllIlIllIllIllI = lllIlIlllIIIIII.toCharArray();
      double lllIlIllIllIlIl = lllIlIllIllIllI.length;
      int lllIlIllIllIlII = lIIIIIlI[0];

      do {
         if (!lIIlIIlIl(lllIlIllIllIlII, lllIlIllIllIlIl)) {
            return String.valueOf(lllIlIllIlllllI);
         }

         float lllIlIllIllIIll = lllIlIllIllIllI[lllIlIllIllIlII];
         lllIlIllIlllllI.append((char)(lllIlIllIllIIll ^ lllIlIllIlllIII[lllIlIllIllIlll % lllIlIllIlllIII.length]));
         "".length();
         ++lllIlIllIllIlll;
         ++lllIlIllIllIlII;
         "".length();
      } while(((85 + 39 - -10 + 30 ^ 19 + 28 - 29 + 145) & (83 + 33 - 54 + 76 ^ 123 + 4 - 17 + 31 ^ -" ".length())) >= 0);

      return null;
   }

   private static void lIIIlllIl() {
      lIIIIIlI = new int[6];
      lIIIIIlI[0] = (15 ^ 28) & ~(22 ^ 5);
      lIIIIIlI[1] = "   ".length();
      lIIIIIlI[2] = " ".length();
      lIIIIIlI[3] = -" ".length();
      lIIIIIlI[4] = "  ".length();
      lIIIIIlI[5] = 114 ^ 122;
   }

   public void ĂƂ(@NotNull ⅵ var1) {
      super.ĂƂ(this.〥ҳⱆ(var1));
   }

   public void ⲋ(@NotNull ⅵ var1) {
      super.ⲋ(this.〥ҳⱆ(var1));
   }

   private final ⅵ 〥ҳⱆ(ⅵ var1) {
      ė var2 = new ė(var1.ⲋ().ⲋ(), var1.ⲋ().ĂƂ() - (int)this.ᴃᎲ);
      return new ⅵ(var2, var1.ĂƂ());
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(double var1) {
      this.ᴃᎲ = var1;
   }

   private static int lIIlIIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIlIIlII(int var0) {
      return var0 == 0;
   }

   public void u(@NotNull ⅵ var1, int var2) {
      super.u(var1, var2);
      if (lIIIlllll(var2)) {
         lllIlIllllIIIIl.Ἒⅾ = (boolean)lIIIIIlI[0];
         lllIlIllllIIIIl.〥ҳⱆ.ͷ();
         "".length();
         if (-" ".length() != -" ".length()) {
            return;
         }
      } else {
         lllIlIllllIIIIl.Ἒⅾ = (boolean)lIIIIIlI[2];
         lllIlIllllIIIIl.〥ҳⱆ.ͷ();
      }

   }

   public Û() {
      ⱙ var1 = new ⱙ();
      int var2 = lIIIIIlI[0];
      int var3 = lIIIIIlI[0];
      int var5 = lIIIIIlI[0];
      var1.ᴃᎲ(0.0D);
      "".length();
      var1.〥ҳⱆ(0.75D);
      "".length();
      var1.Ἒⅾ(0.25D);
      "".length();
      this.〥ҳⱆ = var1;
   }

   private static String lIIIllIll(String lllIlIllIlIlIll, String lllIlIllIlIlIII) {
      try {
         SecretKeySpec lllIlIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIllIlIlIII.getBytes(StandardCharsets.UTF_8)), lIIIIIlI[5]), "DES");
         Cipher lllIlIllIlIllIl = Cipher.getInstance("DES");
         lllIlIllIlIllIl.init(lIIIIIlI[4], lllIlIllIlIlllI);
         return new String(lllIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lllIlIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      Ữ var10000 = this.Ἒⅾ();
      ė var1;
      if (lIIIllllI(var10000)) {
         var1 = var10000.ⲋ();
         if (lIIIllllI(var1)) {
            "".length();
            if (-" ".length() > 0) {
               return null;
            }

            return var1;
         }
      }

      "".length();
      var1 = new ė(lIIIIIlI[0], lIIIIIlI[0], lIIIIIlI[1], (DefaultConstructorMarker)null);
      return var1;
   }

   public void ᴃᎲ(@NotNull ⅵ var1) {
      super.ᴃᎲ(this.〥ҳⱆ(var1));
   }

   @JvmName(
      name = "Ꞑ"
   )
   public ė Ꞑ() {
      return (new ė(lIIIIIlI[0], (int)this.ᴃᎲ)).u(super.Ꞑ());
   }

   private static boolean lIIlIIIll(int var0) {
      return var0 < 0;
   }

   private static int lIIlIIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIlIIIlI(int var0) {
      return var0 != 0;
   }

   private static boolean lIIlIIlIl(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ⱙ ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   public void ⲋ(@NotNull ⅵ var1, int var2) {
      super.ⲋ(this.〥ҳⱆ(var1), var2);
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final boolean 〥ҳⱆ() {
      return this.Ἒⅾ;
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      this.Ἒⅾ = var1;
   }

   public void u(@NotNull ⅵ var1) {
      super.u(this.〥ҳⱆ(var1));
   }

   private static boolean lIIIlllll(int var0) {
      return var0 > 0;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0086T"},
      d2 = {"La/Û$ⲋ;", "", "ⲋ", "D", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private ⲋ() {
      }
   }
}
