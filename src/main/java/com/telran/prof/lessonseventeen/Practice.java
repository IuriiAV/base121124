package com.telran.prof.lessonseventeen;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 */
public class Practice {

    public static void main(String[] args) {
        String[][] array = {{"Hello", "World"}, {"Hello", "Java"},
                {"Hello", "Student"}, {"Welcome", "to", "lesson"}};
        //Count number of words
        //Count number unique words

        long count = Arrays.stream(array)
                .flatMap(strings -> Arrays.stream(strings))
                .count();
        System.out.println(count);

        long countDistinct = Arrays.stream(array)
                .flatMap(strings -> Arrays.stream(strings))
                .distinct()
                .count();
        System.out.println(countDistinct);

    }
}
