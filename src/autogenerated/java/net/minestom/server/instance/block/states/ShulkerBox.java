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
public final class ShulkerBox {
  public static final BlockState SHULKER_BOX_0 = new BlockState(NamespaceID.from("minecraft:shulker_box_0"), (short) 9276, Block.SHULKER_BOX, "facing=north");

  public static final BlockState SHULKER_BOX_1 = new BlockState(NamespaceID.from("minecraft:shulker_box_1"), (short) 9277, Block.SHULKER_BOX, "facing=east");

  public static final BlockState SHULKER_BOX_2 = new BlockState(NamespaceID.from("minecraft:shulker_box_2"), (short) 9278, Block.SHULKER_BOX, "facing=south");

  public static final BlockState SHULKER_BOX_3 = new BlockState(NamespaceID.from("minecraft:shulker_box_3"), (short) 9279, Block.SHULKER_BOX, "facing=west");

  public static final BlockState SHULKER_BOX_4 = new BlockState(NamespaceID.from("minecraft:shulker_box_4"), (short) 9280, Block.SHULKER_BOX, "facing=up");

  public static final BlockState SHULKER_BOX_5 = new BlockState(NamespaceID.from("minecraft:shulker_box_5"), (short) 9281, Block.SHULKER_BOX, "facing=down");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(SHULKER_BOX_0);
    Registry.BLOCK_STATE_REGISTRY.register(SHULKER_BOX_1);
    Registry.BLOCK_STATE_REGISTRY.register(SHULKER_BOX_2);
    Registry.BLOCK_STATE_REGISTRY.register(SHULKER_BOX_3);
    Registry.BLOCK_STATE_REGISTRY.register(SHULKER_BOX_4);
    Registry.BLOCK_STATE_REGISTRY.register(SHULKER_BOX_5);
  }

  public static void initStates() {
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_0);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_1);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_2);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_3);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_4);
    Block.SHULKER_BOX.addBlockState(SHULKER_BOX_5);
  }
}
