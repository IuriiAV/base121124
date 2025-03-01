package com.telran.prof.lessoneight;

public class Cat {

    private String breed;

    private String color;

    private int age;

    private String name;

    public Cat(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //1 null
        if (obj == null) {
            return false;
        }
        //2
        if (this == obj) {
            return true;
        }
        //3
        if (!(obj instanceof Cat)) {
            return false;
        }

        Cat cat = (Cat) obj;

        return this.age == cat.age && this.breed.equals(cat.breed)
                && this.color.equals(cat.color);
    }
}
