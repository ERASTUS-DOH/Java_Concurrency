package com.Turntabl.io;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
//        int  MAX_PASSWORD = 9999;

//        Thread thread = new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println("this is thread "+ Thread.currentThread().getName());
//                        throw new RuntimeException(" Here is a new error");
//                    }
//                }
//        );
//        thread.setName("first_working_thread");

//        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("A critical issue occured in "+ t.getName() + " and this is the message"
//                    + e.getMessage()
//                );
//            }
//        });
//        System.out.println("currently running thread is "+ Thread.currentThread().getName() + " before starting a new Thread");
//        thread.start();

        //working with the police class.

//        Random random = new Random();
//        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));
//
//        List<Thread> threadList = new ArrayList<>();
//        threadList.add(new AscendingHackerThread(vault,MAX_PASSWORD));
//        threadList.add(new DescendingHackerThread(vault,MAX_PASSWORD));
//        threadList.add(new Police());
//
//        for(Thread thread : threadList){
//            thread.start();
//        }

//        BlockingTask blockingTask =

//        Thread thread = new Thread(new BlockingTask());
//        thread.start();
//        thread.interrupt();

//

//        ThroughputHttpServer throughputHttpServer = new ThroughputHttpServer();
//        throughputHttpServer.readFile();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter an integer here.");
//        int x = sc.nextInt();
//        System.out.println("enter your next integer here.");
//        int y = sc.nextInt();
//        int result = sum(x,y);
//        System.out.println("the Sum of the two numbers you entered is : " + result );

        //********sharing resources among threads. *************

        InventoryCounter inventoryCounter = new InventoryCounter();
        IncrementingThread incrementingThread = new IncrementingThread(inventoryCounter);
        DecrementingThread decrementingThread = new DecrementingThread(inventoryCounter);
        incrementingThread.start();
        incrementingThread.join();
        decrementingThread.start();
        decrementingThread.join();
        System.out.println("We currently have : " + inventoryCounter.getItems());

    }

//    public static int sum(int x, int y){
//        return x + y;
//    }
}
