package com.telran.prof.lessoons.lesson26;

import java.util.Scanner;

public class DonutApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose donut type:");
        for(DonutType donutType : DonutType.values()) {
            System.out.println(donutType.getCode() + ": " + donutType);
        }
        int type = scanner.nextInt();
        System.out.println("Choose topping:");
        for(ToppingType toppingType : ToppingType.values()) {
            System.out.println(toppingType.getCode() + ": " + toppingType);
        }
        int topping = scanner.nextInt();

        DonutMachine donutMachine = new DonutMachine();
        donutMachine.makeDonut(type, topping);
    }
}
