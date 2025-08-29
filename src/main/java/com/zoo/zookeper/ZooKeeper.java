package com.zoo.zookeper;

import com.zoo.animals.Animal;
import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.IPlayable;

public class ZooKeeper {
    //Private field
    private String name;

    //Constructor
    public ZooKeeper(String name) {
        this.name = name;
    }

    //Feed animal
    public void feedAnimal(IEatable animal) {
        System.out.println(name + " is feeding " + ((Animal)animal).getName() + ".");
        animal.eat();
    }

    //Play with animal
    public void playWithAnimal(IPlayable animal) {
        System.out.println(name + " is playing with " + ((Animal)animal).getName() + ".");
        animal.play();
    }

    //Check animal energy
    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String status;

        if (energy <= 30) {
            status = "Low";
        } else if (energy <= 70) {
            status = "Medium";
        } else {
            status = "High";
        }
        System.out.println(animal.getName() + " energy level is " + energy + " (" + status + "). ");
    }
}

