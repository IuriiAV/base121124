package com.telran.prof.lessontwentyfour;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTaskTest {

    private PracticeTask task = new PracticeTask();

    @ParameterizedTest
    @ValueSource(strings = {"1234567","123-4567","123 4567"})
    public void checkValidNumber(String number) {
        assertTrue(task.isValidNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12 34567","12345678","123+4567"})
    public void checkValidNumberWhenNumberIsInvalid(String number) {
        assertFalse(task.isValidNumber(number));
    }

}