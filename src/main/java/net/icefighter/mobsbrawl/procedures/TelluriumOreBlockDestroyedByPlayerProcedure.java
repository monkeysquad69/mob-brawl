package net.icefighter.mobsbrawl.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TelluriumOreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
	}
}
