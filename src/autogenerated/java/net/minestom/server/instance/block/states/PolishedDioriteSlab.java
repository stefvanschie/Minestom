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
public final class PolishedDioriteSlab {
  public static final BlockState POLISHED_DIORITE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:polished_diorite_slab_0"), (short) 10811, Block.POLISHED_DIORITE_SLAB, "type=top","waterlogged=true");

  public static final BlockState POLISHED_DIORITE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:polished_diorite_slab_1"), (short) 10812, Block.POLISHED_DIORITE_SLAB, "type=top","waterlogged=false");

  public static final BlockState POLISHED_DIORITE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:polished_diorite_slab_2"), (short) 10813, Block.POLISHED_DIORITE_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState POLISHED_DIORITE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:polished_diorite_slab_3"), (short) 10814, Block.POLISHED_DIORITE_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState POLISHED_DIORITE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:polished_diorite_slab_4"), (short) 10815, Block.POLISHED_DIORITE_SLAB, "type=double","waterlogged=true");

  public static final BlockState POLISHED_DIORITE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:polished_diorite_slab_5"), (short) 10816, Block.POLISHED_DIORITE_SLAB, "type=double","waterlogged=false");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POLISHED_DIORITE_SLAB_0);
    Registry.BLOCK_STATE_REGISTRY.register(POLISHED_DIORITE_SLAB_1);
    Registry.BLOCK_STATE_REGISTRY.register(POLISHED_DIORITE_SLAB_2);
    Registry.BLOCK_STATE_REGISTRY.register(POLISHED_DIORITE_SLAB_3);
    Registry.BLOCK_STATE_REGISTRY.register(POLISHED_DIORITE_SLAB_4);
    Registry.BLOCK_STATE_REGISTRY.register(POLISHED_DIORITE_SLAB_5);
  }

  public static void initStates() {
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_0);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_1);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_2);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_3);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_4);
    Block.POLISHED_DIORITE_SLAB.addBlockState(POLISHED_DIORITE_SLAB_5);
  }
}
