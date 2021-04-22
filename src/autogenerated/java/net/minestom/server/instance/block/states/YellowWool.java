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
public final class YellowWool {
  public static final BlockState YELLOW_WOOL_0 = new BlockState(NamespaceID.from("minecraft:yellow_wool_0"), (short) 1388, Block.YELLOW_WOOL);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(YELLOW_WOOL_0);
  }

  public static void initStates() {
    Block.YELLOW_WOOL.addBlockState(YELLOW_WOOL_0);
  }
}
