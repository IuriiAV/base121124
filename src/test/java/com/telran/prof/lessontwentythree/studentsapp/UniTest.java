package com.telran.prof.lessontwentythree.studentsapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniTest {

    private Uni uni;

    @BeforeEach
    public void initUni() {
        uni = new Uni();
        uni.init();
    }

    @Test
    public void testAddStudent() {
        Student student = new Student("Name", "Surname", 30);
        int sizeBeforeAdd = uni.getAll().size();
        uni.addStudent(student);
        int sizeAfterAdd = uni.getAll().size();
        assertEquals(sizeBeforeAdd + 1, sizeAfterAdd);
    }

    @Test
    public void testGetAll() {
        assertEquals(2, uni.getAll().size());
    }

//    @Test
//    public void deleteStudentWhenNameIsNotEmptyAndStudentExists() {
//        int sizeBefore = uni.getAll().size();
//        uni.deleteStudent("Max");
//        assertEquals(sizeBefore - 1, uni.getAll().size());
//    }

//    @ParameterizedTest
//    @ValueSource(strings = {"Oleg"})
//    @NullAndEmptySource
//    public void deleteStudentByName(java.lang.String text) { // "Oleg","",null
//        int sizeBefore = uni.getAll().size();
//        uni.deleteStudent(text);
//        assertEquals(sizeBefore, uni.getAll().size());
//    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void deleteStudentCommon(String input, int expected) { // "Oleg","",null
        uni.deleteStudent(input);
        assertEquals(expected, uni.getAll().size());
    }

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("Oleg", 2),
                Arguments.of("", 2),
                Arguments.of(null, 2),
                Arguments.of("Max", 1)
        );
    }

//    @Test
//    public void deleteStudentWhenNameIsNotEmptyAndStudentNotExists() {
//        int sizeBefore = uni.getAll().size();
//        uni.deleteStudent("Oleg");
//        assertEquals(sizeBefore, uni.getAll().size());
//    }
//
//    @Test
//    public void deleteStudentWhenNameIsEmpty() {
//        int sizeBefore = uni.getAll().size();
//        uni.deleteStudent("");
//        assertEquals(sizeBefore, uni.getAll().size());
//    }
//
//    @Test
//    public void deleteStudentWhenNameIsNull() {
//        int sizeBefore = uni.getAll().size();
//        uni.deleteStudent(null);
//        assertEquals(sizeBefore, uni.getAll().size());
//    }

}