package com.test.gildedRose.repositories;

import com.test.gildedRose.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends JpaRepository<ItemModel, Long> {}

