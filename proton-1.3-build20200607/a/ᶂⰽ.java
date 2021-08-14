package a;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.io.TextStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004"},
   d2 = {"La/ᶂⰽ;", "", "p0", "ⲋ", "(Ljava/lang/String;)Ljava/lang/String;", "ĂƂ", "<init>", "()V", ""}
)
public final class ᶂⰽ {
   private static boolean lIIIllIII(Object var0) {
      return var0 != null;
   }

   private static String lIIIIlIIl(String lllIlIlllllIIlI, String lllIlIlllllIIll) {
      try {
         long lllIlIlllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllIlIlllllIllI = Cipher.getInstance("Blowfish");
         lllIlIlllllIllI.init(lllllll[3], lllIlIlllllIIII);
         return new String(lllIlIlllllIllI.doFinal(Base64.getDecoder().decode(lllIlIlllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIIllIIl(int var0, int var1) {
      return var0 < var1;
   }

   @NotNull
   public final String ⲋ(@NotNull String var1) {
      URLConnection var10000 = (new URL(var1)).openConnection();
      if (lIIIlIlll(var10000)) {
         throw new TypeCastException(lllIlIl[lllllll[0]]);
      } else {
         HttpsURLConnection var2 = (HttpsURLConnection)var10000;
         var2.setConnectTimeout(lllllll[1]);
         var2.setRequestMethod(lllIlIl[lllllll[2]]);
         var2.setRequestProperty(lllIlIl[lllllll[3]], lllIlIl[lllllll[4]]);
         var2.connect();
         return TextStreamsKt.readText((Reader)(new InputStreamReader(var2.getInputStream())));
      }
   }

   @Nullable
   public final String ĂƂ(@NotNull String lllIllIIIlIIlIl) {
      String lllIllIIIlIIlII;
      try {
         String var8;
         label23: {
            lllIllIIIlIIlII = String.valueOf((new StringBuilder()).append(lllIlIl[lllllll[5]]).append(lllIllIIIlIIlIl).append(lllIlIl[lllllll[6]]));
            String lllIllIIIlIIIll = lllIllIIIlIIllI.ⲋ(lllIllIIIlIIlII);
            short lllIllIIIlIIIlI = (new JsonParser()).parse(lllIllIIIlIIIll);
            Exception lllIllIIIlIIIIl = lllIllIIIlIIIlI.getAsJsonArray();
            JsonElement var10000 = lllIllIIIlIIIIl.get(lllIllIIIlIIIIl.size() - lllllll[2]);
            if (lIIIllIII(var10000)) {
               JsonObject var7 = var10000.getAsJsonObject();
               if (lIIIllIII(var7)) {
                  var10000 = var7.get(lllIlIl[lllllll[7]]);
                  if (lIIIllIII(var10000)) {
                     var8 = var10000.getAsString();
                     "".length();
                     if ((51 ^ 0 ^ 31 ^ 40) == "  ".length()) {
                        return null;
                     }
                     break label23;
                  }
               }
            }

            "".length();
            var8 = null;
         }

         lllIllIIIlIIlII = var8;
      } catch (Exception var6) {
         lllIllIIIlIIlII = null;
         return lllIllIIIlIIlII;
      }

      "".length();
      if ((58 ^ 62) <= " ".length()) {
         return null;
      } else {
         return lllIllIIIlIIlII;
      }
   }

   private static void lIIIlIllI() {
      lllllll = new int[10];
      lllllll[0] = "   ".length() & ~"   ".length();
      lllllll[1] = -9265 & 14264;
      lllllll[2] = " ".length();
      lllllll[3] = "  ".length();
      lllllll[4] = "   ".length();
      lllllll[5] = 155 ^ 159;
      lllllll[6] = 107 ^ 110;
      lllllll[7] = 120 ^ 126;
      lllllll[8] = 70 ^ 65;
      lllllll[9] = 6 ^ 14;
   }

   private ᶂⰽ() {
   }

   static {
      lIIIlIllI();
      lIIIlIlIl();
      ᶂⰽ var0 = new ᶂⰽ();
      ⲋ = var0;
   }

   private static String lIIIIlIll(String lllIllIIIIIlIIl, String lllIllIIIIIIIll) {
      lllIllIIIIIlIIl = new String(Base64.getDecoder().decode(lllIllIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllIllIIIIIIlll = new StringBuilder();
      char[] lllIllIIIIIIllI = lllIllIIIIIIIll.toCharArray();
      int lllIllIIIIIIlIl = lllllll[0];
      short lllIlIlllllllll = lllIllIIIIIlIIl.toCharArray();
      byte lllIlIllllllllI = lllIlIlllllllll.length;
      int lllIlIlllllllIl = lllllll[0];

      do {
         if (!lIIIllIIl(lllIlIlllllllIl, lllIlIllllllllI)) {
            return String.valueOf(lllIllIIIIIIlll);
         }

         boolean lllIlIlllllllII = lllIlIlllllllll[lllIlIlllllllIl];
         lllIllIIIIIIlll.append((char)(lllIlIlllllllII ^ lllIllIIIIIIllI[lllIllIIIIIIlIl % lllIllIIIIIIllI.length]));
         "".length();
         ++lllIllIIIIIIlIl;
         ++lllIlIlllllllIl;
         "".length();
      } while((82 ^ 86) > -" ".length());

      return null;
   }

   private static boolean lIIIlIlll(Object var0) {
      return var0 == null;
   }

   private static String lIIIIllII(String lllIllIIIIllIIl, String lllIllIIIIlIllI) {
      try {
         SecretKeySpec lllIllIIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), lllllll[9]), "DES");
         Cipher lllIllIIIIllIll = Cipher.getInstance("DES");
         lllIllIIIIllIll.init(lllllll[3], lllIllIIIIlllII);
         return new String(lllIllIIIIllIll.doFinal(Base64.getDecoder().decode(lllIllIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIIlIlIl() {
      lllIlIl = new String[lllllll[8]];
      lllIlIl[lllllll[0]] = lIIIIlIIl("aiQaqYFlZy0Pl9HmDuODN4iexE+UuH5mA7pgkCKj4KsJVRROqRWW/d8sUtNiNkufH4uE1O8E4Mt98PlJzcU4hSBmoUwGI/v+", "hzqFU");
      lllIlIl[lllllll[2]] = lIIIIlIIl("OH+D2c8XkO4=", "UnEsY");
      lllIlIl[lllllll[3]] = lIIIIlIll("EgAiNF0GFCIoBA==", "GsGFp");
      lllIlIl[lllllll[4]] = lIIIIlIll("Bzs5DSsmNWxRaXp0aykmKT0tECg5PHhEEnF0CgozLzhjKSYpdAw3ZxJ0clRpfm9jASlnARBfZzgieVVpc3pxSnVjdAQBJCE7bFZ3e2RzV3Z8dAUNNS8yLBxoeXp1SnU=", "JTCdG");
      lllIlIl[lllllll[5]] = lIIIIllII("7uNdVR/v+q/owzO/TZam/PAiDxpJszfUIQcXQP7dM/g15YTggVdLvg==", "lucEQ");
      lllIlIl[lllllll[6]] = lIIIIllII("LknsVO9eGt0=", "lsqqi");
      lllIlIl[lllllll[7]] = lIIIIlIIl("dLpwIo4DQkQ=", "IopBj");
   }
}
