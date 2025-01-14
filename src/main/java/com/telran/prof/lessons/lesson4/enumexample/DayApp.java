package com.telran.prof.lessons.lesson4.enumexample;

public class DayApp {

    public static void main(String[] args) {
        printDayInfo(Day.TUESDAY);
        Day friday = Day.FRIDAY;
        if (friday == Day.FRIDAY){
            System.out.println("Hallo");
        }
    }

    public static void printDayInfo(Day day){
        switch (day){
            case MONDAY -> System.out.println("Bad day");
            case FRIDAY -> System.out.println("Better");
            case SATURDAY, SUNDAY -> System.out.println("Best day");
            default -> System.out.println("so-so");
        }
    }
}
