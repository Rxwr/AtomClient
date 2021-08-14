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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0019B\u0007¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R&\u0010\b\u001a\u0006*\u00020\u00070\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\u0082\u0084\u0002R\"\u0010\u0004\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0082\u0084\u0002R\"\u0010\u0002\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0082\u0084\u0002RV\u0010\n\u001a>\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000ej\b\u0012\u0004\u0012\u00020\u0010`\u000f0\u000bj\u001e\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000ej\b\u0012\u0004\u0012\u00020\u0010`\u000f`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0082\u0004"},
   d2 = {"La/Ꮂ;", "", "ᴃᎲ", "La/ⅹ;", "u", "()D", "ⲋ", "Ljava/awt/Color;", "ĂƂ", "()Ljava/awt/Color;", "〥ҳⱆ", "Ljava/util/HashMap;", "Lkotlin/collections/ĂƂ;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ⲋ;", "Lnet/minecraft/util/math/Vec3d;", "Ἒⅾ", "Ljava/util/HashMap;", "", "Đ", "()V", "Ἠ", "ἶṗ", "<init>", "La/ⳅ;"}
)
public final class Ꮂ extends ⳅ {
   public Ꮂ() {
      super(lIIIlIIIIl[lIIIlIIlII[9]], lIIIlIIIIl[lIIIlIIlII[10]], ı５.〥ҳⱆ, lIIIlIIlII[1], (boolean)lIIIlIIlII[1], (boolean)lIIIlIIlII[1], lIIIlIIlII[11], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(lIIIlIIIIl[lIIIlIIlII[12]], 1.0D).u((Object)0.1D).ᴃᎲ((Object)10.0D).u(lIIIlIIIIl[lIIIlIIlII[13]]);
      this.u = this.ⲋ(lIIIlIIIIl[lIIIlIIlII[14]], Color.blue);
      this.ᴃᎲ = this.ⲋ(lIIIlIIIIl[lIIIlIIlII[15]], 0.5D).u((Object)0.01D).ᴃᎲ((Object)1.0D);
      this.〥ҳⱆ = this.ⲋ(lIIIlIIIIl[lIIIlIIlII[16]], 1.0D).u((Object)0.0D).ᴃᎲ((Object)10.0D);
      int var1 = lIIIlIIlII[1];
      HashMap var3 = new HashMap();
      this.Ἒⅾ = var3;
   }

   private static int lIIlIlIlllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @JvmName(
      name = "u"
   )
   private final double u() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[lIIIlIIlII[3]])).doubleValue();
   }

   public void ἶṗ() {
      super.ἶṗ();
      ArrayList var10000 = (ArrayList)lIlIllIIIIlllll.Ἒⅾ.get(lIlIllIIIIlllll.ɡ().field_71439_g.field_71093_bK);
      if (lIIlIlIllll(var10000)) {
         "".length();
         if ((218 ^ 161 ^ 43 ^ 85) != 0) {
            char lIlIllIIIIllllI = var10000;
            float lIlIllIIIIlllIl = ᾣŦ.ⲋ;
            String lIlIllIIIIlllII = lIIIlIIlII[1];
            byte lIlIllIIIIllIll = lIIIlIIlII[1];
            float lIlIllIIIIllIlI = lIlIllIIIIlllIl;
            boolean lIlIllIIIIllIIl = lIIIlIIlII[1];
            lIlIllIIIIlllIl.ⲋ(lIIIlIIlII[2]);
            GlStateManager.func_187441_d((float)lIlIllIIIIlllll.ᴃᎲ());
            boolean lIlIllIIIIllIII = (Iterable)CollectionsKt.zipWithNext((Iterable)lIlIllIIIIllllI);
            char lIlIllIIIIlIlll = lIIIlIIlII[1];
            Iterator lIlIllIIIIlIllI = lIlIllIIIIllIII.iterator();

            do {
               if (!lIIlIllIIII(lIlIllIIIIlIllI.hasNext())) {
                  lIlIllIIIIllIlI.ĂƂ();
                  return;
               }

               byte lIlIllIIIIlIlIl = lIlIllIIIIlIllI.next();
               float lIlIllIIIIlIlII = (Pair)lIlIllIIIIlIlIl;
               long lIlIllIIIIlIIll = lIIIlIIlII[1];
               lIlIllIIIIllIlI.ⲋ((Vec3d)lIlIllIIIIlIlII.getFirst(), (Vec3d)lIlIllIIIIlIlII.getSecond(), ſ.ĂƂ(ſ.ⲋ(lIlIllIIIIlllll.ĂƂ(), lIlIllIIIIlllll.u())));
               "".length();
            } while(((74 ^ 31 ^ 125 ^ 110) & (66 ^ 36 ^ 98 ^ 66 ^ -" ".length())) == 0);

         }
      } else {
         "".length();
      }
   }

   private static String lIIlIlIIllI(String lIlIlIllllIIlII, String lIlIlIllllIIlIl) {
      try {
         String lIlIlIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         long lIlIlIllllIIIIl = Cipher.getInstance("Blowfish");
         lIlIlIllllIIIIl.init(lIIIlIIlII[3], lIlIlIllllIIIlI);
         return new String(lIlIlIllllIIIIl.doFinal(Base64.getDecoder().decode(lIlIlIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlIllIIII(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   private final double ᴃᎲ() {
      return ((Number)this.〥ҳⱆ.ⲋ(this, ⲋ[lIIIlIIlII[4]])).doubleValue();
   }

   static {
      lIIlIlIllIl();
      lIIlIlIllII();
      KProperty[] var10000 = new KProperty[lIIIlIIlII[0]];
      var10000[lIIIlIIlII[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꮂ.class), lIIIlIIIIl[lIIIlIIlII[1]], lIIIlIIIIl[lIIIlIIlII[2]]));
      var10000[lIIIlIIlII[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꮂ.class), lIIIlIIIIl[lIIIlIIlII[3]], lIIIlIIIIl[lIIIlIIlII[4]]));
      var10000[lIIIlIIlII[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꮂ.class), lIIIlIIIIl[lIIIlIIlII[0]], lIIIlIIIIl[lIIIlIIlII[5]]));
      var10000[lIIIlIIlII[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Ꮂ.class), lIIIlIIIIl[lIIIlIIlII[6]], lIIIlIIIIl[lIIIlIIlII[7]]));
      ⲋ = var10000;
   }

   public void Ἠ() {
      super.Ἠ();
      ArrayList var10000 = (ArrayList)lIlIllIIIlIllll.Ἒⅾ.get(lIlIllIIIlIllll.ɡ().field_71439_g.field_71093_bK);
      if (lIIlIlIllll(var10000)) {
         "".length();
         if (null == null) {
            float lIlIllIIIlIlllI = var10000;
            if (lIIlIllIIII(lIlIllIIIlIlllI.isEmpty())) {
               lIlIllIIIlIlllI.add(lIlIllIIIlIllll.ɡ().field_71439_g.func_174791_d());
               "".length();
            }

            String lIlIllIIIlIllIl = (Vec3d)CollectionsKt.last((List)lIlIllIIIlIlllI);
            if (lIIlIllIIIl(lIIlIlIlllI(lIlIllIIIlIllll.ɡ().field_71439_g.func_174791_d().func_72438_d(lIlIllIIIlIllIl), lIlIllIIIlIllll.ⲋ()))) {
               lIlIllIIIlIlllI.add(lIlIllIIIlIllll.ɡ().field_71439_g.func_174791_d());
               "".length();
            }

         }
      } else {
         "".length();
      }
   }

   private static void lIIlIlIllIl() {
      lIIIlIIlII = new int[18];
      lIIIlIIlII[0] = 21 ^ 71 ^ 28 ^ 74;
      lIIIlIIlII[1] = (74 ^ 89) & ~(83 ^ 64);
      lIIIlIIlII[2] = " ".length();
      lIIIlIIlII[3] = "  ".length();
      lIIIlIIlII[4] = "   ".length();
      lIIIlIIlII[5] = 191 ^ 186;
      lIIIlIIlII[6] = 125 ^ 123;
      lIIIlIIlII[7] = 244 ^ 184 ^ 198 ^ 141;
      lIIIlIIlII[8] = -" ".length();
      lIIIlIIlII[9] = 98 ^ 13 ^ 54 ^ 81;
      lIIIlIIlII[10] = 165 ^ 172;
      lIIIlIIlII[11] = 249 ^ 193;
      lIIIlIIlII[12] = 117 ^ 70 ^ 158 ^ 167;
      lIIIlIIlII[13] = 153 ^ 146;
      lIIIlIIlII[14] = 95 ^ 67 ^ 153 ^ 137;
      lIIIlIIlII[15] = 176 ^ 189;
      lIIIlIIlII[16] = 23 ^ 59 ^ 126 ^ 92;
      lIIIlIIlII[17] = 9 ^ 6;
   }

   private static String lIIlIlIlIlI(String lIlIllIIIIIlIIl, String lIlIllIIIIIlIII) {
      try {
         SecretKeySpec lIlIllIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIIIlIIlII[9]), "DES");
         Exception lIlIllIIIIIIllI = Cipher.getInstance("DES");
         lIlIllIIIIIIllI.init(lIIIlIIlII[3], lIlIllIIIIIlllI);
         return new String(lIlIllIIIIIIllI.doFinal(Base64.getDecoder().decode(lIlIllIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlIllIIIl(int var0) {
      return var0 >= 0;
   }

   @JvmName(
      name = "ⲋ"
   )
   private final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[lIIIlIIlII[1]])).doubleValue();
   }

   private static void lIIlIlIllII() {
      lIIIlIIIIl = new String[lIIIlIIlII[17]];
      lIIIlIIIIl[lIIIlIIlII[1]] = lIIlIlIIllI("iEraHplXhBCnBXmhRiZ0CQ==", "RopwS");
      lIIIlIIIIl[lIIIlIIlII[2]] = lIIlIlIIlll("AggmJScMAyYxIRYZMxsrAEV7MQ==", "emRuH");
      lIIIlIIIIl[lIIIlIIlII[3]] = lIIlIlIIlll("MTUKAQs=", "RZfny");
      lIIIlIIIIl[lIIIlIIlII[4]] = lIIlIlIIllI("7i63iESxU8IGHv74dbmLmgR5vKotkv/eMMmWchtPutc=", "ZeaAq");
      lIIIlIIIIl[lIIIlIIlII[0]] = lIIlIlIIllI("kvfFNEnQoLQ=", "gvlBh");
      lIIIlIIIIl[lIIIlIIlII[5]] = lIIlIlIIllI("lS9Gi9P1D6ndtBIUlaMrjg==", "kLPTw");
      lIIIlIIIIl[lIIIlIIlII[6]] = lIIlIlIIllI("YYnEsNSa0lv9YOou4adLyA==", "orIbj");
      lIIIlIIIIl[lIIIlIIlII[7]] = lIIlIlIlIlI("p0lyIc2XUzZZOrODvbRRubm3KwRr3QJF", "NmxHu");
      lIIIlIIIIl[lIIIlIIlII[9]] = lIIlIlIIlll("ACYFIykw", "CTpNK");
      lIIIlIIIIl[lIIIlIIlII[10]] = lIIlIlIIllI("NX6LDSxUeqQzbcI2nmSWNgdrknR1UGQOCuGDJcpXnlkwL4hWnAISDbrQ3vcyUcAqZ4Fl7sV1fvMw5B0k7EIOPg==", "YLjDA");
      lIIIlIIIIl[lIIIlIIlII[12]] = lIIlIlIlIlI("nM9R0QBu5TMlUPPJVlq6Fg==", "SqGSR");
      lIIIlIIIIl[lIIIlIIlII[13]] = lIIlIlIlIlI("rpJcZo+9ouXa4GPJwzqXbkpdKGMDGsTtKnPIPP7BYpFCB6ogrb9o2OuxJW6004jA", "OnJVQ");
      lIIIlIIIIl[lIIIlIIlII[14]] = lIIlIlIIllI("oopAkijWE9s=", "TQIff");
      lIIIlIIIIl[lIIIlIIlII[15]] = lIIlIlIIllI("as8TvcHoBIs=", "SkMgf");
      lIIIlIIIIl[lIIIlIIlII[16]] = lIIlIlIlIlI("ihWFVcA5Wf4BPuyurGmMrQ==", "YvElj");
   }

   private static boolean lIIlIllIIlI(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   private final Color ĂƂ() {
      return (Color)this.u.ⲋ(this, ⲋ[lIIIlIIlII[2]]);
   }

   private static boolean lIIlIlIllll(Object var0) {
      return var0 != null;
   }

   private static String lIIlIlIIlll(String lIlIlIllllllIll, String lIlIlIllllllIlI) {
      lIlIlIllllllIll = new String(Base64.getDecoder().decode(lIlIlIllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean lIlIlIlllllIlII = new StringBuilder();
      long lIlIlIlllllIIll = lIlIlIllllllIlI.toCharArray();
      char lIlIlIlllllIIlI = lIIIlIIlII[1];
      double lIlIlIlllllIIIl = lIlIlIllllllIll.toCharArray();
      long lIlIlIlllllIIII = lIlIlIlllllIIIl.length;
      int lIlIlIllllIllll = lIIIlIIlII[1];

      do {
         if (!lIIlIllIIlI(lIlIlIllllIllll, lIlIlIlllllIIII)) {
            return String.valueOf(lIlIlIlllllIlII);
         }

         int lIlIlIllllIlllI = lIlIlIlllllIIIl[lIlIlIllllIllll];
         lIlIlIlllllIlII.append((char)(lIlIlIllllIlllI ^ lIlIlIlllllIIll[lIlIlIlllllIIlI % lIlIlIlllllIIll.length]));
         "".length();
         ++lIlIlIlllllIIlI;
         ++lIlIlIllllIllll;
         "".length();
      } while((" ".length() & (" ".length() ^ -" ".length())) >= ((45 ^ 94 ^ 219 ^ 155) & (35 ^ 66 ^ 113 ^ 35 ^ -" ".length())));

      return null;
   }

   protected void Đ() {
      super.Đ();
      this.Ἒⅾ.clear();
      Map var10000 = (Map)this.Ἒⅾ;
      Integer var3 = lIIIlIIlII[1];
      Map var2 = var10000;
      int var1 = lIIIlIIlII[1];
      ArrayList var4 = new ArrayList();
      var2.put(var3, var4);
      "".length();
      var10000 = (Map)this.Ἒⅾ;
      var3 = lIIIlIIlII[2];
      var2 = var10000;
      var1 = lIIIlIIlII[1];
      var4 = new ArrayList();
      var2.put(var3, var4);
      "".length();
      var10000 = (Map)this.Ἒⅾ;
      var3 = lIIIlIIlII[8];
      var2 = var10000;
      var1 = lIIIlIIlII[1];
      var4 = new ArrayList();
      var2.put(var3, var4);
      "".length();
   }
}
