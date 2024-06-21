
package net.icefighter.mobsbrawl.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TelluriumOreBlock extends Block {
	public TelluriumOreBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(3f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		TelluriumOreBlockDestroyedByPlayerProcedure.execute();
		return retval;
	}
}