
package net.mcreator.mod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.mod.procedures.LivredeconnaisancesEvenementAuClicDroitDansLairProcedure;
import net.mcreator.mod.init.ModModTabs;

public class LivredeconnaisancesItem extends Item {
	public LivredeconnaisancesItem() {
		super(new Item.Properties().tab(ModModTabs.TAB_SUPERPICKAXEMOD).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LivredeconnaisancesEvenementAuClicDroitDansLairProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
