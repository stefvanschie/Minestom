package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class OxeyeDaisy {
  public static final BlockState OXEYE_DAISY_0 = new BlockState(NamespaceID.from("minecraft:oxeye_daisy_0"), (short) 1421, Block.OXEYE_DAISY);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(OXEYE_DAISY_0);
  }

  public static void initStates() {
    Block.OXEYE_DAISY.addBlockState(OXEYE_DAISY_0);
  }
}
