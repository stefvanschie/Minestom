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
public final class PottedAcaciaSapling {
  public static final BlockState POTTED_ACACIA_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:potted_acacia_sapling_0"), (short) 6314, Block.POTTED_ACACIA_SAPLING);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POTTED_ACACIA_SAPLING_0);
  }

  public static void initStates() {
    Block.POTTED_ACACIA_SAPLING.addBlockState(POTTED_ACACIA_SAPLING_0);
  }
}
