
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IceItem extends Item {
	public IceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
