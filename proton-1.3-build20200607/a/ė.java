package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00012\u00020\u000f:\u0001\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\nJ\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0005J$\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0001\u0010\rJ\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\nJ\u0018\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0004\b\u0001\u0010\u0015J\u0018\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0001\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0001\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0001\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR&\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\b\u0010\u0007¨\u0006\u0086\u000e"},
   d2 = {"La/ė;", "ⲋ", "", "ĂƂ", "I", "()I", "u", "(I)V", "ᴃᎲ", "p0", "(La/ė;)La/ė;", "〥ҳⱆ", "p1", "(II)La/ė;", "(I)La/ė;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "(D)La/ė;", "", "toString", "()Ljava/lang/String;", "<init>", "(II)V"}
)
public final class ė {
   public final int 〥ҳⱆ() {
      return this.u;
   }

   public final int ᴃᎲ() {
      return this.ĂƂ;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final int ĂƂ() {
      return this.u;
   }

   public ė(int var1, int var2) {
      this.ĂƂ = var1;
      this.u = var2;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(int var1) {
      this.u = var1;
   }

   @NotNull
   public final ė ⲋ(int var1, int var2) {
      return new ė(var1, var2);
   }

   public int hashCode() {
      return this.ĂƂ * llllIllI[4] + this.u;
   }

   @NotNull
   public String toString() {
      return String.valueOf((new StringBuilder()).append(llllIIlI[llllIllI[1]]).append(this.ĂƂ).append(llllIIlI[llllIllI[0]]).append(this.u).append(llllIIlI[llllIllI[2]]));
   }

   public ė() {
      this(llllIllI[1], llllIllI[1], llllIllI[3], (DefaultConstructorMarker)null);
   }

   public boolean equals(@Nullable Object var1) {
      if (lIIIIllllI(this, var1)) {
         if (lIIIIlllIl(var1 instanceof ė)) {
            ė var2 = (ė)var1;
            if (lIIIIlllll(this.ĂƂ, var2.ĂƂ) && lIIIIlllll(this.u, var2.u)) {
               return (boolean)llllIllI[0];
            }
         }

         return (boolean)llllIllI[1];
      } else {
         return (boolean)llllIllI[0];
      }
   }

   private static void lIIIIlllII() {
      llllIllI = new int[6];
      llllIllI[0] = " ".length();
      llllIllI[1] = (195 ^ 174 ^ 45 ^ 2) & (163 ^ 158 ^ 92 + 65 - 53 + 23 ^ -" ".length());
      llllIllI[2] = "  ".length();
      llllIllI[3] = "   ".length();
      llllIllI[4] = 149 + 55 - 145 + 115 ^ 124 + 51 - -1 + 1;
      llllIllI[5] = 69 ^ 77;
   }

   private static boolean lIIIIlllll(int var0, int var1) {
      return var0 == var1;
   }

   static {
      lIIIIlllII();
      lIIIIllIlI();
      ⲋ = new ė.ⲋ((DefaultConstructorMarker)null);
      ᴃᎲ = new ė(llllIllI[1], llllIllI[1], llllIllI[3], (DefaultConstructorMarker)null);
   }

   @NotNull
   public final ė ⲋ(double var1) {
      return new ė((int)((double)this.ĂƂ * var1), (int)((double)this.u * var1));
   }

   private static String lIIIIllIII(String llIllIIlIIIIIII, String llIllIIIlllllll) {
      try {
         SecretKeySpec llIllIIlIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIlllllll.getBytes(StandardCharsets.UTF_8)), llllIllI[5]), "DES");
         Cipher llIllIIlIIIIlII = Cipher.getInstance("DES");
         llIllIIlIIIIlII.init(llllIllI[2], llIllIIlIIIIlIl);
         return new String(llIllIIlIIIIlII.doFinal(Base64.getDecoder().decode(llIllIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @NotNull
   public final ė ⲋ(@NotNull ė var1) {
      return new ė(this.ĂƂ + var1.ĂƂ, this.u + var1.u);
   }

   @NotNull
   public final ė u(@NotNull ė var1) {
      return this.ⲋ(var1);
   }

   private static boolean lIIIIlllIl(int var0) {
      return var0 != 0;
   }

   private static void lIIIIllIlI() {
      llllIIlI = new String[llllIllI[3]];
      llllIIlI[llllIllI[1]] = lIIIIlIIll("NX4nQM5JpEM=", "zXweB");
      llllIIlI[llllIllI[0]] = lIIIIlIIll("+r6i3y4AZek=", "jKQvf");
      llllIIlI[llllIllI[2]] = lIIIIllIII("Q0OJg84T41I=", "jlOZc");
   }

   @NotNull
   public final ė ⲋ(int var1) {
      return new ė(this.ĂƂ * var1, this.u * var1);
   }

   @NotNull
   public final ė ĂƂ(int var1) {
      return new ė(this.ĂƂ / var1, this.u / var1);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final int ⲋ() {
      return this.ĂƂ;
   }

   @NotNull
   public final ė ĂƂ(@NotNull ė var1) {
      return new ė(this.ĂƂ - var1.ĂƂ, this.u - var1.u);
   }

   private static boolean lIIIIllllI(Object var0, Object var1) {
      return var0 != var1;
   }

   @JvmName(
      name = "u"
   )
   public final void u(int var1) {
      this.ĂƂ = var1;
   }

   private static String lIIIIlIIll(String llIllIIIlllIlIl, String llIllIIIlllIIlI) {
      try {
         SecretKeySpec llIllIIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String llIllIIIlllIIII = Cipher.getInstance("Blowfish");
         llIllIIIlllIIII.init(llllIllI[2], llIllIIIllllIII);
         return new String(llIllIIIlllIIII.doFinal(Base64.getDecoder().decode(llIllIIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004"},
      d2 = {"La/ė$ⲋ;", "La/ė;", "ᴃᎲ", "La/ė;", "ⲋ", "()La/ė;", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private ⲋ() {
      }

      @JvmName(
         name = "ⲋ"
      )
      public final ė ⲋ() {
         return ė.ᴃᎲ;
      }
   }
}
