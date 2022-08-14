
package net.mcreator.mod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.mod.world.inventory.Livrepage3Menu;
import net.mcreator.mod.network.Livrepage3ButtonMessage;
import net.mcreator.mod.ModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Livrepage3Screen extends AbstractContainerScreen<Livrepage3Menu> {
	private final static HashMap<String, Object> guistate = Livrepage3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Livrepage3Screen(Livrepage3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 223;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mod:textures/screens/livrepage_3.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 20, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 32, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 48, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 64, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 80, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 112, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 144, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 160, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 176, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 20, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 68, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 84, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 100, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 116, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 132, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 20, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 68, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 84, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 116, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 100, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 132, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 176, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 160, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 144, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 132, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 32, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 48, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 64, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 80, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 112, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 148, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 68, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 84, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 100, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 116, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 20, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 68, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 84, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 116, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 132, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 100, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Pour faire un super diamant", 36, 22, -12829636);
		this.font.draw(poseStack, "Suivez les crafts ci-dessous", 35, 33, -12829636);
		this.font.draw(poseStack, "(Attention il y a des vitres", 36, 119, -12829636);
		this.font.draw(poseStack, "pas tr\u00E8s visibles)", 37, 130, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 192, this.topPos + 128, 15, 20, new TextComponent("->"), e -> {
			if (true) {
				ModMod.PACKET_HANDLER.sendToServer(new Livrepage3ButtonMessage(0, x, y, z));
				Livrepage3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
