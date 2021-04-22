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
public final class StoneSlab {
  public static final BlockState STONE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:stone_slab_0"), (short) 8340, Block.STONE_SLAB, "type=top","waterlogged=true");

  public static final BlockState STONE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:stone_slab_1"), (short) 8341, Block.STONE_SLAB, "type=top","waterlogged=false");

  public static final BlockState STONE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:stone_slab_2"), (short) 8342, Block.STONE_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState STONE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:stone_slab_3"), (short) 8343, Block.STONE_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState STONE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:stone_slab_4"), (short) 8344, Block.STONE_SLAB, "type=double","waterlogged=true");

  public static final BlockState STONE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:stone_slab_5"), (short) 8345, Block.STONE_SLAB, "type=double","waterlogged=false");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(STONE_SLAB_0);
    Registry.BLOCK_STATE_REGISTRY.register(STONE_SLAB_1);
    Registry.BLOCK_STATE_REGISTRY.register(STONE_SLAB_2);
    Registry.BLOCK_STATE_REGISTRY.register(STONE_SLAB_3);
    Registry.BLOCK_STATE_REGISTRY.register(STONE_SLAB_4);
    Registry.BLOCK_STATE_REGISTRY.register(STONE_SLAB_5);
  }

  public static void initStates() {
    Block.STONE_SLAB.addBlockState(STONE_SLAB_0);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_1);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_2);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_3);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_4);
    Block.STONE_SLAB.addBlockState(STONE_SLAB_5);
  }
}
