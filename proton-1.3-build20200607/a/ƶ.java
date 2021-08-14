package a;

import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\f:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0007\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\nJ!\u0010\u0007\u001a\u00020\u000b\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR0\u0010\u0007\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0082\u0004"},
   d2 = {"La/ƶ;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "", "La/ƶ$ⲋ;", "ĂƂ", "Ljava/util/concurrent/ConcurrentHashMap;", "ⲋ", "p0", "", "(Ljava/lang/Class;)Z", "", "", "T", "(Ljava/lang/Object;)V", "u", "<init>", "()V"}
)
public final class ƶ {
   public final void u(@NotNull Object llIIIIllIIllIlI) {
      Iterable var2 = (Iterable)ĂƂ.keySet();
      int var3 = llIllIIlI[0];
      Iterator llIIIIllIIlIlll = var2.iterator();

      do {
         if (!lllIIIIIlI(llIIIIllIIlIlll.hasNext())) {
            return;
         }

         int llIIIIllIIlIllI = llIIIIllIIlIlll.next();
         byte llIIIIllIIlIlIl = (Class)llIIIIllIIlIllI;
         byte llIIIIllIIlIlII = llIllIIlI[0];
         Map var10000 = (Map)ĂƂ;
         Class var10001 = llIIIIllIIlIlIl;
         List var10002 = (List)ĂƂ.get(llIIIIllIIlIlIl);
         if (!lllIIIIIll(var10002)) {
            "".length();
            var10002 = null;
         } else {
            String llIIIIllIIlIIll = (Iterable)var10002;
            long llIIIIllIIlIIIl = var10000;
            boolean llIIIIllIIlIIII = llIllIIlI[0];
            byte llIIIIllIIIlllI = (Collection)(new ArrayList());
            byte llIIIIllIIIllIl = llIllIIlI[0];
            Iterator llIIIIllIIIllII = llIIIIllIIlIIll.iterator();

            while(lllIIIIIlI(llIIIIllIIIllII.hasNext())) {
               int llIIIIllIIIlIll = llIIIIllIIIllII.next();
               double llIIIIllIIIlIlI = (ƶ.ⲋ)llIIIIllIIIlIll;
               double llIIIIllIIIlIIl = llIllIIlI[0];
               if (lllIIIIIlI(Intrinsics.areEqual(llIIIIllIIIlIlI.ĂƂ(), llIIIIllIIllIlI) ^ llIllIIlI[1])) {
                  llIIIIllIIIlllI.add(llIIIIllIIIlIll);
                  "".length();
                  "".length();
                  if (-" ".length() >= "   ".length()) {
                     return;
                  }
               }
            }

            boolean llIIIIllIIIlIII = (List)llIIIIllIIIlllI;
            var10000 = llIIIIllIIlIIIl;
            var10001 = llIIIIllIIlIlIl;
            var10002 = CollectionsKt.toMutableList((Collection)llIIIIllIIIlIII);
            "".length();
            if (null != null) {
               return;
            }
         }

         if (lllIIIllII(var10002)) {
            Intrinsics.throwNpe();
         }

         var10000.put(var10001, var10002);
         "".length();
         "".length();
      } while(((200 ^ 139 ^ 103 ^ 7) & (76 ^ 52 ^ 215 ^ 140 ^ -" ".length())) <= (49 + 129 - 163 + 154 ^ 103 + 88 - 54 + 36));

   }

   private static boolean lllIIIIlII(Object var0, Object var1) {
      return var0 != var1;
   }

   private static boolean lllIIIllII(Object var0) {
      return var0 == null;
   }

   private static boolean lllIIIlIll(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lllIIIIIll(Object var0) {
      return var0 != null;
   }

   private static boolean lllIIIIlIl(Object var0, Object var1) {
      return var0 == var1;
   }

   static {
      lllIIIIIII();
      ƶ var0 = new ƶ();
      ⲋ = var0;
      ĂƂ = new ConcurrentHashMap();
   }

   public final void ĂƂ(@NotNull Object llIIIIlllIIIIIl) {
      Class var2 = llIIIIlllIIIIIl.getClass();
      Method[] var4 = var2.getDeclaredMethods();
      int llIIIIllIllllIl = llIllIIlI[0];
      Collection llIIIIllIlllIll = (Collection)(new ArrayList());
      int var8 = llIllIIlI[0];
      Method[] llIIIIllIlllIIl = var4;
      int llIIIIllIlllIII = var4.length;
      int llIIIIllIllIlll = llIllIIlI[0];

      do {
         int llIIIIllIllIlII;
         if (!lllIIIIlll(llIIIIllIllIlll, llIIIIllIlllIII)) {
            long llIIIIllIllllll = (List)llIIIIllIlllIll;
            boolean llIIIIllIlllllI = (Iterable)llIIIIllIllllll;
            llIIIIllIllllIl = llIllIIlI[0];
            Iterator llIIIIllIllllII = llIIIIllIlllllI.iterator();

            do {
               if (!lllIIIIIlI(llIIIIllIllllII.hasNext())) {
                  return;
               }

               float llIIIIllIlllIll = llIIIIllIllllII.next();
               String llIIIIllIlllIlI = (Method)llIIIIllIlllIll;
               Exception llIIIIllIlllIIl = llIllIIlI[0];
               byte llIIIIllIlllIII = llIIIIllIlllIlI.getParameterTypes()[llIllIIlI[0]];
               if (lllIIIIIlI(ⲋ.ⲋ(llIIIIllIlllIII))) {
                  boolean llIIIIllIllIlll = (ȵ)llIIIIllIlllIlI.getAnnotation(ȵ.class);
                  short llIIIIllIllIllI = (ConcurrentMap)ĂƂ;
                  boolean llIIIIllIllIlIl = llIllIIlI[0];
                  Object var30 = llIIIIllIllIllI.get(llIIIIllIlllIII);
                  int llIIIIllIllIIll;
                  if (lllIIIIIll(var30)) {
                     "".length();
                     if (-(23 ^ 79 ^ 91 ^ 7) >= 0) {
                        return;
                     }
                  } else {
                     "".length();
                     llIIIIllIllIlII = llIllIIlI[0];
                     llIIIIllIllIIll = llIllIIlI[0];
                     int llIIIIllIllIIlI = (List)(new ArrayList());
                     Exception llIIIIllIllIIIl = llIllIIlI[0];
                     char llIIIIllIllIIII = llIllIIlI[0];
                     short llIIIIllIlIlllI = llIllIIlI[0];
                     var30 = llIIIIllIllIllI.putIfAbsent(llIIIIllIlllIII, llIIIIllIllIIlI);
                     if (lllIIIIIll(var30)) {
                        "".length();
                        if (" ".length() != " ".length()) {
                           return;
                        }
                     } else {
                        "".length();
                        var30 = llIIIIllIllIIlI;
                     }
                  }

                  ((List)var30).add(new ƶ.ⲋ(llIIIIllIlllIlI, llIIIIlllIIIIIl, llIIIIllIllIlll.ⲋ(), llIIIIllIllIlll.ĂƂ()));
                  "".length();
                  List var31 = (List)ĂƂ.get(llIIIIllIlllIII);
                  if (lllIIIIIll(var31)) {
                     short llIIIIllIllIllI = var31;
                     llIIIIllIllIlIl = llIllIIlI[0];
                     if (lllIIIlIll(llIIIIllIllIllI.size(), llIllIIlI[1])) {
                        llIIIIllIllIIll = llIllIIlI[0];
                        int llIIIIllIllIIlI = (Comparator)(new ƶ$1());
                        CollectionsKt.sortWith(llIIIIllIllIllI, llIIIIllIllIIlI);
                     }

                     "".length();
                     if ("   ".length() == 0) {
                        return;
                     }
                  } else {
                     "".length();
                  }
               }

               "".length();
            } while((113 + 135 - 120 + 40 ^ 125 + 64 - 57 + 40) != 0);

            return;
         }

         short llIIIIllIllIllI = llIIIIllIlllIIl[llIIIIllIllIlll];
         llIIIIllIllIlII = llIllIIlI[0];
         int var10000;
         if (lllIIIIIlI(llIIIIllIllIllI.isAnnotationPresent(ȵ.class)) && lllIIIlIlI(llIIIIllIllIllI.getParameterCount(), llIllIIlI[1])) {
            var10000 = llIllIIlI[1];
            "".length();
            if (((172 ^ 135) & ~(189 ^ 150)) < 0) {
               return;
            }
         } else {
            var10000 = llIllIIlI[0];
         }

         if (lllIIIIIlI(var10000)) {
            llIIIIllIlllIll.add(llIIIIllIllIllI);
            "".length();
         }

         ++llIIIIllIllIlll;
         "".length();
      } while(null == null);

   }

   private static void lllIIIIIII() {
      llIllIIlI = new int[2];
      llIllIIlI[0] = (236 ^ 163) & ~(220 ^ 147);
      llIllIIlI[1] = " ".length();
   }

   private static boolean lllIIIIlll(int var0, int var1) {
      return var0 < var1;
   }

   private ƶ() {
   }

   private static boolean lllIIIlIlI(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lllIIIIIlI(int var0) {
      return var0 != 0;
   }

   private static boolean lllIIIIIIl(int var0) {
      return var0 == 0;
   }

   @JvmStatic
   public static final <T> void ⲋ(@NotNull T llIIIIlllIlllIl) {
      if (!lllIIIIIIl(llIIIIlllIlllIl instanceof ἶṗ) || lllIIIIIlI(llIIIIlllIlllIl instanceof Event)) {
         boolean llIIIIlllIlllII = llIIIIlllIlllIl.getClass();
         List var10000 = (List)ĂƂ.get(llIIIIlllIlllII);
         if (lllIIIIIll(var10000)) {
            String llIIIIlllIllIll = (Iterable)var10000;
            short llIIIIlllIllIlI = llIllIIlI[0];
            Iterator llIIIIlllIllIIl = llIIIIlllIllIll.iterator();

            while(lllIIIIIlI(llIIIIlllIllIIl.hasNext())) {
               int llIIIIlllIllIII = llIIIIlllIllIIl.next();
               float llIIIIlllIlIlll = (ƶ.ⲋ)llIIIIlllIllIII;
               byte llIIIIlllIlIllI = llIllIIlI[0];
               if (lllIIIIIlI(llIIIIlllIlllIl instanceof ἶṗ)) {
                  if (lllIIIIIIl(((ἶṗ)llIIIIlllIlllIl).ⲋ()) && (!lllIIIIlII(llIIIIlllIlIlll.ᴃᎲ(), Ѿ.u) || lllIIIIlIl(llIIIIlllIlIlll.ᴃᎲ(), ((ἶṗ)llIIIIlllIlllIl).u()))) {
                     llIIIIlllIlIlll.ⲋ(llIIIIlllIlllIl);
                     "".length();
                     if (-" ".length() >= "   ".length()) {
                        return;
                     }
                  }
               } else {
                  llIIIIlllIlIlll.ⲋ(llIIIIlllIlllIl);
               }

               "".length();
               if (((139 + 98 - 111 + 18 ^ 110 + 155 - 122 + 52) & (238 ^ 184 ^ 63 ^ 58 ^ -" ".length())) >= "  ".length()) {
                  return;
               }
            }

            "".length();
            if ("   ".length() == 0) {
               return;
            }
         } else {
            "".length();
         }
      }

   }

   private final boolean ⲋ(Class<?> llIIIIllIIIIlII) {
      if (lllIIIIIlI(Intrinsics.areEqual((Object)llIIIIllIIIIlII.getSuperclass(), (Object)Object.class))) {
         return (boolean)llIllIIlI[0];
      } else if (lllIIIIIlI(Intrinsics.areEqual((Object)llIIIIllIIIIlII.getSuperclass(), (Object)ἶṗ.class))) {
         return (boolean)llIllIIlI[1];
      } else {
         return (boolean)(lllIIIIIlI(Intrinsics.areEqual((Object)llIIIIllIIIIlII.getSuperclass(), (Object)Event.class)) ? llIllIIlI[1] : this.ⲋ(llIIIIllIIIIlII.getSuperclass()));
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\nB)\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0011\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\nHÇ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0001HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0004J8\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0001HÇ\u0001¢\u0006\u0004\b\u0005\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u001f\u0010\u0005\u001a\u00020\u001e\"\b\b\u0000\u0010\u001f*\u00020\n2\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010 J\u0010\u0010\"\u001a\u00020!H×\u0001¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0005\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0086\u0004R\u001d\u0010\t\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\u0005\u0010\b¨\u0006\u0086\u0004R\u001d\u0010\r\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\t\u0010\f¨\u0006\u0086\u0004R\u001d\u0010\u0002\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\r\u0010\u0010¨\u0006\u0086\u0004"},
      d2 = {"La/ƶ$ⲋ;", "La/Ѿ;", "ᴃᎲ", "La/Ѿ;", "()La/Ѿ;", "ⲋ", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "ĂƂ", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "u", "", "I", "()I", "〥ҳⱆ", "Ἒⅾ", "ϛⰄ", "ς", "p0", "p1", "p2", "p3", "(Ljava/lang/reflect/Method;Ljava/lang/Object;ILa/Ѿ;)La/ƶ$ⲋ;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "T", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;ILa/Ѿ;)V"}
   )
   public static final class ⲋ {
      @JvmName(
         name = "u"
      )
      public final int u() {
         return this.u;
      }

      public final int ϛⰄ() {
         return this.u;
      }

      public boolean equals(@Nullable Object var1) {
         if (llIIIIll(this, var1)) {
            if (llIIIIII(var1 instanceof ƶ.ⲋ)) {
               ƶ.ⲋ var2 = (ƶ.ⲋ)var1;
               if (llIIIIII(Intrinsics.areEqual((Object)this.ⲋ, (Object)var2.ⲋ)) && llIIIIII(Intrinsics.areEqual(this.ĂƂ, var2.ĂƂ)) && llIIIlII(this.u, var2.u) && llIIIIII(Intrinsics.areEqual((Object)this.ᴃᎲ, (Object)var2.ᴃᎲ))) {
                  return (boolean)lIlIIIl[0];
               }
            }

            return (boolean)lIlIIIl[1];
         } else {
            return (boolean)lIlIIIl[0];
         }
      }

      @NotNull
      public final Object Ἒⅾ() {
         return this.ĂƂ;
      }

      private static String lIlllIIl(String llllIIlIllllIlI, String llllIIlIllllIIl) {
         llllIIlIllllIlI = new String(Base64.getDecoder().decode(llllIIlIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder llllIIlIllllllI = new StringBuilder();
         char[] llllIIlIlllllIl = llllIIlIllllIIl.toCharArray();
         char llllIIlIlllIllI = lIlIIIl[1];
         long llllIIlIlllIlIl = llllIIlIllllIlI.toCharArray();
         Exception llllIIlIlllIlII = llllIIlIlllIlIl.length;
         int llllIIlIlllIIll = lIlIIIl[1];

         do {
            if (!llIIIlIl(llllIIlIlllIIll, llllIIlIlllIlII)) {
               return String.valueOf(llllIIlIllllllI);
            }

            char llllIIllIIIIIlI = llllIIlIlllIlIl[llllIIlIlllIIll];
            llllIIlIllllllI.append((char)(llllIIllIIIIIlI ^ llllIIlIlllllIl[llllIIlIlllIllI % llllIIlIlllllIl.length]));
            "".length();
            ++llllIIlIlllIllI;
            ++llllIIlIlllIIll;
            "".length();
         } while(-" ".length() <= 0);

         return null;
      }

      public final <T> void ⲋ(@NotNull T var1) {
         Method var10000 = this.ⲋ;
         Object var10001 = this.ĂƂ;
         Object[] var10002 = new Object[lIlIIIl[0]];
         var10002[lIlIIIl[1]] = var1;
         var10000.invoke(var10001, var10002);
         "".length();
      }

      private static boolean llIIIIII(int var0) {
         return var0 != 0;
      }

      private static boolean llIIIlII(int var0, int var1) {
         return var0 == var1;
      }

      private static boolean llIIIIIl(Object var0) {
         return var0 != null;
      }

      @NotNull
      public final ƶ.ⲋ ⲋ(@NotNull Method var1, @NotNull Object var2, int var3, @NotNull Ѿ var4) {
         return new ƶ.ⲋ(var1, var2, var3, var4);
      }

      private static String lIlllIlI(String llllIIllIIlllII, String llllIIllIIllIll) {
         try {
            SecretKeySpec llllIIllIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIllIIllIll.getBytes(StandardCharsets.UTF_8)), lIlIIIl[4]), "DES");
            float llllIIllIIllIIl = Cipher.getInstance("DES");
            llllIIllIIllIIl.init(lIlIIIl[3], llllIIllIlIIIIl);
            return new String(llllIIllIIllIIl.doFinal(Base64.getDecoder().decode(llllIIllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      @JvmName(
         name = "ĂƂ"
      )
      public final Object ĂƂ() {
         return this.ĂƂ;
      }

      private static void lIlllllI() {
         lIlIIIl = new int[8];
         lIlIIIl[0] = " ".length();
         lIlIIIl[1] = (120 + 33 - 40 + 50 ^ 107 + 59 - 83 + 102) & (49 + 39 - -92 + 4 ^ 91 + 154 - 142 + 59 ^ -" ".length());
         lIlIIIl[2] = 182 ^ 178;
         lIlIIIl[3] = "  ".length();
         lIlIIIl[4] = 14 ^ 6;
         lIlIIIl[5] = "   ".length();
         lIlIIIl[6] = 32 ^ 63;
         lIlIIIl[7] = 21 ^ 16;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final Method ⲋ() {
         return this.ⲋ;
      }

      public int hashCode() {
         Method var10000 = llllIIllIlIllII.ⲋ;
         int var1;
         if (llIIIIIl(var10000)) {
            var1 = var10000.hashCode();
            "".length();
            if (null != null) {
               return (219 ^ 157) & ~(56 ^ 126);
            }
         } else {
            "".length();
            var1 = lIlIIIl[1];
         }

         var1 *= lIlIIIl[6];
         Object var10001 = llllIIllIlIllII.ĂƂ;
         int var2;
         if (llIIIIIl(var10001)) {
            var2 = var10001.hashCode();
            "".length();
            if (((157 ^ 139 ^ 200 ^ 147) & (120 + 94 - 2 + 43 ^ 107 + 158 - 247 + 160 ^ -" ".length())) != 0) {
               return ("  ".length() ^ 67 ^ 112) & (81 ^ 101 ^ 27 ^ 30 ^ -" ".length());
            }
         } else {
            "".length();
            var2 = lIlIIIl[1];
         }

         var1 = ((var1 + var2) * lIlIIIl[6] + llllIIllIlIllII.u) * lIlIIIl[6];
         Ѿ var3 = llllIIllIlIllII.ᴃᎲ;
         if (llIIIIIl(var3)) {
            var2 = var3.hashCode();
            "".length();
            if (((88 + 86 - 69 + 58 ^ 122 + 138 - 119 + 4) & (85 ^ 120 ^ 98 ^ 125 ^ -" ".length())) != ((129 + 65 - 129 + 86 ^ 52 + 174 - 225 + 188) & (204 ^ 189 ^ 234 ^ 177 ^ -" ".length()))) {
               return (222 ^ 180 ^ 87 ^ 111) & (110 ^ 101 ^ 156 ^ 197 ^ -" ".length());
            }
         } else {
            "".length();
            var2 = lIlIIIl[1];
         }

         return var1 + var2;
      }

      @NotNull
      public final Method 〥ҳⱆ() {
         return this.ⲋ;
      }

      private static boolean llIIIIll(Object var0, Object var1) {
         return var0 != var1;
      }

      public ⲋ(@NotNull Method var1, @NotNull Object var2, int var3, @NotNull Ѿ var4) {
         this.ⲋ = var1;
         this.ĂƂ = var2;
         this.u = var3;
         this.ᴃᎲ = var4;
      }

      @JvmName(
         name = "ᴃᎲ"
      )
      public final Ѿ ᴃᎲ() {
         return this.ᴃᎲ;
      }

      private static void lIlllIll() {
         lIlIIII = new String[lIlIIIl[7]];
         lIlIIII[lIlIIIl[1]] = lIlllIII("yx5pj6QNABtyZhf/WHRiyA==", "cDMtI");
         lIlIIII[lIlIIIl[0]] = lIlllIIl("QXkcUQ==", "mYilz");
         lIlIIII[lIlIIIl[3]] = lIlllIIl("QnDhtaDhj7hW", "nPcJk");
         lIlIIII[lIlIIIl[5]] = lIlllIlI("Pvfbgp+plHE=", "qsztr");
         lIlIIII[lIlIIIl[2]] = lIlllIII("cQRhOqji04M=", "JDOda");
      }

      static {
         lIlllllI();
         lIlllIll();
      }

      @NotNull
      public final Ѿ ς() {
         return this.ᴃᎲ;
      }

      private static String lIlllIII(String llllIIllIIIllll, String llllIIllIIIlllI) {
         try {
            SecretKeySpec llllIIllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIllIIlIIll = Cipher.getInstance("Blowfish");
            llllIIllIIlIIll.init(lIlIIIl[3], llllIIllIIlIlII);
            return new String(llllIIllIIlIIll.doFinal(Base64.getDecoder().decode(llllIIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static boolean llIIIlIl(int var0, int var1) {
         return var0 < var1;
      }

      @NotNull
      public String toString() {
         return String.valueOf((new StringBuilder()).append(lIlIIII[lIlIIIl[1]]).append(this.ⲋ).append(lIlIIII[lIlIIIl[0]]).append(this.ĂƂ).append(lIlIIII[lIlIIIl[3]]).append(this.u).append(lIlIIII[lIlIIIl[5]]).append(this.ᴃᎲ).append(lIlIIII[lIlIIIl[2]]));
      }
   }
}
