package com.keyin.rest.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InventoryController {
    @Autowired
    private InventoryService divisionService;

}
