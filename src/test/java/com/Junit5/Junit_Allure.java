package com.Junit5;

import com.JunitDemo01;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
@Epic("Epic 计算器项目")
@Feature("Feature 冒烟测试用例")
public class Junit_Allure {
    @Test
    @Order(1)
    @Description("Description")
    @Story("Stor加法测试")
    @DisplayName("DisplayName 加法测试")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("www.baidu.com")
    @Link(name = "Link 社会贴",type = "mylink",url = "https://ceshiren.com/t/topic/7611/37")
    public void test1() throws InterruptedException {
        final int result1= JunitDemo01.junitTest1(2,4);
        int result2= JunitDemo01.junitTest1(4,5);
        int result3= JunitDemo01.junitTest1(3,7);
        Allure.addAttachment("wq","image/png/webp",this.getClass().getResourceAsStream("/ss.webp"),".webp");
        assertAll("计算结果：",
                ()->assertEquals(6,result1),
                ()->assertEquals(9,result2),
                ()->assertEquals(10,result3)
        );


    }
    @Test
    public void test2() throws InterruptedException {
        int result1= JunitDemo01.junitTest2(2,4);
        assertEquals(-2,result1);
        System.out.println(result1);
    }
    @Test
    public void test3(){
        int result1= JunitDemo01.junitTest3(2,4);
        assertEquals(3,result1);
        System.out.println(result1);
    }
    @Test
    public void test4(){
        int result1= JunitDemo01.junitTest4(8,4);
        assertEquals(6,result1);
        System.out.println(result1);
    }
    @Test
    public void test5() throws InterruptedException {
        int result1 = JunitDemo01.junitTest15(3);
        assertEquals(3,result1);
        System.out.println(result1);
    }
}
