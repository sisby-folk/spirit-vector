package symbolics.division.spirit.vector.sfx;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import symbolics.division.spirit.vector.SpiritVectorSounds;

public class AudioGirl {

    public static void step(PlayerEntity player, BlockState state) {
        BlockSoundGroup blockSoundGroup = state.getSoundGroup();
        player.playSound(SpiritVectorSounds.STEP, blockSoundGroup.getVolume() * 0.1f, blockSoundGroup.getPitch());
    }

    public static void burst(PlayerEntity player, BlockPos pos) {
        player.getWorld().playSound(
                null, pos, SpiritVectorSounds.BURST, SoundCategory.PLAYERS, 0.2f, 1
        );
    }


}
