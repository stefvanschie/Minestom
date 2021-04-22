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
public final class WallTorch {
  public static final BlockState WALL_TORCH_0 = new BlockState(NamespaceID.from("minecraft:wall_torch_0"), (short) 1436, Block.WALL_TORCH, "facing=north");

  public static final BlockState WALL_TORCH_1 = new BlockState(NamespaceID.from("minecraft:wall_torch_1"), (short) 1437, Block.WALL_TORCH, "facing=south");

  public static final BlockState WALL_TORCH_2 = new BlockState(NamespaceID.from("minecraft:wall_torch_2"), (short) 1438, Block.WALL_TORCH, "facing=west");

  public static final BlockState WALL_TORCH_3 = new BlockState(NamespaceID.from("minecraft:wall_torch_3"), (short) 1439, Block.WALL_TORCH, "facing=east");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(WALL_TORCH_0);
    Registry.BLOCK_STATE_REGISTRY.register(WALL_TORCH_1);
    Registry.BLOCK_STATE_REGISTRY.register(WALL_TORCH_2);
    Registry.BLOCK_STATE_REGISTRY.register(WALL_TORCH_3);
  }

  public static void initStates() {
    Block.WALL_TORCH.addBlockState(WALL_TORCH_0);
    Block.WALL_TORCH.addBlockState(WALL_TORCH_1);
    Block.WALL_TORCH.addBlockState(WALL_TORCH_2);
    Block.WALL_TORCH.addBlockState(WALL_TORCH_3);
  }
}
