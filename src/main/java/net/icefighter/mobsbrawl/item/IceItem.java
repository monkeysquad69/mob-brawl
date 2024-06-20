
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class IceItem extends Item {
	public IceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}