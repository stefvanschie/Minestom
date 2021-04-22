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
public final class PoweredRail {
  public static final BlockState POWERED_RAIL_0 = new BlockState(NamespaceID.from("minecraft:powered_rail_0"), (short) 1305, Block.POWERED_RAIL, "powered=true","shape=north_south");

  public static final BlockState POWERED_RAIL_1 = new BlockState(NamespaceID.from("minecraft:powered_rail_1"), (short) 1306, Block.POWERED_RAIL, "powered=true","shape=east_west");

  public static final BlockState POWERED_RAIL_2 = new BlockState(NamespaceID.from("minecraft:powered_rail_2"), (short) 1307, Block.POWERED_RAIL, "powered=true","shape=ascending_east");

  public static final BlockState POWERED_RAIL_3 = new BlockState(NamespaceID.from("minecraft:powered_rail_3"), (short) 1308, Block.POWERED_RAIL, "powered=true","shape=ascending_west");

  public static final BlockState POWERED_RAIL_4 = new BlockState(NamespaceID.from("minecraft:powered_rail_4"), (short) 1309, Block.POWERED_RAIL, "powered=true","shape=ascending_north");

  public static final BlockState POWERED_RAIL_5 = new BlockState(NamespaceID.from("minecraft:powered_rail_5"), (short) 1310, Block.POWERED_RAIL, "powered=true","shape=ascending_south");

  public static final BlockState POWERED_RAIL_6 = new BlockState(NamespaceID.from("minecraft:powered_rail_6"), (short) 1311, Block.POWERED_RAIL, "powered=false","shape=north_south");

  public static final BlockState POWERED_RAIL_7 = new BlockState(NamespaceID.from("minecraft:powered_rail_7"), (short) 1312, Block.POWERED_RAIL, "powered=false","shape=east_west");

  public static final BlockState POWERED_RAIL_8 = new BlockState(NamespaceID.from("minecraft:powered_rail_8"), (short) 1313, Block.POWERED_RAIL, "powered=false","shape=ascending_east");

  public static final BlockState POWERED_RAIL_9 = new BlockState(NamespaceID.from("minecraft:powered_rail_9"), (short) 1314, Block.POWERED_RAIL, "powered=false","shape=ascending_west");

  public static final BlockState POWERED_RAIL_10 = new BlockState(NamespaceID.from("minecraft:powered_rail_10"), (short) 1315, Block.POWERED_RAIL, "powered=false","shape=ascending_north");

  public static final BlockState POWERED_RAIL_11 = new BlockState(NamespaceID.from("minecraft:powered_rail_11"), (short) 1316, Block.POWERED_RAIL, "powered=false","shape=ascending_south");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_0);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_1);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_2);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_3);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_4);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_5);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_6);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_7);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_8);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_9);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_10);
    Registry.BLOCK_STATE_REGISTRY.register(POWERED_RAIL_11);
  }

  public static void initStates() {
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_0);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_1);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_2);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_3);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_4);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_5);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_6);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_7);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_8);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_9);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_10);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_11);
  }
}
