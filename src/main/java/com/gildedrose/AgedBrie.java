package com.gildedrose;

public class AgedBrie implements ItemInterface{

    public Item item;

    public AgedBrie(Item item){
        this.item = item;
    }
    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 0) {
                item.quality = item.quality + 1;
            }
        }

        item.sellIn = item.sellIn - 1;
    }

}
