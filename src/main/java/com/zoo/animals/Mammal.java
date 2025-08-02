package com.zoo.animals;

public class Mammal extends Animal {
//Protected field
protected String furColor;
// Constructor
public Mammal(String name, int age, double weight, int energyLevel, String furColor) {
    super(name, age, weight, energyLevel);
    this.furColor = furColor;
}
//Method override
 @Override
    public void makeSound() {
System.out.println(name + " makes a mammal sound. ");
    }
//Adding a new method
public void groom() {
    System.out.println(name + " is grooming its " + furColor + " fur. ");
}
//Adding a getter
public String getFurColor() {
return furColor;}
}

