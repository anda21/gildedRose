package com.test.gildedRose.models;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name= "item")
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "sellinIn", nullable = false)
    public int sellIn;

    @Column(name = "quality", nullable = false)
    public int quality;

}
