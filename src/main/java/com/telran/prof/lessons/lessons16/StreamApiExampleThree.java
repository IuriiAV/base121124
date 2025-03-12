package com.telran.prof.lessons.lessons16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiExampleThree {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(35, "Max"),
                new Student(40, "Oleg"),
                new Student(25, "Alex"));

        List<String> nameList = new ArrayList<>();

//        for (Student name : students){
//            nameList.add(name.getName());
//        }
//        System.out.println(nameList);

        Function<Student, String> convert = student ->  student.getName();
        for(Student student : students) {
            nameList.add(convert.apply(student));
        }
        System.out.println(nameList);

        //map(Function)
        List<String > collectedName = students.stream()
                .map(convert)
                .collect(Collectors.toList());
        System.out.println(collectedName);

        //generate list ages

        List<Integer> collectedAge = students.stream()
                .map(student -> student.getAge())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collectedAge);

        //use stream increase age by 5 and

        List<Student> studentsTwo = students.stream()
                .peek(student -> student.setAge(student.getAge() + 5))
                .collect(Collectors.toList());
        System.out.println(studentsTwo);
    }
}
