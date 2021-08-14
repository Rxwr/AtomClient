package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemShield;
import net.minecraft.util.MovementInput;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\b"},
   d2 = {"La/ᶁІ;", "Lnet/minecraft/item/Item;", "p0", "", "ⲋ", "(Lnet/minecraft/item/Item;)Z", "La/ἒű;", "", "(La/ἒű;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class ᶁІ extends ⳅ {
   public ᶁІ() {
      super(llllIIIIl[llllIIIll[1]], llllIIIIl[llllIIIll[0]], ı５.ᴃᎲ, llllIIIll[1], (boolean)llllIIIll[1], (boolean)llllIIIll[1], llllIIIll[2], (DefaultConstructorMarker)null);
   }

   static {
      lIIIIIlIlll();
      lIIIIIlIIlI();
   }

   private static void lIIIIIlIlll() {
      llllIIIll = new int[5];
      llllIIIll[0] = " ".length();
      llllIIIll[1] = (59 ^ 108 ^ 171 ^ 196) & (121 + 102 - 53 + 7 ^ 15 + 87 - 32 + 67 ^ -" ".length());
      llllIIIll[2] = 173 ^ 149;
      llllIIIll[3] = "  ".length();
      llllIIIll[4] = 89 ^ 42 ^ 28 ^ 103;
   }

   private static String lIIIIIlIIIl(String lIllIllllIlllll, String lIllIllllIllIIl) {
      lIllIllllIlllll = new String(Base64.getDecoder().decode(lIllIllllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIllIllllIlllIl = new StringBuilder();
      char lIllIllllIlIlll = lIllIllllIllIIl.toCharArray();
      float lIllIllllIlIllI = llllIIIll[1];
      short lIllIllllIlIlIl = lIllIllllIlllll.toCharArray();
      short lIllIllllIlIlII = lIllIllllIlIlIl.length;
      int lIllIllllIlIIll = llllIIIll[1];

      do {
         if (!lIIIIIllIll(lIllIllllIlIIll, lIllIllllIlIlII)) {
            return String.valueOf(lIllIllllIlllIl);
         }

         String lIllIllllIlIIlI = lIllIllllIlIlIl[lIllIllllIlIIll];
         lIllIllllIlllIl.append((char)(lIllIllllIlIIlI ^ lIllIllllIlIlll[lIllIllllIlIllI % lIllIllllIlIlll.length]));
         "".length();
         ++lIllIllllIlIllI;
         ++lIllIllllIlIIll;
         "".length();
      } while(-"  ".length() <= 0);

      return null;
   }

   private static void lIIIIIlIIlI() {
      llllIIIIl = new String[llllIIIll[3]];
      llllIIIIl[llllIIIll[1]] = lIIIIIIllII("h12WL4SqbcU=", "YGdiG");
      llllIIIIl[llllIIIll[0]] = lIIIIIlIIIl("KBAuDyAWFjhZJh0QPxgsFkIqGjERDSUKZR4QJBRlCw4kDiwWBWsAKg1CLxYyFkw=", "xbKyE");
   }

   @ȵ
   public final void ⲋ(@NotNull ἒű var1) {
      if (lIIIIIllIII(this.ɡ().field_71439_g.func_184587_cr()) && lIIIIIllIII(this.ⲋ(this.ɡ().field_71439_g.func_184607_cu().field_151002_e)) && lIIIIIllIIl(this.ɡ().field_71439_g.func_184218_aH())) {
         MovementInput var10000 = var1.ᴃᎲ();
         var10000.field_78902_a *= 5.0F;
         var10000 = var1.ᴃᎲ();
         var10000.field_192832_b *= 5.0F;
      }

   }

   private static boolean lIIIIIllIIl(int var0) {
      return var0 == 0;
   }

   private final boolean ⲋ(Item var1) {
      int var10000;
      if (lIIIIIllIIl(var1 instanceof ItemFood) && lIIIIIllIIl(var1 instanceof ItemBow) && lIIIIIllIIl(var1 instanceof ItemPotion) && !lIIIIIllIII(var1 instanceof ItemShield)) {
         var10000 = llllIIIll[1];
      } else {
         var10000 = llllIIIll[0];
         "".length();
         if ((102 ^ 98) <= 0) {
            return (boolean)((147 ^ 188) & ~(37 ^ 10));
         }
      }

      return (boolean)var10000;
   }

   private static boolean lIIIIIllIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIIIIIllIll(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIIIIIllII(String lIllIlllllIllIl, String lIllIlllllIlllI) {
      try {
         int lIllIlllllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlllllIlllI.getBytes(StandardCharsets.UTF_8)), llllIIIll[4]), "DES");
         Cipher lIllIllllllIIIl = Cipher.getInstance("DES");
         lIllIllllllIIIl.init(llllIIIll[3], lIllIlllllIlIll);
         return new String(lIllIllllllIIIl.doFinal(Base64.getDecoder().decode(lIllIlllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
