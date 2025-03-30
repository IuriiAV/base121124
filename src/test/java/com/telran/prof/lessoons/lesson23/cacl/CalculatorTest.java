package com.telran.prof.lessoons.lesson23.cacl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeEach
    public void printStartTime() {
        System.out.println("Start time : " + LocalDateTime.now());
    }

    //Это unit тесты, это самая минимальная единица тестирования
    @Test
    public void testSum() {
        int sum = calculator.sum(3, 5);
        assertEquals(8, sum);
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testSub() {
        int sub = calculator.sub(9,4);
        assertEquals(5, sub);
    }

    @AfterEach
    public void printEndTime() {
        System.out.println("End time : " + LocalDateTime.now());
    }
}