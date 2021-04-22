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
public final class RedConcrete {
  public static final BlockState RED_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:red_concrete_0"), (short) 9456, Block.RED_CONCRETE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(RED_CONCRETE_0);
  }

  public static void initStates() {
    Block.RED_CONCRETE.addBlockState(RED_CONCRETE_0);
  }
}
