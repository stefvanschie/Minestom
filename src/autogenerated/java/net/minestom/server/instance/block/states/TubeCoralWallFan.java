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
public final class TubeCoralWallFan {
  public static final BlockState TUBE_CORAL_WALL_FAN_0 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_0"), (short) 9604, Block.TUBE_CORAL_WALL_FAN, "facing=north","waterlogged=true");

  public static final BlockState TUBE_CORAL_WALL_FAN_1 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_1"), (short) 9605, Block.TUBE_CORAL_WALL_FAN, "facing=north","waterlogged=false");

  public static final BlockState TUBE_CORAL_WALL_FAN_2 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_2"), (short) 9606, Block.TUBE_CORAL_WALL_FAN, "facing=south","waterlogged=true");

  public static final BlockState TUBE_CORAL_WALL_FAN_3 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_3"), (short) 9607, Block.TUBE_CORAL_WALL_FAN, "facing=south","waterlogged=false");

  public static final BlockState TUBE_CORAL_WALL_FAN_4 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_4"), (short) 9608, Block.TUBE_CORAL_WALL_FAN, "facing=west","waterlogged=true");

  public static final BlockState TUBE_CORAL_WALL_FAN_5 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_5"), (short) 9609, Block.TUBE_CORAL_WALL_FAN, "facing=west","waterlogged=false");

  public static final BlockState TUBE_CORAL_WALL_FAN_6 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_6"), (short) 9610, Block.TUBE_CORAL_WALL_FAN, "facing=east","waterlogged=true");

  public static final BlockState TUBE_CORAL_WALL_FAN_7 = new BlockState(NamespaceID.from("minecraft:tube_coral_wall_fan_7"), (short) 9611, Block.TUBE_CORAL_WALL_FAN, "facing=east","waterlogged=false");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_0);
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_1);
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_2);
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_3);
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_4);
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_5);
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_6);
    Registry.BLOCK_STATE_REGISTRY.register(TUBE_CORAL_WALL_FAN_7);
  }

  public static void initStates() {
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_0);
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_1);
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_2);
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_3);
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_4);
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_5);
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_6);
    Block.TUBE_CORAL_WALL_FAN.addBlockState(TUBE_CORAL_WALL_FAN_7);
  }
}
