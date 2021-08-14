package a;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0005\u0010\u0007R$\u0010\u0005\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0082\u0004"},
   d2 = {"La/ⲋ;", "", "Ljava/util/UUID;", "ĂƂ", "Ljava/util/List;", "ⲋ", "", "()Z", "<init>", "()V", ""}
)
public final class ⲋ {
   private static boolean llIIlIIl(Object var0) {
      return var0 != null;
   }

   public final boolean ⲋ() {
      EntityPlayerSP var10000 = Minecraft.func_71410_x().field_71439_g;
      if (llIIlIIl(var10000)) {
         NetHandlerPlayClient var2 = var10000.field_71174_a;
         if (llIIlIIl(var2)) {
            GameProfile var3 = var2.func_175105_e();
            if (llIIlIIl(var3)) {
               UUID var4 = var3.getId();
               if (llIIlIIl(var4)) {
                  "".length();
                  if (-(104 ^ 108) >= 0) {
                     return (boolean)((155 ^ 141) & ~(88 ^ 78));
                  }

                  UUID var1 = var4;
                  return ĂƂ.contains(var1);
               }
            }
         }
      }

      "".length();
      return (boolean)lIlIllI[0];
   }

   private static void llIIIIlI() {
      lIlIlIl = new String[lIlIllI[1]];
      lIlIlIl[lIlIllI[0]] = lIllllll("E2ubDXyQnbUSryQ8UKlq0wMhlFJE8XkEYhmoesceDQEmaHMzKK27Yw==", "QtRXi");
   }

   private static void llIIlIII() {
      lIlIllI = new int[4];
      lIlIllI[0] = (81 ^ 102 ^ 11 ^ 43) & (44 ^ 74 ^ 83 ^ 34 ^ -" ".length());
      lIlIllI[1] = " ".length();
      lIlIllI[2] = 201 ^ 193;
      lIlIllI[3] = "  ".length();
   }

   private ⲋ() {
   }

   private static String lIllllll(String llllIIlIllIIllI, String llllIIlIllIIlII) {
      try {
         SecretKeySpec llllIIlIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), lIlIllI[2]), "DES");
         Cipher llllIIlIllIlIII = Cipher.getInstance("DES");
         llllIIlIllIlIII.init(lIlIllI[3], llllIIlIllIlIll);
         return new String(llllIIlIllIlIII.doFinal(Base64.getDecoder().decode(llllIIlIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      llIIlIII();
      llIIIIlI();
      ⲋ var0 = new ⲋ();
      ⲋ = var0;
      ĂƂ = CollectionsKt.listOf(UUID.fromString(lIlIlIl[lIlIllI[0]]));
   }
}
