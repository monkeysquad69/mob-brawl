
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class RegenItem extends Item {
	public RegenItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		RegenRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}