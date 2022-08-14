
package net.mcreator.mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.mod.init.ModModTabs;

public class NetheritecompresseeItem extends Item {
	public NetheritecompresseeItem() {
		super(new Item.Properties().tab(ModModTabs.TAB_SUPERPICKAXEMOD).stacksTo(64).rarity(Rarity.RARE));
	}
}
