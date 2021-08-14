package a;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u000eB\t\b\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\fJ\r\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b\u0002\u0010\fJ\u000f\u0010\t\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082TR\u001a\u0010\u0002\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0082\u000eR\u001e\u0010\t\u001a\u0006*\u00020\b0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0082\u0004"},
   d2 = {"La/ĂƂ;", "", "ĂƂ", "J", "ⲋ", "", "ᴃᎲ", "Z", "Lclub/minnced/discord/rpc/DiscordRPC;", "u", "Lclub/minnced/discord/rpc/DiscordRPC;", "", "()V", "<init>", ""}
)
public final class ĂƂ {
   public final void ĂƂ() {
      ᴃᎲ = (boolean)llIIlIlIl[1];
   }

   private ĂƂ() {
   }

   private static void llIlIlIIll() {
      llIIlIlIl = new int[9];
      llIIlIlIl[0] = (111 ^ 75) & ~(60 ^ 24);
      llIIlIlIl[1] = " ".length();
      llIIlIlIl[2] = "  ".length();
      llIIlIlIl[3] = "   ".length();
      llIIlIlIl[4] = 7 + 2 - -8 + 163 ^ 19 + 44 - 19 + 132;
      llIIlIlIl[5] = 188 ^ 159 ^ 17 ^ 55;
      llIIlIlIl[6] = 253 ^ 138 ^ 230 ^ 151;
      llIIlIlIl[7] = 110 + 11 - 3 + 65 ^ 159 + 173 - 271 + 115;
      llIIlIlIl[8] = 36 ^ 44;
   }

   private static boolean llIlIlIlII(Object var0) {
      return var0 == null;
   }

   private static String llIIllllII(String llIIIllIIllIlII, String llIIIllIIllIIIl) {
      try {
         short llIIIllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte llIIIllIIlIllll = Cipher.getInstance("Blowfish");
         llIIIllIIlIllll.init(llIIlIlIl[2], llIIIllIIllIIII);
         return new String(llIIIllIIlIllll.doFinal(Base64.getDecoder().decode(llIIIllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private final void u() {
      DiscordRichPresence llIIIllIllIIlIl = new DiscordRichPresence();
      ơ߀ var3 = ơ߀.ⲋ;
      Class var4 = Ә.class;
      int var5 = llIIlIlIl[0];
      Object var10000 = var3.ⲋ().get(Ә.class);
      if (llIlIlIlII(var10000)) {
         throw new TypeCastException(llIIIlIlI[llIIlIlIl[3]]);
      } else {
         float llIIIllIllIIlII = (Ә)((ⳅ)((Ә)var10000));
         llIIIllIllIIlIl.details = llIIIllIllIIlII.ĂƂ();
         if (llIlIlIllI(ꞀⳢ.ⲋ.ϛⰄ())) {
            llIIIllIllIIlIl.state = String.valueOf((new StringBuilder()).append(llIIIlIlI[llIIlIlIl[4]]).append(ꞀⳢ.ⲋ.ⲋ()));
            "".length();
            if ((89 ^ 52 ^ 65 ^ 40) == ((134 + 29 - 129 + 161 ^ 74 + 54 - 54 + 83) & (203 ^ 190 ^ 136 ^ 163 ^ -" ".length()))) {
               return;
            }
         } else {
            llIIIllIllIIlIl.state = llIIIllIllIIlII.u();
         }

         llIIIllIllIIlIl.largeImageKey = llIIIlIlI[llIIlIlIl[5]];
         llIIIllIllIIlIl.largeImageText = llIIIlIlI[llIIlIlIl[6]];
         u.Discord_UpdatePresence(llIIIllIllIIlIl);
      }
   }

   public final void ⲋ() {
      DiscordEventHandlers var1 = new DiscordEventHandlers();
      u.Discord_Initialize(llIIIlIlI[llIIlIlIl[0]], var1, (boolean)llIIlIlIl[1], llIIIlIlI[llIIlIlIl[1]]);
      this.u();
      ᴃᎲ = (boolean)llIIlIlIl[0];
      ơ߀ var3 = ơ߀.ⲋ;
      Class var4 = Ә.class;
      int var5 = llIIlIlIl[0];
      Object var10000 = var3.ⲋ().get(Ә.class);
      if (llIlIlIlII(var10000)) {
         throw new TypeCastException(llIIIlIlI[llIIlIlIl[2]]);
      } else {
         final Ә var2 = (Ә)((ⳅ)((Ә)var10000));
         Thread var6 = new Thread((Runnable)(new Runnable() {
            private static boolean lIllIIlIl(int var0) {
               return var0 != 0;
            }

            private static boolean lIllIIlII(int var0) {
               return var0 == 0;
            }

            public final void run() {
               while(true) {
                  if (lIllIIlII(Thread.currentThread().isInterrupted())) {
                     var2.Ꜥ();
                     a.ĂƂ.ⲋ(a.ĂƂ.ⲋ).Discord_RunCallbacks();

                     label26: {
                        try {
                           Thread.sleep((long)var2.ⲋ());
                        } catch (InterruptedException var2x) {
                           break label26;
                        }

                        "".length();
                        if ((148 ^ 192 ^ 249 ^ 169) <= " ".length()) {
                           return;
                        }
                     }

                     var2.ⲡ();
                     a.ĂƂ.ⲋ.u();
                     if (!lIllIIlIl(a.ĂƂ.u(a.ĂƂ.ⲋ))) {
                        "".length();
                        if ((227 ^ 155 ^ 38 ^ 90) >= "   ".length()) {
                           continue;
                        }

                        return;
                     }

                     a.ĂƂ.ⲋ(a.ĂƂ.ⲋ).Discord_Shutdown();
                     "".length();
                     if (-" ".length() == ((27 ^ 69 ^ 6 ^ 70) & (133 + 140 - 72 + 16 ^ 104 + 77 - 7 + 25 ^ -" ".length()))) {
                        return;
                     }
                  }

                  return;
               }
            }
         }));
         var6.start();
      }
   }

   private static boolean llIlIlIllI(int var0) {
      return var0 != 0;
   }

   private static String llIIlllIll(String llIIIllIlIlIIIl, String llIIIllIlIlIIII) {
      llIIIllIlIlIIIl = new String(Base64.getDecoder().decode(llIIIllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIIIllIlIlIlII = new StringBuilder();
      float llIIIllIlIIlllI = llIIIllIlIlIIII.toCharArray();
      float llIIIllIlIIllIl = llIIlIlIl[0];
      int llIIIllIlIIllII = llIIIllIlIlIIIl.toCharArray();
      short llIIIllIlIIlIll = llIIIllIlIIllII.length;
      int llIIIllIlIIlIlI = llIIlIlIl[0];

      do {
         if (!llIlIlIlll(llIIIllIlIIlIlI, llIIIllIlIIlIll)) {
            return String.valueOf(llIIIllIlIlIlII);
         }

         char llIIIllIlIlIlll = llIIIllIlIIllII[llIIIllIlIIlIlI];
         llIIIllIlIlIlII.append((char)(llIIIllIlIlIlll ^ llIIIllIlIIlllI[llIIIllIlIIllIl % llIIIllIlIIlllI.length]));
         "".length();
         ++llIIIllIlIIllIl;
         ++llIIIllIlIIlIlI;
         "".length();
      } while(null == null);

      return null;
   }

   private static String llIIlllllI(String llIIIllIlIIIIIl, String llIIIllIIlllllI) {
      try {
         SecretKeySpec llIIIllIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllIIlllllI.getBytes(StandardCharsets.UTF_8)), llIIlIlIl[8]), "DES");
         byte llIIIllIIllllII = Cipher.getInstance("DES");
         llIIIllIIllllII.init(llIIlIlIl[2], llIIIllIlIIIlII);
         return new String(llIIIllIIllllII.doFinal(Base64.getDecoder().decode(llIIIllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void llIlIIIIll() {
      llIIIlIlI = new String[llIIlIlIl[7]];
      llIIIlIlI[llIIlIlIl[0]] = llIIlllIll("f3tkVEh/fmFVQn51YllDfXRp", "ILQlz");
      llIIIlIlI[llIIlIlIl[1]] = llIIllllII("itGqQGaw4OA=", "MLFqP");
      llIIIlIlI[llIIlIlIl[2]] = llIIlllllI("eDEpP/kv57cC9W6V+hv/IH+D/RYsABPQiIMOPg4oeTAXMxdmgrYEcGJxfLfOtXdtTxSDuJAXW79yAuO/TQE6moMpfOug+bUe15oDu5LJ7KY=", "Frzrd");
      llIIIlIlI[llIIlIlIl[3]] = llIIlllllI("gKG1JvqjVX9XT61FD59JMXqNGkbtfd+WbDbNSBgoA896xNNEjSzSAYAPWetYJAKUisihJoZhDe7Fgwph91vcHwP9ErRBRhr+ZsXoEZS89Lo=", "fEXMO");
      llIIIlIlI[llIIlIlIl[4]] = llIIlllIll("IB4qHglLSw==", "qkOkl");
      llIIIlIlI[llIIlIlIl[5]] = llIIlllllI("d/3Y1aCdl1Q=", "ldWGQ");
      llIIIlIlI[llIIlIlIl[6]] = llIIlllIll("Az04LEEgeHly", "BIWAa");
   }

   static {
      llIlIlIIll();
      llIlIIIIll();
      ĂƂ var0 = new ĂƂ();
      ⲋ = var0;
      u = DiscordRPC.INSTANCE;
   }

   private static boolean llIlIlIlll(int var0, int var1) {
      return var0 < var1;
   }
}
