package com.Junit5;

import com.JunitDemo01;
import com.JunitDemo02;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitDemo_Parallel {
    @RepeatedTest(10)
    public void test5() throws InterruptedException {
        int result1 = JunitDemo01.junitTest15(1);
        //assertEquals(3,result1);
        System.out.println(result1);
    }
    @RepeatedTest(10)
    public void synTest6() throws InterruptedException {
        int result1 = JunitDemo01.junitTest16(1);
        //assertEquals(3,result1);
        System.out.println(result1);
    }
    @RepeatedTest(10)
    public void test6() throws InterruptedException {
        AtomicInteger result1 = JunitDemo02.junitTest17();
        //assertEquals(3,result1);
        System.out.println(result1);
    }
}
