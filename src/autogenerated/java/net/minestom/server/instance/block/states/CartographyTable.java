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
public final class CartographyTable {
  public static final BlockState CARTOGRAPHY_TABLE_0 = new BlockState(NamespaceID.from("minecraft:cartography_table_0"), (short) 14823, Block.CARTOGRAPHY_TABLE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(CARTOGRAPHY_TABLE_0);
  }

  public static void initStates() {
    Block.CARTOGRAPHY_TABLE.addBlockState(CARTOGRAPHY_TABLE_0);
  }
}
