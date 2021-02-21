package com.gcp.inventoryservice.service

import com.gcp.inventoryservice.domain.Inventory
import com.gcp.inventoryservice.domain.OpenBox
import org.springframework.stereotype.Service

@Service
class InventoryService {

    boolean isSkuSellable(String id, String condition = null) {
        Inventory inventory = fetchHardCodedInventory(id)
        if(inventory) {
            if(inventory.storePickUp || inventory.shipToHome) {
                return true
            }
            if(condition) {
                List<OpenBox> openBoxOptions = inventory.openBoxList?.findAll({ it -> it.condition == condition })
                if(openBoxOptions && openBoxOptions.get(0).openBoxShipToHome || openBoxOptions.get(0).openBoxStorePickUp) {
                    return true
                }
            }
        }
        return false
    }

    Inventory  fetchHardCodedInventory(String id) {
        Inventory inventory = null
        if('54321'.equalsIgnoreCase(id)) {
            List<OpenBox> openBoxList = new ArrayList<>()
            OpenBox openBox = new OpenBox('1',true,true)
            openBoxList.add(openBox)
            inventory = new Inventory('54321',true,true,openBoxList)
        }
        return inventory
    }
}
