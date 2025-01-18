package com.telran.prof.lessoons.lesson4.enumexample;

public enum Season {
    WINTER("snow", 4),
    SPRING("green", 1),
    SUMMER("sun", 3),
    AUTUMN("rain", 2);

    private String description;

    private int rate;

    public int getRate() {
        return rate;
    }

    Season(String description, int rate) {
        this.description = description;
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }
}
