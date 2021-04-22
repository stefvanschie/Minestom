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
public final class GreenWallBanner {
  public static final BlockState GREEN_WALL_BANNER_0 = new BlockState(NamespaceID.from("minecraft:green_wall_banner_0"), (short) 8209, Block.GREEN_WALL_BANNER, "facing=north");

  public static final BlockState GREEN_WALL_BANNER_1 = new BlockState(NamespaceID.from("minecraft:green_wall_banner_1"), (short) 8210, Block.GREEN_WALL_BANNER, "facing=south");

  public static final BlockState GREEN_WALL_BANNER_2 = new BlockState(NamespaceID.from("minecraft:green_wall_banner_2"), (short) 8211, Block.GREEN_WALL_BANNER, "facing=west");

  public static final BlockState GREEN_WALL_BANNER_3 = new BlockState(NamespaceID.from("minecraft:green_wall_banner_3"), (short) 8212, Block.GREEN_WALL_BANNER, "facing=east");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(GREEN_WALL_BANNER_0);
    Registry.BLOCK_STATE_REGISTRY.register(GREEN_WALL_BANNER_1);
    Registry.BLOCK_STATE_REGISTRY.register(GREEN_WALL_BANNER_2);
    Registry.BLOCK_STATE_REGISTRY.register(GREEN_WALL_BANNER_3);
  }

  public static void initStates() {
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_0);
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_1);
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_2);
    Block.GREEN_WALL_BANNER.addBlockState(GREEN_WALL_BANNER_3);
  }
}
