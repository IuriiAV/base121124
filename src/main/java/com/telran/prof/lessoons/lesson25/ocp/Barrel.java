package com.telran.prof.lessoons.lesson25.ocp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Barrel extends Package{

    private double height;

    private double radius;

    @Override
    public double getVolume() {
        return 3.14 * radius * radius * height;
    }
}
