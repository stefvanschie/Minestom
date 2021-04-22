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
public final class YellowConcrete {
  public static final BlockState YELLOW_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:yellow_concrete_0"), (short) 9446, Block.YELLOW_CONCRETE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(YELLOW_CONCRETE_0);
  }

  public static void initStates() {
    Block.YELLOW_CONCRETE.addBlockState(YELLOW_CONCRETE_0);
  }
}
