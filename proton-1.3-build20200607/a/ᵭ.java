package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00192\u00020\u0018B\u0019\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0004\u001a\u00020\b2\"\u0010\r\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\b0\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007¢\u0006\u0004\b\u0004\u0010\u0011J\u000f\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u000b\u0010\u0013J\r\u0010\n\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082\u0004R<\u0010\n\u001a$\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\b0\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u00070\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\u0082\u0004R\u001a\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0003¨\u0006\u0082\u000eR\u001a\u0010\u0002\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0082\u000eR(\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u0004\u0010\u000f¨\u0006\u0086\u000e"},
   d2 = {"La/ᵭ;", "", "ᴃᎲ", "Z", "ⲋ", "", "Lkotlin/Function1;", "La/ValueChangedListener;", "", "Ljava/util/List;", "ĂƂ", "u", "Ljava/lang/Object;", "p0", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "〥ҳⱆ", "(Lkotlin/jvm/functions/Function1;)V", "", "()Ljava/lang/String;", "()V", "p1", "<init>", "(Ljava/lang/Object;Z)V", "", "T"}
)
public final class ᵭ<T> {
   public final void ĂƂ() {
      List var1 = llIIIlIlIIIlIIl.ⲋ;
      int var2 = llIlIIlII[0];
      int var3 = llIlIIlII[0];
      synchronized(var1){}

      try {
         boolean llIIIlIlIIIIlIl = llIlIIlII[0];
         int var10000;
         if (llIllIlIII(llIIIlIlIIIlIIl.ĂƂ)) {
            var10000 = llIlIIlII[1];
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var10000 = llIlIIlII[0];
         }

         Exception llIIIlIlIIIIlII = var10000;
         Exception llIIIlIlIIIIIll = llIlIIlII[0];
         String llIIIlIlIIIIIlI = llIlIIlII[0];
         if (llIllIlIIl(_Assertions.ENABLED) && llIllIlIII(llIIIlIlIIIIlII)) {
            Exception llIIIlIlIIIIIIl = llIlIIlII[0];
            Exception llIIIlIlIIIIIIl = llIIllllI[llIlIIlII[0]];
            throw (Throwable)(new AssertionError(llIIIlIlIIIIIIl));
         }

         llIIIlIlIIIlIIl.ĂƂ = (boolean)llIlIIlII[1];
         Exception llIIIlIlIIIIlII = (Iterable)llIIIlIlIIIlIIl.ⲋ;
         llIIIlIlIIIIIll = llIlIIlII[0];
         Iterator llIIIlIlIIIIIlI = llIIIlIlIIIIlII.iterator();

         while(true) {
            if (!llIllIlIIl(llIIIlIlIIIIIlI.hasNext())) {
               llIIIlIlIIIlIIl.ĂƂ = (boolean)llIlIIlII[0];
               Unit var13 = Unit.INSTANCE;
               break;
            }

            Exception llIIIlIlIIIIIIl = llIIIlIlIIIIIlI.next();
            Exception llIIIlIlIIIIIII = (Function1)llIIIlIlIIIIIIl;
            float llIIIlIIlllllll = llIlIIlII[0];
            llIIIlIlIIIIIII.invoke(llIIIlIlIIIlIIl);
            "".length();
            "".length();
            if ("   ".length() > "   ".length()) {
               return;
            }
         }
      } finally {
         ;
      }

      "".length();
      if (-"  ".length() <= 0) {
         ;
      }
   }

   private static boolean llIllIlIII(int var0) {
      return var0 == 0;
   }

   private static String llIlIllllI(String llIIIlIIlIlllll, String llIIIlIIlIllllI) {
      try {
         int llIIIlIIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIlIllllI.getBytes(StandardCharsets.UTF_8)), llIlIIlII[8]), "DES");
         Cipher llIIIlIIllIIIll = Cipher.getInstance("DES");
         llIIIlIIllIIIll.init(llIlIIlII[2], llIIIlIIlIlllIl);
         return new String(llIIIlIIllIIIll.doFinal(Base64.getDecoder().decode(llIIIlIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean llIllIlIIl(int var0) {
      return var0 != 0;
   }

   private static String llIllIIIll(String llIIIlIIlIlIIlI, String llIIIlIIlIlIIll) {
      try {
         char llIIIlIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIIlIIlIlIllI = Cipher.getInstance("Blowfish");
         llIIIlIIlIlIllI.init(llIlIIlII[2], llIIIlIIlIlIIII);
         return new String(llIIIlIIlIlIllI.doFinal(Base64.getDecoder().decode(llIIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public ᵭ(T var1, boolean var2) {
      super();
      this.u = var1;
      this.ᴃᎲ = var2;
      int var3 = llIlIIlII[0];
      List var5 = (List)(new ArrayList());
      this.ⲋ = var5;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final T ⲋ() {
      return this.u;
   }

   private static void llIllIIlll() {
      llIlIIlII = new int[9];
      llIlIIlII[0] = (33 ^ 30) & ~(105 ^ 86);
      llIlIIlII[1] = " ".length();
      llIlIIlII[2] = "  ".length();
      llIlIIlII[3] = "   ".length();
      llIlIIlII[4] = 61 ^ 58 ^ "   ".length();
      llIlIIlII[5] = 55 ^ 50;
      llIlIIlII[6] = 32 + 36 - 25 + 95 ^ 36 + 140 - 1 + 5;
      llIlIIlII[7] = 115 ^ 117;
      llIlIIlII[8] = 108 ^ 100;
   }

   public final void ⲋ(@NotNull Function1<? super ᵭ<T>, Unit> param1) {
      // $FF: Couldn't be decompiled
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(T var1) {
      if (!llIllIlIIl(Intrinsics.areEqual(this.u, var1))) {
         this.u = var1;
         this.ĂƂ();
      }
   }

   @NotNull
   public final String u() {
      Object llIIIlIIlllIllI = llIIIlIIlllIlll.u;
      Object var10000;
      if (llIllIlIIl(llIIIlIIlllIllI instanceof Double)) {
         var10000 = llIIIlIIlllIlll.u;
         if (llIllIlIll(var10000)) {
            throw new TypeCastException(llIIllllI[llIlIIlII[1]]);
         } else {
            int llIIIlIIlllIlIl = (Double)var10000;
            if (llIllIlIIl(llIIIlIIlllIlll.ᴃᎲ)) {
               return String.valueOf((int)llIIIlIIlllIlIl);
            } else {
               byte llIIIlIIlllIlII = StringCompanionObject.INSTANCE;
               double llIIIlIIlllIIll = llIIllllI[llIlIIlII[2]];
               Object[] var9 = new Object[llIlIIlII[1]];
               var9[llIlIIlII[0]] = llIIIlIIlllIlIl;
               String llIIIlIIlllIIlI = var9;
               float llIIIlIIlllIIIl = llIlIIlII[0];
               String var10 = String.format(llIIIlIIlllIIll, Arrays.copyOf(llIIIlIIlllIIlI, llIIIlIIlllIIlI.length));
               Intrinsics.checkExpressionValueIsNotNull(var10, llIIllllI[llIlIIlII[3]]);
               return var10;
            }
         }
      } else if (llIllIlIIl(llIIIlIIlllIllI instanceof List)) {
         var10000 = llIIIlIIlllIlll.u;
         if (llIllIlIll(var10000)) {
            throw new TypeCastException(llIIllllI[llIlIIlII[4]]);
         } else {
            int llIIIlIIlllIlIl = (List)var10000;
            return CollectionsKt.joinToString$default((Iterable)llIIIlIIlllIlIl, (CharSequence)llIIllllI[llIlIIlII[5]], (CharSequence)null, (CharSequence)null, llIlIIlII[0], (CharSequence)null, (Function1)null, llIlIIlII[6], (Object)null);
         }
      } else {
         return String.valueOf(llIIIlIIlllIlll.ⲋ());
      }
   }

   private static void llIllIIlII() {
      llIIllllI = new String[llIlIIlII[7]];
      llIIllllI[llIlIIlII[0]] = llIlIllllI("A7H3MBbVKle9o2+zrhSkFabl4+8TV/Oj", "gTDjm");
      llIIllllI[llIlIIlII[1]] = llIlIllllI("AxTVRZwHgQoDfAFGLCf0QBxzcyu61s2akR3G9D75TU2ybFnKgTRh6hCpBEeXbMZYQezJYnfO1Es=", "dhCAW");
      llIIllllI[llIlIIlII[2]] = llIlIllllI("pWsdsJ7D0qQ=", "GwthL");
      llIIllllI[llIlIIlII[3]] = llIlIllllI("bfqit3rUWWs=", "yHEGs");
      llIIllllI[llIlIIlII[4]] = llIllIIIll("oXstC09FvME+OZnxbw0NvUZL8WkYdkEjicXtnCrKudM91WE0wPywV0BINlktbQ/btdEOXOQQg8kcuMSVqYV99g==", "mlEJM");
      llIIllllI[llIlIIlII[5]] = llIlIllllI("/Fd3LryCPbQ=", "ZSFni");
   }

   static {
      llIllIIlll();
      llIllIIlII();
   }

   private static boolean llIllIlIll(Object var0) {
      return var0 == null;
   }
}
