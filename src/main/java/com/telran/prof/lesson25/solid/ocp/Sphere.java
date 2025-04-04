package com.telran.prof.lesson25.solid.ocp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Sphere extends Package{

    private double radius;

    @Override
    public double getVolume() {
        return (4/3)*3.14*(radius*radius*radius);
    }
}
