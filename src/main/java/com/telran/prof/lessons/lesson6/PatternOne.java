package com.telran.prof.lessons.lesson6;

import java.util.ArrayList;

public class PatternOne {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("java");
        strings.add("sql");
        strings.add("other");

        System.out.println("Original list " + strings);
        ArrayList<String> modifiedList = getModifiedList(strings);
        System.out.println("Modified list " + modifiedList);

        modifyList(strings);
       // System.out.println(modifyList(strings));
    }

    public static ArrayList<String> getModifiedList(ArrayList<String> list){
        ArrayList<String> modifiedList = new ArrayList<>();
        for (String value : list){
            String upperCase = value.toUpperCase();
            modifiedList.add(upperCase);
        }
        return modifiedList;
    }

    public static void modifyList(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            String upperCase = value.toUpperCase();
            list.add(0, upperCase);
        }
    }
}
