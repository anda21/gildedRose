package com.test.gildedRose.controllers;

import com.test.gildedRose.models.ItemModel;
import com.test.gildedRose.repositories.ItemRepository;

import com.test.gildedRose.services.GildedRoseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gildedRose")
public class ItemControllor {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private GildedRoseService gildedRoseService;

    @GetMapping("/item")
    public List<ItemModel> getAllItems() {
        return itemRepository.findAll();
    }

    @PutMapping("/updateItems")
    public List<ItemModel> update() {
        List<ItemModel> listItems = getAllItems();

        listItems = gildedRoseService.updateQuality(listItems);
        listItems =itemRepository.saveAll(listItems);
        System.out.println("Update");
        return listItems;
    }
}
