package a;

import java.awt.Color;
import kotlin.Metadata;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\bÇ\u0002\u0018\u00002\u00020*B\t\b\u0002¢\u0006\u0004\b)\u0010%J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\fJ%\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u000eJ%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u000eJ5\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0011Jm\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u001aJ%\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u001bJ=\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u001cJ\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001d¢\u0006\u0004\b\u000b\u0010\u001eJ%\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010 Jm\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u001aJm\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020!2\u0006\u0010\t\u001a\u00020!2\u0006\u0010\n\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010%J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010%J\r\u0010&\u001a\u00020\u0003¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0003¢\u0006\u0004\b'\u0010%J\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010("},
   d2 = {"La/ᾣŦ;", "", "p0", "", "ĂƂ", "(I)V", "Lnet/minecraft/util/math/BlockPos;", "Lnet/minecraft/util/math/AxisAlignedBB;", "p1", "p2", "p3", "ⲋ", "(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;II)V", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;II)V", "", "p4", "(DDDII)V", "Lnet/minecraft/client/renderer/BufferBuilder;", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "(Lnet/minecraft/client/renderer/BufferBuilder;DDDDDDIIIII)V", "(Lnet/minecraft/util/math/BlockPos;II)V", "(Lnet/minecraft/util/math/BlockPos;IIIII)V", "Ljava/awt/Color;", "(Lnet/minecraft/util/math/BlockPos;Ljava/awt/Color;)V", "Lnet/minecraft/util/math/Vec3d;", "(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;I)V", "", "(Lnet/minecraft/client/renderer/BufferBuilder;FFFFFFIIIII)V", "〥ҳⱆ", "()Lnet/minecraft/client/renderer/BufferBuilder;", "()V", "ᴃᎲ", "u", "(Lnet/minecraft/util/math/BlockPos;)V", "<init>", "Lnet/minecraft/client/renderer/Tessellator;"}
)
public final class ᾣŦ extends Tessellator {
   public final void ĂƂ(int var1) {
      this.func_178180_c().func_181668_a(var1, DefaultVertexFormats.field_181706_f);
   }

   public final void ⲋ(double var1, double var3, double var5, int var7, int var8) {
      int var9 = var7 >>> lIIlIIIllI[4] & lIIlIIIllI[5];
      int var10 = var7 >>> lIIlIIIllI[6] & lIIlIIIllI[5];
      int var11 = var7 >>> lIIlIIIllI[7] & lIIlIIIllI[5];
      int var12 = var7 & lIIlIIIllI[5];
      this.ⲋ(this.func_178180_c(), var1, var3, var5, 1.0D, 1.0D, 1.0D, var10, var11, var12, var9, var8);
   }

   public final void ⲋ(@NotNull BlockPos var1, @NotNull AxisAlignedBB var2, int var3, int var4) {
      int var5 = var3 >>> lIIlIIIllI[4] & lIIlIIIllI[5];
      int var6 = var3 >>> lIIlIIIllI[6] & lIIlIIIllI[5];
      int var7 = var3 >>> lIIlIIIllI[7] & lIIlIIIllI[5];
      int var8 = var3 & lIIlIIIllI[5];
      this.ⲋ(this.func_178180_c(), var2.field_72340_a + (double)var1.field_177962_a, var2.field_72338_b + (double)var1.field_177960_b, var2.field_72339_c + (double)var1.field_177961_c, var2.field_72336_d - var2.field_72340_a, var2.field_72337_e - var2.field_72338_b, var2.field_72334_f - var2.field_72339_c, var6, var7, var8, var5, var4);
   }

   public final void ĂƂ() {
      this.u();
      this.ᴃᎲ();
   }

   public final void ⲋ(@NotNull BlockPos var1, int var2, int var3, int var4, int var5, int var6) {
      this.ⲋ(this.func_178180_c(), (double)var1.field_177962_a, (double)var1.field_177960_b, (double)var1.field_177961_c, 1.0D, 1.0D, 1.0D, var2, var3, var4, var5, var6);
   }

   private ᾣŦ() {
      super(lIIlIIIllI[23]);
   }

   public final void ĂƂ(@NotNull BufferBuilder lIlIIllllIlIlll, double lIlIIllllIlIlII, double lIlIIllllIlIIll, double lIlIIllllIlIIlI, double lIlIIllllIlIIIl, double lIlIIllllIlIIII, double lIlIIllllIIllll, int lIlIIllllIIlllI, int lIlIIllllIIllIl, int lIlIIllllIllIII, int lIlIIllllIlIllI, int lIlIIllllIlIlIl) {
      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[12])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[13])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[14])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[15])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[16])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[17])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[18])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[19])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[20])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[21])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[4])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIllllIlIlIl & lIIlIIIllI[22])) {
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
         lIlIIllllIlIlll.func_181662_b(lIlIIllllIlIlII + lIlIIllllIlIIIl, lIlIIllllIlIIll + lIlIIllllIlIIII, lIlIIllllIlIIlI + lIlIIllllIIllll).func_181669_b(lIlIIllllIIlllI, lIlIIllllIIllIl, lIlIIllllIllIII, lIlIIllllIlIllI).func_181675_d();
      }

   }

   public final void ⲋ(@NotNull BlockPos var1) {
      GlStateManager.func_179137_b((double)var1.field_177962_a, (double)var1.field_177960_b, (double)var1.field_177961_c);
   }

   public final void ⲋ(@NotNull Vec3d var1, @NotNull Vec3d var2, int var3) {
      int var4 = var3 >>> lIIlIIIllI[4] & lIIlIIIllI[5];
      int var5 = var3 >>> lIIlIIIllI[6] & lIIlIIIllI[5];
      int var6 = var3 >>> lIIlIIIllI[7] & lIIlIIIllI[5];
      int var7 = var3 & lIIlIIIllI[5];
      this.func_178180_c().func_181662_b(var1.field_72450_a, var1.field_72448_b, var1.field_72449_c).func_181669_b(var5, var6, var7, var4).func_181675_d();
      this.func_178180_c().func_181662_b(var2.field_72450_a, var2.field_72448_b, var2.field_72449_c).func_181669_b(var5, var6, var7, var4).func_181675_d();
   }

   public final void ĂƂ(@NotNull BlockPos var1, @NotNull AxisAlignedBB var2, int var3, int var4) {
      int var5 = var3 >>> lIIlIIIllI[4] & lIIlIIIllI[5];
      int var6 = var3 >>> lIIlIIIllI[6] & lIIlIIIllI[5];
      int var7 = var3 >>> lIIlIIIllI[7] & lIIlIIIllI[5];
      int var8 = var3 & lIIlIIIllI[5];
      this.ĂƂ(this.func_178180_c(), var2.field_72340_a + (double)var1.field_177962_a, var2.field_72338_b + (double)var1.field_177960_b, var2.field_72339_c + (double)var1.field_177961_c, var2.field_72336_d - var2.field_72340_a, var2.field_72337_e - var2.field_72338_b, var2.field_72334_f - var2.field_72339_c, var6, var7, var8, var5, var4);
   }

   public final void ĂƂ(@NotNull Entity var1, int var2, int var3) {
      int var4 = var2 >>> lIIlIIIllI[4] & lIIlIIIllI[5];
      int var5 = var2 >>> lIIlIIIllI[6] & lIIlIIIllI[5];
      int var6 = var2 >>> lIIlIIIllI[7] & lIIlIIIllI[5];
      int var7 = var2 & lIIlIIIllI[5];
      AxisAlignedBB var8 = var1.field_70121_D;
      Vec3d var9 = Ṑ.ⲋ(var1, (double)u.ⲋ.ĂƂ());
      this.ĂƂ(this.func_178180_c(), var8.field_72340_a + var9.field_72450_a, var8.field_72338_b + var9.field_72448_b, var8.field_72339_c + var9.field_72449_c, var8.field_72336_d - var8.field_72340_a, var8.field_72337_e - var8.field_72338_b, var8.field_72334_f - var8.field_72339_c, var5, var6, var7, var4, var3);
   }

   public final void ⲋ(@NotNull BlockPos var1, int var2, int var3) {
      int var4 = var2 >>> lIIlIIIllI[4] & lIIlIIIllI[5];
      int var5 = var2 >>> lIIlIIIllI[6] & lIIlIIIllI[5];
      int var6 = var2 >>> lIIlIIIllI[7] & lIIlIIIllI[5];
      int var7 = var2 & lIIlIIIllI[5];
      this.ⲋ(var1, var5, var6, var7, var4, var3);
   }

   public final void ⲋ(@NotNull BufferBuilder lIlIlIIIIIIIlll, double lIlIlIIIIIIIlII, double lIlIlIIIIIIIIll, double lIlIlIIIIIIIIlI, double lIlIlIIIIIIIIIl, double lIlIlIIIIIIIIII, double lIlIIllllllllll, int lIlIIlllllllllI, int lIlIIllllllllIl, int lIlIlIIIIIIlIII, int lIlIlIIIIIIIllI, int lIlIlIIIIIIIlIl) {
      if (lIIlllIlIII(lIlIlIIIIIIIlIl & lIIlIIIllI[3])) {
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIlIIIIIIIlIl & lIIlIIIllI[8])) {
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIlIIIIIIIlIl & lIIlIIIllI[9])) {
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIlIIIIIIIlIl & lIIlIIIllI[7])) {
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIlIIIIIIIlIl & lIIlIIIllI[6])) {
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIlIIIIIIIlIl & lIIlIIIllI[10])) {
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
         lIlIlIIIIIIIlll.func_181662_b(lIlIlIIIIIIIlII + lIlIlIIIIIIIIIl, lIlIlIIIIIIIIll + lIlIlIIIIIIIIII, lIlIlIIIIIIIIlI + lIlIIllllllllll).func_181669_b(lIlIIlllllllllI, lIlIIllllllllIl, lIlIlIIIIIIlIII, lIlIlIIIIIIIllI).func_181675_d();
      }

   }

   public final void ᴃᎲ() {
      GlStateManager.func_179089_o();
      GlStateManager.func_179132_a((boolean)lIIlIIIllI[3]);
      GlStateManager.func_179098_w();
      GlStateManager.func_179147_l();
      GlStateManager.func_179126_j();
   }

   public final void ⲋ(@NotNull Entity var1, int var2, int var3) {
      int var4 = var2 >>> lIIlIIIllI[4] & lIIlIIIllI[5];
      int var5 = var2 >>> lIIlIIIllI[6] & lIIlIIIllI[5];
      int var6 = var2 >>> lIIlIIIllI[7] & lIIlIIIllI[5];
      int var7 = var2 & lIIlIIIllI[5];
      AxisAlignedBB var8 = var1.field_70121_D;
      Vec3d var9 = Ṑ.ⲋ(var1, (double)u.ⲋ.ĂƂ());
      this.ⲋ(this.func_178180_c(), var8.field_72340_a + var9.field_72450_a, var8.field_72338_b + var9.field_72448_b, var8.field_72339_c + var9.field_72449_c, var8.field_72336_d - var8.field_72340_a, var8.field_72337_e - var8.field_72338_b, var8.field_72334_f - var8.field_72339_c, var5, var6, var7, var4, var3);
   }

   public final void ⲋ() {
      GL11.glBlendFunc(lIIlIIIllI[0], lIIlIIIllI[1]);
      GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
      GlStateManager.func_187441_d(1.5F);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((boolean)lIIlIIIllI[2]);
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179140_f();
      GlStateManager.func_179129_p();
      GlStateManager.func_179141_d();
      GlStateManager.func_179124_c(1.0F, 1.0F, 1.0F);
   }

   public final void ⲋ(@NotNull BlockPos var1, @NotNull Color var2) {
      this.ĂƂ(this.func_178180_c(), (double)var1.field_177962_a, (double)var1.field_177960_b, (double)var1.field_177961_c, 1.0D, 1.0D, 1.0D, var2.getRed(), var2.getGreen(), var2.getBlue(), var2.getAlpha(), lIIlIIIllI[11]);
   }

   private static boolean lIIlllIlIII(int var0) {
      return var0 != 0;
   }

   @NotNull
   public final BufferBuilder 〥ҳⱆ() {
      return this.func_178180_c();
   }

   public final void ⲋ(@NotNull BufferBuilder lIlIIllllllIIII, float lIlIIlllllIllll, float lIlIIlllllIlllI, float lIlIIlllllIllIl, float lIlIIlllllIllII, float lIlIIlllllIlIll, float lIlIIlllllIlIlI, int lIlIIlllllIlIIl, int lIlIIlllllIlIII, int lIlIIlllllIIlll, int lIlIIlllllIIllI, int lIlIIlllllIIlIl) {
      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[12])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[13])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[14])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[15])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[16])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[17])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[18])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[19])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[20])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[21])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[4])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

      if (lIIlllIlIII(lIlIIlllllIIlIl & lIIlIIIllI[22])) {
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
         lIlIIllllllIIII.func_181662_b((double)lIlIIlllllIllll + (double)lIlIIlllllIllII, (double)lIlIIlllllIlllI + (double)lIlIIlllllIlIll, (double)lIlIIlllllIllIl + (double)lIlIIlllllIlIlI).func_181669_b(lIlIIlllllIlIIl, lIlIIlllllIlIII, lIlIIlllllIIlll, lIlIIlllllIIllI).func_181675_d();
      }

   }

   private static void lIIlllIIlll() {
      lIIlIIIllI = new int[24];
      lIIlIIIllI[0] = -(-8195 & 29727) & -2146 & 24447;
      lIIlIIIllI[1] = -28765 & 29535;
      lIIlIIIllI[2] = (74 ^ 98) & ~(40 ^ 0);
      lIIlIIIllI[3] = " ".length();
      lIIlIIIllI[4] = 5 ^ 57 ^ 50 ^ 22;
      lIIlIIIllI[5] = 53 + 64 - 40 + 65 + 15 + 152 - 25 + 28 - (159 + 68 - 207 + 166) + 27 + 71 - 42 + 73;
      lIIlIIIllI[6] = 139 ^ 167 ^ 157 ^ 161;
      lIIlIIIllI[7] = 127 ^ 119;
      lIIlIIIllI[8] = "  ".length();
      lIIlIIIllI[9] = 13 + 142 - 9 + 22 ^ 166 + 150 - 307 + 163;
      lIIlIIIllI[10] = 29 ^ 61;
      lIIlIIIllI[11] = 227 ^ 133 ^ 224 ^ 186;
      lIIlIIIllI[12] = 7 + 102 - -11 + 58 ^ 81 + 99 - 148 + 131;
      lIIlIIIllI[13] = 26 ^ 8;
      lIIlIIIllI[14] = 155 ^ 186;
      lIIlIIIllI[15] = 141 ^ 175;
      lIIlIIIllI[16] = 57 ^ 60;
      lIIlIIIllI[17] = 62 ^ 56;
      lIIlIIIllI[18] = 188 ^ 181;
      lIIlIIIllI[19] = 77 + 129 - 62 + 10 ^ 59 + 52 - 0 + 33;
      lIIlIIIllI[20] = 177 ^ 165;
      lIIlIIIllI[21] = 161 ^ 133 ^ (82 ^ 109) & ~(37 ^ 26);
      lIIlIIIllI[22] = 3 ^ 43;
      lIIlIIIllI[23] = -3106 & 2100257;
   }

   public final void u() {
      this.func_78381_a();
   }

   public final void ⲋ(int var1) {
      this.ⲋ();
      this.ĂƂ(var1);
   }

   static {
      lIIlllIIlll();
      ᾣŦ var0 = new ᾣŦ();
      ⲋ = var0;
   }
}
