package net.icefighter.mobsbrawl.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class FireboltRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 3 && (entity instanceof Player _plrCldRem2 ? _plrCldRem2.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) <= 0) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getFireball(Level level, Entity shooter) {
						AbstractHurtingProjectile entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, level);
						entityToSpawn.setOwner(shooter);
						return entityToSpawn;
					}
				}.getFireball(projectileLevel, entity);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(1, 1, 1, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 60);
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-(3));
		}
	}
}
