package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemImpl implements IItem {

	protected Item item;

	public ItemImpl(Item item) {
		this.item = item;
	}

	/**
	 * A common item degrades at rate of 1.
	 * 
	 * @return in the times the items degrade.
	 */
	protected int getTimesDegradation() {
		return 1;
	}

	@Override
	public String toString() {
		return item.toString();
	}

	@Override
	public void updateQuality() {
		if (item.quality > 0) {
			item.quality = item.quality - 1 * getTimesDegradation();
		}
		
		item.sellIn = item.sellIn - 1;
		
		if (item.sellIn < 0) {
			if (item.quality > 0) {
				item.quality = item.quality - 1 * getTimesDegradation();
			}
		}
	}
}
