package com.telran.prof.lessons.lesson3.abstractexample;

/**
 *                  Animal
 *                     |
 *  WaterAnimal      <- ->      EarthAnimal
 *      |                             |
 * Fish, Dolphin                Lion, Horse
 */

public abstract class Animal {

    public abstract void sleep();

    public abstract void eat();
}
