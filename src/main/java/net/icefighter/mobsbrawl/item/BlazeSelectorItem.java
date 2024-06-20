
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.icefighter.mobsbrawl.procedures.BlazeSelectorRightclickedProcedure;

public class BlazeSelectorItem extends Item {
	public BlazeSelectorItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BlazeSelectorRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
