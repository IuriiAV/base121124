package com.telran.prof.lessons.lesson4.enumexample;

public enum Season {
    WINTER("snow", 5),
    SPRING("green", 3),
    SUMMER("sun", 4),
    AUTUMN("rain", 1);

    private String description;

    private int rate;

    Season(String description, int rate) {
        this.description = description;
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public int getRate() {
        return rate;
    }
}
