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
public final class Spawner {
  public static final BlockState SPAWNER_0 = new BlockState(NamespaceID.from("minecraft:spawner_0"), (short) 1953, Block.SPAWNER);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(SPAWNER_0);
  }

  public static void initStates() {
    Block.SPAWNER.addBlockState(SPAWNER_0);
  }
}
