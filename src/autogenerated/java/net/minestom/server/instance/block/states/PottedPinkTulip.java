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
public final class PottedPinkTulip {
  public static final BlockState POTTED_PINK_TULIP_0 = new BlockState(NamespaceID.from("minecraft:potted_pink_tulip_0"), (short) 6325, Block.POTTED_PINK_TULIP);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POTTED_PINK_TULIP_0);
  }

  public static void initStates() {
    Block.POTTED_PINK_TULIP.addBlockState(POTTED_PINK_TULIP_0);
  }
}
