package symbolics.division.spirit.vector.sfx;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.GlowParticle;

public class ClientSFX {

    public static void registerAll() {
        for (SimpleSFX sfx : SpiritVectorSFX.getSimpleSFX()) {
            ParticleFactoryRegistry.getInstance().register(sfx.particleType(), GlowParticle.GlowFactory::new);
        }
    }
}
