package a;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0086\u0004\"\u001b\u0010\u0005\u001a\u00020\u0004*\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u0004"},
   d2 = {"", "Lnet/minecraft/client/entity/EntityPlayerSP;", "ⲋ", "(Lnet/minecraft/client/entity/EntityPlayerSP;)F", "", "ĂƂ", "(Lnet/minecraft/client/entity/EntityPlayerSP;)Z"}
)
public final class ῷ {
   static {
      llIIIIIIlI();
      llIIIIIIIl();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public static final boolean ĂƂ(@NotNull EntityPlayerSP var0) {
      Iterable var10000 = var0.func_184193_aE();
      if (llIIIIIIll(var10000)) {
         throw new TypeCastException(lIllIllll[lIlllIIII[0]]);
      } else {
         return Intrinsics.areEqual((Object)((ItemStack)((List)var10000).get(lIlllIIII[1])).field_151002_e, (Object)Items.field_185160_cR);
      }
   }

   private static boolean llIIIIIIll(Object var0) {
      return var0 == null;
   }

   private static boolean llIIIIIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static void llIIIIIIIl() {
      lIllIllll = new String[lIlllIIII[2]];
      lIllIllll[lIlllIIII[0]] = llIIIIIIII("LxkpDlMiDSsMHDVMJwdTIg02FlM1A2UMHC9BKxcfLUwxGwMkTC4NBy0FK0wQLgApBxA1BSoMAG8gLBEHfQIgFl0sBSsHEDMNIxZdKBggD10IGCAPIDUNJglN", "AlEbs");
   }

   @JvmName(
      name = "ⲋ"
   )
   public static final float ⲋ(@NotNull EntityPlayerSP var0) {
      return var0.func_110143_aJ() + var0.func_110139_bj();
   }

   private static void llIIIIIIlI() {
      lIlllIIII = new int[3];
      lIlllIIII[0] = (142 ^ 154 ^ 167 ^ 174) & (48 + 99 - 133 + 122 ^ 12 + 123 - -11 + 3 ^ -" ".length());
      lIlllIIII[1] = "  ".length();
      lIlllIIII[2] = " ".length();
   }

   private static String llIIIIIIII(String llIIlIlIllIIllI, String llIIlIlIllIlIlI) {
      llIIlIlIllIIllI = new String(Base64.getDecoder().decode(llIIlIlIllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIIlIlIllIlIIl = new StringBuilder();
      char[] llIIlIlIllIlIII = llIIlIlIllIlIlI.toCharArray();
      short llIIlIlIllIIIlI = lIlllIIII[0];
      byte llIIlIlIllIIIIl = llIIlIlIllIIllI.toCharArray();
      double llIIlIlIllIIIII = llIIlIlIllIIIIl.length;
      int llIIlIlIlIlllll = lIlllIIII[0];

      do {
         if (!llIIIIIlII(llIIlIlIlIlllll, llIIlIlIllIIIII)) {
            return String.valueOf(llIIlIlIllIlIIl);
         }

         Exception llIIlIlIlIllllI = llIIlIlIllIIIIl[llIIlIlIlIlllll];
         llIIlIlIllIlIIl.append((char)(llIIlIlIlIllllI ^ llIIlIlIllIlIII[llIIlIlIllIIIlI % llIIlIlIllIlIII.length]));
         "".length();
         ++llIIlIlIllIIIlI;
         ++llIIlIlIlIlllll;
         "".length();
      } while(((70 ^ 127 ^ 4 ^ 45) & (82 ^ 89 ^ 41 ^ 50 ^ -" ".length())) == 0);

      return null;
   }
}
