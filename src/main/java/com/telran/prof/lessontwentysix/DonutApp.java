package com.telran.prof.lessontwentysix;

public class DonutApp {

    public static void main(String[] args) {
        Donut classic = new Donut("Classic");
        Topping caramel = new Topping("Caramel");
        DonutMachine donutMachine = new DonutMachine(classic,caramel);
        donutMachine.makeDonut();
    }
}
