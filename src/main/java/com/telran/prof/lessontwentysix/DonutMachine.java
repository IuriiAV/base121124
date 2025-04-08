package com.telran.prof.lessontwentysix;

public class DonutMachine {

    private Donut donut ;

    private Topping topping ;

    public DonutMachine(Donut donut, Topping topping) {
        this.donut = donut;
        this.topping = topping;
    }

    public void makeDonut() {
        System.out.println(this.donut + " " + this.topping);
    }

}
