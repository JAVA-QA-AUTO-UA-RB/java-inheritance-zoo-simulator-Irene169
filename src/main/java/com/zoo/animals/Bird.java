package com.zoo.animals;

public abstract class Bird extends Animal {
    //Protected field
    protected double wingSpan;

    //Constructor
    public Bird (String name, int energyLevel, double wingSpan) {
        super (name, energyLevel);
        this.wingSpan = wingSpan;
    }

    //Гетер для розмаху крил
    public double getWingSpan() {
        return wingSpan;
    }

    //Абстрактний метод,описує унікальну дію птаха
   public abstract void uniqueBirdAction();
    }

