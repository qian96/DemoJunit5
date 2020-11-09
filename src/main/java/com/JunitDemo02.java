package com;

import java.util.concurrent.atomic.AtomicInteger;


public class JunitDemo02 implements Runnable{
    private static AtomicInteger result2 = new AtomicInteger(0);
    public static AtomicInteger junitTest17() throws InterruptedException {
        Thread.sleep(1000);
        result2.incrementAndGet();
        return result2;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }
    }

}
