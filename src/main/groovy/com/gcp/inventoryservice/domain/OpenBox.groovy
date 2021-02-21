package com.gcp.inventoryservice.domain

class OpenBox {
    String condition
    boolean openBoxStorePickUp
    boolean openBoxShipToHome

    OpenBox(String condition, boolean openBoxStorePickUp, boolean openBoxShipToHome) {
        this.condition = condition
        this.openBoxStorePickUp = openBoxStorePickUp
        this.openBoxShipToHome = openBoxShipToHome
    }
}
