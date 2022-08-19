package com.gildedrose.items;

public class AgedBrie extends GoodAsAgedItem {

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {

		if (super.quality < 50) {
			super.quality = super.quality + 1;
		}

		super.updateQuality();

		if (super.sellIn < 0) {
			if (super.quality < 50) {
				super.quality = super.quality + 1;
			}
		}

	}

}
