package com.telran.prof.lessons.lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer % 2 != 0){
                list.remove(integer);
            }
        }
        System.out.println(list);


//        for (Integer integer : list){
//            if (integer % 2 == 0){
//                list.remove(integer);
//            }
//        }
//        System.out.println(list);



        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            if (integer % 4 == 0)
            iterator.remove();
        }
        System.out.println(list);
    }
}
