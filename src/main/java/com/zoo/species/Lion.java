package com.zoo.species;

import com.zoo.animals.Mammal;
public class Lion extends Mammal {
    // Constructor
    public Lion(String name, int age, double weight, int energyLevel, String furColor) {
    super(name, age, weight, energyLevel, furColor);
}
    //Method override
    @Override
    public void makeSound () {
        System.out.println(name + " says: Rrrrr. ");
    }
    // Adding a new method
    public void hunt () {
        if (getEnergyLevel() >= 25) {
            setEnergyLevel(getEnergyLevel() - 25);
            System.out.println(name + " is hunting. Energy is decreased to " + getEnergyLevel());
        } else {
            System.out.println(name + " is too tired to hunt. ");
        }
    }
}