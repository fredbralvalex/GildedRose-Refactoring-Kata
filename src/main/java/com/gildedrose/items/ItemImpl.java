package com.gildedrose.items;

public class ItemImpl implements IItem {

	public String name;

	public int sellIn;

	public int quality;

	public ItemImpl(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

	@Override
	public void updateQuality() {
		 if (this.quality > 0) {
             this.quality = this.quality - 1;
         }
		 this.sellIn = this.sellIn - 1;
		 if (this.sellIn < 0) {
			 if (this.quality > 0) {
                 this.quality = this.quality - 1;
             }
		 }
	}
}
