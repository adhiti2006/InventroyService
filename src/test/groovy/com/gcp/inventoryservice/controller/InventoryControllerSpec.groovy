package com.gcp.inventoryservice.controller

import spock.lang.Specification

class InventoryControllerSpec  extends Specification{

    InventoryController inventoryController = new InventoryController()

    void fetchProduct() {
        when:
            boolean isSkuSellable = inventoryController.isSkuSellable('123')
        then:
            assert isSkuSellable
    }
}
