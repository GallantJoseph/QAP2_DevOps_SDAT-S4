package com.keyin.rest.inventory;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends org.springframework.data.repository.CrudRepository<Inventory, Long> {
    public List<Inventory> findByItemName(String itemName);
}
