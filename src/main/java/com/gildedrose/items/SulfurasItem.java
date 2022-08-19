package com.gildedrose.items;

public class SulfurasItem extends ItemImpl {

	public SulfurasItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		// this method is empty because "Sulfuras" is a legendary item, never has to be sold or
		// decreases in Quality
	}

}
