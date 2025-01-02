package com.telran.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Это тестовый класс, для класса AppExample
 */
class AppExampleTest {

    @Test // Данный метод является тестом, который можно запустить
    public void testGetSum() {
        int a = 2;
        int b = 3;
        int sum = AppExample.getSum(a, b);
        // a = 2, b = 3 , sum == 5!!!!
        //Предполагаем что 5 == sum
        assertEquals(5, sum);
    }

    @Test
    public void testGetFullPrice() {
        int priceTrip = 5;
        int number = 2;
        int fullPrice = AppExample.getFullPrice(priceTrip, number);
        assertEquals(10, fullPrice);
    }
}