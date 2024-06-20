
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PiglinSelectorItem extends Item {
	public PiglinSelectorItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		PiglinSelectorRightclickedProcedure.execute();
		return ar;
	}
}