package com.zoo.species;

import com.zoo.animals.Bird;

public class Eagle extends Bird {
    // Constructor
    public Eagle (String name, int age, double weight, int energyLevel, double wingSpan) {
        super (name, age, weight, energyLevel, wingSpan);
    }
    //Method override makeSound
    @Override
    public void makeSound () {
        System.out.println(name + " says: Kreee-kreee! ");
    }
    // Method override fly
   @Override
   public void fly() {
        if (getEnergyLevel() >= 20) {
    setEnergyLevel(getEnergyLevel() - 20);
    System.out.println(name + " is soaring through the sky. Energy is decreased to " + getEnergyLevel());
       }   else {
            System.out.println(name + " is too tired to fly. ");
       }
       }
       }

