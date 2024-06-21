
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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