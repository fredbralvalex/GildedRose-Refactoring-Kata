package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemImpl implements IItem {

	protected Item item;

	public ItemImpl(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return item.toString();
	}

	@Override
	public void updateQuality() {
		 if (item.quality > 0) {
			 item.quality = item.quality - 1;
         }
		 item.sellIn = item.sellIn - 1;
		 if (item.sellIn < 0) {
			 if (item.quality > 0) {
				 item.quality = item.quality - 1;
             }
		 }
	}
}
