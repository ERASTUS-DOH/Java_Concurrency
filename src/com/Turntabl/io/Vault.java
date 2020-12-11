package com.Turntabl.io;

public class Vault {
    private int password;

    public Vault(int password){
        this.password = password;
    }

    public boolean isCorrectPassword(int guess){
        try{
            Thread.sleep(5);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        return this.password == guess;
    }
}
