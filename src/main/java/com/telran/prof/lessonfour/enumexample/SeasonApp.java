package com.telran.prof.lessonfour.enumexample;

public class SeasonApp {

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(" Season is " + season + " desc :" + season.getDescription()
            + " rate " + season.getRate());
        }
    }
}
