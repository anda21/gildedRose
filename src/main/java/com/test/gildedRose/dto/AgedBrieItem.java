package com.test.gildedRose.dto;

import com.test.gildedRose.models.ItemModel;
import org.springframework.context.annotation.Bean;


public class AgedBrieItem {


    public ItemModel updateState(ItemModel item) {

        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality = item.quality + 1;
        }
        return item;


    }
}
