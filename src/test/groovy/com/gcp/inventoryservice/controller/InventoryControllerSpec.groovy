package com.gcp.inventoryservice.controller

import org.junit.Ignore
import spock.lang.Specification

@Ignore
class InventoryControllerSpec  extends Specification{

    InventoryController inventoryController = new InventoryController()

    void fetchProduct() {
        when:
            boolean isSkuSellable = inventoryController.isSkuSellable('123')
        then:
            assert isSkuSellable
    }
}
