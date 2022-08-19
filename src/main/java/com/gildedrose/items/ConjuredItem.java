package com.gildedrose.items;

public class ConjuredItem extends ItemImpl {

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		// This type degrade in Quality twice as fast as normal items
		super.updateQuality();
		super.updateQuality();
	}

}
