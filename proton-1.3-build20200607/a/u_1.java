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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogColors;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.event.RenderPlayerEvent.Post;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.ChunkEvent.Load;
import net.minecraftforge.event.world.ChunkEvent.Unload;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.input.Keyboard;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\bÇ\u0002\u0018\u00002\u00020DB\t\b\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\b\u0010\u0017J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\b\u0010\u0019J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\b\u0010\u001bJ\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\b\u0010\u001dJ\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\b\u0010\u001fJ\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020 H\u0007¢\u0006\u0004\b\b\u0010!J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\"H\u0007¢\u0006\u0004\b\b\u0010#J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020$H\u0007¢\u0006\u0004\b\b\u0010%J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020&H\u0007¢\u0006\u0004\b\b\u0010'J\u0019\u0010\b\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\b\b\u0010)J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020*H\u0007¢\u0006\u0004\b\b\u0010+J\u0017\u0010\u0006\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020*H\u0007¢\u0006\u0004\b\u0006\u0010+J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020,H\u0007¢\u0006\u0004\b\b\u0010-J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020.H\u0007¢\u0006\u0004\b\b\u0010/J\u0017\u0010\u0006\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u000200H\u0007¢\u0006\u0004\b\u0006\u00101J\u001d\u0010\b\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020302H\u0007¢\u0006\u0004\b\b\u00104J\u001d\u0010\b\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020305H\u0007¢\u0006\u0004\b\b\u00106J\u001d\u0010\u0006\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020702H\u0007¢\u0006\u0004\b\u0006\u00104J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u000208H\u0007¢\u0006\u0004\b\b\u00109J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020:H\u0007¢\u0006\u0004\b\b\u0010;J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u000200H\u0007¢\u0006\u0004\b\b\u00101J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020<H\u0007¢\u0006\u0004\b\b\u0010=J\u0019\u0010\b\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\b\b\u0010?J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020@H\u0007¢\u0006\u0004\b\b\u0010AR&\u0010\b\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0086\u000eR(\u0010\u0006\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\b\u0010\u000b\"\u0004\b\b\u0010\f¨\u0006\u0086\u000eR\u001a\u0010\u000f\u001a\u00020\r8C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000e¨\u0006\u0082\u0004R&\u0010\u0004\u001a\u00020\u00108\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\b\u0010\u0013¨\u0006\u0086\u000eR&\u0010\u0002\u001a\u00020\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\b\u0010\u0007¨\u0006\u0086\u000e"},
   d2 = {"La/u;", "", "〥ҳⱆ", "Z", "ᴃᎲ", "()Z", "ĂƂ", "(Z)V", "ⲋ", "Lnet/minecraft/client/multiplayer/ServerData;", "Lnet/minecraft/client/multiplayer/ServerData;", "()Lnet/minecraft/client/multiplayer/ServerData;", "(Lnet/minecraft/client/multiplayer/ServerData;)V", "Lnet/minecraft/client/Minecraft;", "()Lnet/minecraft/client/Minecraft;", "u", "", "F", "()F", "(F)V", "Lnet/minecraftforge/event/entity/player/AttackEntityEvent;", "p0", "", "(Lnet/minecraftforge/event/entity/player/AttackEntityEvent;)V", "Lnet/minecraftforge/client/event/ClientChatEvent;", "(Lnet/minecraftforge/client/event/ClientChatEvent;)V", "Lnet/minecraftforge/event/world/ChunkEvent$Load;", "(Lnet/minecraftforge/event/world/ChunkEvent$Load;)V", "Lnet/minecraftforge/event/world/ChunkEvent$Unload;", "(Lnet/minecraftforge/event/world/ChunkEvent$Unload;)V", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;", "(Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientConnectedToServerEvent;)V", "Lnet/minecraftforge/client/event/EntityViewRenderEvent$FogColors;", "(Lnet/minecraftforge/client/event/EntityViewRenderEvent$FogColors;)V", "Lnet/minecraftforge/client/event/EntityViewRenderEvent$FogDensity;", "(Lnet/minecraftforge/client/event/EntityViewRenderEvent$FogDensity;)V", "Lnet/minecraftforge/client/event/GuiOpenEvent;", "(Lnet/minecraftforge/client/event/GuiOpenEvent;)V", "Lnet/minecraftforge/client/event/InputUpdateEvent;", "(Lnet/minecraftforge/client/event/InputUpdateEvent;)V", "Lnet/minecraftforge/fml/common/gameevent/InputEvent$KeyInputEvent;", "(Lnet/minecraftforge/fml/common/gameevent/InputEvent$KeyInputEvent;)V", "Lnet/minecraftforge/client/event/MouseEvent;", "(Lnet/minecraftforge/client/event/MouseEvent;)V", "La/ꝱᶁ;", "(La/ꝱᶁ;)V", "La/Ꮐ꯴;", "(La/Ꮐ꯴;)V", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Pre;", "(Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Pre;)V", "Lnet/minecraftforge/client/event/RenderLivingEvent$Pre;", "Lnet/minecraft/entity/EntityLivingBase;", "(Lnet/minecraftforge/client/event/RenderLivingEvent$Pre;)V", "Lnet/minecraftforge/client/event/RenderLivingEvent$Post;", "(Lnet/minecraftforge/client/event/RenderLivingEvent$Post;)V", "Lnet/minecraft/entity/player/EntityPlayer;", "Lnet/minecraftforge/client/event/RenderPlayerEvent$Post;", "(Lnet/minecraftforge/client/event/RenderPlayerEvent$Post;)V", "Lnet/minecraftforge/client/event/RenderPlayerEvent$Pre;", "(Lnet/minecraftforge/client/event/RenderPlayerEvent$Pre;)V", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent;", "(Lnet/minecraftforge/fml/common/gameevent/TickEvent$RenderTickEvent;)V", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "(Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;)V", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "(Lnet/minecraftforge/client/event/RenderWorldLastEvent;)V", "<init>", "()V", ""}
)
public final class u {
   private static boolean lllllIIlll(Object var0) {
      return var0 != null;
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull Post var1) {
      ƶ.ⲋ((Object)var1);
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull Pre var1) {
      a.ᴃᎲ.u.ⲋ(lllIIlIIl[lllIIllIl[3]]);
   }

   private static String llllIllIlI(String lIlllIlIlllIllI, String lIlllIlIlllIIll) {
      try {
         double lIlllIlIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short lIlllIlIlllIIIl = Cipher.getInstance("Blowfish");
         lIlllIlIlllIIIl.init(lllIIllIl[1], lIlllIlIlllIIlI);
         return new String(lIlllIlIlllIIIl.doFinal(Base64.getDecoder().decode(lIlllIlIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(float var1) {
      u = var1;
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull GuiOpenEvent lIlllIllIllIIII) {
      if (lllllIIlII(lIlllIllIllIIII.getGui() instanceof GuiDisconnected)) {
         ơ߀ var3 = ơ߀.ⲋ;
         Class var4 = ᴟ.class;
         int lIlllIllIlIllII = lllIIllIl[0];
         Object var10000 = var3.ⲋ().get(ᴟ.class);
         if (lllllIIIll(var10000)) {
            throw new TypeCastException(lllIIlIIl[lllIIllIl[7]]);
         }

         long lIlllIllIlIllll = (ᴟ)((ⳅ)((ᴟ)var10000));
         if (lllllIIlII(lIlllIllIlIllll.ĂƂ())) {
            GuiScreen var10 = lIlllIllIllIIII.getGui();
            if (lllllIIIll(var10)) {
               throw new TypeCastException(lllIIlIIl[lllIIllIl[8]]);
            }

            long lIlllIllIlIlllI = (GuiDisconnected)var10;
            short lIlllIllIlIllIl = lllIIllIl[0];
            lIlllIllIlIllII = lllIIllIl[0];
            float lIlllIllIlIlIlI = lllIIllIl[0];
            lIlllIllIllIIII.setGui((GuiScreen)(new Ⴁ(lIlllIllIlIlllI.field_146307_h, lIlllIllIlIlllI.field_146306_a, lIlllIllIlIlllI.field_146304_f)));
         }
      }

   }

   @SubscribeEvent
   public final void ⲋ(@NotNull Unload var1) {
      ƶ.ⲋ((Object)var1);
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull RenderWorldLastEvent var1) {
      u = var1.getPartialTicks();
      ơ߀.ⲋ.ⲋ(var1);
   }

   static {
      lllllIIIII();
      llllIlllll();
      u var0 = new u();
      ⲋ = var0;
   }

   private static boolean lllllIIlII(int var0) {
      return var0 != 0;
   }

   @ȵ(
      ⲋ = 1000
   )
   public final void ⲋ(@NotNull ꝱᶁ var1) {
      Packet var2 = var1.ᴃᎲ();
      if (lllllIIlII(var2 instanceof SPacketChat)) {
         Ｓ꣙ὐ var3 = new Ｓ꣙ὐ(((SPacketChat)var1.ᴃᎲ()).field_148919_a);
         ƶ.ⲋ((Object)var3);
         if (lllllIIlII(var3.ⲋ())) {
            var1.ⲋ((boolean)lllIIllIl[2]);
            "".length();
            if ("  ".length() <= -" ".length()) {
               return;
            }
         }
      }

   }

   @JvmName(
      name = "ᴃᎲ"
   )
   public final boolean ᴃᎲ() {
      return 〥ҳⱆ;
   }

   private static boolean lllllIIIIl(int var0) {
      return var0 == 0;
   }

   private static boolean lllllIIIll(Object var0) {
      return var0 == null;
   }

   @JvmName(
      name = "〥ҳⱆ"
   )
   private final Minecraft 〥ҳⱆ() {
      return Minecraft.func_71410_x();
   }

   private static void llllIlllll() {
      lllIIlIIl = new String[lllIIllIl[13]];
      lllIIlIIl[lllIIllIl[0]] = llllIllIII("JIDDKXtkQxS8GmWyMnBUcHP7IA2++F0UbOGpXfHhXVIeSelqMmkhojCFP0zt8NBMeYWJQ8do0xc=", "KsSwg");
      lllIIlIIl[lllIIllIl[2]] = llllIllIlI("pL/zZzWiYco=", "SpSbA");
      lllIIlIIl[lllIIllIl[1]] = llllIllIlI("PkxTbF/M/22fvWrV6VuANQ==", "zlKOA");
      lllIIlIIl[lllIIllIl[3]] = llllIllIII("/KC8l4K0h0U=", "YGybg");
      lllIIlIIl[lllIIllIl[4]] = llllIllIll("AT0rCGwMKSkKIxtoJQFsDCk0EGwbJ2cKIwFlKREgA2gzHTwKaCoBYgE9JAgpGjtpFD4APCgKYgInIxEgCjtpEyMdJCNKCh0tIgctAg==", "oHGdL");
      lllIIlIIl[lllIIllIl[5]] = llllIllIII("3n7SbVV5v+M=", "Zttxa");
      lllIIlIIl[lllIIllIl[6]] = llllIllIII("JLaS30uuR4VrQTWBX4zRmSSOHECSKOI/pEZg3vccplOlK+CRftynrgsatDrgDOGddmRNeF6723nKVIXOl8WjDQWlaPACdoGam2zThvpz7eE=", "bJwEM");
      lllIIlIIl[lllIIllIl[7]] = llllIllIll("KAI8GnolFj4YNTJXMhN6JRYjAnoyGHAYNShaPgM2KlckDyojVz0TdCgCMxo/MwR+BigpAz8YdCsYNAM2IwR+GzM1FH43LzIYAhM5KRk+Ezky", "FwPvZ");
      lllIIlIIl[lllIIllIl[8]] = llllIllIII("VSp6gWYpEwsLxZbP/q7qfS5LfPSJQQ0WgCbXn1u5iALXfHwjZJQYeXT96ss92bscNHR8lcHLEW+aZ4QhtX+0CjluovSlDMBw13eK/W2SBOo=", "mURUJ");
      lllIIlIIl[lllIIllIl[9]] = llllIllIll("JSMcPmYoNx48KT92EjdmKDcDJmY/OVA8KSV7HicqJ3YEKzYudh03aCUjEz4jPiVeIjQkIh88aCY5FCcqLiVeICMlMhUgaAU5Nj0h", "KVpRF");
      lllIIlIIl[lllIIllIl[10]] = llllIllIII("NpohNGQrz/IAALpSlcfwRLfoLdz0KHKErntLM+Reb9zGLDECdlzsLrzUrzdBH8BVEf0O/016RH7yI0BkoX9Ur//7O702tmv9n8FePRVtMyh1s2kgqSUW5A==", "OMLjz");
      lllIIlIIl[lllIIllIl[11]] = llllIllIll("CDscO08FLx45ABJuEjJPBS8DI08SIVA5AAhjHiIDCm4ELh8Dbh0yQQg7EzsKEz1eJx0JOh85QQshFCIDAz1eJQoIKhUlQSghNjgI", "fNpWo");
      lllIIlIIl[lllIIllIl[12]] = llllIllIll("CSMHOlUENwU4GhN2CTNVBDcYIlUTOUs4Ggl7BSMZC3YfLwUCdgYzWwkjCDoQEiVFJgcIIgQ4Wwo5DyMZAiVFIRoVOg94MxUzDjUUCg==", "gVkVu");
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(boolean var1) {
      ᴃᎲ = var1;
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull AttackEntityEvent var1) {
      ƶ.ⲋ((Object)(new Ｆ(var1.getTarget())));
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public final void ⲋ(@NotNull ClientChatEvent lIlllIlllIllIlI) {
      String lIlllIlllIllIIl = lIlllIlllIllIlI.getMessage();
      if (!lllllIIIIl(StringsKt.startsWith$default(lIlllIlllIllIIl, ϛⰄ.ⲋ.u(), (boolean)lllIIllIl[0], lllIIllIl[1], (Object)null))) {
         lIlllIlllIllIlI.setCanceled((boolean)lllIIllIl[2]);

         try {
            lIlllIlllIllIll.〥ҳⱆ().field_71456_v.func_146158_b().func_146239_a(lIlllIlllIllIIl);
            if (!lllllIIIlI(lIlllIlllIllIIl.length(), lllIIllIl[2])) {
               return;
            }

            ϛⰄ var10000 = ϛⰄ.ⲋ;
            char lIlllIlllIlIlll = ϛⰄ.ⲋ.u().length();
            String lIlllIlllIlIlIl = var10000;
            Exception lIlllIlllIlIllI = lllIIllIl[0];
            if (lllllIIIll(lIlllIlllIllIIl)) {
               throw new TypeCastException(lllIIlIIl[lllIIllIl[0]]);
            }

            String var9 = lIlllIlllIllIIl.substring(lIlllIlllIlIlll);
            Intrinsics.checkExpressionValueIsNotNull(var9, lllIIlIIl[lllIIllIl[2]]);
            char lIlllIlllIlIlII = var9;
            lIlllIlllIlIlIl.ĂƂ(lIlllIlllIlIlII);
         } catch (Exception var8) {
            var8.printStackTrace();
            Y.ĂƂ.ⲋ(String.valueOf((new StringBuilder()).append(lllIIlIIl[lllIIllIl[1]]).append(var8.getMessage())));
            return;
         }

         "".length();
         if ("  ".length() > -" ".length()) {
            ;
         }
      }
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final float ĂƂ() {
      return u;
   }

   @SubscribeEvent
   public final void ĂƂ(@NotNull net.minecraftforge.client.event.RenderLivingEvent.Pre<EntityPlayer> var1) {
      if (lllllIIlII(〥ҳⱆ)) {
         this.〥ҳⱆ().field_175616_W.field_78734_h = (Entity)this.〥ҳⱆ().field_71439_g;
      }

   }

   private u() {
   }

   @JvmName(
      name = "u"
   )
   public final boolean u() {
      return ᴃᎲ;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final void ⲋ(@Nullable ServerData var1) {
      ĂƂ = var1;
   }

   @JvmName(
      name = "ĂƂ"
   )
   public final void ĂƂ(boolean var1) {
      〥ҳⱆ = var1;
   }

   @SubscribeEvent
   public final void ĂƂ(@NotNull Pre var1) {
      if (!lllllIIlII(var1.isCanceled())) {
         ơ߀.ⲋ.ς();
         ⱉȬ.ᴃᎲ.ʅ();
         if (lllllIIlII(lIlllIlllIIlIll.〥ҳⱆ().field_71462_r instanceof Ꚑ)) {
            ⱉȬ.ᴃᎲ.Ἠ();
            ⱉȬ.ᴃᎲ.ƺ();
         }

         boolean lIlllIlllIIlIII = ơ߀.ⲋ;
         char lIlllIlllIIIlll = ⴔ.class;
         byte lIlllIlllIIIllI = lllIIllIl[0];
         Object var10000 = lIlllIlllIIlIII.ⲋ().get(ⴔ.class);
         if (lllllIIIll(var10000)) {
            throw new TypeCastException(lllIIlIIl[lllIIllIl[4]]);
         } else {
            float lIlllIlllIIlIIl = (ⴔ)((ⳅ)((ⴔ)var10000));
            if (lllllIIlII(lIlllIlllIIlIIl.Ɏ()) && lllllIIlIl(lIlllIlllIIlIll.〥ҳⱆ().field_175622_Z, lIlllIlllIIlIIl.ϛⰄ())) {
               lIlllIlllIIlIll.〥ҳⱆ().func_175607_a((Entity)lIlllIlllIIlIll.〥ҳⱆ().field_71439_g);
            }

            a.ᴃᎲ.u.ĂƂ(lllIIlIIl[lllIIllIl[5]]);
         }
      }
   }

   private static String llllIllIll(String lIlllIlIllIIllI, String lIlllIlIllIIIII) {
      lIlllIlIllIIllI = new String(Base64.getDecoder().decode(lIlllIlIllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lIlllIlIllIIlII = new StringBuilder();
      short lIlllIlIlIllllI = lIlllIlIllIIIII.toCharArray();
      boolean lIlllIlIlIlllIl = lllIIllIl[0];
      int lIlllIlIlIlllII = lIlllIlIllIIllI.toCharArray();
      int lIlllIlIlIllIll = lIlllIlIlIlllII.length;
      int lIlllIlIlIllIlI = lllIIllIl[0];

      do {
         if (!lllllIlIII(lIlllIlIlIllIlI, lIlllIlIlIllIll)) {
            return String.valueOf(lIlllIlIllIIlII);
         }

         char lIlllIlIllIIlll = lIlllIlIlIlllII[lIlllIlIlIllIlI];
         lIlllIlIllIIlII.append((char)(lIlllIlIllIIlll ^ lIlllIlIlIllllI[lIlllIlIlIlllIl % lIlllIlIlIllllI.length]));
         "".length();
         ++lIlllIlIlIlllIl;
         ++lIlllIlIlIllIlI;
         "".length();
      } while((179 ^ 183) >= ((236 ^ 177) & ~(85 ^ 8)));

      return null;
   }

   @SubscribeEvent
   public final void ⲋ(@Nullable ClientTickEvent var1) {
      if (lllllIIlII(ⲉ.ⲋ.ĂƂ())) {
         ơ߀.ⲋ.Ἒⅾ();
      }

      if (lllllIIlll(lIlllIllIlllIII.〥ҳⱆ().field_71439_g) && lllllIIlII(a.ⲋ.ⲋ.ⲋ())) {
         lIlllIllIlllIII.〥ҳⱆ().field_71439_g = (EntityPlayerSP)null;
      }

   }

   @SubscribeEvent
   public final void ⲋ(@NotNull net.minecraftforge.client.event.RenderLivingEvent.Post<EntityLivingBase> var1) {
      ƶ.ⲋ((Object)var1);
   }

   @ȵ(
      ⲋ = -1000
   )
   public final void ⲋ(@NotNull Ꮐ꯴ var1) {
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull net.minecraftforge.client.event.RenderLivingEvent.Pre<EntityLivingBase> var1) {
      ƶ.ⲋ((Object)var1);
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull FogColors lIlllIllIIlIllI) {
      ơ߀ var3 = ơ߀.ⲋ;
      Class var4 = ᾙ.class;
      int var5 = lllIIllIl[0];
      Object var10000 = var3.ⲋ().get(ᾙ.class);
      if (lllllIIIll(var10000)) {
         throw new TypeCastException(lllIIlIIl[lllIIllIl[11]]);
      } else {
         char lIlllIllIIlIlIl = (ᾙ)((ⳅ)((ᾙ)var10000));
         if (lllllIIlII(lIlllIllIIlIlIl.Ɏ()) && lllllIIIIl(lIlllIllIIlIlIl.ⲋ())) {
            lIlllIllIIlIllI.setRed((float)lIlllIllIIlIlIl.u().getRed() / 255.0F);
            lIlllIllIIlIllI.setGreen((float)lIlllIllIIlIlIl.u().getGreen() / 255.0F);
            lIlllIllIIlIllI.setBlue((float)lIlllIllIIlIlIl.u().getBlue() / 255.0F);
         }

      }
   }

   private static boolean lllllIlIII(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lllllIIlIl(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lllllIIIlI(int var0, int var1) {
      return var0 > var1;
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull FogDensity lIlllIllIlIIIIl) {
      ơ߀ var3 = ơ߀.ⲋ;
      Class var4 = ᾙ.class;
      int var5 = lllIIllIl[0];
      Object var10000 = var3.ⲋ().get(ᾙ.class);
      if (lllllIIIll(var10000)) {
         throw new TypeCastException(lllIIlIIl[lllIIllIl[9]]);
      } else {
         boolean lIlllIllIlIIIII = (ᾙ)((ⳅ)((ᾙ)var10000));
         if (lllllIIlII(lIlllIllIlIIIII.Ɏ())) {
            GlStateManager.func_187430_a(lIlllIllIlIIIII.ᴃᎲ());
            lIlllIllIlIIIIl.setDensity((float)lIlllIllIlIIIII.ĂƂ());
            lIlllIllIlIIIIl.setCanceled((boolean)lllIIllIl[2]);
         }

         float lIlllIllIIllllI = ơ߀.ⲋ;
         Exception lIlllIllIIlllIl = ºẤ.class;
         long lIlllIllIIlllII = lllIIllIl[0];
         var10000 = lIlllIllIIllllI.ⲋ().get(ºẤ.class);
         if (lllllIIIll(var10000)) {
            throw new TypeCastException(lllIIlIIl[lllIIllIl[10]]);
         } else {
            double lIlllIllIIlllll = (ºẤ)((ⳅ)((ºẤ)var10000));
            if (lllllIIlII(lIlllIllIIlllll.Ɏ())) {
               lIlllIllIlIIIlI.〥ҳⱆ().field_71474_y.field_74333_Y = (float)lIlllIllIIlllll.ĂƂ();
            }

         }
      }
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull InputUpdateEvent var1) {
      Ծ var2 = Ծ.ⲋ;
      int var3 = lllIIllIl[0];
      int var4 = lllIIllIl[0];
      int var6 = lllIIllIl[0];
      var2.ⲋ(var1.getMovementInput().field_187255_c);
      var2.ĂƂ(var1.getMovementInput().field_187256_d);
      var2.u(var1.getMovementInput().field_187257_e);
      var2.ᴃᎲ(var1.getMovementInput().field_187258_f);
      var2.〥ҳⱆ(var1.getMovementInput().field_78901_c);
      var2.Ἒⅾ(var1.getMovementInput().field_78899_d);
      ƶ.ⲋ((Object)(new ἒű(var1.getMovementInput())));
   }

   @SubscribeEvent
   public final void ĂƂ(@NotNull MouseEvent var1) {
      ƶ.ⲋ((Object)var1);
   }

   private static String llllIllIII(String lIlllIlIlIIllll, String lIlllIlIlIIlllI) {
      try {
         String lIlllIlIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), lllIIllIl[8]), "DES");
         Exception lIlllIlIlIIllII = Cipher.getInstance("DES");
         lIlllIlIlIIllII.init(lllIIllIl[1], lIlllIlIlIIllIl);
         return new String(lIlllIlIlIIllII.doFinal(Base64.getDecoder().decode(lIlllIlIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull RenderTickEvent lIlllIllIlllllI) {
      ơ߀ var3 = ơ߀.ⲋ;
      Class var4 = ⴔ.class;
      int var5 = lllIIllIl[0];
      Object var10000 = var3.ⲋ().get(ⴔ.class);
      if (lllllIIIll(var10000)) {
         throw new TypeCastException(lllIIlIIl[lllIIllIl[6]]);
      } else {
         double lIlllIllIllllIl = (ⴔ)((ⳅ)((ⴔ)var10000));
         if (lllllIIlIl(lIlllIllIlllllI.phase, Phase.START)) {
            if (lllllIIlII(lIlllIllIllllIl.Ɏ())) {
               lIlllIllIllllll.〥ҳⱆ().func_175607_a((Entity)lIlllIllIllllIl.ϛⰄ());
               "".length();
               if ("  ".length() > "  ".length()) {
                  return;
               }
            }
         } else if (lllllIIlIl(lIlllIllIlllllI.phase, Phase.END) && lllllIIlII(lIlllIllIllllIl.Ɏ()) && lllllIIlII(Intrinsics.areEqual((Object)lIlllIllIllllIl.ϛⰄ(), (Object)lIlllIllIllllll.〥ҳⱆ().field_71439_g))) {
            lIlllIllIllllll.〥ҳⱆ().func_175607_a((Entity)lIlllIllIllllll.〥ҳⱆ().field_71439_g);
         }

      }
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull final ClientConnectedToServerEvent var1) {
      this.〥ҳⱆ().func_152344_a((Runnable)(new Runnable() {
         public final void run() {
            ƶ.ⲋ((Object)var1);
         }
      }));
      "".length();
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL,
      receiveCanceled = true
   )
   public final void ⲋ(@Nullable KeyInputEvent var1) {
      if (!lllllIIIIl(Keyboard.getEventKeyState())) {
         ơ߀.ⲋ.ⲋ(Keyboard.getEventKey());
      }
   }

   @SubscribeEvent
   public final void ⲋ(@NotNull net.minecraftforge.client.event.RenderPlayerEvent.Pre lIlllIllIIIlIlI) {
      ơ߀ var3 = ơ߀.ⲋ;
      Class var4 = ⴔ.class;
      int var5 = lllIIllIl[0];
      Object var10000 = var3.ⲋ().get(ⴔ.class);
      if (lllllIIIll(var10000)) {
         throw new TypeCastException(lllIIlIIl[lllIIllIl[12]]);
      } else {
         short lIlllIllIIIlIIl = (ⴔ)((ⳅ)((ⴔ)var10000));
         if (lllllIIlII(lIlllIllIIIlIIl.Ɏ()) && lllllIIlII(lIlllIllIIIlIlI.getEntityPlayer().func_175144_cb())) {
            lIlllIllIIIlIll.〥ҳⱆ().field_175616_W.field_78734_h = (Entity)lIlllIllIIIlIll.〥ҳⱆ().field_71439_g;
            〥ҳⱆ = (boolean)lllIIllIl[2];
         }

         ƶ.ⲋ((Object)lIlllIllIIIlIlI);
      }
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL,
      receiveCanceled = true
   )
   public final void ⲋ(@NotNull MouseEvent var1) {
      if (lllllIIlII(var1.isButtonstate()) && lllllIIIlI(var1.getButton(), lllIIllIl[2])) {
         ơ߀.ⲋ.ⲋ(-var1.getButton());
      }

   }

   @SubscribeEvent
   public final void ⲋ(@NotNull Load var1) {
      ƶ.ⲋ((Object)var1);
   }

   private static void lllllIIIII() {
      lllIIllIl = new int[14];
      lllIIllIl[0] = (91 ^ 125) & ~(125 ^ 91);
      lllIIllIl[1] = "  ".length();
      lllIIllIl[2] = " ".length();
      lllIIllIl[3] = "   ".length();
      lllIIllIl[4] = 182 ^ 178;
      lllIIllIl[5] = 0 ^ 117 ^ 177 ^ 193;
      lllIIllIl[6] = 63 ^ 57;
      lllIIllIl[7] = 30 ^ 117 ^ 82 ^ 62;
      lllIIllIl[8] = 7 ^ 15;
      lllIIllIl[9] = 148 + 122 - 221 + 136 ^ 28 + 94 - -13 + 41;
      lllIIllIl[10] = 67 ^ 62 ^ 78 ^ 57;
      lllIIllIl[11] = 74 ^ 65;
      lllIIllIl[12] = 140 ^ 147 ^ 29 ^ 14;
      lllIIllIl[13] = 41 ^ 101 ^ 110 ^ 47;
   }

   @JvmName(
      name = "ⲋ"
   )
   public final ServerData ⲋ() {
      return ĂƂ;
   }
}
