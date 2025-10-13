package com.keyin.rest.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory createInventoryItem(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public Inventory getInventoryById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public List<Inventory> findByItemName(String itemName) {
        return inventoryRepository.findByItemName(itemName);
    }

    public Inventory updateInventoryItem(Long id, Inventory updatedInventory) {
        return inventoryRepository.findById(id)
                .map(inventory -> {
                    inventory.setItemName(updatedInventory.getItemName());
                    inventory.setQuantity(updatedInventory.getQuantity());
                    inventory.setPrice(updatedInventory.getPrice());
                    return inventoryRepository.save(inventory);
                })
                .orElse(null);
    }

    public void deleteInventoryItem(Long id) {
        inventoryRepository.deleteById(id);
    }

}
