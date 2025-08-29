package com.zoo.animals;

import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.ISleepable;

public abstract class Animal implements IEatable, ISleepable {
    //Protected and private fields
 protected String name;
 private int energyLevel;

 //Constructor
public Animal(String name, int energyLevel) {
    this.name = name;
    this.energyLevel = 100;
}
    //Getters for name and energy
    public String getName() {
        return name;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }

    //Setters for energy
    public void setEnergyLevel(int energyLevel) {
    if (energyLevel < 0) {
        this.energyLevel = 0;
    } else if (energyLevel > 100) {
        this.energyLevel = 100;
    } else {
        this.energyLevel = energyLevel;
    }
    }

    //Methods for increasing/decreasing energy
    public void increaseEnergy(int amount) {
    setEnergyLevel(this.energyLevel + amount);
    }

    public void decreaseEnergy(int amount) {
    setEnergyLevel(this.energyLevel - amount);
    }

    //Абстрактні методи
    public abstract void makeSound();

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();



}