package com.Junit5;

import com.JunitDemo01;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit_MixParallel {
    @RepeatedTest(10)
    public void test1() throws InterruptedException {
        final int result1= JunitDemo01.junitTest1(2,4);
        assertEquals(6,result1);
        System.out.println(result1);
    }
    @RepeatedTest(10)
    public void test2() throws InterruptedException {
        int result1= JunitDemo01.junitTest2(2,4);
        assertEquals(-2,result1);
        System.out.println(result1);
    }
}
