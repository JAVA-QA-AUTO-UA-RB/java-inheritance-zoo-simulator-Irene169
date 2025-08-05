package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.IPlayable;
import com.zoo.species.Penguin;
import com.zoo.species.Lion;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    private static ZooKeeper keeper;

    public static void main(String[] args) {

        // Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.
        Lion Simba = new Lion("Simba", 8, "golden");
        Eagle Freedom = new Eagle("Freedom", 2, 2.1);
        Penguin Skipper = new Penguin("Skipper", 4, 12.0);
        Elephant Dumbo = new Elephant("Dumbo", 11, "gray");

        // Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.
        ZooKeeper keeper = new ZooKeeper("Tom");
        System.out.println("The doors of our amazing zoo are opening!\n");

        // Масив тварин,які можуть грати
        IPlayable[] playables = {Simba, Freedom, Skipper, Dumbo};
        for (IPlayable animal : playables) {
            keeper.playWithAnimal(animal);
        }
        System.out.println();

        // - Додаткові дії
        Simba.hunt();
        Freedom.uniqueBirdAction();
        Skipper.uniqueBirdAction();
        Dumbo.spraySelf();

        System.out.println();

        // Годуємо тварин
        keeper.feedAnimal(Simba);
        keeper.feedAnimal(Freedom);
        keeper.feedAnimal(Skipper);
        keeper.feedAnimal(Dumbo);

        System.out.println();

        // Додаємо сон для тварин
        Simba.sleep();
        Freedom.sleep();
        Skipper.sleep();
        Dumbo.sleep();

            System.out.println("\n Energy level check after activities");

            // Виведіть фінальні результати та стани тварин наприкінці дня.
        Animal[] animals = {Simba, Freedom, Skipper, Dumbo};
            for (Animal a : animals) {
                int energy = a.getEnergyLevel();
                String energyLevel;

                if (energy <= 30) {
                    energyLevel = "Low";
                } else if (energy <= 70) {
                    energyLevel = "Medium";
                } else {
                    energyLevel = "High";
                }
                System.out.println(" - " + a.getName() + " has " + energyLevel + " energy (" + energy + ")");
            }
            System.out.println("\n The doors of our zoo are closing. Animals need rest");
        }
    }
