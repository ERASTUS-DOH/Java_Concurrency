package com.Turntabl.io;

public class BlockingTask implements Runnable {

    public void run() {
       try{
           Thread.sleep(5000000);
       } catch (InterruptedException e){
           System.out.println("Exiting blocking thread");
       }
    }
}
