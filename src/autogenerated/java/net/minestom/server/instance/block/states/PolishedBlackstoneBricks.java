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
public final class PolishedBlackstoneBricks {
  public static final BlockState POLISHED_BLACKSTONE_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:polished_blackstone_bricks_0"), (short) 16259, Block.POLISHED_BLACKSTONE_BRICKS);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POLISHED_BLACKSTONE_BRICKS_0);
  }

  public static void initStates() {
    Block.POLISHED_BLACKSTONE_BRICKS.addBlockState(POLISHED_BLACKSTONE_BRICKS_0);
  }
}
