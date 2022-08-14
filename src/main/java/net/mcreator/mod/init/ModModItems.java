
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mod.item.Upgradespeed4Item;
import net.mcreator.mod.item.Upgradespeed3Item;
import net.mcreator.mod.item.Upgradespeed2Item;
import net.mcreator.mod.item.Upgradespeed1Item;
import net.mcreator.mod.item.SuperpickaxeUltimeItem;
import net.mcreator.mod.item.Superpickaxe9Item;
import net.mcreator.mod.item.Superpickaxe8Item;
import net.mcreator.mod.item.Superpickaxe7Item;
import net.mcreator.mod.item.Superpickaxe6Item;
import net.mcreator.mod.item.Superpickaxe5Item;
import net.mcreator.mod.item.Superpickaxe4Item;
import net.mcreator.mod.item.Superpickaxe3Item;
import net.mcreator.mod.item.Superpickaxe2Item;
import net.mcreator.mod.item.Superpickaxe1Item;
import net.mcreator.mod.item.SuperdiamantItem;
import net.mcreator.mod.item.NetheritecompresseeItem;
import net.mcreator.mod.item.LivredeconnaisancesItem;
import net.mcreator.mod.item.DiamantcompresseItem;
import net.mcreator.mod.item.CompresseurItem;
import net.mcreator.mod.ModMod;

public class ModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModMod.MODID);
	public static final RegistryObject<Item> COMPRESSEUR = REGISTRY.register("compresseur", () -> new CompresseurItem());
	public static final RegistryObject<Item> DIAMANTCOMPRESSE = REGISTRY.register("diamantcompresse", () -> new DiamantcompresseItem());
	public static final RegistryObject<Item> SUPERPICKAXE_1 = REGISTRY.register("superpickaxe_1", () -> new Superpickaxe1Item());
	public static final RegistryObject<Item> SUPERPICKAXE_2 = REGISTRY.register("superpickaxe_2", () -> new Superpickaxe2Item());
	public static final RegistryObject<Item> SUPERDIAMANT = REGISTRY.register("superdiamant", () -> new SuperdiamantItem());
	public static final RegistryObject<Item> SUPERPICKAXE_3 = REGISTRY.register("superpickaxe_3", () -> new Superpickaxe3Item());
	public static final RegistryObject<Item> SUPERPICKAXE_4 = REGISTRY.register("superpickaxe_4", () -> new Superpickaxe4Item());
	public static final RegistryObject<Item> SUPERPICKAXE_5 = REGISTRY.register("superpickaxe_5", () -> new Superpickaxe5Item());
	public static final RegistryObject<Item> SUPERPICKAXE_6 = REGISTRY.register("superpickaxe_6", () -> new Superpickaxe6Item());
	public static final RegistryObject<Item> SUPERPICKAXE_7 = REGISTRY.register("superpickaxe_7", () -> new Superpickaxe7Item());
	public static final RegistryObject<Item> SUPERPICKAXE_8 = REGISTRY.register("superpickaxe_8", () -> new Superpickaxe8Item());
	public static final RegistryObject<Item> SUPERPICKAXE_9 = REGISTRY.register("superpickaxe_9", () -> new Superpickaxe9Item());
	public static final RegistryObject<Item> SUPERPICKAXE_ULTIME = REGISTRY.register("superpickaxe_ultime", () -> new SuperpickaxeUltimeItem());
	public static final RegistryObject<Item> UPGRADESPEED_1 = REGISTRY.register("upgradespeed_1", () -> new Upgradespeed1Item());
	public static final RegistryObject<Item> UPGRADESPEED_2 = REGISTRY.register("upgradespeed_2", () -> new Upgradespeed2Item());
	public static final RegistryObject<Item> UPGRADESPEED_3 = REGISTRY.register("upgradespeed_3", () -> new Upgradespeed3Item());
	public static final RegistryObject<Item> UPGRADESPEED_4 = REGISTRY.register("upgradespeed_4", () -> new Upgradespeed4Item());
	public static final RegistryObject<Item> UPGRADESCRAFTINGTABLE = block(ModModBlocks.UPGRADESCRAFTINGTABLE, ModModTabs.TAB_SUPERPICKAXEMOD);
	public static final RegistryObject<Item> NETHERITECOMPRESSEE = REGISTRY.register("netheritecompressee", () -> new NetheritecompresseeItem());
	public static final RegistryObject<Item> LIVREDECONNAISANCES = REGISTRY.register("livredeconnaisances", () -> new LivredeconnaisancesItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
