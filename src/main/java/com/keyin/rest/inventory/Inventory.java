package com.keyin.rest.inventory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Inventory {
    @Id
    @SequenceGenerator(name = "inventory_sequence", sequenceName = "inventory_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "inventory_sequence")
    private long id;

    private String itemName;
    private int quantity;
    private double price;

    public Inventory() {

    }

    public Inventory(long id) {
        this.id = id;
    }

    public Inventory(String itemName) {
        this.itemName = itemName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
