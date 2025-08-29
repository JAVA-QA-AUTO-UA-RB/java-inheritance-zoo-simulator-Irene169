package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.interfaces.IPlayable;

public class Penguin extends Bird implements IPlayable {
    //Constructor
    public Penguin(String name, int energyLevel, double wingSpan) {
        super(name, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Quack-quack!");
    }

    @Override
    public void eat() {
        setEnergyLevel(Math.min(getEnergyLevel() + 10, 100));
        System.out.println(name + " is eating fish. Energy is now " + getEnergyLevel() + ".");
    }

    @Override
    public void sleep() {
        setEnergyLevel(Math.min(getEnergyLevel() + 20, 100));
        System.out.println(name + " is sleeping. Energy is now " + getEnergyLevel() + ".");
    }

    @Override
    public void play () {
        if (getEnergyLevel() >= 10) {
            setEnergyLevel(getEnergyLevel() - 10);
            System.out.println(name + " is sliding on ice! Energy is now " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " is too tired to play. ");
        }
    }

        public void fly() {
            System.out.println(name + " doesn't fly but swims instead ");
            swim();
        }

        @Override
    public void uniqueBirdAction() {
        surfOnIce();
        }

        private void surfOnIce() {
            if (getEnergyLevel() >= 10) {
                setEnergyLevel(getEnergyLevel() - 10);
                System.out.println(name + " is surfing on ice like a pro! Energy is now " + getEnergyLevel() + ".");
            } else {
                System.out.println(name + " is too tired to surf on ice.");
            }
        }

    public void swim() {
        if (getEnergyLevel() >= 10) {
            setEnergyLevel(getEnergyLevel() - 10);
            System.out.println(name + " is swimming happily. Energy is now " + getEnergyLevel() + ".");
        } else {
            System.out.println(name + " is too tired to swim.");
        }
    }
    }

