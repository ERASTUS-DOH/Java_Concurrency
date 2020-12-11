package com.Turntabl.io;

public class DecrementingThread extends Thread{
    private InventoryCounter inventoryCounter;

    public DecrementingThread(InventoryCounter inventoryCounter){
        this.inventoryCounter = inventoryCounter;
    }

    public void run(){
        for(int i = 10000; i > 100; i--){
            inventoryCounter.decrement();
            System.out.println(i+"from the decrementing thread");
        }
    }
}
