
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

import net.mcreator.mod.world.inventory.GuilivredesconnaissancesMenu;
import net.mcreator.mod.network.GuilivredesconnaissancesButtonMessage;
import net.mcreator.mod.ModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuilivredesconnaissancesScreen extends AbstractContainerScreen<GuilivredesconnaissancesMenu> {
	private final static HashMap<String, Object> guistate = GuilivredesconnaissancesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuilivredesconnaissancesScreen(GuilivredesconnaissancesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 223;
		this.imageHeight = 159;
	}

	private static final ResourceLocation texture = new ResourceLocation("mod:textures/screens/guilivredesconnaissances.png");

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
		this.blit(ms, this.leftPos + 208, this.topPos + 128, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 32, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 48, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 64, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 80, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 112, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 144, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 160, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 176, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 48, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 80, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 96, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 208, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 48, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 80, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 96, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 192, this.topPos + 128, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 176, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 160, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 144, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_jaune.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 128, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 32, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 48, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 64, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 80, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 112, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 144, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 48, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 80, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 96, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_gris.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 48, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 80, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 128, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/pixel_dore_fonce.png"));
		this.blit(ms, this.leftPos + 16, this.topPos + 96, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/text_gui_netherite_compacte.png"));
		this.blit(ms, this.leftPos + 108, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/text_gui_superpickaxe_lvl1.png"));
		this.blit(ms, this.leftPos + 146, this.topPos + 101, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mod:textures/screens/text_gui_up1.png"));
		this.blit(ms, this.leftPos + 85, this.topPos + 118, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "", 321, 80, -12829636);
		this.font.draw(poseStack, "Le livre de connaissances", 48, 24, -12829636);
		this.font.draw(poseStack, "Dans ce livre vous apprendrez:", 32, 48, -12829636);
		this.font.draw(poseStack, "- Les crafts", 40, 64, -12829636);
		this.font.draw(poseStack, "- L'utilisation de la pioche", 40, 80, -12829636);
		this.font.draw(poseStack, "- Les am\u00E9liorations", 40, 96, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 192, this.topPos + 127, 17, 20, new TextComponent("->"), e -> {
			if (true) {
				ModMod.PACKET_HANDLER.sendToServer(new GuilivredesconnaissancesButtonMessage(0, x, y, z));
				GuilivredesconnaissancesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
