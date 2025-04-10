package com.telran.prof.lessoons.lesson26;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public class Donut {

    private DonutType donutType;

    private ToppingType topping;

    @Override
    public String toString() {
        return donutType + " donut with " + topping;
    }
}
