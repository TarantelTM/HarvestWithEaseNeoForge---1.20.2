package net.tarantel.harvestwithease.config;

import java.util.Collections;
import java.util.List;

import net.minecraft.world.level.block.CropBlock;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.NeoForgeConfig;

/**
 * Harvest with ease Configuration.
 */
public class HarvestWithEaseConfig {
  /**
   * {@link ModConfigSpec} {@link ModConfigSpec.Builder Builder}.
   */
  private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
  /**
   * Common Configuration as read from the configuration file.
   */
  public static final CommonConfig COMMON = new CommonConfig(BUILDER);
  /**
   * {@link ModConfigSpec}.
   */
  public static final ModConfigSpec SPEC = BUILDER.build();
  
  /**
   * Returns the value of {@link CommonConfig#crops}.
   *
   * @return {@link CommonConfig#crops} as read from the {@link #COMMON common} configuration file.
   */
  public static List<? extends String> getCrops() {
    return COMMON.crops.get();
  }

  /**
   * Returns the value of {@link CommonConfig#requireHoe}.
   *
   * @return {@link CommonConfig#requireHoe} as read from the {@link #COMMON common} configuration file.
   */
  public static Boolean getRequireHoe() {
    return COMMON.requireHoe.get();
  }

  /**
   * Returns the value of {@link CommonConfig#damageOnHarvest}.
   *
   * @return {@link CommonConfig#damageOnHarvest} as read from the {@link #COMMON common} configuration file.
   */
  public static Integer getDamageOnHarvest() {
    return COMMON.damageOnHarvest.get();
  }

  /**
   * Returns the value of {@link CommonConfig#grantedExp}.
   *
   * @return {@link CommonConfig#grantedExp} as read from the {@link #COMMON common} configuration file.
   */
  public static Integer getGrantedExp() {
    return COMMON.grantedExp.get();
  }

  /**
   * Returns the value of {@link CommonConfig#playSound}.
   *
   * @return {@link CommonConfig#playSound} as read from the {@link #COMMON common} configuration file.
   */
  public static Boolean getPlaySound() {
    return COMMON.playSound.get();
  }

  /**
   * Common Configuration for Harvest with ease.
   */
  public static class CommonConfig {
    /**
     * List of additional in-game IDs for crops that need to be supported but do not extend {@link CropBlock}.
     */
    private final ModConfigSpec.ConfigValue<List<? extends String>> crops;
    /**
     * Whether holding a hoe (either hands) is required.
     */
    private final ModConfigSpec.BooleanValue requireHoe;
    /**
     * Amount of damage to deal on a hoe when it is used to right-click harvest.
     * Effective only if greater than 0 and {@link #requireHoe} is true.
     */
    private final ModConfigSpec.IntValue damageOnHarvest;
    /**
     * Amount of experience to grant on harvest.
     * Effective only if greater than 0.
     */
    private final ModConfigSpec.IntValue grantedExp;
    /**
     * Whether to play a sound when harvesting a crop.
     */
    private final ModConfigSpec.BooleanValue playSound;

    /**
     * Defines the configuration options, their default values and their comments.
     *
     * @param builder
     */
    public CommonConfig(ModConfigSpec.Builder builder) {
      crops = builder.comment("List of in-game IDs of additional crops").defineListAllowEmpty(List.of("crops"), Collections::emptyList, (element) -> element instanceof String && !((String) element).isBlank());
      requireHoe = builder.comment("Require holding a hoe (either hands) to right-click harvest").define("require hoe", false);
      damageOnHarvest = builder.comment("If [require hoe] is set to true, damage the hoe of the given amount (0 to disable, must be an integer)").defineInRange("damage on harvest", 0, 0, 16);
      grantedExp = builder.comment("Amount of experience to grant on harvest (0 to disable, must be an integer).").defineInRange("exp on harvest", 0, 0, 512);
      playSound = builder.comment("Play a sound when harvesting a crop.").define("play sound", true);
    }
  }
}
