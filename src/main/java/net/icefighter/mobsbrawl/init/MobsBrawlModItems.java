
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.mobsbrawl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.icefighter.mobsbrawl.item.TradeItem;
import net.icefighter.mobsbrawl.item.TelluriumItem;
import net.icefighter.mobsbrawl.item.RegenItem;
import net.icefighter.mobsbrawl.item.PiglinSelectorItem;
import net.icefighter.mobsbrawl.item.IronGolemSelectorItem;
import net.icefighter.mobsbrawl.item.FireboltItem;
import net.icefighter.mobsbrawl.item.CreeperSelectorItem;
import net.icefighter.mobsbrawl.item.BoomItem;
import net.icefighter.mobsbrawl.item.BlazeSelectorItem;
import net.icefighter.mobsbrawl.MobsBrawlMod;

public class MobsBrawlModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MobsBrawlMod.MODID);
	public static final RegistryObject<Item> FIREBOLT = REGISTRY.register("firebolt", () -> new FireboltItem());
	public static final RegistryObject<Item> BLAZE_SELECTOR = REGISTRY.register("blaze_selector", () -> new BlazeSelectorItem());
	public static final RegistryObject<Item> TRADE = REGISTRY.register("trade", () -> new TradeItem());
	public static final RegistryObject<Item> PIGLIN_SELECTOR = REGISTRY.register("piglin_selector", () -> new PiglinSelectorItem());
	public static final RegistryObject<Item> TELLURIUM_ORE = block(MobsBrawlModBlocks.TELLURIUM_ORE);
	public static final RegistryObject<Item> TELLURIUM = REGISTRY.register("tellurium", () -> new TelluriumItem());
	public static final RegistryObject<Item> CREEPER_SELECTOR = REGISTRY.register("creeper_selector", () -> new CreeperSelectorItem());
	public static final RegistryObject<Item> IRON_GOLEM_SELECTOR = REGISTRY.register("iron_golem_selector", () -> new IronGolemSelectorItem());
	public static final RegistryObject<Item> REGEN = REGISTRY.register("regen", () -> new RegenItem());
	public static final RegistryObject<Item> BOOM = REGISTRY.register("boom", () -> new BoomItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
