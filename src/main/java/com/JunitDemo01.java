package com;

public class JunitDemo01 {
    public static int result=0;
    public static int junitTest1(int x,int y) throws InterruptedException {
        int result = x + y;
        Thread.sleep(1000);
        return  result;
    }

    public static int junitTest2(int x,int y) throws InterruptedException {
        int result = x - y;
        Thread.sleep(1000);
        return  result;
    }

    public static int junitTest3(int x,int y){
        int result = x * y;
        return  result;
    }

    public static int junitTest4(int x,int y){
        int result = x / y;
        return  result;
    }

    public static int junitTest15 (int x) throws InterruptedException {
        int i =result;
        Thread.sleep(1000);
        result =i+x;
        return result;
    }
    public synchronized static int junitTest16 (int x) throws InterruptedException {
        int i =result;
        Thread.sleep(1000);
        result =i+x;
        return result;
    }


}
