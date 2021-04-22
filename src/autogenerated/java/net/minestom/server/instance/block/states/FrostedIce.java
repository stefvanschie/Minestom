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
public final class FrostedIce {
  public static final BlockState FROSTED_ICE_0 = new BlockState(NamespaceID.from("minecraft:frosted_ice_0"), (short) 9253, Block.FROSTED_ICE, "age=0");

  public static final BlockState FROSTED_ICE_1 = new BlockState(NamespaceID.from("minecraft:frosted_ice_1"), (short) 9254, Block.FROSTED_ICE, "age=1");

  public static final BlockState FROSTED_ICE_2 = new BlockState(NamespaceID.from("minecraft:frosted_ice_2"), (short) 9255, Block.FROSTED_ICE, "age=2");

  public static final BlockState FROSTED_ICE_3 = new BlockState(NamespaceID.from("minecraft:frosted_ice_3"), (short) 9256, Block.FROSTED_ICE, "age=3");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(FROSTED_ICE_0);
    Registry.BLOCK_STATE_REGISTRY.register(FROSTED_ICE_1);
    Registry.BLOCK_STATE_REGISTRY.register(FROSTED_ICE_2);
    Registry.BLOCK_STATE_REGISTRY.register(FROSTED_ICE_3);
  }

  public static void initStates() {
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_0);
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_1);
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_2);
    Block.FROSTED_ICE.addBlockState(FROSTED_ICE_3);
  }
}
