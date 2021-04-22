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
public final class Stonecutter {
  public static final BlockState STONECUTTER_0 = new BlockState(NamespaceID.from("minecraft:stonecutter_0"), (short) 14854, Block.STONECUTTER, "facing=north");

  public static final BlockState STONECUTTER_1 = new BlockState(NamespaceID.from("minecraft:stonecutter_1"), (short) 14855, Block.STONECUTTER, "facing=south");

  public static final BlockState STONECUTTER_2 = new BlockState(NamespaceID.from("minecraft:stonecutter_2"), (short) 14856, Block.STONECUTTER, "facing=west");

  public static final BlockState STONECUTTER_3 = new BlockState(NamespaceID.from("minecraft:stonecutter_3"), (short) 14857, Block.STONECUTTER, "facing=east");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(STONECUTTER_0);
    Registry.BLOCK_STATE_REGISTRY.register(STONECUTTER_1);
    Registry.BLOCK_STATE_REGISTRY.register(STONECUTTER_2);
    Registry.BLOCK_STATE_REGISTRY.register(STONECUTTER_3);
  }

  public static void initStates() {
    Block.STONECUTTER.addBlockState(STONECUTTER_0);
    Block.STONECUTTER.addBlockState(STONECUTTER_1);
    Block.STONECUTTER.addBlockState(STONECUTTER_2);
    Block.STONECUTTER.addBlockState(STONECUTTER_3);
  }
}
