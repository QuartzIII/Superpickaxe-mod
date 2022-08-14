
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModModTabs {
	public static CreativeModeTab TAB_SUPERPICKAXEMOD;

	public static void load() {
		TAB_SUPERPICKAXEMOD = new CreativeModeTab("tabsuperpickaxemod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ModModItems.DIAMANTCOMPRESSE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
