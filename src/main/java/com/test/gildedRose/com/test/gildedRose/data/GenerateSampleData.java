package com.test.gildedRose.com.test.gildedRose.data;

import com.test.gildedRose.models.ItemModel;
import com.test.gildedRose.repositories.ItemRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@RequiredArgsConstructor
public class GenerateSampleData implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if(itemRepository.count() == 0) {
            ItemModel item = new ItemModel();

                item.setName("+5 Dexterity Vest");
                item.setSellIn(3);
                item.setQuality(5);
            itemRepository.save(item);
            item = new ItemModel();

                item.setName("Aged Brie");
                item.setSellIn(2);
                item.setQuality(0);
           itemRepository.save(item);
            item = new ItemModel();

                item.setName("Elixir of the Mongoose");
                item.setSellIn(0);
                item.setQuality(2);
            itemRepository.save(item);
            item = new ItemModel();

                item.setName("Sulfuras, Hand of Ragnaros");
                item.setSellIn(0);
                item.setQuality(80);
            itemRepository.save(item);
            item = new ItemModel();

                item.setName("Sulfuras, Hand of Ragnaros");
                item.setSellIn(-1);
                item.setQuality(80);
            itemRepository.save(item);
            item = new ItemModel();

                item.setName("Backstage passes to a TAFKAL80ETC concert");
                item.setSellIn(15);
                item.setQuality(20);
            itemRepository.save(item);
            item = new ItemModel();

                item.setName("Backstage passes to a TAFKAL80ETC concert");
                item.setSellIn(10);
                item.setQuality(48);
            itemRepository.save(item);
            item = new ItemModel();

            item.setName("Backstage passes to a TAFKAL80ETC concert");
            item.setSellIn(5);
            item.setQuality(47);
            itemRepository.save(item);
        }else{
            System.out.println("I found Data into Database :P !");
        }

    }
}

