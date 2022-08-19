package com.gildedrose.items;

public class BackstagePasses extends GoodAsAgedItem {

	public BackstagePasses(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {

		if (super.quality < 50) {
			super.quality = super.quality + 1;

			if (super.sellIn < 11) {
				if (super.quality < 50) {
					super.quality = super.quality + 1;
				}
			}

			if (super.sellIn < 6) {
				if (super.quality < 50) {
					super.quality = super.quality + 1;
				}
			}
		}

		super.updateQuality();

		if (super.sellIn < 0) {
			super.quality = super.quality - super.quality;
		}

	}
}
