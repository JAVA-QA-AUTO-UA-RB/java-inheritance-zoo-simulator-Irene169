package com.zoo.species;

import com.zoo.animals.Mammal;
import com.zoo.interfaces.IPlayable;

public class Lion extends Mammal implements IPlayable {
    //Constructor
    public Lion(String name, int energyLevel, String furColor) {
    super(name, energyLevel, furColor);
}

    @Override
    public void makeSound () {
        System.out.println(name + " says: Rrrrr. ");
    }

    @Override
    public void move() {
        System.out.println(name + " runs swiftly.");
    }

    @Override
    public void sleep() {
        setEnergyLevel(Math.min(getEnergyLevel() + 30, 100));
        System.out.println(name + " is sleeping under a tree. Energy is increased to " + getEnergyLevel() + ".");
    }

    @Override
    public void eat() {
        setEnergyLevel(Math.min(getEnergyLevel() + 20, 100));
        System.out.println(name + " is eating meat. Energy is now " + getEnergyLevel() + ".");
    }

    @Override
    public void play() {
        if (getEnergyLevel() >= 15) {
            setEnergyLevel(getEnergyLevel() - 15);
            System.out.println(name + " is playing energetically. Energy is now " + getEnergyLevel() + ".");
        }
    }

    public void hunt () {
        if (getEnergyLevel() >= 25) {
            setEnergyLevel(getEnergyLevel() - 25);
            System.out.println(name + " is hunting. Energy is decreased to " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " is too tired to hunt. ");
        }
    }
}