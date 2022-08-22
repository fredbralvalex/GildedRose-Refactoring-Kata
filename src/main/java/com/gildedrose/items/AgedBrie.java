package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends GoodAsAgedItem {

	public AgedBrie(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {

		if (super.item.quality < 50) {
			super.item.quality = super.item.quality + 1;
		}

		super.updateQuality();

		if (super.item.sellIn < 0) {
			if (super.item.quality < 50) {
				super.item.quality = super.item.quality + 1;
			}
		}

	}

}
