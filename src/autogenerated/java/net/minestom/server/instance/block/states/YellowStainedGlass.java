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
public final class YellowStainedGlass {
  public static final BlockState YELLOW_STAINED_GLASS_0 = new BlockState(NamespaceID.from("minecraft:yellow_stained_glass_0"), (short) 4099, Block.YELLOW_STAINED_GLASS);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(YELLOW_STAINED_GLASS_0);
  }

  public static void initStates() {
    Block.YELLOW_STAINED_GLASS.addBlockState(YELLOW_STAINED_GLASS_0);
  }
}
