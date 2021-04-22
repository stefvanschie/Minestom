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
public final class CrackedNetherBricks {
  public static final BlockState CRACKED_NETHER_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:cracked_nether_bricks_0"), (short) 17110, Block.CRACKED_NETHER_BRICKS);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(CRACKED_NETHER_BRICKS_0);
  }

  public static void initStates() {
    Block.CRACKED_NETHER_BRICKS.addBlockState(CRACKED_NETHER_BRICKS_0);
  }
}
