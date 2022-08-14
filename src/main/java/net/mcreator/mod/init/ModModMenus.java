
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.mod.world.inventory.Livrepage6Menu;
import net.mcreator.mod.world.inventory.Livrepage5Menu;
import net.mcreator.mod.world.inventory.Livrepage4Menu;
import net.mcreator.mod.world.inventory.Livrepage3Menu;
import net.mcreator.mod.world.inventory.Livrepage2Menu;
import net.mcreator.mod.world.inventory.GuiupgradescraftingtableMenu;
import net.mcreator.mod.world.inventory.GuilivredesconnaissancesMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<GuiupgradescraftingtableMenu> GUIUPGRADESCRAFTINGTABLE = register("guiupgradescraftingtable",
			(id, inv, extraData) -> new GuiupgradescraftingtableMenu(id, inv, extraData));
	public static final MenuType<GuilivredesconnaissancesMenu> GUILIVREDESCONNAISSANCES = register("guilivredesconnaissances",
			(id, inv, extraData) -> new GuilivredesconnaissancesMenu(id, inv, extraData));
	public static final MenuType<Livrepage2Menu> LIVREPAGE_2 = register("livrepage_2",
			(id, inv, extraData) -> new Livrepage2Menu(id, inv, extraData));
	public static final MenuType<Livrepage4Menu> LIVREPAGE_4 = register("livrepage_4",
			(id, inv, extraData) -> new Livrepage4Menu(id, inv, extraData));
	public static final MenuType<Livrepage3Menu> LIVREPAGE_3 = register("livrepage_3",
			(id, inv, extraData) -> new Livrepage3Menu(id, inv, extraData));
	public static final MenuType<Livrepage5Menu> LIVREPAGE_5 = register("livrepage_5",
			(id, inv, extraData) -> new Livrepage5Menu(id, inv, extraData));
	public static final MenuType<Livrepage6Menu> LIVREPAGE_6 = register("livrepage_6",
			(id, inv, extraData) -> new Livrepage6Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
