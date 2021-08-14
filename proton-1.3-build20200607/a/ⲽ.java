package a;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.input.Keyboard;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00012\u00020L:\u0001\u0001BQ\u0012\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u0010F\u001a\u00020\u0013\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u0010I\u001a\u00020\u0013¢\u0006\u0004\bJ\u0010KJ\u000f\u0010<\u001a\u00020'H\u0002¢\u0006\u0004\b<\u0010=J'\u0010\f\u001a\u00020\u00002\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0%j\u0002`&H\u0007¢\u0006\u0004\b\f\u0010?J\u001f\u0010\u0001\u001a\u00020'2\u0006\u0010>\u001a\u00020\u00132\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\b\u0001\u0010BJ\u001f\u0010\u0001\u001a\u00020'2\u0006\u0010>\u001a\u00020C2\u0006\u0010A\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0001\u0010DJ\u001f\u0010\f\u001a\u00020'2\u0006\u0010>\u001a\u00020C2\u0006\u0010A\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\f\u0010DJ\u000f\u0010E\u001a\u00020'H\u0016¢\u0006\u0004\bE\u0010=R&\u0010\u0001\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0086\u000eR\u001a\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0082\u0004R&\u0010\u0007\u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0001\u0010\u0012¨\u0006\u0086\u000eR&\u0010\u0016\u001a\u00020\u00138\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0001\u0010\u0018¨\u0006\u0086\u000eR\u001a\u0010\u0005\u001a\u00020\u00198C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u0082\u0004R\u001f\u0010\n\u001a\u0004\u0018\u00010\u001c8\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\u0086\u0004R\u001d\u0010\u0014\u001a\u00020\u00138\u0007@\u0006¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017¨\u0006\u0086\u0004R\u001d\u0010\u0003\u001a\u00020\u00138\u0007@\u0006¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017¨\u0006\u0086\u0004R:\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'\u0018\u00010%j\u0004\u0018\u0001`&8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b\u0001\u0010,¨\u0006\u0086\u000eR%\u0010(\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0007@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u0006\u0086\u0004R\u001f\u0010/\u001a\u0004\u0018\u00010.8\u0007@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006\u0086\u0004R\u001a\u00103\u001a\u0002078W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u00108¨\u0006\u0096\u0004R\u001f\u0010!\u001a\u0004\u0018\u00010.8\u0007@\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106¨\u0006\u0086\u0004R&\u0010\u001d\u001a\u00020.8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b\f\u00106\"\u0004\b\u0001\u0010;¨\u0006\u0086\u000e"},
   d2 = {"La/ⲽ;", "ⲋ", "", "ς", "Z", "〥ҳⱆ", "()Z", "u", "(Z)V", "La/ⱙ;", "Ἒⅾ", "La/ⱙ;", "ĂƂ", "", "Ꜥ", "J", "ⱯꝣѺ", "()J", "(J)V", "", "ϛⰄ", "I", "ᴃᎲ", "()I", "(I)V", "La/Ꞓ;", "ƶ", "()La/Ꞓ;", "Lkotlin/text/Regex;", "ɡ", "Lkotlin/text/Regex;", "ƺ", "()Lkotlin/text/Regex;", "Ɏ", "Ἠ", "ͷ", "ἶṗ", "Lkotlin/Function1;", "La/OnEnterHandler;", "", "ⲡ", "Lkotlin/jvm/functions/Function1;", "ꙑứ", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "La/ᵭ;", "", "Đ", "La/ᵭ;", "ɧῙ", "()La/ᵭ;", "ᵴἥ", "Ljava/lang/String;", "ʅ", "()Ljava/lang/String;", "La/ė;", "()La/ė;", "ⴜ", "ɻ", "(Ljava/lang/String;)V", "ȵ", "()V", "p0", "(Lkotlin/jvm/functions/Function1;)La/ⲽ;", "", "p1", "(IC)V", "La/ⅵ;", "(La/ⅵ;I)V", "b_", "p2", "p3", "p4", "p5", "<init>", "(La/ᵭ;Ljava/lang/String;ILkotlin/text/Regex;Ljava/lang/String;I)V", "La/Ữ;"}
)
public final class ⲽ extends Ữ {
   @JvmName(
      name = "ĂƂ"
   )
   public final String ĂƂ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "ʅ"
   )
   public final String ʅ() {
      return this.ᵴἥ;
   }

   public void ⲋ(int lIllIIlIIIIllII, char lIllIIlIIIIlIll) {
      super.ⲋ(lIllIIlIIIIllII, lIllIIlIIIIlIll);
      if (!lIIIlllIlIl(lIllIIlIIIIllIl.ς)) {
         float lIllIIlIIIIlIlI = Keyboard.isKeyDown(lIIIIIlIll[4]);
         CharSequence lIllIIlIIIIlIIl;
         int lIllIIlIIIIlIII;
         int lIllIIlIIIIIlll;
         int lIllIIlIIIIIllI;
         String lIllIIlIIIIIlII;
         String lIllIIlIIIIlIIl;
         String var12;
         int var10000;
         if (lIIIlllIlII(lIllIIlIIIIlIlI) && lIIIlllIllI(lIllIIlIIIIllII, lIIIIIlIll[5])) {
            lIllIIlIIIIlIIl = (CharSequence)lIllIIlIIIIllIl.〥ҳⱆ;
            lIllIIlIIIIlIII = lIIIIIlIll[3];
            if (lIIIlllIlll(lIllIIlIIIIlIIl.length())) {
               var10000 = lIIIIIlIll[2];
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               var10000 = lIIIIIlIll[3];
            }

            if (lIIIlllIlII(var10000)) {
               do {
                  lIllIIlIIIIlIIl = (CharSequence)lIllIIlIIIIllIl.〥ҳⱆ;
                  lIllIIlIIIIlIII = lIIIIIlIll[3];
                  if (lIIIlllIlll(lIllIIlIIIIlIIl.length())) {
                     var10000 = lIIIIIlIll[2];
                     "".length();
                     if (((245 ^ 162) & ~(93 ^ 10)) != 0) {
                        return;
                     }
                  } else {
                     var10000 = lIIIIIlIll[3];
                  }

                  if (!lIIIlllIlII(var10000) || !lIIIlllIlII(CharsKt.isWhitespace(StringsKt.last((CharSequence)lIllIIlIIIIllIl.〥ҳⱆ)))) {
                     do {
                        lIllIIlIIIIlIIl = (CharSequence)lIllIIlIIIIllIl.〥ҳⱆ;
                        lIllIIlIIIIlIII = lIIIIIlIll[3];
                        if (lIIIlllIlll(lIllIIlIIIIlIIl.length())) {
                           var10000 = lIIIIIlIll[2];
                           "".length();
                           if (-" ".length() >= "  ".length()) {
                              return;
                           }
                        } else {
                           var10000 = lIIIIIlIll[3];
                        }

                        if (!lIIIlllIlII(var10000) || !lIIIlllIlIl(CharsKt.isWhitespace(StringsKt.last((CharSequence)lIllIIlIIIIllIl.〥ҳⱆ)))) {
                           return;
                        }

                        lIllIIlIIIIlIIl = lIllIIlIIIIllIl.〥ҳⱆ;
                        lIllIIlIIIIlIII = lIIIIIlIll[3];
                        lIllIIlIIIIIlll = lIllIIlIIIIllIl.〥ҳⱆ.length() - lIIIIIlIll[2];
                        lIllIIlIIIIIllI = lIIIIIlIll[3];
                        if (lIIIllllIII(lIllIIlIIIIlIIl)) {
                           throw new TypeCastException(lIIIIIIllI[lIIIIIlIll[6]]);
                        }

                        var12 = lIllIIlIIIIlIIl.substring(lIllIIlIIIIlIII, lIllIIlIIIIIlll);
                        Intrinsics.checkExpressionValueIsNotNull(var12, lIIIIIIllI[lIIIIIlIll[7]]);
                        lIllIIlIIIIIlII = var12;
                        lIllIIlIIIIllIl.〥ҳⱆ = lIllIIlIIIIIlII;
                        "".length();
                     } while("  ".length() > 0);

                     return;
                  }

                  lIllIIlIIIIlIIl = lIllIIlIIIIllIl.〥ҳⱆ;
                  lIllIIlIIIIlIII = lIIIIIlIll[3];
                  lIllIIlIIIIIlll = lIllIIlIIIIllIl.〥ҳⱆ.length() - lIIIIIlIll[2];
                  lIllIIlIIIIIllI = lIIIIIlIll[3];
                  if (lIIIllllIII(lIllIIlIIIIlIIl)) {
                     throw new TypeCastException(lIIIIIIllI[lIIIIIlIll[3]]);
                  }

                  var12 = lIllIIlIIIIlIIl.substring(lIllIIlIIIIlIII, lIllIIlIIIIIlll);
                  Intrinsics.checkExpressionValueIsNotNull(var12, lIIIIIIllI[lIIIIIlIll[2]]);
                  lIllIIlIIIIIlII = var12;
                  lIllIIlIIIIllIl.〥ҳⱆ = lIllIIlIIIIIlII;
                  "".length();
               } while(((4 + 128 - 125 + 181 ^ 124 + 26 - 33 + 64) & (148 + 45 - 61 + 19 ^ 9 + 115 - -26 + 8 ^ -" ".length())) == 0);

               return;
            }
         } else {
            ᵭ var13;
            if (lIIIlllIllI(lIllIIlIIIIllII, lIIIIIlIll[5])) {
               lIllIIlIIIIlIIl = (CharSequence)lIllIIlIIIIllIl.〥ҳⱆ;
               lIllIIlIIIIlIII = lIIIIIlIll[3];
               if (lIIIlllIlll(lIllIIlIIIIlIIl.length())) {
                  var10000 = lIIIIIlIll[2];
                  "".length();
                  if ("   ".length() <= ((101 ^ 61 ^ 232 ^ 180) & (225 ^ 149 ^ 116 ^ 4 ^ -" ".length()))) {
                     return;
                  }
               } else {
                  var10000 = lIIIIIlIll[3];
               }

               if (lIIIlllIlII(var10000)) {
                  lIllIIlIIIIlIIl = lIllIIlIIIIllIl.〥ҳⱆ;
                  lIllIIlIIIIlIII = lIIIIIlIll[3];
                  lIllIIlIIIIIlll = StringsKt.getLastIndex((CharSequence)lIllIIlIIIIllIl.〥ҳⱆ);
                  lIllIIlIIIIIllI = lIIIIIlIll[3];
                  if (lIIIllllIII(lIllIIlIIIIlIIl)) {
                     throw new TypeCastException(lIIIIIIllI[lIIIIIlIll[0]]);
                  }

                  var12 = lIllIIlIIIIlIIl.substring(lIllIIlIIIIlIII, lIllIIlIIIIIlll);
                  Intrinsics.checkExpressionValueIsNotNull(var12, lIIIIIIllI[lIIIIIlIll[8]]);
                  lIllIIlIIIIIlII = var12;
                  lIllIIlIIIIllIl.〥ҳⱆ = lIllIIlIIIIIlII;
                  var13 = lIllIIlIIIIllIl.Đ;
                  if (lIIIllllIll(var13)) {
                     var13.ⲋ((Object)lIllIIlIIIIllIl.〥ҳⱆ);
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     "".length();
                     "".length();
                     if (-"  ".length() >= 0) {
                        return;
                     }
                  }
               }
            } else if (lIIIlllIllI(lIllIIlIIIIllII, lIIIIIlIll[9])) {
               if (lIIIllllIll(lIllIIlIIIIllIl.ⲡ)) {
                  Function1 var14 = lIllIIlIIIIllIl.ⲡ;
                  if (lIIIllllIll(var14)) {
                     Unit var15 = (Unit)var14.invoke(lIllIIlIIIIllIl);
                     "".length();
                     "".length();
                     if (-" ".length() >= (75 ^ 85 ^ 87 ^ 77)) {
                        return;
                     }
                  } else {
                     "".length();
                     "".length();
                     if (-"   ".length() >= 0) {
                        return;
                     }
                  }
               } else {
                  lIllIIlIIIIllIl.ȵ();
                  "".length();
                  if ((147 ^ 150 ^ (92 ^ 25) & ~(29 ^ 88)) <= 0) {
                     return;
                  }
               }
            } else {
               String var10001;
               if (lIIIlllIlII(lIllIIlIIIIlIlI) && lIIIlllIllI(lIllIIlIIIIllII, lIIIIIlIll[10])) {
                  Object var16 = Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                  if (lIIIllllIII(var16)) {
                     throw new TypeCastException(lIIIIIIllI[lIIIIIlIll[1]]);
                  }

                  lIllIIlIIIIlIIl = (String)var16;
                  char lIllIIlIIIIlIII = (CharSequence)lIllIIlIIIIlIIl;
                  lIllIIlIIIIIlll = lIIIIIlIll[3];
                  if (lIIIlllIlll(lIllIIlIIIIlIII.length())) {
                     var10000 = lIIIIIlIll[2];
                     "".length();
                     if (" ".length() < ((75 ^ 84 ^ 19 ^ 31) & (189 ^ 179 ^ 150 ^ 139 ^ -" ".length()))) {
                        return;
                     }
                  } else {
                     var10000 = lIIIIIlIll[3];
                  }

                  if (lIIIlllIlII(var10000)) {
                     var10001 = lIllIIlIIIIllIl.〥ҳⱆ;
                     lIllIIlIIIIllIl.〥ҳⱆ = String.valueOf((new StringBuilder()).append(var10001).append(lIllIIlIIIIlIIl));
                     var13 = lIllIIlIIIIllIl.Đ;
                     if (lIIIllllIll(var13)) {
                        var13.ⲋ((Object)lIllIIlIIIIllIl.〥ҳⱆ);
                        "".length();
                        if (" ".length() > "   ".length()) {
                           return;
                        }
                     } else {
                        "".length();
                        "".length();
                        if ("   ".length() <= -" ".length()) {
                           return;
                        }
                     }
                  }
               } else if (lIIIlllIlII(lIllIIlIIIIlIll) && lIIIlllllIl(lIllIIlIIIIllIl.〥ҳⱆ.length(), lIllIIlIIIIllIl.Ɏ) && (!lIIIllllIll(lIllIIlIIIIllIl.ɡ) || lIIIlllIlII(lIllIIlIIIIllIl.ɡ.matches((CharSequence)String.valueOf((new StringBuilder()).append(lIllIIlIIIIllIl.〥ҳⱆ).append(lIllIIlIIIIlIll)))))) {
                  var10001 = lIllIIlIIIIllIl.〥ҳⱆ;
                  lIllIIlIIIIllIl.〥ҳⱆ = String.valueOf((new StringBuilder()).append(var10001).append(lIllIIlIIIIlIll));
                  var13 = lIllIIlIIIIllIl.Đ;
                  if (lIIIllllIll(var13)) {
                     var13.ⲋ((Object)lIllIIlIIIIllIl.〥ҳⱆ);
                     "".length();
                     if ((128 ^ 132) <= 0) {
                        return;
                     }
                  } else {
                     "".length();
                  }
               }
            }
         }

      }
   }

   private static boolean lIIIlllIlIl(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final int ᴃᎲ() {
      return this.ϛⰄ;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final boolean 〥ҳⱆ() {
      return this.ς;
   }

   static {
      lIIIlllIIll();
      lIIIllIlIII();
      u = lIIIIIlIll[11];
      ⲋ = lIIIIIlIll[6];
      ⲋ = new ⲽ.ⲋ((DefaultConstructorMarker)null);
   }

   @JvmName(
      name = "Ἠ"
   )
   public final int Ἠ() {
      return this.Ɏ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable Function1<? super ⲽ, Unit> var1) {
      this.ⲡ = var1;
   }

   private static String lIIIllIIlIl(String lIllIIIlIllIlll, String lIllIIIlIllIlII) {
      try {
         SecretKeySpec lIllIIIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), lIIIIIlIll[15]), "DES");
         byte lIllIIIlIllIIlI = Cipher.getInstance("DES");
         lIllIIIlIllIIlI.init(lIIIIIlIll[6], lIllIIIlIlllIlI);
         return new String(lIllIIIlIllIIlI.doFinal(Base64.getDecoder().decode(lIllIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIIllIIlll(String lIllIIIlIIlIIll, String lIllIIIlIIlIIlI) {
      lIllIIIlIIlIIll = new String(Base64.getDecoder().decode(lIllIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lIllIIIlIIIlIII = new StringBuilder();
      char[] lIllIIIlIIIllll = lIllIIIlIIlIIlI.toCharArray();
      char lIllIIIlIIIIllI = lIIIIIlIll[3];
      long lIllIIIlIIIIlIl = lIllIIIlIIlIIll.toCharArray();
      byte lIllIIIlIIIIlII = lIllIIIlIIIIlIl.length;
      int lIllIIIlIIIIIll = lIIIIIlIll[3];

      do {
         if (!lIIIlllllIl(lIllIIIlIIIIIll, lIllIIIlIIIIlII)) {
            return String.valueOf(lIllIIIlIIIlIII);
         }

         char lIllIIIlIIlIlII = lIllIIIlIIIIlIl[lIllIIIlIIIIIll];
         lIllIIIlIIIlIII.append((char)(lIllIIIlIIlIlII ^ lIllIIIlIIIllll[lIllIIIlIIIIllI % lIllIIIlIIIllll.length]));
         "".length();
         ++lIllIIIlIIIIllI;
         ++lIllIIIlIIIIIll;
         "".length();
      } while(-"   ".length() < 0);

      return null;
   }

   @JvmName(
      name = "ƺ"
   )
   public final Regex ƺ() {
      return this.ɡ;
   }

   private static String lIIIllIIIlI(String lIllIIIllIIIlII, String lIllIIIllIIIIIl) {
      try {
         SecretKeySpec lIllIIIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIllIIIllIIIllI = Cipher.getInstance("Blowfish");
         lIllIIIllIIIllI.init(lIIIIIlIll[6], lIllIIIllIIIlll);
         return new String(lIllIIIllIIIllI.doFinal(Base64.getDecoder().decode(lIllIIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIIIllIlIII() {
      lIIIIIIllI = new String[lIIIIIlIll[20]];
      lIIIIIIllI[lIIIIIlIll[3]] = lIIIllIIIlI("5NCqtUa+1Hweu/jbm3nZSFBPPXqM53fHOBjCoIDg2dgrLnWn+0siVq8EZoPOki5iQp2C5Qo5Ik4=", "YvdJF");
      lIIIIIIllI[lIIIIIlIll[2]] = lIIIllIIlIl("AwGHQMjjNgo=", "YWLVw");
      lIIIIIIllI[lIIIIIlIll[6]] = lIIIllIIlIl("VZb3Rl//wmYt7TS7+4YZN2DCIByv5c2AYrKyl+kMsBfkqSo3Mu8w5FKi6NOtrneUK934uUpFfNk=", "kAENK");
      lIIIIIIllI[lIIIIIlIll[7]] = lIIIllIIIlI("SU0Tj2nYj4Y=", "JwJXb");
      lIIIIIIllI[lIIIIIlIll[0]] = lIIIllIIlll("JzQ8LmgqID4sJz1hMidoKiAjNmg9LnAsJydsPjckJWEkOzgsYTojPihvPCMmLm8DNjogLzc=", "IAPBH");
      lIIIIIIllI[lIIIIIlIll[8]] = lIIIllIIlll("", "bbrun");
      lIIIIIIllI[lIIIIIlIll[1]] = lIIIllIIlIl("hwpAe7Qgg2ODvpu7O9QxSSTcxYu287gvtonAtpo14LA1O6NMK+R4erf+OOiAXn/KgCzwER4J9oE=", "fXxuE");
      lIIIIIIllI[lIIIIIlIll[13]] = lIIIllIIlll("JQ==", "Yixss");
      lIIIIIIllI[lIIIIIlIll[15]] = lIIIllIIIlI("/HLiw1vcq38=", "GNbVA");
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      this.ς = var1;
   }

   @JvmName(
      name = "ἶṗ"
   )
   public final int ἶṗ() {
      return this.ͷ;
   }

   private static boolean lIIIlllIlll(int var0) {
      return var0 > 0;
   }

   private static boolean lIIIllllIll(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(long var1) {
      this.Ꜥ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      this.ϛⰄ = var1;
   }

   private static boolean lIIlIIIIIII(int var0) {
      return var0 >= 0;
   }

   public ⲽ() {
      this((ᵭ)null, (String)null, lIIIIIlIll[3], (Regex)null, (String)null, lIIIIIlIll[3], lIIIIIlIll[19], (DefaultConstructorMarker)null);
   }

   private static boolean lIIIlllIllI(int var0, int var1) {
      return var0 == var1;
   }

   private static void lIIIlllIIll() {
      lIIIIIlIll = new int[21];
      lIIIIIlIll[0] = 67 ^ 71;
      lIIIIIlIll[1] = 105 ^ 111;
      lIIIIIlIll[2] = " ".length();
      lIIIIIlIll[3] = (128 + 12 - -18 + 24 ^ 127 + 70 - 183 + 135) & (150 + 25 - 122 + 120 ^ 3 + 84 - 34 + 89 ^ -" ".length()) & ((195 ^ 176 ^ 173 ^ 189) & (144 ^ 150 ^ 40 ^ 77 ^ -" ".length()) ^ -" ".length());
      lIIIIIlIll[4] = 108 + 133 - 163 + 97 ^ 84 + 9 - -66 + 19;
      lIIIIIlIll[5] = 88 ^ 86;
      lIIIIIlIll[6] = "  ".length();
      lIIIIIlIll[7] = "   ".length();
      lIIIIIlIll[8] = 26 + 94 - 100 + 167 ^ 17 + 93 - 94 + 174;
      lIIIIIlIll[9] = 114 ^ 45 ^ 199 ^ 132;
      lIIIIIlIll[10] = 7 ^ 105 ^ 84 ^ 21;
      lIIIIIlIll[11] = -(-23781 & 24303) & -10242 & 11263;
      lIIIIIlIll[12] = -(-10311 & 14423) & -18433 & 23544;
      lIIIIIlIll[13] = 110 + 100 - 199 + 162 ^ 36 + 64 - 68 + 138;
      lIIIIIlIll[14] = 127 ^ 111;
      lIIIIIlIll[15] = 77 ^ 22 ^ 36 ^ 119;
      lIIIIIlIll[16] = -1 & 2147483647;
      lIIIIIlIll[17] = 65 ^ 97;
      lIIIIIlIll[18] = 16 ^ 45 ^ 220 ^ 133;
      lIIIIIlIll[19] = 27 + 9 - -92 + 0 ^ 72 + 21 - -89 + 9;
      lIIIIIlIll[20] = 106 ^ 99;
   }

   public void ⲋ(@NotNull ⅵ var1, int var2) {
      super.ⲋ(var1, var2);
      if (lIIIlllIlII(this.ᵴἥ()) && lIIIlllIlIl(this.ς)) {
         this.ς = (boolean)lIIIIIlIll[2];
         this.Ꜥ = System.currentTimeMillis();
         this.Ἒⅾ.ⴜ();
      }

   }

   public ⲽ(@Nullable ᵭ<String> var1, @Nullable String var2, int var3, @Nullable Regex var4, @Nullable String var5, int var6) {
      super();
      lIllIIIlllIIlll.Đ = var1;
      lIllIIIlllIIlll.ᵴἥ = var2;
      lIllIIIlllIIlll.Ɏ = var3;
      lIllIIIlllIIlll.ɡ = var4;
      lIllIIIlllIIlll.ⴜ = var5;
      lIllIIIlllIIlll.ͷ = var6;
      lIllIIIlllIIlll.〥ҳⱆ = lIIIIIIllI[lIIIIIlIll[15]];
      lIllIIIlllIIlll.Ἒⅾ = (new ⱙ()).u(Ὴ.ⲋ.ⲋ().u()).ᴃᎲ(Ὴ.ⲋ.ⲋ().ϛⰄ()).Ἒⅾ(0.1D);
      ᵭ var10000 = lIllIIIlllIIlll.Đ;
      if (lIIIllllIll(var10000)) {
         var10000.ⲋ((Function1)(new Function1<ᵭ<String>, Unit>() {
            public final void ⲋ(@NotNull ᵭ<String> var1) {
               lIllIIIlllIIlll.ⲋ((String)var1.ⲋ());
            }

            static {
               lIlllIllll();
            }

            private static void lIlllIllll() {
               lIllIIlll = new int[1];
               lIllIIlll[0] = " ".length();
            }
         }));
         "".length();
         if (" ".length() <= 0) {
            throw null;
         }
      } else {
         "".length();
      }

      if (lIIIllllIll(lIllIIIlllIIlll.Đ)) {
         char lIllIIIllIlllll = lIIIIIlIll[3];
         boolean lIllIIIllIllllI = lIIIIIlIll[3];
         float lIllIIIllIlllII = lIIIIIlIll[3];
         lIllIIIlllIIlll.〥ҳⱆ = (String)lIllIIIlllIIlll.Đ.ⲋ();
         "".length();
         if (" ".length() != " ".length()) {
            throw null;
         }
      } else {
         "".length();
      }

      lIllIIIlllIIlll.Ἒⅾ.ͷ();
      lIllIIIlllIIlll.Ἒⅾ.ς();
   }

   private final void ȵ() {
      this.ς = (boolean)lIIIIIlIll[3];
      this.Ἒⅾ.ͷ();
   }

   @JvmName(
      name = "ɻ"
   )
   public final String ɻ() {
      return this.ⴜ;
   }

   public void b_() {
      ⲙ.ⲋ.ⲋ(0.0D, 0.0D, (double)lIllIIIlllllIll.ⲡ().ⲋ(), (double)lIllIIIlllllIll.ⲡ().ĂƂ(), 2.0D, lIllIIIlllllIll.Ἒⅾ.ⲡ());
      ⲙ.ⲋ((float)lIIIIIlIll[6], (float)lIIIIIlIll[6], (float)lIllIIIlllllIll.ⲡ().ⲋ() - 4.0F, (float)lIllIIIlllllIll.ⲡ().ĂƂ() - 4.0F, Color.white);
      int lIllIIIlllllIlI = lIIIIIlIll[3];
      if (lIIIlllIlII(lIllIIIlllllIll.ς)) {
         long lIllIIIlllllIIl = System.currentTimeMillis();
         if (lIIlIIIIIII(lIIIlllllll(lIllIIIlllllIIl - lIllIIIlllllIll.Ꜥ, (long)lIIIIIlIll[11]))) {
            lIllIIIlllllIlI = lIIIIIlIll[2];
         }

         if (lIIlIIIIIII(lIIIlllllll(lIllIIIlllllIIl - lIllIIIlllllIll.Ꜥ, (long)lIIIIIlIll[12]))) {
            lIllIIIlllllIlI = lIIIIIlIll[3];
            lIllIIIlllllIll.Ꜥ = System.currentTimeMillis();
         }
      }

      char lIllIIIlllllIIl = lIllIIIlllllIll.〥ҳⱆ;
      if (lIIIlllIlII(lIllIIIlllllIlI)) {
         lIllIIIlllllIIl = String.valueOf((new StringBuilder()).append(lIllIIIlllllIIl).append(lIIIIIIllI[lIIIIIlIll[13]]));
      }

      int lIllIIIllllIlll;
      if (lIIIllllIII(lIllIIIlllllIll.ᵴἥ)) {
         if (lIIIllllIll(lIllIIIlllllIll.ⴜ)) {
            lIllIIIllllIlll = lIIIIIlIll[3];
            boolean lIllIIIllllIllI = lIIIIIlIll[3];
            String lIllIIIllllIlII = lIIIIIlIll[3];
            lIllIIIlllllIIl = String.valueOf((new StringBuilder()).append(lIllIIIlllllIll.ⴜ).append(lIllIIIlllllIIl));
            "".length();
            if (-" ".length() > 0) {
               return;
            }
         } else {
            "".length();
         }
      }

      String lIllIIIlllllIII = (CharSequence)lIllIIIlllllIll.〥ҳⱆ;
      lIllIIIllllIlll = lIIIIIlIll[3];
      int var10000;
      if (lIIIlllIlIl(lIllIIIlllllIII.length())) {
         var10000 = lIIIIIlIll[2];
         "".length();
         if ("  ".length() <= 0) {
            return;
         }
      } else {
         var10000 = lIIIIIlIll[3];
      }

      if (lIIIlllIlII(var10000) && lIIIllllIll(lIllIIIlllllIll.ᵴἥ)) {
         Ꞓ.DefaultImpls.ⲋ$default(lIllIIIlllllIll.ƶ(), lIIIIIlIll[8], lIIIIIlIll[8], Ὴ.ⲋ.ⲋ().ĂƂ(), lIllIIIlllllIll.ᵴἥ, (boolean)lIIIIIlIll[3], lIIIIIlIll[14], (Object)null);
      }

      lIllIIIlllllIII = (CharSequence)lIllIIIlllllIIl;
      lIllIIIllllIlll = lIIIIIlIll[3];
      if (lIIIlllIlll(lIllIIIlllllIII.length())) {
         var10000 = lIIIIIlIll[2];
         "".length();
         if ((134 ^ 130) == " ".length()) {
            return;
         }
      } else {
         var10000 = lIIIIIlIll[3];
      }

      if (lIIIlllIlII(var10000)) {
         lIllIIIlllllIll.ƶ().ⲋ(lIIIIIlIll[8], lIIIIIlIll[8], Color.black, lIllIIIlllllIIl, (boolean)lIIIIIlIll[3]);
      }

      super.b_();
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return new ė(this.ͷ, this.ƶ().ⲋ() + lIIIIIlIll[0] + lIIIIIlIll[1]);
   }

   private static boolean lIIIlllIlII(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ɧῙ"
   )
   public final ᵭ<String> ɧῙ() {
      return this.Đ;
   }

   private static int lIIIlllllll(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   @JvmName(
      name = "ꙑứ"
   )
   public final Function1<ⲽ, Unit> ꙑứ() {
      return this.ⲡ;
   }

   @JvmName(
      name = "ƶ"
   )
   private final Ꞓ ƶ() {
      return ⱉȬ.ᴃᎲ.ⲋ();
   }

   private static boolean lIIIllllIII(Object var0) {
      return var0 == null;
   }

   private static boolean lIIIlllllIl(int var0, int var1) {
      return var0 < var1;
   }

   @NotNull
   public final ⲽ ĂƂ(@NotNull Function1<? super ⲽ, Unit> var1) {
      int var3 = lIIIIIlIll[3];
      int var4 = lIIIIIlIll[3];
      ⲽ var5 = (ⲽ)this;
      int var6 = lIIIIIlIll[3];
      var5.ⲡ = var1;
      return (ⲽ)this;
   }

   @JvmName(
      name = "ⱯꝣѺ"
   )
   public final long ⱯꝣѺ() {
      return this.Ꜥ;
   }

   public void ĂƂ(@NotNull ⅵ var1, int var2) {
      super.ĂƂ(var1, var2);
      if (lIIIlllIlIl(this.ᵴἥ()) && lIIIlllIlII(this.ς)) {
         this.ȵ();
      }

   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@NotNull String var1) {
      this.〥ҳⱆ = var1;
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0086TR\u001a\u0010\u0005\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003¨\u0006\u0086T"},
      d2 = {"La/ⲽ$ⲋ;", "", "u", "I", "ⲋ", "ĂƂ", "<init>", "()V", ""}
   )
   public static final class ⲋ {
      private ⲋ() {
      }
   }
}
