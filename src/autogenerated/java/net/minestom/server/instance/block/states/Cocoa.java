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
public final class Cocoa {
  public static final BlockState COCOA_0 = new BlockState(NamespaceID.from("minecraft:cocoa_0"), (short) 5162, Block.COCOA, "age=0","facing=north");

  public static final BlockState COCOA_1 = new BlockState(NamespaceID.from("minecraft:cocoa_1"), (short) 5163, Block.COCOA, "age=0","facing=south");

  public static final BlockState COCOA_2 = new BlockState(NamespaceID.from("minecraft:cocoa_2"), (short) 5164, Block.COCOA, "age=0","facing=west");

  public static final BlockState COCOA_3 = new BlockState(NamespaceID.from("minecraft:cocoa_3"), (short) 5165, Block.COCOA, "age=0","facing=east");

  public static final BlockState COCOA_4 = new BlockState(NamespaceID.from("minecraft:cocoa_4"), (short) 5166, Block.COCOA, "age=1","facing=north");

  public static final BlockState COCOA_5 = new BlockState(NamespaceID.from("minecraft:cocoa_5"), (short) 5167, Block.COCOA, "age=1","facing=south");

  public static final BlockState COCOA_6 = new BlockState(NamespaceID.from("minecraft:cocoa_6"), (short) 5168, Block.COCOA, "age=1","facing=west");

  public static final BlockState COCOA_7 = new BlockState(NamespaceID.from("minecraft:cocoa_7"), (short) 5169, Block.COCOA, "age=1","facing=east");

  public static final BlockState COCOA_8 = new BlockState(NamespaceID.from("minecraft:cocoa_8"), (short) 5170, Block.COCOA, "age=2","facing=north");

  public static final BlockState COCOA_9 = new BlockState(NamespaceID.from("minecraft:cocoa_9"), (short) 5171, Block.COCOA, "age=2","facing=south");

  public static final BlockState COCOA_10 = new BlockState(NamespaceID.from("minecraft:cocoa_10"), (short) 5172, Block.COCOA, "age=2","facing=west");

  public static final BlockState COCOA_11 = new BlockState(NamespaceID.from("minecraft:cocoa_11"), (short) 5173, Block.COCOA, "age=2","facing=east");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_0);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_1);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_2);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_3);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_4);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_5);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_6);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_7);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_8);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_9);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_10);
    Registry.BLOCK_STATE_REGISTRY.register(COCOA_11);
  }

  public static void initStates() {
    Block.COCOA.addBlockState(COCOA_0);
    Block.COCOA.addBlockState(COCOA_1);
    Block.COCOA.addBlockState(COCOA_2);
    Block.COCOA.addBlockState(COCOA_3);
    Block.COCOA.addBlockState(COCOA_4);
    Block.COCOA.addBlockState(COCOA_5);
    Block.COCOA.addBlockState(COCOA_6);
    Block.COCOA.addBlockState(COCOA_7);
    Block.COCOA.addBlockState(COCOA_8);
    Block.COCOA.addBlockState(COCOA_9);
    Block.COCOA.addBlockState(COCOA_10);
    Block.COCOA.addBlockState(COCOA_11);
  }
}
