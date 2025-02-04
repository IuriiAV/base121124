package com.telran.prof.lessons.lesson8.sort;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        // o1 < o2   return < 0 (-1)
        // o1 = o2   return = 0 (0)
        // o1 > o2   return > 0 (1)

//        int ageOne = o1.getAge();
//        int ageTwo = o2.getAge();
//        if (ageOne < ageTwo){
//            return -1;
//        }
//        if (ageOne > ageTwo){
//            return 1;
//        }
//        return 0;
        return o1.getAge() - o2.getAge();
    }
}
