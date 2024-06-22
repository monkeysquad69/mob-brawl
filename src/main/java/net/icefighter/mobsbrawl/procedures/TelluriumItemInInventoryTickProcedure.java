package net.icefighter.mobsbrawl.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TelluriumItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.giveExperienceLevels(10);
		itemstack.shrink(1);
	}
}
