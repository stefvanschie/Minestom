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
public final class PottedCrimsonFungus {
  public static final BlockState POTTED_CRIMSON_FUNGUS_0 = new BlockState(NamespaceID.from("minecraft:potted_crimson_fungus_0"), (short) 15842, Block.POTTED_CRIMSON_FUNGUS);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POTTED_CRIMSON_FUNGUS_0);
  }

  public static void initStates() {
    Block.POTTED_CRIMSON_FUNGUS.addBlockState(POTTED_CRIMSON_FUNGUS_0);
  }
}
