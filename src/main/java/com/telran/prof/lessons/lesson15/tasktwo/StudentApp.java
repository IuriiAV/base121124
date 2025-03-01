package com.telran.prof.lessons.lesson15.tasktwo;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StudentApp {

    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Student> studentList = Arrays.asList(
                new Student(353245328,"Max", "Lem"),
                new Student(653474322,"Max1", "Lem"),
                new Student(139641141,"Max2", "Lem"),
                new Student(763764433,"Max3", "Lem"),
                new Student(186763435,"Max4", "Lem"),
                new Student(465783443,"Max5", "Lem"),
                new Student(845225654,"Max6", "Lem"),
                new Student(235325636,"Max7", "Lem"),
                new Student(952423141,"Max8", "Lem"),
                new Student(257423424,"Max9", "Lem"));
        List<Integer> idList = new ArrayList<>();

        Function<Student, Integer> convertIntInTd = (student) -> student.getId();

        for (int i = 0; i < studentList.size(); i++) {
            idList.add(convertIntInTd.apply(studentList.get(i)));
        }
        
        for (Student student : studentList){
            Integer apply = convertIntInTd.apply(student);
            idList.add(apply);
        }
        System.out.println(idList);


        List<Student> studentListTwo = new ArrayList<>();
        StudentGenerator getStudent = (id, name, surname) -> new Student(id, name, surname);
        for (int i = 0; i < 10; i++) {
            Student student = getStudent.createStudent(faker.number().numberBetween(3, 6), faker.name().firstName(), faker.name().lastName());
            studentListTwo.add(student);
        }

        System.out.println(studentListTwo);
        //System.out.println(studentList);
    }
}
