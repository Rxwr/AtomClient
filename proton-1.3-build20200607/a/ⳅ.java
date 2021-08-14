package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.full.KClasses;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0013\b'\u0018\u00002\u00020=B?\b\u0004\u0012\u0006\u00109\u001a\u00020\u0007\u0012\u0006\u0010D\u001a\u00020\u0007\u0012\u0006\u0010K\u001a\u00020\u0001\u0012\b\b\u0002\u0010L\u001a\u00020\u001e\u0012\b\b\u0002\u0010M\u001a\u00020\u000e\u0012\b\b\u0002\u0010N\u001a\u00020\u000e¢\u0006\u0004\bO\u0010PJ\r\u00105\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0016J\r\u00108\u001a\u000204¢\u0006\u0004\b8\u00106J\u001d\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\u0006\u00109\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0006\u0010:J\r\u0010;\u001a\u00020\u000e¢\u0006\u0004\b;\u0010\u0016J!\u0010\u0006\u001a\u0002042\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020=0<¢\u0006\u0004\b\u0006\u0010>J\u000f\u0010?\u001a\u000204H\u0014¢\u0006\u0004\b?\u00106J\u000f\u0010\u0018\u001a\u000204H\u0014¢\u0006\u0004\b\u0018\u00106J\u000f\u0010@\u001a\u000204H\u0016¢\u0006\u0004\b@\u00106J\u000f\u0010A\u001a\u000204H\u0016¢\u0006\u0004\bA\u00106J\u000f\u0010B\u001a\u000204H\u0016¢\u0006\u0004\bB\u00106J\u000f\u0010\u0006\u001a\u000204H\u0002¢\u0006\u0004\b\u0006\u00106J\u000f\u0010C\u001a\u000204H\u0016¢\u0006\u0004\bC\u00106J/\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\b\b\u0000\u0010E*\u00020=2\u0006\u00109\u001a\u00020\u00072\u0006\u0010D\u001a\u00028\u0000H\u0005¢\u0006\u0004\b\u0006\u0010FJ\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020=0<H\u0007¢\u0006\u0004\bG\u0010HJ\u0017\u0010\u0006\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u001eH\u0004¢\u0006\u0004\b\u0006\u0010IJ\r\u0010J\u001a\u000204¢\u0006\u0004\bJ\u00106R\u001d\u0010\u0006\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004R\u001d\u0010\f\u001a\u00020\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0086\u0004R#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0086\u0004R\u001d\u0010\u0017\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0086\u0004R\u001d\u0010\u001a\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u0086\u0004R \u0010\u001c\u001a\u00020\u00078\u0017@\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u0096DR\u0017\u0010\b\u001a\u00020\u000e8G@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016¨\u0006\u0086\u0004R&\u0010\u0002\u001a\u00020\u001e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\f\u0010#¨\u0006\u0086\u000eR \u0010\u001f\u001a\u00020$8\u0005@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006\u0084\u0004R&\u0010\u0013\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\t\u001a\u0004\b(\u0010\u000b\"\u0004\b\f\u0010)¨\u0006\u0086\u000eR'\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*8\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.¨\u0006\u0086\u0004R9\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0/j\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e`08\u0007@\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u00103¨\u0006\u0086\u0004"},
   d2 = {"La/ⳅ;", "La/ı５;", "ς", "La/ı５;", "Ｆ", "()La/ı５;", "ⲋ", "", "ϛⰄ", "Ljava/lang/String;", "Ѿ", "()Ljava/lang/String;", "ĂƂ", "La/ᵭ;", "", "La/ᵭ;", "ᵴἥ", "()La/ᵭ;", "u", "ⲡ", "Z", "Ｓ꣙ὐ", "()Z", "ᴃᎲ", "Đ", "Ƈ", "〥ҳⱆ", "ƶ", "Ἒⅾ", "Ɏ", "", "Ꜥ", "I", "öỴʘѷ", "()I", "(I)V", "Lnet/minecraft/client/Minecraft;", "Lnet/minecraft/client/Minecraft;", "ɡ", "()Lnet/minecraft/client/Minecraft;", "ȵ", "(Ljava/lang/String;)V", "", "La/ⅹ;", "Ljava/util/List;", "ⴜ", "()Ljava/util/List;", "Ljava/util/HashMap;", "Lkotlin/collections/ĂƂ;", "Ljava/util/HashMap;", "ͷ", "()Ljava/util/HashMap;", "", "ꙑứ", "()V", "Ⳓ", "ⱯꝣѺ", "p0", "(Ljava/lang/String;)La/ⅹ;", "Ꙗ", "", "", "(Ljava/util/Map;)V", "ʅ", "Ἠ", "ɻ", "ƺ", "ἶṗ", "p1", "T", "(Ljava/lang/String;Ljava/lang/Object;)La/ⅹ;", "Ꞑ", "()Ljava/util/Map;", "(I)Z", "ɧῙ", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;La/ı５;IZZ)V"}
)
public abstract class ⳅ {
   public void Ἠ() {
   }

   private static boolean lIlIIIlIlll(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "Ɏ"
   )
   public final boolean Ɏ() {
      return (Boolean)this.ⲋ.ⲋ();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(int var1) {
      this.Ꜥ = var1;
   }

   @NotNull
   public final Map<String, Object> Ꞑ() {
      int var2 = lIIlIlllII[0];
      HashMap lIlIIlIIlIIlIII = new HashMap();
      ((Map)lIlIIlIIlIIlIII).put(lIIlIIlIIl[lIIlIlllII[7]], ᾞ.ⲋ.ⲋ(lIlIIlIIlIIlIIl.Ꜥ));
      "".length();
      if (lIlIIIllIII(lIlIIlIIlIIlIIl instanceof Թ)) {
         ((Map)lIlIIlIIlIIlIII).put(lIIlIIlIIl[lIIlIlllII[8]], lIlIIlIIlIIlIIl.ⲋ.ⲋ());
         "".length();
      }

      byte lIlIIlIIlIIIlll = (Iterable)lIlIIlIIlIIlIIl.u;
      float lIlIIlIIlIIIllI = lIIlIlllII[0];
      Iterator lIlIIlIIlIIIlIl = lIlIIlIIlIIIlll.iterator();

      do {
         if (!lIlIIIlIlll(lIlIIlIIlIIIlIl.hasNext())) {
            return (Map)lIlIIlIIlIIlIII;
         }

         byte lIlIIlIIlIIIlII = lIlIIlIIlIIIlIl.next();
         double lIlIIlIIlIIIIll = (ⅹ)lIlIIlIIlIIIlII;
         float lIlIIlIIlIIIIlI = lIIlIlllII[0];
         ((Map)lIlIIlIIlIIlIII).put(lIlIIlIIlIIIIll.ɡ(), lIlIIlIIlIIIIll.toString());
         "".length();
         "".length();
      } while(-" ".length() <= -" ".length());

      return null;
   }

   protected void Đ() {
   }

   @NotNull
   protected final <T> ⅹ<T> ⲋ(@NotNull String var1, @NotNull T lIlIIlIIIlllIII) {
      ⅹ lIlIIlIIIllIlll = new ⅹ(var1, lIlIIlIIIlllIII);
      if (lIlIIIlIlll(KClasses.isSubclassOf(Reflection.getOrCreateKotlinClass(lIlIIlIIIlllIII.getClass()), Reflection.getOrCreateKotlinClass(Enum.class)))) {
         lIlIIlIIIllIlll.ⲋ(ʞ.〥ҳⱆ);
         "".length();
         if (-" ".length() >= 0) {
            return null;
         }
      } else {
         ʞ var10001;
         if (lIlIIIlIlll(lIlIIlIIIlllIII instanceof Boolean)) {
            var10001 = ʞ.ⲋ;
            "".length();
            if (-(132 + 142 - 193 + 63 ^ 87 + 114 - 178 + 126) >= 0) {
               return null;
            }
         } else if (lIlIIIlIlll(lIlIIlIIIlllIII instanceof Integer)) {
            var10001 = ʞ.ĂƂ;
            "".length();
            if ("   ".length() == 0) {
               return null;
            }
         } else if (lIlIIIlIlll(lIlIIlIIIlllIII instanceof Double)) {
            var10001 = ʞ.u;
            "".length();
            if (-"   ".length() > 0) {
               return null;
            }
         } else if (lIlIIIlIlll(lIlIIlIIIlllIII instanceof String)) {
            var10001 = ʞ.ᴃᎲ;
            "".length();
            if (" ".length() >= (172 ^ 168)) {
               return null;
            }
         } else if (lIlIIIlIlll(lIlIIlIIIlllIII instanceof Color)) {
            var10001 = ʞ.Ἒⅾ;
            "".length();
            if ("   ".length() == 0) {
               return null;
            }
         } else if (lIlIIIlIlll(TypeIntrinsics.isMutableList(lIlIIlIIIlllIII))) {
            var10001 = ʞ.ϛⰄ;
            "".length();
            if (((29 ^ 88) & ~(28 ^ 89)) > ((166 ^ 134) & ~(52 ^ 20))) {
               return null;
            }
         } else {
            var10001 = ʞ.ς;
         }

         lIlIIlIIIllIlll.ⲋ(var10001);
      }

      this.u.add(lIlIIlIIIllIlll);
      "".length();
      return lIlIIlIIIllIlll;
   }

   public final boolean Ⳓ() {
      int var2;
      label18: {
         ⅹ var10000 = this.ⲋ(lIIlIIlIIl[lIIlIlllII[0]]);
         if (lIlIIIlIIIl(var10000)) {
            ᵭ var1 = var10000.ⲋ();
            if (lIlIIIlIIIl(var1)) {
               if (lIlIIIlIlII((Boolean)var1.ⲋ(), lIIlIlllII[1])) {
                  var2 = lIIlIlllII[1];
                  "".length();
                  if (-(133 ^ 128) >= 0) {
                     return (boolean)((109 ^ 117) & ~(39 ^ 63));
                  }

                  return (boolean)var2;
               }
               break label18;
            }
         }

         "".length();
      }

      var2 = lIIlIlllII[0];
      return (boolean)var2;
   }

   private static boolean lIlIIIllIlI(int var0) {
      return var0 >= 0;
   }

   public void ἶṗ() {
   }

   @Nullable
   public final ⅹ<?> ⲋ(@NotNull String lIlIIlIlIIIllll) {
      Iterable var2 = (Iterable)this.u;
      int var3 = lIIlIlllII[0];
      int var5 = lIIlIlllII[0];
      Iterator lIlIIlIlIIIlIlI = var2.iterator();

      Object var18;
      while(true) {
         if (!lIlIIIlIlll(lIlIIlIlIIIlIlI.hasNext())) {
            var18 = null;
            break;
         }

         Object lIlIIlIlIIIlIIl;
         int var17;
         label40: {
            lIlIIlIlIIIlIIl = lIlIIlIlIIIlIlI.next();
            boolean lIlIIlIlIIIlIII = (ⅹ)lIlIIlIlIIIlIIl;
            String lIlIIlIlIIIIlll = lIIlIlllII[0];
            if (lIlIIIllIII(StringsKt.equals(lIlIIlIlIIIlIII.ɡ(), lIlIIlIlIIIllll, (boolean)lIIlIlllII[1]))) {
               CharSequence var10000 = (CharSequence)lIlIIlIlIIIlIII.ɡ();
               String[] var10001 = new String[lIIlIlllII[1]];
               var10001[lIIlIlllII[0]] = lIIlIIlIIl[lIIlIlllII[3]];
               byte lIlIIlIlIIIIllI = (Iterable)StringsKt.split$default(var10000, var10001, (boolean)lIIlIlllII[0], lIIlIlllII[0], lIIlIlllII[4], (Object)null);
               Exception lIlIIlIlIIIIlIl = lIIlIlllII[0];
               short lIlIIlIlIIIIlII = lIlIIlIlIIIIllI.iterator();
               if (lIlIIIllIII(lIlIIlIlIIIIlII.hasNext())) {
                  throw (Throwable)(new UnsupportedOperationException(lIIlIIlIIl[lIIlIlllII[5]]));
               }

               Object lIlIIlIlIIIIIll = lIlIIlIlIIIIlII.next();

               while(lIlIIIlIlll(lIlIIlIlIIIIlII.hasNext())) {
                  char lIlIIlIlIIIIIlI = (String)lIlIIlIlIIIIlII.next();
                  short lIlIIlIlIIIIIIl = (String)lIlIIlIlIIIIIll;
                  int lIlIIlIlIIIIIII = lIIlIlllII[0];
                  lIlIIlIlIIIIIll = String.valueOf((new StringBuilder()).append(lIlIIlIlIIIIIIl).append(lIlIIlIlIIIIIlI));
                  "".length();
                  if (null != null) {
                     return null;
                  }
               }

               if (!lIlIIIlIlll(StringsKt.equals((String)lIlIIlIlIIIIIll, lIlIIlIlIIIllll, (boolean)lIIlIlllII[1]))) {
                  var17 = lIIlIlllII[0];
                  break label40;
               }
            }

            var17 = lIIlIlllII[1];
            "".length();
            if ("   ".length() < -" ".length()) {
               return null;
            }
         }

         if (lIlIIIlIlll(var17)) {
            var18 = lIlIIlIlIIIlIIl;
            "".length();
            if (null != null) {
               return null;
            }
            break;
         }
      }

      return (ⅹ)var18;
   }

   protected final boolean ⲋ(int var1) {
      Map var2 = (Map)this.ᴃᎲ;
      Integer var3 = var1;
      int var4 = lIIlIlllII[0];
      Object lIlIIlIIIIllIIl = var2.get(var3);
      Object var10000;
      if (lIlIIIllIll(lIlIIlIIIIllIIl)) {
         int var6 = lIIlIlllII[0];
         Integer var7 = lIIlIlllII[0];
         var2.put(var3, var7);
         "".length();
         var10000 = var7;
         "".length();
         if (null != null) {
            return (boolean)((67 ^ 59 ^ 145 ^ 188) & (140 ^ 129 ^ 6 ^ 94 ^ -" ".length()));
         }
      } else {
         var10000 = lIlIIlIIIIllIIl;
      }

      int var8;
      if (lIlIIIllIII(((Number)var10000).intValue())) {
         var8 = lIIlIlllII[1];
         "".length();
         if ("   ".length() != "   ".length()) {
            return (boolean)((25 ^ 65) & ~(100 ^ 60));
         }
      } else {
         var8 = lIIlIlllII[0];
      }

      return (boolean)var8;
   }

   @JvmName(
      name = "Ｓ꣙ὐ"
   )
   public final boolean Ｓ꣙ὐ() {
      return this.ⲡ;
   }

   private static boolean lIlIIlIllII(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "Ｆ"
   )
   public final ı５ Ｆ() {
      return this.ς;
   }

   @JvmName(
      name = "ⴜ"
   )
   public final List<ⅹ<?>> ⴜ() {
      return this.u;
   }

   @JvmName(
      name = "ͷ"
   )
   public final HashMap<Integer, Integer> ͷ() {
      return this.ᴃᎲ;
   }

   protected ⳅ(@NotNull String var1, @NotNull String var2, @NotNull ı５ var3, int var4, boolean var5, boolean var6) {
      this.Ἒⅾ = var1;
      this.ϛⰄ = var2;
      this.ς = var3;
      this.Ꜥ = var4;
      this.ⲡ = var5;
      this.Đ = var6;
      ᵭ var7 = new ᵭ(Boolean.valueOf((boolean)lIIlIlllII[0]), (boolean)lIIlIlllII[0], lIIlIlllII[2], (DefaultConstructorMarker)null);
      int var8 = lIIlIlllII[0];
      int var9 = lIIlIlllII[0];
      int var11 = lIIlIlllII[0];
      var7.ⲋ((Function1)(new ⳅ$1(this)));
      this.ⲋ = var7;
      this.ĂƂ = Minecraft.func_71410_x();
      int var14 = lIIlIlllII[0];
      List var13 = (List)(new ArrayList());
      this.u = var13;
      var14 = lIIlIlllII[0];
      HashMap var15 = new HashMap();
      this.ᴃᎲ = var15;
      this.ⲋ(lIIlIIlIIl[lIIlIlllII[9]], this.Đ).Đ();
      "".length();
      this.ⲋ(lIIlIIlIIl[lIIlIlllII[10]], Boolean.valueOf((boolean)lIIlIlllII[0])).Đ();
      "".length();
      this.〥ҳⱆ = lIIlIIlIIl[lIIlIlllII[11]];
   }

   public final void ꙑứ() {
      this.ⲋ.ⲋ((Object)Boolean.valueOf((boolean)lIIlIlllII[0]));
   }

   public final void ⲋ(@NotNull Map<String, ? extends Object> lIlIIlIIllIIlll) {
      Object var2 = lIlIIlIIllIIlll.get(lIIlIIlIIl[lIIlIlllII[6]]);
      int lIlIIlIIllIIIll;
      int lIlIIlIIllIIIIl;
      if (lIlIIIlIIIl(var2)) {
         int var4 = lIIlIlllII[0];
         lIlIIlIIllIIIll = lIIlIlllII[0];
         lIlIIlIIllIIIIl = lIIlIlllII[0];
         lIlIIlIIllIlIII.Ꜥ = ᾞ.ⲋ.ⲋ((String)var2);
         "".length();
         if ((55 ^ 51) < "   ".length()) {
            return;
         }
      } else {
         "".length();
      }

      long lIlIIlIIllIIlIl = lIlIIlIIllIIlll.get(lIIlIIlIIl[lIIlIlllII[4]]);
      if (lIlIIIlIIIl(lIlIIlIIllIIlIl)) {
         lIlIIlIIllIIIll = lIIlIlllII[0];
         short lIlIIlIIllIIIlI = lIIlIlllII[0];
         boolean lIlIIlIIllIIIII = lIIlIlllII[0];
         if (lIlIIIlIlll(lIlIIlIIllIIlIl instanceof Boolean)) {
            if (lIlIIIlIlll((Boolean)lIlIIlIIllIIlIl)) {
               lIlIIlIIllIlIII.ⱯꝣѺ();
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               lIlIIlIIllIlIII.ꙑứ();
            }
         }

         "".length();
         if (null != null) {
            return;
         }
      } else {
         "".length();
      }

      lIlIIlIIllIIIll = lIIlIlllII[0];
      lIlIIlIIllIIIIl = lIIlIlllII[0];
      Iterator lIlIIlIIllIIIII = lIlIIlIIllIIlll.entrySet().iterator();

      do {
         if (!lIlIIIlIlll(lIlIIlIIllIIIII.hasNext())) {
            return;
         }

         boolean lIlIIlIIlIlllll = (Entry)lIlIIlIIllIIIII.next();
         short lIlIIlIIlIlllIl = lIIlIlllII[0];
         String lIlIIlIIlIllIll = lIIlIlllII[0];
         short lIlIIlIIlIllIlI = (String)lIlIIlIIlIlllll.getKey();
         lIlIIlIIlIllIll = lIIlIlllII[0];
         byte lIlIIlIIlIllIIl = lIlIIlIIlIlllll.getValue();
         String lIlIIlIIlIllIll = (Iterable)lIlIIlIIllIlIII.u;
         boolean lIlIIlIIlIllIII = lIIlIlllII[0];
         double lIlIIlIIlIlIllI = lIIlIlllII[0];
         Iterator lIlIIlIIlIlIlIl = lIlIIlIIlIllIll.iterator();

         Object var10000;
         while(true) {
            if (!lIlIIIlIlll(lIlIIlIIlIlIlIl.hasNext())) {
               var10000 = null;
               break;
            }

            double lIlIIlIIlIlIlII = lIlIIlIIlIlIlIl.next();
            char lIlIIlIIlIlIIll = (ⅹ)lIlIIlIIlIlIlII;
            short lIlIIlIIlIlIIlI = lIIlIlllII[0];
            if (lIlIIIlIlll(Intrinsics.areEqual((Object)lIlIIlIIlIlIIll.ɡ(), (Object)lIlIIlIIlIllIlI))) {
               var10000 = lIlIIlIIlIlIlII;
               "".length();
               if ((131 ^ 135) < 0) {
                  return;
               }
               break;
            }
         }

         long lIlIIlIIlIlllII = (ⅹ)var10000;
         if (lIlIIIlIIIl(lIlIIlIIlIlllII)) {
            lIlIIlIIlIlllII.〥ҳⱆ(lIlIIlIIlIllIIl);
            "".length();
            if (" ".length() <= ((51 + 1 - -19 + 60 ^ 93 + 175 - 138 + 50) & (96 ^ 102 ^ 78 ^ 127 ^ -" ".length()))) {
               return;
            }
         } else {
            "".length();
         }

         "".length();
      } while((175 ^ 171) != 0);

   }

   @JvmName(
      name = "ᵴἥ"
   )
   public final ᵭ<Boolean> ᵴἥ() {
      return this.ⲋ;
   }

   protected void ʅ() {
   }

   public final void ⱯꝣѺ() {
      this.ⲋ.ⲋ((Object)Boolean.valueOf((boolean)lIIlIlllII[1]));
      this.ᴃᎲ.clear();
   }

   @JvmName(
      name = "Ѿ"
   )
   public final String Ѿ() {
      return this.ϛⰄ;
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      return this.〥ҳⱆ;
   }

   @JvmName(
      name = "öỴʘѷ"
   )
   public final int öỴʘѷ() {
      return this.Ꜥ;
   }

   private static boolean lIlIIIlIlII(int var0, int var1) {
      return var0 == var1;
   }

   static {
      lIlIIIIllll();
      lIIlllllIIl();
   }

   public final void ɧῙ() {
      Iterable var1 = (Iterable)lIlIIlIIIlIllIl.ᴃᎲ.keySet();
      int var2 = lIIlIlllII[0];
      Iterator lIlIIlIIIlIlIlI = var1.iterator();

      do {
         if (!lIlIIIlIlll(lIlIIlIIIlIlIlI.hasNext())) {
            return;
         }

         long lIlIIlIIIlIlIIl = lIlIIlIIIlIlIlI.next();
         char lIlIIlIIIlIlIII = (Integer)lIlIIlIIIlIlIIl;
         boolean lIlIIlIIIlIIlll = lIIlIlllII[0];
         short lIlIIlIIIlIIllI = (Integer)lIlIIlIIIlIllIl.ᴃᎲ.get(lIlIIlIIIlIlIII);
         if (lIlIIIlIIIl(lIlIIlIIIlIIllI)) {
            if (lIlIIIllIlI(Intrinsics.compare(lIlIIlIIIlIIllI, lIlIIlIIIlIlIII))) {
               ((Map)lIlIIlIIIlIllIl.ᴃᎲ).put(lIlIIlIIIlIlIII, lIIlIlllII[0]);
               "".length();
               "".length();
               if (-" ".length() == "  ".length()) {
                  return;
               }
            } else {
               ((Map)lIlIIlIIIlIllIl.ᴃᎲ).put(lIlIIlIIIlIlIII, lIlIIlIIIlIIllI + lIIlIlllII[1]);
               "".length();
            }
         }

         "".length();
      } while(((83 ^ 122) & ~(234 ^ 195)) == 0);

   }

   public void ɻ() {
   }

   private static String lIIlllIllII(String lIlIIIllllllllI, String lIlIIIlllllllll) {
      try {
         SecretKeySpec lIlIIlIIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIlllllllll.getBytes(StandardCharsets.UTF_8)), lIIlIlllII[8]), "DES");
         Cipher lIlIIlIIIIIIIlI = Cipher.getInstance("DES");
         lIlIIlIIIIIIIlI.init(lIIlIlllII[2], lIlIIlIIIIIIIll);
         return new String(lIlIIlIIIIIIIlI.doFinal(Base64.getDecoder().decode(lIlIIIllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void ƺ() {
   }

   @JvmName(
      name = "Ƈ"
   )
   public final boolean Ƈ() {
      return this.Đ;
   }

   private static boolean lIlIIIllIII(int var0) {
      return var0 == 0;
   }

   @JvmName(
      name = "ȵ"
   )
   public final String ȵ() {
      return this.Ἒⅾ;
   }

   public final boolean Ꙗ() {
      ⅹ var10000 = this.ⲋ(lIIlIIlIIl[lIIlIlllII[1]]);
      String var3;
      if (lIlIIIlIIIl(var10000)) {
         ᵭ var2 = var10000.ⲋ();
         if (lIlIIIlIIIl(var2)) {
            var3 = var2.u();
            "".length();
            if (-" ".length() < -" ".length()) {
               return (boolean)((37 ^ 97 ^ 27 ^ 96) & (110 ^ 95 ^ 109 ^ 99 ^ -" ".length()));
            }

            return Intrinsics.areEqual((Object)var3, (Object)lIIlIIlIIl[lIIlIlllII[2]]);
         }
      }

      "".length();
      var3 = null;
      return Intrinsics.areEqual((Object)var3, (Object)lIIlIIlIIl[lIIlIlllII[2]]);
   }

   private static boolean lIlIIIllIll(Object var0) {
      return var0 == null;
   }

   private static void lIIlllllIIl() {
      lIIlIIlIIl = new String[lIIlIlllII[14]];
      lIIlIIlIIl[lIIlIlllII[0]] = lIIlllIllII("P6uzblhhKGHKbkcTw4Y7mg==", "skdPK");
      lIIlIIlIIl[lIIlIlllII[1]] = lIIllllIIII("GjwiEA88", "RUFtj");
      lIIlIIlIIl[lIIlIlllII[2]] = lIIlllIllII("gJ1UQOOjxlg=", "Ykusc");
      lIIlIIlIIl[lIIlIlllII[3]] = lIIllllIIIl("wdbVNpOy9ik=", "iPsnf");
      lIIlIIlIIl[lIIlIlllII[5]] = lIIllllIIIl("xkeh43Ne8Id9MgpRpdw6B6BhD1NUa1aju7ss95a3K/YVCE+tcJFRHQ==", "RBZZZ");
      lIIlIIlIIl[lIIlIlllII[6]] = lIIllllIIII("IAoLLQ==", "bceII");
      lIIlIIlIIl[lIIlIlllII[4]] = lIIllllIIII("LzkOGjwPMw==", "jWoxP");
      lIIlIIlIIl[lIIlIlllII[7]] = lIIllllIIIl("hTSBV+3KHIc=", "WhcWC");
      lIIlIIlIIl[lIIlIlllII[8]] = lIIllllIIIl("EhATFwnazjc=", "rTbMi");
      lIIlIIlIIl[lIIlIlllII[9]] = lIIllllIIIl("6XIODtndWZ0=", "MZCPc");
      lIIlIIlIIl[lIIlIlllII[10]] = lIIlllIllII("+NgfQfza39IyvgkiMq56pw==", "zEBLi");
      lIIlIIlIIl[lIIlIlllII[11]] = lIIllllIIII("", "tNBKg");
   }

   private static boolean lIlIIIlIIIl(Object var0) {
      return var0 != null;
   }

   private final void ⲋ() {
      if (lIlIIIlIlll((Boolean)lIlIIlIIlIIIIII.ⲋ.ⲋ())) {
         lIlIIlIIlIIIIII.Đ();
         ƶ.ⲋ.ĂƂ(lIlIIlIIlIIIIII);
         "".length();
         if (((45 + 60 - -20 + 26 ^ 0 + 51 - -33 + 71) & (110 ^ 20 ^ 100 ^ 18 ^ -" ".length())) > 0) {
            return;
         }
      } else {
         lIlIIlIIlIIIIII.ʅ();
         ƶ.ⲋ.u(lIlIIlIIlIIIIII);
      }

   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(@NotNull String var1) {
      this.Ἒⅾ = var1;
   }

   private static String lIIllllIIIl(String lIlIIIlllIllIll, String lIlIIIlllIllIII) {
      try {
         int lIlIIIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lIlIIIlllIlllIl = Cipher.getInstance("Blowfish");
         lIlIIIlllIlllIl.init(lIIlIlllII[2], lIlIIIlllIlIlll);
         return new String(lIlIIIlllIlllIl.doFinal(Base64.getDecoder().decode(lIlIIIlllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllllIIII(String lIlIIIllllIlIll, String lIlIIIllllIlIlI) {
      lIlIIIllllIlIll = new String(Base64.getDecoder().decode(lIlIIIllllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlIIIllllIlllI = new StringBuilder();
      char[] lIlIIIllllIllIl = lIlIIIllllIlIlI.toCharArray();
      int lIlIIIllllIllII = lIIlIlllII[0];
      boolean lIlIIIllllIIllI = lIlIIIllllIlIll.toCharArray();
      double lIlIIIllllIIlIl = lIlIIIllllIIllI.length;
      int lIlIIIllllIIlII = lIIlIlllII[0];

      do {
         if (!lIlIIlIllII(lIlIIIllllIIlII, lIlIIIllllIIlIl)) {
            return String.valueOf(lIlIIIllllIlllI);
         }

         char lIlIIIlllllIIIl = lIlIIIllllIIllI[lIlIIIllllIIlII];
         lIlIIIllllIlllI.append((char)(lIlIIIlllllIIIl ^ lIlIIIllllIllIl[lIlIIIllllIllII % lIlIIIllllIllIl.length]));
         "".length();
         ++lIlIIIllllIllII;
         ++lIlIIIllllIIlII;
         "".length();
      } while(-" ".length() <= 0);

      return null;
   }

   private static void lIlIIIIllll() {
      lIIlIlllII = new int[15];
      lIIlIlllII[0] = (141 ^ 183) & ~(189 ^ 135);
      lIIlIlllII[1] = " ".length();
      lIIlIlllII[2] = "  ".length();
      lIIlIlllII[3] = "   ".length();
      lIIlIlllII[4] = 76 ^ 74;
      lIIlIlllII[5] = 28 ^ 89 ^ 229 ^ 164;
      lIIlIlllII[6] = 123 + 84 - 138 + 82 ^ 65 + 94 - 110 + 97;
      lIIlIlllII[7] = 69 ^ 54 ^ 195 ^ 183;
      lIIlIlllII[8] = 205 ^ 150 ^ 204 ^ 159;
      lIIlIlllII[9] = 31 + 122 - 72 + 86 ^ 35 + 146 - 135 + 128;
      lIIlIlllII[10] = 8 + 99 - 85 + 109 ^ 44 + 89 - 124 + 128;
      lIIlIlllII[11] = 74 ^ 65;
      lIIlIlllII[12] = 128 ^ 144;
      lIIlIlllII[13] = 40 + 51 - 69 + 144 ^ 126 + 89 - 93 + 12;
      lIIlIlllII[14] = 126 ^ 114;
   }

   @JvmName(
      name = "ɡ"
   )
   protected final Minecraft ɡ() {
      return this.ĂƂ;
   }
}
