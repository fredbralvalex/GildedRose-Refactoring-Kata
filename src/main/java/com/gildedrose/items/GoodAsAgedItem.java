package com.gildedrose.items;

public class GoodAsAgedItem extends ItemImpl {

	public GoodAsAgedItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		super.sellIn = super.sellIn - 1;
	}

}
