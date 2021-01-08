package com.gildedrose;

import com.gildedrose.core.GildedRose;
import com.gildedrose.core.Item;
import com.gildedrose.items.NormalItem;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class TestSwitchItem {

    private Item[] items = new Item[]{new NormalItem("+5 Dexterity Vest", 10, 20)};
    private GildedRose app = new GildedRose(items);

    @Test
     void een() {
        if (app.items[0].sellIn >= 0) {
            while (app.items[0].quality < 50) {
                app.items[0].quality = app.items[0].quality + 1;

                app.calculateNextDay();
                if (app.items[0].sellIn >= 0) {
                    app.items[0].quality = app.items[0].quality + 1;
                }
                app.calculateNextDay();
                if (app.items[0].sellIn >= 0) {
                    app.items[0].quality = app.items[0].quality + 1;
                }
            }
        }
        System.out.println(items);
    }

    @Test
     void twee() {
        if (app.items[0].sellIn < 0) {
            while (app.items[0].quality >= 0) {
                app.items[0].quality = app.items[0].quality - 1;

                app.calculateNextDay();
                if (app.items[0].sellIn >= 0) {

                    app.items[0].quality = app.items[0].quality - 1;

                }
                app.calculateNextDay();
                if (app.items[0].sellIn >= 0) {

                    app.items[0].quality = app.items[0].quality - 1;
                }
            }
        }
        System.out.println(items);
    }

    @Override
    public String toString() {
        return super.toString()+" TestSwitchItem{" +
                "items=" + Arrays.toString(items) +
                ", app=" + app +
                '}';
    }
}

