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
public final class EmeraldOre {
  public static final BlockState EMERALD_ORE_0 = new BlockState(NamespaceID.from("minecraft:emerald_ore_0"), (short) 5254, Block.EMERALD_ORE);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(EMERALD_ORE_0);
  }

  public static void initStates() {
    Block.EMERALD_ORE.addBlockState(EMERALD_ORE_0);
  }
}
