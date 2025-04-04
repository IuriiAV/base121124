package com.telran.prof.lesson25.solid.ocp;

public class App {

    public static void main(String[] args) {
        Barrel barrel = new Barrel(2, 5);
        Box box = new Box(3, 5, 2);

       // double totalVolume = 0.0;

//        double barrelVolume = 3.14 * barrel.getRadius() * barrel.getRadius()
//                * barrel.getHeight();
//        totalVolume += barrelVolume;
//
//        double boxVolume = box.getHeight() * box.getLength() * box.getWidth();
//        totalVolume += boxVolume;
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        volumeCalculator.addVolume(barrel);
        volumeCalculator.addVolume(box);

        Sphere sphere = new Sphere(2.3);
        volumeCalculator.addVolume(sphere);


        System.out.println("total volume is " + volumeCalculator.getTotalVolume());
    }
}
