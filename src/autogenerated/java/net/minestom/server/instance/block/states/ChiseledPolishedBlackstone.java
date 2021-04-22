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
public final class ChiseledPolishedBlackstone {
  public static final BlockState CHISELED_POLISHED_BLACKSTONE_0 = new BlockState(NamespaceID.from("minecraft:chiseled_polished_blackstone_0"), (short) 16261, Block.CHISELED_POLISHED_BLACKSTONE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(CHISELED_POLISHED_BLACKSTONE_0);
  }

  public static void initStates() {
    Block.CHISELED_POLISHED_BLACKSTONE.addBlockState(CHISELED_POLISHED_BLACKSTONE_0);
  }
}
