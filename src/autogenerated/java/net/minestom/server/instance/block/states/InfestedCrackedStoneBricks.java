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
public final class InfestedCrackedStoneBricks {
  public static final BlockState INFESTED_CRACKED_STONE_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:infested_cracked_stone_bricks_0"), (short) 4503, Block.INFESTED_CRACKED_STONE_BRICKS);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(INFESTED_CRACKED_STONE_BRICKS_0);
  }

  public static void initStates() {
    Block.INFESTED_CRACKED_STONE_BRICKS.addBlockState(INFESTED_CRACKED_STONE_BRICKS_0);
  }
}
