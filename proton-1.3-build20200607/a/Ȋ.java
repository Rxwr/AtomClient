package a;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00012\u00020@:\u0003\u0007\u0001\u000eB\u0017\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>B/\b\u0007\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\b\b\u0002\u0010$\u001a\u00020\u001e\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b=\u0010?J\u001f\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0007\u0010&J;\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020'2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0018\u00010\tR\u00020\u00000\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0002¢\u0006\u0004\b\u0007\u0010+J'\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020,2\u0006\u0010$\u001a\u00020,2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b\u0007\u0010-J7\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u00100J?\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b\u0007\u00102J/\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020.H\u0016¢\u0006\u0004\b\u0007\u00103J'\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020.H\u0016¢\u0006\u0004\b\u0007\u00104J-\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020.2\u0006\u0010$\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001e¢\u0006\u0004\b\u0007\u00105J?\u0010\u0001\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b\u0001\u00102J-\u0010\u0001\u001a\u00020%2\u0006\u0010#\u001a\u00020.2\u0006\u0010$\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001e¢\u0006\u0004\b\u0001\u00105J\u000f\u0010\u001a\u001a\u00020%H\u0002¢\u0006\u0004\b\u001a\u00106J\u0015\u0010\u0017\u001a\u00020(2\u0006\u0010#\u001a\u00020.¢\u0006\u0004\b\u0017\u00107J\u0017\u0010\u0007\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020.H\u0016¢\u0006\u0004\b\u0007\u00108J\u0017\u0010\u000e\u001a\u0002092\u0006\u0010#\u001a\u00020.H\u0017¢\u0006\u0004\b\u000e\u0010:J\u0017\u0010\u0001\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020.H\u0016¢\u0006\u0004\b\u0001\u00108J\u0015\u0010\n\u001a\u00020(2\u0006\u0010#\u001a\u00020.¢\u0006\u0004\b\n\u00107J7\u0010\u0007\u001a\u00020%2\u0006\u0010#\u001a\u00020.2\u0006\u0010$\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010;J7\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0018\u00010\tR\u00020\u00000\b2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0018\u00010\tR\u00020\u00000\b2\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u0007\u0010<R\u001d\u0010\u0007\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u0004R&\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0018\u00010\tR\u00020\u00000\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0082\u0004R\u001a\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0082\u0004R*\u0010\n\u001a\u0006*\u00020\u000f0\u000f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0007\u0010\u0013¨\u0006\u0086\u000eR\u001d\u0010\u0017\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0086\u0004R(\u0010\u0005\u001a\u0004\u0018\u00010\u00198\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0001\u0010\u001c\"\u0004\b\u0007\u0010\u001d¨\u0006\u0086\u000eR&\u0010\u001a\u001a\u00020\u001e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000e\u0010!\"\u0004\b\u0007\u0010\"¨\u0006\u0086\u000eR\u001a\u0010\u001f\u001a\u00020\u001e8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010!¨\u0006\u0096\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0001\u0010\u0004¨\u0006\u0082DR&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0018\u00010\tR\u00020\u00000\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b¨\u0006\u0082\u0004R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0018\u00010\tR\u00020\u00000\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0082\u0004"},
   d2 = {"La/Ȋ;", "ĂƂ", "", "Đ", "Z", "Ἒⅾ", "()Z", "ⲋ", "", "La/Ȋ$ⲋ;", "ᴃᎲ", "[La/Ȋ$ⲋ;", "", "[I", "u", "Ljava/awt/Color;", "Ꜥ", "Ljava/awt/Color;", "()Ljava/awt/Color;", "(Ljava/awt/Color;)V", "Ljava/awt/Font;", "ⲡ", "Ljava/awt/Font;", "〥ҳⱆ", "()Ljava/awt/Font;", "Ljava/awt/image/BufferedImage;", "ϛⰄ", "Ljava/awt/image/BufferedImage;", "()Ljava/awt/image/BufferedImage;", "(Ljava/awt/image/BufferedImage;)V", "", "ς", "I", "()I", "(I)V", "p0", "p1", "", "(ILjava/awt/image/BufferedImage;)V", "", "", "p2", "p3", "(C[La/Ȋ$ⲋ;FF)V", "Lorg/lwjgl/util/vector/Vector2f;", "(Lorg/lwjgl/util/vector/Vector2f;Lorg/lwjgl/util/vector/Vector2f;F)V", "", "p4", "(IILjava/awt/Color;Ljava/lang/String;Z)V", "p5", "(IIIIILjava/lang/String;)V", "(IIILjava/lang/String;)V", "(IILjava/lang/String;)V", "(Ljava/lang/String;FFI)V", "()V", "(Ljava/lang/String;)F", "(Ljava/lang/String;)I", "La/ė;", "(Ljava/lang/String;)La/ė;", "(Ljava/lang/String;FFIZ)V", "([La/Ȋ$ⲋ;I)[La/Ȋ$ⲋ;", "<init>", "(Ljava/awt/Font;Z)V", "(Ljava/awt/Font;IZZ)V", "La/Ꞓ;"}
)
public final class Ȋ implements Ꞓ {
   private static boolean lllIIlll(int var0, int var1) {
      return var0 == var1;
   }

   public void ĂƂ(int var1, int var2, int var3, int var4, int var5, @NotNull String var6) {
      ơ߀ var8 = ơ߀.ⲋ;
      Class var9 = Թ.class;
      int var10 = lIlllII[2];
      Object var10000 = var8.ⲋ().get(Թ.class);
      if (llIllIlI(var10000)) {
         throw new TypeCastException(lIlIIlI[lIlllII[27]]);
      } else {
         float var7 = (float)((Թ)((ⳅ)((Թ)var10000))).ς();
         this.ⲋ(var6, (float)var1 + var7, (float)var2 + var7, lIlllII[39] | (var3 & lIlllII[4]) << lIlllII[8] | (var4 & lIlllII[4]) << lIlllII[3] | var5 & lIlllII[4], (boolean)lIlllII[0]);
         this.ⲋ(var6, (float)var1, (float)var2, lIlllII[39] | (var3 & lIlllII[4]) << lIlllII[8] | (var4 & lIlllII[4]) << lIlllII[3] | var5 & lIlllII[4], (boolean)lIlllII[2]);
      }
   }

   @JvmOverloads
   public Ȋ(@NotNull Font var1, int var2) {
      this(var1, var2, (boolean)lIlllII[2], (boolean)lIlllII[2], lIlllII[32], (DefaultConstructorMarker)null);
   }

   private static boolean lllIlIIl(int var0) {
      return var0 >= 0;
   }

   private final Ȋ.ⲋ[] ⲋ(Ȋ.ⲋ[] llllIIIlIIIllll, int var2) {
      llllIIIlIIlIIII.ϛⰄ();
      Font llllIIIlIIIllII = llllIIIlIIlIIII.ⲡ.deriveFont(var2);
      BufferedImage var4 = new BufferedImage(lIlllII[0], lIlllII[0], lIlllII[1]);
      Graphics var10000 = var4.getGraphics();
      if (llIllIlI(var10000)) {
         throw new TypeCastException(lIlIIlI[lIlllII[2]]);
      } else {
         String llllIIIlIIIlIlI = (Graphics2D)var10000;
         llllIIIlIIIlIlI.setFont(llllIIIlIIIllII);
         byte llllIIIlIIIlIIl = llllIIIlIIIlIlI.getFontMetrics();
         double llllIIIlIIIIlll = lIlllII[2];
         String llllIIIlIIIlIII = new ArrayList();
         llllIIIlIIIIlll = lIlllII[2];
         int llllIIIlIIIIllI = llllIIIlIIIllll.length;

         do {
            float llllIIIlIIIIIll;
            if (!llIllIll(llllIIIlIIIIlll, llllIIIlIIIIllI)) {
               byte llllIIIlIIIIllI = (Iterable)llllIIIlIIIlIII;
               float llllIIIlIIIIlIl = lIlllII[2];
               short llllIIIlIIIIIll = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(llllIIIlIIIIllI, lIlllII[7])));
               String llllIIIlIIIIIlI = lIlllII[2];
               Iterator llllIIIlIIIIIIl = llllIIIlIIIIllI.iterator();

               do {
                  Float llllIIIIlllIllI;
                  if (!lllIIIIl(llllIIIlIIIIIIl.hasNext())) {
                     double llllIIIlIIIIlll = CollectionsKt.sumOfFloat((Iterable)((List)llllIIIlIIIIIll));
                     float llllIIIlIIIIlIl = (Iterable)llllIIIlIIIlIII;
                     char llllIIIlIIIIlII = lIlllII[2];
                     String llllIIIlIIIIIlI = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(llllIIIlIIIIlIl, lIlllII[7])));
                     short llllIIIlIIIIIIl = lIlllII[2];
                     Iterator llllIIIlIIIIIII = llllIIIlIIIIlIl.iterator();

                     do {
                        int llllIIIIlllllIl;
                        if (!lllIIIIl(llllIIIlIIIIIII.hasNext())) {
                           Float var44 = CollectionsKt.max((Iterable)((List)llllIIIlIIIIIlI));
                           float var46;
                           if (lllIIIlI(var44)) {
                              var46 = var44;
                              "".length();
                              if ("  ".length() <= 0) {
                                 return null;
                              }
                           } else {
                              "".length();
                              var46 = 0.0F;
                           }

                           byte llllIIIlIIIIllI = var46;
                           float llllIIIlIIIIlIl = new BufferedImage((int)llllIIIlIIIIlll, (int)llllIIIlIIIIllI, lIlllII[1]);
                           var10000 = llllIIIlIIIIlIl.getGraphics();
                           if (llIllIlI(var10000)) {
                              throw new TypeCastException(lIlIIlI[lIlllII[6]]);
                           }

                           char llllIIIlIIIIlII = (Graphics2D)var10000;
                           llllIIIlIIIIlII.setColor(new Color(lIlllII[4], lIlllII[4], lIlllII[4], lIlllII[2]));
                           llllIIIlIIIIlII.fillRect(lIlllII[2], lIlllII[2], (int)llllIIIlIIIIlll, (int)llllIIIlIIIIllI);
                           llllIIIlIIIIIll = 0.0F;
                           String llllIIIlIIIIIlI = (Iterable)llllIIIlIIIlIII;
                           llllIIIlIIIIIIl = lIlllII[2];
                           short llllIIIlIIIIIII = lIlllII[2];
                           Iterator llllIIIIlllllll = llllIIIlIIIIIlI.iterator();

                           do {
                              if (!lllIIIIl(llllIIIIlllllll.hasNext())) {
                                 llllIIIlIIlIIII.ς = GlStateManager.func_179146_y();
                                 llllIIIlIIlIIII.ⲋ(llllIIIlIIlIIII.ς, llllIIIlIIIIlIl);
                                 llllIIIlIIlIIII.ϛⰄ = llllIIIlIIIIlIl;
                                 return llllIIIlIIIllll;
                              }

                              int llllIIIIllllllI = llllIIIIlllllll.next();
                              llllIIIIlllllIl = llllIIIlIIIIIII++;
                              byte llllIIIIlllllII = lIlllII[2];
                              if (lllIIIll(llllIIIIlllllIl)) {
                                 CollectionsKt.throwIndexOverflow();
                              }

                              double llllIIIIllllIlI = (Ȋ.u)llllIIIIllllllI;
                              short llllIIIIllllIII = lIlllII[2];
                              llllIIIlIIIIlII.drawImage((Image)llllIIIIllllIlI.ᴃᎲ(), (int)llllIIIlIIIIIll, lIlllII[2], (ImageObserver)null);
                              "".length();
                              llllIIIlIIIllll[llllIIIIlllllIl] = new Ȋ.ⲋ(llllIIIIllllIlI.ⲋ(), llllIIIIllllIlI.ĂƂ(), llllIIIIllllIlI.u(), llllIIIlIIIIIll, llllIIIIllllIlI.u() - (float)llllIIIlIIIIlIl.getHeight());
                              llllIIIlIIIIIll += llllIIIIllllIlI.ĂƂ();
                              "".length();
                           } while(((222 ^ 199) & ~(129 ^ 152)) == 0);

                           return null;
                        }

                        int llllIIIIlllllll = llllIIIlIIIIIII.next();
                        int llllIIIIllllllI = (Ȋ.u)llllIIIIlllllll;
                        llllIIIIlllllIl = lIlllII[2];
                        llllIIIIlllIllI = llllIIIIllllllI.u();
                        llllIIIlIIIIIlI.add(llllIIIIlllIllI);
                        "".length();
                        "".length();
                     } while(null == null);

                     return null;
                  }

                  short llllIIIlIIIIIII = llllIIIlIIIIIIl.next();
                  int llllIIIIlllllll = (Ȋ.u)llllIIIlIIIIIII;
                  int llllIIIIllllllI = lIlllII[2];
                  llllIIIIlllIllI = llllIIIIlllllll.ĂƂ();
                  llllIIIlIIIIIll.add(llllIIIIlllIllI);
                  "".length();
                  "".length();
               } while(((67 ^ 27) & ~(242 ^ 170)) < "  ".length());

               return null;
            }

            float llllIIIlIIIIlIl = (char)llllIIIlIIIIlll;
            char llllIIIlIIIIlII = llllIIIlIIIlIIl.getStringBounds(String.valueOf((new StringBuilder()).append(String.valueOf(llllIIIlIIIIlIl)).append(lIlIIlI[lIlllII[0]])), (Graphics)llllIIIlIIIlIlI);
            llllIIIlIIIIIll = (float)llllIIIlIIIIlII.getWidth() + (float)lIlllII[3];
            String llllIIIlIIIIIlI = (float)llllIIIlIIIIlII.getHeight();
            short llllIIIlIIIIIIl = new BufferedImage((int)Math.ceil((double)llllIIIlIIIIIll), (int)Math.ceil((double)llllIIIlIIIIIlI), lIlllII[1]);
            var10000 = llllIIIlIIIIIIl.getGraphics();
            if (llIllIlI(var10000)) {
               throw new TypeCastException(lIlIIlI[lIlllII[1]]);
            }

            short llllIIIlIIIIIII = (Graphics2D)var10000;
            llllIIIlIIIIIII.setFont(llllIIIlIIIllII);
            llllIIIlIIIIIII.setColor(new Color(lIlllII[4], lIlllII[4], lIlllII[4], lIlllII[2]));
            llllIIIlIIIIIII.fillRect(lIlllII[2], lIlllII[2], llllIIIlIIIIIIl.getWidth(), llllIIIlIIIIIIl.getHeight());
            llllIIIlIIIIIII.setColor(Color.WHITE);
            llllIIIlIIIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            llllIIIlIIIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            llllIIIlIIIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            llllIIIlIIIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            llllIIIlIIIIIII.drawString(String.valueOf((new StringBuilder()).append(String.valueOf(llllIIIlIIIIlIl)).append(lIlIIlI[lIlllII[5]])), lIlllII[6], llllIIIlIIIlIIl.getAscent());
            llllIIIlIIIlIII.add(new Ȋ.u(llllIIIlIIIIlIl, (float)llllIIIlIIIIIIl.getWidth(), (float)llllIIIlIIIIIIl.getHeight(), llllIIIlIIIIIIl));
            "".length();
            ++llllIIIlIIIIlll;
            "".length();
         } while("  ".length() != 0);

         return null;
      }
   }

   public final void ⲋ(@NotNull String var1, float var2, float var3, int var4) {
      this.ⲋ(var1, var2, var3, var4, (boolean)lIlllII[2]);
   }

   private static boolean llIllIlI(Object var0) {
      return var0 == null;
   }

   private final void ⲋ(int var1, BufferedImage llllIIIIllIlIIl) {
      int[] llllIIIIllIlIII = new int[llllIIIIllIlIIl.getWidth() * llllIIIIllIlIIl.getHeight()];
      llllIIIIllIlIIl.getRGB(lIlllII[2], lIlllII[2], llllIIIIllIlIIl.getWidth(), llllIIIIllIlIIl.getHeight(), llllIIIIllIlIII, lIlllII[2], llllIIIIllIlIIl.getWidth());
      "".length();
      ByteBuffer llllIIIIllIIlll = BufferUtils.createByteBuffer(llllIIIIllIlIIl.getWidth() * llllIIIIllIlIIl.getHeight() * lIlllII[6]);
      int llllIIIIllIIllI = lIlllII[2];
      int llllIIIIllIIlIl = llllIIIIllIlIIl.getHeight();

      do {
         if (!llIllIll(llllIIIIllIIllI, llllIIIIllIIlIl)) {
            llllIIIIllIIlll.flip();
            "".length();
            GlStateManager.func_179144_i(var1);
            GL11.glTexParameteri(lIlllII[10], lIlllII[11], lIlllII[12]);
            GL11.glTexParameteri(lIlllII[10], lIlllII[13], lIlllII[12]);
            GL11.glTexImage2D(lIlllII[10], lIlllII[2], lIlllII[14], llllIIIIllIlIIl.getWidth(), llllIIIIllIlIIl.getHeight(), lIlllII[2], lIlllII[14], lIlllII[15], llllIIIIllIIlll);
            GlStateManager.func_179144_i(lIlllII[2]);
            return;
         }

         Exception llllIIIIllIIlII = lIlllII[2];
         int llllIIIIllIIIll = llllIIIIllIlIIl.getWidth();

         while(llIllIll(llllIIIIllIIlII, llllIIIIllIIIll)) {
            float llllIIIIllIIIlI = llllIIIIllIlIII[llllIIIIllIIllI * llllIIIIllIlIIl.getWidth() + llllIIIIllIIlII];
            llllIIIIllIIlll.put((byte)(llllIIIIllIIIlI >> lIlllII[8] & lIlllII[4]));
            "".length();
            llllIIIIllIIlll.put((byte)(llllIIIIllIIIlI >> lIlllII[3] & lIlllII[4]));
            "".length();
            llllIIIIllIIlll.put((byte)(llllIIIIllIIIlI & lIlllII[4]));
            "".length();
            llllIIIIllIIlll.put((byte)(llllIIIIllIIIlI >> lIlllII[9] & lIlllII[4]));
            "".length();
            ++llllIIIIllIIlII;
            "".length();
            if (-"  ".length() >= 0) {
               return;
            }
         }

         ++llllIIIIllIIllI;
         "".length();
      } while("   ".length() >= 0);

   }

   private static boolean lllIIllI(int var0) {
      return var0 > 0;
   }

   public void ⲋ(int var1, int var2, @NotNull String var3) {
      this.ⲋ(var3, (float)var1, (float)var2, lIlllII[38], (boolean)lIlllII[2]);
   }

   private static boolean lllIIIll(int var0) {
      return var0 < 0;
   }

   private final void ⲋ(Vector2f var1, Vector2f var2, float var3) {
      GL11.glDisable(lIlllII[10]);
      GL11.glLineWidth(var3);
      GL11.glBegin(lIlllII[0]);
      int var5 = lIlllII[2];
      int var6 = lIlllII[2];
      Ȋ var7 = (Ȋ)this;
      int var8 = lIlllII[2];
      GL11.glVertex2f(var1.x, var1.y);
      GL11.glVertex2f(var2.x, var2.y);
      GL11.glEnd();
      GL11.glEnable(lIlllII[10]);
   }

   private static boolean lllIIIIl(int var0) {
      return var0 != 0;
   }

   private static String llIIIlll(String lllIlllIlIlIIIl, String lllIlllIlIIlllI) {
      try {
         SecretKeySpec lllIlllIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlllIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIlllII[3]), "DES");
         String lllIlllIlIIllII = Cipher.getInstance("DES");
         lllIlllIlIIllII.init(lIlllII[1], lllIlllIlIlIlII);
         return new String(lllIlllIlIIllII.doFinal(Base64.getDecoder().decode(lllIlllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public int ĂƂ(@NotNull String var1) {
      return (int)this.ᴃᎲ(var1);
   }

   private static void llIIlIlI() {
      lIlIIlI = new String[lIlllII[28]];
      lIlIIlI[lIlllII[2]] = lIllllIl("Hb8jOBTBM9lH9iPCpALuxtGkk0ZjRBt5dhtl4xdrVCxf1F+SoWIpzB3/JATKcTkxYQyZUQ12J4z7bnsTW4qKgA==", "RKqfr");
      lIlIIlI[lIlllII[0]] = llIIIllI("", "dhtUp");
      lIlIIlI[lIlllII[1]] = llIIIllI("ITkqHWIsLSgfLTtsJBRiLC01BWI7I2YfLSFhKAQuI2wyCDIqbCwQNC5iJwY2YQs0EDInJSUCcAs=", "OLFqB");
      lIlIIlI[lIlllII[5]] = llIIIlll("7SyoIdKQ2zM=", "KqWXd");
      lIlIIlI[lIlllII[6]] = llIIIlll("yAtKe4S70XL4TyELaVTPveBFKLD8wXk6JZ3wQHiJErL+E35S138kbhMMd6wAENr8P24UH/+pKcGbYEssvd9Zmw==", "ivWSN");
      lIlIIlI[lIlllII[16]] = llIIIllI("DgIlHwo0IjE8Cz4zETwXYGwRPAs+MxEKESg/DT4=", "ZVcYe");
      lIlIIlI[lIlllII[23]] = llIIIlll("AyNr6m6iyfWPvl2U5kbbXIFTjOdYVfds", "dyQvL");
      lIlIIlI[lIlllII[20]] = llIIIlll("rt/PvAm0J7kHITYBnI2T+GBJLRQ1y34w5+pSXCcawRp0Qm0Q0P2TCYATgTdWjDIkdwWA0ef1bEA=", "rNPLB");
      lIlIIlI[lIlllII[3]] = lIllllIl("/AfAidyjCkM=", "aPVGn");
      lIlIIlI[lIlllII[30]] = lIllllIl("5185VXg6h7s3rLEZaI1lhG+sXf1U+0k+QQz7ARj7Uz4=", "JmZvX");
      lIlIIlI[lIlllII[7]] = llIIIlll("lxWFQ8Cr/DB9KwTclV59EYeH7E+1gONu", "aeDYN");
      lIlIIlI[lIlllII[31]] = lIllllIl("s9Mlm8Cs1LNNfdel1wMca5GmorzkHdnrzBbxSWeUU+CdJGunzzh1pHsXxmI1JJkmGmkVUaxqtck=", "ZbXcb");
      lIlIIlI[lIlllII[32]] = lIllllIl("qmPvXFz1AJs=", "VsPkI");
      lIlIIlI[lIlllII[33]] = llIIIllI("aElGVX1tTkNecDkaFwIsPhMYCyc3Cg==", "XxtfI");
      lIlIIlI[lIlllII[34]] = llIIIllI("BR4NKUEICg8rDh9LAyBBCAoSMUEfBEErDgVGDzANB0sVPBEOSwskFwpFDSQPDEUyMRMCBQY=", "kkaEa");
      lIlIIlI[lIlllII[24]] = llIIIllI("", "SufFs");
      lIlIIlI[lIlllII[8]] = llIIIllI("HBwOETcmPBoyNiwtOjIqcnIsJTk/CyA2Kg==", "HHHWX");
      lIlIIlI[lIlllII[25]] = lIllllIl("QvYckxonvQPuf03hufwN785It7n/D6KDoxz/SP1/yJg=", "OeXyJ");
      lIlIIlI[lIlllII[26]] = llIIIllI("Mw==", "kLgHf");
      lIlIIlI[lIlllII[27]] = llIIIlll("JRCjDR5W6IZWpjiidf55Fw0yTLX7fjbYrj3Vj/2PTFGduL4giwTFKfnTfiIWor4NClxwAD/24N7f37wqkSJtCy8nr5KXfgly", "gRtsw");
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final Font 〥ҳⱆ() {
      return this.ⲡ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(int var1) {
      this.ς = var1;
   }

   private static boolean lllIlIlI(int var0, int var1) {
      return var0 > var1;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final boolean Ἒⅾ() {
      return this.Đ;
   }

   public final float ᴃᎲ(@NotNull String llllIIIIIIIlIIl) {
      float var2 = 0.0F;
      Ȋ.ⲋ[] llllIIIIIIIIlll = llllIIIIIIIlIlI.u;
      int llllIIIIIIIIllI = llllIIIIIIIlIIl.length();
      int llllIIIIIIIIlIl = lIlllII[2];
      int llllIIIIIIIIlII = llllIIIIIIIIllI;

      do {
         if (!llIllIll(llllIIIIIIIIlIl, llllIIIIIIIIlII)) {
            return var2 + (float)lIlllII[1];
         }

         short llllIIIIIIIIIll = llllIIIIIIIlIIl.charAt(llllIIIIIIIIlIl);
         int var10000;
         if (lllIIllI(llllIIIIIIIIlIl)) {
            var10000 = llllIIIIIIIlIIl.charAt(llllIIIIIIIIlIl - lIlllII[0]);
            "".length();
            if (-"  ".length() > 0) {
               return 0.0F;
            }
         } else {
            var10000 = lIlllII[21];
         }

         float llllIIIIIIIIIlI = var10000;
         if (lllIIlll(llllIIIIIIIIIlI, lIlllII[22])) {
            "".length();
            if (((27 ^ 69) & ~(13 ^ 83)) != 0) {
               return 0.0F;
            }
         } else if (lllIIlll(llllIIIIIIIIIll, lIlllII[22]) && llIllIll(llllIIIIIIIIlIl, llllIIIIIIIIllI)) {
            if (lllIIlll(llllIIIIIIIIlIl + lIlllII[0], llllIIIIIIIIllI)) {
               "".length();
               if (((141 ^ 150) & ~(174 ^ 181)) != 0) {
                  return 0.0F;
               }
            } else {
               CharSequence var16 = (CharSequence)lIlIIlI[lIlllII[7]];
               long lllIlllllllllll = Locale.ENGLISH;
               Exception lllIlllllllllIl = var16;
               char lllIllllllllllI = lIlllII[2];
               if (llIllIlI(llllIIIIIIIlIIl)) {
                  throw new TypeCastException(lIlIIlI[lIlllII[31]]);
               }

               String var17 = llllIIIIIIIlIIl.toLowerCase(lllIlllllllllll);
               Intrinsics.checkExpressionValueIsNotNull(var17, lIlIIlI[lIlllII[32]]);
               Exception lllIlllllllllII = var17;
               Exception llllIIIIIIIIIIl = StringsKt.indexOf$default(lllIlllllllllIl, lllIlllllllllII.charAt(llllIIIIIIIIlIl + lIlllII[0]), lIlllII[2], (boolean)lIlllII[2], lIlllII[23], (Object)null);
               if (lllIIlll(llllIIIIIIIIIIl, lIlllII[25])) {
                  llllIIIIIIIIlll = llllIIIIIIIlIlI.ᴃᎲ;
                  "".length();
                  if (" ".length() >= "  ".length()) {
                     return 0.0F;
                  }
               } else if (lllIIlll(llllIIIIIIIIIIl, lIlllII[28])) {
                  llllIIIIIIIIlll = llllIIIIIIIlIlI.〥ҳⱆ;
                  "".length();
                  if (((141 + 110 - 223 + 128 ^ 155 + 147 - 266 + 150) & (170 ^ 192 ^ 116 ^ 56 ^ -" ".length())) < 0) {
                     return 0.0F;
                  }
               } else if (lllIIlll(llllIIIIIIIIIIl, lIlllII[29])) {
                  llllIIIIIIIIlll = llllIIIIIIIlIlI.u;
                  "".length();
                  if ("   ".length() != "   ".length()) {
                     return 0.0F;
                  }
               }
            }
         } else if (lllIlIlI(llllIIIIIIIIIll, lIlllII[4])) {
            "".length();
            if ("  ".length() > "  ".length()) {
               return 0.0F;
            }
         } else {
            Exception llllIIIIIIIIIIl = llllIIIIIIIIlll[llllIIIIIIIIIll];
            if (llIllIlI(llllIIIIIIIIIIl)) {
               Intrinsics.throwNpe();
            }

            var2 += (llllIIIIIIIIIIl.ĂƂ() - (float)lIlllII[3]) / (float)lIlllII[1];
         }

         ++llllIIIIIIIIlIl;
         "".length();
      } while(-(104 ^ 108) < 0);

      return 0.0F;
   }

   private static void llIllIIl() {
      lIlllII = new int[42];
      lIlllII[0] = " ".length();
      lIlllII[1] = "  ".length();
      lIlllII[2] = (122 ^ 56) & ~(98 ^ 32);
      lIlllII[3] = "   ".length() ^ 47 ^ 36;
      lIlllII[4] = 188 + 0 - 51 + 62 + 203 + 56 - 230 + 178 - (-15059 & 15351) + 71 + 114 - 78 + 35;
      lIlllII[5] = "   ".length();
      lIlllII[6] = 148 + 84 - 121 + 83 ^ 140 + 57 - 92 + 93;
      lIlllII[7] = 114 ^ 84 ^ 234 ^ 198;
      lIlllII[8] = 108 ^ 124;
      lIlllII[9] = 112 ^ 104;
      lIlllII[10] = -(-377 & 4989) & -8217 & 16381;
      lIlllII[11] = -17537 & 27777;
      lIlllII[12] = -(146 ^ 131) & -22753 & 32496;
      lIlllII[13] = -(-3017 & 24542) & -483 & 32247;
      lIlllII[14] = -17940 & 24347;
      lIlllII[15] = -26807 & 31927;
      lIlllII[16] = 99 ^ 102;
      lIlllII[17] = -11911 & '껯';
      lIlllII[18] = -(-8579 & 31159) & -8257 & 31606;
      lIlllII[19] = -6345 & 7115;
      lIlllII[20] = 135 ^ 128;
      lIlllII[21] = 147 ^ 189;
      lIlllII[22] = (249 ^ 133) + (255 ^ 146) - (80 + 50 - 26 + 110) + 15 + 125 - -3 + 5;
      lIlllII[23] = 35 ^ 46 ^ 32 ^ 43;
      lIlllII[24] = 255 ^ 180 ^ 113 ^ 53;
      lIlllII[25] = 56 + 65 - -14 + 11 ^ 75 + 105 - 99 + 50;
      lIlllII[26] = 102 + 6 - -14 + 21 ^ 116 + 141 - 201 + 101;
      lIlllII[27] = 166 ^ 181;
      lIlllII[28] = 169 ^ 189;
      lIlllII[29] = 78 ^ 91;
      lIlllII[30] = 91 ^ 82;
      lIlllII[31] = 58 + 81 - 90 + 129 ^ 181 + 26 - 143 + 121;
      lIlllII[32] = 54 ^ 58;
      lIlllII[33] = 25 + 142 - 114 + 123 ^ 17 + 58 - 61 + 175;
      lIlllII[34] = 51 ^ 4 ^ 25 ^ 32;
      lIlllII[35] = 2 ^ 66 ^ 235 ^ 180;
      lIlllII[36] = 252 ^ 163 ^ 144 ^ 154;
      lIlllII[37] = (194 ^ 190) + (107 ^ 37) - (93 + 118 - 204 + 193) + 50 + 93 - 29 + 54;
      lIlllII[38] = -" ".length();
      lIlllII[39] = -(-13835 & 16791050);
      lIlllII[40] = 29 ^ 85 ^ 19 ^ 123;
      lIlllII[41] = -(-14676 & 32255) & -593 & 18427;
   }

   private final void ϛⰄ() {
      int lllIllllIllIIIl = lIlllII[2];
      int lllIllllIllIIII = lIlllII[35];

      do {
         if (!lllIllII(lllIllllIllIIIl, lllIllllIllIIII)) {
            return;
         }

         float lllIllllIlIllll = (lllIllllIllIIIl >> lIlllII[5] & lIlllII[0]) * lIlllII[36];
         String lllIllllIlIlllI = (lllIllllIllIIIl >> lIlllII[1] & lIlllII[0]) * lIlllII[37] + lllIllllIlIllll;
         byte lllIllllIlIllIl = (lllIllllIllIIIl >> lIlllII[0] & lIlllII[0]) * lIlllII[37] + lllIllllIlIllll;
         boolean lllIllllIlIllII = (lllIllllIllIIIl >> lIlllII[2] & lIlllII[0]) * lIlllII[37] + lllIllllIlIllll;
         if (lllIIlll(lllIllllIllIIIl, lIlllII[23])) {
            lllIllllIlIlllI += lIlllII[36];
         }

         if (lllIllIl(lllIllllIllIIIl, lIlllII[8])) {
            lllIllllIlIlllI /= lIlllII[6];
            lllIllllIlIllIl /= lIlllII[6];
            lllIllllIlIllII /= lIlllII[6];
         }

         lllIllllIllIIlI.Ἒⅾ[lllIllllIllIIIl] = (lllIllllIlIlllI & lIlllII[4]) << lIlllII[8] | (lllIllllIlIllIl & lIlllII[4]) << lIlllII[3] | lllIllllIlIllII & lIlllII[4];
         ++lllIllllIllIIIl;
         "".length();
      } while(((41 ^ 46) & ~(68 ^ 67)) != "   ".length());

   }

   @JvmOverloads
   public Ȋ(@NotNull Font var1, int var2, boolean var3, boolean var4) {
      super();
      this.ⲡ = var1;
      this.Đ = var4;
      this.Ἒⅾ = new int[lIlllII[40]];
      this.Ꜥ = Color.white;
      this.u = this.ⲋ(new Ȋ.ⲋ[var2], lIlllII[2]);
      this.ᴃᎲ = this.u;
      this.〥ҳⱆ = this.u;
   }

   public void ⲋ(int var1, int var2, int var3, @NotNull String var4) {
      this.ⲋ(var4, (float)var1, (float)var2, var3, (boolean)lIlllII[2]);
   }

   public int ⲋ(@NotNull String var1) {
      return (int)this.〥ҳⱆ(var1);
   }

   public void ⲋ(int lllIllllIlIIlII, int lllIllllIlIIIll, @NotNull Color lllIllllIlIIIlI, @NotNull String lllIllllIlIIIIl, boolean var5) {
      if (lllIIIIl(var5)) {
         lllIllllIlIIlIl.ĂƂ(lllIllllIlIIlII, lllIllllIlIIIll, lllIllllIlIIIlI.getRed(), lllIllllIlIIIlI.getGreen(), lllIllllIlIIIlI.getBlue(), lllIllllIlIIIIl);
         "".length();
         if (" ".length() < 0) {
            return;
         }
      } else {
         lllIllllIlIIlIl.ⲋ(lllIllllIlIIlII, lllIllllIlIIIll, lllIllllIlIIIlI.getRed(), lllIllllIlIIIlI.getGreen(), lllIllllIlIIIlI.getBlue(), lllIllllIlIIIIl);
      }

   }

   public final void ĂƂ(@NotNull String var1, float var2, float var3, int var4) {
      GL11.glTranslated(0.5D, 0.5D, 0.0D);
      this.ⲋ(var1, var2, var3, var4, (boolean)lIlllII[0]);
      GL11.glTranslated(-0.5D, -0.5D, 0.0D);
      this.ⲋ(var1, var2, var3, var4, (boolean)lIlllII[2]);
   }

   private final void ⲋ(String llllIIIIIllllIl, float var2, float var3, int llllIIIIIllIlll, boolean llllIIIIIllIlIl) {
      a.ᴃᎲ.u.ⲋ(lIlIIlI[lIlllII[16]]);
      int var6 = GL11.glGetInteger(lIlllII[17]);
      if (!lllIIlII(llllIIIIIllllIl.length())) {
         GL11.glPushMatrix();
         long llllIIIIIlIllIl = 2.0F;
         GlStateManager.func_179152_a(1.0F / llllIIIIIlIllIl, 1.0F / llllIIIIIlIllIl, 1.0F);
         long llllIIIIIllIIIl = var2 - 2.0F;
         boolean llllIIIIIlIllll = var3 - 2.0F;
         llllIIIIIllIIIl += 0.5F;
         llllIIIIIlIllll += 0.5F;
         llllIIIIIllIIIl *= llllIIIIIlIllIl;
         llllIIIIIlIllll *= llllIIIIIlIllIl;
         short llllIIIIIlIllII = llllIIIIIllllll.u;
         double llllIIIIIlIlIll = lIlllII[2];
         long llllIIIIIlIlIlI = lIlllII[2];
         float llllIIIIIlIlIIl = lIlllII[2];
         long llllIIIIIlIlIII = llllIIIIIllllIl.length();
         int var10000;
         if (lllIIIIl(llllIIIIIllIlIl)) {
            var10000 = lIlllII[6];
            "".length();
            if (-" ".length() > 0) {
               return;
            }
         } else {
            var10000 = lIlllII[0];
         }

         short llllIIIIIlIIlll = var10000;
         llllIIIIIllllll.Ꜥ = new Color((llllIIIIIllIlll >> lIlllII[8] & lIlllII[4]) / llllIIIIIlIIlll, (llllIIIIIllIlll >> lIlllII[3] & lIlllII[4]) / llllIIIIIlIIlll, (llllIIIIIllIlll & lIlllII[4]) / llllIIIIIlIIlll, llllIIIIIllIlll >> lIlllII[9] & lIlllII[4]);
         GlStateManager.func_179098_w();
         GL11.glEnable(lIlllII[10]);
         GL11.glBindTexture(lIlllII[10], llllIIIIIllllll.ς);
         GlStateManager.func_179147_l();
         GL11.glBlendFunc(lIlllII[18], lIlllII[19]);
         char llllIIIIIlIIllI = Tessellator.func_178181_a().func_178180_c();
         llllIIIIIlIIllI.func_181668_a(lIlllII[20], DefaultVertexFormats.field_181709_i);
         Exception llllIIIIIlIIlII = lIlllII[2];
         int llllIIIIIlIIIll = llllIIIIIlIlIII;

         do {
            if (!llIllIll(llllIIIIIlIIlII, llllIIIIIlIIIll)) {
               Tessellator.func_178181_a().func_78381_a();
               GL11.glPopMatrix();
               GL11.glColor4d(1.0D, 1.0D, 1.0D, 1.0D);
               GlStateManager.func_179144_i(var6);
               GlStateManager.func_179090_x();
               GL11.glDisable(lIlllII[10]);
               a.ᴃᎲ.u.ĂƂ(lIlIIlI[lIlllII[30]]);
               return;
            }

            String llllIIIIIlIIIIl = llllIIIIIllllIl.charAt(llllIIIIIlIIlII);
            if (lllIIllI(llllIIIIIlIIlII)) {
               var10000 = llllIIIIIllllIl.charAt(llllIIIIIlIIlII - lIlllII[0]);
               "".length();
               if (-" ".length() >= (227 ^ 183 ^ 87 ^ 7)) {
                  return;
               }
            } else {
               var10000 = lIlllII[21];
            }

            byte llllIIIIIlIIIII = var10000;
            if (lllIIlll(llllIIIIIlIIIII, lIlllII[22])) {
               "".length();
               if ("   ".length() <= "  ".length()) {
                  return;
               }
            } else if (lllIIlll(llllIIIIIlIIIIl, lIlllII[22]) && llIllIll(llllIIIIIlIIlII, llllIIIIIlIlIII)) {
               CharSequence var27 = (CharSequence)lIlIIlI[lIlllII[23]];
               boolean llllIIIIIIlllIl = Locale.ENGLISH;
               short llllIIIIIIllIll = var27;
               float llllIIIIIIlllII = lIlllII[2];
               if (llIllIlI(llllIIIIIllllIl)) {
                  throw new TypeCastException(lIlIIlI[lIlllII[20]]);
               }

               String var28 = llllIIIIIllllIl.toLowerCase(llllIIIIIIlllIl);
               Intrinsics.checkExpressionValueIsNotNull(var28, lIlIIlI[lIlllII[3]]);
               char llllIIIIIIllIlI = var28;
               short llllIIIIIIlllll = StringsKt.indexOf$default(llllIIIIIIllIll, llllIIIIIIllIlI.charAt(llllIIIIIlIIlII + lIlllII[0]), lIlllII[2], (boolean)lIlllII[2], lIlllII[23], (Object)null);
               if (!llIllIll(llllIIIIIIlllll, lIlllII[8])) {
                  if (lllIIlll(llllIIIIIIlllll, lIlllII[8])) {
                     llllIIIIIlIlIIl = lIlllII[0];
                     "".length();
                     if ("  ".length() == 0) {
                        return;
                     }
                  } else if (lllIIlll(llllIIIIIIlllll, lIlllII[25])) {
                     llllIIIIIlIllII = llllIIIIIllllll.ᴃᎲ;
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else if (lllIIlll(llllIIIIIIlllll, lIlllII[26])) {
                     llllIIIIIlIlIlI = lIlllII[0];
                     "".length();
                     if (((29 ^ 51) & ~(5 ^ 43)) != 0) {
                        return;
                     }
                  } else if (lllIIlll(llllIIIIIIlllll, lIlllII[27])) {
                     llllIIIIIlIlIll = lIlllII[0];
                     "".length();
                     if ((57 ^ 108 ^ 199 ^ 150) != (23 ^ 63 ^ 125 ^ 81)) {
                        return;
                     }
                  } else if (lllIIlll(llllIIIIIIlllll, lIlllII[28])) {
                     llllIIIIIlIllII = llllIIIIIllllll.〥ҳⱆ;
                     "".length();
                     if ("  ".length() == 0) {
                        return;
                     }
                  } else {
                     if (lllIIlll(llllIIIIIIlllll, lIlllII[29])) {
                        llllIIIIIlIlIIl = lIlllII[2];
                        llllIIIIIlIlIlI = lIlllII[2];
                        llllIIIIIlIlIll = lIlllII[2];
                        llllIIIIIlIllII = llllIIIIIllllll.u;
                        GL11.glColor4d(1.0D, 1.0D, 1.0D, 1.0D);
                        llllIIIIIllllll.Ꜥ = Color.white;
                     }

                     "".length();
                     if ((67 ^ 71) < -" ".length()) {
                        return;
                     }
                  }
               } else {
                  llllIIIIIlIlIIl = lIlllII[2];
                  llllIIIIIlIlIlI = lIlllII[2];
                  llllIIIIIlIlIll = lIlllII[2];
                  llllIIIIIlIllII = llllIIIIIllllll.u;
                  if (!lllIlIIl(llllIIIIIIlllll) || lllIlIlI(llllIIIIIIlllll, lIlllII[24])) {
                     llllIIIIIIlllll = lIlllII[24];
                  }

                  if (lllIIIIl(llllIIIIIllIlIl)) {
                     llllIIIIIIlllll += lIlllII[8];
                  }

                  char llllIIIIIIllllI = llllIIIIIllllll.Ἒⅾ[llllIIIIIIlllll];
                  llllIIIIIllllll.Ꜥ = new Color(llllIIIIIIllllI >> lIlllII[8], llllIIIIIIllllI >> lIlllII[3] & lIlllII[4], llllIIIIIIllllI & lIlllII[4], lIlllII[4]);
                  "".length();
                  if ("   ".length() <= "  ".length()) {
                     return;
                  }
               }
            } else if (lllIlIlI(llllIIIIIlIIIIl, lIlllII[4])) {
               "".length();
               if ((37 + 13 - 0 + 109 ^ 10 + 19 - -9 + 117) < 0) {
                  return;
               }
            } else {
               if (lllIIIIl(llllIIIIIlIlIIl)) {
                  llllIIIIIlIIIIl = (char)(llllIIIIIlIIIIl + lIlllII[0]);
               }

               llllIIIIIllllll.ⲋ(llllIIIIIlIIIIl, llllIIIIIlIllII, llllIIIIIllIIIl, llllIIIIIlIllll);
               short llllIIIIIIlllll = llllIIIIIlIllII[llllIIIIIlIIIIl];
               Vector2f var10001;
               if (lllIIIIl(llllIIIIIlIlIlI)) {
                  var10001 = new Vector2f;
                  if (llIllIlI(llllIIIIIIlllll)) {
                     Intrinsics.throwNpe();
                  }

                  var10001.<init>(0.0F, llllIIIIIIlllll.u() / 2.0F);
                  llllIIIIIllllll.ⲋ(var10001, new Vector2f(llllIIIIIIlllll.ĂƂ(), llllIIIIIIlllll.u() / 2.0F), 3.0F);
               }

               if (lllIIIIl(llllIIIIIlIlIll)) {
                  var10001 = new Vector2f;
                  if (llIllIlI(llllIIIIIIlllll)) {
                     Intrinsics.throwNpe();
                  }

                  var10001.<init>(0.0F, llllIIIIIIlllll.u() - (float)lIlllII[24]);
                  llllIIIIIllllll.ⲋ(var10001, new Vector2f(llllIIIIIIlllll.ĂƂ(), llllIIIIIIlllll.u() - (float)lIlllII[24]), 3.0F);
               }

               if (llIllIlI(llllIIIIIIlllll)) {
                  Intrinsics.throwNpe();
               }

               llllIIIIIllIIIl += llllIIIIIIlllll.ĂƂ() - (float)lIlllII[3];
            }

            ++llllIIIIIlIIlII;
            "".length();
         } while(" ".length() > -" ".length());

      }
   }

   @JvmName(
      name = "u"
   )
   public final int u() {
      return this.ς;
   }

   public void ⲋ(int var1, int var2, int var3, int var4, int var5, @NotNull String var6) {
      this.ⲋ(var6, (float)var1, (float)var2, lIlllII[39] | (var3 & lIlllII[4]) << lIlllII[8] | (var4 & lIlllII[4]) << lIlllII[3] | var5 & lIlllII[4], (boolean)lIlllII[2]);
   }

   @JvmName(
      name = "ⲋ"
   )
   public int ⲋ() {
      return (int)this.〥ҳⱆ(lIlIIlI[lIlllII[26]]);
   }

   public Ȋ(@NotNull Font var1, boolean var2) {
      this(var1, lIlllII[41], var2, (boolean)lIlllII[2], lIlllII[3], (DefaultConstructorMarker)null);
   }

   private static String llIIIllI(String lllIlllIlllIIll, String lllIlllIllIllIl) {
      lllIlllIlllIIll = new String(Base64.getDecoder().decode(lllIlllIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lllIlllIllIllII = new StringBuilder();
      char[] lllIlllIlllIIII = lllIlllIllIllIl.toCharArray();
      int lllIlllIllIllll = lIlllII[2];
      long lllIlllIllIlIIl = lllIlllIlllIIll.toCharArray();
      long lllIlllIllIlIII = lllIlllIllIlIIl.length;
      int lllIlllIllIIlll = lIlllII[2];

      do {
         if (!llIllIll(lllIlllIllIIlll, lllIlllIllIlIII)) {
            return String.valueOf(lllIlllIllIllII);
         }

         char lllIlllIlllIlII = lllIlllIllIlIIl[lllIlllIllIIlll];
         lllIlllIllIllII.append((char)(lllIlllIlllIlII ^ lllIlllIlllIIII[lllIlllIllIllll % lllIlllIlllIIII.length]));
         "".length();
         ++lllIlllIllIllll;
         ++lllIlllIllIIlll;
         "".length();
      } while(null == null);

      return null;
   }

   private static String lIllllIl(String lllIlllIlIlllII, String lllIlllIlIlllIl) {
      try {
         SecretKeySpec lllIlllIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllIlllIllIIIII = Cipher.getInstance("Blowfish");
         lllIlllIllIIIII.init(lIlllII[1], lllIlllIllIIIIl);
         return new String(lllIlllIllIIIII.doFinal(Base64.getDecoder().decode(lllIlllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lllIIlII(int var0) {
      return var0 == 0;
   }

   private static boolean lllIllII(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean llIllIll(int var0, int var1) {
      return var0 < var1;
   }

   @JvmOverloads
   public Ȋ(@NotNull Font var1, int var2, boolean var3) {
      this(var1, var2, var3, (boolean)lIlllII[2], lIlllII[3], (DefaultConstructorMarker)null);
   }

   private static boolean lllIllIl(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean lllIIIlI(Object var0) {
      return var0 != null;
   }

   public final float 〥ҳⱆ(@NotNull String lllIllllllIlIll) {
      float lllIllllllIlIlI = 0.0F;
      Ȋ.ⲋ[] lllIllllllIlIIl = lllIllllllIllII.u;
      int lllIllllllIlIII = lllIllllllIlIll.length();
      int lllIllllllIIlll = lIlllII[2];
      int lllIllllllIIllI = lllIllllllIlIII;

      do {
         if (!llIllIll(lllIllllllIIlll, lllIllllllIIllI)) {
            return lllIllllllIlIlI / (float)lIlllII[1] - (float)lIlllII[1];
         }

         byte lllIllllllIIlIl = lllIllllllIlIll.charAt(lllIllllllIIlll);
         int var10000;
         if (lllIIllI(lllIllllllIIlll)) {
            var10000 = lllIllllllIlIll.charAt(lllIllllllIIlll - lIlllII[0]);
            "".length();
            if ("   ".length() < "  ".length()) {
               return 0.0F;
            }
         } else {
            var10000 = lIlllII[21];
         }

         short lllIllllllIIlII = var10000;
         if (lllIIlll(lllIllllllIIlII, lIlllII[22])) {
            "".length();
            if ((63 ^ 58) <= 0) {
               return 0.0F;
            }
         } else if (lllIIlll(lllIllllllIIlIl, lIlllII[22]) && llIllIll(lllIllllllIIlll, lllIllllllIlIII)) {
            CharSequence var16 = (CharSequence)lIlIIlI[lIlllII[33]];
            String lllIllllllIIIIl = Locale.ENGLISH;
            Exception lllIlllllIlllll = var16;
            float lllIllllllIIIII = lIlllII[2];
            if (llIllIlI(lllIllllllIlIll)) {
               throw new TypeCastException(lIlIIlI[lIlllII[34]]);
            }

            String var17 = lllIllllllIlIll.toLowerCase(lllIllllllIIIIl);
            Intrinsics.checkExpressionValueIsNotNull(var17, lIlIIlI[lIlllII[24]]);
            String lllIlllllIllllI = var17;
            short lllIllllllIIIll = StringsKt.indexOf$default(lllIlllllIlllll, lllIlllllIllllI.charAt(lllIllllllIIlll + lIlllII[0]), lIlllII[2], (boolean)lIlllII[2], lIlllII[23], (Object)null);
            if (lllIIlll(lllIllllllIIIll, lIlllII[25])) {
               lllIllllllIlIIl = lllIllllllIllII.ᴃᎲ;
               "".length();
               if ("  ".length() <= ((108 ^ 83 ^ 37 ^ 47) & (34 + 103 - 28 + 26 ^ 158 + 106 - 246 + 160 ^ -" ".length()))) {
                  return 0.0F;
               }
            } else if (lllIIlll(lllIllllllIIIll, lIlllII[28])) {
               lllIllllllIlIIl = lllIllllllIllII.〥ҳⱆ;
               "".length();
               if ("   ".length() >= (2 ^ 6)) {
                  return 0.0F;
               }
            } else if (lllIIlll(lllIllllllIIIll, lIlllII[29])) {
               lllIllllllIlIIl = lllIllllllIllII.u;
               "".length();
               if (" ".length() == "  ".length()) {
                  return 0.0F;
               }
            }
         } else if (lllIlIlI(lllIllllllIIlIl, lIlllII[4])) {
            "".length();
            if (-" ".length() >= 0) {
               return 0.0F;
            }
         } else {
            short lllIllllllIIIll = lllIllllllIlIIl[lllIllllllIIlIl];
            if (llIllIlI(lllIllllllIIIll)) {
               Intrinsics.throwNpe();
            }

            lllIllllllIlIlI = Math.max(lllIllllllIlIlI, lllIllllllIIIll.u());
         }

         ++lllIllllllIIlll;
         "".length();
      } while("  ".length() != 0);

      return 0.0F;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(Color var1) {
      this.Ꜥ = var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final BufferedImage ĂƂ() {
      return this.ϛⰄ;
   }

   @JvmOverloads
   public Ȋ(@NotNull Font var1) {
      this(var1, lIlllII[2], (boolean)lIlllII[2], (boolean)lIlllII[2], lIlllII[34], (DefaultConstructorMarker)null);
   }

   static {
      llIllIIl();
      llIIlIlI();
      ᵴἥ = lIlllII[6];
      ɡ = lIlllII[0];
      Ɏ = (char)lIlllII[22];
      ĂƂ = new Ȋ.ĂƂ((DefaultConstructorMarker)null);
   }

   private final void ⲋ(char var1, Ȋ.ⲋ[] var2, float var3, float var4) {
      a.ᴃᎲ.u.ⲋ(lIlIIlI[lIlllII[8]]);
      Ȋ.ⲋ lllIlllllIIIllI = var2[var1];
      BufferedImage var10000 = lllIlllllIIlIll.ϛⰄ;
      float var18;
      if (lllIIIlI(var10000)) {
         var18 = (float)var10000.getWidth();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         "".length();
         var18 = 0.0F;
      }

      char lllIlllllIIIlIl = var18;
      var10000 = lllIlllllIIlIll.ϛⰄ;
      if (lllIIIlI(var10000)) {
         var18 = (float)var10000.getHeight();
         "".length();
         if (((46 ^ 16 ^ 107 ^ 31) & (77 ^ 29 ^ 107 ^ 113 ^ -" ".length())) != 0) {
            return;
         }
      } else {
         "".length();
         var18 = 0.0F;
      }

      byte lllIlllllIIIlII = var18;
      if (llIllIlI(lllIlllllIIIllI)) {
         Intrinsics.throwNpe();
      }

      float var8 = lllIlllllIIIllI.ᴃᎲ() / lllIlllllIIIlIl;
      float var9 = lllIlllllIIIllI.〥ҳⱆ() / lllIlllllIIIlII;
      float var10 = lllIlllllIIIllI.ĂƂ() / lllIlllllIIIlIl;
      float var11 = lllIlllllIIIllI.u() / lllIlllllIIIlII;
      int var13 = lIlllII[2];
      int var14 = lIlllII[2];
      Ȋ var15 = (Ȋ)lllIlllllIIlIll;
      int var16 = lIlllII[2];
      BufferBuilder var17 = Tessellator.func_178181_a().func_178180_c();
      var17.func_181662_b((double)var3, (double)var4, 0.0D).func_187315_a((double)var8, (double)var9).func_181669_b(var15.Ꜥ.getRed(), var15.Ꜥ.getGreen(), var15.Ꜥ.getBlue(), var15.Ꜥ.getAlpha()).func_181675_d();
      var17.func_181662_b((double)var3, (double)var4 + (double)lllIlllllIIIllI.u(), 0.0D).func_187315_a((double)var8, (double)var9 + (double)var11).func_181669_b(var15.Ꜥ.getRed(), var15.Ꜥ.getGreen(), var15.Ꜥ.getBlue(), var15.Ꜥ.getAlpha()).func_181675_d();
      var17.func_181662_b((double)var3 + (double)lllIlllllIIIllI.ĂƂ(), (double)var4 + (double)lllIlllllIIIllI.u(), 0.0D).func_187315_a((double)var8 + (double)var10, (double)var9 + (double)var11).func_181669_b(var15.Ꜥ.getRed(), var15.Ꜥ.getGreen(), var15.Ꜥ.getBlue(), var15.Ꜥ.getAlpha()).func_181675_d();
      var17.func_181662_b((double)var3 + (double)lllIlllllIIIllI.ĂƂ(), (double)var4, 0.0D).func_187315_a((double)var8 + (double)var10, (double)var9).func_181669_b(var15.Ꜥ.getRed(), var15.Ꜥ.getGreen(), var15.Ꜥ.getBlue(), var15.Ꜥ.getAlpha()).func_181675_d();
      a.ᴃᎲ.u.ĂƂ(lIlIIlI[lIlllII[25]]);
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final Color ᴃᎲ() {
      return this.Ꜥ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable BufferedImage var1) {
      this.ϛⰄ = var1;
   }

   @NotNull
   public ė u(@NotNull String var1) {
      return new ė(this.ĂƂ(var1), this.ⲋ(var1));
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\b\u0001\u0018\u00002\u00020\u0014B'\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0086\u0004R\u001d\u0010\t\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u0086\u0004R\u001d\u0010\u0006\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0086\u0004R\u001d\u0010\u000b\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\t\u0010\b¨\u0006\u0086\u0004"},
      d2 = {"La/Ȋ$u;", "", "ⲋ", "C", "()C", "", "u", "F", "()F", "ĂƂ", "Ljava/awt/image/BufferedImage;", "ᴃᎲ", "Ljava/awt/image/BufferedImage;", "()Ljava/awt/image/BufferedImage;", "p0", "p1", "p2", "p3", "<init>", "(CFFLjava/awt/image/BufferedImage;)V", ""}
   )
   public static final class u {
      @JvmName(
         name = "u"
      )
      public final float u() {
         return this.u;
      }

      public u(char var1, float var2, float var3, @NotNull BufferedImage var4) {
         this.ⲋ = var1;
         this.ĂƂ = var2;
         this.u = var3;
         this.ᴃᎲ = var4;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final char ⲋ() {
         return this.ⲋ;
      }

      @JvmName(
         name = "ᴃᎲ"
      )
      public final BufferedImage ᴃᎲ() {
         return this.ᴃᎲ;
      }

      @JvmName(
         name = "ĂƂ"
      )
      public final float ĂƂ() {
         return this.ĂƂ;
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\b\u0087\u0003\u0018\u00002\u00020\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0082TR\u001a\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0082TR\u001a\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u0082T"},
      d2 = {"La/Ȋ$ĂƂ;", "", "Ɏ", "C", "ⲋ", "", "ᵴἥ", "I", "ĂƂ", "ɡ", "u", "<init>", "()V", ""}
   )
   public static final class ĂƂ {
      private ĂƂ() {
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\b\u0081\u0004\u0018\u00002\u00020\u0014B/\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004R\u001d\u0010\u0002\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0086\u0004R\u001d\u0010\t\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0002\u0010\n¨\u0006\u0086\u0004R\u001d\u0010\u0007\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u0086\u0004R\u001d\u0010\u000b\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\u0086\u0004"},
      d2 = {"La/Ȋ$ⲋ;", "", "ĂƂ", "C", "ⲋ", "()C", "", "ᴃᎲ", "F", "u", "()F", "〥ҳⱆ", "Ἒⅾ", "p0", "p1", "p2", "p3", "p4", "<init>", "(La/Ȋ;CFFFF)V", ""}
   )
   public final class ⲋ {
      @JvmName(
         name = "ĂƂ"
      )
      public final float ĂƂ() {
         return this.u;
      }

      @JvmName(
         name = "u"
      )
      public final float u() {
         return this.ᴃᎲ;
      }

      public ⲋ(char var2, float var3, float var4, float var5, float var6) {
         this.ĂƂ = var2;
         this.u = var3;
         this.ᴃᎲ = var4;
         this.〥ҳⱆ = var5;
         this.Ἒⅾ = var6;
      }

      @JvmName(
         name = "ⲋ"
      )
      public final char ⲋ() {
         return this.ĂƂ;
      }

      @JvmName(
         name = "〥ҳⱆ"
      )
      public final float 〥ҳⱆ() {
         return this.Ἒⅾ;
      }

      @JvmName(
         name = "ᴃᎲ"
      )
      public final float ᴃᎲ() {
         return this.〥ҳⱆ;
      }
   }
}
