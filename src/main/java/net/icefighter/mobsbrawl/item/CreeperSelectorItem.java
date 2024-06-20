
package net.icefighter.mobsbrawl.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.icefighter.mobsbrawl.procedures.CreeperSelectorRightclickedProcedure;

public class CreeperSelectorItem extends Item {
	public CreeperSelectorItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CreeperSelectorRightclickedProcedure.execute();
		return ar;
	}
}
