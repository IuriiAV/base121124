package com.telran.prof.lessoons.lesson25.dip;

public class CoffeeService {

    private AbstractCoffeeMachine coffeeMachine;

    public CoffeeService(AbstractCoffeeMachine abstractCoffeeMachine) {
        this.coffeeMachine = abstractCoffeeMachine;
    }

    //    private BlackCoffeeMachine blackCoffeeMachine = new BlackCoffeeMachine();
//
//    private AmericanoCoffeeMachine americanoCoffeeMachine = new AmericanoCoffeeMachine();

    public void makeCoffee() {
        coffeeMachine.makeCoffee();
        //blackCoffeeMachine.makeCoffee();
    }

//    public void makeAmericano() {
//        americanoCoffeeMachine.makeCoffee();
//    }
}
