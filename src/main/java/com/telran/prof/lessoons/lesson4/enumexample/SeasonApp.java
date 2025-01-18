package com.telran.prof.lessoons.lesson4.enumexample;

public class SeasonApp {

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " " + season.getDescription() + " " + season.getRate());
        }
    }
}