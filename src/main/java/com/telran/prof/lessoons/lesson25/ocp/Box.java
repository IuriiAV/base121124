package com.telran.prof.lessoons.lesson25.ocp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Box extends Package {

    private double height;

    private double width;

    private double length;

    @Override
    public double getVolume() {
        return height * length * width;
    }
}
