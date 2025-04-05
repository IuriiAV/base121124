package com.telran.prof.lessoons.lesson24;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HomeTaskTest {

    @ParameterizedTest
    @ValueSource(strings = {"11111.111111.11.1", "", "1..1.1.1", "111.111.111", "11d.344.434.43", "111,222,1.2"})
    public void checkIPWhenItIsIncorrect(String ip) {
        assertFalse(new HomeTask().checkIP(ip));
    }

    @ParameterizedTest
    @ValueSource(strings = {"111.1.11.111", "1.1.1.1", "111.111.111.111"})
    public void checkIPWhenItIsCorrect(String ip) {
        assertTrue(new HomeTask().checkIP(ip));
    }

}