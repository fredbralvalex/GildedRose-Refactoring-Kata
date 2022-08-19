package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

	private final Item DEXTERITY_VEST = new Item("+5 Dexterity Vest", 10, 20);
	private final Item AGED_BRIE = new Item("Aged Brie", 2, 0);
	private final Item ELIXIR_OF_THE_MONGOOSE = new Item("Elixir of the Mongoose", 5, 7);
	private final Item SULFURAS_ZERO = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
	private final Item SULFURAS_MINUS_ONE = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
	private final Item BACKSTAGE_PASSES_QUALITY_20_15 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
	private final Item BACKSTAGE_PASSES_QUALITY_49_10 = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
	private final Item BACKSTAGE_PASSES_QUALITY_49_5 = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
	private final Item CONJURED_MANA_CAKE = new Item("Conjured Mana Cake", 3, 6);

	@Test
	void foo() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("foo", app.items[0].name);
	}

	// Tests for Dexterity Vest
	@Nested
	@DisplayName("Tests for Dexterity Vest")
	class DexterityVestTests {
		@Test
		void DexterityVestTestAfterOneDay() {
			Item[] items = new Item[] { DEXTERITY_VEST };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			assertEquals("+5 Dexterity Vest, 9, 19", app.items[0].toString());
		}

		@Test
		void DexterityVestTestAfterThreeDays() {
			Item[] items = new Item[] { DEXTERITY_VEST };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			assertEquals("+5 Dexterity Vest, 7, 17", app.items[0].toString());
		}

		@Test
		void DexterityVestTestAfterTenDays() {
			final int DAYS = 10;
			Item[] items = new Item[] { DEXTERITY_VEST };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("+5 Dexterity Vest, 0, 10", app.items[0].toString());
		}

		@Test
		void DexterityVestTestAfter22Days() {
			final int DAYS = 22;
			Item[] items = new Item[] { DEXTERITY_VEST };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("+5 Dexterity Vest, -12, 0", app.items[0].toString());
		}
	}

	// Tests for Aged Brie
	@Nested
	@DisplayName("Tests for Aged Brie")
	class AgedBrieTests {
		@Test
		void AgedBrieTestAfterOneDay() {
			Item[] items = new Item[] { AGED_BRIE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			assertEquals("Aged Brie, 1, 1", app.items[0].toString());
		}

		@Test
		void AgedBrieTestAfterTwoDays() {
			Item[] items = new Item[] { AGED_BRIE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			assertEquals("Aged Brie, 0, 2", app.items[0].toString());
		}

		@Test
		void AgedBrieTestAfterThreeDays() {
			Item[] items = new Item[] { AGED_BRIE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			assertEquals("Aged Brie, -1, 4", app.items[0].toString());
		}

		@Test
		void AgedBrieTestAfterFourDays() {
			Item[] items = new Item[] { AGED_BRIE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			assertEquals("Aged Brie, -2, 6", app.items[0].toString());
		}

		@Test
		void AgedBrieTestAfterTenDays() {
			final int DAYS = 10;
			Item[] items = new Item[] { AGED_BRIE };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Aged Brie, -8, 18", app.items[0].toString());
		}

	}

	// Tests for Elixir of the Mongoose
	@Nested
	@DisplayName("Tests for Elixir of the Mongoose")
	class ElixirOfTheMongooseTests {
		@Test
		void ElixirOfTheMongooseTestAfterOneDay() {
			Item[] items = new Item[] { ELIXIR_OF_THE_MONGOOSE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			assertEquals("Elixir of the Mongoose, 4, 6", app.items[0].toString());
		}

		@Test
		void ElixirOfTheMongooseTestAfterSixDays() {
			final int DAYS = 6;
			Item[] items = new Item[] { ELIXIR_OF_THE_MONGOOSE };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Elixir of the Mongoose, -1, 0", app.items[0].toString());
		}

		@Test
		void ElixirOfTheMongooseTestAfterTenDays() {
			final int DAYS = 10;
			Item[] items = new Item[] { ELIXIR_OF_THE_MONGOOSE };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Elixir of the Mongoose, -5, 0", app.items[0].toString());
		}

	}

	// Tests for Sulfuras
	@Nested
	@DisplayName("Tests for Sulfuras")
	class SulfurasTests {
		@Test
		void SulfurasTestAfterOneDay() {
			Item[] items = new Item[] { SULFURAS_ZERO };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			assertEquals("Sulfuras, Hand of Ragnaros, 0, 80", app.items[0].toString());
		}

		@Test
		void SulfurasTestAfterTenDays() {
			final int DAYS = 10;
			Item[] items = new Item[] { SULFURAS_ZERO };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Sulfuras, Hand of Ragnaros, 0, 80", app.items[0].toString());
		}

		@Test
		void SulfurasTestAfterSixDays() {
			final int DAYS = 6;
			Item[] items = new Item[] { SULFURAS_MINUS_ONE };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Sulfuras, Hand of Ragnaros, -1, 80", app.items[0].toString());
		}

		@Test
		void SulfurasTestAfterNineDays() {
			final int DAYS = 9;
			Item[] items = new Item[] { SULFURAS_MINUS_ONE };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Sulfuras, Hand of Ragnaros, -1, 80", app.items[0].toString());
		}

	}

	// Tests for Aged Backstage passes
	@Nested
	@DisplayName("Tests for Backstage passes")
	class BackstagePassesTests {
		@Test
		void BackstagePassesQuality49TestAfterOneDay() {
			Item[] items = new Item[] { BACKSTAGE_PASSES_QUALITY_49_5 };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			assertEquals("Backstage passes to a TAFKAL80ETC concert, 2, 50", app.items[0].toString());
		}

		@Test
		void BackstagePassesQuality49TestAfterFiveDays() {
			final int DAYS = 5;
			Item[] items = new Item[] { BACKSTAGE_PASSES_QUALITY_49_5 };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", app.items[0].toString());
		}

		@Test
		void BackstagePassesQuality49TestAfterSixDays() {
			final int DAYS = 6;
			Item[] items = new Item[] { BACKSTAGE_PASSES_QUALITY_49_5 };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", app.items[0].toString());
		}

		@Test
		void BackstagePassesQuality20TestAfter15Days() {
			final int DAYS = 15;
			Item[] items = new Item[] { BACKSTAGE_PASSES_QUALITY_20_15 };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", app.items[0].toString());
		}

		@Test
		void BackstagePassesQuality20TestAfter16Days() {
			final int DAYS = 16;
			Item[] items = new Item[] { BACKSTAGE_PASSES_QUALITY_20_15 };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", app.items[0].toString());
		}

		@Test
		void BackstagePassesQuality49SellIn10TestAfterNineDays() {
			final int DAYS = 9;
			Item[] items = new Item[] { BACKSTAGE_PASSES_QUALITY_49_10 };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Backstage passes to a TAFKAL80ETC concert, 1, 50", app.items[0].toString());
		}

		@Test
		void BackstagePassesQuality49SellIn10TestAfter11Days() {
			final int DAYS = 11;
			Item[] items = new Item[] { BACKSTAGE_PASSES_QUALITY_49_10 };
			GildedRose app = new GildedRose(items);
			for (int i = 0; i < DAYS; i++) {
				app.updateQuality();
			}
			assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", app.items[0].toString());
		}

	}

	// Tests for Conjured Mana Cake
	@Nested
	@DisplayName("Tests for Conjured Mana Cake")
	class ConjuredManaCakeTests {
		@Test
		void ConjuredManaCakeTestAfterOneDay() {
			Item[] items = new Item[] { CONJURED_MANA_CAKE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			assertEquals("Conjured Mana Cake, 1, 4", app.items[0].toString());
		}

		@Test
		void ConjuredManaCakeTestAfterTwoDays() {
			Item[] items = new Item[] { CONJURED_MANA_CAKE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			assertEquals("Conjured Mana Cake, -1, 1", app.items[0].toString());
		}

		@Test
		void ConjuredManaCakeTestAfterThreeDays() {
			Item[] items = new Item[] { CONJURED_MANA_CAKE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			assertEquals("Conjured Mana Cake, -3, 0", app.items[0].toString());
		}

		@Test
		void ConjuredManaCakeTestAfterFourDays() {
			Item[] items = new Item[] { CONJURED_MANA_CAKE };
			GildedRose app = new GildedRose(items);
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			app.updateQuality();
			assertEquals("Conjured Mana Cake, -5, 0", app.items[0].toString());
		}

	}
}
