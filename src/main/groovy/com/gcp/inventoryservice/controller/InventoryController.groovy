package com.gcp.inventoryservice.controller

import com.gcp.inventoryservice.domain.Inventory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InventoryController {

    @RequestMapping('inventory/{id}')
    @GetMapping
    Inventory fetchProduct(@PathVariable String id) {
        Inventory inventory = new Inventory("123","20")
        return inventory
    }
}
