package com.gcp.inventoryservice.controller

import com.gcp.inventoryservice.service.InventoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InventoryController {

    @Autowired
    InventoryService inventoryService

    @RequestMapping('inventory/{id}')
    @GetMapping
    boolean isSkuSellable(@PathVariable String id) {
        return inventoryService.isSkuSellable(id)
    }

    @RequestMapping('inventory/{id}/{condition}')
    @GetMapping
    boolean isOpenBoxSkuSellable(@PathVariable String id, @PathVariable String condition) {
        return inventoryService.isSkuSellable(id, condition)
    }
}
