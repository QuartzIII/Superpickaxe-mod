
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mod.client.gui.Livrepage6Screen;
import net.mcreator.mod.client.gui.Livrepage5Screen;
import net.mcreator.mod.client.gui.Livrepage4Screen;
import net.mcreator.mod.client.gui.Livrepage3Screen;
import net.mcreator.mod.client.gui.Livrepage2Screen;
import net.mcreator.mod.client.gui.GuiupgradescraftingtableScreen;
import net.mcreator.mod.client.gui.GuilivredesconnaissancesScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ModModMenus.GUIUPGRADESCRAFTINGTABLE, GuiupgradescraftingtableScreen::new);
			MenuScreens.register(ModModMenus.GUILIVREDESCONNAISSANCES, GuilivredesconnaissancesScreen::new);
			MenuScreens.register(ModModMenus.LIVREPAGE_2, Livrepage2Screen::new);
			MenuScreens.register(ModModMenus.LIVREPAGE_4, Livrepage4Screen::new);
			MenuScreens.register(ModModMenus.LIVREPAGE_3, Livrepage3Screen::new);
			MenuScreens.register(ModModMenus.LIVREPAGE_5, Livrepage5Screen::new);
			MenuScreens.register(ModModMenus.LIVREPAGE_6, Livrepage6Screen::new);
		});
	}
}
