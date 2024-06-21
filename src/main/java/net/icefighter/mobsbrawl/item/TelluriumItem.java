
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.icefighter.mobsbrawl.procedures.TelluriumItemInInventoryTickProcedure;

public class TelluriumItem extends Item {
	public TelluriumItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		TelluriumItemInInventoryTickProcedure.execute(entity, itemstack);
	}
}
