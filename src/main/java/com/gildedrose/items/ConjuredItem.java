package com.gildedrose.items;

import com.gildedrose.Item;

public class ConjuredItem extends ItemImpl {

	public ConjuredItem(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
		// This type degrade in Quality twice as fast as normal items
		super.updateQuality();
		super.updateQuality();
	}

}
