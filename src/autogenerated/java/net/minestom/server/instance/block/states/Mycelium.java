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
public final class Mycelium {
  public static final BlockState MYCELIUM_0 = new BlockState(NamespaceID.from("minecraft:mycelium_0"), (short) 5016, Block.MYCELIUM, "snowy=true");

  public static final BlockState MYCELIUM_1 = new BlockState(NamespaceID.from("minecraft:mycelium_1"), (short) 5017, Block.MYCELIUM, "snowy=false");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(MYCELIUM_0);
    Registry.BLOCK_STATE_REGISTRY.register(MYCELIUM_1);
  }

  public static void initStates() {
    Block.MYCELIUM.addBlockState(MYCELIUM_0);
    Block.MYCELIUM.addBlockState(MYCELIUM_1);
  }
}
