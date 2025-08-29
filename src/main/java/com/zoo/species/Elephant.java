package com.zoo.species;

import com.zoo.animals.Mammal;
import com.zoo.interfaces.IPlayable;

public class Elephant extends Mammal implements IPlayable {
    //Constructor
    public Elephant(String name, int energyLevel, String furColor) {
        super(name, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Truba-bа-bа! ");
    }

    @Override
    public void eat() {
        setEnergyLevel(Math.min(getEnergyLevel() + 20, 100));
        System.out.println(name + " is eating grass and leaves. Energy is now " + getEnergyLevel() + ".");
    }

    @Override
    public void sleep() {
        setEnergyLevel(Math.min(getEnergyLevel() + 30, 100));
        System.out.println(name + " is sleeping standing up. Energy is increased to " + getEnergyLevel() + ".");
    }

    @Override
    public void move() {
        System.out.println(name + " stomps heavily.");
    }

    @Override
    public void play() {
        if (getEnergyLevel() >= 15) {
            setEnergyLevel(getEnergyLevel() - 15);
            System.out.println(name + " is playing with a tire. Energy is now " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " is too tired to play.");
        }
    }

    public void spraySelf() {
        if (getEnergyLevel() >= 10) {
            setEnergyLevel(getEnergyLevel() - 10);
            System.out.println(name + " is spraying itself with water from its trunk. Energy is now " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " is too tired to spray itself.");
        }
    }
}

