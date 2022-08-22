package com.gildedrose;

import com.gildedrose.items.IItem;
import com.gildedrose.items.ItemFactory;

class GildedRose {

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		
		for (int i = 0; i < items.length; i++) {
			// as a requirement Item was not changed at all
			IItem item = ItemFactory.createItem(items[i]);
			item.updateQuality();
		}
	}

}