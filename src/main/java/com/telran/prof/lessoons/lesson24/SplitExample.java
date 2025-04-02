package com.telran.prof.lessoons.lesson24;

public class SplitExample {

    public static void main(String[] args) {
        String text = "I0learned1about2Java3in4Telran5and6I7am8studying9Java";
        String[] s = text.split("\\d");
        String string = text.replaceAll("\\d", " ");
        System.out.println(string);
        for (String value : s) {
            System.out.println(value);
        }
    }
}
