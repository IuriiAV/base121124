package com.telran.prof.lessonelleven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewTask {

    public static void main(String[] args) {
//3 -> dog, cat,elf
//4 -> flow, wolf
        String[] strings = {"student", "students", "dog", "cat", "elf",
                "flow", "wolf"};
        Map<Integer, List<String>> map = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            List<String> strings1 = map.get(length);
            if (strings1 == null){
                List<String> strings2 = new ArrayList<>();
                strings2.add(str);
                map.put(length, strings2);
            }else {
                strings1.add(str);
            }
            System.out.println(map);
        }

    }
}
