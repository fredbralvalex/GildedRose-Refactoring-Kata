package com.gildedrose.items;

import com.gildedrose.Item;

public class SulfurasItem extends ItemImpl {

	public SulfurasItem(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
		// this method is empty because "Sulfuras" is a legendary item, never has to be sold or
		// decreases in Quality
	}

}
