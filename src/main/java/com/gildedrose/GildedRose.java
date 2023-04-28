package com.gildedrose;

class GildedRose {
    ItemInterface[] items;

    public GildedRose(ItemInterface[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (ItemInterface item : items) {
            item.updateQuality();
        }




//            if (item.name.equals("Aged Brie")) {
//                if (item.quality < 50) {
//                    item.quality = item.quality + 1;
//                    if (item.sellIn < 0) {
//                        item.quality = item.quality + 1;
//                    }
//                }
//            } else {
//                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                    if (item.quality < 50) {
//                        item.quality = item.quality + 1;
//                        if (item.sellIn < 11) {
//                            if (item.quality < 50) {
//                                item.quality = item.quality + 1;
//                            }
//                        }
//
//                        if (item.sellIn < 6) {
//                            if (item.quality < 50) {
//                                item.quality = item.quality + 1;
//                            }
//                        }
//                        if (item.sellIn < 0) {
//                            item.quality = 0;
//                        }
//                    }
//                } else {
//                    if (item.quality > 0) {
//                        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
//                            item.quality = item.quality - 1;
//                        }
//                    }
//                }
//            }
//
//            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
//                item.sellIn = item.sellIn - 1;
//            }
//
//            if (item.sellIn < 0) {
//                if (item.quality > 0) {
//                    if (!item.name.equals("Aged Brie") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert") && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
//                        item.quality = item.quality - 1;
//                    }
//                }
//            }
//        }

    }
    }
