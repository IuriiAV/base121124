package com.telran.prof.lessoons.lesson17;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        String[][] array = {{"Hello", "World"},{"Hello", "Java"},
                {"Hello", "Student"},{"Welcome", "to", "lesson"}};
        long count = Arrays.stream(array)
                .flatMap(arr -> Arrays.stream(arr)).count();
        System.out.println(count);
        long count1 = Arrays.stream(array)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .count();
        System.out.println(count1);


    }
}
