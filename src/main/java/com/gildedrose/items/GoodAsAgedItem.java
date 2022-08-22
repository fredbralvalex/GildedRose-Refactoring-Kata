package com.gildedrose.items;

import com.gildedrose.Item;

public class GoodAsAgedItem extends ItemImpl {

	public GoodAsAgedItem(Item item) {
		super(item);
	}

	@Override
	public void updateQuality() {
		super.item.sellIn = super.item.sellIn - 1;
	}

}
