package com.telran.prof.lessoons.hw.hw14;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegexTaskTest {

    @ParameterizedTest
    @ValueSource(strings = {"1.1.1", "111.111.111.1111", "1.1..1.1", "1.1.1.256", "1.1.1,1", "a1,1,1,1", "1 1.1.1.1"})
    @NullAndEmptySource
    public void checkWhenIPIsIncorrect(String ip) {
        assertFalse(new RegexTask().checkIP(ip));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1.1.1.1", "000.000.000.000", "1.1.1.255"})
    public void checkWhenIPIsCorrect(String ip) {
        assertTrue(new RegexTask().checkIP(ip));
    }
}