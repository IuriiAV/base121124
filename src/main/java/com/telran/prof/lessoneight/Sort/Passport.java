package com.telran.prof.lessoneight.Sort;

public class Passport implements Comparable<Passport>{

    private int number ;

    public Passport(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Passport o) {

        return this.number - o.number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                '}';
    }
}
