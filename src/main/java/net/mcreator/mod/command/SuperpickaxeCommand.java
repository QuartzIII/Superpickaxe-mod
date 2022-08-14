
package net.mcreator.mod.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.mod.procedures.GiveSuperpickaxeToPlayerProcedure;
import net.mcreator.mod.procedures.GiveSuperpickaxeProcedure;
import net.mcreator.mod.procedures.GiveSuperpickaxeNoLvlProcedure;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SuperpickaxeCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(
				Commands.literal("superpickaxe").requires(s -> s.hasPermission(2)).then(Commands.argument("lvl", DoubleArgumentType.doubleArg(1, 10))
						.then(Commands.argument("player", EntityArgument.players()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							GiveSuperpickaxeToPlayerProcedure.execute(arguments);
							return 0;
						})).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							GiveSuperpickaxeProcedure.execute(arguments, entity);
							return 0;
						})).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							GiveSuperpickaxeNoLvlProcedure.execute(entity);
							return 0;
						}));
	}
}
