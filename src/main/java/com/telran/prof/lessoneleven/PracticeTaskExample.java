package com.telran.prof.lessoneleven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeTaskExample {

    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "cat", "elf",
                "flow", "wolf"};
        //1) вывести в консоль слова какой длины у нас есть
        // и какое количество слов каждой длины

        Map<Integer , List<String>> map = new HashMap<>();
        //3 -> dog, cat,elf
        //4 -> flow, wolf

        for(String str : words) {
            int length = str.length();
            List<String> stringList = map.get(length);
            if(stringList == null) {
                List<String> strings = new ArrayList<>();
                strings.add(str);
                map.put(length, strings);
            } else {
                stringList.add(str);
               // map.put(length, stringList);
            }
        }

        System.out.println(map);

        // 3  -> #HHFF00 List dog, cat
        //stringList - > #HHFF00

        // #EE33FF List : flow
        // 4 -> #EE33FF
    }

}
