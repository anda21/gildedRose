package com.test.gildedRose;

import com.test.gildedRose.controllers.ItemControllor;
import com.test.gildedRose.dto.AgedBrieItem;
import com.test.gildedRose.dto.BackstagePassesItem;
import com.test.gildedRose.dto.EntryToTheBackstageItem;
import com.test.gildedRose.dto.SulfurasItem;
import com.test.gildedRose.models.ItemModel;


import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class GildedRoseApplicationTests {

	@Autowired
	private ItemControllor itemControllor;

	private EntryToTheBackstageItem entryToTheBackstageItem = new EntryToTheBackstageItem();
	private AgedBrieItem agedBrieItem = new AgedBrieItem();
	private BackstagePassesItem backstagePassesItem = new BackstagePassesItem();
	private SulfurasItem sulfurasItem = new SulfurasItem();

	@Test
	public void testAgedBrieLogic() {
		ItemModel agedBrie = itemControllor.getAllItems().get(1);
		agedBrie =agedBrieItem.updateState(agedBrie);
		Assert.assertEquals(1, agedBrie.getQuality());
		Assert.assertEquals(1, agedBrie.getSellIn());
	}

	@Test
	public void testBackstagePassesItem1() {
		ItemModel backstagePasses = itemControllor.getAllItems().get(5);
		backstagePasses =backstagePassesItem. updateState(backstagePasses);
		Assert.assertEquals(21, backstagePasses.getQuality());
		Assert.assertEquals(14, backstagePasses.getSellIn());
	}

	@Test
	public void testBackstagePassesItem2() {
		ItemModel backstagePasses = itemControllor.getAllItems().get(6);
		backstagePasses =backstagePassesItem. updateState(backstagePasses);
		Assert.assertEquals(50, backstagePasses.getQuality());
		Assert.assertEquals(9, backstagePasses.getSellIn());
	}

	@Test
	public void testBackstagePassesItem3() {
		ItemModel backstagePasses = itemControllor.getAllItems().get(7);
		backstagePasses =backstagePassesItem. updateState(backstagePasses);
		Assert.assertEquals(50, backstagePasses.getQuality());
		Assert.assertEquals(4, backstagePasses.getSellIn());
	}

	@Test
	public void EntryToTheBackstageItem1() {
		ItemModel entryToTheBackstage = itemControllor.getAllItems().get(0);
		entryToTheBackstage =entryToTheBackstageItem.updateState(entryToTheBackstage);
		Assert.assertEquals(4, entryToTheBackstage.getQuality());
		Assert.assertEquals(2, entryToTheBackstage.getSellIn());
	}

	@Test
	public void EntryToTheBackstageItem2() {
		ItemModel entryToTheBackstage = itemControllor.getAllItems().get(2);
		entryToTheBackstage =entryToTheBackstageItem.updateState(entryToTheBackstage);
		Assert.assertEquals(0, entryToTheBackstage.getQuality());
		Assert.assertEquals(-1, entryToTheBackstage.getSellIn());
	}

	@Test
	public void testSulfurasItem() {
		ItemModel sulfuras = itemControllor.getAllItems().get(4);
		sulfuras =sulfurasItem.updateState(sulfuras);
		Assert.assertEquals(80, sulfuras.getQuality());
		Assert.assertEquals(-1, sulfuras.getSellIn());
	}
}

