package com.telran.prof.lesson25.solid.ocp;

public class VolumeCalculator {

    private double totalVolume;

    public void addVolume(Package pkg) {
//        if (pkg instanceof Barrel barrel) {
//            //Barrel barrel = (Barrel) pkg;
//           double volume =  3.14 * barrel.getRadius() * barrel.getRadius()
//                    * barrel.getHeight();
//           totalVolume+=volume;
//        }
//        if (pkg instanceof Box box) {
//            double boxVolume = box.getHeight() * box.getLength() * box.getWidth();
//            totalVolume += boxVolume;
//        }
        totalVolume+= pkg.getVolume();

    }

    public double getTotalVolume(){
        return totalVolume;
    }
}
