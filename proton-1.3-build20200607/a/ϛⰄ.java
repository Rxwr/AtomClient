package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0007¢\u0006\u0004\b\u0003\u0010\rJ\u0015\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\u000bR#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u0004R&\u0010\u0003\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u0005\u0010\u000b¨\u0006\u0086\u000e"},
   d2 = {"La/ϛⰄ;", "Ljava/util/ArrayList;", "La/Ἒⅾ;", "ĂƂ", "Ljava/util/ArrayList;", "ⲋ", "()Ljava/util/ArrayList;", "", "u", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "()Ljava/util/List;", "p0", "", "<init>", "()V", ""}
)
public final class ϛⰄ {
   private static boolean lIIllllIII(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull String var1) {
      u = var1;
   }

   private static String lIIllIIlII(String llIlIIlllIllIll, String llIlIIlllIllIlI) {
      try {
         SecretKeySpec llIlIIlllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlllIllIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIlll[9]), "DES");
         boolean llIlIIlllIlIllI = Cipher.getInstance("DES");
         llIlIIlllIlIllI.init(lIIlIIlll[3], llIlIIlllIllllI);
         return new String(llIlIIlllIlIllI.doFinal(Base64.getDecoder().decode(llIlIIlllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllIIlI(Object var0) {
      return var0 == null;
   }

   private static boolean lIIlllIlIl(int var0) {
      return var0 > 0;
   }

   private static void lIIllIlllI() {
      lIIIllllI = new String[lIIlIIlll[9]];
      lIIIllllI[lIIlIIlll[0]] = lIIllIIIll("SuRYtrXWMpywBv00wBA0DUVFSqiridcdnSykQoiCJCsETfkwCl62HQ==", "WGvrn");
      lIIIllllI[lIIlIIlll[1]] = lIIllIIIll("gHY2ludoa6XyY9/almLigQ2XqH+9yQQ5P2P6ZK45qLONUAMkKbZasMd1DbGeYkdDM3ZRLnIGZg7AoobnEr1OQw==", "wTFxs");
      lIIIllllI[lIIlIIlll[3]] = lIIllIIlII("6xHxPVnJTeM=", "FuCFZ");
      lIIIllllI[lIIlIIlll[4]] = lIIllIIIll("kwIbeQA3674=", "EHGsY");
      lIIIllllI[lIIlIIlll[5]] = lIIllIIIll("Mo7n5djwe1Q=", "KfsgV");
      lIIIllllI[lIIlIIlll[6]] = lIIllIIlII("QPJrzVVoRdBP6XS4rAHmXyURaFQeU4oY", "vUqnq");
      lIIIllllI[lIIlIIlll[7]] = lIIllIIlIl("PR8HPzdYCA01Jg0ZHD4iWA4aPSgZAxFqZQ==", "xmuPE");
      lIIIllllI[lIIlIIlll[8]] = lIIllIIIll("pbubRcJxsjQ=", "yzhdl");
   }

   private static boolean lIIlllIllI(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ArrayList<Ἒⅾ> ⲋ() {
      return ĂƂ;
   }

   private static void lIIlllIIIl() {
      lIIlIIlll = new int[10];
      lIIlIIlll[0] = (40 + 160 - 143 + 106 ^ 117 + 121 - 212 + 120) & (119 + 100 - 91 + 7 ^ 123 + 90 - 70 + 39 ^ -" ".length());
      lIIlIIlll[1] = " ".length();
      lIIlIIlll[2] = 119 ^ 125;
      lIIlIIlll[3] = "  ".length();
      lIIlIIlll[4] = "   ".length();
      lIIlIIlll[5] = 119 + 93 - 110 + 35 ^ 65 + 32 - 52 + 96;
      lIIlIIlll[6] = 117 ^ 74 ^ 149 ^ 175;
      lIIlIIlll[7] = 35 ^ 37;
      lIIlIIlll[8] = 188 ^ 187;
      lIIlIIlll[9] = 207 ^ 189 ^ 208 ^ 170;
   }

   private static boolean lIIlllIIll(int var0) {
      return var0 != 0;
   }

   private static boolean lIIlllIlll(Object var0) {
      return var0 != null;
   }

   @NotNull
   public final List<Ἒⅾ> ĂƂ() {
      return Collections.unmodifiableList((List)ĂƂ);
   }

   private static String lIIllIIIll(String llIlIIllllIlIII, String llIlIIllllIIlll) {
      try {
         SecretKeySpec llIlIIllllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIllllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIlIIllllIlIlI = Cipher.getInstance("Blowfish");
         llIlIIllllIlIlI.init(lIIlIIlll[3], llIlIIllllIlIll);
         return new String(llIlIIllllIlIlI.doFinal(Base64.getDecoder().decode(llIlIIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public final void ĂƂ(@NotNull String llIlIlIIIIIlIIl) {
      String var3 = lIIIllllI[lIIlIIlll[0]];
      int var4 = lIIlIIlll[0];
      Regex llIlIlIIIIIlIII = new Regex(var3);
      int llIlIlIIIIIIlIl = lIIlIIlll[0];
      if (lIIlllIIlI(llIlIlIIIIIlIIl)) {
         throw new TypeCastException(lIIIllllI[lIIlIIlll[1]]);
      } else {
         int llIlIlIIIIIIllI = (CharSequence)StringsKt.trim((CharSequence)llIlIlIIIIIlIIl).toString();
         llIlIlIIIIIIlIl = lIIlIIlll[0];
         boolean llIlIlIIIIIIlII = lIIlIIlll[0];
         int llIlIlIIIIIIllI = (Iterable)llIlIlIIIIIlIII.split(llIlIlIIIIIIllI, llIlIlIIIIIIlIl);
         llIlIlIIIIIIlIl = lIIlIIlll[0];
         boolean llIlIlIIIIIIIll = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(llIlIlIIIIIIllI, lIIlIIlll[2])));
         double llIlIlIIIIIIIlI = lIIlIIlll[0];
         Iterator llIlIlIIIIIIIIl = llIlIlIIIIIIllI.iterator();

         Object llIlIlIIIIIIIII;
         String llIlIIlllllllll;
         int llIlIIllllllllI;
         String llIlIIlllllIIII;
         while(lIIlllIIll(llIlIlIIIIIIIIl.hasNext())) {
            llIlIlIIIIIIIII = llIlIlIIIIIIIIl.next();
            llIlIIlllllllll = (String)llIlIlIIIIIIIII;
            llIlIIllllllllI = lIIlIIlll[0];
            llIlIIlllllIIII = StringsKt.removePrefix(llIlIIlllllllll, (CharSequence)lIIIllllI[lIIlIIlll[3]]);
            llIlIlIIIIIIIll.add(llIlIIlllllIIII);
            "".length();
            "".length();
            if (((88 ^ 75) & ~(100 ^ 119)) != 0) {
               return;
            }
         }

         llIlIlIIIIIIllI = (Iterable)((List)llIlIlIIIIIIIll);
         llIlIlIIIIIIlIl = lIIlIIlll[0];
         llIlIlIIIIIIIll = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(llIlIlIIIIIIllI, lIIlIIlll[2])));
         llIlIlIIIIIIIlI = lIIlIIlll[0];
         llIlIlIIIIIIIIl = llIlIlIIIIIIllI.iterator();

         while(lIIlllIIll(llIlIlIIIIIIIIl.hasNext())) {
            llIlIlIIIIIIIII = llIlIlIIIIIIIIl.next();
            llIlIIlllllllll = (String)llIlIlIIIIIIIII;
            llIlIIllllllllI = lIIlIIlll[0];
            llIlIIlllllIIII = StringsKt.removeSuffix(llIlIIlllllllll, (CharSequence)lIIIllllI[lIIlIIlll[4]]);
            llIlIlIIIIIIIll.add(llIlIIlllllIIII);
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
               return;
            }
         }

         Exception llIlIlIIIIIIlll = (List)llIlIlIIIIIIIll;
         int llIlIlIIIIIIllI = (String)llIlIlIIIIIIlll.get(lIIlIIlll[0]);
         boolean llIlIlIIIIIIlII = (Iterable)llIlIlIIIIIIlll;
         boolean llIlIlIIIIIIIll = lIIlIIlll[0];
         short llIlIlIIIIIIIIl = (Collection)(new ArrayList());
         Exception llIlIlIIIIIIIII = lIIlIIlll[0];
         llIlIIllllllllI = lIIlIIlll[0];
         byte llIlIIlllllllIl = lIIlIIlll[0];
         Iterator llIlIIlllllllII = llIlIlIIIIIIlII.iterator();

         int var10000;
         while(lIIlllIIll(llIlIIlllllllII.hasNext())) {
            int llIlIIllllllIll = llIlIIlllllllII.next();
            byte llIlIIllllllIlI = llIlIIlllllllIl++;
            float llIlIIllllllIIl = lIIlIIlll[0];
            if (lIIlllIlII(llIlIIllllllIlI)) {
               CollectionsKt.throwIndexOverflow();
            }

            int llIlIIlllllIlIl = lIIlIIlll[0];
            char llIlIIlllllIlII = (String)llIlIIllllllIll;
            byte llIlIIlllllIIlI = lIIlIIlll[0];
            if (lIIlllIlIl(llIlIIllllllIlI)) {
               var10000 = lIIlIIlll[1];
               "".length();
               if (-(12 + 66 - -86 + 14 ^ 49 + 65 - 10 + 78) >= 0) {
                  return;
               }
            } else {
               var10000 = lIIlIIlll[0];
            }

            if (lIIlllIIll(var10000)) {
               llIlIlIIIIIIIIl.add(llIlIIllllllIll);
               "".length();
            }

            "".length();
            if ("  ".length() < 0) {
               return;
            }
         }

         int llIlIlIIIIIIlIl = (List)llIlIlIIIIIIIIl;
         boolean llIlIlIIIIIIIll = (Iterable)ĂƂ;
         llIlIlIIIIIIIlI = lIIlIIlll[0];
         llIlIlIIIIIIIIl = llIlIlIIIIIIIll.iterator();

         Object var45;
         while(true) {
            if (!lIIlllIIll(llIlIlIIIIIIIIl.hasNext())) {
               var45 = null;
               break;
            }

            label102: {
               llIlIlIIIIIIIII = llIlIlIIIIIIIIl.next();
               Exception llIlIIlllllllll = (Ἒⅾ)llIlIlIIIIIIIII;
               llIlIIllllllllI = lIIlIIlll[0];
               if (lIIlllIllI(StringsKt.equals(llIlIIlllllllll.ⲋ(), llIlIlIIIIIIllI, (boolean)lIIlIIlll[1]))) {
                  byte llIlIIlllllllIl = (Iterable)llIlIIlllllllll.u();
                  short llIlIIlllllllII = lIIlIIlll[0];
                  if (lIIlllIIll(llIlIIlllllllIl instanceof Collection) && lIIlllIIll(((Collection)llIlIIlllllllIl).isEmpty())) {
                     var10000 = lIIlIIlll[0];
                     "".length();
                     if (" ".length() > "  ".length()) {
                        return;
                     }
                  } else {
                     Iterator llIlIIllllllIll = llIlIIlllllllIl.iterator();

                     while(true) {
                        if (!lIIlllIIll(llIlIIllllllIll.hasNext())) {
                           var10000 = lIIlIIlll[0];
                           break;
                        }

                        byte llIlIIllllllIlI = llIlIIllllllIll.next();
                        float llIlIIllllllIIl = (String)llIlIIllllllIlI;
                        char llIlIIllllllIII = lIIlIIlll[0];
                        if (lIIlllIIll(StringsKt.equals(llIlIIllllllIIl, llIlIlIIIIIIllI, (boolean)lIIlIIlll[1]))) {
                           var10000 = lIIlIIlll[1];
                           "".length();
                           if ("  ".length() != "  ".length()) {
                              return;
                           }
                           break;
                        }
                     }
                  }

                  if (!lIIlllIIll(var10000)) {
                     var10000 = lIIlIIlll[0];
                     break label102;
                  }
               }

               var10000 = lIIlIIlll[1];
               "".length();
               if ("  ".length() < ((156 ^ 166) & ~(184 ^ 130))) {
                  return;
               }
            }

            if (lIIlllIIll(var10000)) {
               var45 = llIlIlIIIIIIIII;
               "".length();
               if (null != null) {
                  return;
               }
               break;
            }
         }

         boolean llIlIlIIIIIIlII = (Ἒⅾ)var45;
         if (lIIlllIIlI(llIlIlIIIIIIlII)) {
            if (lIIlllIlll(ơ߀.ⲋ.ĂƂ(llIlIlIIIIIIllI))) {
               llIlIlIIIIIlIlI.ĂƂ(String.valueOf((new StringBuilder()).append(lIIIllllI[lIIlIIlll[5]]).append(llIlIlIIIIIlIIl)));
               "".length();
               if (-" ".length() == (31 ^ 27)) {
                  return;
               }
            } else {
               Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIllllI[lIIlIIlll[6]]).append(llIlIlIIIIIIllI)));
               "".length();
               if ((114 ^ 65 ^ 167 ^ 144) < 0) {
                  return;
               }
            }
         } else {
            try {
               llIlIlIIIIIIlII.ⲋ(new Ἒⅾ.u(llIlIlIIIIIIlIl));
            } catch (Exception var27) {
               Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lIIIllllI[lIIlIIlll[7]]).append(var27.getMessage())));
               return;
            }

            "".length();
            if ((71 ^ 67) <= 0) {
               return;
            }
         }

      }
   }

   private static boolean lIIlllIlII(int var0) {
      return var0 < 0;
   }

   private ϛⰄ() {
   }

   private static String lIIllIIlIl(String llIlIIlllIIIllI, String llIlIIlllIIlIlI) {
      llIlIIlllIIIllI = new String(Base64.getDecoder().decode(llIlIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder llIlIIlllIIlIIl = new StringBuilder();
      char[] llIlIIlllIIlIII = llIlIIlllIIlIlI.toCharArray();
      int llIlIIlllIIIlll = lIIlIIlll[0];
      String llIlIIlllIIIIIl = llIlIIlllIIIllI.toCharArray();
      float llIlIIlllIIIIII = llIlIIlllIIIIIl.length;
      int llIlIIllIllllll = lIIlIIlll[0];

      do {
         if (!lIIllllIII(llIlIIllIllllll, llIlIIlllIIIIII)) {
            return String.valueOf(llIlIIlllIIlIIl);
         }

         short llIlIIllIlllllI = llIlIIlllIIIIIl[llIlIIllIllllll];
         llIlIIlllIIlIIl.append((char)(llIlIIllIlllllI ^ llIlIIlllIIlIII[llIlIIlllIIIlll % llIlIIlllIIlIII.length]));
         "".length();
         ++llIlIIlllIIIlll;
         ++llIlIIllIllllll;
         "".length();
      } while("  ".length() > -" ".length());

      return null;
   }

   @JvmName(
      name = "u"
   )
   public final String u() {
      return u;
   }

   static {
      lIIlllIIIl();
      lIIllIlllI();
      ϛⰄ var0 = new ϛⰄ();
      ⲋ = var0;
      ĂƂ = new ArrayList();
      u = lIIIllllI[lIIlIIlll[8]];
      ĂƂ.add(new ɡ());
      "".length();
      ĂƂ.add(new ⴜ());
      "".length();
      ĂƂ.add(new ⱯꝣѺ());
      "".length();
      ĂƂ.add(new ꙑứ());
      "".length();
      ĂƂ.add(new Ꙗ());
      "".length();
      ĂƂ.add(new Ɏ());
      "".length();
      ĂƂ.add(new Đ());
      "".length();
      ĂƂ.add(new Ⳓ());
      "".length();
      ĂƂ.add(new ͷ());
      "".length();
      ĂƂ.add(new ᵴἥ());
      "".length();
      ĂƂ.add(new ⲡ());
      "".length();
      ĂƂ.add(new ɧῙ());
      "".length();
      ĂƂ.add(new Ꜥ());
      "".length();
   }
}
