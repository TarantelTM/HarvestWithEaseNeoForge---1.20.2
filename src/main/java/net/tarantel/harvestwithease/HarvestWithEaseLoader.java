package net.tarantel.harvestwithease;

import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.network.NetworkRegistry;
import net.neoforged.neoforge.network.simple.SimpleChannel;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.tarantel.harvestwithease.config.HarvestWithEaseConfig;
import net.minecraft.resources.ResourceLocation;


/**
 * Harvest with ease mod loader.
 */
@Mod(HarvestWithEaseLoader.MODID)
public class HarvestWithEaseLoader {
  /**
   * ID of this mod.
   */
  public static final String MODID = "harvestwithease";

  /**
   * Logger.
   */
  public static final Logger LOGGER = LogUtils.getLogger();

  /**
   * Network channel protocol version.
   */
  private static final String PROTOCOL_VERSION = "1";
  /**
   * {@link SimpleChannel} instance for compatibility client-server.
   */
  public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

  public HarvestWithEaseLoader() {
    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, HarvestWithEaseConfig.SPEC);
  }
}
