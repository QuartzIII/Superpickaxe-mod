
package net.mcreator.mod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mod.init.ModModTabs;

public class SuperdiamantItem extends Item {
	public SuperdiamantItem() {
		super(new Item.Properties().tab(ModModTabs.TAB_SUPERPICKAXEMOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
