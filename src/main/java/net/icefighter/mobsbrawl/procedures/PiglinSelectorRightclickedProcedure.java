package net.icefighter.mobsbrawl.procedures;

import net.minecraftforge.eventbus.api.Event;

public class PiglinSelectorRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(MobsBrawlModItems.TRADE.get()).copy();
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		entity.getPersistentData().putString("Class", "Piglin");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.piglin.ambient")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.piglin.ambient")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		itemstack.shrink(1);
	}
}
