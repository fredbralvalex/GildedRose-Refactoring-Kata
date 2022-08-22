package com.gildedrose.items;

import com.gildedrose.Item;

public class ConjuredItem extends ItemImpl {

	public ConjuredItem(Item item) {
		super(item);
	}

	/**
	 * This type degrades in Quality twice as fast as normal items.
	 * 
	 * @return the degradation rate.
	 */
	@Override
	protected int getTimesDegradation() {
		return 2;
	}

}
