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
public final class PurpleBed {
  public static final BlockState PURPLE_BED_0 = new BlockState(NamespaceID.from("minecraft:purple_bed_0"), (short) 1209, Block.PURPLE_BED, "facing=north","occupied=true","part=head");

  public static final BlockState PURPLE_BED_1 = new BlockState(NamespaceID.from("minecraft:purple_bed_1"), (short) 1210, Block.PURPLE_BED, "facing=north","occupied=true","part=foot");

  public static final BlockState PURPLE_BED_2 = new BlockState(NamespaceID.from("minecraft:purple_bed_2"), (short) 1211, Block.PURPLE_BED, "facing=north","occupied=false","part=head");

  public static final BlockState PURPLE_BED_3 = new BlockState(NamespaceID.from("minecraft:purple_bed_3"), (short) 1212, Block.PURPLE_BED, "facing=north","occupied=false","part=foot");

  public static final BlockState PURPLE_BED_4 = new BlockState(NamespaceID.from("minecraft:purple_bed_4"), (short) 1213, Block.PURPLE_BED, "facing=south","occupied=true","part=head");

  public static final BlockState PURPLE_BED_5 = new BlockState(NamespaceID.from("minecraft:purple_bed_5"), (short) 1214, Block.PURPLE_BED, "facing=south","occupied=true","part=foot");

  public static final BlockState PURPLE_BED_6 = new BlockState(NamespaceID.from("minecraft:purple_bed_6"), (short) 1215, Block.PURPLE_BED, "facing=south","occupied=false","part=head");

  public static final BlockState PURPLE_BED_7 = new BlockState(NamespaceID.from("minecraft:purple_bed_7"), (short) 1216, Block.PURPLE_BED, "facing=south","occupied=false","part=foot");

  public static final BlockState PURPLE_BED_8 = new BlockState(NamespaceID.from("minecraft:purple_bed_8"), (short) 1217, Block.PURPLE_BED, "facing=west","occupied=true","part=head");

  public static final BlockState PURPLE_BED_9 = new BlockState(NamespaceID.from("minecraft:purple_bed_9"), (short) 1218, Block.PURPLE_BED, "facing=west","occupied=true","part=foot");

  public static final BlockState PURPLE_BED_10 = new BlockState(NamespaceID.from("minecraft:purple_bed_10"), (short) 1219, Block.PURPLE_BED, "facing=west","occupied=false","part=head");

  public static final BlockState PURPLE_BED_11 = new BlockState(NamespaceID.from("minecraft:purple_bed_11"), (short) 1220, Block.PURPLE_BED, "facing=west","occupied=false","part=foot");

  public static final BlockState PURPLE_BED_12 = new BlockState(NamespaceID.from("minecraft:purple_bed_12"), (short) 1221, Block.PURPLE_BED, "facing=east","occupied=true","part=head");

  public static final BlockState PURPLE_BED_13 = new BlockState(NamespaceID.from("minecraft:purple_bed_13"), (short) 1222, Block.PURPLE_BED, "facing=east","occupied=true","part=foot");

  public static final BlockState PURPLE_BED_14 = new BlockState(NamespaceID.from("minecraft:purple_bed_14"), (short) 1223, Block.PURPLE_BED, "facing=east","occupied=false","part=head");

  public static final BlockState PURPLE_BED_15 = new BlockState(NamespaceID.from("minecraft:purple_bed_15"), (short) 1224, Block.PURPLE_BED, "facing=east","occupied=false","part=foot");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_0);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_1);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_2);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_3);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_4);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_5);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_6);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_7);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_8);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_9);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_10);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_11);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_12);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_13);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_14);
    Registry.BLOCK_STATE_REGISTRY.register(PURPLE_BED_15);
  }

  public static void initStates() {
    Block.PURPLE_BED.addBlockState(PURPLE_BED_0);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_1);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_2);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_3);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_4);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_5);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_6);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_7);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_8);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_9);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_10);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_11);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_12);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_13);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_14);
    Block.PURPLE_BED.addBlockState(PURPLE_BED_15);
  }
}
