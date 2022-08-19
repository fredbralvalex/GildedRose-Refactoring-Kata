package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemFactory {
	private final static String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	private final static String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private final static String AGED_BRIE = "Aged Brie";
	private final static String CONJURED_MANA_CAKE = "Conjured Mana Cake";

	public static IItem createItem(Item item) {
		/**
		 * TODO <br>
		 * 1. check the regex for items defined as "Sulfuras" or "Conjured". <br>
		 * 2. Create classes for "Dexterity Vest" and "Elixir of the Mongoose".
		 * 
		 */

		switch (item.name) {
		case BACKSTAGE_PASSES:
			return new BackstagePasses(item.name, item.sellIn, item.quality);
		case SULFURAS_HAND_OF_RAGNAROS:
			return new SulfurasHandOfRagnaros(item.name, item.sellIn, item.quality);
		case AGED_BRIE:
			return new AgedBrie(item.name, item.sellIn, item.quality);
		case CONJURED_MANA_CAKE:
			return new ConjuredManaCake(item.name, item.sellIn, item.quality);
		default:
			return new ItemImpl(item.name, item.sellIn, item.quality);
		}
	}

	public static Item getItem(IItem item) {
		ItemImpl implementation = (ItemImpl) item;
		return new Item(implementation.name, implementation.sellIn, implementation.quality);
	}

}
