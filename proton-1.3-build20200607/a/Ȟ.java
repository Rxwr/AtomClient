package a;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u001aB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u0002\u001a\u00020\u0011¢\u0006\u0004\b\u0002\u0010\u0012J\u0017\u0010\b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\b\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\b\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u0006\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0003\u001a\u0004\b\u0006\u0010\u0005\"\u0004\b\b\u0010\u0007¨\u0006\u0086\u000eR&\u0010\t\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\t\u0010\f\"\u0004\b\b\u0010\r¨\u0006\u0086\u000eR\u001d\u0010\u0004\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\b\u0010\u0010¨\u0006\u0086\u0004"},
   d2 = {"La/Ȟ;", "", "〥ҳⱆ", "J", "ᴃᎲ", "()J", "ĂƂ", "(J)V", "ⲋ", "u", "", "I", "()I", "(I)V", "", "[F", "()[F", "", "()F", "La/ꝱᶁ;", "p0", "", "(La/ꝱᶁ;)V", "Ἒⅾ", "()V", "<init>", ""}
)
public final class Ȟ {
   private static boolean llllIllI(int var0) {
      return var0 > 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      ᴃᎲ = var1;
   }

   private static boolean llllIlIl(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(long var1) {
      u = var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final long ᴃᎲ() {
      return 〥ҳⱆ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final float[] ⲋ() {
      return ĂƂ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(long var1) {
      〥ҳⱆ = var1;
   }

   private static void llllIIlI() {
      llIlIll = new int[3];
      llIlIll[0] = (28 + 108 - 65 + 113 ^ 6 + 91 - 46 + 87) & (91 ^ 13 ^ 212 ^ 176 ^ -" ".length());
      llIlIll[1] = " ".length();
      llIlIll[2] = 111 ^ 123;
   }

   @JvmName(
      name = "u"
   )
   public final int u() {
      return ᴃᎲ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final long ĂƂ() {
      return u;
   }

   @ȵ
   public final void ⲋ(@NotNull ꝱᶁ var1) {
      〥ҳⱆ = System.currentTimeMillis();
      if (llllIIll(var1.ᴃᎲ() instanceof SPacketTimeUpdate)) {
         this.Ἒⅾ();
      }

   }

   private Ȟ() {
   }

   private static int llllIlll(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   static {
      llllIIlI();
      Ȟ var0 = new Ȟ();
      ⲋ = var0;
      ĂƂ = new float[llIlIll[2]];
      u = -1L;
   }

   public final void Ἒⅾ() {
      if (llllIIll(llllIlll(u, -1L))) {
         float var1 = (float)(System.currentTimeMillis() - u) / 1000.0F;
         ĂƂ[ᴃᎲ % ĂƂ.length] = MathHelper.func_76131_a(20.0F / var1, 0.0F, 20.0F);
         ᴃᎲ += llIlIll[1];
      }

      u = System.currentTimeMillis();
   }

   public final float 〥ҳⱆ() {
      float lllIlllIIIlllll = 0.0F;
      float lllIlllIIIllllI = 0.0F;
      float[] lllIlllIIIllIll = ĂƂ;
      int lllIlllIIIllIlI = lllIlllIIIllIll.length;
      int lllIlllIIIlllII = llIlIll[0];

      do {
         if (!llllIlIl(lllIlllIIIlllII, lllIlllIIIllIlI)) {
            return MathHelper.func_76131_a(lllIlllIIIllllI / lllIlllIIIlllll, 0.0F, 20.0F);
         }

         byte lllIlllIIIlllIl = lllIlllIIIllIll[lllIlllIIIlllII];
         if (llllIllI(llllIlII(lllIlllIIIlllIl, 0.0F))) {
            lllIlllIIIllllI += lllIlllIIIlllIl;
            ++lllIlllIIIlllll;
         }

         ++lllIlllIIIlllII;
         "".length();
      } while(-"  ".length() < 0);

      return 0.0F;
   }

   private static boolean llllIIll(int var0) {
      return var0 != 0;
   }

   private static int llllIlII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
