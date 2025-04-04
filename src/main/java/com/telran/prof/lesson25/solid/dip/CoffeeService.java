package com.telran.prof.lesson25.solid.dip;

public class CoffeeService {

    private AbstractCoffeeMachine coffeeMachine;

    public CoffeeService(AbstractCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    //    private BlackCoffeeMachine blackCoffeeMachine = new BlackCoffeeMachine();
    //    private AmericanoCoffeeMachine americanoCoffeeMachine = new AmericanoCoffeeMachine();

    public void makeCoffee() {
        coffeeMachine.makeCoffee();
    }

}
