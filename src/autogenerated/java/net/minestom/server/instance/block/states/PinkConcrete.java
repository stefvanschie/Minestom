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
public final class PinkConcrete {
  public static final BlockState PINK_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:pink_concrete_0"), (short) 9448, Block.PINK_CONCRETE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(PINK_CONCRETE_0);
  }

  public static void initStates() {
    Block.PINK_CONCRETE.addBlockState(PINK_CONCRETE_0);
  }
}
