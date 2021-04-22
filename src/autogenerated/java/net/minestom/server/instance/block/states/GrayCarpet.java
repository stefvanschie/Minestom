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
public final class GrayCarpet {
  public static final BlockState GRAY_CARPET_0 = new BlockState(NamespaceID.from("minecraft:gray_carpet_0"), (short) 7877, Block.GRAY_CARPET);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(GRAY_CARPET_0);
  }

  public static void initStates() {
    Block.GRAY_CARPET.addBlockState(GRAY_CARPET_0);
  }
}
