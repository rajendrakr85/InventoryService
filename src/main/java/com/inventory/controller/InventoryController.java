package com.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    private Logger log = LoggerFactory.getLogger(InventoryController.class);

    @GetMapping("/")
    public String getInventory(){
        log.info("Inventory#: Inside Inventory Service GET inventory method");
        return "Inventory Available";
    }

    @PostMapping("/create")
    public String getCreate(@RequestBody String inventoryName){
        log.info("Inventory#: Inside Inventory Service GET inventory method");
        return "Inventory created for "+inventoryName;
    }


}
