package com.inventory.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {


    @GetMapping("/")
    public String getInventory(){
        return "Inventory Available";
    }

    @PostMapping("/create")
    public String getCreate(@RequestBody String inventoryName){
        return "Inventory created for "+inventoryName;
    }

}
