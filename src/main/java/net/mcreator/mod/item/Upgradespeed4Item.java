
package net.mcreator.mod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.mod.init.ModModTabs;

import java.util.List;

public class Upgradespeed4Item extends Item {
	public Upgradespeed4Item() {
		super(new Item.Properties().tab(ModModTabs.TAB_SUPERPICKAXEMOD).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Pour augmenter la puissance de l'ultime superpickaxe au niveau 4"));
	}
}
