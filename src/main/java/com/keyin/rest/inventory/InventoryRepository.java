package com.keyin.rest.inventory;

import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends org.springframework.data.repository.CrudRepository<Inventory, Long> {
    public Inventory findByItemName(String itemName);

}
