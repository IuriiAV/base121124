package com.telran.prof.lessoons.lesson26;

public class DonutMachine {

    private ToppingType toppingType;

    private DonutType donutType;

    Donut donut = new Donut(donutType, toppingType);

    public void makeDonut(int donut, int topping) {
        donutType = DonutType.donutFromCode(donut);
        toppingType = ToppingType.toppingFromCode(topping);

        System.out.println("Your " + donutType + " donut with " + toppingType + " done");
    }

}
