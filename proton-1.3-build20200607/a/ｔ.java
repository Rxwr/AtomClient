package a;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u000fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0006\u0010\rR&\u0010\u0006\u001a\u00020\u00018\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0096\u000e"},
   d2 = {"La/ｔ;", "", "u", "Ljava/lang/String;", "ꙑứ", "()Ljava/lang/String;", "ⲋ", "(Ljava/lang/String;)V", "La/ⅵ;", "p0", "", "p1", "", "(La/ⅵ;I)V", "<init>", "La/Ṃ;"}
)
public final class ｔ extends Ṃ {
   private static boolean llllIIIIlI(int var0) {
      return var0 != 0;
   }

   private static boolean llllIIIlII(int var0, int var1) {
      return var0 < var1;
   }

   public ｔ(@NotNull String var1) {
      super(var1, (Ҿ)null, Ὴ.ⲋ.ⲋ().ϛⰄ(), (boolean)lllIIIIII[0], lllIIIIII[3], (DefaultConstructorMarker)null);
      this.u = var1;
   }

   public void ⲋ(@NotNull ⅵ var1, int var2) {
      super.ⲋ(var1, var2);
      if (llllIIIIlI(Desktop.isDesktopSupported()) && llllIIIIlI(Desktop.getDesktop().isSupported(Action.BROWSE))) {
         String lIllllIllIlIlII = this.ꙑứ();
         if (llllIIIIll(StringsKt.startsWith$default(lIllllIllIlIlII, llIlllllI[lllIIIIII[0]], (boolean)lllIIIIII[0], lllIIIIII[1], (Object)null))) {
            lIllllIllIlIlII = String.valueOf((new StringBuilder()).append(llIlllllI[lllIIIIII[2]]).append(lIllllIllIlIlII));
         }

         Desktop.getDesktop().browse(new URI(lIllllIllIlIlII));
      }

   }

   @JvmName(
      name = "ꙑứ"
   )
   public String ꙑứ() {
      return this.u;
   }

   private static void lllIllllll() {
      llIlllllI = new String[lllIIIIII[1]];
      llIlllllI[lllIIIIII[0]] = lllIlllllI("Iz4MHQ==", "KJxmy");
      llIlllllI[lllIIIIII[2]] = lllIlllllI("Iy4VICFxdU4=", "KZaPR");
   }

   static {
      llllIIIIIl();
      lllIllllll();
   }

   @JvmName(
      name = "ⲋ"
   )
   public void ⲋ(@NotNull String var1) {
      this.u = var1;
   }

   private static void llllIIIIIl() {
      lllIIIIII = new int[4];
      lllIIIIII[0] = (65 ^ 47 ^ 105 ^ 27) & (97 + 119 - 110 + 36 ^ 134 + 119 - 238 + 131 ^ -" ".length());
      lllIIIIII[1] = "  ".length();
      lllIIIIII[2] = " ".length();
      lllIIIIII[3] = 148 ^ 174 ^ 156 ^ 172;
   }

   private static String lllIlllllI(String lIllllIlIllIlll, String lIllllIlIllIIIl) {
      lIllllIlIllIlll = new String(Base64.getDecoder().decode(lIllllIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIllllIlIllIlIl = new StringBuilder();
      boolean lIllllIlIlIllll = lIllllIlIllIIIl.toCharArray();
      String lIllllIlIlIllIl = lllIIIIII[0];
      float lIllllIlIlIllII = lIllllIlIllIlll.toCharArray();
      short lIllllIlIlIlIlI = lIllllIlIlIllII.length;
      int lIllllIlIlIlIIl = lllIIIIII[0];

      do {
         if (!llllIIIlII(lIllllIlIlIlIIl, lIllllIlIlIlIlI)) {
            return String.valueOf(lIllllIlIllIlIl);
         }

         char lIllllIlIlllIIl = lIllllIlIlIllII[lIllllIlIlIlIIl];
         lIllllIlIllIlIl.append((char)(lIllllIlIlllIIl ^ lIllllIlIlIllll[lIllllIlIlIllIl % lIllllIlIlIllll.length]));
         "".length();
         ++lIllllIlIlIllIl;
         ++lIllllIlIlIlIIl;
         "".length();
      } while("  ".length() > -" ".length());

      return null;
   }

   private static boolean llllIIIIll(int var0) {
      return var0 == 0;
   }
}
