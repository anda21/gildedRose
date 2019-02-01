package com.test.gildedRose.services;

import com.test.gildedRose.dto.*;
import com.test.gildedRose.models.ItemModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GildedRoseService {
    Item[] items;

    AgedBrieItem agedBrieItem = new AgedBrieItem();
    BackstagePassesItem backstagePassesItem = new BackstagePassesItem();
    SulfurasItem sulfurasItem = new SulfurasItem();
    EntryToTheBackstageItem entryToTheBackstageItem = new EntryToTheBackstageItem();

    public GildedRoseService() {
    }

    public GildedRoseService(Item[] items) {
        this.items = items;
    }


    public List<ItemModel> updateQuality(List<ItemModel> items) {
        List<ItemModel> updetedItemModels =  new ArrayList<>();
        for (ItemModel item : items) {
            if (item.name.equals("Aged Brie")) {
                item = agedBrieItem.updateState(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item = backstagePassesItem.updateState(item);
            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item = sulfurasItem.updateState(item);
            } else {
                item = entryToTheBackstageItem.updateState(item);
            }
            updetedItemModels.add(item);
        }
        return updetedItemModels;
    }
}