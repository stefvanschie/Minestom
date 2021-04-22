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
public final class Andesite {
  public static final BlockState ANDESITE_0 = new BlockState(NamespaceID.from("minecraft:andesite_0"), (short) 6, Block.ANDESITE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(ANDESITE_0);
  }

  public static void initStates() {
    Block.ANDESITE.addBlockState(ANDESITE_0);
  }
}
