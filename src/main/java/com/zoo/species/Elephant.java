package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal{

    // Constructor
    public Elephant(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel, furColor);
        this.furColor = furColor;
    }
    //Method override
    @Override
    public void makeSound () {
        System.out.println(name + " says: Truba-bа-bа! ");
    }
// Adding a new method
public void spraySelf() {
        System.out.println(name + " is spraying intself with water from its trunk.  ");
    }
}

