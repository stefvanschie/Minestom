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
public final class OrangeWallBanner {
  public static final BlockState ORANGE_WALL_BANNER_0 = new BlockState(NamespaceID.from("minecraft:orange_wall_banner_0"), (short) 8161, Block.ORANGE_WALL_BANNER, "facing=north");

  public static final BlockState ORANGE_WALL_BANNER_1 = new BlockState(NamespaceID.from("minecraft:orange_wall_banner_1"), (short) 8162, Block.ORANGE_WALL_BANNER, "facing=south");

  public static final BlockState ORANGE_WALL_BANNER_2 = new BlockState(NamespaceID.from("minecraft:orange_wall_banner_2"), (short) 8163, Block.ORANGE_WALL_BANNER, "facing=west");

  public static final BlockState ORANGE_WALL_BANNER_3 = new BlockState(NamespaceID.from("minecraft:orange_wall_banner_3"), (short) 8164, Block.ORANGE_WALL_BANNER, "facing=east");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(ORANGE_WALL_BANNER_0);
    Registry.BLOCK_STATE_REGISTRY.register(ORANGE_WALL_BANNER_1);
    Registry.BLOCK_STATE_REGISTRY.register(ORANGE_WALL_BANNER_2);
    Registry.BLOCK_STATE_REGISTRY.register(ORANGE_WALL_BANNER_3);
  }

  public static void initStates() {
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_0);
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_1);
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_2);
    Block.ORANGE_WALL_BANNER.addBlockState(ORANGE_WALL_BANNER_3);
  }
}
