package com.telran.prof.lessoons.lesson25.ocp;

public class VolumeCalculator {

    private double totalVolume;

    public void addVolume(Package pkg) {
//        if (pkg instanceof Barrel barrel) {
//            double volume = 3.14 * barrel.getRadius() * barrel.getRadius() * barrel.getHeight();
//            totalVolume += volume;
//        }
//        if (pkg instanceof Box box) {
//            double boxVolume = box.getHeight() * box.getLength() * box.getWidth();
//            totalVolume += boxVolume;
//        }
        totalVolume+= pkg.getVolume();
    }

    public double getTotalVolume() {
        return totalVolume;
    }
}
