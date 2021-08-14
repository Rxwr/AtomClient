package a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent.Post;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020$B\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0004\u0010\u001dJ\u0017\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u0004\u0010\u001fJ\u0017\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020 H\u0007¢\u0006\u0004\b\u0004\u0010!R\"\u0010\u0004\u001a\u00020\u00018G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0084\u0002R\u001a\u0010\u0002\u001a\u00020\u00068W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0096\u0004R&\u0010\f\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u0004\u0010\u000e¨\u0006\u0086\u000eR&\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u0002\u0010\u000e¨\u0006\u0086\u000eR&\u0010\u000f\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u0004\b\f\u0010\u000e¨\u0006\u0086\u000eR&\u0010\u0010\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\n\u0010\u000e¨\u0006\u0086\u000eR&\u0010\u0011\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0011\u0010\u000e¨\u0006\u0086\u000eR&\u0010\u0015\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0015\u0010\u000e¨\u0006\u0086\u000eR&\u0010\u0013\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0013\u0010\u000e¨\u0006\u0086\u000eR&\u0010\u0012\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u000f\u0010\u000e¨\u0006\u0086\u000eR&\u0010\u0014\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0010\u0010\u000e¨\u0006\u0086\u000eR\"\u0010\u0016\u001a\u00020\u00188G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b\u0002\u0010\u0019¨\u0006\u0086\u0084\u0002"},
   d2 = {"La/ʀñ;", "", "ĂƂ", "La/ⅹ;", "ⲋ", "()D", "", "ƶ", "()Ljava/lang/String;", "", "ᴃᎲ", "F", "u", "()F", "(F)V", "〥ҳⱆ", "Ἒⅾ", "ϛⰄ", "ⲡ", "Ꜥ", "Đ", "ς", "ᵴἥ", "ⱛṧ", "", "()Z", "La/Ꮐ꯴;", "p0", "", "(La/Ꮐ꯴;)V", "Lnet/minecraftforge/client/event/RenderPlayerEvent$Post;", "(Lnet/minecraftforge/client/event/RenderPlayerEvent$Post;)V", "Lnet/minecraftforge/client/event/RenderPlayerEvent$Pre;", "(Lnet/minecraftforge/client/event/RenderPlayerEvent$Pre;)V", "<init>", "()V", "La/ⳅ;"}
)
public final class ʀñ extends ⳅ {
   @JvmName(
      name = "ς"
   )
   public final void ς(float var1) {
      this.Đ = var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(float var1) {
      this.〥ҳⱆ = var1;
   }

   @ȵ
   public final void ⲋ(@NotNull Post var1) {
      if (lllIIIlllI(Intrinsics.areEqual((Object)var1.getEntityPlayer(), (Object)llIIIIlIlIlIIIl.ɡ().field_71439_g))) {
         ơ߀ var3 = ơ߀.ⲋ;
         Class var4 = ȴ.class;
         int var5 = llIllIlII[1];
         Object var10000 = var3.ⲋ().get(ȴ.class);
         if (lllIIIllll(var10000)) {
            throw new TypeCastException(llIlIllII[llIllIlII[5]]);
         }

         short llIIIIlIlIIllll = ((ȴ)((ⳅ)((ȴ)var10000))).Ɏ();
         if (lllIIIlllI(llIIIIlIlIlIIIl.ĂƂ()) && lllIIIlllI(llIIIIlIlIIllll)) {
            llIIIIlIlIlIIIl.ɡ().field_71439_g.field_70125_A = llIIIIlIlIlIIIl.ϛⰄ;
            llIIIIlIlIlIIIl.ɡ().field_71439_g.field_70177_z = llIIIIlIlIlIIIl.ς;
            llIIIIlIlIlIIIl.ɡ().field_71439_g.field_70759_as = llIIIIlIlIlIIIl.Ꜥ;
            llIIIIlIlIlIIIl.ɡ().field_71439_g.field_70127_C = llIIIIlIlIlIIIl.ⲡ;
            llIIIIlIlIlIIIl.ɡ().field_71439_g.field_70126_B = llIIIIlIlIlIIIl.Đ;
            llIIIIlIlIlIIIl.ɡ().field_71439_g.field_70758_at = llIIIIlIlIlIIIl.ᵴἥ;
         }
      }

   }

   @JvmName(
      name = "ⲡ"
   )
   public final float ⲡ() {
      return this.Đ;
   }

   private static boolean lllIIIllll(Object var0) {
      return var0 == null;
   }

   @ȵ(
      ⲋ = -10000
   )
   public final void ⲋ(@NotNull Ꮐ꯴ var1) {
      if (lllIIIlllI(var1.ᴃᎲ() instanceof CPacketPlayer)) {
         this.ᴃᎲ = ((CPacketPlayer)var1.ᴃᎲ()).field_149473_f;
         this.〥ҳⱆ = ((CPacketPlayer)var1.ᴃᎲ()).field_149476_e;
         this.Ἒⅾ = ((CPacketPlayer)var1.ᴃᎲ()).field_149476_e;
      }

   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final float ᴃᎲ() {
      return this.〥ҳⱆ;
   }

   private static String llIlllIlll(String llIIIIlIlIIIIlI, String llIIIIlIlIIIIIl) {
      try {
         SecretKeySpec llIIIIlIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), llIllIlII[8]), "DES");
         Cipher llIIIIlIlIIIllI = Cipher.getInstance("DES");
         llIIIIlIlIIIllI.init(llIllIlII[0], llIIIIlIlIIIlll);
         return new String(llIIIIlIlIIIllI.doFinal(Base64.getDecoder().decode(llIIIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(float var1) {
      this.ᴃᎲ = var1;
   }

   static {
      lllIIIllIl();
      llIllllllI();
      KProperty[] var10000 = new KProperty[llIllIlII[0]];
      var10000[llIllIlII[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ʀñ.class), llIlIllII[llIllIlII[1]], llIlIllII[llIllIlII[2]]));
      var10000[llIllIlII[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ʀñ.class), llIlIllII[llIllIlII[0]], llIlIllII[llIllIlII[3]]));
      ⲋ = var10000;
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      StringCompanionObject var1 = StringCompanionObject.INSTANCE;
      String var2 = llIlIllII[llIllIlII[6]];
      Object[] var10000 = new Object[llIllIlII[2]];
      var10000[llIllIlII[1]] = this.ⲋ();
      Object[] var3 = var10000;
      int var4 = llIllIlII[1];
      String var5 = String.format(var2, Arrays.copyOf(var3, var3.length));
      Intrinsics.checkExpressionValueIsNotNull(var5, llIlIllII[llIllIlII[7]]);
      return var5;
   }

   private static boolean lllIIlIIII(int var0, int var1) {
      return var0 < var1;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final void Ἒⅾ(float var1) {
      this.Ꜥ = var1;
   }

   private static void lllIIIllIl() {
      llIllIlII = new int[14];
      llIllIlII[0] = "  ".length();
      llIllIlII[1] = (75 ^ 93) & ~(124 ^ 106);
      llIllIlII[2] = " ".length();
      llIllIlII[3] = "   ".length();
      llIllIlII[4] = 0 + 128 - 34 + 36 ^ 127 + 47 - 151 + 111;
      llIllIlII[5] = 133 ^ 139 ^ 93 ^ 86;
      llIllIlII[6] = 39 ^ 33;
      llIllIlII[7] = 199 ^ 192;
      llIllIlII[8] = 203 ^ 195;
      llIllIlII[9] = 110 + 88 - 157 + 102 ^ 34 + 61 - 55 + 94;
      llIllIlII[10] = 96 ^ 88;
      llIllIlII[11] = 33 ^ 48 ^ 84 ^ 79;
      llIllIlII[12] = 12 ^ 7;
      llIllIlII[13] = 159 ^ 147;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final float 〥ҳⱆ() {
      return this.Ἒⅾ;
   }

   @JvmName(
      name = "u"
   )
   public final float u() {
      return this.ᴃᎲ;
   }

   @JvmName(
      name = "u"
   )
   public final void u(float var1) {
      this.Ἒⅾ = var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final boolean ĂƂ() {
      return (Boolean)this.u.ⲋ(this, ⲋ[llIllIlII[2]]);
   }

   private static String llIllllIII(String llIIIIlIIllIlII, String llIIIIlIIllIIll) {
      llIIIIlIIllIlII = new String(Base64.getDecoder().decode(llIIIIlIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      float llIIIIlIIlIllIl = new StringBuilder();
      char[] llIIIIlIIllIIIl = llIIIIlIIllIIll.toCharArray();
      int llIIIIlIIllIIII = llIllIlII[1];
      char llIIIIlIIlIlIlI = llIIIIlIIllIlII.toCharArray();
      byte llIIIIlIIlIlIIl = llIIIIlIIlIlIlI.length;
      int llIIIIlIIlIlIII = llIllIlII[1];

      do {
         if (!lllIIlIIII(llIIIIlIIlIlIII, llIIIIlIIlIlIIl)) {
            return String.valueOf(llIIIIlIIlIllIl);
         }

         String llIIIIlIIlIIlll = llIIIIlIIlIlIlI[llIIIIlIIlIlIII];
         llIIIIlIIlIllIl.append((char)(llIIIIlIIlIIlll ^ llIIIIlIIllIIIl[llIIIIlIIllIIII % llIIIIlIIllIIIl.length]));
         "".length();
         ++llIIIIlIIllIIII;
         ++llIIIIlIIlIlIII;
         "".length();
      } while(((253 ^ 138 ^ 31 ^ 8) & (69 ^ 56 ^ 51 ^ 46 ^ -" ".length())) <= 0);

      return null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final void 〥ҳⱆ(float var1) {
      this.ς = var1;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final void ᴃᎲ(float var1) {
      this.ϛⰄ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final double ⲋ() {
      return ((Number)this.ĂƂ.ⲋ(this, ⲋ[llIllIlII[1]])).doubleValue();
   }

   @JvmName(
      name = "ⱛṧ"
   )
   public final float ⱛṧ() {
      return this.ᵴἥ;
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final float Ꜥ() {
      return this.ⲡ;
   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final float Ἒⅾ() {
      return this.ϛⰄ;
   }

   @JvmName(
      name = "ς"
   )
   public final float ς() {
      return this.Ꜥ;
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final void ϛⰄ(float var1) {
      this.ⲡ = var1;
   }

   private static boolean lllIIIlllI(int var0) {
      return var0 != 0;
   }

   private static String llIllllIIl(String llIIIIlIIIlllll, String llIIIIlIIIlllII) {
      try {
         SecretKeySpec llIIIIlIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher llIIIIlIIlIIIIl = Cipher.getInstance("Blowfish");
         llIIIIlIIlIIIIl.init(llIllIlII[0], llIIIIlIIlIIIlI);
         return new String(llIIIIlIIlIIIIl.doFinal(Base64.getDecoder().decode(llIIIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final void Ꜥ(float var1) {
      this.ᵴἥ = var1;
   }

   @ȵ
   public final void ⲋ(@NotNull Pre var1) {
      if (lllIIIlllI(Intrinsics.areEqual((Object)var1.getEntityPlayer(), (Object)llIIIIlIlIlllIl.ɡ().field_71439_g))) {
         ơ߀ var3 = ơ߀.ⲋ;
         Class var4 = ȴ.class;
         int var5 = llIllIlII[1];
         Object var10000 = var3.ⲋ().get(ȴ.class);
         if (lllIIIllll(var10000)) {
            throw new TypeCastException(llIlIllII[llIllIlII[4]]);
         }

         String llIIIIlIlIllIll = ((ȴ)((ⳅ)((ȴ)var10000))).Ɏ();
         if (lllIIIlllI(llIIIIlIlIlllIl.ĂƂ()) && lllIIIlllI(llIIIIlIlIllIll)) {
            llIIIIlIlIlllIl.ϛⰄ = llIIIIlIlIlllIl.ɡ().field_71439_g.field_70125_A;
            llIIIIlIlIlllIl.ς = llIIIIlIlIlllIl.ɡ().field_71439_g.field_70177_z;
            llIIIIlIlIlllIl.Ꜥ = llIIIIlIlIlllIl.ɡ().field_71439_g.field_70759_as;
            llIIIIlIlIlllIl.ⲡ = llIIIIlIlIlllIl.ɡ().field_71439_g.field_70127_C;
            llIIIIlIlIlllIl.Đ = llIIIIlIlIlllIl.ɡ().field_71439_g.field_70126_B;
            llIIIIlIlIlllIl.ᵴἥ = llIIIIlIlIlllIl.ɡ().field_71439_g.field_70758_at;
            llIIIIlIlIlllIl.ɡ().field_71439_g.field_70127_C = llIIIIlIlIlllIl.ᴃᎲ;
            llIIIIlIlIlllIl.ɡ().field_71439_g.field_70126_B = llIIIIlIlIlllIl.〥ҳⱆ;
            llIIIIlIlIlllIl.ɡ().field_71439_g.field_70758_at = llIIIIlIlIlllIl.〥ҳⱆ;
            llIIIIlIlIlllIl.ɡ().field_71439_g.field_70125_A = llIIIIlIlIlllIl.ᴃᎲ;
            llIIIIlIlIlllIl.ɡ().field_71439_g.field_70177_z = llIIIIlIlIlllIl.〥ҳⱆ;
            llIIIIlIlIlllIl.ɡ().field_71439_g.field_70759_as = llIIIIlIlIlllIl.Ἒⅾ;
         }
      }

   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final float ϛⰄ() {
      return this.ς;
   }

   private static void llIllllllI() {
      llIlIllII = new String[llIllIlII[13]];
      llIlIllII[llIllIlII[1]] = llIlllIlll("i+zU5HhXW1RwPsHrZGsKdg==", "MLWoN");
      llIlIllII[llIllIlII[2]] = llIllllIII("MzYtHQwnJzg3BjF7cB0=", "TSYYe");
      llIlIllII[llIllIlII[0]] = llIllllIIl("dXAI+pQV26i3Y3lf0vUoog==", "kmhTl");
      llIlIllII[llIllIlII[3]] = llIlllIlll("Bm5293sj5XwYHqI4T3tb6vM9QOPvYj5w", "hnqzO");
      llIlIllII[llIllIlII[4]] = llIllllIII("Fyw8NHQaOD42Ow15Mj10GjgjLHQNNnA2Oxd0Pi04FXkkISQceT09ehcsMzQxDCp+KCYWLT82ehQ2NC04HCp+OzsUOzEsejgwPTo7DQ==", "yYPXT");
      llIlIllII[llIllIlII[5]] = llIlllIlll("qbA7jLNXUryit+1q/fKEVjpblIZq368Z9JPJYDSQTsOduIil97v3+30lOnvkYWa9Ih6qtlhvfALKClGHGDrddZ+sHZatgsN/PxTw/Hyd/84=", "bJKyP");
      llIlIllII[llIllIlII[6]] = llIlllIlll("idymfn2oHaE=", "EPaEb");
      llIlIllII[llIllIlII[7]] = llIlllIlll("Qhkowm3j8zs=", "yXQdC");
      llIlIllII[llIllIlII[8]] = llIllllIII("Ah8fKwoGEgQqATg=", "VwvYn");
      llIlIllII[llIllIlII[9]] = llIllllIII("NRgELzsRAhgsIVYEBSQ3VgMCIDwRBEo7NxoWHiw2VgMFaSYeEko9Oh8FDjk3BAQFJ3IbGA4sfA==", "vwjIR");
      llIlIllII[llIllIlII[11]] = llIlllIlll("b+QK6UBat7rxyrlCqcU8vg==", "qSkWm");
      llIlIllII[llIllIlII[12]] = llIlllIlll("ZEHMzJ7u4JLGyNfkjJQHdpj6e3D8D1Ot", "tIlIC");
   }

   public ʀñ() {
      super(llIlIllII[llIllIlII[8]], llIlIllII[llIllIlII[9]], ı５.〥ҳⱆ, llIllIlII[1], (boolean)llIllIlII[1], (boolean)llIllIlII[1], llIllIlII[10], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIlIllII[llIllIlII[11]], 4.0D).u((Object)0.0D).ᴃᎲ((Object)20.0D);
      this.u = this.ⲋ(llIlIllII[llIllIlII[12]], Boolean.valueOf((boolean)llIllIlII[2]));
   }
}
