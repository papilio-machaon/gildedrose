package com.gildedrose;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GildedRoseTest {
    @Test
    public void GildedRoseInterfaceTest() {
        Item agedBrie = new Item("Aged Brie", -1, -5);
        ItemInterface[] items = new ItemInterface[] {new AgedBrie(agedBrie)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(agedBrie.quality, equalTo(-3));
    }
    /*
    @Test
    public void GildedRoseNegativeSellIn() {
        Item[] items = new Item[]{
                new Item("Aged Brie", -15, 0),
                new Item("Elixir of the Mongoose", -55, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[3].quality, equalTo(43));
    }

    @Test
    public void GildedRoseNegativeSellIn2() {
        Item[] items = new Item[]{
                new Item("Aged Brie", -15, 0),
                new Item("Elixir of the Mongoose", -55, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", -35, 40)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[3].quality, equalTo(0));
    }


    @Test
    public void GildedRoseLine55Survivor() {
        Item[] items = new Item[]{
                new Item("Aged Brie", -1, 50),
                new Item("Elixir of the Mongoose", -55, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", -35, 40)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[0].quality, equalTo(50));
    }

    @Test
    public void GildedRoseLine56Survivor() {
        Item[] items = new Item[]{
                new Item("Aged Brie", -1, -5)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[0].quality, equalTo(-3));
    }

    @Test
    public void GildedRoseLine4748Survivors() {
        Item[] items = new Item[]{
                new Item("Elixir of the Mongoose", -55, 7),
                new Item("Sulfuras, Hand of Ragnaros", -10, 80)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[0].quality, equalTo(5));
        assertThat(items[1].quality, equalTo(80));
    }

    @Test
    public void GildedRoseNewItem() {
        Item[] items = new Item[]{
                new Item("Test_Item", -55, 7)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[0].quality, equalTo(5));
        assertThat(items[0].sellIn, equalTo(-56));
    }

    @Test
    public void GildedRoseMongooseItem() {
        Item[] items = new Item[]{
                new Item("Elixir of the Mongoose", 5, 7)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertThat(items[0].quality, equalTo(6));
        assertThat(items[0].sellIn, equalTo(4));
    }

     */

}
