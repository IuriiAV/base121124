package com.telran.prof.lessoons.lesson24;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PracticeTaskTest {

    @ParameterizedTest
    @MethodSource("getArguments")
    void checkNumberWhenNumberIsNullOrEmptyOrIncorrectNumberOfCharacters(String input) {
        boolean res = PracticeTask.checkNumber(input);
        assertEquals(false, res);
    }

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(""),
                Arguments.of("123--4567"),
                Arguments.of("123  4567"),
                Arguments.of("12345678"),
                Arguments.of("123456b"),
                Arguments.of("dfghjkl"));
    }

    @ParameterizedTest
    @MethodSource("getArgumentsTwo")
    void checkNumberWhenNumberIsNotNullOrNotEmptyOrCorrectNumberOfCharacters(String input) {
        boolean res = PracticeTask.checkNumber(input);
        assertEquals(true, res);
    }

    private static Stream<Arguments> getArgumentsTwo() {
        return Stream.of(
                Arguments.of("123-4567"),
                Arguments.of("123 4567"),
                Arguments.of("1234567"));
    }
}