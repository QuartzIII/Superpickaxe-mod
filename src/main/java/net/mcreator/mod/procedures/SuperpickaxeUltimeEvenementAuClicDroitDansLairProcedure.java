package net.mcreator.mod.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.mod.init.ModModItems;

import java.util.Map;

public class SuperpickaxeUltimeEvenementAuClicDroitDansLairProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("speed4") == true) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Impossible d'augmenter la puissance de la pioche au dessus du niveau 4"), (true));
		} else if (itemstack.getOrCreateTag().getBoolean("speed3") == true) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(ModModItems.UPGRADESPEED_4.get()))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ModModItems.UPGRADESPEED_4.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
						_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				itemstack.getOrCreateTag().putBoolean("speed4", (true));
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 10);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Votre pioche Ultime viens de passer au niveau 4"), (true));
			}
		} else if (itemstack.getOrCreateTag().getBoolean("speed2") == true) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(ModModItems.UPGRADESPEED_3.get()))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ModModItems.UPGRADESPEED_3.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
						_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				itemstack.getOrCreateTag().putBoolean("speed3", (true));
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Votre pioche Ultime viens de passer au niveau 3"), (true));
			}
		} else if (itemstack.getOrCreateTag().getBoolean("speed1") == true) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(ModModItems.UPGRADESPEED_2.get()))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ModModItems.UPGRADESPEED_2.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
						_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				itemstack.getOrCreateTag().putBoolean("speed2", (true));
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 4);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Votre pioche Ultime viens de passer au niveau 2"), (true));
			}
		} else if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(ModModItems.UPGRADESPEED_1.get()))
				: false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ModModItems.UPGRADESPEED_1.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			itemstack.getOrCreateTag().putBoolean("speed1", (true));
			(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 2);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Votre pioche Ultime viens de passer au niveau 1"), (true));
		}
	}
}
