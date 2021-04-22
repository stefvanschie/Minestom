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
public final class BoneBlock {
  public static final BlockState BONE_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:bone_block_0"), (short) 9260, Block.BONE_BLOCK, "axis=x");

  public static final BlockState BONE_BLOCK_1 = new BlockState(NamespaceID.from("minecraft:bone_block_1"), (short) 9261, Block.BONE_BLOCK, "axis=y");

  public static final BlockState BONE_BLOCK_2 = new BlockState(NamespaceID.from("minecraft:bone_block_2"), (short) 9262, Block.BONE_BLOCK, "axis=z");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(BONE_BLOCK_0);
    Registry.BLOCK_STATE_REGISTRY.register(BONE_BLOCK_1);
    Registry.BLOCK_STATE_REGISTRY.register(BONE_BLOCK_2);
  }

  public static void initStates() {
    Block.BONE_BLOCK.addBlockState(BONE_BLOCK_0);
    Block.BONE_BLOCK.addBlockState(BONE_BLOCK_1);
    Block.BONE_BLOCK.addBlockState(BONE_BLOCK_2);
  }
}
