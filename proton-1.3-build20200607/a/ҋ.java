package a;

import java.awt.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\f"},
   d2 = {"La/ҋ;", "", "p0", "", "ĂƂ", "(I)Ljava/lang/String;", "Ljava/awt/Color;", "ⲋ", "(Ljava/awt/Color;)Ljava/lang/String;", "", "(C)I", "(Ljava/lang/String;)Ljava/awt/Color;", "(I)C", "<init>", "()V", ""}
)
public final class ҋ {
   private static boolean llIlIllIll(int var0, int var1) {
      return var0 >= var1;
   }

   private ҋ() {
   }

   @NotNull
   public final Color ⲋ(@NotNull String llIIIllIIIlIIlI) {
      Color var10000;
      int llIIIllIIIlIIIl;
      int llIIIllIIIlIIII;
      int llIIIllIIIIllll;
      switch(llIIIllIIIlIIlI.length()) {
      case 3:
         llIIIllIIIlIIIl = llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[0]));
         llIIIllIIIlIIII = llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[9]));
         llIIIllIIIIllll = llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[10]));
         var10000 = new Color(llIIIllIIIlIIIl + llIIIllIIIlIIIl * llIIllIIl[8], llIIIllIIIlIIII + llIIIllIIIlIIII * llIIllIIl[8], llIIIllIIIIllll + llIIIllIIIIllll * llIIllIIl[8]);
         "".length();
         if (" ".length() == 0) {
            return null;
         }
         break;
      case 4:
      case 5:
      default:
         var10000 = Color.black;
         break;
      case 6:
         llIIIllIIIlIIIl = llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[0])) * llIIllIIl[8] + llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[9]));
         llIIIllIIIlIIII = llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[10])) * llIIllIIl[8] + llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[11]));
         llIIIllIIIIllll = llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[12])) * llIIllIIl[8] + llIIIllIIIlIIll.ⲋ(llIIIllIIIlIIlI.charAt(llIIllIIl[13]));
         var10000 = new Color(llIIIllIIIlIIIl, llIIIllIIIlIIII, llIIIllIIIIllll);
         "".length();
         if (((79 ^ 11) & ~(127 ^ 59)) != 0) {
            return null;
         }
      }

      return var10000;
   }

   private final String ĂƂ(int var1) {
      char var2 = this.ⲋ(var1 / llIIllIIl[8]);
      char var3 = this.ⲋ(var1 & llIIllIIl[7]);
      return String.valueOf((new StringBuilder()).append(var2).append(var3));
   }

   private static boolean llIlIllIlI(int var0, int var1) {
      return var0 > var1;
   }

   static {
      llIlIllIIl();
      ҋ var0 = new ҋ();
      ⲋ = var0;
   }

   private final char ⲋ(int llIIIllIIIllIll) {
      int var10000 = llIIllIIl[6];
      if (llIlIllIlI(llIIllIIl[0], llIIIllIIIllIll)) {
         "".length();
         "".length();
         if ((11 ^ 84 ^ 14 ^ 85) != (141 + 88 - 219 + 148 ^ 70 + 49 - 26 + 61)) {
            return (char)(('3' ^ 'U' ^ 'ê' ^ '©') & (51 + 92 - 114 + 118 ^ 160 + 153 - 206 + 75 ^ -" ".length()));
         }
      } else if (llIlIllIll(var10000, llIIIllIIIllIll)) {
         var10000 = (char)(llIIIllIIIllIll + llIIllIIl[2]);
         "".length();
         if ((169 + 116 - 149 + 41 ^ 52 + 6 - -47 + 76) <= " ".length()) {
            return (char)(('D' ^ '4' ^ '\u0001' ^ ']') & (95 + 173 - 204 + 127 ^ 73 + 33 - 20 + 61 ^ -" ".length()));
         }

         return (char)var10000;
      }

      var10000 = llIIllIIl[7];
      if (llIlIllIlI(llIIllIIl[5], llIIIllIIIllIll)) {
         "".length();
         "".length();
         if ("  ".length() == (187 ^ 191)) {
            return (char)(('\u001a' ^ 'D') & ~('ô' ^ 'ª'));
         }
      } else if (llIlIllIll(var10000, llIIIllIIIllIll)) {
         var10000 = (char)(llIIIllIIIllIll + llIIllIIl[4] - llIIllIIl[5]);
         "".length();
         if (null != null) {
            return (char)(('Ð' ^ '²' ^ '@' ^ ':') & (143 + 47 - 180 + 138 ^ 76 + 31 - 20 + 53 ^ -" ".length()));
         }

         return (char)var10000;
      }

      var10000 = llIIllIIl[2];
      return (char)var10000;
   }

   private final int ⲋ(char var1) {
      int var4 = llIIllIIl[0];
      byte llIIIllIIlIIIIl = (byte)Character.toLowerCase(var1);
      int var10000 = llIIllIIl[1];
      if (llIlIllIlI(llIIllIIl[2], llIIIllIIlIIIIl)) {
         "".length();
         "".length();
         if ("   ".length() < -" ".length()) {
            return (124 ^ 37) & ~(199 ^ 158);
         }
      } else if (llIlIllIll(var10000, llIIIllIIlIIIIl)) {
         var10000 = llIIIllIIlIIIIl - llIIllIIl[2];
         "".length();
         if ("  ".length() <= 0) {
            return (79 ^ 80) & ~(50 ^ 45);
         }

         return var10000;
      }

      var10000 = llIIllIIl[3];
      if (llIlIllIlI(llIIllIIl[4], llIIIllIIlIIIIl)) {
         "".length();
         "".length();
         if (((30 ^ 59) & ~(144 ^ 181)) >= (85 ^ 81)) {
            return (240 ^ 165) & ~(77 ^ 24);
         }
      } else if (llIlIllIll(var10000, llIIIllIIlIIIIl)) {
         var10000 = llIIIllIIlIIIIl - llIIllIIl[4] + llIIllIIl[5];
         "".length();
         if ("   ".length() == 0) {
            return (148 ^ 168) & ~(94 ^ 98);
         }

         return var10000;
      }

      var10000 = llIIllIIl[0];
      return var10000;
   }

   @NotNull
   public final String ⲋ(@NotNull Color var1) {
      String var2 = this.ĂƂ(var1.getRed());
      String var3 = this.ĂƂ(var1.getGreen());
      String var4 = this.ĂƂ(var1.getBlue());
      return String.valueOf((new StringBuilder()).append(var2).append(var3).append(var4));
   }

   private static void llIlIllIIl() {
      llIIllIIl = new int[14];
      llIIllIIl[0] = (122 ^ 6 ^ 189 ^ 197) & (123 ^ 94 ^ 161 ^ 128 ^ -" ".length());
      llIIllIIl[1] = 254 ^ 199;
      llIIllIIl[2] = 42 ^ 26;
      llIIllIIl[3] = 80 ^ 54;
      llIIllIIl[4] = 27 ^ 122;
      llIIllIIl[5] = 61 ^ 22 ^ 155 ^ 186;
      llIIllIIl[6] = 174 ^ 163 ^ 189 ^ 185;
      llIIllIIl[7] = 76 ^ 119 ^ 122 ^ 78;
      llIIllIIl[8] = 70 ^ 86;
      llIIllIIl[9] = " ".length();
      llIIllIIl[10] = "  ".length();
      llIIllIIl[11] = "   ".length();
      llIIllIIl[12] = 153 ^ 157;
      llIIllIIl[13] = 67 ^ 70;
   }
}
