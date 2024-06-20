
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.mobsbrawl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.icefighter.mobsbrawl.item.FireboltItem;
import net.icefighter.mobsbrawl.item.CreeperSelectorItem;
import net.icefighter.mobsbrawl.item.BlazeSelectorItem;
import net.icefighter.mobsbrawl.MobsBrawlMod;

public class MobsBrawlModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MobsBrawlMod.MODID);
	public static final RegistryObject<Item> BLAZE_SELECTOR = REGISTRY.register("blaze_selector", () -> new BlazeSelectorItem());
	public static final RegistryObject<Item> FIREBOLT = REGISTRY.register("firebolt", () -> new FireboltItem());
	public static final RegistryObject<Item> CREEPER_SELECTOR = REGISTRY.register("creeper_selector", () -> new CreeperSelectorItem());
	// Start of user code block custom items
	// End of user code block custom items
}
