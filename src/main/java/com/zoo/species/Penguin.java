package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {
    // Constructor
    public Penguin(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel, wingSpan);
    }

    //Method override makeSound
    @Override
    public void makeSound() {
        System.out.println(name + " says: Quack-quack!");
    }

    //Adding a new method
    public void swim() {
        if (getEnergyLevel() >= 10) {
            System.out.println(name + "  is swimming happily. Energy is now " + getEnergyLevel());
        } else {
            System.out.println(name + " is too tired to swim. ");
        }
    }

    //Method override fly
    @Override
        public void fly() {
            System.out.println(name + " doesn't fly but swims instead ");
            swim();
        }
    }

