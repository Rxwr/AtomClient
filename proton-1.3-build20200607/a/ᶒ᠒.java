package a;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020\u0010B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0005\u0010\nJ+\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0007¢\u0006\u0004\b\u0005\u0010\r"},
   d2 = {"La/ᶒ᠒;", "La/ᵭ;", "Ljava/awt/Color;", "p0", "La/Ḥ;", "ⲋ", "(La/ᵭ;)La/Ḥ;", "", "(Ljava/lang/String;)La/Ḥ;", "La/ⳅ;", "(La/ⳅ;)La/Ḥ;", "", "p1", "(La/ᵭ;Ljava/util/List;)La/Ḥ;", "<init>", "()V", ""}
)
public final class ᶒ᠒ {
   private static void lIIlIlIlIll() {
      lIIIIlllIl = new String[lIIIlIIlIl[28]];
      lIIIIlllIl[lIIIlIIlIl[0]] = lIIlIIllIIl("Pu2vmBPbh7XzAVeeyaZCig==", "nNNLo");
      lIIIIlllIl[lIIIlIIlIl[4]] = lIIlIIllIIl("zil9Ww7Cuug=", "cGffW");
      lIIIIlllIl[lIIIlIIlIl[3]] = lIIlIlIlIII("OzkbCxEdcTcLDhcj", "xQtdb");
      lIIIIlllIl[lIIIlIIlIl[13]] = lIIlIlIlIII("Uw==", "pyKgV");
      lIIIIlllIl[lIIIlIIlIl[15]] = lIIlIIllIIl("f99LJXa7B7tNpoiGUZ/6Qg==", "NSgqx");
      lIIIIlllIl[lIIIlIIlIl[11]] = lIIlIIllIIl("/CBwVnoo8PI=", "toToh");
      lIIIIlllIl[lIIIlIIlIl[14]] = lIIlIlIlIIl("8vHjaD8vTrk=", "oMQuI");
      lIIIIlllIl[lIIIlIIlIl[10]] = lIIlIlIlIII("KWs=", "kQAgZ");
      lIIIIlllIl[lIIIlIIlIl[21]] = lIIlIIllIIl("DUw7Nt5nU6rQrzrg7Vl3QOnTP+xEJa8kELTkhUFpn779vO/y1bKeCtQZJYhQTEyqzi8Bm8RfR50lzPivUtZHQVX7isjEGZQQ", "YELDq");
      lIIIIlllIl[lIIIlIIlIl[23]] = lIIlIlIlIIl("CeMP6V7c6Nc=", "XPWdL");
      lIIIIlllIl[lIIIlIIlIl[1]] = lIIlIlIlIIl("SSZpeVslzqPcRm6twjXAJbof/Se6aIpoFiYcSr9GwbrBpDwJpCYl+7/sJ6AMr8DIh9g9U4ugDeOs9Xd949tz+7FwQRc6KWCigf7QUaq22WUQZBxYVyfr3bfrwxjGkCp+", "EFpnl");
      lIIIIlllIl[lIIIlIIlIl[25]] = lIIlIIllIIl("Qd0VhN/FsTLiqHKZUQqCQK3CnnrdJHUhzXs0iIvfvqHwVAyycbJCRW2km0cPygHN", "poPQU");
      lIIIIlllIl[lIIIlIIlIl[26]] = lIIlIlIlIIl("zu4ffdAa6y3V9CSDcM6AJxZvsAM5QAHNhCoMetxY7URWAO0AejSRBE2VgZsUhBsInm6hMbQnLwOOAQBlCyK8UsEXl69E/w86XA8hjNKE4cnvCi6cWfIVDQ==", "MPTgj");
      lIIIIlllIl[lIIIlIIlIl[27]] = lIIlIlIlIIl("SwtPaDAhjh0GP3K/THs7c7+/aToV4FyhT04Zb1dCYTnwWM0Xb3YIHCPvOYmJnQvP3cIkRV47qUSsbFdZb0fqHgYxnqn/Gl1Rg5sFtx4IST6ha0Hxbp7qNg==", "zkhpI");
      lIIIIlllIl[lIIIlIIlIl[24]] = lIIlIlIlIIl("T13Ryxph3OQBu8M2enA0ncZwhz9XzPEZxnyNcR3Y84d8Fi1GPb1mYdIh90S/qkEZiZnFpz+TJv74ND6FdcOmxhbusQHY8NI8FdYIXKvL6apN32T4w6A2Qa9ZywiTOGGi", "sjPvs");
      lIIIIlllIl[lIIIlIIlIl[18]] = lIIlIlIlIIl("pE+rQCio1mf9U/Olxxl7R3uSZLCq/G4fketDUV9DT/LtGLxG4yZ8zkK5H52uBJLy1YGTv5ZlJqO18gNYs20VDvMhWmjuJomZx7100YVmIft2yfEeD8Z0Dw==", "LQzKd");
   }

   private static boolean lIIlIllIlll(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIlIIllIIl(String lIlIlIlIllIIIII, String lIlIlIlIllIIIIl) {
      try {
         float lIlIlIlIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lIlIlIlIlIlllIl = Cipher.getInstance("Blowfish");
         lIlIlIlIlIlllIl.init(lIIIlIIlIl[3], lIlIlIlIlIllllI);
         return new String(lIlIlIlIlIlllIl.doFinal(Base64.getDecoder().decode(lIlIlIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @NotNull
   public final Ḥ ⲋ(@NotNull final ᵭ<Color> var1) {
      final ᵭ var2 = new ᵭ(lIIIIlllIl[lIIIlIIlIl[4]], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[3], (DefaultConstructorMarker)null);
      final ᵭ var3 = new ᵭ((double)((Color)var1.ⲋ()).getRed(), (boolean)lIIIlIIlIl[4]);
      final ᵭ var4 = new ᵭ((double)((Color)var1.ⲋ()).getGreen(), (boolean)lIIIlIIlIl[4]);
      final ᵭ var5 = new ᵭ((double)((Color)var1.ⲋ()).getBlue(), (boolean)lIIIlIIlIl[4]);
      Color var10002 = (Color)var1.ⲋ();
      ė var10003 = new ė(lIIIlIIlIl[5], lIIIlIIlIl[5]);
      double var7 = 5.0D;
      ė var9 = var10003;
      final ฿᠗ȏ var48 = new ฿᠗ȏ(var10002, var7, var9);
      int var8 = lIIIlIIlIl[0];
      int var50 = lIIIlIIlIl[0];
      int var11 = lIIIlIIlIl[0];
      var48.ⲋ((ʁᎴ)(new Ꮱ((Β)null, (Β)null, (л)null, (Ⴝ)null, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[2], (DefaultConstructorMarker)null)));
      ฿᠗ȏ var6 = var48;
      final Function0 var49 = new Function0<Unit>() {
         static {
            l();
         }

         private static void l() {
            lI = new int[1];
            lI[0] = (235 ^ 178) & ~(61 ^ 100);
         }

         public final void ⲋ() {
            var1.ⲋ((Object)(new Color((int)((Number)var3.ⲋ()).doubleValue(), (int)((Number)var4.ⲋ()).doubleValue(), (int)((Number)var5.ⲋ()).doubleValue())));
            var48.ⲋ((Color)var1.ⲋ());
            ᵭ var10000 = var2;
            ҋ var10001 = ҋ.ⲋ;
            Color var10002 = var48.ĂƂ();
            if (lllIl(var10002)) {
               Intrinsics.throwNpe();
            }

            var10000.ⲋ((Object)var10001.ⲋ(var10002));
         }

         private static boolean lllIl(Object var0) {
            return var0 == null;
         }
      };
      var2.ⲋ((Function1)(new Function1<ᵭ<String>, Unit>() {
         public final void ⲋ(@NotNull ᵭ<String> llIllIIIIlllIII) {
            switch(((String)llIllIIIIlllIII.ⲋ()).length()) {
            case 3:
               "".length();
               if (" ".length() != " ".length()) {
                  return;
               }
            case 4:
            case 5:
            default:
               break;
            case 6:
               Exception llIllIIIIllIlll = ҋ.ⲋ.ⲋ((String)llIllIIIIlllIII.ⲋ());
               var3.ⲋ((Object)((double)llIllIIIIllIlll.getRed()));
               var4.ⲋ((Object)((double)llIllIIIIllIlll.getGreen()));
               var5.ⲋ((Object)((double)llIllIIIIllIlll.getBlue()));
               "".length();
               if ((68 + 23 - -79 + 16 ^ 77 + 82 - 78 + 110) == 0) {
                  return;
               }
            }

         }

         static {
            lIIIlIIlll();
         }

         private static void lIIIlIIlll() {
            lllllllI = new int[1];
            lllllllI[0] = " ".length();
         }
      }));
      var3.ⲋ((Function1)(new Function1<ᵭ<Double>, Unit>() {
         public final void ⲋ(@NotNull ᵭ<Double> var1) {
            var49.ⲋ();
         }

         private static void lIIllIlIIIl() {
            lIIIllIlIl = new int[1];
            lIIIllIlIl[0] = " ".length();
         }

         static {
            lIIllIlIIIl();
         }
      }));
      var4.ⲋ((Function1)(new Function1<ᵭ<Double>, Unit>() {
         private static void lIIllIIIlI() {
            lIIIlllIl = new int[1];
            lIIIlllIl[0] = " ".length();
         }

         static {
            lIIllIIIlI();
         }

         public final void ⲋ(@NotNull ᵭ<Double> var1) {
            var49.ⲋ();
         }
      }));
      var5.ⲋ((Function1)(new Function1<ᵭ<Double>, Unit>() {
         public final void ⲋ(@NotNull ᵭ<Double> var1) {
            var49.ⲋ();
         }

         static {
            lIlIlIlIlII();
         }

         private static void lIlIlIlIlII() {
            lIIllllllI = new int[1];
            lIIllllllI[0] = " ".length();
         }
      }));
      Ḥ var51 = new Ḥ(lIIIIlllIl[lIIIlIIlIl[3]], lIIIlIIlIl[6], lIIIlIIlIl[7], (boolean)lIIIlIIlIl[4]);
      int var10 = lIIIlIIlIl[0];
      var11 = lIIIlIIlIl[0];
      int var13 = lIIIlIIlIl[0];
      л var10004 = л.ĂƂ;
      Β var10005 = new Β(lIIIlIIlIl[1], lIIIlIIlIl[1], lIIIlIIlIl[1], lIIIlIIlIl[8]);
      int var14;
      int var15 = var14 = lIIIlIIlIl[0];
      Ⴝ var16 = Ⴝ.ⲋ;
      Β var17 = var10005;
      л var18 = var10004;
      var51.ⲋ((ʁᎴ)(new Ꮱ((Β)null, var17, var18, var16, (boolean)var15, (boolean)var14, lIIIlIIlIl[9], (DefaultConstructorMarker)null)));
      ฿᠗ȏ var52 = new ฿᠗ȏ((Color)null, 0.0D, (ė)null, lIIIlIIlIl[10], (DefaultConstructorMarker)null);
      var15 = lIIIlIIlIl[0];
      int var53 = lIIIlIIlIl[0];
      int var54 = lIIIlIIlIl[0];
      var52.ⲋ((ʁᎴ)(new Ꮱ((Β)null, (Β)null, (л)null, (Ⴝ)null, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[2], (DefaultConstructorMarker)null)));
      var52.ĂƂ((Ữ)var6);
      ฿᠗ȏ var20 = new ฿᠗ȏ((Color)null, 0.0D, (ė)null, lIIIlIIlIl[10], (DefaultConstructorMarker)null);
      int var22 = lIIIlIIlIl[0];
      int var23 = lIIIlIIlIl[0];
      int var25 = lIIIlIIlIl[0];
      var20.ⲋ((ʁᎴ)(new Ꮱ((Β)null, new Β(lIIIlIIlIl[11], lIIIlIIlIl[0], lIIIlIIlIl[0], lIIIlIIlIl[0]), (л)null, (Ⴝ)null, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[12], (DefaultConstructorMarker)null)));
      String var55 = lIIIIlllIl[lIIIlIIlIl[13]];
      int var56 = lIIIlIIlIl[14];
      String var26 = lIIIIlllIl[lIIIlIIlIl[15]];
      int var27 = var56;
      String var28 = var55;
      Object var29 = null;
      int var34 = lIIIlIIlIl[0];
      Regex var35 = new Regex(var26);
      int var58 = lIIIlIIlIl[0];
      int var10007 = lIIIlIIlIl[16];
      Object var40 = null;
      int var41 = var10007;
      var20.ĂƂ((Ữ)(new ⲽ(var2, (String)var29, var27, var35, var28, var58, var41, (DefaultConstructorMarker)var40)));
      var52.ĂƂ((Ữ)var20);
      var51.ĂƂ((Ữ)var52);
      var52 = new ฿᠗ȏ((Color)null, 0.0D, new ė(lIIIlIIlIl[17], lIIIlIIlIl[0], lIIIlIIlIl[3], (DefaultConstructorMarker)null), lIIIlIIlIl[13], (DefaultConstructorMarker)null);
      var15 = lIIIlIIlIl[0];
      var53 = lIIIlIIlIl[0];
      var54 = lIIIlIIlIl[0];
      var52.ⲋ((ʁᎴ)(new Ꮱ((Β)null, (Β)null, (л)null, (Ⴝ)null, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[2], (DefaultConstructorMarker)null)));
      var20 = new ฿᠗ȏ((Color)null, 0.0D, (ė)null, lIIIlIIlIl[10], (DefaultConstructorMarker)null);
      var22 = lIIIlIIlIl[0];
      var23 = lIIIlIIlIl[0];
      var25 = lIIIlIIlIl[0];
      var20.ⲋ((ʁᎴ)(new Ꮱ((Β)null, new Β(lIIIlIIlIl[0], lIIIlIIlIl[11], lIIIlIIlIl[11], lIIIlIIlIl[18]), л.ĂƂ, Ⴝ.u, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[9], (DefaultConstructorMarker)null)));
      var20.ĂƂ((Ữ)(new ᾑ(var3, (Ҿ)null, (Color)null, (boolean)lIIIlIIlIl[0], lIIIIlllIl[lIIIlIIlIl[11]], (String)null, lIIIlIIlIl[19], (DefaultConstructorMarker)null)));
      int var57 = lIIIlIIlIl[20];
      Double var59 = 1.0D;
      int var60 = var57;
      var20.ĂƂ((Ữ)(new ꞌ(0.0D, 255.0D, var3, var59, var60)));
      var52.ĂƂ((Ữ)var20);
      var20 = new ฿᠗ȏ((Color)null, 0.0D, (ė)null, lIIIlIIlIl[10], (DefaultConstructorMarker)null);
      var22 = lIIIlIIlIl[0];
      var23 = lIIIlIIlIl[0];
      var25 = lIIIlIIlIl[0];
      var20.ⲋ((ʁᎴ)(new Ꮱ((Β)null, new Β(lIIIlIIlIl[1], lIIIlIIlIl[11], lIIIlIIlIl[11], lIIIlIIlIl[18]), л.ĂƂ, Ⴝ.u, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[9], (DefaultConstructorMarker)null)));
      var20.ĂƂ((Ữ)(new ᾑ(var4, (Ҿ)null, (Color)null, (boolean)lIIIlIIlIl[0], lIIIIlllIl[lIIIlIIlIl[14]], (String)null, lIIIlIIlIl[19], (DefaultConstructorMarker)null)));
      var57 = lIIIlIIlIl[20];
      var59 = 1.0D;
      var60 = var57;
      var20.ĂƂ((Ữ)(new ꞌ(0.0D, 255.0D, var4, var59, var60)));
      var52.ĂƂ((Ữ)var20);
      var20 = new ฿᠗ȏ((Color)null, 0.0D, (ė)null, lIIIlIIlIl[10], (DefaultConstructorMarker)null);
      var22 = lIIIlIIlIl[0];
      var23 = lIIIlIIlIl[0];
      var25 = lIIIlIIlIl[0];
      var20.ⲋ((ʁᎴ)(new Ꮱ((Β)null, new Β(lIIIlIIlIl[1], lIIIlIIlIl[11], lIIIlIIlIl[11], lIIIlIIlIl[18]), л.ĂƂ, Ⴝ.u, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[9], (DefaultConstructorMarker)null)));
      var20.ĂƂ((Ữ)(new ᾑ(var5, (Ҿ)null, (Color)null, (boolean)lIIIlIIlIl[0], lIIIIlllIl[lIIIlIIlIl[10]], (String)null, lIIIlIIlIl[19], (DefaultConstructorMarker)null)));
      var57 = lIIIlIIlIl[20];
      var59 = 1.0D;
      var60 = var57;
      var20.ĂƂ((Ữ)(new ꞌ(0.0D, 255.0D, var5, var59, var60)));
      var52.ĂƂ((Ữ)var20);
      var51.ĂƂ((Ữ)var52);
      var49.ⲋ();
      return var51;
   }

   @NotNull
   public final Ḥ ⲋ(@NotNull ⳅ lIlIlIllIIIllll) {
      // $FF: Couldn't be decompiled
   }

   private static String lIIlIlIlIIl(String lIlIlIlIllIllll, String lIlIlIlIllIllII) {
      try {
         SecretKeySpec lIlIlIlIlllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIllIllII.getBytes(StandardCharsets.UTF_8)), lIIIlIIlIl[21]), "DES");
         Cipher lIlIlIlIlllIIIl = Cipher.getInstance("DES");
         lIlIlIlIlllIIIl.init(lIIIlIIlIl[3], lIlIlIlIlllIIlI);
         return new String(lIlIlIlIlllIIIl.doFinal(Base64.getDecoder().decode(lIlIlIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIIlIllIIll();
      lIIlIlIlIll();
      ᶒ᠒ var0 = new ᶒ᠒();
      ⲋ = var0;
   }

   private ᶒ᠒() {
   }

   @NotNull
   public final Ḥ ⲋ(@NotNull final ᵭ<String> var1, @NotNull List<String> lIlIlIllIllllIl) {
      Ḥ var3 = (Ḥ)null;
      Function1 lIlIlIllIlllIll = (Function1)(new Function1<String, Unit>() {
         static {
            llllIIlII();
         }

         private static void llllIIlII() {
            llIllIll = new int[1];
            llIllIll[0] = " ".length();
         }

         public final void ⲋ(@NotNull String var1x) {
            var1.ⲋ((Object)var1x);
            ᶔ.ⲋ.u();
         }
      });
      Ḥ var5 = this.ⲋ(lIIIIlllIl[lIIIlIIlIl[0]]);
      int var6 = lIIIlIIlIl[0];
      int var7 = lIIIlIIlIl[0];
      Ḥ lIlIlIllIllIlll = var5;
      int var9 = lIIIlIIlIl[0];
      var5.ⲋ((ʁᎴ)(new Ꮱ((Β)null, (Β)null, (л)null, (Ⴝ)null, (boolean)lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[2], (DefaultConstructorMarker)null)));
      Iterable var10 = (Iterable)lIlIlIllIllllIl;
      int var11 = lIIIlIIlIl[0];
      Iterator lIlIlIllIllIIll = var10.iterator();

      do {
         if (!lIIlIllIlII(lIlIlIllIllIIll.hasNext())) {
            return var5;
         }

         char lIlIlIllIllIIlI = lIlIlIllIllIIll.next();
         float lIlIlIllIllIIIl = (String)lIlIlIllIllIIlI;
         long lIlIlIllIllIIII = lIIIlIIlIl[0];
         byte lIlIlIllIlIllll = new Ė(lIlIlIllIllIIIl, (ᵭ)null, lIIIlIIlIl[3], (DefaultConstructorMarker)null);
         long lIlIlIllIlIllIl = lIIIlIIlIl[0];
         long lIlIlIllIlIllII = lIIIlIIlIl[0];
         float lIlIlIllIlIlIlI = lIIIlIIlIl[0];
         lIlIlIllIlIllll.ⲋ((Function1)(new ᶒ᠒$8(lIlIlIllIllIIIl, lIlIlIllIllIlll, lIlIlIllIllllIl, lIlIlIllIlllIll)));
         lIlIlIllIllIlll.ĂƂ((Ữ)lIlIlIllIlIllll);
         "".length();
      } while(-" ".length() < 0);

      return null;
   }

   private static boolean lIIlIllIlII(int var0) {
      return var0 != 0;
   }

   private static boolean lIIlIllIlIl(Object var0) {
      return var0 == null;
   }

   @NotNull
   public final Ḥ ⲋ(@NotNull String var1) {
      return new Ḥ(var1, lIIIlIIlIl[0], lIIIlIIlIl[0], (boolean)lIIIlIIlIl[0], lIIIlIIlIl[1], (DefaultConstructorMarker)null);
   }

   private static void lIIlIllIIll() {
      lIIIlIIlIl = new int[29];
      lIIIlIIlIl[0] = (85 + 85 - 155 + 140 ^ 159 + 7 - 32 + 30) & (208 ^ 191 ^ 75 ^ 27 ^ -" ".length());
      lIIIlIIlIl[1] = 154 ^ 144;
      lIIIlIIlIl[2] = 48 ^ 91 ^ 123 ^ 47;
      lIIIlIIlIl[3] = "  ".length();
      lIIIlIIlIl[4] = " ".length();
      lIIIlIIlIl[5] = 19 ^ 78 ^ 156 ^ 138;
      lIIIlIIlIl[6] = -17617 & 17916;
      lIIIlIIlIl[7] = 201 + 186 - 245 + 106 ^ 51 + 55 - 47 + 97;
      lIIIlIIlIl[8] = 114 ^ 102;
      lIIIlIIlIl[9] = 0 ^ 46 ^ 45 ^ 50;
      lIIIlIIlIl[10] = 59 ^ 60;
      lIIIlIIlIl[11] = 0 ^ 5;
      lIIIlIIlIl[12] = 88 ^ 54 ^ 37 ^ 118;
      lIIIlIIlIl[13] = "   ".length();
      lIIIlIIlIl[14] = 152 ^ 195 ^ 113 ^ 44;
      lIIIlIIlIl[15] = 102 ^ 69 ^ 155 ^ 188;
      lIIIlIIlIl[16] = 66 ^ 92 ^ 97 ^ 93;
      lIIIlIIlIl[17] = 193 + 43 - 124 + 88;
      lIIIlIIlIl[18] = 77 ^ 32 ^ 35 ^ 65;
      lIIIlIIlIl[19] = 88 ^ 122 ^ 47 ^ 35;
      lIIIlIIlIl[20] = 126 + 69 - 51 + 6;
      lIIIlIIlIl[21] = 43 ^ 35;
      lIIIlIIlIl[22] = 111 ^ 32 ^ 212 ^ 162;
      lIIIlIIlIl[23] = 30 ^ 82 ^ 102 ^ 35;
      lIIIlIIlIl[24] = 35 ^ 45;
      lIIIlIIlIl[25] = 180 ^ 191;
      lIIIlIIlIl[26] = 18 ^ 67 ^ 73 ^ 20;
      lIIIlIIlIl[27] = 52 + 191 - 101 + 61 ^ 138 + 40 - 122 + 142;
      lIIIlIIlIl[28] = 80 ^ 64;
   }

   private static String lIIlIlIlIII(String lIlIlIlIlIlIIlI, String lIlIlIlIlIIllII) {
      lIlIlIlIlIlIIlI = new String(Base64.getDecoder().decode(lIlIlIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlIlIlIlIlIIII = new StringBuilder();
      char[] lIlIlIlIlIIllll = lIlIlIlIlIIllII.toCharArray();
      int lIlIlIlIlIIlllI = lIIIlIIlIl[0];
      long lIlIlIlIlIIlIII = lIlIlIlIlIlIIlI.toCharArray();
      int lIlIlIlIlIIIlll = lIlIlIlIlIIlIII.length;
      int lIlIlIlIlIIIllI = lIIIlIIlIl[0];

      do {
         if (!lIIlIllIlll(lIlIlIlIlIIIllI, lIlIlIlIlIIIlll)) {
            return String.valueOf(lIlIlIlIlIlIIII);
         }

         char lIlIlIlIlIlIIll = lIlIlIlIlIIlIII[lIlIlIlIlIIIllI];
         lIlIlIlIlIlIIII.append((char)(lIlIlIlIlIlIIll ^ lIlIlIlIlIIllll[lIlIlIlIlIIlllI % lIlIlIlIlIIllll.length]));
         "".length();
         ++lIlIlIlIlIIlllI;
         ++lIlIlIlIlIIIllI;
         "".length();
      } while("  ".length() < (145 + 66 - 110 + 83 ^ 175 + 65 - 53 + 1));

      return null;
   }

   private static boolean lIIlIllIllI(int var0) {
      return var0 == 0;
   }
}
