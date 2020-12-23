package com.jtrent238.lostrecords;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public static ArrayList<ItemStack> records = new ArrayList<ItemStack>();

	LootRegistry(){
		addRecordsasLoot();
		addToChests();
	}

	public static void registerLoot() {
		addRecordsasLoot();
		addToChests();
	}
	public static void addRecordsasLoot() {
		
		records.add(new ItemStack(ItemLoader.ItemRecord0));
		records.add(new ItemStack(ItemLoader.ItemRecord1));
		records.add(new ItemStack(ItemLoader.ItemRecord2));
		records.add(new ItemStack(ItemLoader.ItemRecord3));
		records.add(new ItemStack(ItemLoader.ItemRecord4));
		records.add(new ItemStack(ItemLoader.ItemRecord5));
		records.add(new ItemStack(ItemLoader.ItemRecord6));
		records.add(new ItemStack(ItemLoader.ItemRecord7));
		records.add(new ItemStack(ItemLoader.ItemRecord8));
		records.add(new ItemStack(ItemLoader.ItemRecord9));
		records.add(new ItemStack(ItemLoader.ItemRecord10));
		records.add(new ItemStack(ItemLoader.ItemRecord11));
		records.add(new ItemStack(ItemLoader.ItemRecord12));
		records.add(new ItemStack(ItemLoader.ItemRecord13));
		records.add(new ItemStack(ItemLoader.ItemRecord14));
		records.add(new ItemStack(ItemLoader.ItemRecord15));
		records.add(new ItemStack(ItemLoader.ItemRecord16));
		records.add(new ItemStack(ItemLoader.ItemRecord17));
		records.add(new ItemStack(ItemLoader.ItemRecord18));
		records.add(new ItemStack(ItemLoader.ItemRecord19));
		records.add(new ItemStack(ItemLoader.ItemRecord20));
		records.add(new ItemStack(ItemLoader.ItemRecord21));
		records.add(new ItemStack(ItemLoader.ItemRecord22));
		records.add(new ItemStack(ItemLoader.ItemRecord23));
		records.add(new ItemStack(ItemLoader.ItemRecord24));
		records.add(new ItemStack(ItemLoader.ItemRecord25));
		records.add(new ItemStack(ItemLoader.ItemRecord26));
		records.add(new ItemStack(ItemLoader.ItemRecord27));
		records.add(new ItemStack(ItemLoader.ItemRecord28));
		records.add(new ItemStack(ItemLoader.ItemRecord29));
		records.add(new ItemStack(ItemLoader.ItemRecord30));
		records.add(new ItemStack(ItemLoader.ItemRecord31));
		records.add(new ItemStack(ItemLoader.ItemRecord32));
		records.add(new ItemStack(ItemLoader.ItemRecord33));
		records.add(new ItemStack(ItemLoader.ItemRecord34));
		records.add(new ItemStack(ItemLoader.ItemRecord35));
		records.add(new ItemStack(ItemLoader.ItemRecord36));
		records.add(new ItemStack(ItemLoader.ItemRecord37));
		records.add(new ItemStack(ItemLoader.ItemRecord38));
		records.add(new ItemStack(ItemLoader.ItemRecord39));
		records.add(new ItemStack(ItemLoader.ItemRecord40));
		records.add(new ItemStack(ItemLoader.ItemRecord41));
		records.add(new ItemStack(ItemLoader.ItemRecord42));
		records.add(new ItemStack(ItemLoader.ItemRecord43));
		records.add(new ItemStack(ItemLoader.ItemRecord44));
		records.add(new ItemStack(ItemLoader.ItemRecord45));
		records.add(new ItemStack(ItemLoader.ItemRecord46));
		records.add(new ItemStack(ItemLoader.ItemRecord47));
		records.add(new ItemStack(ItemLoader.ItemRecord48));
		records.add(new ItemStack(ItemLoader.ItemRecord49));
		records.add(new ItemStack(ItemLoader.ItemRecord50));
		records.add(new ItemStack(ItemLoader.ItemRecord51));
		records.add(new ItemStack(ItemLoader.ItemRecord52));
		records.add(new ItemStack(ItemLoader.ItemRecord53));

	}

	public static void addToChests() {
		//int numRecords = 54;
		int numRecords = 54;
		for (int i = 0; i < numRecords ; i++) {
			
				if(Config.DEBUG_MODE == true) {
					System.out.println("DEBUG: Injected Record with ID " + i + " into the Minecraft LootChests.");
				}
				
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
		 	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(records.get(i), 0, 1, 1));
		}
		
	}
	
}