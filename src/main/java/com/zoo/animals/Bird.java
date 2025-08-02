package com.zoo.animals;

public class Bird extends Animal {
   //Protected field
    protected double wingSpan;
    // Constructor
    public Bird (String name, int age, double weight, int energyLevel, double wingSpan) {
        super (name, age, weight, energyLevel);
        this.wingSpan = wingSpan;
    }
    //Method override
    @Override
    public void makeSound() {
        System.out.println(name + " sings like a bird. ");
    }
    //Adding a new method
    public void fly() {
        if (getEnergyLevel() >= 15) {
            setEnergyLevel(getEnergyLevel() - 15);
            System.out.println(name + " is flying with wingspan " + wingSpan + " meters. ");
            System.out.println("Flying uses 15 energy (not actually deducted in this version).");
        } else {
            System.out.println(name + " is too tired to fly. ");
        }

    }
}
