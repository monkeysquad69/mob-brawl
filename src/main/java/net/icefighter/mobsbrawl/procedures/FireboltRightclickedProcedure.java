package net.icefighter.mobsbrawl.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FireboltRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 3 || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) && (entity instanceof Player _plrCldRem3 ? _plrCldRem3.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) <= 0) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
						AbstractHurtingProjectile entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.xPower = ax;
						entityToSpawn.yPower = ay;
						entityToSpawn.zPower = az;
						return entityToSpawn;
					}
				}.getFireball(projectileLevel, entity, (entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z));
				_entityToSpawn.setPos(x, (y + 1), z);
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-(3));
		}
	}
}
