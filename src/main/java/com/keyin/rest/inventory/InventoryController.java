package com.keyin.rest.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class InventoryController {
    @Autowired
    private InventoryService divisionService;

    @PostMapping("/inventory")
    public Inventory createInventoryItem(@RequestBody Inventory inventory) {
        return divisionService.createInventoryItem(inventory);
    }

    @GetMapping("/inventory")
    public List<Inventory> getAllInventoryItems() {
        return divisionService.getAllInventoryItems();
    }

    @GetMapping("/inventory/{id}")
    public Inventory getInventoryById(@PathVariable Long id) {
        return divisionService.getInventoryById(id);
    }

    @GetMapping("/inventory_search")
    public List<Inventory> getInventoryByItemName(@RequestParam(value = "itemName") String itemName) {
        List<Inventory> results = new ArrayList<>();

        if (itemName != null) {
            results = divisionService.findByItemName(itemName);
        }

        return results;
    }

    @PutMapping("/inventory/{id}")
    public Inventory updateInventoryItem(@PathVariable Long id, @RequestBody Inventory updatedInventory) {
        return divisionService.updateInventoryItem(id, updatedInventory);
    }

    @DeleteMapping("/inventory/{id}")
    public void deleteInventoryItem(@PathVariable Long id) {
        divisionService.deleteInventoryItem(id);
    }

}
