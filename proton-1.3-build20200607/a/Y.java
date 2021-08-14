package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u0011:\u0001\u0002B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007J\u001f\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0086T"},
   d2 = {"La/Y;", "", "ⲋ", "I", "", "p0", "", "(Ljava/lang/String;)V", "", "p1", "(Ljava/lang/String;Z)V", "u", "ᴃᎲ", "〥ҳⱆ", "ĂƂ", "<init>", "()V", ""}
)
public final class Y {
   public final void ĂƂ(@NotNull String var1) {
      this.ⲋ(var1);
   }

   private Y() {
   }

   public final void u(@NotNull String var1) {
      this.ⲋ(var1);
   }

   private static String lllllIl(String llllIllllIlIlII, String llllIllllIlIlIl) {
      try {
         int llllIllllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), llIllI[4]), "DES");
         boolean llllIllllIlIIIl = Cipher.getInstance("DES");
         llllIllllIlIIIl.init(llIllI[2], llllIllllIlIIlI);
         return new String(llllIllllIlIIIl.doFinal(Base64.getDecoder().decode(llllIllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lllllII(String llllIllllIIIlll, String llllIllllIIlIII) {
      try {
         SecretKeySpec llllIllllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         float llllIllllIIIlII = Cipher.getInstance("Blowfish");
         llllIllllIIIlII.init(llIllI[2], llllIllllIIllII);
         return new String(llllIllllIIIlII.doFinal(Base64.getDecoder().decode(llllIllllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lllllll() {
      llIllI = new int[5];
      llIllI[0] = (123 ^ 100 ^ 56 ^ 116) & (118 ^ 33 ^ 24 ^ 28 ^ -" ".length());
      llIllI[1] = " ".length();
      llIllI[2] = "  ".length();
      llIllI[3] = -9 & 998009;
      llIllI[4] = 11 ^ 3;
   }

   public final void ᴃᎲ(@NotNull String var1) {
      if (lIIIIIlI(ⲉ.ⲋ.ĂƂ())) {
         Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146234_a((ITextComponent)(new Y.ⲋ(var1)), llIllI[3]);
      }

   }

   public final void ⲋ(@NotNull String var1) {
      this.ᴃᎲ(String.valueOf((new StringBuilder()).append(llIlII[llIllI[0]]).append(var1)));
      ƶ.ⲋ((Object)(new öỴʘѷ(var1)));
   }

   public final void ⲋ(@NotNull String var1, boolean var2) {
      String var3 = var1;
      if (lIIIIIlI(var2)) {
         var3 = String.valueOf((new StringBuilder()).append(llIlII[llIllI[1]]).append(var1));
      }

      this.〥ҳⱆ(var3);
      ƶ.ⲋ((Object)(new öỴʘѷ(var1)));
   }

   private static boolean lIIIIIlI(int var0) {
      return var0 != 0;
   }

   static {
      lllllll();
      llllllI();
      ⲋ = llIllI[3];
      Y var0 = new Y();
      ĂƂ = var0;
   }

   private static void llllllI() {
      llIlII = new String[llIllI[2]];
      llIlII[llIllI[0]] = lllllII("n5EiAAZIdeLoG9nDeB4tIA==", "fDedV");
      llIlII[llIllI[1]] = lllllIl("tLBqdpjBG9iOYr+hWJ3a4g==", "tnfwq");
   }

   public final void 〥ҳⱆ(@NotNull String var1) {
      if (lIIIIIlI(ⲉ.ⲋ.ĂƂ())) {
         Minecraft.func_71410_x().field_71456_v.func_146158_b().func_146227_a((ITextComponent)(new Y.ⲋ(var1)));
      }

   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000b"},
      d2 = {"Lme/nucleus/proton/util/ChatUtil$ChatMessage;", "Lnet/minecraft/util/text/TextComponentBase;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "setText", "createCopy", "Lnet/minecraft/util/text/ITextComponent;", "getUnformattedComponentText", "proton"}
   )
   public static final class ⲋ extends TextComponentBase {
      @NotNull
      public ITextComponent func_150259_f() {
         return (ITextComponent)(new Y.ⲋ(this.text));
      }

      private static void lIIllllllII() {
         lIIlIlllIl = new String[lIIlIlllll[4]];
         lIIlIlllIl[lIIlIlllll[0]] = lIIlllllIll("nz2P0PtXT+OfiOwPQVW03ge8dTs9l10b7X7MDbyzQdY=", "uUFbJ");
         lIIlIlllIl[lIIlIlllll[1]] = lIIlllllIll("+JkN9uzHb1c=", "sGNlq");
         lIIlIlllIl[lIIlIlllll[2]] = lIIlllllIll("Z1+TaUb1k0r21NwKJFURp/bqtVCwo4Po23e3RI7+bcl0hFR7+s5tNvn32y/LCeE47hZfTpcpUFU=", "TLBXG");
         lIIlIlllIl[lIIlIlllll[3]] = lIIlllllIll("G3DHwDH38RU=", "eVSmC");
      }

      public ⲋ(@Nullable String var1) {
         Pattern var2 = Pattern.compile(lIIlIlllIl[lIIlIlllll[0]]);
         Matcher lIlIIllIlIIlIll = var2.matcher((CharSequence)var1);
         StringBuffer lIlIIllIlIIlIlI = new StringBuffer();

         do {
            if (!lIlIIIIIlII(lIlIIllIlIIlIll.find())) {
               lIlIIllIlIIlIll.appendTail(lIlIIllIlIIlIlI);
               "".length();
               this.text = lIlIIllIlIIlIlI.toString();
               return;
            }

            StringBuilder var10000 = (new StringBuilder()).append(lIIlIlllIl[lIIlIlllll[1]]);
            short lIlIIllIlIIlIII = lIlIIllIlIIlIll.group();
            char lIlIIllIlIIIlll = lIIlIlllll[1];
            long lIlIIllIlIIIlIl = var10000;
            Exception lIlIIllIlIIIllI = lIIlIlllll[0];
            if (lIlIIIIIlIl(lIlIIllIlIIlIII)) {
               throw new TypeCastException(lIIlIlllIl[lIIlIlllll[2]]);
            }

            String var11 = lIlIIllIlIIlIII.substring(lIlIIllIlIIIlll);
            Intrinsics.checkExpressionValueIsNotNull(var11, lIIlIlllIl[lIIlIlllll[3]]);
            char lIlIIllIlIIIlII = var11;
            short lIlIIllIlIIlIIl = String.valueOf(lIlIIllIlIIIlIl.append(lIlIIllIlIIIlII));
            lIlIIllIlIIlIll.appendReplacement(lIlIIllIlIIlIlI, lIlIIllIlIIlIIl);
            "".length();
            "".length();
         } while(-(162 ^ 167) < 0);

         throw null;
      }

      private static void lIlIIIIIIlI() {
         lIIlIlllll = new int[5];
         lIIlIlllll[0] = (81 ^ 73) & ~(69 ^ 93);
         lIIlIlllll[1] = " ".length();
         lIIlIlllll[2] = "  ".length();
         lIIlIlllll[3] = "   ".length();
         lIIlIlllll[4] = 91 ^ 109 ^ 21 ^ 39;
      }

      private static String lIIlllllIll(String lIlIIllIIlllIlI, String lIlIIllIIlllIll) {
         try {
            SecretKeySpec lIlIIllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIllIIlllllI = Cipher.getInstance("Blowfish");
            lIlIIllIIlllllI.init(lIIlIlllll[2], lIlIIllIIllllll);
            return new String(lIlIIllIIlllllI.doFinal(Base64.getDecoder().decode(lIlIIllIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static boolean lIlIIIIIlIl(Object var0) {
         return var0 == null;
      }

      private static boolean lIlIIIIIlII(int var0) {
         return var0 != 0;
      }

      @NotNull
      public String func_150261_e() {
         return this.text;
      }

      static {
         lIlIIIIIIlI();
         lIIllllllII();
      }

      @NotNull
      public final String getText() {
         return this.text;
      }

      public final void setText(@NotNull String var1) {
         this.text = var1;
      }
   }
}
