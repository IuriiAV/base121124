package com.telran.prof.lessons.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Practice {

    public static void main(String[] args) {
        String[][] array = {{"Hello", "World"}, {"Hello", "Java"},
                {"Hello", "Student"}, {"Welcome", "to", "lesson"}};
        //Count number all words
        //Count number unique words

        long count = Arrays.stream(array)
                .flatMap(strings -> Arrays.stream(strings))
                .count();
        System.out.println(count);

        long collect = Arrays.stream(array)
                .flatMap(strings -> Arrays.stream(strings))
                .distinct()
                .count();
        System.out.println(collect);
    }
}
