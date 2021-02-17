package com.gcp.inventoryservice.controller

import com.gcp.inventoryservice.domain.Inventory
import spock.lang.Specification

class InventoryControllerSpec  extends Specification{

    InventoryController inventoryController = new InventoryController()

    void fetchProduct() {
        when:
            Inventory inventory = inventoryController.fetchProduct('123')
        then:
            assert inventory
            assert inventory.id
    }
}
