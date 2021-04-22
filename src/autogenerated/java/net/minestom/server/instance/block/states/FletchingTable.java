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
public final class FletchingTable {
  public static final BlockState FLETCHING_TABLE_0 = new BlockState(NamespaceID.from("minecraft:fletching_table_0"), (short) 14824, Block.FLETCHING_TABLE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(FLETCHING_TABLE_0);
  }

  public static void initStates() {
    Block.FLETCHING_TABLE.addBlockState(FLETCHING_TABLE_0);
  }
}
