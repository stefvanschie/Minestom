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
public final class TripwireHook {
  public static final BlockState TRIPWIRE_HOOK_0 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_0"), (short) 5263, Block.TRIPWIRE_HOOK, "attached=true","facing=north","powered=true");

  public static final BlockState TRIPWIRE_HOOK_1 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_1"), (short) 5264, Block.TRIPWIRE_HOOK, "attached=true","facing=north","powered=false");

  public static final BlockState TRIPWIRE_HOOK_2 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_2"), (short) 5265, Block.TRIPWIRE_HOOK, "attached=true","facing=south","powered=true");

  public static final BlockState TRIPWIRE_HOOK_3 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_3"), (short) 5266, Block.TRIPWIRE_HOOK, "attached=true","facing=south","powered=false");

  public static final BlockState TRIPWIRE_HOOK_4 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_4"), (short) 5267, Block.TRIPWIRE_HOOK, "attached=true","facing=west","powered=true");

  public static final BlockState TRIPWIRE_HOOK_5 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_5"), (short) 5268, Block.TRIPWIRE_HOOK, "attached=true","facing=west","powered=false");

  public static final BlockState TRIPWIRE_HOOK_6 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_6"), (short) 5269, Block.TRIPWIRE_HOOK, "attached=true","facing=east","powered=true");

  public static final BlockState TRIPWIRE_HOOK_7 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_7"), (short) 5270, Block.TRIPWIRE_HOOK, "attached=true","facing=east","powered=false");

  public static final BlockState TRIPWIRE_HOOK_8 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_8"), (short) 5271, Block.TRIPWIRE_HOOK, "attached=false","facing=north","powered=true");

  public static final BlockState TRIPWIRE_HOOK_9 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_9"), (short) 5272, Block.TRIPWIRE_HOOK, "attached=false","facing=north","powered=false");

  public static final BlockState TRIPWIRE_HOOK_10 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_10"), (short) 5273, Block.TRIPWIRE_HOOK, "attached=false","facing=south","powered=true");

  public static final BlockState TRIPWIRE_HOOK_11 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_11"), (short) 5274, Block.TRIPWIRE_HOOK, "attached=false","facing=south","powered=false");

  public static final BlockState TRIPWIRE_HOOK_12 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_12"), (short) 5275, Block.TRIPWIRE_HOOK, "attached=false","facing=west","powered=true");

  public static final BlockState TRIPWIRE_HOOK_13 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_13"), (short) 5276, Block.TRIPWIRE_HOOK, "attached=false","facing=west","powered=false");

  public static final BlockState TRIPWIRE_HOOK_14 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_14"), (short) 5277, Block.TRIPWIRE_HOOK, "attached=false","facing=east","powered=true");

  public static final BlockState TRIPWIRE_HOOK_15 = new BlockState(NamespaceID.from("minecraft:tripwire_hook_15"), (short) 5278, Block.TRIPWIRE_HOOK, "attached=false","facing=east","powered=false");

  static {
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_0);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_1);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_2);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_3);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_4);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_5);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_6);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_7);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_8);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_9);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_10);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_11);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_12);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_13);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_14);
    Registry.BLOCK_STATE_REGISTRY.register(TRIPWIRE_HOOK_15);
  }

  public static void initStates() {
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_0);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_1);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_2);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_3);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_4);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_5);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_6);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_7);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_8);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_9);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_10);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_11);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_12);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_13);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_14);
    Block.TRIPWIRE_HOOK.addBlockState(TRIPWIRE_HOOK_15);
  }
}
