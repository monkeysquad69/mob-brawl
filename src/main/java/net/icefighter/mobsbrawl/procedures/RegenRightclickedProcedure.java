package net.icefighter.mobsbrawl.procedures;

import net.minecraftforge.eventbus.api.Event;

public class RegenRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 20 || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && (entity instanceof Player _plrCldRem3 ? _plrCldRem3.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) <= 0) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 300);
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-(20));
		}
	}
}