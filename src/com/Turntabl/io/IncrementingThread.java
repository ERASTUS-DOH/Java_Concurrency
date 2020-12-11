package com.Turntabl.io;

public class IncrementingThread extends Thread{
    private InventoryCounter inventoryCounter;

    public IncrementingThread(InventoryCounter inventoryCounter){
        this.inventoryCounter = inventoryCounter;
    }

    public void run(){
        for(int i = 0; i < 10000; i++){
            this.inventoryCounter.increment();
        }
    }
}
