package net.mcreator.mod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.mod.init.ModModItems;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class GiveSuperpickaxeProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "lvl") == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_1.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_2.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_3.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_4.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_5.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_6.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_7.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_8.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_9.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "lvl") == 10) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModModItems.SUPERPICKAXE_ULTIME.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
