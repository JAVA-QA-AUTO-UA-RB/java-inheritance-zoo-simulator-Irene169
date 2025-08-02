package com.zoo.zookeper;

import com.zoo.animals.Animal;

public class ZooKeeper {
    //Private field
    private String name;
    //Constructor
    public ZooKeeper(String name) {
        this.name = name;
    }
    //Adding new method feed
    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding " + animal.getName() + ".");
        animal.eat();
    }
    //Adding new method play
    public void playWithAnimal(Animal animal) {
        System.out.println(name + " is playing with " + animal.getName() + ".");
        animal.makeSound();
    }
    //Adding new method check energyLevel
    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String status;

        if (energy <= 30 ) {
            status = "Low";
        } else {
            status = "High";
            System.out.println(animal.getName() + " energy level is " + energy + " (" + status + "). ");

        }
    }

}
