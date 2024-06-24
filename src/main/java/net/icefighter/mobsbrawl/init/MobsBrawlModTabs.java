
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.icefighter.mobsbrawl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.icefighter.mobsbrawl.MobsBrawlMod;

public class MobsBrawlModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MobsBrawlMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOB_BRAWL = REGISTRY.register("mob_brawl",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mobs_brawl.mob_brawl")).icon(() -> new ItemStack(MobsBrawlModItems.CREEPER_SELECTOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MobsBrawlModItems.BLAZE_SELECTOR.get());
				tabData.accept(MobsBrawlModBlocks.TELLURIUM_ORE.get().asItem());
				tabData.accept(MobsBrawlModItems.TELLURIUM.get());
				tabData.accept(MobsBrawlModItems.CREEPER_SELECTOR.get());
				tabData.accept(MobsBrawlModItems.PIGLIN_SELECTOR.get());
				tabData.accept(MobsBrawlModItems.IRON_GOLEM_SELECTOR.get());
				tabData.accept(MobsBrawlModItems.REGEN.get());
				tabData.accept(MobsBrawlModItems.BOOM.get());
			})

					.build());
}
