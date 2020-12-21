package com.gildedrose.items;

import com.gildedrose.core.GildedRose;
import com.gildedrose.core.Item;

public class SwitchItem extends Item {


    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {

    }

    @Override
    public String toString() {
        return "SwitchItem{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }
}

