package com.zoo.animals;

public abstract class Mammal extends Animal {
    //Protected field
protected String furColor;

//Constructor
public Mammal(String name, int energyLevel, String furColor) {
    super(name, energyLevel);
    this.furColor = furColor;
}

public void groom() {
    System.out.println(name + " is grooming its " + furColor + " fur. ");
}

public String getFurColor() {

    return furColor;
}

public abstract void move();
}

