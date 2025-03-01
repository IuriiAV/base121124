package com.telran.prof.lessonelleven;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

    public static void main(String[] args) {
        String text ="svdfvfgvdtshsthhdhsghbsbsbsdhsthsb";


        Map<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            Integer count = map.get(temp);
            if (count == null){
                map.put(temp , 1);
            }else {
                count = count + 1;
                map.put(temp , count);
            }
        }
        map.forEach((key , value) ->{
            System.out.println("Letter " + key + ", exist " + value + " times");
        });

        System.out.println("Optiom two");
        map.clear();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            boolean b = map.containsKey(temp);// проверка что ключ есть
            if (b) {
                Integer count = map.get(temp);
                map.put(temp , count + 1);
            }
            else {
                map.put(temp,1);
            }
        }
        map.forEach((key , value) ->{
            System.out.println("Letter " + key + ", exist " + value + " times");
        });

        System.out.println("Option three");
        map.clear();
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);

            Integer value = map.getOrDefault(temp, 0);
            map.put(temp, value + 1);

        }
        map.forEach((key , value) ->{
            System.out.println("Letter " + key + ", exist " + value + " times");
        });
    }
}
