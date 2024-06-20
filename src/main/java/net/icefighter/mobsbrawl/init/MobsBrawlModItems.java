
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.mobsbrawl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.icefighter.mobsbrawl.item.IceItem;
import net.icefighter.mobsbrawl.MobsBrawlMod;

public class MobsBrawlModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MobsBrawlMod.MODID);
	public static final RegistryObject<Item> ICE = REGISTRY.register("ice", () -> new IceItem());
	// Start of user code block custom items
	// End of user code block custom items
}
