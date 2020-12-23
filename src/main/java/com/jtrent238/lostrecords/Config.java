package com.jtrent238.lostrecords;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class Config {

private static String CATEGORY_RECORDS = "Records";

	public static boolean RECORD_0_ENABLE;
	public static boolean RECORD_1_ENABLE;
	public static boolean RECORD_2_ENABLE;
	public static boolean RECORD_3_ENABLE;
	public static boolean RECORD_4_ENABLE;
	public static boolean RECORD_5_ENABLE;
	public static boolean RECORD_6_ENABLE;
	public static boolean RECORD_7_ENABLE;
	public static boolean RECORD_8_ENABLE;
	public static boolean RECORD_9_ENABLE;
	public static boolean RECORD_10_ENABLE;
	public static boolean RECORD_11_ENABLE;
	public static boolean RECORD_12_ENABLE;
	public static boolean RECORD_13_ENABLE;
	public static boolean RECORD_14_ENABLE;
	public static boolean RECORD_15_ENABLE;
	public static boolean RECORD_16_ENABLE;
	public static boolean RECORD_17_ENABLE;
	public static boolean RECORD_18_ENABLE;
	public static boolean RECORD_19_ENABLE;
	public static boolean RECORD_20_ENABLE;
	public static boolean RECORD_21_ENABLE;
	public static boolean RECORD_22_ENABLE;
	public static boolean RECORD_23_ENABLE;
	public static boolean RECORD_24_ENABLE;
	public static boolean RECORD_25_ENABLE;
	public static boolean RECORD_26_ENABLE;
	public static boolean RECORD_27_ENABLE;
	public static boolean RECORD_28_ENABLE;
	public static boolean RECORD_29_ENABLE;
	public static boolean RECORD_30_ENABLE;
	public static boolean RECORD_31_ENABLE;
	public static boolean RECORD_32_ENABLE;
	public static boolean RECORD_33_ENABLE;
	public static boolean RECORD_34_ENABLE;
	public static boolean RECORD_35_ENABLE;
	public static boolean RECORD_36_ENABLE;
	public static boolean RECORD_37_ENABLE;
	public static boolean RECORD_38_ENABLE;
	public static boolean RECORD_39_ENABLE;
	public static boolean RECORD_40_ENABLE;
	public static boolean RECORD_41_ENABLE;
	public static boolean RECORD_42_ENABLE;
	public static boolean RECORD_43_ENABLE;
	public static boolean RECORD_44_ENABLE;
	public static boolean RECORD_45_ENABLE;
	public static boolean RECORD_46_ENABLE;
	public static boolean RECORD_47_ENABLE;
	public static boolean RECORD_48_ENABLE;
	public static boolean RECORD_49_ENABLE;
	public static boolean RECORD_50_ENABLE;
	public static boolean RECORD_51_ENABLE;
	public static boolean RECORD_52_ENABLE;
	public static boolean RECORD_53_ENABLE;

	public static boolean DEBUG_MODE;
	
	public static final String CATEGORY_SETTINGS = "Settings";


	public static void ConfigFile(FMLPreInitializationEvent event) {


		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		event.getModConfigurationDirectory();
		event.getModConfigurationDirectory();
		event.getModLog();
		event.getModMetadata();
		event.getModState();
		event.getSide();
		event.getVersionProperties();
		
		/*
		 * Config Start
		 */
		config.addCustomCategoryComment(CATEGORY_SETTINGS, "Settings");
		
		DEBUG_MODE  = config.get(CATEGORY_SETTINGS, "DebugMode", false).getBoolean(false);

		RECORD_0_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - key - [Alpha]", true).getBoolean(true);
		RECORD_1_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - door - [Alpha]", true).getBoolean(true);
		RECORD_2_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Subwoofer Lullaby - [Alpha]", true).getBoolean(true);
		RECORD_3_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - death - [Alpha]", true).getBoolean(true);
		RECORD_4_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Living Mice - [Alpha]", true).getBoolean(true);
		RECORD_5_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Moog City - [Alpha]", true).getBoolean(true);
		RECORD_6_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Haggstrom - [Alpha]", true).getBoolean(true);
		RECORD_7_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Minecraft - [Alpha]", true).getBoolean(true);
		RECORD_8_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Oxygène - [Alpha]", true).getBoolean(true);
		RECORD_9_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Équinoxe - [Alpha]", true).getBoolean(true);
		RECORD_10_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Mice on Venus - [Alpha]", true).getBoolean(true);
		RECORD_11_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Dry Hands - [Alpha]", true).getBoolean(true);
		RECORD_12_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Wet Hands - [Alpha]", true).getBoolean(true);
		RECORD_13_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Clark - [Alpha]", true).getBoolean(true);
		RECORD_14_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Chris - [Alpha]", true).getBoolean(true);
		RECORD_15_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Thirteen - [Alpha]", true).getBoolean(true);
		RECORD_16_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Excuse - [Alpha]", true).getBoolean(true);
		RECORD_17_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Sweden - [Alpha]", true).getBoolean(true);
		RECORD_18_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Cat - [Alpha]", true).getBoolean(true);
		RECORD_19_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Chirp - [Alpha]", true).getBoolean(true);
		RECORD_20_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Danny - [Alpha]", true).getBoolean(true);
		RECORD_21_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Beginning - [Alpha]", true).getBoolean(true);
		RECORD_22_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Droopy likes ricochet - [Alpha]", true).getBoolean(true);
		RECORD_23_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Droopy likes your face - [Alpha]", true).getBoolean(true);
		RECORD_24_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Ki - [Beta]", true).getBoolean(true);
		RECORD_25_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Alpha - [Beta]", true).getBoolean(true);
		RECORD_26_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Dead Voxel - [Beta]", true).getBoolean(true);
		RECORD_27_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Blind Spots - [Beta]", true).getBoolean(true);
		RECORD_28_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Flake - [Beta]", true).getBoolean(true);
		RECORD_29_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Moog City 2 - [Beta]", true).getBoolean(true);
		RECORD_30_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Concrete Halls - [Beta]", true).getBoolean(true);
		RECORD_31_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Biome Fest - [Beta]", true).getBoolean(true);
		RECORD_32_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Mutation - [Beta]", true).getBoolean(true);
		RECORD_33_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Haunt Muskie - [Beta]", true).getBoolean(true);
		RECORD_34_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Warmth - [Beta]", true).getBoolean(true);
		RECORD_35_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Floating Trees - [Beta]", true).getBoolean(true);
		RECORD_36_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Aria Math - [Beta]", true).getBoolean(true);
		RECORD_37_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Kyoto - [Beta]", true).getBoolean(true);
		RECORD_38_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Ballad of the Cats - [Beta]", true).getBoolean(true);
		RECORD_39_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Taswell - [Beta]", true).getBoolean(true);
		RECORD_40_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Beginning 2 - [Beta]", true).getBoolean(true);
		RECORD_41_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Dreiton - [Beta]", true).getBoolean(true);
		RECORD_42_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - The End - [Beta]", true).getBoolean(true);
		RECORD_43_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Chirp - [Beta]", true).getBoolean(true);
		RECORD_44_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Wait - [Beta]", true).getBoolean(true);
		RECORD_45_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Mellohi - [Beta]", true).getBoolean(true);
		RECORD_46_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Stal - [Beta]", true).getBoolean(true);
		RECORD_47_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Strad - [Beta]", true).getBoolean(true);
		RECORD_48_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Eleven - [Beta]", true).getBoolean(true);
		RECORD_49_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Ward - [Beta]", true).getBoolean(true);
		RECORD_50_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Mall - [Beta]", true).getBoolean(true);
		RECORD_51_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Blocks - [Beta]", true).getBoolean(true);
		RECORD_52_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Far - [Beta]", true).getBoolean(true);
		RECORD_53_ENABLE = config.get(CATEGORY_RECORDS, "Enable C418 - Intro - [Beta]", true).getBoolean(true);

		
		/*
		 * Config Stop
		 */
		config.load();
		config.getLoadedConfigVersion();
		
		config.save();
		
		event.getModLog();
		event.getModState();
		//Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());
		
		//loadConfiguration(configFile);

		System.out.println(LostRecords.MODID + " >>> Configuration File Loaded");
	}

}