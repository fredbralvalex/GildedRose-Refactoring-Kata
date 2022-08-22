package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses extends GoodAsAgedItem {

	public BackstagePasses(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {

		if (super.item.quality < 50) {
			super.item.quality = super.item.quality + 1;

			if (super.item.sellIn < 11) {
				if (super.item.quality < 50) {
					super.item.quality = super.item.quality + 1;
				}
			}

			if (super.item.sellIn < 6) {
				if (super.item.quality < 50) {
					super.item.quality = super.item.quality + 1;
				}
			}
		}

		super.updateQuality();

		if (super.item.sellIn < 0) {
			super.item.quality = super.item.quality - super.item.quality;
		}

	}
}
