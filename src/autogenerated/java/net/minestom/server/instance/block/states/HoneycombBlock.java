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
public final class HoneycombBlock {
  public static final BlockState HONEYCOMB_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:honeycomb_block_0"), (short) 15833, Block.HONEYCOMB_BLOCK);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(HONEYCOMB_BLOCK_0);
  }

  public static void initStates() {
    Block.HONEYCOMB_BLOCK.addBlockState(HONEYCOMB_BLOCK_0);
  }
}
