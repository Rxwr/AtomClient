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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020N:\u0002\u0006\nB\u0007¢\u0006\u0004\bM\u0010CJ\u000f\u0010\u001a\u001a\u00020BH\u0014¢\u0006\u0004\b\u001a\u0010CJ\u000f\u0010\"\u001a\u00020BH\u0014¢\u0006\u0004\b\"\u0010CJ\u0017\u0010\u0006\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\b\u0006\u0010FJ\u0017\u0010\n\u001a\u00020B2\u0006\u0010E\u001a\u00020GH\u0007¢\u0006\u0004\b\n\u0010HJ\u0017\u0010\u0006\u001a\u00020B2\u0006\u0010E\u001a\u00020GH\u0007¢\u0006\u0004\b\u0006\u0010HJ\u0017\u0010\u0006\u001a\u00020B2\u0006\u0010E\u001a\u00020IH\u0007¢\u0006\u0004\b\u0006\u0010JJ\u000f\u0010\b\u001a\u00020BH\u0016¢\u0006\u0004\b\b\u0010CJ\u0017\u0010\n\u001a\u00020B2\u0006\u0010E\u001a\u00020KH\u0007¢\u0006\u0004\b\n\u0010LJ\u0017\u0010\u0006\u001a\u00020B2\u0006\u0010E\u001a\u00020KH\u0007¢\u0006\u0004\b\u0006\u0010LR\"\u0010\u0006\u001a\u00020\u00018C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0082\u0084\u0002R\u001a\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0082\u000eR\u001a\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0082\u000eR\"\u0010\u0011\u001a\u00020\r8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0082\u0084\u0002R\u001a\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u0082\u000eR\"\u0010\u0015\u001a\u00020\r8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0082\u0084\u0002R&\u0010\u0019\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0002\u0010\u0017\"\u0004\b\n\u0010\u0018¨\u0006\u0086\u000eR\u001a\u0010\u0002\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\t¨\u0006\u0082\u000eR\"\u0010\u001c\u001a\u00020\r8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u0082\u0084\u0002R&\u0010\u001e\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u0006\u0010\u0018¨\u0006\u0086\u000eR\u001a\u0010\"\u001a\u00020\u001f8W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\u0096\u0004R\"\u0010$\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0003\u001a\u0004\b#\u0010\u0017¨\u0006\u0082\u0084\u0002R\"\u0010&\u001a\u00020\r8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0003\u001a\u0004\b%\u0010\u0010¨\u0006\u0082\u0084\u0002R&\u0010(\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\f\u0010\u0018¨\u0006\u0086\u000eR\u001a\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\t¨\u0006\u0082\u000eR\"\u0010-\u001a\u00020+8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u001e\u0010,¨\u0006\u0082\u0084\u0002R\u001a\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u0006\u0082\u000eR\"\u0010\u000e\u001a\u0002028G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0006\u00103¨\u0006\u0086\u0084\u0002R\u001a\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\t¨\u0006\u0082\u000eR\"\u00106\u001a\u00020\r8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0003\u001a\u0004\b\n\u0010\u0010¨\u0006\u0086\u0084\u0002R\u0017\u0010\u001d\u001a\u00020\u00078G@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0086\u0004R\"\u0010\u0016\u001a\u00020\r8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0003\u001a\u0004\b7\u0010\u0010¨\u0006\u0082\u0084\u0002R&\u0010\u001a\u001a\u00020.8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b\u0013\u00108\"\u0004\b\u0006\u00109¨\u0006\u0086\u000eR\"\u0010\b\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0003\u001a\u0004\b:\u0010\u0017¨\u0006\u0082\u0084\u0002R \u0010)\u001a\u00020\u00018\u0007@\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010;\u001a\u0004\b\f\u0010\u0005¨\u0006\u0086DR\"\u00104\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0003\u001a\u0004\b<\u0010\u0017¨\u0006\u0082\u0084\u0002R\"\u0010\u0012\u001a\u00020\r8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0003\u001a\u0004\b=\u0010\u0010¨\u0006\u0082\u0084\u0002R&\u0010 \u001a\u00020.8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b\u0015\u00108\"\u0004\b\n\u00109¨\u0006\u0086\u000eR\"\u0010'\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0003\u001a\u0004\b>\u0010\u0017¨\u0006\u0082\u0084\u0002R\"\u0010/\u001a\u00020\r8C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0003\u001a\u0004\b?\u0010\u0010¨\u0006\u0082\u0084\u0002R\u001a\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\t¨\u0006\u0082\u000eR\"\u0010A\u001a\u00020\u00078C@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0003\u001a\u0004\b@\u0010\u0017¨\u0006\u0082\u0084\u0002"},
   d2 = {"La/ĳ;", "", "ς", "La/ⅹ;", "Ⱬ", "()I", "ⲋ", "", "Ἠ", "Z", "ĂƂ", "Ｆ", "u", "", "Ꙗ", "ơ߀", "()D", "ᴃᎲ", "ἶṗ", "〥ҳⱆ", "Ӄ", "Ἒⅾ", "ɧῙ", "()Z", "(Z)V", "ϛⰄ", "ʅ", "ᶐ", "Ꜥ", "ꙑứ", "ⲡ", "", "ƶ", "()Ljava/lang/String;", "Đ", "Ἒ", "ᵴἥ", "ꝱᶁ", "Ɏ", "ȵ", "ɡ", "ƺ", "ⴜ", "La/ĳ$ⲋ;", "()La/ĳ$ⲋ;", "ͷ", "", "Ѿ", "F", "Ⳓ", "La/ĳ$ĂƂ;", "()La/ĳ$ĂƂ;", "ɻ", "Ꞑ", "ⱯꝣѺ", "ⱛṧ", "()F", "(F)V", "ı５", "I", "Թ", "ⳅ", "ᾥ", "ἒű", "Ꮐ꯴", "öỴʘѷ", "", "()V", "La/ἒű;", "p0", "(La/ἒű;)V", "La/ᶐ;", "(La/ᶐ;)V", "La/Ꮐ꯴;", "(La/Ꮐ꯴;)V", "La/ᾥ;", "(La/ᾥ;)V", "<init>", "La/ⳅ;"}
)
public final class ĳ extends ⳅ {
   public void Ἠ() {
      ơ߀ var2 = ơ߀.ⲋ;
      Class var3 = ⱳ.class;
      int var4 = llIlllIll[1];
      Object var10000 = var2.ⲋ().get(ⱳ.class);
      if (lllIlIllIl(var10000)) {
         throw new TypeCastException(llIllIlIl[llIlllIll[33]]);
      } else {
         double lIllllllIllIIIl = (ⱳ)((ⳅ)((ⱳ)var10000));
         lIllllllIllIIll.ꙑứ = lIllllllIllIIll.ɡ().field_71474_y.field_74314_A.func_151470_d();
         float var22;
         if (lllIlIllII(lIllllllIllIIll.ꙑứ)) {
            var22 = -((float)lIllllllIllIIll.Ⱬ());
            "".length();
            if ("   ".length() < "  ".length()) {
               return;
            }
         } else {
            var22 = 0.0F;
         }

         double lIllllllIllIIII = var22;
         if (lllIllIlIl(lllIlIllll(lIllllllIllIIII, 0.0F))) {
            lIllllllIllIIll.Ꞑ = 0.0F;
            lIllllllIllIIll.ⱯꝣѺ = 0.0F;
            "".length();
            if (-" ".length() == "   ".length()) {
               return;
            }
         } else if (lllIllIllI(lIllllllIllIIll.ⲋ(), ĳ.ĂƂ.ĂƂ)) {
            lIllllllIllIIll.Ꞑ = lIllllllIllIIll.ⱯꝣѺ;
            lIllllllIllIIll.ⱯꝣѺ = lIllllllIllIIII;
            "".length();
            if (null != null) {
               return;
            }
         } else if (lllIlIllII(lllIlIllll(lIllllllIllIIII, lIllllllIllIIll.ⱯꝣѺ))) {
            lIllllllIllIIll.Ꞑ = Random.Default.nextFloat() * 5.0F + 5.0F;
            lIllllllIllIIll.ⱯꝣѺ = lIllllllIllIIII;
            lIllllllIllIIll.ɡ().field_71439_g.field_71174_a.func_147297_a((Packet)(new Rotation(lIllllllIllIIll.ɡ().field_71439_g.field_70177_z, lIllllllIllIIll.Ꞑ, (boolean)llIlllIll[1])));
         }

         if (!lllIllIlIl(ῷ.ĂƂ(lIllllllIllIIll.ɡ().field_71439_g))) {
            if (lllIllIllI(lIllllllIllIIll.ⲡ(), ĳ.ⲋ.ĂƂ)) {
               lIllllllIllIIll.ɡ().field_71439_g.field_71075_bZ.func_75092_a((float)lIllllllIllIIll.ơ߀());
               "".length();
               if ((96 ^ 100) < 0) {
                  return;
               }
            } else if (lllIllIllI(lIllllllIllIIll.ⲡ(), ĳ.ⲋ.ⲋ)) {
               if (lllIllIlIl(lIllllllIllIIll.ɡ().field_71439_g.func_184613_cA()) && lllIllIlIl(lIllllllIllIIll.ɡ().field_71439_g.field_70122_E) && lllIlIllII(lIllllllIllIIll.ı５()) && lllIlIllII(lIllllllIllIIll.ⲋ(lIllllllIllIIll.ⴜ))) {
                  NetHandlerPlayClient var23 = lIllllllIllIIll.ɡ().func_147114_u();
                  if (lllIllIlll(var23)) {
                     var23.func_147297_a((Packet)(new CPacketEntityAction((Entity)lIllllllIllIIll.ɡ().field_71439_g, Action.START_FALL_FLYING)));
                     "".length();
                     if (((157 ^ 199) & ~(8 ^ 82)) <= -" ".length()) {
                        return;
                     }
                  } else {
                     "".length();
                  }
               }

               if (lllIllIlIl(lIllllllIllIIll.ɡ().field_71439_g.func_184613_cA())) {
                  if (lllIlIllII(lIllllllIllIIll.Թ()) && lllIllIlIl(lIllllllIllIIll.ɡ().field_71439_g.field_70122_E)) {
                     if (lllIllIlIl(lIllllllIllIIIl.Ɏ())) {
                        lIllllllIllIIIl.ⱯꝣѺ();
                     }

                     lIllllllIllIIIl.ⲋ(lIllllllIllIIll.ⳅ());
                     lIllllllIllIIll.ɧῙ = (boolean)llIlllIll[2];
                  }

                  if (lllIllIlIl(lIllllllIllIIll.Թ()) && lllIlIllII(lIllllllIllIIll.ɧῙ)) {
                     lIllllllIllIIIl.ꙑứ();
                     lIllllllIllIIll.ɧῙ = (boolean)llIlllIll[1];
                  }

                  return;
               }

               if (lllIllIllI(lIllllllIllIIll.ⲋ(), ĳ.ĂƂ.ⲋ) && lllIlIllII(lllIlIllll(lIllllllIllIIll.Ꞑ, lIllllllIllIIll.ⱯꝣѺ))) {
                  lIllllllIllIIll.Ꞑ += lIllllllIllIIll.ⱯꝣѺ * Random.Default.nextFloat() * (float)lIllllllIllIIll.ĂƂ();
                  if (lllIlllIII(lllIlIllll(lIllllllIllIIll.Ꞑ, lIllllllIllIIll.ⱯꝣѺ))) {
                     lIllllllIllIIll.Ꞑ = lIllllllIllIIll.ⱯꝣѺ;
                  }
               }

               int var24;
               if (lllIlIllII(lIllllllIllIIll.Ꮐ꯴()) && (!lllIlIllII(lIllllllIllIIll.ᾥ()) || lllIlIllII(lIllllllIllIIll.ᾥ()) && lllIlIllII(lIllllllIllIIll.ɡ().field_71439_g.func_70051_ag()))) {
                  var24 = llIlllIll[2];
                  "".length();
                  if ("  ".length() >= (40 ^ 38 ^ 156 ^ 150)) {
                     return;
                  }
               } else {
                  var24 = llIlllIll[1];
               }

               long lIllllllIlIllll = var24;
               if (lllIlIllII(lIllllllIllIIll.ɧῙ) && lllIllIlIl(lIllllllIlIllll)) {
                  lIllllllIllIIIl.ꙑứ();
                  lIllllllIllIIll.ɧῙ = (boolean)llIlllIll[1];
               }

               if (lllIlIllII(lIllllllIlIllll)) {
                  if (lllIllIlIl(lIllllllIllIIll.ɧῙ)) {
                     if (lllIllIlIl(lIllllllIllIIIl.Ɏ())) {
                        lIllllllIllIIIl.ⱯꝣѺ();
                     }

                     lIllllllIllIIll.ɧῙ = (boolean)llIlllIll[2];
                  }

                  lIllllllIllIIIl.ⲋ(lIllllllIllIIll.ἒű());
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.ɧῙ)) {
                  lIllllllIllIIIl.ꙑứ();
               }

               if (lllIlIllII(lIllllllIllIIll.ꙑứ)) {
                  if (lllIlllIII(lllIllIIIl(lIllllllIllIIll.ɡ().field_71439_g.field_70181_x, 0.0D))) {
                     lIllllllIllIIll.ɡ().field_71439_g.field_70181_x = 0.0D;
                  }

                  return;
               }

               short lIllllllIlIlllI = (float)Math.toRadians((double)lIllllllIllIIll.ɡ().field_71439_g.field_70177_z);
               byte lIllllllIlIllIl = lIllllllIllIIll.ⱛṧ();
               byte lIllllllIlIllII = lIllllllIllIIll.ᶐ() / 100.0D;
               if (lllIlIllII(lIllllllIllIIll.ἶṗ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70181_x = -lIllllllIllIIll.Ӄ();
                  double lIllllllIlIlIlI = lIllllllIlIllIl * lIllllllIlIllIl + lIllllllIllIIll.Ӄ() * lIllllllIllIIll.Ӄ();
                  char lIllllllIlIlIIl = llIlllIll[1];
                  int lIllllllIllIIlI = Math.sqrt(lIllllllIlIlIlI);
                  char lIllllllIlIlIll = lIllllllIlIllIl / lIllllllIllIIlI;
                  lIllllllIlIllIl *= lIllllllIlIlIll;
                  "".length();
                  if (((14 + 120 - 131 + 124 ^ 104 ^ 52) & (12 ^ 114 ^ 61 ^ 96 ^ -" ".length())) != 0) {
                     return;
                  }
               } else {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70181_x = lIllllllIlIllII;
               }

               lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = MathHelper.func_151237_a(lIllllllIllIIll.ɡ().field_71439_g.field_70159_w, -lIllllllIlIllIl, lIllllllIlIllIl);
               lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = MathHelper.func_151237_a(lIllllllIllIIll.ɡ().field_71439_g.field_70179_y, -lIllllllIlIllIl, lIllllllIlIllIl);
               if (lllIlIllII(lIllllllIllIIll.ʅ) && lllIlIllII(lIllllllIllIIll.ƺ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)(-MathHelper.func_76126_a(lIllllllIlIlllI - 0.7853982F)) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)MathHelper.func_76134_b(lIllllllIlIlllI - 0.7853982F) * lIllllllIlIllIl;
                  "".length();
                  if (" ".length() < 0) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.ʅ) && lllIlIllII(lIllllllIllIIll.ɻ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)(-MathHelper.func_76126_a(lIllllllIlIlllI + 0.7853982F)) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)MathHelper.func_76134_b(lIllllllIlIlllI + 0.7853982F) * lIllllllIlIllIl;
                  "".length();
                  if ((115 ^ 88 ^ 111 ^ 64) <= " ".length()) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.Ἠ) && lllIlIllII(lIllllllIllIIll.ƺ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)MathHelper.func_76126_a(lIllllllIlIlllI + 0.7853982F) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)(-MathHelper.func_76134_b(lIllllllIlIlllI + 0.7853982F)) * lIllllllIlIllIl;
                  "".length();
                  if ("  ".length() <= " ".length()) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.Ἠ) && lllIlIllII(lIllllllIllIIll.ɻ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)MathHelper.func_76126_a(lIllllllIlIlllI - 0.7853982F) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)(-MathHelper.func_76134_b(lIllllllIlIlllI - 0.7853982F)) * lIllllllIlIllIl;
                  "".length();
                  if (((150 ^ 177 ^ 116 ^ 12) & (117 ^ 61 ^ 12 ^ 27 ^ -" ".length())) == "   ".length()) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.ʅ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)(-MathHelper.func_76126_a(lIllllllIlIlllI)) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)MathHelper.func_76134_b(lIllllllIlIlllI) * lIllllllIlIllIl;
                  "".length();
                  if ("   ".length() <= 0) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.Ἠ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)MathHelper.func_76126_a(lIllllllIlIlllI) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)(-MathHelper.func_76134_b(lIllllllIlIlllI)) * lIllllllIlIllIl;
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.ƺ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)(-MathHelper.func_76126_a(lIllllllIlIlllI - 1.5707964F)) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)MathHelper.func_76134_b(lIllllllIlIlllI - 1.5707964F) * lIllllllIlIllIl;
                  "".length();
                  if (-"  ".length() > 0) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.ɻ)) {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)(-MathHelper.func_76126_a(lIllllllIlIlllI + 1.5707964F)) * lIllllllIlIllIl;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)MathHelper.func_76134_b(lIllllllIlIlllI + 1.5707964F) * lIllllllIlIllIl;
                  "".length();
                  if (-(101 ^ 96) >= 0) {
                     return;
                  }
               } else if (lllIlIllII(lIllllllIllIIll.Ἒ())) {
                  char lIllllllIlIlIll = System.currentTimeMillis() % (long)llIlllIll[34];
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = (double)MathHelper.func_76126_a((float)lIllllllIlIlIll) * lIllllllIllIIll.ꝱᶁ();
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = (double)(-MathHelper.func_76134_b((float)lIllllllIlIlIll)) * lIllllllIllIIll.ꝱᶁ();
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  lIllllllIllIIll.ɡ().field_71439_g.field_70159_w = 0.0D;
                  lIllllllIllIIll.ɡ().field_71439_g.field_70179_y = 0.0D;
               }
            }

         }
      }
   }

   @JvmName(
      name = "ᾥ"
   )
   private final boolean ᾥ() {
      return (Boolean)this.ᵴἥ.ⲋ(this, ⲋ[llIlllIll[11]]);
   }

   @JvmName(
      name = "ꝱᶁ"
   )
   private final double ꝱᶁ() {
      return ((Number)this.ⲡ.ⲋ(this, ⲋ[llIlllIll[9]])).doubleValue();
   }

   @JvmName(
      name = "Ꮐ꯴"
   )
   private final boolean Ꮐ꯴() {
      return (Boolean)this.Đ.ⲋ(this, ⲋ[llIlllIll[10]]);
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      this.ꙑứ = var1;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(float var1) {
      this.Ꞑ = var1;
   }

   @JvmName(
      name = "ⱛṧ"
   )
   private final double ⱛṧ() {
      return ((Number)this.u.ⲋ(this, ⲋ[llIlllIll[2]])).doubleValue();
   }

   public ĳ() {
      super(llIllIlIl[llIlllIll[35]], llIllIlIl[llIlllIll[36]], ı５.ᴃᎲ, llIlllIll[1], (boolean)llIlllIll[1], (boolean)llIlllIll[1], llIlllIll[37], (DefaultConstructorMarker)null);
      this.ĂƂ = this.ⲋ(llIllIlIl[llIlllIll[38]], ĳ.ⲋ.ⲋ);
      this.u = this.ⲋ(llIllIlIl[llIlllIll[39]], 1.8D).u((Object)0.0D).ᴃᎲ((Object)2.0D);
      this.ᴃᎲ = this.ⲋ(llIllIlIl[llIlllIll[40]], 1.9D).u((Object)0.0D).ᴃᎲ((Object)2.0D);
      this.〥ҳⱆ = this.ⲋ(llIllIlIl[llIlllIll[41]], 2.0D).u((Object)0.0D).ᴃᎲ((Object)3.0D);
      this.Ἒⅾ = this.ⲋ(llIllIlIl[llIlllIll[42]], ĳ.ĂƂ.ĂƂ);
      this.ϛⰄ = this.ⲋ(llIllIlIl[llIlllIll[43]], 0.5D).u((Object)0.05D).ᴃᎲ((Object)1.0D);
      this.ς = this.ⲋ(llIllIlIl[llIlllIll[44]], llIlllIll[45]).u((Object)llIlllIll[1]).ᴃᎲ((Object)llIlllIll[46]).ᴃᎲ(llIllIlIl[llIlllIll[47]]).u(llIllIlIl[llIlllIll[48]]);
      this.Ꜥ = this.ⲋ(llIllIlIl[llIlllIll[45]], Boolean.valueOf((boolean)llIlllIll[2])).u(llIllIlIl[llIlllIll[49]]);
      this.ⲡ = this.ⲋ(llIllIlIl[llIlllIll[50]], 0.05D).u((Object)0.0D).ᴃᎲ((Object)0.1D);
      this.Đ = this.ⲋ(llIllIlIl[llIlllIll[51]], Boolean.valueOf((boolean)llIlllIll[1])).u(llIllIlIl[llIlllIll[52]]);
      this.ᵴἥ = this.ⲋ(llIllIlIl[llIlllIll[53]], Boolean.valueOf((boolean)llIlllIll[1]));
      this.Ɏ = this.ⲋ(llIllIlIl[llIlllIll[54]], 1.0D).u((Object)1.0D).ᴃᎲ((Object)2.0D);
      this.ɡ = this.ⲋ(llIllIlIl[llIlllIll[55]], Boolean.valueOf((boolean)llIlllIll[2])).u(llIllIlIl[llIlllIll[56]]);
      this.ⴜ = llIlllIll[6];
      this.ͷ = this.ⲋ(llIllIlIl[llIlllIll[57]], Boolean.valueOf((boolean)llIlllIll[2])).u(llIllIlIl[llIlllIll[58]]);
      this.Ⳓ = this.ⲋ(llIllIlIl[llIlllIll[37]], 0.2D).u((Object)0.1D).ᴃᎲ((Object)1.0D);
      this.Ꙗ = this.ⲋ(llIllIlIl[llIlllIll[59]], 0.05D).u((Object)0.0D).ᴃᎲ((Object)1.0D).u(llIllIlIl[llIlllIll[60]]);
   }

   @JvmName(
      name = "Ⱬ"
   )
   private final int Ⱬ() {
      return ((Number)this.ς.ⲋ(this, ⲋ[llIlllIll[7]])).intValue();
   }

   @JvmName(
      name = "ⳅ"
   )
   private final double ⳅ() {
      return ((Number)this.Ⳓ.ⲋ(this, ⲋ[llIlllIll[15]])).doubleValue();
   }

   private static boolean lllIlllIII(int var0) {
      return var0 <= 0;
   }

   @JvmName(
      name = "ƶ"
   )
   public String ƶ() {
      return String.valueOf(this.ⱛṧ());
   }

   @JvmName(
      name = "ϛⰄ"
   )
   public final boolean ϛⰄ() {
      return this.ꙑứ;
   }

   private static boolean lllIllIlll(Object var0) {
      return var0 != null;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final boolean ᴃᎲ() {
      return this.ɡ().field_71439_g.func_184613_cA();
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      this.ɧῙ = var1;
   }

   private static void lllIlIIllI() {
      llIlllIll = new int[62];
      llIlllIll[0] = 214 ^ 198;
      llIlllIll[1] = (41 ^ 1) & ~(106 ^ 66);
      llIlllIll[2] = " ".length();
      llIlllIll[3] = "  ".length();
      llIlllIll[4] = "   ".length();
      llIlllIll[5] = 63 ^ 59;
      llIlllIll[6] = 176 + 127 - 297 + 176 ^ 94 + 6 - 33 + 112;
      llIlllIll[7] = 75 ^ 77;
      llIlllIll[8] = 111 ^ 104;
      llIlllIll[9] = 53 ^ 69 ^ 70 ^ 62;
      llIlllIll[10] = 0 ^ 9;
      llIlllIll[11] = 137 ^ 131;
      llIlllIll[12] = 156 ^ 151;
      llIlllIll[13] = 113 ^ 125;
      llIlllIll[14] = 125 ^ 112;
      llIlllIll[15] = 116 + 54 - 78 + 40 ^ 89 + 89 - 70 + 30;
      llIlllIll[16] = 200 ^ 199;
      llIlllIll[17] = 168 ^ 157 ^ 162 ^ 134;
      llIlllIll[18] = 245 ^ 197 ^ 170 ^ 136;
      llIlllIll[19] = 105 + 99 - 61 + 38 ^ 111 + 158 - 173 + 70;
      llIlllIll[20] = 52 ^ 32;
      llIlllIll[21] = 39 ^ 50;
      llIlllIll[22] = 189 ^ 171;
      llIlllIll[23] = 32 ^ 55;
      llIlllIll[24] = 27 + 142 - 82 + 70 ^ 67 + 42 - -5 + 19;
      llIlllIll[25] = "  ".length() ^ 10 ^ 17;
      llIlllIll[26] = 34 + 104 - 133 + 146 ^ 116 + 42 - 69 + 52;
      llIlllIll[27] = 120 + 86 - 163 + 116 ^ 74 + 10 - -25 + 23;
      llIlllIll[28] = 82 ^ 40 ^ 85 ^ 51;
      llIlllIll[29] = 105 ^ 116;
      llIlllIll[30] = 151 ^ 137;
      llIlllIll[31] = 199 ^ 171 ^ 246 ^ 133;
      llIlllIll[32] = 246 ^ 176 ^ 161 ^ 199;
      llIlllIll[33] = 139 ^ 170;
      llIlllIll[34] = -(-12583 & 30142) & -10753 & 28671;
      llIlllIll[35] = 164 ^ 134;
      llIlllIll[36] = 44 ^ 15;
      llIlllIll[37] = 112 ^ 72;
      llIlllIll[38] = 10 ^ 36 ^ 21 ^ 31;
      llIlllIll[39] = 49 ^ 20;
      llIlllIll[40] = 70 ^ 96;
      llIlllIll[41] = 8 ^ 98 ^ 63 ^ 114;
      llIlllIll[42] = 101 + 110 - 97 + 64 ^ 22 + 113 - 127 + 146;
      llIlllIll[43] = 143 ^ 166;
      llIlllIll[44] = 18 + 113 - 44 + 63 ^ 152 + 93 - 115 + 58;
      llIlllIll[45] = 24 ^ 81 ^ 124 ^ 24;
      llIlllIll[46] = 227 ^ 185;
      llIlllIll[47] = 166 + 152 - 188 + 46 ^ 42 + 66 - 65 + 112;
      llIlllIll[48] = 11 ^ 39;
      llIlllIll[49] = 173 ^ 131;
      llIlllIll[50] = 176 ^ 159;
      llIlllIll[51] = 73 + 43 - -17 + 2 ^ 4 + 50 - -44 + 85;
      llIlllIll[52] = 179 ^ 130;
      llIlllIll[53] = 209 ^ 189 ^ 2 ^ 92;
      llIlllIll[54] = 174 ^ 157;
      llIlllIll[55] = 137 ^ 194 ^ 98 + 26 - 117 + 120;
      llIlllIll[56] = 76 ^ 121;
      llIlllIll[57] = 126 + 167 - 176 + 64 ^ 116 + 40 - 42 + 17;
      llIlllIll[58] = 120 ^ 79;
      llIlllIll[59] = 156 ^ 165;
      llIlllIll[60] = 16 ^ 42;
      llIlllIll[61] = 195 ^ 134 ^ 82 ^ 44;
   }

   @JvmName(
      name = "ơ߀"
   )
   private final double ơ߀() {
      return ((Number)this.Ꙗ.ⲋ(this, ⲋ[llIlllIll[16]])).doubleValue();
   }

   private static boolean lllIlIllIl(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "ἒű"
   )
   private final double ἒű() {
      return ((Number)this.Ɏ.ⲋ(this, ⲋ[llIlllIll[12]])).doubleValue();
   }

   static {
      lllIlIIllI();
      lllIlIIlIl();
      KProperty[] var10000 = new KProperty[llIlllIll[0]];
      var10000[llIlllIll[1]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[1]], llIllIlIl[llIlllIll[2]]));
      var10000[llIlllIll[2]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[3]], llIllIlIl[llIlllIll[4]]));
      var10000[llIlllIll[3]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[5]], llIllIlIl[llIlllIll[6]]));
      var10000[llIlllIll[4]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[7]], llIllIlIl[llIlllIll[8]]));
      var10000[llIlllIll[5]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[9]], llIllIlIl[llIlllIll[10]]));
      var10000[llIlllIll[6]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[11]], llIllIlIl[llIlllIll[12]]));
      var10000[llIlllIll[7]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[13]], llIllIlIl[llIlllIll[14]]));
      var10000[llIlllIll[8]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[15]], llIllIlIl[llIlllIll[16]]));
      var10000[llIlllIll[9]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[0]], llIllIlIl[llIlllIll[17]]));
      var10000[llIlllIll[10]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[18]], llIllIlIl[llIlllIll[19]]));
      var10000[llIlllIll[11]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[20]], llIllIlIl[llIlllIll[21]]));
      var10000[llIlllIll[12]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[22]], llIllIlIl[llIlllIll[23]]));
      var10000[llIlllIll[13]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[24]], llIllIlIl[llIlllIll[25]]));
      var10000[llIlllIll[14]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[26]], llIllIlIl[llIlllIll[27]]));
      var10000[llIlllIll[15]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[28]], llIllIlIl[llIlllIll[29]]));
      var10000[llIlllIll[16]] = (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ĳ.class), llIllIlIl[llIlllIll[30]], llIllIlIl[llIlllIll[31]]));
      ⲋ = var10000;
   }

   private static void lllIlIIlIl() {
      llIllIlIl = new String[llIlllIll[61]];
      llIllIlIl[llIlllIll[1]] = lllIIlIIIl("5nz+SFfx6Rc=", "kcBNH");
      llIllIlIl[llIlllIll[2]] = lllIIlIIIl("o5pg29BsQ1a0ToTNGzUo3qeZ/xYXMFPZCZ9YTsqsxSoTyrlAmfcIFW/yxuzllxvm1hvfUHvMZmk6SAppq1F5zQ==", "UqDKX");
      llIllIlIl[llIlllIll[3]] = lllIIlIIlI("CQEKCyo=", "zqonN");
      llIllIlIl[llIlllIll[4]] = lllIIlIIlI("CyEjNiUJITNNfCg=", "lDWeU");
      llIllIlIl[llIlllIll[5]] = lllIIlIIlI("HQQwNSspGDw0Kg==", "zhYQN");
      llIllIlIl[llIlllIll[6]] = lllIIlIIIl("lpdDFeHwqGAyx11ZPUp4xCmOJ8G90iha", "xIJOO");
      llIllIlIl[llIlllIll[7]] = lllIIlIIIl("jQOKYBMhpePeHMbdCBCLkQ==", "BVpxP");
      llIllIlIl[llIlllIll[8]] = lllIIlIIlI("IhE2ARoyGhE1ECAQamwx", "EtBEu");
      llIllIlIl[llIlllIll[9]] = lllIIlIIlI("Jig8KiEFMScmLxsuLCw=", "VAHII");
      llIllIlIl[llIlllIll[10]] = lllIIlIIlI("EQkjERMCDz8SChkDMQwVEgl/aDYbCXgvDxUAMjQJWRwlLg4ZAngsFRIZOyQJWQE4Nx8bCTk1VTMALjUIFyo7OF4mBSMiEiUcOC4cOwMzJEE=", "vlWAz");
      llIllIlIl[llIlllIll[11]] = lllIIlIIll("jrvBSIBnME6gvDh1FTu20w==", "rzBxL");
      llIllIlIl[llIlllIll[12]] = lllIIlIIIl("+ISWPwr2R+geZNFHFGq9VRFoBxA0SBOl", "RVeck");
      llIllIlIl[llIlllIll[13]] = lllIIlIIlI("GwQpPTseNiQ/OR8=", "zwJXU");
      llIllIlIl[llIlllIll[14]] = lllIIlIIll("T+mFGs75MkDnsDHJ1CE4pD7i7RmLjbiy", "rWeUI");
      llIllIlIl[llIlllIll[15]] = lllIIlIIlI("Jg80BBAgHzkVKyAF", "OkXaB");
      llIllIlIl[llIlllIll[16]] = lllIIlIIlI("JSkHASkuKSEnOSM4GicjamUp", "BLsHM");
      llIllIlIl[llIlllIll[0]] = lllIIlIIlI("OCsaBBo+OxcVIT4hJREtNCs=", "QOvaH");
      llIllIlIl[llIlllIll[17]] = lllIIlIIIl("la6C63tQCR+5B4+Tw9JDox+PrWVsUJjn", "aYsvW");
      llIllIlIl[llIlllIll[18]] = lllIIlIIll("MkGay8Fk0qSXixd7s9RcPQ==", "qWFdS");
      llIllIlIl[llIlllIll[19]] = lllIIlIIll("o/9MryT49wQHRGzLKoj4uCSXzwbaPPlB", "uZDpK");
      llIllIlIl[llIlllIll[20]] = lllIIlIIIl("QsG9AJ5DRJTbiE7Ngr4MTQ==", "HLIoh");
      llIllIlIl[llIlllIll[21]] = lllIIlIIll("axiSXExKhpXPSds8sg8dqJj+aEQcS+qj", "jhFDB");
      llIllIlIl[llIlllIll[22]] = lllIIlIIlI("BScFJBgiPg0kDg==", "qNhAj");
      llIllIlIl[llIlllIll[23]] = lllIIlIIlI("IhIWFx4oEhAQByASBmteAQ==", "EwbCw");
      llIllIlIl[llIlllIll[24]] = lllIIlIIll("nPg6gG4V5il3nPIoffW49A==", "pGDQF");
      llIllIlIl[llIlllIll[25]] = lllIIlIIll("oq0d9Agi+ltVVdkMMdkgy/bADjk2FMVC", "JLkVX");
      llIllIlIl[llIlllIll[26]] = lllIIlIIll("VlGhC0BeNyYJ0cr2IcjDEA==", "LGJXq");
      llIllIlIl[llIlllIll[27]] = lllIIlIIll("/DWRvB0aUwsoh+0hJiGBlGSD/EuuatB1", "XctRd");
      llIllIlIl[llIlllIll[28]] = lllIIlIIll("eQx0N2x1ndmBdVnh436fSMiRx2KDkx34", "voTiU");
      llIllIlIl[llIlllIll[29]] = lllIIlIIlI("Ig46OjcuDiEIMBECIwskFhsrCzJtQgo=", "EkNnV");
      llIllIlIl[llIlllIll[30]] = lllIIlIIlI("GRQhNCATECEGJB8DIA==", "zfDUT");
      llIllIlIl[llIlllIll[31]] = lllIIlIIlI("KxADGjYpFAMwMikmBzwhKF1eHQ==", "LuwYD");
      llIllIlIl[llIlllIll[32]] = lllIIlIIlI("PQIkGG8wFiYaICdXKhFvMBY7AG8nGGgaID1aJgEjP1c8DT82VyURYT0CKxgqJgRmBD08AycaYT4YLAEjNgRmAyAhGyxaGzoaLQY=", "SwHtO");
      llIllIlIl[llIlllIll[33]] = lllIIlIIlI("OxYGP3g2AgQ9NyFDCDZ4NgIZJ3ghDEo9NztOBCY0OUMeKigwQwc2djsWCT89IBBEIyo6FwU9djgMDiY0MBBEJDcnDw59DDwODyE=", "UcjSX");
      llIllIlIl[llIlllIll[35]] = lllIIlIIll("h8IYAees9Jr7KQowAgp3hQ==", "NMzNw");
      llIllIlIl[llIlllIll[36]] = lllIIlIIIl("90iJT6JOKTPOw0lX69xdxMbrkT6h4LIzFaErWeLNH11qAxvSlenQKA==", "UeFKC");
      llIllIlIl[llIlllIll[38]] = lllIIlIIIl("JoMslvuarrg=", "maqoS");
      llIllIlIl[llIlllIll[39]] = lllIIlIIll("RhxLnob+dKs=", "mIjhk");
      llIllIlIl[llIlllIll[40]] = lllIIlIIll("eozYPv4yrf0iLVFJ+U5neQ==", "jqiEb");
      llIllIlIl[llIlllIll[41]] = lllIIlIIIl("nUqycrYOywXHHmN7zo4Wvg==", "eohFo");
      llIllIlIl[llIlllIll[42]] = lllIIlIIIl("MGEfs4Luo9BEm7w8SHWbaxSlcCm5ZbGw", "jEFzK");
      llIllIlIl[llIlllIll[43]] = lllIIlIIIl("fv+6pKNMhLTeBwTqhyUusQ==", "QZMsR");
      llIllIlIl[llIlllIll[44]] = lllIIlIIll("g69a4Yz7WekqHnw6d0Suwg==", "sMtVO");
      llIllIlIl[llIlllIll[47]] = lllIIlIIlI("w6o=", "ZSesm");
      llIllIlIl[llIlllIll[48]] = lllIIlIIlI("CgMlKxUjDz8rFG4SOStHPg8lLQ9uBz8pCytGJiYCIEYwPQQrCDUnCSlI", "NfQNg");
      llIllIlIl[llIlllIll[45]] = lllIIlIIll("2x5c8X0rIIBsrLR+XYYsww==", "CyKpv");
      llIllIlIl[llIlllIll[49]] = lllIIlIIIl("C2RIWMGDbzDX2qyPir33rEP5Dm3nmyPEM7sOajprKnX3HwW3toAv2hxN3iJ1M8N6cqNFTw+otlg=", "GujbN");
      llIllIlIl[llIlllIll[50]] = lllIIlIIlI("HzELNUEcPBMkBCR1NCAEMzE=", "VUgPa");
      llIllIlIl[llIlllIll[51]] = lllIIlIIlI("MSY8JjQ=", "eOQCF");
      llIllIlIl[llIlllIll[52]] = lllIIlIIll("oYctThAnSZ8CcZ0XvmQq61PBmtP0CXLEuPJnlPSwBZJxaZY8r12gYxm4AZtf5sIKS/7DWPvikDMR7uvG58xraIWr5bHXiM6oDZIJ1rZIL7s=", "vQlmz");
      llIllIlIl[llIlllIll[53]] = lllIIlIIll("CCZQqLZX3Cp2PaUVCQjo3Q==", "eNKpo");
      llIllIlIl[llIlllIll[54]] = lllIIlIIlI("HAsXEjdoMQoSICw=", "HbzwE");
      llIllIlIl[llIlllIll[55]] = lllIIlIIll("ppVORy+Z9qTb+ZNZC+hhkw==", "ECqNZ");
      llIllIlIl[llIlllIll[56]] = lllIIlIIlI("CCIDLDxnJg4nbwI+HzY9JnIALT1nKwk3byYnEi0iJiYPIS4rPh9s", "GRfBO");
      llIllIlIl[llIlllIll[57]] = lllIIlIIIl("NdPE1H07G1uOCAPwpU0vBQ==", "WGfnZ");
      llIllIlIl[llIlllIll[58]] = lllIIlIIll("Mx0NrU6sFjn/BCnXSj3vI3I99k0Y7r9DKbplogbVkBIOWRhu673rRATTR5sciV+I", "dJzTP");
      llIllIlIl[llIlllIll[37]] = lllIIlIIIl("PuH3p/83+aoiC/XHebmcYzq0Ylpm64G0", "DxtqZ");
      llIllIlIl[llIlllIll[59]] = lllIIlIIIl("iRSmV2ZDU28yTI91VKpIxQ==", "syWEV");
      llIllIlIl[llIlllIll[60]] = lllIIlIIIl("GK4sl0z2J6Lk76FS9He3p6NdIaMlktNjf/oljzna9FxvNWbM3sEZOmkiKSH7h4Jk", "AsuyV");
   }

   private static int lllIlIllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   @JvmName(
      name = "ᶐ"
   )
   private final double ᶐ() {
      return ((Number)this.ᴃᎲ.ⲋ(this, ⲋ[llIlllIll[3]])).doubleValue();
   }

   private static String lllIIlIIlI(String lIllllllIIlIIII, String lIllllllIIlIlII) {
      lIllllllIIlIIII = new String(Base64.getDecoder().decode(lIllllllIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lIllllllIIIlllI = new StringBuilder();
      char[] lIllllllIIlIIlI = lIllllllIIlIlII.toCharArray();
      float lIllllllIIIllII = llIlllIll[1];
      byte lIllllllIIIlIll = lIllllllIIlIIII.toCharArray();
      boolean lIllllllIIIlIlI = lIllllllIIIlIll.length;
      int lIllllllIIIlIIl = llIlllIll[1];

      do {
         if (!lllIlllIIl(lIllllllIIIlIIl, lIllllllIIIlIlI)) {
            return String.valueOf(lIllllllIIIlllI);
         }

         char lIllllllIIlIllI = lIllllllIIIlIll[lIllllllIIIlIIl];
         lIllllllIIIlllI.append((char)(lIllllllIIlIllI ^ lIllllllIIlIIlI[lIllllllIIIllII % lIllllllIIlIIlI.length]));
         "".length();
         ++lIllllllIIIllII;
         ++lIllllllIIIlIIl;
         "".length();
      } while(((8 ^ 80 ^ 67 ^ 37) & (76 ^ 60 ^ 92 ^ 18 ^ -" ".length())) == 0);

      return null;
   }

   protected void ʅ() {
      super.ʅ();
      if (lllIlIllII(lIlllllllIIIIll.ɧῙ)) {
         ơ߀ var1 = ơ߀.ⲋ;
         Class var2 = ⱳ.class;
         int var3 = llIlllIll[1];
         Object var10000 = var1.ⲋ().get(ⱳ.class);
         if (lllIlIllIl(var10000)) {
            throw new TypeCastException(llIllIlIl[llIlllIll[32]]);
         }

         ((ⱳ)((ⳅ)((ⱳ)var10000))).ꙑứ();
         lIlllllllIIIIll.ɧῙ = (boolean)llIlllIll[1];
      }

      lIlllllllIIIIll.ɡ().field_71439_g.field_71075_bZ.field_75101_c = (boolean)llIlllIll[1];
      lIlllllllIIIIll.ɡ().field_71439_g.field_71075_bZ.field_75100_b = (boolean)llIlllIll[1];
   }

   @JvmName(
      name = "Ꜥ"
   )
   public final boolean Ꜥ() {
      return this.ȵ;
   }

   private static String lllIIlIIll(String lIllllllIIIIIII, String lIlllllIlllllIl) {
      try {
         byte lIlllllIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllllIlllllIl.getBytes(StandardCharsets.UTF_8)), llIlllIll[9]), "DES");
         boolean lIlllllIllllIll = Cipher.getInstance("DES");
         lIlllllIllllIll.init(llIlllIll[3], lIlllllIlllllII);
         return new String(lIlllllIllllIll.doFinal(Base64.getDecoder().decode(lIllllllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "u"
   )
   public final void u(boolean var1) {
      this.ȵ = var1;
   }

   @JvmName(
      name = "ⲡ"
   )
   private final ĳ.ⲋ ⲡ() {
      return (ĳ.ⲋ)this.ĂƂ.ⲋ(this, ⲋ[llIlllIll[1]]);
   }

   private static String lllIIlIIIl(String lIlllllIlllIIIl, String lIlllllIlllIIII) {
      try {
         String lIlllllIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lIlllllIllIlllI = Cipher.getInstance("Blowfish");
         lIlllllIllIlllI.init(llIlllIll[3], lIlllllIllIllll);
         return new String(lIlllllIllIlllI.doFinal(Base64.getDecoder().decode(lIlllllIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final double ĂƂ() {
      return ((Number)this.ϛⰄ.ⲋ(this, ⲋ[llIlllIll[6]])).doubleValue();
   }

   @JvmName(
      name = "u"
   )
   public final int u() {
      return this.ⴜ;
   }

   @ȵ(
      ĂƂ = a.Ѿ.PRE
   )
   public final void ⲋ(@NotNull ᶐ var1) {
      if (!lllIllIlIl(this.ɡ().field_71439_g.func_184613_cA())) {
         this.Ｆ = (boolean)llIlllIll[1];
         this.Ѿ = this.ɡ().field_71439_g.field_70125_A;
         this.ɡ().field_71439_g.field_70125_A = this.Ꞑ;
         this.Ｆ = (boolean)llIlllIll[2];
      }
   }

   private static boolean lllIlllIIl(int var0, int var1) {
      return var0 < var1;
   }

   @ȵ(
      ĂƂ = a.Ѿ.PRE
   )
   public final void ⲋ(@NotNull ᾥ var1) {
      if (!lllIllIlIl(this.ɡ().field_71439_g.func_184613_cA())) {
         this.Ｆ = (boolean)llIlllIll[1];
         this.ɡ().field_71439_g.field_71075_bZ.field_75101_c = (boolean)llIlllIll[2];
         this.ɡ().field_71439_g.field_71075_bZ.field_75100_b = (boolean)llIlllIll[2];
         this.Ѿ = this.ɡ().field_71439_g.field_70125_A;
         this.ɡ().field_71439_g.field_70125_A = this.Ꞑ;
         this.Ｆ = (boolean)llIlllIll[2];
      }
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final float 〥ҳⱆ() {
      return this.Ꞑ;
   }

   private static boolean lllIlIllII(int var0) {
      return var0 != 0;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(float var1) {
      this.ⱯꝣѺ = var1;
   }

   private static boolean lllIllIlIl(int var0) {
      return var0 == 0;
   }

   @ȵ
   public final void ⲋ(@NotNull Ꮐ꯴ var1) {
      boolean var10000 = var1.ᴃᎲ() instanceof CPacketPlayer;
      "".length();
   }

   @ȵ(
      ĂƂ = a.Ѿ.POST
   )
   public final void ĂƂ(@NotNull ᾥ var1) {
      if (lllIllIllI(lIllllllIlIIlII.ⲡ(), ĳ.ⲋ.ⲋ)) {
         lIllllllIlIIlII.ɡ().field_71439_g.field_71075_bZ.field_75101_c = (boolean)llIlllIll[1];
         lIllllllIlIIlII.ɡ().field_71439_g.field_71075_bZ.field_75100_b = (boolean)llIlllIll[1];
      }

      if (lllIlIllII(lIllllllIlIIlII.Ｆ)) {
         lIllllllIlIIlII.ɡ().field_71439_g.field_70125_A = lIllllllIlIIlII.Ѿ;
         lIllllllIlIIlII.Ｆ = (boolean)llIlllIll[1];
      }

   }

   @JvmName(
      name = "Ӄ"
   )
   private final double Ӄ() {
      return ((Number)this.〥ҳⱆ.ⲋ(this, ⲋ[llIlllIll[4]])).doubleValue();
   }

   @ȵ(
      ĂƂ = a.Ѿ.POST
   )
   public final void ĂƂ(@NotNull ᶐ var1) {
      if (lllIlIllII(this.Ｆ)) {
         this.ɡ().field_71439_g.field_70125_A = this.Ѿ;
         this.Ｆ = (boolean)llIlllIll[1];
      }

   }

   @JvmName(
      name = "Ἒⅾ"
   )
   public final float Ἒⅾ() {
      return this.ⱯꝣѺ;
   }

   private static int lllIllIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   @ȵ
   public final void ⲋ(@NotNull ἒű var1) {
      this.ƺ = var1.ᴃᎲ().field_187257_e;
      this.ɻ = var1.ᴃᎲ().field_187258_f;
      this.ʅ = var1.ᴃᎲ().field_187255_c;
      this.Ἠ = var1.ᴃᎲ().field_187256_d;
      this.ƶ = var1.ᴃᎲ().field_78901_c;
      this.ἶṗ = var1.ᴃᎲ().field_78899_d;
   }

   @JvmName(
      name = "ς"
   )
   public final boolean ς() {
      return this.ɧῙ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ĳ.ĂƂ ⲋ() {
      return (ĳ.ĂƂ)this.Ἒⅾ.ⲋ(this, ⲋ[llIlllIll[5]]);
   }

   @JvmName(
      name = "Ἒ"
   )
   private final boolean Ἒ() {
      return (Boolean)this.Ꜥ.ⲋ(this, ⲋ[llIlllIll[8]]);
   }

   protected void Đ() {
      super.Đ();
      this.ɧῙ = (boolean)llIlllIll[1];
   }

   @JvmName(
      name = "Թ"
   )
   private final boolean Թ() {
      return (Boolean)this.ͷ.ⲋ(this, ⲋ[llIlllIll[14]]);
   }

   private static boolean lllIllIllI(Object var0, Object var1) {
      return var0 == var1;
   }

   @JvmName(
      name = "ı５"
   )
   private final boolean ı５() {
      return (Boolean)this.ɡ.ⲋ(this, ⲋ[llIlllIll[13]]);
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ĳ$ⲋ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ⲋ {
      private ⲋ() {
      }

      private static boolean llllIIllll(int var0, int var1) {
         return var0 < var1;
      }

      private static String llllIIlIlI(String lIllllIIlIlIIlI, String lIllllIIlIlIllI) {
         lIllllIIlIlIIlI = new String(Base64.getDecoder().decode(lIllllIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         Exception lIllllIIlIlIIII = new StringBuilder();
         char[] lIllllIIlIlIlII = lIllllIIlIlIllI.toCharArray();
         int lIllllIIlIIlllI = lllIIIlII[1];
         float lIllllIIlIIllIl = lIllllIIlIlIIlI.toCharArray();
         double lIllllIIlIIllII = lIllllIIlIIllIl.length;
         int lIllllIIlIIlIll = lllIIIlII[1];

         do {
            if (!llllIIllll(lIllllIIlIIlIll, lIllllIIlIIllII)) {
               return String.valueOf(lIllllIIlIlIIII);
            }

            char lIllllIIlIIlIlI = lIllllIIlIIllIl[lIllllIIlIIlIll];
            lIllllIIlIlIIII.append((char)(lIllllIIlIIlIlI ^ lIllllIIlIlIlII[lIllllIIlIIlllI % lIllllIIlIlIlII.length]));
            "".length();
            ++lIllllIIlIIlllI;
            ++lIllllIIlIIlIll;
            "".length();
         } while((59 ^ 63) >= " ".length());

         return null;
      }

      static {
         llllIIllIl();
         llllIIlIll();
         ĳ.ⲋ[] var10001 = new ĳ.ⲋ[lllIIIlII[0]];
         var10001[lllIIIlII[1]] = ⲋ = new ĳ.ⲋ(lllIIIIll[lllIIIlII[1]], lllIIIlII[1]);
         var10001[lllIIIlII[2]] = ĂƂ = new ĳ.ⲋ(lllIIIIll[lllIIIlII[2]], lllIIIlII[2]);
      }

      private static void llllIIlIll() {
         lllIIIIll = new String[lllIIIlII[0]];
         lllIIIIll[lllIIIlII[1]] = llllIIlIlI("FCA+HAEYIw==", "WopHS");
         lllIIIIll[lllIIIlII[2]] = llllIIlIlI("MTQ1Ggs1", "auvQN");
      }

      private static void llllIIllIl() {
         lllIIIlII = new int[3];
         lllIIIlII[0] = "  ".length();
         lllIIIlII[1] = (73 ^ 3) & ~(142 ^ 196);
         lllIIIlII[2] = " ".length();
      }
   }

   @Metadata(
      mv = {1, 1, 16},
      bv = {1, 0, 3},
      k = 1,
      d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0001j\u0002\b\u0002"},
      d2 = {"La/ĳ$ĂƂ;", "ⲋ", "ĂƂ", "<init>", "(Ljava/lang/String;I)V", ""}
   )
   public static enum ĂƂ {
      static {
         llIIllIlII();
         llIIlIllII();
         ĳ.ĂƂ[] var10001 = new ĳ.ĂƂ[llIIIIlll[0]];
         var10001[llIIIIlll[1]] = ⲋ = new ĳ.ĂƂ(llIIIIIll[llIIIIlll[1]], llIIIIlll[1]);
         var10001[llIIIIlll[2]] = ĂƂ = new ĳ.ĂƂ(llIIIIIll[llIIIIlll[2]], llIIIIlll[2]);
      }

      private static String llIIlIlIll(String llIIlIIIlIIllll, String llIIlIIIlIIlllI) {
         try {
            byte llIIlIIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), llIIIIlll[3]), "DES");
            short llIIlIIIlIIlIlI = Cipher.getInstance("DES");
            llIIlIIIlIIlIlI.init(llIIIIlll[0], llIIlIIIlIIlIll);
            return new String(llIIlIIIlIIlIlI.doFinal(Base64.getDecoder().decode(llIIlIIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void llIIlIllII() {
         llIIIIIll = new String[llIIIIlll[0]];
         llIIIIIll[llIIIIlll[1]] = llIIlIlIlI("+aEj2VzUcWE=", "jTHzv");
         llIIIIIll[llIIIIlll[2]] = llIIlIlIll("+9bzR+ltric=", "sTLMW");
      }

      private static void llIIllIlII() {
         llIIIIlll = new int[4];
         llIIIIlll[0] = "  ".length();
         llIIIIlll[1] = (74 + 204 - 169 + 97 ^ 116 + 107 - 188 + 109) & (138 + 168 - 151 + 41 ^ 120 + 64 - 145 + 115 ^ -" ".length());
         llIIIIlll[2] = " ".length();
         llIIIIlll[3] = 32 + 85 - -50 + 14 ^ 52 + 57 - 3 + 83;
      }

      private static String llIIlIlIlI(String llIIlIIIlIlllII, String llIIlIIIlIllIll) {
         try {
            short llIIlIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIIIlIllllI = Cipher.getInstance("Blowfish");
            llIIlIIIlIllllI.init(llIIIIlll[0], llIIlIIIlIllIII);
            return new String(llIIlIIIlIllllI.doFinal(Base64.getDecoder().decode(llIIlIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private ĂƂ() {
      }
   }
}
