package com.inventory.controller;

import com.inventory.modal.Product;
import com.inventory.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    private Logger log = LoggerFactory.getLogger(InventoryController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/message")
    public String getMessage(){
        return "Hello! This is from inventory ";
    }

    @GetMapping("/")
    public List<Product> getAllProduct(){
        log.info("Inventory#: Inside get method");
        return productService.findAll();
    }

    @PostMapping("/product")
    public Product save(@RequestBody Product product){
        log.info("Inventory#: Inside save method");
        return productService.save(product);
    }


}
