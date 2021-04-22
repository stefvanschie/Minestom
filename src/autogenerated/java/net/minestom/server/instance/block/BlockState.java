package net.minestom.server.instance.block;

import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.instance.block.states.Air;
import net.minestom.server.raw_data.RawBlockStateData;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUTOGENERATED
 */
public class BlockState implements Keyed {
  public static final BlockState AIR_0 = Air.AIR_0;

  @NotNull
  private final NamespaceID namespaceId;

  private final short id;

  @NotNull
  private final Block block;

  @NotNull
  private final RawBlockStateData blockStateData = new RawBlockStateData();

  @NotNull
  private final String[] properties;

  public BlockState(@NotNull NamespaceID namespaceId, short id, @NotNull Block block,
      @NotNull String... properties) {
    this.namespaceId = namespaceId;
    this.id = id;
    this.block = block;
    this.properties = properties;
  }

  @NotNull
  public NamespaceID getNamespaceId() {
    return this.namespaceId;
  }

  @Override
  @NotNull
  public Key key() {
    return this.namespaceId;
  }

  public short getId() {
    return this.id;
  }

  @NotNull
  public Block getBlock() {
    return this.block;
  }

  @NotNull
  public String[] getProperties() {
    return this.properties;
  }

  @NotNull
  public Map<String, String> createPropertiesMap() {
    Map<String, String> map = new HashMap<>();
    for (String p : this.properties) {
      String[] parts = p.split("=");
      map.put(parts[0], parts[1]);
    }
    return map;
  }

  @Nullable
  public String getProperty(@NotNull String key) {
    for (String p : this.properties) {
      String[] parts = p.split("=");
      if (parts.length > 1 && parts[0].equals(key)) {
        return parts[1];
      }
    }
    return null;
  }

  @NotNull
  public static BlockState fromId(int id) {
    return Registry.BLOCK_STATE_REGISTRY.get((short) id);
  }

  @NotNull
  public static BlockState fromId(Key id) {
    return Registry.BLOCK_STATE_REGISTRY.get(id);
  }

  @NotNull
  public final RawBlockStateData getBlockStateData() {
    return this.blockStateData;
  }

  public boolean isSolid() {
    return this.blockStateData.solid;
  }

  public boolean isLiquid() {
    return this.blockStateData.liquid;
  }

  @NotNull
  public static List<BlockState> values() {
    return Registry.BLOCK_STATE_REGISTRY.values();
  }

  @NotNull
  @Override
  public String toString() {
    return "[" + this.id + ","+ this.namespaceId + "]";
  }
}
