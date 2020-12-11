package com.Turntabl.io;

public class DescendingHackerThread extends HackerThread {
    public static int MAX_PASSWORD;
    public DescendingHackerThread(Vault vault, int max_password){
        super(vault);
        MAX_PASSWORD = max_password;
    }

    public void run(){
        for(int guess = MAX_PASSWORD; guess >= 0; guess--){
            if(vault.isCorrectPassword(guess)){
                System.out.println(this.getName() + " guess the password " + guess);
                System.exit(0);
            }
        }
    }
}
