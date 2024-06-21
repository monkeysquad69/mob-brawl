
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.mobsbrawl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.icefighter.mobsbrawl.block.TelluriumOreBlock;
import net.icefighter.mobsbrawl.MobsBrawlMod;

public class MobsBrawlModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MobsBrawlMod.MODID);
	public static final RegistryObject<Block> TELLURIUM_ORE = REGISTRY.register("tellurium_ore", () -> new TelluriumOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
