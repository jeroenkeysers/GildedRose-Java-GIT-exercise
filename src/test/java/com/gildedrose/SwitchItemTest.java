package com.gildedrose;

import com.gildedrose.core.GildedRose;
import com.gildedrose.core.Item;
import com.gildedrose.items.NormalItem;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class SwitchItemTest {
    private Item[] items = new Item[]{new NormalItem("+5 Dexterity Vest", 10, 20)};
    private GildedRose app = new GildedRose(items);

    @Test
    void sellInValueSmallerThenZero(){
        app.calculateNextDay();
        assert(app.items[0].sellIn == 9);
        assert(app.items[0].quality == 21);
        app.calculateNextDay();
        assert(app.items[0].sellIn == 8);
        assert(app.items[0].quality == 22);
        app.calculateNextDay();
        assert(app.items[0].sellIn == 7);
        assert(app.items[0].quality == 23);
    }

    @Test
    void sellInValueSameOrMoreThenZero(){
        app.items[0].sellIn = 1;
        app.items[0].quality = 1;
        app.calculateNextDay();
        assert(app.items[0].sellIn == 0);
        assert(app.items[0].quality == 2);
        app.calculateNextDay();
        assert(app.items[0].sellIn == -1);
        assert(app.items[0].quality == 1);
        app.calculateNextDay();
        assert(app.items[0].sellIn == -2);
        assert(app.items[0].quality == 0);
        app.calculateNextDay();
        assert(app.items[0].sellIn == -3);
        assert(app.items[0].quality == 0);
    }

}