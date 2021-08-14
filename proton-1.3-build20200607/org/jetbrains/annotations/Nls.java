package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE, ElementType.PACKAGE})
public @interface Nls {
   Nls.Capitalization capitalization() default Nls.Capitalization.NotSpecified;

   public static enum Capitalization {
      private static boolean lIIIllIIll(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIIIlIllIl(String llIlIlllllIIlII, String llIlIlllllIlIII) {
         llIlIlllllIIlII = new String(Base64.getDecoder().decode(llIlIlllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         int llIlIlllllIIIlI = new StringBuilder();
         char[] llIlIlllllIIllI = llIlIlllllIlIII.toCharArray();
         int llIlIlllllIIIII = lIIIIIIll[0];
         String llIlIllllIlllll = llIlIlllllIIlII.toCharArray();
         String llIlIllllIllllI = llIlIllllIlllll.length;
         int llIlIllllIlllIl = lIIIIIIll[0];

         do {
            if (!lIIIllIIll(llIlIllllIlllIl, llIlIllllIllllI)) {
               return String.valueOf(llIlIlllllIIIlI);
            }

            String llIlIllllIlllII = llIlIllllIlllll[llIlIllllIlllIl];
            llIlIlllllIIIlI.append((char)(llIlIllllIlllII ^ llIlIlllllIIllI[llIlIlllllIIIII % llIlIlllllIIllI.length]));
            "".length();
            ++llIlIlllllIIIII;
            ++llIlIllllIlllIl;
            "".length();
         } while(-" ".length() == -" ".length());

         return null;
      }

      private static String lIIIlIllII(String llIlIllllIlIIlI, String llIlIllllIlIIll) {
         try {
            SecretKeySpec llIlIllllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIllllIlIllI = Cipher.getInstance("Blowfish");
            llIlIllllIlIllI.init(lIIIIIIll[2], llIlIllllIlIlll);
            return new String(llIlIllllIlIllI.doFinal(Base64.getDecoder().decode(llIlIllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private Capitalization() {
      }

      static {
         lIIIllIIlI();
         lIIIlIlllI();
         NotSpecified = new Nls.Capitalization(lIIIIIIII[lIIIIIIll[0]], lIIIIIIll[0]);
         Title = new Nls.Capitalization(lIIIIIIII[lIIIIIIll[1]], lIIIIIIll[1]);
         Sentence = new Nls.Capitalization(lIIIIIIII[lIIIIIIll[2]], lIIIIIIll[2]);
         Nls.Capitalization[] var10000 = new Nls.Capitalization[lIIIIIIll[3]];
         var10000[lIIIIIIll[0]] = NotSpecified;
         var10000[lIIIIIIll[1]] = Title;
         var10000[lIIIIIIll[2]] = Sentence;
      }

      private static void lIIIllIIlI() {
         lIIIIIIll = new int[4];
         lIIIIIIll[0] = (253 ^ 175) & ~(236 ^ 190);
         lIIIIIIll[1] = " ".length();
         lIIIIIIll[2] = "  ".length();
         lIIIIIIll[3] = "   ".length();
      }

      private static void lIIIlIlllI() {
         lIIIIIIII = new String[lIIIIIIll[3]];
         lIIIIIIII[lIIIIIIll[0]] = lIIIlIllII("P9CJizgsCBpJ3xQDuNAPZQ==", "Mxkat");
         lIIIIIIII[lIIIIIIll[1]] = lIIIlIllII("lhGydHFOR08=", "WSRHE");
         lIIIIIIII[lIIIIIIll[2]] = lIIIlIllIl("GBQ4AiAlEjM=", "KqVvE");
      }
   }
}
