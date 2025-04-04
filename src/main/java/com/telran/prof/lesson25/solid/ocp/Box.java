package com.telran.prof.lesson25.solid.ocp;

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
        return height * width * length;
    }
}
