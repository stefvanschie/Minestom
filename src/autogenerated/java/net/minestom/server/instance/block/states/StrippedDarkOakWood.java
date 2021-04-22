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
public final class StrippedDarkOakWood {
  public static final BlockState STRIPPED_DARK_OAK_WOOD_0 = new BlockState(NamespaceID.from("minecraft:stripped_dark_oak_wood_0"), (short) 142, Block.STRIPPED_DARK_OAK_WOOD, "axis=x");

  public static final BlockState STRIPPED_DARK_OAK_WOOD_1 = new BlockState(NamespaceID.from("minecraft:stripped_dark_oak_wood_1"), (short) 143, Block.STRIPPED_DARK_OAK_WOOD, "axis=y");

  public static final BlockState STRIPPED_DARK_OAK_WOOD_2 = new BlockState(NamespaceID.from("minecraft:stripped_dark_oak_wood_2"), (short) 144, Block.STRIPPED_DARK_OAK_WOOD, "axis=z");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_DARK_OAK_WOOD_0);
    Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_DARK_OAK_WOOD_1);
    Registry.BLOCK_STATE_REGISTRY.register(STRIPPED_DARK_OAK_WOOD_2);
  }

  public static void initStates() {
    Block.STRIPPED_DARK_OAK_WOOD.addBlockState(STRIPPED_DARK_OAK_WOOD_0);
    Block.STRIPPED_DARK_OAK_WOOD.addBlockState(STRIPPED_DARK_OAK_WOOD_1);
    Block.STRIPPED_DARK_OAK_WOOD.addBlockState(STRIPPED_DARK_OAK_WOOD_2);
  }
}
