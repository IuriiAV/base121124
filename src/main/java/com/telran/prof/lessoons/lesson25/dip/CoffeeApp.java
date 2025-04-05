package com.telran.prof.lessoons.lesson25.dip;

import java.util.Scanner;

public class CoffeeApp {

    public static void main(String[] args) {
        BlackCoffeeMachine blackCoffeeMachine = new BlackCoffeeMachine();
        AmericanoCoffeeMachine americanoCoffeeMachine = new AmericanoCoffeeMachine();

        CoffeeService coffeeService = null;
        System.out.println("1 - Black, 2 - Americano");
        int data = new Scanner(System.in).nextInt();
        switch (data) {
            case 1 -> coffeeService = new CoffeeService(blackCoffeeMachine);
            case 2 -> coffeeService = new CoffeeService(americanoCoffeeMachine);
        }
        coffeeService.makeCoffee();
    }
}
