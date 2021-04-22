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
public final class SoulSoil {
  public static final BlockState SOUL_SOIL_0 = new BlockState(NamespaceID.from("minecraft:soul_soil_0"), (short) 4001, Block.SOUL_SOIL);

  static {
    Registry.BLOCK_STATE_REGISTRY.register(SOUL_SOIL_0);
  }

  public static void initStates() {
    Block.SOUL_SOIL.addBlockState(SOUL_SOIL_0);
  }
}
