package com.gcp.inventoryservice.domain

class Inventory {
    String id
    String count

    Inventory(String id, String count) {
        this.id = id
        this.count = count
    }
}
