package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.interfaces.IPlayable;

public class Eagle extends Bird implements IPlayable {
    //Constructor
    public Eagle(String name, int energyLevel, double wingSpan) {
        super(name, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Kreee-kreee! ");
    }

    @Override
    public void eat() {
        setEnergyLevel(Math.min(getEnergyLevel() + 15, 100));
        System.out.println(name + " is eating a small rodent. Energy is now " + getEnergyLevel() + ".");
    }

    @Override
    public void sleep() {
        setEnergyLevel(Math.min(getEnergyLevel() + 25, 100));
        System.out.println(name + " sleeps in a tall tree. Energy is now " + getEnergyLevel() + ".");
    }

    @Override
    public void play() {
        setEnergyLevel(Math.max(getEnergyLevel() - 10, 0));
        System.out.println(name + " is playing with wind current. Energy is now " + getEnergyLevel() + ".");
    }

    @Override
    public void uniqueBirdAction() {
        buildNest();
    }

    private void buildNest() {
        if (getEnergyLevel() >= 15) {
            setEnergyLevel((getEnergyLevel() - 15));
            System.out.println(name + " is building a nest on a cliff. Energy is now " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " is too tired to build the nest.");
        }
    }
}
