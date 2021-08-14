package a;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0016B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0006\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0086\u0004R\u001d\u0010\u000b\u001a\u00020\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0086\u0004R\u001a\u0010\u0002\u001a\u00020\u00018W@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0096\u0004R\u001d\u0010\u0004\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0086\u0004"},
   d2 = {"La/ᵺ;", "La/ė;", "u", "La/ė;", "ᴃᎲ", "()La/ė;", "ⲋ", "", "Ljava/lang/String;", "〥ҳⱆ", "()Ljava/lang/String;", "ĂƂ", "", "b_", "()V", "ꙑứ", "ⱯꝣѺ", "p0", "p1", "p2", "<init>", "(La/ė;La/ė;Ljava/lang/String;)V", "La/Ữ;"}
)
public final class ᵺ extends Ữ {
   private final void ꙑứ() {
      GlStateManager.func_179084_k();
      GlStateManager.func_179097_i();
      GlStateManager.func_179126_j();
      GlStateManager.func_179141_d();
      GlStateManager.func_179121_F();
      GL11.glPopMatrix();
      GL11.glDisable(lIIlIl[7]);
   }

   public ᵺ(@NotNull ė var1, @NotNull ė var2, @NotNull String var3) {
      this.ⲋ = var1;
      this.u = var2;
      this.ᴃᎲ = var3;
   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final ė ᴃᎲ() {
      return this.u;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final ė ĂƂ() {
      return this.ⲋ;
   }

   static {
      lIllIll();
   }

   @JvmName(
      name = "ⲋ"
   )
   public ė ⲋ() {
      return this.ⲋ;
   }

   private final void ⱯꝣѺ() {
      GL11.glPushMatrix();
      GlStateManager.func_179094_E();
      GlStateManager.func_179118_c();
      GlStateManager.func_179086_m(lIIlIl[1]);
      GlStateManager.func_179147_l();
      GlStateManager.func_187399_a(lIIlIl[2], lIIlIl[3], lIIlIl[4]);
      GlStateManager.func_179112_b(lIIlIl[5], lIIlIl[6]);
      GlStateManager.func_179140_f();
      GL11.glEnable(lIIlIl[7]);
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   public final String 〥ҳⱆ() {
      return this.ᴃᎲ;
   }

   public void b_() {
      super.b_();
      this.ⱯꝣѺ();
      ResourceLocation var1 = new ResourceLocation(this.ᴃᎲ);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(var1);
      ⲙ.ⲋ.ⲋ(lIIlIl[0], lIIlIl[0], 0.0F, 0.0F, this.u.ⲋ(), this.u.ĂƂ(), this.ⲡ().ⲋ(), this.ⲡ().ĂƂ(), (float)this.u.ⲋ(), (float)this.u.ĂƂ());
      this.ꙑứ();
   }

   private static void lIllIll() {
      lIIlIl = new int[8];
      lIIlIl[0] = (3 + 125 - 20 + 43 ^ 55 + 159 - 93 + 43) & (70 + 83 - 146 + 123 ^ 144 + 166 - 197 + 64 ^ -" ".length());
      lIIlIl[1] = -(-20802 & 23537) & -8273 & 11263;
      lIIlIl[2] = -16626 & 25585;
      lIIlIl[3] = -(-25617 & 28028) & -17557 & 28671;
      lIIlIl[4] = -23681 & 32128;
      lIIlIl[5] = -17537 & 18306;
      lIIlIl[6] = -9233 & 10003;
      lIIlIl[7] = -(106 ^ 99) & -28673 & 32233;
   }
}
