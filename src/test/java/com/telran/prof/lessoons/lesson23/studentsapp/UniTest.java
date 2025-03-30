package com.telran.prof.lessoons.lesson23.studentsapp;

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
        int sizeBeforeAdd = uni.getAll().size();
        uni.addStudent(new Student("Max", "DD", 89));
        int sizeAfterAdd = uni.getAll().size();
        assertEquals(sizeBeforeAdd + 1, sizeAfterAdd);
        sizeBeforeAdd = uni.getAll().size();
        uni.addStudent(new Student());
        sizeAfterAdd = uni.getAll().size();
        assertEquals(sizeBeforeAdd + 1, sizeAfterAdd);
    }

//    @Test
//    public void testDeleteStudent() {
//        int sizeBeforeDelete = uni.getAll().size();
//        uni.deleteStudent("Max");
//        int sizeAfterDelete = uni.getAll().size();
//        assertEquals(sizeBeforeDelete - 1, sizeAfterDelete);
//        sizeBeforeDelete = uni.getAll().size();
//        uni.deleteStudent(null);
//        sizeAfterDelete = uni.getAll().size();
//        assertEquals(sizeBeforeDelete, sizeAfterDelete);
//    }

//    @ParameterizedTest
//    @ValueSource(strings = {"Oleg"})
//    @NullAndEmptySource
//    public void deleteStudentByName(java.lang.String text) {
//        int sizeBeforeDelete = uni.getAll().size();
//        uni.deleteStudent(text);
//        assertEquals(sizeBeforeDelete, uni.getAll().size());
//    }

    @ParameterizedTest
    @MethodSource("getArguments")
    public void deleteStudentCommon(String input, int expected) {
        uni.deleteStudent(input);
        assertEquals(expected, uni.getAll().size());
    }

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("Oleg" , 2),
                Arguments.of("" , 2),
                Arguments.of(null , 2),
                Arguments.of("Max" , 1));
    }

//    @Test
//    public void deleteStudentWhenNameIsNotEmptyAndStudentExists(){
//        int sizeBeforeDelete = uni.getAll().size();
//        uni.deleteStudent("Max");
//        int sizeAfterDelete = uni.getAll().size();
//        assertEquals(sizeBeforeDelete - 1, sizeAfterDelete);
//    }
//
//    @Test
//    public void deleteStudentWhenNameIsNotEmptyAndStudentNotExists(){
//        int sizeBeforeDelete = uni.getAll().size();
//        uni.deleteStudent("Mark");
//        int sizeAfterDelete = uni.getAll().size();
//        assertEquals(sizeBeforeDelete, sizeAfterDelete);
//    }
//
//    @Test
//    public void deleteStudentWhenNameIsEmpty(){
//        int sizeBeforeDelete = uni.getAll().size();
//        uni.deleteStudent("");
//        int sizeAfterDelete = uni.getAll().size();
//        assertEquals(sizeBeforeDelete, sizeAfterDelete);
//    }
//
//    @Test
//    public void deleteStudentWhenNameIsNull(){
//        int sizeBeforeDelete = uni.getAll().size();
//        uni.deleteStudent(null);
//        int sizeAfterDelete = uni.getAll().size();
//        assertEquals(sizeBeforeDelete, sizeAfterDelete);
//    }

    @Test
    public void testGetAll() {
        assertEquals(2, uni.getAll().size());
    }
}