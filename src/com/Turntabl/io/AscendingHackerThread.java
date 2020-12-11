package com.Turntabl.io;

import java.util.Map;

public class AscendingHackerThread extends HackerThread{

    public static int MAX_PASSWORD;
    public AscendingHackerThread(Vault vault, int max_password){
        super(vault);
        MAX_PASSWORD =  max_password;
    }

    public void run(){
        for(int guess = 0; guess < MAX_PASSWORD; guess++){
            if(vault.isCorrectPassword(guess)){
                System.out.println(this.getName() + "guessed the password " + guess);
                System.exit(0);
            }
        }
    }
}
