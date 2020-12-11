package com.Turntabl.io;

import java.math.BigInteger;

public class LongComputation implements Runnable{
    private BigInteger base;
    private BigInteger power;

    public LongComputation (BigInteger base, BigInteger power){
        this.base = base;
        this.power = power;
    }

    public void run(){
        System.out.println(base+"^"+power+" = " + pow(base,power));
    }

    private BigInteger pow(BigInteger base, BigInteger power){
        BigInteger result = BigInteger.ONE;
        for(BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i= i.add(BigInteger.ONE)){
            if (Thread.currentThread().isInterrupted()){
                System.out.println("Thread prematurely interrupted");
                return BigInteger.ZERO;
            }
            result = result.multiply(base);
        }
        return result;
    }
}
