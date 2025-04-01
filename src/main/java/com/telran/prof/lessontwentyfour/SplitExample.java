package com.telran.prof.lessontwentyfour;

public class SplitExample {

    public static void main(String[] args) {
        String text = "I0learned1about2Java3in4Telran5and6I7am8studying9Java";
        //10;Alex;Alexeev;30
        String[] s = text.split("[0-9]");
        String s1 = text.replaceAll("[0-9]", " ");
        System.out.println(s1);
        for (String value : s) {
            System.out.println(value);
        }
    }
}
