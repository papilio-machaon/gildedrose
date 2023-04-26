package com.gildedrose;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GildedRoseTest {
    @Test
    public void GildedRoseNegativeSellIn() {
        Item[] items = new Item[] {
                new Item("Aged Brie", -15, 0),
                new Item("Elixir of the Mongoose", -55, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[3].quality, equalTo(43));
    }

    @Test
    public void GildedRoseNegativeSellIn2() {
        Item[] items = new Item[] {
                new Item("Aged Brie", -15, 0),
                new Item("Elixir of the Mongoose", -55, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", -35, 40) };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[3].quality, equalTo(0));
    }
}
