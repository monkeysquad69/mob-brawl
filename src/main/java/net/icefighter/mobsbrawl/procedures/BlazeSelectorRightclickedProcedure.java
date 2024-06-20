package net.icefighter.mobsbrawl.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class BlazeSelectorRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("Class", "Blaze");
		itemstack.shrink(1);
	}
}
