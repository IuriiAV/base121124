package com.telran.prof.lessonfour.enumexample;

public class ExampleApp {

    public final static String TUESDAY = "Tuesday";

    public static void main(String[] args) {

        String dayOfWeek = "Tuesday";
        if( dayOfWeek.equals(TUESDAY)) {
            System.out.println("ok");
        }

        if(dayOfWeek.equals(TUESDAY)) {
            System.out.println("ok");
        }
    }
}
