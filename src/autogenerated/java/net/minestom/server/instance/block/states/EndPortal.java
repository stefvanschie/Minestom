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
public final class EndPortal {
  public static final BlockState END_PORTAL_0 = new BlockState(NamespaceID.from("minecraft:end_portal_0"), (short) 5149, Block.END_PORTAL);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(END_PORTAL_0);
  }

  public static void initStates() {
    Block.END_PORTAL.addBlockState(END_PORTAL_0);
  }
}
