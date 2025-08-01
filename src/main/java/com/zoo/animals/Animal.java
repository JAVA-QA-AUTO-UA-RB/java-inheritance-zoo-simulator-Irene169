package com.zoo.animals;

public class Animal {
    //Protected and private fields
 protected String name;
 protected int age;
 protected double weight;
 private int energyLevel;
 //Constructor
public Animal(String name, int age, double weight, int energyLevel) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.energyLevel = energyLevel;
}
 //Methods
    public void eat() {
        energyLevel = Math.min(energyLevel + 20, 100);
        System.out.println(name + " is eating. Energy is increased to " + energyLevel + ".");
    }

    public void sleep() {
        energyLevel = Math.min(energyLevel + 30, 100);
        System.out.println(name + " is sleeping. Energy is increased to " + energyLevel + ".");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound. ");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("energyLevel: " + energyLevel);
    }

    protected void setEnergyLevel (int energyLevel) {
    this.energyLevel = Math.min(100, Math.max(0, energyLevel));
    }
    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }
}