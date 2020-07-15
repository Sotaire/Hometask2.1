package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private static Shelter shelter;
    private Colors colors;

    public Pet (Shelter shelter,  Colors colors){
        this.shelter = shelter;
        this.colors = colors;
    }

    public Pet() {
    }

    public int getAge() {
        return age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public Colors getColors() {
        return colors;
    }

    private int generateDefaultAge () {
        Random random = new Random(4);
        return random.nextInt(15);
    }

    public String getInfo () {
        return "age: " + age + "\n" + "color: " + colors + "\n" + "Приют: " + shelter.getName() + "\n" + shelter.getAddress();
    }
}
